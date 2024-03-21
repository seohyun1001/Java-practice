package java_test_240318;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.naming.spi.DirStateFactory.Result;
import javax.xml.crypto.Data;
import javax.swing.table.DefaultTableModel;

public class Course_List_DAO {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1522:XE";

	private static final String USER = "system";
	private static final String PASS = "oracle";

	
	//
	Course_List_LST course_List_LST;

	public Course_List_DAO() {

	};

	public Course_List_DAO(Course_List_LST course_List_LST) {
		this.course_List_LST = course_List_LST;
		System.out.println("DAO=>" + course_List_LST);
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
	public Vector getCourceList() {
		// 임시 데이터를 담을 저장 공간(배열) 만들기

		Vector courceDataVector = new Vector();

		Connection con = null; // 연결
		PreparedStatement ps = null; // 명령
		ResultSet rs = null; // 결과

		try {
			con = getConn();
			String sql = "SELECT * FROM course_list ORDER BY courseNum";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				String division = rs.getString("division");
				String courseNum = rs.getString("courseNum");
				String courseName = rs.getString("courseName");
				String professor = rs.getString("professor");
				int credit = rs.getInt("credit");
				String timeTable = rs.getString("timeTable");
				String classroom = rs.getString("classroom");
				int limitCount = rs.getInt("limitCount");
				int grade = rs.getInt("grade");



				Vector row = new Vector();
				
				row.add(division);
				row.add(courseNum);
				row.add(courseName);
				row.add(professor);
				row.add(credit);
				row.add(timeTable);
				row.add(classroom);
				row.add(limitCount);
				row.add(grade);
				
				courceDataVector.add(row);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return courceDataVector;

	} // getCourceList
	
	

	/** DB데이터 다시 불러오기 */
	public void listSelectAll(DefaultTableModel model) {
		// 배열에 담은 데이터 불러오기

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			con = getConn();
			String sql = "SELECT * FROM course_list ORDER BY courseCode, classNum";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			for (int i = 0; i < model.getRowCount();) {
				model.removeRow(0);
			}
			
			while (rs.next()) {
				Object data[] = { rs.getString(1), rs.getString(2), rs.getString(3),
								rs.getString(4), rs.getInt(5), rs.getString(6),
								rs.getString(7), rs.getInt(8), rs.getInt(9)};
				model.addRow(data);
			}

		} catch (SQLException e) {
			System.out.println("=> boarderSelectAll fail");

		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	} // listSelectAll
	
	

}
