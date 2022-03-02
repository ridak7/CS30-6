import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class LatinNamesv2 {

	private JFrame frame;
	private JComboBox plantNames;
	private JLabel latinName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LatinNamesv2 window = new LatinNamesv2();
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
	public LatinNamesv2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 310, 198);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Frame = new JPanel();
		frame.getContentPane().add(Frame, BorderLayout.CENTER);
		Frame.setLayout(null);
		
		JComboBox plantNames = new JComboBox();
		plantNames.setBounds(66, 40, 166, 27);
		plantNames.setFont(new Font("Tahoma", Font.BOLD, 15));
		plantNames.setModel(new DefaultComboBoxModel(new String[] {"Basil", "Lavender", "Parsley", "Peppermint", "Saffron", "Sage"}));
		Frame.add(plantNames);

		JLabel latinName = new JLabel("");
		latinName.setFont(new Font("Tahoma", Font.BOLD, 16));
		latinName.setBounds(66, 112, 166, 36);
		Frame.add(latinName);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Select a plant:");
		lblNewJgoodiesTitle.setBounds(83, 11, 129, 18);
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.BOLD, 17));
		Frame.add(lblNewJgoodiesTitle);
		
		JButton Generate = new JButton("Generate");
		Generate.setBounds(98, 78, 89, 23);
		Generate.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(plantNames.getSelectedItem().equals("Basil"))
				{
					latinName.setText("Ocium");
				}
				else if (plantNames.getSelectedItem().equals("Lavender"))
				{
					latinName.setText("Lavandula spica");
				}
				else if (plantNames.getSelectedItem().equals("Parsley"))
				{
					latinName.setText("Apium");
				}
				else if (plantNames.getSelectedItem().equals("Peppermint"))
				{
					latinName.setText("Mentha Piperita");
				}
				else if (plantNames.getSelectedItem().equals("Saffron"))
				{
					latinName.setText("Crocus");
				}
				else if (plantNames.getSelectedItem().equals("Sage"))
				{
					latinName.setText("Salvia");
				}
			}
		});
		Frame.add(Generate);
		
		{
			
		}
	}
}
