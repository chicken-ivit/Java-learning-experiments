package text;
import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Course> Course = new ArrayList<>();
        Teachers teacher1 = new Teachers("张老师", 12345, 30);
        Teachers teacher2 = new Teachers("刘老师", 54321, 50);
        Teachers teacher3 = new Teachers("王老师", 87654, 40);
        Teachers teacher4 = new Teachers("赵老师", 45678, 33);
        Course.add(new Course(0, "Java", "1234", "10月21日 8:00-10:00", teacher1));
        Course.add(new Course(1, "Python", "5678", "10月21日 11:00-13:00", teacher2));
        Course.add(new Course(2, "C++", "4321", "10月21日 14:00-16:00", teacher3));
        Course.add(new Course(3, "JS", "8765", "10月23日 10:00-12:00", teacher4));

        Students student1 = new Students();
        student1.setM_name("张三");
        student1.setM_age(19);
        student1.setM_id(2021310872);
        student1.setM_period(2021);
        student1.printStudent();

        student1.SelectCourse(Course.get(0));
        student1.SelectCourse(Course.get(1));
        student1.SelectCourse(Course.get(2));
        student1.SelectCourse(Course.get(3));
        student1.ExitCourse(Course.get(1));
        student1.printCourseList();




//        FileInputStream out = new FileInputStream("E:/桌面/course.txt");



        String stuInfo = student1.getStuInfo();
        List<Course> stuCouInfo = student1.getCouInfo();
        try {
            FileOutputStream out = new FileOutputStream("E:/桌面/text.txt");
            ObjectOutputStream oout = new ObjectOutputStream(out);

            // 写入学生信息和课程信息
            oout.writeObject(stuInfo);
            for (Course course : stuCouInfo) {
                oout.writeObject(
                        "课程号：" + course.m_id +
                                "、课程名：" + course.m_name +
                                "、上课地点：" + course.m_place +
                                "、上课时间：" + course.m_time +
                                "、授课教师：" + course.m_Teacher.m_name + '\n');
            }
            oout.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/桌面/text.txt"));

            // 读取信息
            System.out.println((String) ois.readObject());
            for(int i=0;i<stuCouInfo.size();i++){
                System.out.println(ois.readObject());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }



        try {
            FileOutputStream out = new FileOutputStream("E:/桌面/text.txt");
            ObjectOutputStream oout = new ObjectOutputStream(out);

            // 退课  所退课程号为0
            student1.ExitCourse(Course.get(0));

            // 写入学生信息和课程信息
            oout.writeObject(stuInfo);
            for (Course course : stuCouInfo) {
                oout.writeObject(
                        "课程号：" + course.m_id +
                                "、课程名：" + course.m_name +
                                "、上课地点：" + course.m_place +
                                "、上课时间：" + course.m_time +
                                "、授课教师：" + course.m_Teacher.m_name + '\n');
            }
            oout.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/桌面/text.txt"));

            // 读取信息
            System.out.println((String) ois.readObject());
            for(int i=0;i<stuCouInfo.size();i++){
                System.out.println(ois.readObject());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}




