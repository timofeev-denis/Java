package ru.voskhod.swingapp;

import java.awt.Cursor;
import java.io.IOException;
import org.apache.log4j.Logger;

public class MainFrame extends javax.swing.JFrame {
    static Logger log = Logger.getLogger(MainFrame.class);
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //        String[] cmd = { "cmd", "/c", "ping", "localhost", "-n", "10", ">", "p.log" };
        this.getContentPane().setCursor(new Cursor(Cursor.WAIT_CURSOR));
        final ProgressBar progress = new ProgressBar(this);
        
        progress.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                String[] cmd = {"scan.bat"};
                ProcessBuilder pb = new ProcessBuilder(cmd);
                log.debug("*** START ***");
                try {
                    Process proc = pb.start();
                    log.debug("Process started successfuly");
                    int returnCode = proc.waitFor();
                    log.debug("Return code is " + returnCode);
                } catch (IOException ex) {
                    log.error(ex.getMessage());
                } catch (InterruptedException ex) {
                    log.error(ex.getMessage());
                }
                log.debug("*** STOP ***");
                progress.stop();
                getContentPane().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        }).start();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
