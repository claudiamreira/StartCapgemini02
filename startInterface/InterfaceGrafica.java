package startInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class InterfaceGrafica extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtFaa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGrafica frame = new InterfaceGrafica();
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
	public InterfaceGrafica() {
		setTitle("Minha primeira Interface Gráfica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setName("");
		tabbedPane.addTab("Criar Conta", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setAutoscrolls(true);
		panel_1.setToolTipText("");
		tabbedPane.addTab("Login", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 12));
		lblNewLabel.setBounds(28, 71, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(28, 116, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(84, 68, 296, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(84, 113, 296, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		txtFaa = new JTextField();
		txtFaa.setBackground(UIManager.getColor("Button.background"));
		txtFaa.setAutoscrolls(false);
		txtFaa.setBorder(null);
		txtFaa.setFont(new Font("Consolas", Font.BOLD, 15));
		txtFaa.setText("Faça seu login no sistema\r\n");
		txtFaa.setToolTipText("");
		txtFaa.setBounds(28, 30, 259, 20);
		panel_1.add(txtFaa);
		txtFaa.setColumns(10);
		
		JButton btnNewButton = new JButton("Logar");
		btnNewButton.setFont(new Font("Consolas", Font.PLAIN, 12));
		btnNewButton.setBounds(28, 173, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Esqueci minha senha");
		btnNewButton_1.setFont(new Font("Consolas", Font.PLAIN, 12));
		btnNewButton_1.setBounds(130, 173, 181, 23);
		panel_1.add(btnNewButton_1);
	}
}
