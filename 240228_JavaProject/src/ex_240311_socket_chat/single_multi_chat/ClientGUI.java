package ex_240311_socket_chat.single_multi_chat;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JTextArea jta = new JTextArea(40, 25);
	private JTextField jtf = new JTextField(25);
	private ClientBackground client = new ClientBackground();
	private static String nickName;

	public ClientGUI() {
		// 배치관리자를 선정.
		// 요소의 위치를 지정.
		Container container = getContentPane();
		// new FlowLayout()
//				container.setLayout(new FlowLayout());
//				container.add(jta);
//				container.add(jtf);
//				container.add(new JScrollPane(jta));

		// 보더 레이아웃
		container.setLayout(new BorderLayout());
		container.add(jta, BorderLayout.CENTER);
		container.add(jtf, BorderLayout.SOUTH);
		container.add(new JScrollPane(jta), BorderLayout.CENTER);

		// 현재 클래스가 ActionListener 인터페이스를 구현하고 있어서 추상 메서드 이용, 사용 가능
		// this -> 현재 클래스를 의미
		jtf.addActionListener(this);

		// 부모창을 종료시 설정하는 기능
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 부모창을 보여주기
		setVisible(true);
		// 부모창의 위치는 윈도우즈 창으로부터 x 200만큼, y 100만큼 이동하고
		// 창의 길이는 가로 400, 높이 600
		setBounds(800, 100, 400, 600);
		// 창의 제목
		setTitle("클라이언트부분");

		client.setGui(this);
		client.setNickname(nickName);
		client.connect();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("닉네임을 설정하세요 : ");
		nickName = scanner.nextLine();
		scanner.close();
		new ClientGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = nickName + ":" + jtf.getText() + "\n";
		client.sendMessage(msg);
		jtf.setText("");

	}

	public void appendMsg(String msg) {
		jta.append(msg);
	}

}