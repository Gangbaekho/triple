package com.nuitblanche.triple.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@NoArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "PLACE_ID")
    private Place place;

    @OneToMany(mappedBy = "review")
    private List<Photo> photos = new ArrayList<>();

    @OneToMany(mappedBy = "review")
    private List<PointHistory> pointHistories = new ArrayList<>();

    private String content;

    public void updateUser(User user){
        this.user = user;
    }

    public void updatePlace(Place place){
        this.place = place;
    }

}
