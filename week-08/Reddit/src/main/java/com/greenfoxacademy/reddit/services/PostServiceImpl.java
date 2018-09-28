package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAllByOrderByPointDesc();
    }

    @Override
    public void submitPost(String title, String url) {
        postRepository.save(new Post(title, url));
    }

    @Override
    public void upvote(long id) {
        Post post = postRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        post.setPoint(post.getPoint() + 1);
        postRepository.save(post);
    }

    @Override
    public void downvote(long id) {
        Post post = postRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        post.setPoint(post.getPoint() - 1);
        postRepository.save(post);
    }
}
