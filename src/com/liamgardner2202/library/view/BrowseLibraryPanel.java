package com.liamgardner2202.library.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BrowseLibraryPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private Box mainBox, hBox1, hBox2, hBox3, hBox4, hBox5;

	private JLabel jlBookTable, jlFileTable;
	private JButton bOpenBook, bDeleteBook, bOpenFile, bDeleteFile, bSave, bSaveAndQuit;
	private JTable tBooks, tFiles;
	private DefaultTableModel model;
	private JScrollPane spBookTable, spFileTable;

	String[] bookColumns = { "Title", "Author", "Price", "Serial Number" };
	String[] fileColumns = { "Sounds", "Images", "Videos" };
	String[][] bookData = { { " ", " ", " ", " " } };
	String[][] fileData = { { " ", "", " " } };

	public BrowseLibraryPanel() {
		intWidgets();
		addWidgets();
		setBackground(new Color(194, 230, 248));
	}

	private void intWidgets() {
		mainBox = Box.createVerticalBox();

		hBox1 = Box.createHorizontalBox();
		hBox2 = Box.createHorizontalBox();
		hBox3 = Box.createHorizontalBox();
		hBox4 = Box.createHorizontalBox();
		hBox5 = Box.createHorizontalBox();

		jlBookTable = new JLabel("Showing All Books in Library");
		jlFileTable = new JLabel("Showing All Files in Book");

		bOpenBook = new JButton("Open");
		bDeleteBook = new JButton("Delete");
		bOpenFile = new JButton("Open");
		bDeleteFile = new JButton("Delete");
		bSave = new JButton("Save");
		bSaveAndQuit = new JButton("Save and Quit");
		
		model = new DefaultTableModel(bookData, bookColumns);
		tBooks = new JTable(model);
		tBooks.setPreferredScrollableViewportSize(new Dimension(328, 120));
		tBooks.setFillsViewportHeight(true);
		tBooks.getColumnModel().getColumn(0).setPreferredWidth(200);
		tBooks.getColumnModel().getColumn(1).setPreferredWidth(150);
		tBooks.setAutoCreateRowSorter(true);
		tBooks.getTableHeader().setReorderingAllowed(false);
		
		
		model = new DefaultTableModel (fileData, fileColumns);
		tFiles = new JTable(model);
		tFiles.setPreferredScrollableViewportSize(new Dimension(328, 80));
		tFiles.setFillsViewportHeight(true);
		tFiles.getColumnModel().getColumn(0).setPreferredWidth(200);
		tFiles.getColumnModel().getColumn(1).setPreferredWidth(150);
		tFiles.setAutoCreateRowSorter(true);
		tFiles.getTableHeader().setReorderingAllowed(false);
		
		spBookTable = new JScrollPane(tBooks);
		spFileTable = new JScrollPane(tFiles);
		
		spBookTable.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		spBookTable.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		spFileTable.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		spFileTable.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
	}

	private void addWidgets() {
		hBox1.add(jlBookTable);
		hBox1.add(Box.createHorizontalStrut(40));
		hBox1.add(bDeleteBook);
		hBox1.add(bOpenBook);
		
		hBox2.add(spBookTable);
		
		hBox3.add(jlFileTable);
		hBox3.add(Box.createHorizontalStrut(60));
		hBox3.add(bOpenFile);
		hBox3.add(bDeleteFile);
		
		hBox4.add(spFileTable);
		
		hBox5.add(Box.createHorizontalStrut(185));
		hBox5.add(bSave);
		hBox5.add(bSaveAndQuit);
		
		
		mainBox.add(hBox1);
		mainBox.add(Box.createHorizontalStrut(5));
		mainBox.add(hBox2);
		mainBox.add(Box.createHorizontalStrut(5));
		mainBox.add(hBox3);
		mainBox.add(Box.createHorizontalStrut(5));
		mainBox.add(hBox4);
		mainBox.add(Box.createHorizontalStrut(5));
		mainBox.add(hBox5);
		
		add(mainBox);
		
		
		
		
	}
	
}
