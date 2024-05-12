package com.inna.ui.service;

import com.inna.ui.client.BookFeignClient;
import com.inna.ui.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

private final BookFeignClient client;



    public void saveBook(String name,
                         String author,
                         int page) {
        client.saveBook(name,author,page);
    }

    public List<Book> getAll() {
        return client.getAll();
    }
}
