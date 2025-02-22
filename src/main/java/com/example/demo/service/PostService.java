package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@Service
public class PostService {

    private static List<Post> posts = new ArrayList<>();

    // Инициализация стартовыми постами
    static {
        posts.add(new Post("Первый пост", 15, new Date()));
        posts.add(new Post("Второй пост", 29, new Date()));
        posts.add(new Post("Третий пост", 8, new Date()));
    }

    public static List<Post> listAllPosts() {
        return posts;
    }

    public static void create(String text) {

        Post newPost = new Post();
        newPost.setText(text);
        newPost.setLikes(0);
        newPost.setCreationDate(new Date());

        posts.add(newPost);
    }
}
