import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Chapter1{
	public static void main(String[]args) throws Exception
	{
		JOptionPane.showInputDialog(null, "How old are you");
		JOptionPane.showInputDialog(null, "What is your name");
		URL imageLocation = new URL(
			"http://cdn.rsvlts.com/wp-content/uploads/2013/11/Melanie-Iglesias-GIF-06.gif");
		JOptionPane.showMessageDialog(null, "Hello Julio", "Title",
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
		}
	}


