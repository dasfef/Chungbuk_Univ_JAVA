package day04;

import java.util.Scanner;

public class BookArr {
	
	public static void main(String[] args) {
		Book [] book = new Book[2];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < book.length; i++) {
			System.out.print("제목 >> ");
			String title = scan.nextLine();
			System.out.print("작가 >> ");
			String author = scan.nextLine();
			book[i] = new Book(title, author);
		}
		
		for (int i = 0; i < book.length; i++) {
			System.out.println("(" + book[i].title + ", " + book[i].author + ")");
			System.out.println(book[i]);
		}
	}

}
