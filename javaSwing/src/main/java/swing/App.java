package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class App {
    private int posun = 200;
    public void init() {
        JFrame frame = new JFrame();
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("OKNO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setBackground(new Color(241, 49, 6));
        panel.setLayout(null);

        JButton button = new JButton("Klikni zde");
        button.setLocation(100,0);
        button.setSize(100,50);
        button.setBackground(Color.BLACK);
        panel.add(button);
        button.addActionListener(e -> {
            System.out.println("Nečum");
        });
        button.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                button.setLocation(button.getX()+posun,button.getY());
                posun *= -1;
            }
        });

        JButton button2 = new JButton("Klikni");
        button2.setSize(100,50);
        panel.add(button2);
        button2.addActionListener(e -> {
            JOptionPane.showMessageDialog(panel,"Co na mě klikáš");
        });

        frame.setVisible(true);


    }
}
