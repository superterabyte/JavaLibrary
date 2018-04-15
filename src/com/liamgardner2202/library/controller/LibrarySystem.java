package com.liamgardner2202.library.controller;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.liamgardner2202.library.view.LibraryInterface;

public class LibrarySystem { //implements ChangeListener 

	private LibraryInterface screen;

	public LibrarySystem() {
		screen = new LibraryInterface("Liam's Library system");
		screen.getJTabbedPane();//.addChangeListener(this);
		screen.setVisible(true);
	}

/*	@Override // Called when tab changes
	public void stateChanged(ChangeEvent arg0) {
		// from add book tab to the browse library tab
		if (screen.getJTabbedPane().getSelectedIndex() == 1) {
			screen.getJTabbedPane().setTitleAt(1,
					screen.getFiller() + screen.getFiller() + "  Browse Library  " + screen.getFiller());

			

		} else { // from browse library tab to add book tab
			screen.getJTabbedPane().setTitleAt(0, "   Add Book " + screen.getFiller() + screen.getFiller());
			

		}

	}
	*/

}