package com.swing01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    MainFrame(String title) {
        super(title);
        setLayout(new BorderLayout());

        final JTextArea text = new JTextArea();
        JButton btn = new JButton("Click me!");

        Container c = getContentPane();
        c.add(text, BorderLayout.CENTER);
        c.add(btn, BorderLayout.SOUTH);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("Hello!\n");
            }
        });
    }
}
