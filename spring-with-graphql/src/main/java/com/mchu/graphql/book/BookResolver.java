package com.mchu.graphql.book;

import com.mchu.graphql.author.Author;
import com.mchu.graphql.author.AuthorRepository;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.schema.DataFetchingEnvironment;
import org.dataloader.DataLoader;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;


public class BookResolver implements GraphQLResolver<Book> {

    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

//    public Optional<Author> author(Book book) {
//        return this.authorRepository.findById(book.getAuthorId());
//    }

    // Use DataLoader
    public CompletableFuture<Author> author(Book book, DataFetchingEnvironment dfe) {
        final DataLoader<Long, Author> userDataloader =
                dfe.getDataLoaderRegistry().getDataLoader("authorDataLoader");

        return userDataloader.load(book.getAuthorId());
    }

}
