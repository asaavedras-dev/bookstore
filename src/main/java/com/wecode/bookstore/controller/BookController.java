package com.wecode.bookstore.controller;

import com.wecode.bookstore.dto.BookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks(){
        BookDto bookDto = BookDto
                .builder()
                .title("My Book Title")
                .build();

        List<BookDto> bookDtos = new ArrayList<>();
        bookDtos.add(bookDto);
        return ResponseEntity.ok(bookDtos);
    }
}
