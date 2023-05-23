package com.example.app.type;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum EmotionType {
    LIKE("좋아요"),
    INFORMATIVE("유익해요"),
    FUNNY("재밌어요"),
    OPPOSITE("동의못해요"),
    ADVERTISEMENT("광고같아요");
    final private String name;

    private EmotionType(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static EmotionType nameOf(String name){
        for (EmotionType category : EmotionType.values()){
            if(category.getName().equals(name)) {
                return category;
            }
        }
        return null;
    }

}
