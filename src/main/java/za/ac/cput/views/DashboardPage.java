package za.ac.cput.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardPage  extends JFrame {

    JFrame frame;
    JPanel pnlNorth, pnlCenter, pnlSouth;
    JLabel lblHeading;
    Box box;
    JButton btnStaff, btnMenu, btnSupplies, btnOrders, btnReservations, btnLock, btnRestaurant;
    Font ftHead;

    public DashboardPage() {

        frame = new JFrame("Restaurant Management System");
        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();
        box = Box.createVerticalBox();
        lblHeading = new JLabel("Dashboard");
        btnStaff = new JButton("Staff");
        btnMenu = new JButton("Menu");
        btnSupplies = new JButton("Supplies");
        btnOrders = new JButton("Orders");
        btnReservations = new JButton("Reservations");
        btnRestaurant = new JButton("Restaurant Info");
        btnLock = new JButton("Lock");
        ftHead = new Font(Font.SANS_SERIF, Font.BOLD, 25);

        //pnlCenter.setSize(500, 500);
        box.setSize(500,500);
        //btnMenu.setPreferredSize(new Dimension(200, 28));

        lblHeading.setFont(ftHead);

        this.setGui();
    }

    public void setGui() {

        frame.add(BorderLayout.NORTH, pnlNorth);
        frame.add(BorderLayout.CENTER, pnlCenter);
        frame.add(BorderLayout.SOUTH, pnlSouth);

        pnlNorth.add(lblHeading);

        pnlCenter.add(box);
        box.add(Box.createRigidArea(new Dimension(0, 200)));
        btnMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnMenu.setPreferredSize(new Dimension(200, 28));
        box.add(btnMenu);
        box.add(Box.createRigidArea(new Dimension(0, 20)));
        btnReservations.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(btnReservations);
        box.add(Box.createRigidArea(new Dimension(0, 20)));
        btnOrders.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(btnOrders);
        box.add(Box.createRigidArea(new Dimension(0, 20)));
        btnStaff.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(btnStaff);
        box.add(Box.createRigidArea(new Dimension(0, 20)));
        btnSupplies.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(btnSupplies);
        box.add(Box.createRigidArea(new Dimension(0, 20)));
        btnRestaurant.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(btnRestaurant);

        pnlSouth.add(btnLock);

        btnLock.addActionListener(buttonActions());
        btnMenu.addActionListener(buttonActions());

        frame.setTitle("Dashboard");
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public ActionListener buttonActions() {

        btnMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                frame.dispose();
            }
        });

        btnReservations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ReservationPage();
                //frame.dispose();
            }
        });

        btnOrders.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OrderPage();
                frame.dispose();
            }
        });

        btnStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EmployeePage();
                frame.dispose();
            }
        });

        btnSupplies.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new supplierPage();
                frame.dispose();
            }
        });

        btnLock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                new LoginPage();
            }
        });

        btnStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                frame.dispose();
            }
        });

        btnRestaurant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new RestaurantInfoPage();
                frame.dispose();
            }
        });

        return null;
    }

    public static void main(String[] args) {
        new DashboardPage();
    }
}
