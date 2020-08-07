package com.mchu.graphql;

import com.mchu.graphql.book.BookRepository;
import com.mchu.graphql.book.BookResolver;
import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWithGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWithGraphqlApplication.class, args);
    }

//      @Bean
//    GraphQLSchema schema() {
//        return GraphQLSchema.newSchema()
//                .query(GraphQLObjectType.newObject()
//                        .name("query")
//                        .field(field -> field
//								.name("test")
//                                .type(Scalars.GraphQLString)
//                        )
//                        .build())
//                .build();
//    }

//    @Bean
//    GraphQLSchema schema() {
//
//        BookRepository bookRepository = null;
//
//        return SchemaParser.newParser()
//                .file("schema.graphqls")
//                .resolvers(new Query(bookRepository), new BookResolver())
//                .build()
//                .makeExecutableSchema();
//    }
}
