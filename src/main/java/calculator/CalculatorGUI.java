package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	JLabel lblResult = new JLabel("result:");
	Calculator cal = new Calculator();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
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
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 440, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumber = new JLabel("number 1:");
		lblNumber.setBounds(12, 29, 83, 15);
		frame.getContentPane().add(lblNumber);
		
		textField = new JTextField();
		textField.setBounds(85, 27, 157, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNumber_1 = new JLabel("number 2:");
		lblNumber_1.setBounds(12, 76, 83, 15);
		frame.getContentPane().add(lblNumber_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 74, 157, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		//JLabel lblResult = new JLabel("result:");
		lblResult.setBounds(13, 155, 157, 15);
		frame.getContentPane().add(lblResult);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty()){
					
					JOptionPane.showMessageDialog(null, "Cannot calculate with empty values");
				}
				else{	
				double first = Double.parseDouble(textField.getText());
				double second = Double.parseDouble(textField_1.getText());
				
				lblResult.setText("Result: "+cal.addNumbers(first, second));
				
				textField.setText(null);
				textField_1.setText(null);
				}
				}
				catch(NumberFormatException e1){
					
					JOptionPane.showMessageDialog(null, "String input not allowed");
				}
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBounds(29, 218, 54, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty()){
					
					JOptionPane.showMessageDialog(null, "Cannot calculate with empty values");
				}
				else{
				double first = Double.parseDouble(textField.getText());
				double second = Double.parseDouble(textField_1.getText());
				
				lblResult.setText("Result: "+cal.subtractNumbers(first, second));
				
				textField.setText(null);
				textField_1.setText(null);
				}
				}
				catch(NumberFormatException e1){
					
					JOptionPane.showMessageDialog(null, "String input not allowed");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_1.setBounds(95, 218, 54, 47);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty()){
					
					JOptionPane.showMessageDialog(null, "Cannot calculate with empty values");
				}
				else{
				double first = Double.parseDouble(textField.getText());
				double second = Double.parseDouble(textField_1.getText());
				
				lblResult.setText("Result: "+cal.mulipicateNumbers(first,second));
				
				textField.setText(null);
				textField_1.setText(null);
				}
				}
				catch(NumberFormatException e1){
					
					JOptionPane.showMessageDialog(null, "String input not allowed");
				}
			}
		});
		btnNewButton_2.setBounds(166, 218, 54, 47);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try{
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty()){
					
					JOptionPane.showMessageDialog(null, "Cannot calculate with empty values");
				}
				else{
				double first = Double.parseDouble(textField.getText());
				double second = Double.parseDouble(textField_1.getText());
				
				if(second!=0.0){
					lblResult.setText("Result: "+cal.divideNumbers(first,second));
					
					textField.setText(null);
					textField_1.setText(null);
				}
				else
				{
					
					JOptionPane.showMessageDialog(null, "Dividing by zero not allowed");
				}
				
				}
				}
				catch(NumberFormatException e1){
					JOptionPane.showMessageDialog(null, "String input not allowed");
				}
			}
			
		});
		btnNewButton_3.setBounds(235, 218, 54, 47);
		frame.getContentPane().add(btnNewButton_3);
	}
}
