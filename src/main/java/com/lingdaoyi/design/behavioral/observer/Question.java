package com.lingdaoyi.design.behavioral.observer;

/**
 * Created by lingdaoyi
 *
 * 描述：将信息传送给被观察者，
 */
public class Question {
    private String userName;

    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
