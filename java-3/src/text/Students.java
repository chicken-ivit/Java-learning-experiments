package text;
import text2.people;
import java.util.ArrayList;
import java.util.List;

class Students extends people {
    List<Course> courseList = new ArrayList<Course>();

    int m_period;

    Students(String name, int id, int age, int period){
        this.m_name = name;
        this.m_id = id;
        this.m_age = age;
        this.m_period = period;
    }

    public Students() {}

    void setM_period(int period){
        m_period = period;
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

    void printStudent(){
        System.out.println(
                "姓名：" + m_name +
                "、学号：" + m_id +
                "、年龄：" + m_age +
                "、届：" + m_period
        );
    }
}

