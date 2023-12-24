package ru.mirea.lab24.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorFrame extends JFrame {
    private IDocument currentDocument;
    private ICreateDocument documentFactory;

    private JTextArea textArea;

    public EditorFrame(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;

        // Создаем меню
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        getContentPane().add(scrollPane, BorderLayout.CENTER);

        saveMenuItem.addActionListener(e -> {
            if (currentDocument != null) {
                String textContent = textArea.getText();
                ((TextDocument) currentDocument).setContent(textContent);

                // currentDocument.save(filePath);
            }
        });

        newMenuItem.addActionListener(e -> {
            currentDocument = documentFactory.createNew();
            textArea.setText("");
        });

        openMenuItem.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(EditorFrame.this);
            if (option == JFileChooser.APPROVE_OPTION) {
                currentDocument = documentFactory.createOpen(fileChooser.getSelectedFile().getAbsolutePath());
            }
        });

        saveMenuItem.addActionListener(e -> {
            if (currentDocument != null) {
            }
        });

        exitMenuItem.addActionListener(e -> System.exit(0));

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        // Остальная логика окна редактора
        // ...
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CreateTextDocument textDocumentFactory = new CreateTextDocument();
                EditorFrame editorFrame = new EditorFrame(textDocumentFactory);
                editorFrame.setSize(800, 600);
                editorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                editorFrame.setVisible(true);
            }
        });
    }
}