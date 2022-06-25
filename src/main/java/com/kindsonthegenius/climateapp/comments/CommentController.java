package com.kindsonthegenius.climateapp.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public List<Comment> getComments(){
        return commentService.getComments();
    }

    @PostMapping("/comments")
    public void addComment(@RequestBody Comment comment){
        commentService.addComment(comment);
    }

    @PutMapping("/comments/{id}")
    public void updateComment(@RequestBody Comment comment, @PathVariable("id") Integer id){
        commentService.updateComment(comment);
    }

    @DeleteMapping("/comments/{id}")
    public void deleteComment(@PathVariable("id") Integer id){
        commentService.deleteComment( id);
    }
}
