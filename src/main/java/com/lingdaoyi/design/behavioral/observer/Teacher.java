package com.lingdaoyi.design.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lingdaoyi
 *
 * 观察者，实现Observer接口
 */
public class Teacher implements Observer{
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * 重写update方法，具体业务场景具体对待，如入库、发送到消息
     * @param o 被观察信息
     * @param arg question信息
     */
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName+"老师的"+course.getCourseName()+"课程接收到一个"+question.getUserName()+"提交的"+question.getQuestionContent()+"问题");
    }
}
