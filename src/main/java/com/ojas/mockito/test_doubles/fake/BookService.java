package com.ojas.mockito.test_doubles.fake;

import com.ojas.mockito.fake_doubles.dummy.EmailService;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository, EmailService emailService) {
        this.bookRepository = bookRepository;
    }
    public void addBook(Book book) {
        bookRepository.save(book);
    }
    public int findNumberOfBooks(){
        return bookRepository.findall().size();
    }
}
