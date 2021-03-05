import javax.swing.*;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.*;
import java.awt.event.*;
import java.awt.EventQueue;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        EventQueue.invokeLater(() -> {
            var ex = new App();
            ex.setVisible(true);
            
        });

    }

    public App() {
        JPanel panel = new JPanel();
        
        var cpane = getContentPane();
        var gl = new GroupLayout(cpane);
        cpane.setLayout(gl);

        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);

        add(panel);
        setTitle("calculator");
        setSize(360, 640);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel dispaly = new JLabel("Enter Number", SwingConstants.CENTER);
        dispaly.setFont(new Font("Serif", Font.BOLD, 20));
        dispaly.setBounds(0, 20, getBounds().width, 100);
        panel.add(dispaly);
        
        
        JButton one = new JButton("1");
        one.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispaly.setText("1");
            }
        });
        
        JButton two = new JButton("2");
        two.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispaly.setText("2");
            }
        });
        
        JButton three = new JButton("3");
        three.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispaly.setText("3");
            }
        });
        
        JButton four = new JButton("4");
        four.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispaly.setText("4");
            }
        });
        
        JButton five = new JButton("5");
        five.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispaly.setText("5");
            }
        });
        
        JButton six = new JButton("6");
        six.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispaly.setText("6");
            }
        });
        
        JButton seven = new JButton("7");
        seven.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispaly.setText("7");
            }
        });
        
        JButton eight = new JButton("8");
        eight.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispaly.setText("8");
            }
        });
        
        JButton nine = new JButton("9");
        nine.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispaly.setText("9");
            }
        });
        
        JButton zero = new JButton("0");
        zero.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispaly.setText("0");
            }
        });
        
        gl.setHorizontalGroup(gl.createParallelGroup())
            addGroup(gl.createParallelGroup()
            .addComponent(one)
            .addComponent(two))
        );
        // gl.setVerticalGroup(gl.createSequentialGroup()
        //         .addPreferredGap(ComponentPlacement.RELATED,
        //                 GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        //         .addGroup(gl.createParallelGroup()
        //                 .addComponent(one)
        //                 .addComponent(two))
        // );

        // gl.linkSize(SwingConstants.HORIZONTAL, one, two);

        // pack();
    }
}

