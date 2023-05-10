package com.main;

import java.util.Scanner;

import com.book.Book;
import com.book.FictionBook;
import com.book.NonFictionBook;
import com.book.ReferenceBook;

public class Program {
	static Scanner sc = new Scanner(System.in);
	private static Book[] arr = new Book[3];
	private static Book[] getArray() {
		arr[0] = new FictionBook();
		arr[1] = new NonFictionBook();
		arr[2] = new ReferenceBook();
		//arr[3] = new FictionBook();
		//arr[4] = new NonFictionBook();
		return arr;
	}

	private static void acceptRecord(Book[] arr2) {
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Title : ");
			arr[index].setTitle(sc.next());                            

			System.out.println("Author : ");
			arr[index].setAuthor(sc.next());

			System.out.println("Publisher : ");
			arr[index].setPublisher(sc.next());

			System.out.println("Number of pages : ");
			arr[index].setPages(sc.nextInt());

			if (arr[index] instanceof FictionBook) {
				FictionBook fb = (FictionBook) arr[index]; //DOWNCASTING
				
				System.out.println("Genre : ");
				
				fb.setGenre(sc.next());
				//fb.setPrice(fb.getPages()*1);
				fb.calculatePrice();
			
			}else if(arr[index] instanceof NonFictionBook) {
				NonFictionBook nfb=(NonFictionBook)arr[index];
				System.out.println("Subject : ");
				
				nfb.setSubject(sc.next());
				nfb.setPrice(nfb.getPages()*1);
				nfb.calculatePrice();
			}else {
				ReferenceBook rb=(ReferenceBook)arr[index];
				System.out.println("Edition : ");
				rb.setEdition(sc.nextInt());
				rb.setPrice(rb.getPages()*1);
				rb.calculatePrice();
			}
			//arr[index].calculatePrice();     
		}
	}

	private static void printRecord(Book[] arr2) {
		for(Book book:arr) {      
			System.out.println(book);
	}
}
	
	
	public static int menuList() {
		System.out.println("0.Exit.");
		System.out.println("1.Accept Record.");
		System.out.println("2.Print Record.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Book[] arr = Program.getArray();
		int choice;
		while ((choice = Program.menuList()) != 0) {
			switch (choice) {
			case 1:
				Program.acceptRecord(arr);
				break;
			case 2:
				Program.printRecord(arr);
				break;
			}
		}
	}
}
