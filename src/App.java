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
        int digit = 0;
        
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
                digit += 1;
                dispaly.setText(toString(calculator(1, digit)));
            }
        });
        
        JButton two = new JButton("2");
        two.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                digit += 1;
                dispaly.setText(toString(calculator(2, digit)));
            }
        });
        
        JButton three = new JButton("3");
        three.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                digit += 1;
                dispaly.setText(toString(calculator(3, digit)));
            }
        });
        
        JButton four = new JButton("4");
        four.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                digit += 1;
                dispaly.setText(toString(calculator(4, digit)));
            }
        });
        
        JButton five = new JButton("5");
        five.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                digit += 1;
                dispaly.setText(toString(calculator(5, digit)));
            }
        });
        
        JButton six = new JButton("6");
        six.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                digit += 1;
                dispaly.setText(toString(calculator(6, digit)));
            }
        });
        
        JButton seven = new JButton("7");
        seven.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                digit += 1;
                dispaly.setText(toString(calculator(7, digit)));
            }
        });
        
        JButton eight = new JButton("8");
        eight.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                digit += 1;
                dispaly.setText(toString(calculator(8, digit)));
            }
        });
        
        JButton nine = new JButton("9");
        nine.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                digit += 1;
                dispaly.setText(toString(calculator(9, digit)));
            }
        });
        
        JButton zero = new JButton("0");
        zero.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                digit += 1;
                dispaly.setText(toString(calculator(0, digit)));
            }
        });
        
        gl.setHorizontalGroup(gl.createParallelGroup())
            addGroup(gl.createParallelGroup()
            .addComponent(one)
            .addComponent(two))
        );
        gl.setVerticalGroup(gl.createSequentialGroup()
                .addPreferredGap(ComponentPlacement.RELATED,
                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gl.createParallelGroup()
                        .addComponent(one)
                        .addComponent(two))
        );

        gl.linkSize(SwingConstants.HORIZONTAL, one, two);

        pack();
    }

    private double calculator(int num, int digit) {
        int ten = 10;
        return num * (Math.pow(10, (digit - 1)));
    }
}

