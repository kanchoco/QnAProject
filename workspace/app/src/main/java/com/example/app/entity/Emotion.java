package com.example.app.entity;

import com.example.app.type.EmotionType;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "TBL_EMOTION")
@Getter
@ToString(exclude = {"answer", "user"})
@NoArgsConstructor
public class Emotion {
    @Id
    @GeneratedValue
    private Long emotionId;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "ANSWER_ID")
    private Answer answer;

    @NotNull
    private EmotionType emotionType;



}
