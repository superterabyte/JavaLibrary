package com.liamgardner2202.library.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AddBookPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private Box mainBox , hBox1 , hBox2, hBox3, hBox4, hBox5,
						hBox6, hBox7, hBox8;

	private JLabel jlISBN, jlTitle, jlAuthor, jlPrice, jlFile, jlLogDog;
	private JTextField jtISBN, jtTitle, jtAuthor, jtPrice, jtFile;
	private JButton bBrowse, bAddFile, bAddBook, bSave, bSaveAndQuit;
	private JTextArea jtaLog;
	private JScrollPane scrollPane;
	
	public AddBookPanel() {
		//super(new FlowLayout());
		initWidgets();
		addWidgets();
		setBackground(new Color(194, 230, 248));
	}
	
	private void initWidgets() {
		mainBox = Box.createVerticalBox();

		hBox1 = Box.createHorizontalBox();
		hBox2 = Box.createHorizontalBox();
		hBox3 = Box.createHorizontalBox();
		hBox4 = Box.createHorizontalBox();
		hBox5 = Box.createHorizontalBox();
		hBox6 = Box.createHorizontalBox();
		hBox7 = Box.createHorizontalBox();
		hBox8 = Box.createHorizontalBox();
		
		jlISBN = new JLabel("ISBN:      ");
		jlTitle = new JLabel("Title:      ");
		jlAuthor = new JLabel("Author:  ");
		jlPrice = new JLabel("Price:     ");
		jlFile = new JLabel("Add File:");
		jlLogDog = new JLabel("Log:");
		
		jtISBN = new JTextField(19);
		jtTitle = new JTextField(19);
		jtAuthor = new JTextField(19);
		jtPrice = new JTextField(19);
		jtFile = new JTextField(19);
		
		bBrowse = new JButton("Browse");
		bAddFile = new JButton("Add File to Book");
		bAddBook = new JButton("Add Book to Library");
		bSave = new JButton("Save");
		bSaveAndQuit = new JButton("Save&Quit");
		
		
		
		jtaLog = new JTextArea(10, 24);
		jtaLog.setEditable(false);
		
		scrollPane = new JScrollPane(jtaLog);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		
		
				
	}

	private void addWidgets() {
		hBox1.add(jlISBN);
		hBox1.add(jtISBN);
		
		hBox2.add(jlTitle);
		hBox2.add(jtTitle);
		
		hBox3.add(jlAuthor);
		hBox3.add(jtAuthor);
		
		hBox4.add(jlPrice);
		hBox4.add(jtPrice);
		
		hBox5.add(jlFile);
		hBox5.add(jtFile);
		
		hBox6.add(Box.createHorizontalStrut(61));
		hBox6.add(bBrowse);
		hBox6.add(Box.createHorizontalStrut(5));
		hBox6.add(bAddFile);
		
		hBox7.add(jlLogDog);
		hBox7.add(Box.createHorizontalStrut(98));
		hBox7.add(bAddBook);
		
		hBox8.add(Box.createHorizontalStrut(120));
		hBox8.add(bSave);
		hBox8.add(Box.createHorizontalStrut(5));
		hBox8.add(bSaveAndQuit);
		
		mainBox.add(hBox1);
		mainBox.add(Box.createVerticalStrut(5));
		mainBox.add(hBox2);
		mainBox.add(Box.createVerticalStrut(5));
		mainBox.add(hBox3);
		mainBox.add(Box.createVerticalStrut(5));
		mainBox.add(hBox4);
		mainBox.add(Box.createVerticalStrut(5));
		mainBox.add(hBox5);
		mainBox.add(Box.createVerticalStrut(5));
		mainBox.add(hBox6);
		mainBox.add(Box.createVerticalStrut(5));
		mainBox.add(hBox7);
		mainBox.add(Box.createVerticalStrut(5));
		mainBox.add(scrollPane);
		mainBox.add(Box.createVerticalStrut(5));
		mainBox.add(hBox8);
		
		add(mainBox);
		}


}
