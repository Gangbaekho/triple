package com.nuitblanche.triple.domain.review;

import com.nuitblanche.triple.domain.user.User;
import com.nuitblanche.triple.domain.photo.Photo;
import com.nuitblanche.triple.domain.place.Place;
import com.nuitblanche.triple.domain.pointhistory.PointHistory;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
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
