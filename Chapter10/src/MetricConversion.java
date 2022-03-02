import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Frame
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 309, 173);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Label(User can't edit this)
		JLabel lblNewLabel = new JLabel("Select a conversion type:");
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 15));
		lblNewLabel.setBounds(20, 11, 196, 25);
		frame.getContentPane().add(lblNewLabel);
		
		//Combobox that holds all the conversions
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Inch to Centimeter", "Foot to Meters", "Gallon to Liters", "Pound to Kilograms"}));
		comboBox.setBounds(20, 31, 249, 22);
		frame.getContentPane().add(comboBox);
		
		//Print the conversion 
		JLabel conversion = new JLabel("");
		conversion.setBounds(20, 93, 249, 30);
		frame.getContentPane().add(conversion);
		
		//When the button is pressed it print the conversion in the conversion label
		JButton button = new JButton("Convert");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Conversion from inches to centimeter
				if (comboBox.getSelectedItem().equals("Inch to Centimeter")) 
				{
					conversion.setText("1 inch = 2.54 centimeters");
				}
				//Conversion from foor to meters
				else if (comboBox.getSelectedItem().equals("Foot to Meters"))
				{
					conversion.setText("1 foot = 0.3048 meters");
				}
				//Conversion of gallon to liters
				else if (comboBox.getSelectedItem().equals("Gallon to Liters"))
				{
					conversion.setText("1 gallon = 4.5461 litters");
				}
				//Conversion of pound to killograms
				else if (comboBox.getSelectedItem().equals("Pound to Kilograms"))
				{
					conversion.setText("1 pound = 0.4536 kilograms");
				}
			}
		});
		button.setBounds(20, 59, 89, 23);
		frame.getContentPane().add(button);
		
	}
}
