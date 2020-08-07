package com.mchu.graphql.book;

import com.mchu.graphql.author.Author;
import com.mchu.graphql.author.AuthorRepository;
import graphql.kickstart.tools.GraphQLResolver;

import java.util.Optional;


public class BookResolver implements GraphQLResolver<Book> {

    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Optional<Author> author(Book book) {
        return this.authorRepository.findById(book.getAuthorId());
    }

}
