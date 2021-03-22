package Pinaki1;
import javax.swing.JOptionPane;
public class swing2 {
	 public static void main(String[] args)
	  {
	    JOptionPane.showConfirmDialog(
	        null, // The parent frame
	        "Are you sure you want to do this?", 
	              // a message
	        "Just checking...", // a title
	        JOptionPane.YES_NO_OPTION, 
	                      // The option type
	        JOptionPane.QUESTION_MESSAGE 
	                      // the message type
	        );
	  }
}
