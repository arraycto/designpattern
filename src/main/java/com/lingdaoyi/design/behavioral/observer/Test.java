package com.lingdaoyi.design.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher = new Teacher("zeroToOne");

        course.addObserver(teacher);

        //业务逻辑代码
        Question question = new Question();
        question.setUserName("小丸子");
        question.setQuestionContent("Java主函数如何编写");

        course.produceQuestion(course,question);
    }
}
