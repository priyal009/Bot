import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ChatBot extends JFrame{

	private JTextArea chatarea = new JTextArea();
	private JTextField chatbox = new JTextField();
	private JButton button = new JButton();
	private JLabel label = new JLabel();
	public ChatBot()
	{
		JFrame frame =	new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setAutoRequestFocus(false);
		frame.setLayout(null);
		frame.setSize(500,600);
		frame.getContentPane().setBackground(Color.gray);
		frame.setTitle("Malhar");
		
		
		frame.add(chatarea);
		frame.add(chatbox);
		frame.add(button);
		frame.add(label);
		
		chatarea.setSize(380,500);
		chatarea.setLocation(1,1);
		chatarea.setBackground(Color.BLACK);
		
		chatbox.setSize(400,30);
		chatbox.setLocation(1,520);
		
		button.add(label);  
		button.setSize(80,30);
		button.setLocation(401,520);
		label.setText("SEND");
		button.setBackground(Color.GREEN);
		

		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == button)
				{
//					String text=cf.getText().toLowerCase();

					String s = chatbox.getText().toLowerCase();
					chatarea.setForeground(Color.GREEN);
//					chatarea.setSelectedTextColor(Color.GREEN);
					chatarea.append("You-->" + s + "\n");
					chatbox.setText("");
					
					int rando = (int)(Math.random()*3)+ 1;
					
					if(s.contains("hi")|| s.contains("hey")  || s.contains("hello") )
							{
						
								if(rando == 1)
								replymeth("Well, Hello there!");
								else if(rando == 2)
								{
									replymeth("Yooo");
								}
								else
								{
									replymeth("Hey! Welcome");
								}
							}
					else if(s.contains("how are you")) {
//						int rando = (int)Math.random()*3 + 1;
						if(rando == 1)
						replymeth("I'm Good :).Thankyou for asking");
						else if(rando == 2)
						{
							replymeth("I'm Fine" + "\n" + "How are you?");
						}
					}
					else if(s.contains("your name")) {
//						int rando = (int)Math.random()*3 + 1;
						if(rando <= 2)
						replymeth("No name, but I would prefer whatever you would like to call me!");
						else replymeth("...");
					}
					else if(s.contains("gender")) {
//						int rando = (int)Math.random()*3 + 1;
						if(rando == 2)
						replymeth("Male" + " Maybe we could talk " + "\n" + "^_____^");
						if(rando == 1)
						{
							replymeth("I'm a dude");
						}
						else
						{
							replymeth("Kinda weird asking a bot for gender" + "\n" +  "Anyhow, I am a guy");
						}
					}
					else if(s.contains("bye")) {
//						int rando = (int)Math.random()*3 + 1;
						if(rando == 1 || rando == 3)
						replymeth("Too Soon :( AnyWays"+"\n");
						else
							replymeth("See you Soon");
					}
					else
					{
						 rando = (int)Math.random()*5 + 1;
						if(rando == 1)
						replymeth("Wuttt?");
						else if(rando == 2)
						{
							replymeth("Heh?");
						}
						else if(rando == 3)
						{
							replymeth("Okayy");
						}
						else if(rando == 4) replymeth("mHmmm..");
						else 
						{
							replymeth("I have a limited vocabulary an understanding" + "Maybe you can try some common stuff");
						}
					}
				}
			}
		});
		
	}
	public void replymeth(String s)
	{
//		chatarea.setForeground(Color.BLUE);
		chatarea.append("Me -->" + s + "\n");
	}
}

public class bot{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatBot();
	}
}