package com.ojas.mockito.test_doubles.fake;

import java.util.Collection;

public interface BookRepository {
    void save(Book book);

    Collection<Book> findall();
}
