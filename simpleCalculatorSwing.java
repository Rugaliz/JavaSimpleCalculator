package simpleCalculatorSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class simpleCalculatorSwing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1641112093816672713L;
	private JPanel contentPane;
	private final JButton button = new JButton("<-");
	
	private double num,ans;
	private int calculation;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simpleCalculatorSwing frame = new simpleCalculatorSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void arithmetic_operation () {
		switch (calculation) {
		
		case 1: // Addition
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 2: // Subtraction
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;		
		case 3: // Multiplication
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 4: // Division
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		}
	}

	/**
	 * Create the frame.
	 */
	public simpleCalculatorSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.BLACK, 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				String store;
				if (length > 0) {
					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					store = back.toString();
					textField.setText(store);
				}
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 14));
		button.setBounds(12, 80, 52, 52);
		contentPane.add(button);
		
		JButton btn_Clear = new JButton("C");
		btn_Clear.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		btn_Clear.setBounds(72, 80, 52, 52);
		contentPane.add(btn_Clear);
		
		JButton btn_Plus = new JButton("+");
		btn_Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 1;
				textField.setText("");
			}
		});
		btn_Plus.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_Plus.setBounds(202, 80, 52, 52);
		contentPane.add(btn_Plus);
		
		JButton btnC_7 = new JButton("7");
		btnC_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btnC_7.setFont(new Font("Dialog", Font.BOLD, 20));
		btnC_7.setBounds(12, 140, 52, 52);
		contentPane.add(btnC_7);
		
		JButton btnC_8 = new JButton("8");
		btnC_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btnC_8.setFont(new Font("Dialog", Font.BOLD, 20));
		btnC_8.setBounds(72, 140, 52, 52);
		contentPane.add(btnC_8);
		
		JButton btnC_9 = new JButton("9");
		btnC_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btnC_9.setFont(new Font("Dialog", Font.BOLD, 20));
		btnC_9.setBounds(132, 140, 52, 52);
		contentPane.add(btnC_9);
		
		JButton btn_Minus = new JButton("-");
		btn_Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 2;
				textField.setText("");
			}
		});
		btn_Minus.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_Minus.setBounds(202, 140, 52, 52);
		contentPane.add(btn_Minus);
		
		JButton btnC_4 = new JButton("4");
		btnC_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btnC_4.setFont(new Font("Dialog", Font.BOLD, 20));
		btnC_4.setBounds(12, 200, 52, 52);
		contentPane.add(btnC_4);
		
		JButton btnC_5 = new JButton("5");
		btnC_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnC_5.setFont(new Font("Dialog", Font.BOLD, 20));
		btnC_5.setBounds(72, 200, 52, 52);
		contentPane.add(btnC_5);
		
		JButton btnC_6 = new JButton("6");
		btnC_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnC_6.setFont(new Font("Dialog", Font.BOLD, 20));
		btnC_6.setBounds(132, 200, 52, 52);
		contentPane.add(btnC_6);
		
		JButton btn_Multiply = new JButton("*");
		btn_Multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 3;
				textField.setText("");
			}
		});
		btn_Multiply.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_Multiply.setBounds(202, 200, 52, 52);
		contentPane.add(btn_Multiply);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn_1.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_1.setBounds(12, 260, 52, 52);
		contentPane.add(btn_1);
		
		JButton btnC_2 = new JButton("2");
		btnC_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btnC_2.setFont(new Font("Dialog", Font.BOLD, 20));
		btnC_2.setBounds(72, 260, 52, 52);
		contentPane.add(btnC_2);
		
		JButton btnC_3 = new JButton("3");
		btnC_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btnC_3.setFont(new Font("Dialog", Font.BOLD, 20));
		btnC_3.setBounds(132, 260, 52, 52);
		contentPane.add(btnC_3);
		
		JButton btn_Divide = new JButton("/");
		btn_Divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 4;
				textField.setText("");
			}
		});
		btn_Divide.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_Divide.setBounds(202, 260, 52, 52);
		contentPane.add(btn_Divide);
		
		JButton btn_Zero = new JButton("0");
		btn_Zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn_Zero.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_Zero.setBounds(12, 320, 52, 52);
		contentPane.add(btn_Zero);
		
		JButton btn_Point = new JButton(".");
		btn_Point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btn_Point.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_Point.setBounds(72, 320, 52, 52);
		contentPane.add(btn_Point);
		
		JButton btn_Equals = new JButton("=");
		btn_Equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
			}
		});
		btn_Equals.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_Equals.setBounds(132, 320, 122, 52);
		contentPane.add(btn_Equals);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Dialog", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(12, 15, 242, 60);
		contentPane.add(textField);
	}
}
