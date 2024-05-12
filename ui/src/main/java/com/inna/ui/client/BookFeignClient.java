package com.inna.ui.client;

import com.inna.ui.model.Book;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@FeignClient(name = "book", url = "${feign.book.url}")
public interface BookFeignClient {

    @GetMapping("/feign/book/get-all-book")
    List<Book> getAll();

     @PostMapping("/feign/book/save-book")
    void saveBook(@RequestParam("name") String name,
                        @RequestParam("author")  String author,
                        @RequestParam("page") int page );

}
