package com.mchu.graphql;

import com.mchu.graphql.book.Book;
import com.mchu.graphql.book.BookRepository;
import com.mchu.graphql.book.BookResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class Query implements GraphQLQueryResolver {

    private final BookRepository bookRepository;

    public Query(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> books(){
        return this.bookRepository.findAll();
    }

}
