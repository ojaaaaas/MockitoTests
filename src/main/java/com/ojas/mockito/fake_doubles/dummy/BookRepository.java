package com.ojas.mockito.fake_doubles.dummy;

import java.util.Collection;

public interface BookRepository {
    void save(Book book);

    Collection<Book> findall();
}
