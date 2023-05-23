package com.example.app.entity;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TBL_USER")
@Getter
@ToString
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long userId;

    @NotNull
    private String userEmail;

    @NotNull
    private String userNickName;

    private String userFileName;
    private String userFilePath;
    private Long userFileSize;
    private String userFileUuid;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Question> questions;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<QuestionReply> questionReplies;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Answer> answers;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<AnswerReply> answerReplies;

    @Builder
    public User(Long userId, String userEmail, String userNickName, String userFileName, String userFilePath, Long userFileSize, String userFileUuid) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userNickName = userNickName;
        this.userFileName = userFileName;
        this.userFilePath = userFilePath;
        this.userFileSize = userFileSize;
        this.userFileUuid = userFileUuid;
    }
}
