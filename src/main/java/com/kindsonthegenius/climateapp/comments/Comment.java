package com.kindsonthegenius.climateapp.comments;

import com.kindsonthegenius.climateapp.posts.Post;
import com.kindsonthegenius.climateapp.users.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Comment {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private int content;

    @ManyToOne
    @JoinColumn(name="user_id", insertable = false, updatable = false)
    private User user;
    private int user_id;

    @ManyToOne
    @JoinColumn(name = "post_id", insertable = false, updatable = false)
    private Post post;
    private int post_id;
}
