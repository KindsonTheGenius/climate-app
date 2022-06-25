package com.kindsonthegenius.climateapp.comments;

import com.kindsonthegenius.climateapp.comments.Comment;
import com.kindsonthegenius.climateapp.comments.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getComments(){
        return commentRepository.findAll();
    }

    public void addComment(Comment comment){
        commentRepository.save(comment);
    }

    public void updateComment(Comment comment){
        commentRepository.save(comment);
    }

    public void deleteComment(int id){
        commentRepository.deleteById(id);
    }
}
