package java_test_240318.CL2_frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("수강신청");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 200);

        // 맨 위 라벨
        JLabel titleLabel = new JLabel("수강신청");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // 검색창 패널
        JPanel searchPanel = new JPanel(new GridLayout(1, 4));
        searchPanel.setPreferredSize(new Dimension(800, 50));

        // 전공 드롭다운 박스
        String[] majors = {"전공선택", "경영학과", "관광경영학과", "경영정보학과", "국제무역학과"};
        JComboBox<String> majorComboBox = new JComboBox<>(majors);
        majorComboBox.setSelectedIndex(0);

        // 구분 드롭다운 박스
        String[] classifications = {"구분선택", "전공필수", "전공선택"};
        JComboBox<String> classificationComboBox = new JComboBox<>(classifications);
        classificationComboBox.setSelectedIndex(0);

        // 키워드 드롭다운 박스
        String[] keywords = {"키워드선택", "과목명", "교수명", "과목코드"};
        JComboBox<String> keywordComboBox = new JComboBox<>(keywords);
        keywordComboBox.setSelectedIndex(0);

        // 키워드 검색 필드
        JTextField keywordTextField = new JTextField();
        keywordTextField.setPreferredSize(new Dimension(150, 30));

        // 검색 버튼
        JButton searchButton = new JButton("검색");
        searchButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });

        searchPanel.add(majorComboBox);
        searchPanel.add(classificationComboBox);
        searchPanel.add(keywordComboBox);
        searchPanel.add(keywordTextField);
        searchPanel.add(searchButton);

        // 수강신청 패널
        JPanel registrationPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel courseCodeLabel = new JLabel("과목코드:");
        JTextField courseCodeTextField = new JTextField();
        courseCodeTextField.setPreferredSize(new Dimension(150, 30));
        JButton applyButton = new JButton("신청");

        registrationPanel.add(courseCodeLabel);
        registrationPanel.add(courseCodeTextField);
        registrationPanel.add(applyButton);

        // 수강신청 가능 목록 패널
        JPanel courseListPanel = new JPanel(new GridLayout(0, 1));
        
     // 데이터베이스에서 가져온 목록을 추가하는 예시
        for (int i = 0; i < 10; i++) {
            JLabel courseLabel = new JLabel("과목 " + (i + 1) + " 정보");
            courseListPanel.add(courseLabel);
        }

        // 스크롤 패널
        JScrollPane scrollPane = new JScrollPane(courseListPanel);

        // 프레임에 컴포넌트 추가
        frame.getContentPane().add(titleLabel, BorderLayout.NORTH);
        frame.getContentPane().add(searchPanel, BorderLayout.CENTER);
        frame.getContentPane().add(registrationPanel, BorderLayout.SOUTH);
        frame.getContentPane().add(scrollPane, BorderLayout.EAST);

        frame.setVisible(true);
    }
}
