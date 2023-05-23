package com.example.app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@ToString
public class AnswerDTO {
    String answerTitle;

    String answerContent;




}
