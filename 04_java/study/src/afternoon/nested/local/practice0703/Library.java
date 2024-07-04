package afternoon.nested.local.practice0703;

import java.util.Scanner;

public class Library {
    Book[] books;
    int bookCount;
    static final int LIBRARY_SIZE = 4;
    Scanner sc = new Scanner(System.in);

    public Library() {
        this.books = new Book[LIBRARY_SIZE];
        bookCount = 0;
    }

    public void addBook() {
        if (bookCount  == 0) {
            System.out.println("책을 보관해주세요.");
            return;
        }
        if(bookCount < LIBRARY_SIZE) {
            System.out.println("책 제목을 입력하세요 : ");
            String title = sc.nextLine();

            System.out.println("책 저자를 입력하세요 : ");
            String author = sc.nextLine();

            this.books[bookCount] = new Book(title,author);
            bookCount++;

            System.out.println("보관된 책의 수는 : "+bookCount);
        }else{
            System.out.println("더 이상 책을 추가할 수 없습니다.");
        }
    }
    public void showBooks() {
       for(Book book : books){
           System.out.println("제목 : "+book.title + "저자 : "+ book.author);
       }
    }

    static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}