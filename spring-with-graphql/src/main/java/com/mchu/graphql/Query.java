package com.mchu.graphql;

import com.mchu.graphql.book.Book;
import com.mchu.graphql.book.BookRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;

import java.util.List;
import java.util.Optional;

public class Query implements GraphQLQueryResolver {

    private final BookRepository bookRepository;

    public Query(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> books(){
        return this.bookRepository.findAll();
    }

    public Optional<Book> bookById(Long id) { return this.bookRepository.findById(id); }

}
