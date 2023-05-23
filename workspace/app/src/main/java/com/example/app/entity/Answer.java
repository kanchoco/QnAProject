package com.example.app.entity;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "TBL_ANSWER")
@Getter
@ToString(exclude = {"user", "question"})
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue
    private Long answerId;

    @NotNull
    private String answerContent;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "QUESTION_ID")
    private Question question;

    private Long reportCount;

    private boolean selected;

    @Builder
    public Answer(Long answerId, String answerContent, User user, Question question, Long reportCount, boolean selected) {
        this.answerId = answerId;
        this.answerContent = answerContent;
        this.user = user;
        this.question = question;
        this.reportCount = reportCount;
        this.selected = selected;
    }
}
