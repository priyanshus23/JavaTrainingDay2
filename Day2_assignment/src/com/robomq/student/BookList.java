package com.robomq.student;

import java.util.ArrayList;
import java.util.Iterator;


public class BookList {
	public static void main(String[] args) {
		ArrayList<Book> books=new ArrayList<Book>();
		
		books.add(new Book(1,"Book1","Au1","Pu1",5));
		books.add(new Book(2,"Book2","Au2","Pu2",3));
		books.add(new Book(5,"Book3","Au3","Pu3",23));
		books.add(new Book(4,"Book4","Au4","Pu4",7));
		books.add(new Book(3,"Book5","Au5","P5",34));
		SortByID s=new SortByID();
		books.sort(s);
		System.out.println(books);
		System.out.println("\nSorted By Book ID \n");
		
		
		Iterator it=books.iterator();
		
		
		while(it.hasNext())
		{
			
			
			
		}
}
}
