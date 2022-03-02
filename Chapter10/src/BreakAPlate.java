import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Save all the images
		ImageIcon plates = new ImageIcon("..\\Chapter10\\src\\Plates.gif");
		ImageIcon twobroken = new ImageIcon("..\\Chapter10\\src\\plates_two_broken.gif");
		ImageIcon allbroken = new ImageIcon("..\\Chapter10\\src\\plates_all_broken.gif");
		ImageIcon sticker = new ImageIcon("..\\Chapter10\\src\\sticker.gif");
		ImageIcon tiger = new ImageIcon("..\\Chapter10\\src\\tiger_plush.gif");
		ImageIcon plane = new ImageIcon("..\\Chapter10\\src\\plane.gif");
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 453, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Blank label to display the imageicon when needed
		JLabel plateimage = new JLabel("");
		plateimage.setBackground(Color.WHITE);
		plateimage.setBounds(78, 21, 304, 87);
		frame.getContentPane().add(plateimage);
		
		//This label print the prize(Sticker or Tiger)
		JLabel prize = new JLabel("");
		prize.setBounds(167, 165, 201, 114);
		frame.getContentPane().add(prize);
		
		//Print the prize in words instead of the image from the first label
		JLabel prizetext = new JLabel("You win:");
		prizetext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		prizetext.setBounds(156, 278, 133, 36);
		frame.getContentPane().add(prizetext);
		
		//Print the unbroken 3 plates
		plateimage.setIcon(plates);
		
		//When play is pressed it plays the game
		JButton Play = new JButton("Play");
		Play.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		Play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
					
				

				String eventName = Play.getActionCommand();
				
				
				//Generates a random number between 0 to 2
				int ranNum;
				ranNum =  (int)(Math.random() * 3);
				
		
				//If the button says play it does this
				if (eventName == "Play") 
				{
					
					//Does this if the number 0 is generated
					if (ranNum == 0) 
					  {
					  plateimage.setIcon(twobroken);
					  prize.setIcon(sticker);
					  Play.setText("Play again");
					  prizetext.setText("You win: A sticker!");
					  }
					
					//Does this if the number 1 is generated
					if (ranNum == 1) 
						{ 	
						plateimage.setIcon(twobroken);
						prize.setIcon(sticker);
						Play.setText("Play again");
						prizetext.setText("You win: A sticker!");
						}
					
					//Does this if the number 2 is generated
					if (ranNum == 2) 
						{ 	
						plateimage.setIcon(allbroken);
						prize.setIcon(tiger);
						Play.setText("Play again");
						prizetext.setText("You win: A tiger!");
						}
				}	
				
				//If the button says play again it starts afresh
				if (eventName == "Play again") 
				{
					Play.setText("Play");
					plateimage.setIcon(plates);
					prize.setIcon(plane);
					prizetext.setText("You win: ");
				}
					
				}
		
		 });
		
		Play.setBounds(146, 126, 143, 38);
		frame.getContentPane().add(Play);
		
		
		
	}
}
