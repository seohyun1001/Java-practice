package java_test_240318.CL2_frame;

import javax.swing.*;

import java_test_240318.CL3_DAO.Employee_List_DAO;
import java_test_240318.CL3_DAO.Student_List_DAO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JRadioButton studentRadioButton;
    private JRadioButton professorRadioButton;
    private ButtonGroup buttonGroup;
    private Student_List_DAO studentDao;
    private Employee_List_DAO employeeDao;

    public LoginFrame() {
        setTitle("로그인");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(4, 1));

        // 아이디 입력
        JPanel usernamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel usernameLabel = new JLabel("아이디:");
        usernameField = new JTextField(15);
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);
        add(usernamePanel);

        // 비밀번호 입력
        JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel passwordLabel = new JLabel("비밀번호:");
        passwordField = new JPasswordField(15);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        add(passwordPanel);

        // 학생/교수 라디오 버튼
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        studentRadioButton = new JRadioButton("학생");
        professorRadioButton = new JRadioButton("교수 (또는 교직원)");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(studentRadioButton);
        buttonGroup.add(professorRadioButton);
        radioPanel.add(studentRadioButton);
        radioPanel.add(professorRadioButton);
        add(radioPanel);

        // 로그인 버튼
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        loginButton = new JButton("로그인");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (studentRadioButton.isSelected()) {
                    if (isValidLogin(username, password, "student")) {
                        dispose(); // 로그인 창 닫기
                        MainFrame mainFrame = new MainFrame();
                    } else {
                        JOptionPane.showMessageDialog(LoginFrame.this, "아이디 또는 비밀번호가 올바르지 않습니다.", "로그인 실패", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (professorRadioButton.isSelected()) {
                    if (isValidLogin(username, password, "professor")) {
                        dispose(); // 로그인 창 닫기
                        MainFrame_emp mainFrameEmp = new MainFrame_emp();
                    } else {
                        JOptionPane.showMessageDialog(LoginFrame.this, "아이디 또는 비밀번호가 올바르지 않습니다.", "로그인 실패", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "학생 또는 교수 (또는 교직원)을 선택해주세요.", "로그인 실패", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonPanel.add(loginButton);
        add(buttonPanel);

        setVisible(true);

        // Student_List_DAO2 및 Employee_List_DAO 인스턴스 생성
        studentDao = new Student_List_DAO();
        employeeDao = new Employee_List_DAO();
    }

    // 로그인 처리를 위한 메서드
    private boolean isValidLogin(String username, String password, String userType) {
        Vector userData = null;
        
        // 사용자 유형에 따라 적절한 DAO 사용
        if (userType.equals("student")) {
            userData = studentDao.getStudentList();
        } else if (userType.equals("professor")) {
            userData = employeeDao.getEmployeeList();
        }

        // 유저 정보와 입력된 정보 비교
        if (userData != null) {
            for (Object obj : userData) {
                Vector row = (Vector) obj;
                String userNum = row.get(0).toString();
                String userPwd;

                if (userType.equals("student")) {
                    userPwd = row.get(4).toString();
                } else if (userType.equals("professor")) {
                    userPwd = row.get(3).toString();
                } else {
                    // Handle invalid userType
                    return false;
                }

                if (userNum.equals(username) && userPwd.equals(password)) {
                    return true; // 일치하는 유저 정보가 있으면 로그인 성공
                }
            }
        }
        return false; // 일치하는 유저 정보가 없으면 로그인 실패
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginFrame::new);
    }
    

}
