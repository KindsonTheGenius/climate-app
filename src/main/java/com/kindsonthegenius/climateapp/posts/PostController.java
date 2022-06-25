package com.kindsonthegenius.climateapp.posts;

import com.kindsonthegenius.climateapp.posts.Post;
import com.kindsonthegenius.climateapp.posts.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getPosts(){
        return postService.getPosts();
    }

    @PostMapping("/posts")
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }

    @PutMapping("/posts/{id}")
    public void updatePost(@RequestBody Post post, @PathVariable("id") Integer id){
        postService.updatePost(post);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable("id") Integer id){
        postService.deletePost( id);
    }
}
