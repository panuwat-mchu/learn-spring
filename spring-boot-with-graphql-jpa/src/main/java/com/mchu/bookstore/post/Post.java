package com.mchu.bookstore.post;

import java.util.ArrayList;

public class Post {

    protected Long id;
    protected String text;

    Post(Long id) {
        this.id = id;
        this.text = "";
        this.comments = new ArrayList<Comment>();
    }

    Post(Long id, String text, ArrayList<Comment> comments) {
        this.id = id;
        this.text = text;
        this.comments = comments;
    }

    protected ArrayList<Comment> comments;

}
