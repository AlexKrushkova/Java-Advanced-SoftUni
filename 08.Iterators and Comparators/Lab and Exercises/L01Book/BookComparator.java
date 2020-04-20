package L01Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book first, Book second) {
        if(first.getYear() == second.getYear()){
            return 0;
        }
        else if(first.getYear() > second.getYear()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
