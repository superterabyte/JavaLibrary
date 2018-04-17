package com.liamgardner2202.library.view;


import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class LibraryInterface extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private AddBookPanel abp;
	private BrowseLibraryPanel blp;
	private JTabbedPane jtp;
	private String filler;
	
	public LibraryInterface(String title) {
		super(title);
		jtp = new JTabbedPane();
		abp = new AddBookPanel();
		blp = new BrowseLibraryPanel();
		
		filler = "      "; // 7 spaces
		jtp.addTab(filler + filler + "  Add Book " + filler + filler + filler, abp);
		jtp.addTab(filler + filler + "  Browse Library  " + filler + filler + filler, blp);
		
		//edit
		
		add(jtp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(500, 500);
		setResizable(false);
		
	}
	
	public AddBookPanel getAddBookPanel() {
		return abp;
	}
	
	public BrowseLibraryPanel getBrowseLibraryPanel() {
		return blp;
	}
	
	public JTabbedPane getJTabbedPane() {
		return jtp;
	}
	
	public String getFiller() {
		return filler;
	}
//entered for commit
}
