package com.ojas.mockito.test_doubles.dummy;

import com.ojas.mockito.fake_doubles.dummy.EmailService;
import com.ojas.mockito.test_doubles.fake.Book;
import com.ojas.mockito.test_doubles.fake.BookRepository;
import com.ojas.mockito.test_doubles.fake.BookService;
import com.ojas.mockito.test_doubles.fake.FakeBookRepository;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {
    @Test
    public void demoDummy() {
        BookRepository bookRepository = new FakeBookRepository();
        EmailService emailService = new DummyEmailService();

        BookService bookService = new BookService(bookRepository,emailService);

        bookService.addBook(new Book("1234","Mockito in action",200, LocalDate.now()));
        bookService.addBook(new Book("1236","Junit in action",300, LocalDate.now()));

        assertEquals(2,bookService.findNumberOfBooks());
    }
}
