package ru.mirea.lab15.FileProgram;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class FileProgram {

    JTextArea textArea = new JTextArea();

    public static void main(String[] args) {
        JFrame frame = new JFrame("FileMenu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        JMenu editSubMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem pasteItem = new JMenuItem("Paste");
        editSubMenu.add(copyItem);
        editSubMenu.add(cutItem);
        editSubMenu.add(pasteItem);
        editMenu.add(editSubMenu);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JTextArea textArea = new JTextArea();
        panel.add(textArea);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        panel.add(button1);
        panel.add(button2);

        frame.add(panel);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Pressed button 1");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Pressed button 2");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        copyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textArea.getText();
                Clipboard clip = Toolkit.getDefaultToolkit()
                        .getSystemClipboard();
                StringSelection strse1 = new StringSelection(str);
                clip.setContents(strse1, strse1);
            }
        });
        cutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textArea.getText();
                Clipboard clip = Toolkit.getDefaultToolkit()
                        .getSystemClipboard();
                StringSelection strse1 = new StringSelection(str);
                clip.setContents(strse1, strse1);
                textArea.setText(null);
            }
        });
        pasteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Clipboard clipboard = toolkit.getSystemClipboard();
                try {
                    String actualCopedText = (String)clipboard.getData(DataFlavor.stringFlavor);
                    textArea.setText(textArea.getText() + actualCopedText);
                } catch (UnsupportedFlavorException | IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        helpMenu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                JOptionPane.showMessageDialog(null, "There could be an info!", "alert", JOptionPane.ERROR_MESSAGE);
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
        frame.setVisible(true);
    }
}
