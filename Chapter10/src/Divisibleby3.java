import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Divisibleby3 {

	private JFrame frame;
	private JTextField integer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Divisibleby3 window = new Divisibleby3();
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
	public Divisibleby3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 337, 183);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Label(User can't edit this)
		JLabel lblNewLabel = new JLabel("Enter an Integer:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel.setBounds(13, 23, 159, 30);
		frame.getContentPane().add(lblNewLabel);
		
		//User inputs the integer they want to know if it is divisible by 3
		integer = new JTextField();
		integer.setBounds(162, 23, 149, 30);
		frame.getContentPane().add(integer);
		integer.setColumns(10);
		
		//Label(User can't edit this)
		JLabel divisibleby3 = new JLabel("");
		divisibleby3.setBounds(134, 97, 177, 29);
		frame.getContentPane().add(divisibleby3);
		
		//When the button is pressed it checks if the integer is divisible by 3
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//Turns the number into an integer instead of it being a string
				int integervalue = Integer.valueOf(integer.getText());
				double integer = (integervalue); 
				
				//If the number is divisible by 3 it does this
				if (integer % 3 == 0) {
					divisibleby3.setText(integervalue + " is divisible by 3");
				}
				
				//If the number is not divisible by 3 it displays this
				else {
					divisibleby3.setText(integervalue + " is not divisible by 3");
				}
			
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		btnNewButton.setBounds(13, 97, 114, 23);
		frame.getContentPane().add(btnNewButton);
		

	}
}
