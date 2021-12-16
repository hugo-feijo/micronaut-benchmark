package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Controller("/book")
public class BookController {
    private static Logger logger = LoggerFactory.getLogger(BookController.class);

    protected final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Get
    public List<Book> findAllBooks() {
        logger.info("Finding Books");
        return (List<Book>) bookRepository.findAll();
    }
}
