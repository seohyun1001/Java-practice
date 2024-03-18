package ex_240315.java_board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import ex_240311_jdbc_member_with_swing_oracle.MemberDTO;

public class Boarder_DAO {
	// 데이터베이스 기본 연결하는 구조 그대로 가지고 오기
	// 게시판의 게시글의 정보를 전체 조회 하는 기능 하나 구현.
	// 처음에는 콘솔에 출력.
	// 화면에도 출력.

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1522:XE";

	private static final String USER = "system"; // DB ID
	private static final String PASS = "oracle"; // DB 패스워드

// 게시글의 정보들을 출력하는 리스트 
	Boarder_List boarder_List;

	public Boarder_DAO() {

	};

	public Boarder_DAO(Boarder_List boarder_List) {
		this.boarder_List = boarder_List;
		System.out.println("DAO=>" + boarder_List);
	}

	/** DB연결 메소드 */
	public Connection getConn() {
		Connection con = null;

		try {
			Class.forName(DRIVER); // 1. 드라이버 로딩
			con = DriverManager.getConnection(URL, USER, PASS); // 2. 드라이버 연결

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	/** 게시판 전체 리스트 출력 */
// 반환 : 이중 리스트를 반환한다. 리스트안에, 각각의 게시글들이 있다. 
	public Vector getBoarderList() {

		// 임시 데이터를 담을 저장 공간(메모리에 담아둠)
		Vector data = new Vector();
		// Jtable에 값을 쉽게 넣는 방법 1. 2차원배열 2. Vector 에 vector추가

		Connection con = null; // 연결
		PreparedStatement ps = null; // 명령
		ResultSet rs = null; // 결과

		try {

			con = getConn();
			// 날짜를 기준으로 큰값에서, 작은 값으로 내려가는 내림차순이니,-> 최신순이 먼저옴.
			// 날짜가 큰값이 최신 날짜임.
			String sql = "select * from BOARDER_JAVA order by regDate desc";
			ps = con.prepareStatement(sql);
			// 메서드 가 실행이되면, 데이터베이스 조회한 내용이 rs 인스턴스에 임시로 저장됨.
			// 저장이 되는 포맷은 마치 엑셀 표와 비슷하다고 생각하시면됨.
			rs = ps.executeQuery();

			// rs 는 0행에서 대기하고 있다가, next 만나면, 다음행 1행으로 넘어가
			// 각 컬럼별로 데이터를 가지고 오는 역할.
			while (rs.next()) {
				int id = rs.getInt("id");
				String writer = rs.getString("writer");
				String subject = rs.getString("subject");
				String content = rs.getString("content");
				String regDate = rs.getString("regDate");
				int viewsCount = rs.getInt("viewsCount");

				Vector row = new Vector();
				row.add(id);
				row.add(writer);
				row.add(subject);
				row.add(content);
				row.add(regDate);
				row.add(viewsCount);

				data.add(row);
				// 결론은 Vector -> 리스트, 리스트 안에 리스트, 이중 리스트 구조.
				// 연습, 국,영,수 배열 안에 배열.
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}// getMemberList()

	/** DB데이터 다시 불러오기 */
	public void boarderSelectAll(DefaultTableModel model) {

		Connection con = null;
		PreparedStatement ps = null;
		// 조회시 만 사용할 예정.
		ResultSet rs = null;

		try {
			con = getConn();
			String sql = "select * from BOARDER_JAVA order by regDate dsc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			// DefaultTableModel에 있는 데이터 지우기
			for (int i = 0; i < model.getRowCount();) {
				model.removeRow(0);
			}

			while (rs.next()) {
				// 각 행마다, 컬럼들이 6개씩 있음.
				Object data[] = { rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), };

				// 테이블에 각행을 각각 추가함.
				model.addRow(data);
			}

		} catch (SQLException e) {
			System.out.println(e + "=> boarderSelectAll fail");
		} finally {

			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	/** 게시글 등록 */
	// Boarder_DTO dto : 하나의 게시글의 모델,
	// 각 글을 쓸 때, Boarder_DTO dto 하나씩 사용이됨.
	public boolean insertBoarder(Boarder_DTO dto) {

		// 상태 변수로 사용 중, 글쓰기 메서드가 완료가 되면, true 변경 할 예정.
		boolean ok = false;

		Connection con = null; // 연결
		PreparedStatement ps = null; // 명령

		try {

			con = getConn();
			String sql = "insert into BOARDER_JAVA(" + "id,writer,subject,content,regDate,viewsCount )"
					+ "values(boarder_seq.NEXTVAL,?,?,?,?,?)";
			// dto 에 각 게시글의 내용들이 담겨 있는 모델 박스라 생각하기.
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getWriter());
			ps.setString(2, dto.getSubject());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getRegDate());
			ps.setInt(5, dto.getViewsCount());

			// c:create => insert ,u = update ,d = delete
			// executeUpdate
			// 게시글을 정상 동작, 하나 의 글 작성 성공하면, 1을 리턴.
			int r = ps.executeUpdate(); // 실행 -> 저장

			if (r > 0) {
				System.out.println("글쓰기 성공");
				ok = true;
			} else {
				System.out.println("글쓰기 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ok;
	}// insertMmeber

	// 하나의 게시글 정보 가져오는 기능

	public Boarder_DTO getBoarderDTO(int id) {

		// 임시로 메모리 담아둘 공간.
		Boarder_DTO dto = new Boarder_DTO();

		Connection con = null; // 연결
		PreparedStatement ps = null; // 명령
		ResultSet rs = null; // 결과

		try {

			con = getConn();
			String sql = "select * from BOARDER_JAVA where id=?";
			// sql 를 전달하는 기능.
			ps = con.prepareStatement(sql);
			// ? 동적 매개변수에 값을 넣기
			ps.setInt(1, id);
			// 조회시 사용하는 메서드
			rs = ps.executeQuery();
			// 하나의 게시글을 받아와서, 각 컬럼을 반복문으로 순회하면서, 값을 가져오기.
			// 가져온 데이터를, dto 라는 게시글을 담는 박스에 담기.
			if (rs.next()) {
				dto.setId(rs.getInt("id"));
				dto.setWriter(rs.getString("writer"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setRegDate(rs.getString("regDate"));
				dto.setViewsCount(rs.getInt("viewsCount"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dto;
	}

	// 게시글 삭제
	// 예전에는, 탈퇴 여부 상태 변수를 이용해서, 회원정보를 가지고 있었다면,
	// 이제는 개인정보처리방침이 변경이되어서, 회원이 요청, 탈퇴시,
	// 해당 데이터를 어떻게 처리할지는 명확히 명시 해야함.
	// 나의 정보를 모두 삭제 도 가능하게 해주어야하고,
	// 개인정보포털 사이트,
	// https://www.privacy.go.kr/front/per/inf/perInfStep01.do
	// 공식 문서 작성 가이드 이용해서, 반드시 만들어야함.
	// 사이트, 모바일 , 게시.
	// 게시글, 로그인 후 -> 작성.
	// 내가 작성한 글만 , 수정, 삭제 할수 있음.
	// 로그인, 회원가입 없어서, 일단, 단순 삭제만 구현중.
	public boolean deleteBoarder(int id) {

		boolean ok = false;
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = getConn();
			String sql = "delete from BOARDER_JAVA where id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			int r = ps.executeUpdate(); // 실행 -> 삭제

			if (r > 0)
				ok = true; // 삭제됨;

		} catch (Exception e) {
			System.out.println(e + "-> 오류발생");
		}
		return ok;
	}

}