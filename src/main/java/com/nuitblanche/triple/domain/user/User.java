package com.nuitblanche.triple.domain.user;

import com.nuitblanche.triple.domain.photo.Photo;
import com.nuitblanche.triple.domain.pointhistory.PointHistory;
import com.nuitblanche.triple.domain.review.Review;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
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
