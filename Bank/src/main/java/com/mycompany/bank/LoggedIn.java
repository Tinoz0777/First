/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

import static com.mycompany.bank.Bank.frame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hp i5
 */
public class LoggedIn {

    public static JPanel panel = new JPanel();

    public static JPanel load() {
        frame.getContentPane().removeAll();
        frame.revalidate();
        frame.repaint();
        panel.removeAll();
        panel.revalidate();
        panel.repaint();

        JLabel h = new JLabel("XXX bank management application");
        JPanel header = new JPanel();
        header.setBackground(Color.BLUE);
        header.add(h);
        frame.add(header, BorderLayout.PAGE_START);
        JButton logout = new JButton("Log Out");
        JButton viewCustomers = new JButton("View Customers");
        JButton viewUsers = new JButton("View Users");
        JButton deposit = new JButton("Customer deposit");
        JButton newAccount = new JButton("Create Account");
        JButton newUser = new JButton("Add new user");
        JButton changePassword = new JButton("Change password");
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(gbl);
        gbc.insets = new Insets(0, 40, 10, 0);
        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 0;
        logout.setPreferredSize(new Dimension(300, 25));
        panel.add(logout, gbc);

        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 1;
        viewCustomers.setPreferredSize(new Dimension(300, 25));
        panel.add(viewCustomers, gbc);

        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 2;
        viewUsers.setPreferredSize(new Dimension(300, 25));
        panel.add(viewUsers, gbc);

        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 3;
        deposit.setPreferredSize(new Dimension(300, 25));
        panel.add(deposit, gbc);

        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 4;
        newAccount.setPreferredSize(new Dimension(300, 25));
        panel.add(newAccount, gbc);

        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 5;
        newUser.setPreferredSize(new Dimension(300, 25));
        panel.add(newUser, gbc);

        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 6;
        newUser.setPreferredSize(new Dimension(300, 25));
        panel.add(changePassword, gbc);

        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.getContentPane().removeAll();
                frame.validate();
                frame.repaint();
                frame.add(Bank.homePage(),BorderLayout.CENTER);
                frame.validate();
                frame.repaint();
            }
        });
        changePassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GUI.changeView(frame, ChangePassword.load());
            }
        });
        viewCustomers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GUI.changeView(frame, ViewCustomersGUI.load());
            }
        });
        viewUsers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GUI.changeView(frame, ViewUsersGUI.load());
            }
        });
        deposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GUI.changeView(frame, DepositGUI.load());
            }
        });
        newAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                GUI.changeView(frame, CreateAccountGUI.load());
            }
        });
        newUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GUI.changeView(frame, RegisterGUI.registerPanel());
            }
        });
        return panel;
    }

}
