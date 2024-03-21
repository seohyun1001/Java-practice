package java_test_240318.CL1_DTO;

public class Student_DTO {
	
	private int studentNum;
	private String studentName;
	private String studentMajor;
	private int studentGrade;
	private String studentPwd;
	
	public Student_DTO() {};
	
	public Student_DTO (int studentNum, String studentName,
						String studentMajor, int studentGrade, String studentPwd) {
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.studentMajor = studentMajor;
		this.studentGrade = studentGrade;
		this.studentPwd = studentPwd;
	}
	
	
	
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	public int getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(int studentGrade) {
		this.studentGrade = studentGrade;
	}
	public String getStudentPwd() {
		return studentPwd;
	}
	public void setStudentPwd(String studentPwd) {
		this.studentPwd = studentPwd;
	}
	
}
