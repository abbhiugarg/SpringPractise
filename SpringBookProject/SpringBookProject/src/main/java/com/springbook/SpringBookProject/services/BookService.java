package com.springbook.SpringBookProject.services;

import com.springbook.SpringBookProject.entities.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private static List<Book> list1 = new ArrayList<>();

    static{
        list1.add(new Book(100,"Java Reference","Narayan"));
        list1.add(new Book(176,"Complete Web","Sundar"));
        list1.add(new Book(52,"Database Reference","Satya"));
    }

    public List<Book> getAllBooks(){
        return list1;
    }
    public Book getBookById(int id){
        Book book = null;
        try {
            book = list1.stream().filter(e -> e.getId() == id).findFirst().get();
        }
        catch (Exception e){
            System.out.println("this is an exception " + e.toString());
            e.printStackTrace();
        }
        return book;
    }

    public Book addBook(Book book){
        list1.add(book);
        return book;
    }
}
