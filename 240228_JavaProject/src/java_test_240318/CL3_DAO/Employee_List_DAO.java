package java_test_240318.CL3_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Employee_List_DAO {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1522:XE";

	private static final String USER = "system";
	private static final String PASS = "oracle";


	public Employee_List_DAO() {

	};


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
	public Vector getEmployeeList() {
		// 임시 데이터를 담을 저장 공간(배열) 만들기

		Vector empDataVector = new Vector();

		Connection con = null; // 연결
		PreparedStatement ps = null; // 명령
		ResultSet rs = null; // 결과

		try {
			con = getConn();
			String sql = "SELECT * FROM employee_list ORDER BY employeeNum";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				int employeeNum = rs.getInt("employeeNum");
				String employeeName = rs.getString("employeeName");
				String employeeDEPT = rs.getString("employeeDEPT");
				String employeePwd = rs.getString("employeePwd");
				
				Vector row = new Vector();
				
				row.add(employeeNum);
				row.add(employeeName);
				row.add(employeeDEPT);
				row.add(employeePwd);
				
				empDataVector.add(row);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return empDataVector;

	} // getEmployeeList
	
	

	/** DB데이터 다시 불러오기 */
	public void empListSelectAll(DefaultTableModel model) {
		// 배열에 담은 데이터 불러오기

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			con = getConn();
			String sql = "SELECT * FROM employee_list ORDER BY employeeNum";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			for (int i = 0; i < model.getRowCount();) {
				model.removeRow(0);
			}
			
			while (rs.next()) {
				Object data[] = { rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4)};
				model.addRow(data);
			}

		} catch (SQLException e) {
			System.out.println("=> empListSelectAll fail");

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
	} // empListSelectAll
	
	

}
