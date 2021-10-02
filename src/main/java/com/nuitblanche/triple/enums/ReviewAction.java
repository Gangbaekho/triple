package com.nuitblanche.triple.enums;

public enum ReviewAction {
    
    ADD("추가"),MOD("변경"),DELETE("삭제");

    private String description;

    ReviewAction(String description) {
        this.description = description;
    }
}
