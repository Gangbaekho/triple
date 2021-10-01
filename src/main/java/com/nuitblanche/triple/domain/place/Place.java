package com.nuitblanche.triple.domain.place;

import com.nuitblanche.triple.domain.review.Review;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String placename;

    @OneToMany(mappedBy = "place")
    private List<Review> review = new ArrayList<>();

    @Builder
    public Place(String placename) {
        this.placename = placename;
    }
}
