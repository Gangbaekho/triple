package com.nuitblanche.triple.domain.photo;

import com.nuitblanche.triple.domain.review.Review;
import com.nuitblanche.triple.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name="REVIEW_ID")
    private Review review;

    private String photoUrl;

    @Builder
    public Photo(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void updateUser(User user){
        this.user = user;
    }

    public void updateReview(Review review){
        this.review = review;
    }
}
