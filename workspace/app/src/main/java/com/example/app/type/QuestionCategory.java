package com.example.app.type;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum QuestionCategory {
    EDUCATION("교육, 학문"),
    ENTERTAINMENT("엔터테인먼트"),
    SOCIETY("사회, 정치"),
    SPORTS("운동, 레저"),
    PLACE("지역&플레이스"),
    PC_COMMUNICATION("컴퓨터통신"),
    LIVING("생활"),
    ECONOMY("경제"),
    SHOPPING("쇼핑"),
    COUNSELING("고민Q&A"),
    GAME("게임"),
    HEALTH("건강"),
    TRAVEL("여행");
    final private String name;

    private QuestionCategory(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static QuestionCategory nameOf(String name){
        for (QuestionCategory category : QuestionCategory.values()){
            if(category.getName().equals(name)) {
                return category;
            }
        }
        return null;
    }

}
