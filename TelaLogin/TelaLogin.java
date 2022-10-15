package TelaLogin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(45, 11, 341, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblNewLabel.setBounds(122, 11, 69, 21);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBorder(new TitledBorder(null, "Seu e-mail", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField.setBounds(24, 49, 292, 43);
		panel.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Manter-me logado\r\n");
		chckbxNewCheckBox.setBounds(24, 144, 141, 23);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Logar");
		btnNewButton.setBackground(new Color(198, 198, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(24, 174, 292, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Ainda não tem conta?");
		lblNewLabel_3.setBounds(71, 214, 126, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Cadastre-se");
		btnNewButton_1.setBackground(new Color(198, 198, 255));
		btnNewButton_1.setBounds(207, 210, 109, 23);
		panel.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new TitledBorder(null, "Sua senha", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		passwordField.setBounds(24, 103, 292, 43);
		panel.add(passwordField);
	}
}
