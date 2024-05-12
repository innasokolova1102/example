package com.inna.ui.controller;

import com.inna.ui.model.Book;
import com.inna.ui.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/book")
public class UiController {
  private final BookService bookService;



    @PostMapping()
    void saveBook(@RequestParam("name") String name,
                  @RequestParam("author")  String author,
                  @RequestParam("page") int page ){
       bookService.saveBook(name,author,page);

    }
    @GetMapping()
    List<Book> getAllBook(){
        return bookService.getAll();
    }
}
