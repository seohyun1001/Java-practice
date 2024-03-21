package java_test_240318;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java_test_240318.CL1_DTO.Course_List_DTO;

import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

public class Course_List_View extends JFrame {

	 private JTable table;
	    private DefaultTableModel model;
	    private Course_List_DAO courseDao;

	    public Course_List_View() {
	        setTitle("Course List");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(800, 600);
	        setLocationRelativeTo(null);

	        // Initialize DAO
	        courseDao = new Course_List_DAO();

	        // Create table with columns
	        String[] columns = {"Division", "Course Number", "Course Name", "Professor", "Credit",
	                            "Timetable", "Class Room", "Limit Count", "Grade"};
	        model = new DefaultTableModel(columns, 0);
	        table = new JTable(model);

	        // Populate table with data from DAO
	        populateTable();

	        JScrollPane scrollPane = new JScrollPane(table);
	        getContentPane().add(scrollPane, BorderLayout.CENTER);
	    }

	    private void populateTable() {
	        // Get data from DAO
	        Vector<Vector<Object>> data = courseDao.getCourceList();

	        // Add data to table model
	        for (Vector<Object> row : data) {
	            model.addRow(row);
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	        	Course_List_View frame = new Course_List_View();
	            frame.setVisible(true);
	        });
	    }
}

