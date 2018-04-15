package com.liamgardner2202.library.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Library implements Serializable  {
	

	private static final long serialVersionUID = 1L;
	
	private List<Book> collection;
	
	public Library(){
		collection = new ArrayList<Book>();
	}
	public void addBook(Book book){
		collection.add(book);
	}
	
	public Book getBookByname (String name) {
		Book v = null;
		Iterator<Book> i = collection.iterator();
		while(i.hasNext()) {
			v =i.next();
			if(v.getTitle().toLowerCase().contentEquals(name.toLowerCase())){
				return v;
			}
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		String total = "\n";
		/*
		for (int i=0; i<collection.size(); i++){
			Book b = collection.get(i);
			total = total + b.toString();
		}
		*/
		Iterator<Book> i = collection.iterator ();
		while(i.hasNext()){
			Book b = (Book)i.next();
			total = total + b.toString();
		}
		return total;
	}
}

