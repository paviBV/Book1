package com.book1.datastore;

import com.book1.entities.Book1;

import java.util.ArrayList;
import java.util.List;

public class Book1DataStore {
    List<Book1> bookMainList = new ArrayList<>();

    public void setBookMain(String id, String name, int cost) {

        Book1 bookMain = new Book1();
        bookMain.setbId(id);
        bookMain.setbName(name);
        bookMain.setbCost(cost);
        bookMainList.add(bookMain);

    }
    public  void getBook1() {
        setBookMain("B001", " Jack", 686);
        setBookMain("B002","Downning",600);
        setBookMain("B003","Raising Horizon",900);
    }

    public List<Book1> bookMainList(){
        return bookMainList;
    }
}


