package com.nuitblanche.triple.domain;

import com.nuitblanche.triple.enums.PointType;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class PointHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "REVIEW_ID")
    private Review review;

    private Long point;
    private PointType pointType;

    @Builder
    public PointHistory(Long point, PointType pointType) {
        this.point = point;
        this.pointType = pointType;
    }

    public void updateUser(User user){
        this.user = user;
    }

}
