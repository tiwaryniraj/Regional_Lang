
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyClass {
 public static void main(String args[]) {
  MouseEventsExample obj = new MouseEventsExample();
  obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

}

class MouseEventsExample extends JFrame {
 private JPanel mousepanel;
 private JLabel statusbar;

 MouseEventsExample() {
  super("Your Title Here");
  mousepanel = new JPanel();
  mousepanel.setBackground(Color.WHITE);
  add(mousepanel, BorderLayout.CENTER);

  statusbar = new JLabel("default");
  add(statusbar, BorderLayout.SOUTH);
  Handlerclass handler = new Handlerclass();
  mousepanel.addMouseListener(handler);
  mousepanel.addMouseMotionListener(handler);
  this.setVisible(true);
  this.setSize(400, 400);
 }

 class Handlerclass implements MouseListener, MouseMotionListener {

  public void mouseClicked(MouseEvent event) {
   statusbar.setText(String.format("Clicked at %d,%d", event.getX(), event.getY()));
  }
  public void mousePressed(MouseEvent event) {
   statusbar.setText("Mouse Pressed");
  }
  public void mouseReleased(MouseEvent event) {
   statusbar.setText("Mouse Released");
  }
  public void mouseEntered(MouseEvent event) {
   statusbar.setText("You entered the panel area");
   mousepanel.setBackground(Color.YELLOW);

  }
  public void mouseExited(MouseEvent event) {
    statusbar.setText("Mouse exited");
    mousepanel.setBackground(Color.YELLOW);

   }
   // mouse motion events
  public void mouseDragged(MouseEvent event) {
   statusbar.setText("You are dragging the mouse");

  }
  public void mouseMoved(MouseEvent event) {
   statusbar.setText("You are moving the mouse, not dragging");

  }

 }

}
