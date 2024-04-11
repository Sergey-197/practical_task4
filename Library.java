import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book<?>> availableBooks = new ArrayList<>();
    private List<Book<?>> issuedBooks = new ArrayList<>();

    public void addBook(Book<?> book) {
        availableBooks.add(book);
        System.out.println(book + " добавлена в библиотеку.");
    }

    public boolean issueBook(Book<?> book) {
        if (availableBooks.remove(book)) {
            issuedBooks.add(book);
            System.out.println(book + " выдана.");
            return true;
        } else {
            System.out.println(book + " не найдена в библиотеке.");
            return false;
        }
    }

    public void printIssuedBooks() {
        if (issuedBooks.isEmpty()) {
            System.out.println("Нет выданных книг.");
        } else {
            System.out.println("Выданные книги:");
            issuedBooks.forEach(System.out::println);
        }
    }
}