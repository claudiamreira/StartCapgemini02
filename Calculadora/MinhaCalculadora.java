package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MinhaCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinhaCalculadora frame = new MinhaCalculadora();
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
	public MinhaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nº 1");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel.setBounds(28, 71, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nº 2");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(28, 119, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Calculadora básica");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(127, 27, 206, 14);
		contentPane.add(lblNewLabel_2);
		
		num1 = new JTextField();
		
		num1.setBounds(84, 68, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		
		num2.setBounds(84, 116, 86, 20);
		contentPane.add(num2);
		num2.setColumns(10);
		
		JButton adicao = new JButton("+\r\n");
		adicao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x, y;
				x = Integer.parseInt(num1.getText());
				y = Integer.parseInt(num2.getText());
				JOptionPane.showMessageDialog(adicao, "A soma é = " + (x + y));
			}
		});
		
		
		adicao.setFont(new Font("Verdana", Font.PLAIN, 11));
		adicao.setBounds(28, 173, 53, 23);
		contentPane.add(adicao);
		
		JButton subtracao = new JButton("-");
		subtracao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x, y;
				x = Integer.parseInt(num1.getText());
				y = Integer.parseInt(num2.getText());
				JOptionPane.showMessageDialog(subtracao, "A subtração é = " + (x - y));
			}
		});
		subtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		subtracao.setFont(new Font("Verdana", Font.PLAIN, 11));
		subtracao.setBounds(103, 174, 53, 23);
		contentPane.add(subtracao);
		
		JButton multiplicacao = new JButton("*");
		multiplicacao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x, y;
				x = Integer.parseInt(num1.getText());
				y = Integer.parseInt(num2.getText());
				JOptionPane.showMessageDialog(multiplicacao, "A multiplicação é = " + (x * y));
			}
		});
		multiplicacao.setFont(new Font("Verdana", Font.PLAIN, 11));
		multiplicacao.setBounds(177, 174, 53, 23);
		contentPane.add(multiplicacao);
		
		JButton divisao = new JButton("/");
		divisao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x, y;
				x = Integer.parseInt(num1.getText());
				y = Integer.parseInt(num2.getText());
				JOptionPane.showMessageDialog(divisao, "A divisão é = " + (x / y));
			}
		});
		divisao.setFont(new Font("Verdana", Font.PLAIN, 11));
		divisao.setBounds(254, 174, 53, 23);
		contentPane.add(divisao);
	}

}
