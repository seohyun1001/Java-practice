package java_test_240318;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private JComboBox<String> majorComboBox;
    private JComboBox<String> classificationComboBox;
    private JComboBox<String> keywordComboBox;
    private JTextField keywordTextField;
    private JButton searchButton;
    private JTextField courseCodeTextField;
    private JButton applyButton;
    private JTable table;
    private DefaultTableModel tableModel;
    private Course_List_DAO courseDao;

    public MainFrame() {
        setTitle("수강신청");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new GridLayout(4, 1)); // 3행 1열의 그리드 레이아웃으로 변경

        // 상단 라벨
        JLabel titleLabel = new JLabel("수강신청");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel); // 첫 번째 행에 추가

        // 검색 패널
        createSearchPanel();
        add(createSearchPanel()); // 두 번째 행에 추가

        // 수강신청 패널
        createRegistrationPanel();
        add(createRegistrationPanel()); // 세 번째 행에 추가

        // 테이블 초기화
        initializeTable();
        add(new JScrollPane(table)); // 테이블을 네 번째 행에 추가

        setVisible(true);
    }

    private JPanel createSearchPanel() {
        JPanel searchPanel = new JPanel(new GridLayout(1, 4));
        // searchPanel.setPreferredSize(new Dimension(800, 50));

        String[] majors = {"전공선택", "경영학과", "관광경영학과", "경영정보학과", "국제무역학과"};
        majorComboBox = new JComboBox<>(majors);
        majorComboBox.setSelectedIndex(0);

        String[] classifications = {"구분선택", "전공필수", "전공선택"};
        classificationComboBox = new JComboBox<>(classifications);
        classificationComboBox.setSelectedIndex(0);

        String[] keywords = {"키워드선택", "과목명", "교수명", "과목코드"};
        keywordComboBox = new JComboBox<>(keywords);
        keywordComboBox.setSelectedIndex(0);

        keywordTextField = new JTextField();
        // keywordTextField.setPreferredSize(new Dimension(150, 30));

        searchButton = new JButton("검색");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 검색 버튼 클릭 시 동작
                // 데이터베이스에서 검색하여 테이블 업데이트
                updateTable();
            }
        });

        searchPanel.add(majorComboBox);
        searchPanel.add(classificationComboBox);
        searchPanel.add(keywordComboBox);
        searchPanel.add(keywordTextField);
        searchPanel.add(searchButton);

        return searchPanel;
    }

    private JPanel createRegistrationPanel() {
        JPanel registrationPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel courseCodeLabel = new JLabel("과목코드:");
        courseCodeTextField = new JTextField();
        courseCodeTextField.setPreferredSize(new Dimension(150, 30));

        applyButton = new JButton("신청");
        registrationPanel.add(courseCodeLabel);
        registrationPanel.add(courseCodeTextField);
        registrationPanel.add(applyButton);

        return registrationPanel;
    }

    private void initializeTable() {
        // Create table with columns
        String[] columns = {"Division", "Course Number", "Course Name", "Professor", "Credit",
                            "Timetable", "Class Room", "Limit Count", "Grade"};
        tableModel = new DefaultTableModel(columns, 0);
        table = new JTable(tableModel);

        // Populate table with data from DAO
        courseDao = new Course_List_DAO();
        updateTable();
    }

    private void updateTable() {
        // Clear previous data
        tableModel.setRowCount(0);

        // Get data from DAO
        Vector<Vector<Object>> data = courseDao.getCourceList();

        // Add data to table model
        for (Vector<Object> row : data) {
            tableModel.addRow(row);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame
::new);
    }
}
