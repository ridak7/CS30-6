import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;

public class AverageCalculation {

	private JFrame frame;
	private JTextField GR1;
	private JTextField textField;
	private JTextField GR2;
	private JTextField GR3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AverageCalculation window = new AverageCalculation();
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
	public AverageCalculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
		frame.setBounds(100, 100, 482, 312);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Enter the first grade:");
		lblNewJgoodiesTitle.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewJgoodiesTitle.setBounds(34, 31, 214, 32);
		frame.getContentPane().add(lblNewJgoodiesTitle);
		
		GR1 = new JTextField();
		GR1.setBounds(258, 32, 179, 34);
		frame.getContentPane().add(GR1);
		GR1.setColumns(10);
		
		JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("Enter the second grade:");
		lblNewJgoodiesTitle_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewJgoodiesTitle_1.setBounds(34, 85, 214, 32);
		frame.getContentPane().add(lblNewJgoodiesTitle_1);
		
		GR2 = new JTextField();
		GR2.setBounds(258, 86, 179, 34);
		frame.getContentPane().add(GR2);
		GR2.setColumns(10);
		
		JLabel lblNewJgoodiesTitle_2 = DefaultComponentFactory.getInstance().createTitle("Enter the third grade:");
		lblNewJgoodiesTitle_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewJgoodiesTitle_2.setBounds(33, 140, 215, 32);
		frame.getContentPane().add(lblNewJgoodiesTitle_2);
		
		GR3 = new JTextField();
		GR3.setBounds(258, 141, 179, 34);
		frame.getContentPane().add(GR3);
		GR3.setColumns(10);
		
		
		
		JLabel Avg = new JLabel("");
		Avg.setBounds(224, 194, 168, 41);
		frame.getContentPane().add(Avg);
		
		
		NumberFormat n = NumberFormat.getPercentInstance();
		
		
		JButton AvgButton = new JButton("Average");
		AvgButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		AvgButton.addActionListener(new ActionListener() 
		
		{
			public void actionPerformed(ActionEvent e) 
			{
				
					
				int grade1 = Integer.valueOf(GR1.getText());
				int grade2 = Integer.valueOf(GR2.getText());
				int grade3 = Integer.valueOf(GR3.getText());
				
				
				double AverageGrade = (double)(grade1 + grade2 + grade3)/3;
				
				
				Avg.setText(n.format(AverageGrade/100));
					
			}

		});
		AvgButton.setBounds(34, 194, 168, 41);
		frame.getContentPane().add(AvgButton);
		
		
		
	}
}
