package com.kindsonthegenius.climateapp.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getPosts(){
        return postRepository.findAll();
    }

    public void addPost(Post post){
        postRepository.save(post);
    }

    public void updatePost(Post post){
        postRepository.save(post);
    }

    public void deletePost(int id){
        postRepository.deleteById(id);
    }
}
