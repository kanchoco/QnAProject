package com.example.app.entity;

import com.example.app.type.QuestionCategory;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "TBL_QUESTION")
@Getter
@ToString(exclude = "user")
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue
    private Long questionId;

    @NotNull
    private String questionTitle;

    @NotNull
    private String questionContent;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @NotNull
    private Long questionView;

    @NotNull
    @Enumerated(EnumType.STRING)
    private QuestionCategory questionCategory;

    private Long questionLike;

    private Long reportCount;

    private int point;

    private boolean selectAnswer;

    private boolean temporary;

    private boolean privateCheck;

    @Builder

    public Question(String questionTitle, String questionContent, User user, Long questionView, QuestionCategory questionCategory, Long questionLike, Long reportCount, int point, boolean selectAnswer, boolean temporary, boolean privateCheck) {
        this.questionTitle = questionTitle;
        this.questionContent = questionContent;
        this.user = user;
        this.questionView = questionView;
        this.questionCategory = questionCategory;
        this.questionLike = questionLike;
        this.reportCount = reportCount;
        this.point = point;
        this.selectAnswer = selectAnswer;
        this.temporary = temporary;
        this.privateCheck = privateCheck;
    }
}
