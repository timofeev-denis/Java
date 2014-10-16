package filelist;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.*;

public class FileList {
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame("f:\\tmp").setVisible(true);
            }
        });
        
    }
}
