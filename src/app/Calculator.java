package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 456);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		textField.setBounds(10, 10, 309, 90);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnclear = new JButton("CLR");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnclear.setBounds(22, 110, 72, 63);
		getContentPane().add(btnclear);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);

			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(22, 167, 72, 63);
		getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);

			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(22, 225, 72, 63);
		getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(22, 286, 72, 63);
		getContentPane().add(btn1);
		
		JButton btnzero = new JButton("0");
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnzero.getText();
				textField.setText(number);

			}
		});
		btnzero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnzero.setBounds(22, 348, 142, 63);
		getContentPane().add(btnzero);
		
		JButton btndelete = new JButton("\uF0E7");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String delete = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					delete = str.toString();
					textField.setText(delete);
				}
			}
		});
		btndelete.setFont(new Font("Wingdings", Font.PLAIN, 18));
		btndelete.setBounds(92, 110, 72, 63);
		getContentPane().add(btndelete);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
			textField.setText(number);

			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(92, 167, 72, 63);
		getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);

			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(92, 225, 72, 63);
		getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);

			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(92, 286, 72, 63);
		getContentPane().add(btn2);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btndiv.setBounds(163, 110, 72, 63);
		getContentPane().add(btndiv);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);

			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(163, 167, 72, 63);
		getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);

			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(163, 225, 72, 63);
		getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);

			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(163, 286, 72, 63);
		getContentPane().add(btn3);
		
		JButton btndecimal = new JButton(".");
		btndecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndecimal.getText();
				textField.setText(number);

			}
		});
		btndecimal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btndecimal.setBounds(163, 348, 72, 63);
		getContentPane().add(btndecimal);
		
		JButton btnmultipy = new JButton("*");
		btnmultipy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmultipy.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnmultipy.setBounds(235, 110, 72, 63);
		getContentPane().add(btnmultipy);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnsub.setBounds(235, 167, 72, 63);
		getContentPane().add(btnsub);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnadd.setBounds(235, 225, 72, 63);
		getContentPane().add(btnadd);
		
		JButton btnequalto = new JButton("=");
		btnequalto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation =="+") {
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation =="-") {
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation =="*") {
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation =="/") {
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btnequalto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnequalto.setBounds(235, 286, 72, 123);
		getContentPane().add(btnequalto);
	}
}
