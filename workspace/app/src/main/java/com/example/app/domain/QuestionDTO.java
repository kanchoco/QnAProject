package com.example.app.domain;

import com.example.app.entity.Question;
import com.example.app.type.QuestionCategory;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@ToString
public class QuestionDTO {
    private String questionTitle;

    private String questionContent;

    private Long questionView;

    private String questionCategory;

    private Long questionLike;

    private String communityFilePath;

    private String communityFileName;

    private String communityFileUuid;

    private Long communityFileSize;

    private int point;

//    유저관련
    private String userNickName;

    private String userEmail;

    private String userFileName;

    private String userFilePath;

    private Long userFileSize;

    private String userFileUuid;

    private String createDate;

    private String updatedDate;

    @QueryProjection
    public QuestionDTO(String questionTitle, String questionContent, Long questionView, String questionCategory, Long questionLike, String communityFilePath, String communityFileName, String communityFileUuid, Long communityFileSize, int point, String userNickName, String userEmail, String userFileName, String userFilePath, Long userFileSize, String userFileUuid, String createDate, String updatedDate) {
        this.questionTitle = questionTitle;
        this.questionContent = questionContent;
        this.questionView = questionView;
        this.questionCategory = questionCategory;
        this.questionLike = questionLike;
        this.communityFilePath = communityFilePath;
        this.communityFileName = communityFileName;
        this.communityFileUuid = communityFileUuid;
        this.communityFileSize = communityFileSize;
        this.point = point;
        this.userNickName = userNickName;
        this.userEmail = userEmail;
        this.userFileName = userFileName;
        this.userFilePath = userFilePath;
        this.userFileSize = userFileSize;
        this.userFileUuid = userFileUuid;
        this.createDate = createDate;
        this.updatedDate = updatedDate;
    }

    public Question toEntity() {
        return Question.builder()
                .questionTitle(questionTitle)
                .questionContent(questionContent)
                .questionView(questionView)
                .questionCategory(QuestionCategory.nameOf(questionCategory))
                .questionLike(questionLike)
//                .communityFilePath(communityFilePath)

    }
}
