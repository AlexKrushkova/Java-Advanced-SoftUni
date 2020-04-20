package L01Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> arrayList = new ArrayList<>(List.of(
        new Book("Food",12,"Unknown"),
        new Book("Bar",15)));

        Collections.sort(arrayList, new BookComparator());


        for (Book book:arrayList) {
            System.out.println(book.getTitle() + ":" + book.getYear());
        }
    }
}
