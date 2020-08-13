package com.zjq.openclose;

/**
 * Created by zjq. 开闭原则
 */
public class OpenCloseTest {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(232, "【社会大学】Java架构师专题课", 11800D);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + javaCourse.getId() +
                "\n课程名称:《" + javaCourse.getName() + "》" +
                "\n原价:" + javaCourse.getPrice() + "元" +
                "\n折后价:" + javaCourse.getDiscountPrice() + "元");

//        ICourse iCourse = new JavaDiscountCourse(232, "【社会大学】Java架构师专题课", 11800D);
//        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
//        System.out.println("课程ID:" + javaCourse.getId() +
//                "\n课程名称:《" + javaCourse.getName() + "》" +
//                "\n原价:" + javaCourse.getOriginPrice()  + "元" +
//                "\n折后价:" + javaCourse.getPrice() + "元");

    }
}
