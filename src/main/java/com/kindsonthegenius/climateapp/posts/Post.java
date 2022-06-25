package com.kindsonthegenius.climateapp.posts;

import com.kindsonthegenius.climateapp.users.User;
import lombok.Data;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;

    @ManyToOne()
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    private int user_id;

}
