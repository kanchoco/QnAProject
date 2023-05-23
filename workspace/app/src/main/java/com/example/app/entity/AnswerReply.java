package com.example.app.entity;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "TBL_QUESTION_REPLY")
@Getter
@ToString(exclude = {"question", "user"})
@NoArgsConstructor
public class AnswerReply {
    @Id
    @GeneratedValue
    private Long answerReplyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QUESTION_ID")
    private Question question;

    @NotNull
    private String replyContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    private Long reportCount;

    @Builder
    public AnswerReply(User user, String replyContent){
        this.user = user;
        this.replyContent = replyContent;
    }

}
