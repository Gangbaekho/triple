package com.nuitblanche.triple.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;

    @OneToMany(mappedBy = "user")
    private List<Review> review = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Photo> photos = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<PointHistory> pointHistories = new ArrayList<>();

    private Long point;

    @Builder
    public User(String username, Long point) {
        this.username = username;
        this.point = point;
    }
}
