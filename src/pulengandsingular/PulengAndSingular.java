package pulengandsingular;


import java.util.Scanner;
import javax.swing.JOptionPane;

/** @author user2*/
public class PulengAndSingular 
{

    public static void main(String[] args) 
    {
        Scanner scannerObj=new Scanner(System.in);
        String firstName ;
        String secondName;
        
        System.out.println("Please enter your first name: ");
        firstName = scannerObj.next();
        
        secondName = JOptionPane.showInputDialog("Please enter your second name: ");
        
        JOptionPane.showMessageDialog(null,firstName + " " + secondName);
        System.out.println("Your full names are: " + firstName + " " + secondName);
        
    }
    
}
