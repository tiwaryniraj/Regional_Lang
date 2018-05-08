import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutExample {
 public static void main(String args[]) {
  flowLayout obj = new flowLayout();
  obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}

class flowLayout extends JFrame {
    
 JButton lb;
 JButton cb;
 JButton rb;
 FlowLayout layout;
 Container container;
 
 flowLayout() {
  super("Your Title Here");
  layout = new FlowLayout();
  container = getContentPane();
  setLayout(layout);
  this.setVisible(true);
  this.setLayout(new FlowLayout());
  this.setSize(500, 500);

  //left GUI elements here
  lb = new JButton("left");
  add(lb);
  lb.addActionListener(
   new ActionListener() {
    public void actionPerformed(ActionEvent event) {
     layout.setAlignment(FlowLayout.LEFT);
     layout.layoutContainer(container);
    }
   });


  //centre GUI elements here
  cb = new JButton("centre");
  add(cb);
  cb.addActionListener(
   new ActionListener() {
    public void actionPerformed(ActionEvent event) {
     layout.setAlignment(FlowLayout.CENTER);
     layout.layoutContainer(container);
    }
   });


  //right GUI elements here
  rb = new JButton("RIGHT");
  add(rb);
  rb.addActionListener(
   new ActionListener() {
    public void actionPerformed(ActionEvent event) {
     layout.setAlignment(FlowLayout.RIGHT);
     layout.layoutContainer(container);
    }
   });
   
 }
}
