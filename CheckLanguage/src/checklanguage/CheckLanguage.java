package checklanguage;

public class CheckLanguage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame(null).setVisible(true);
            }
        });
        
    }

}
