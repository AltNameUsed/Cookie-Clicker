import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Main {
    public static void main(String[] args) {
        cookiePropertyAndTexts obj2 = new cookiePropertyAndTexts();
        JFrame aFrame = new JFrame("Cookie Clicker!");
        JButton aButton = new JButton("Click me!");
        JButton secretB = new JButton();
        secretB.setBounds(30, 50, 95, 30);
        aButton.setBounds(50, 100, 95, 30);
        aFrame.add(aButton);
        aFrame.add(secretB);
        secretB.setVisible(true);
        aFrame.setSize(500, 500);
        aFrame.setLayout(null);
        aFrame.setVisible(true);
        aButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              boolean firstButtonClicked = true;
              obj2.someTextThatIsTriggered();
            }
        });
        aButton.addMouseListener(new MouseAdapter() {
          public void mouseClicked(MouseEvent evt) {
            switch (evt.getClickCount()) {
              case 1: 
              System.out.println(1);
              obj2.space();
              System.out.println(obj2.thanku);
              break;
              case 2:
              System.out.println(2);
              obj2.space();
              System.out.println(obj2.thanku);
              break;
              case 3:
              System.out.println(3);
              obj2.space();
              System.out.println(obj2.thanku);
              break;
              default:
              System.out.println("Error, you have clicked more than 3 times.");
              break;
            }
          }
        });
        secretB.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            boolean secondButtonClicked = true;
            obj2.forFun();
            System.out.println(obj2.taste);
            System.out.println(obj2.madeBy);
            System.out.println(obj2.expDate);
          }
        });
    }
}
// class for containing variables and functions
class cookiePropertyAndTexts {
    Main someObj = new Main();
    public String taste = "Strong chocolate taste on the mouth";
    public int expDate = 2023; // lel
    public String madeBy = "Made by: The who?";
    public void someTextThatIsTriggered() {
      System.out.println("You have clicked! click count is: ");
    }
    public void forFun() {
        System.out.println("You have uncovered a mysterious button! here's your prize: one cookie!");
    }
    public void space() {
      System.out.println(" ");
    }
    public String thanku = "Thanks for running the cookie clicker! made by AltNameUsed, also, it didn't have a cookie since I don't know how to draw a cookie lol";
}
