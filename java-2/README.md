# 实验二学生选课模拟系统

## 实验目的

初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；

掌握面向对象的类设计方法（属性、方法）；

掌握通过构造方法实例化对象；

## 业务要求

学校人员分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。

初期为了设计简单，每名教师讲1门课程，每名学生选1门课程。

对象：

教师（姓名、编号，年龄）

学生（姓名、编号，年龄）

课程（编号、课程名称、上课地点、时间、授课教师）

## 实验要求

1.编写上述实体类以及测试主类

2.在测试主类中，实例化多个类实体，模拟

 1）教师开设某课；

 2）学生选课、退课

 3）打印学生课表信息（包括：编号、课程名称、上课地点、时间、授课教师）

3.编写实验报告。

## 实验过程

利用`ArrayList`的方法记录教师所开的课程：

```java
List<Course> Course = new ArrayList<Course>();
Course.add(new Course(0, "Java", "1234", "10月21日 8:00-10:00", teacher1));
Course.add(new Course(1, "Python", "5678", "10月21日 11:00-13:00", teacher2));
Course.add(new Course(2, "C++", "4321", "10月21日 14:00-16:00", teacher3));
Course.add(new Course(3, "JS", "8765", "10月23日 10:00-12:00", teacher4));
```

在学生类定义两个函数来完成选课和退课的操作：

```java
void SelectCourse(Course course){       // 学生选课
    courseList.add(course);
}

void ExitCourse(Course course){         // 学生退课
    courseList.remove(course);
}
```

同时再定义一个函数来进行输出学生的信息（包含课程信息和授课教师）：

```java
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
```

测试：

```java
Students student1 = new Students("张三", 2021310872, 19);
student1.SelectCourse(Course.get(0));
student1.SelectCourse(Course.get(1));
student1.SelectCourse(Course.get(2));
student1.SelectCourse(Course.get(3));

student1.ExitCourse(Course.get(1));

student1.printCourseList();

/* 输出：
* 课程号：0、课程名：Java、上课地点：1234、上课时间：10月21日 8:00-10:00、授课教师：张老师
* 课程号：2、课程名：C++、上课地点：4321、上课时间：10月21日 14:00-16:00、授课教师：王老师
* 课程号：3、课程名：JS、上课地点：8765、上课时间：10月23日 10:00-12:00、授课教师：赵老师
*/
```

## 实验总结

通过这次实验，我学会了定义类中的属性以及方法；掌握面向对象的类设计方法；掌握如何通过构造函数实例化对象。