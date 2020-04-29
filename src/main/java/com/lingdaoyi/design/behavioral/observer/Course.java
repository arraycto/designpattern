package com.lingdaoyi.design.behavioral.observer;

import java.util.Observable;

/**
 * Created by lingdaoyi
 *
 * 主题对象（被观察者）
 */
public class Course extends Observable{
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName()+"在"+
                course.getCourseName()+"中提出问题："+question.getQuestionContent());
        //标记被观察者状态改变
        setChanged();
        //通知观察者
        notifyObservers(question);
    }

}
