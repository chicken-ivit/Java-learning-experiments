package text;

import text.Teachers;

public class Course {
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