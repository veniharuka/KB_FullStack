package afternoon.nested.local.practice0703;



public class Library {
    Book[] books;
    int bookCount;
    static final int LIBRARY_SIZE = 4;

    public Library() {
        this.books = new Book[LIBRARY_SIZE];
        bookCount = 0;
    }

    public void addBook() {
        if(bookCount == LIBRARY_SIZE) {
            System.out.println("더 이상 책을 보관할 수 없습니다.");
        }else {
            books[bookCount] = book;
        }
    }
    public void showBooks() {
        if(bookCount == 0) {
            System.out.println("보관된 책이 없습니다.");
        }else{
            System.out.println("보관된 책의 수는 :"+books[bookCount - 1].toString());
            System.out.print("제목 : "+ books[bookCount - 1].title);
            System.out.print("저자 : "+ books[bookCount - 1].author);
        }
    }

    private class Book {
        String title;
        String author;
    }

}
