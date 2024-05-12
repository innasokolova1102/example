package com.inna.core.feign;

import com.inna.core.repo.Book;
import com.inna.core.repo.BookDto;
import com.inna.core.repo.BookMapper;
import com.inna.core.repo.BookRepo;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(path = "/feign/book")
@RequiredArgsConstructor
public class BookFeignController {
    private final BookRepo repo;


    @GetMapping(path = "/get-all-book")
    @ResponseBody
    public List<BookDto> getWeatherDay() {
        return repo.findAll()
                .stream()
                .map(BookMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }
    @PostMapping(path = "/save-book")
    @ResponseBody
    public void saveBook(@RequestParam("name") String name,
                         @RequestParam("author")  String author,
                         @RequestParam("page") int page ) {
         repo.save(new Book(name,author,page));

    }
}
