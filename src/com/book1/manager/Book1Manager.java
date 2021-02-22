package com.book1.manager;

import com.book1.dao.Book1Dao;

public class Book1Manager {
    Book1Dao book1Dao = new Book1Dao();


    public  void getBook1() {
        book1Dao.getBook1();
        for (int i = 0; i < book1Dao.bookMainList().size(); i++) {
           System.out.println(book1Dao.bookMainList().get(i));
       }
    }


}
