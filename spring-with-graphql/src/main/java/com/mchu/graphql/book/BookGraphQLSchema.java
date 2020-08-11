package com.mchu.graphql.book;

import com.mchu.graphql.Query;
import com.mchu.graphql.author.AuthorRepository;
import com.mchu.graphql.directives.UppercaseDirective;
import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BookGraphQLSchema {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public BookGraphQLSchema(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Bean
    GraphQLSchema schema() {
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .directive("uppercase", new UppercaseDirective())
                .resolvers(new Query(this.bookRepository), new BookResolver(this.authorRepository))
                .build()
                .makeExecutableSchema();
    }

}
