import java.util.ArrayList;
import java.util.List;

class Students{
    List<Course> courseList = new ArrayList<Course>();
    String m_name;
    int m_id;
    int m_age;
    Students(String name, int id, int age){
        this.m_name = name;
        this.m_id = id;
        this.m_age = age;
    }

    void SelectCourse(Course course){       // 学生选课
        courseList.add(course);
    }

    void ExitCourse(Course course){         // 学生退课
        courseList.remove(course);
    }

    void printCourseList() {
        for (Course course : courseList) {
            System.out.println(
                    "课程号：" + course.m_id +
                            "、课程名：" + course.m_name +
                            "、上课地点：" + course.m_place +
                            "、上课时间：" + course.m_time +
                            "、授课教师：" + course.m_Teacher.m_name);
        }
    }
}

class Teachers {
    String m_name;
    int m_id;
    int m_age;

    Teachers(String name, int id, int age) {
        this.m_name = name;
        this.m_id = id;
        this.m_age = age;
    }
}

class Course {
    int m_id;
    String m_name;
    String m_place;
    String m_time;
    Teachers m_Teacher;

    Course(int id, String name, String place, String time, Teachers Teacher) {
        this.m_id = id;
        this.m_name = name;
        this.m_place = place;
        this.m_time = time;
        this.m_Teacher = Teacher;
    }
}
public class Main{
    public static void main(String[] args) {
        List<Course> Course = new ArrayList<Course>();
        Teachers teacher1 = new Teachers("张老师", 12345, 30);
        Teachers teacher2 = new Teachers("刘老师", 54321, 50);
        Teachers teacher3 = new Teachers("王老师", 87654, 40);
        Teachers teacher4 = new Teachers("赵老师", 45678, 33);
        Course.add(new Course(0, "Java", "1234", "10月21日 8:00-10:00", teacher1));
        Course.add(new Course(1, "Python", "5678", "10月21日 11:00-13:00", teacher2));
        Course.add(new Course(2, "C++", "4321", "10月21日 14:00-16:00", teacher3));
        Course.add(new Course(3, "JS", "8765", "10月23日 10:00-12:00", teacher4));

        Students student1 = new Students("张三", 2021310872, 19);
        student1.SelectCourse(Course.get(0));
        student1.SelectCourse(Course.get(1));
        student1.SelectCourse(Course.get(2));
        student1.SelectCourse(Course.get(3));

        student1.ExitCourse(Course.get(1));

        student1.printCourseList();
    }
}


