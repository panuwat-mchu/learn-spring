package com.mchu.bookstore.post;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

public class Comment {

    private int id;
    private String text;

    Comment(int id, String text) {
        this.id = id;
        this.text = text;
    }
    
}
