package java_test_240318.CL2_frame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java_test_240318.CL3_DAO.Course_List_DAO;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class MainFrame_emp extends JFrame {
    private JComboBox<String> majorComboBox;
    private JComboBox<String> classificationComboBox;
    private JComboBox<String> keywordComboBox;
    private JTextField keywordTextField;
    private JButton searchButton;
    private JTable table;
    private DefaultTableModel tableModel;
    private Course_List_DAO courseDao;

    public MainFrame_emp() {
        setTitle("수강신청 - 교직원용");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new GridLayout(3, 1)); // 3행 1열의 그리드 레이아웃으로 변경

        // 상단 라벨
        JLabel titleLabel = new JLabel("수강신청 관리");
        titleLabel.setFont(new Font("gothic", Font.BOLD, 24));
        JPanel titlePanel = new JPanel();
        titlePanel.add(titleLabel);
        titlePanel.setPreferredSize(new Dimension(800, 50));
        add(titleLabel); // 첫 번째 행에 추가

        // 검색 패널
        JPanel searchPanel = createSearchPanel();
        searchPanel.setPreferredSize(new Dimension(800, 50)); // 높이 설정
        add(searchPanel); // 두 번째 행에 추가

        // 테이블 초기화
        initializeTable();
        add(new JScrollPane(table)); // 테이블을 세 번째 행에 추가

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

    private void initializeTable() {
        // Create table with columns
        String[] columns = {"구분", "과목코드", "과목명", "교수명", "학점",
                            "시간표", "강의실", "정원", "학년"};
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
//        SwingUtilities.invokeLater(MainFrame_emp::new);
    	SwingUtilities.invokeLater(LoginFrame::new);
    }
}
