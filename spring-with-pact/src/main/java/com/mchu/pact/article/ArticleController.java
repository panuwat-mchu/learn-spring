package com.mchu.pact.article;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ArticleController {

    @GetMapping( path = "/articles")
    public ResponseEntity<Object> getAllArticle() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("articleId", "1234");
        return ResponseEntity.status(201).body(map);
    }
}
