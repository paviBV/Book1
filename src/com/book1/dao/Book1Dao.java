package com.book1.dao;

import com.book1.datastore.Book1DataStore;
import com.book1.entities.Book1;

import java.util.List;

public class Book1Dao {
    Book1DataStore book1DataStore = new Book1DataStore();

    public  void getBook1() {
       book1DataStore.getBook1();
    }

    public List<Book1> bookMainList(){
        return book1DataStore.bookMainList();
    }
}
