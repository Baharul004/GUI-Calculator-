package testGui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class testGui {

	private JFrame frame;
	private JTextField textField;
	double firstNumber;
	double secondNumber;
	double result;
	double answer;
	String operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					testGui window = new testGui();
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
	public testGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 287, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(153, 91, 1, 1);
		frame.getContentPane().add(desktopPane);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(20, 24, 230, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		// -------- ROW 1 --------

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(20, 91, 50, 50);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String enterNumber = textField.getText() + btn8.getText();
				textField.setText(enterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(80, 91, 50, 50);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String enterNumberr = textField.getText() + btn9.getText();
				textField.setText(enterNumberr);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(140, 91, 50, 50);
		frame.getContentPane().add(btn9);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("+");
				operation = "+";

			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(200, 91, 50, 50);
		frame.getContentPane().add(btnPlus);

		// -------- ROW 2 --------

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String enterNumberr = textField.getText() + btn4.getText();
				textField.setText(enterNumberr);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(20, 160, 50, 50);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String enterNumberr = textField.getText() + btn5.getText();
				textField.setText(enterNumberr);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(80, 160, 50, 50);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String enterNumberr = textField.getText() + btn6.getText();
				textField.setText(enterNumberr);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(140, 160, 50, 50);
		frame.getContentPane().add(btn6);

		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(200, 160, 50, 50);
		frame.getContentPane().add(btnMinus);

		// -------- ROW 3 --------

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String enterNumberr = textField.getText() + btn1.getText();
				textField.setText(enterNumberr);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(20, 231, 50, 50);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String enterNumberr = textField.getText() + btn2.getText();
				textField.setText(enterNumberr);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(80, 231, 50, 50);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String enterNumberr = textField.getText() + btn3.getText();
				textField.setText(enterNumberr);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(140, 231, 50, 50);
		frame.getContentPane().add(btn3);

		JButton btnMmultiply = new JButton("*");
		btnMmultiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMmultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMmultiply.setBounds(200, 231, 50, 50);
		frame.getContentPane().add(btnMmultiply);

		// -------- ROW 4 --------

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String enterNumberr = textField.getText() + btn0.getText();
				textField.setText(enterNumberr);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(20, 300, 50, 50);
		frame.getContentPane().add(btn0);

		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String enterNumberr = textField.getText() + btnPoint.getText();
				textField.setText(enterNumberr);
			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPoint.setBounds(80, 300, 50, 50);
		frame.getContentPane().add(btnPoint);

		JButton btnDivid = new JButton("/");
		btnDivid.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDivid.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivid.setBounds(140, 300, 50, 50);
		frame.getContentPane().add(btnDivid);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				secondNumber = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "-") {
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				} else if (operation == "*") {
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				} else if (operation == "/") {
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(200, 300, 50, 50);
		frame.getContentPane().add(btnEqual);
	}
}
