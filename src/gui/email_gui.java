package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import soap_alimail.Webservice;
import soap_alimail.WebserviceService;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class email_gui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					email_gui window = new email_gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public email_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 839, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("收件人地址：");
		label.setBounds(56, 31, 100, 18);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(169, 28, 516, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("发送内容：");
		label_1.setBounds(56, 93, 100, 18);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(56, 124, 629, 190);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("发送");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String url=textField.getText();
				String content=textField_1.getText();
				WebserviceService WebServiceService = new WebserviceService();
				Webservice WebServicePort = WebServiceService.getWebservicePort();
				WebServicePort.sendMail(url, content);
			}
		});
		button.setBounds(322, 364, 113, 27);
		frame.getContentPane().add(button);
	}
}
