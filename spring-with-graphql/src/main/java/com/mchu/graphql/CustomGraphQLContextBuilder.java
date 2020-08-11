package com.mchu.graphql;

import com.mchu.graphql.author.Author;
import com.mchu.graphql.author.AuthorRepository;
import graphql.kickstart.execution.context.DefaultGraphQLContext;
import graphql.kickstart.execution.context.GraphQLContext;
import graphql.kickstart.servlet.context.DefaultGraphQLServletContext;
import graphql.kickstart.servlet.context.DefaultGraphQLWebSocketContext;
import graphql.kickstart.servlet.context.GraphQLServletContextBuilder;
import org.dataloader.DataLoader;
import org.dataloader.DataLoaderRegistry;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
import javax.websocket.server.HandshakeRequest;
import java.util.concurrent.CompletableFuture;

@Component
public class CustomGraphQLContextBuilder implements GraphQLServletContextBuilder {

    //    private final DataLoader authorDataLoader;
    private final AuthorRepository authorRepository;

    public CustomGraphQLContextBuilder(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
        //this.authorDataLoader = authorDataLoader;
    }

    @Override
    public GraphQLContext build(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return DefaultGraphQLServletContext.createServletContext()
                .with(httpServletRequest)
                .with(httpServletResponse)
                .with(buildDataLoaderRegistry())
                .build();
    }

    @Override
    public GraphQLContext build(Session session, HandshakeRequest handshakeRequest) {
        return DefaultGraphQLWebSocketContext.createWebSocketContext()
                .with(session)
                .with(handshakeRequest)
                .with(buildDataLoaderRegistry())
                .build();
    }

    @Override
    public GraphQLContext build() {
        return new DefaultGraphQLContext();
    }

    private DataLoaderRegistry buildDataLoaderRegistry() {
        DataLoaderRegistry registry = new DataLoaderRegistry();
//        registry.register("authorDataLoader", authorDataLoader);
        registry.register("authorDataLoader",
                new DataLoader<Long, Author>(authorIds ->
                        CompletableFuture.supplyAsync(() ->
                                authorRepository.findByIdIn(authorIds)
                        )
                )
        );
        return registry;
    }


}
