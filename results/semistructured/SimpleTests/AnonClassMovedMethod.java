import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AnonClassMovedMethod {
  public MouseListener getListener() {
    return new MouseListener() {
<<<<<<< /tmp/VirtualFile_B
        @Override public void mouseClicked(MouseEvent e) {
          System.out.println("Mouse Clicked!");
        }
        @Override public void mousePressed(MouseEvent e) {
          System.out.println("Mouse Pressed!");
        }
        @Override public void mouseReleased(MouseEvent e) {
          System.out.println("Mouse Released!");
=======
        @Override public void mousePressed(MouseEvent e) {
          System.out.println("Mouse Pressed!");
        }
        @Override public void mouseClicked(MouseEvent e) {
          System.out.println("Mouse Clicked!");
>>>>>>> /tmp/VirtualFile_QC
        }
        @Override public void mouseEntered(MouseEvent e) {
          System.out.println("Mouse Entered!");
        }
<<<<<<< /tmp/VirtualFile_B
=======
        @Override public void mouseReleased(MouseEvent e) {
          System.out.println("Mouse Released!");
        }
>>>>>>> /tmp/VirtualFile_QC
        @Override public void mouseExited(MouseEvent e) {
          System.out.println("Mouse Exited!");
        }
    };
  }
}
