package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

    Iterable<Post> findAll();

    void submitPost (String title, String url);

    void upvote(long id);

    void downvote(long id);
}
