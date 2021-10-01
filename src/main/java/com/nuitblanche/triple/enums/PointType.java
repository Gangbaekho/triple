package com.nuitblanche.triple.enums;

public enum PointType {

    TEXT("텍스트"),PHOTO("사진");

    private String description;

    PointType(String description) {
        this.description = description;
    }
}
