package employee.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Image.SCALE_DEFAULT;

public class Main_class extends JFrame{
    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/HHH.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1120,630);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(300,155,800,40);
        heading.setFont(new Font("Times new roman",Font.BOLD,35));
        heading.setForeground(Color.WHITE);
        img.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(300,270,150,40);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);
            }
        });
        img.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(565,270,150,40);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.BLACK);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_Employee();
                setVisible(false);
            }
        });
        img.add(view);

        JButton rem = new JButton("Remove Employee");
        rem.setBounds(440,370,150,40);
        rem.setForeground(Color.WHITE);
        rem.setBackground(Color.BLACK);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
                setVisible(false);

            }
        });
        img.add(rem);


        setSize(1120,630);
        setLocation(100,50);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main_class();

    }
}
