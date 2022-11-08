# 实验三 基于继承关系改进学生选课模拟系统

## 实验目的

掌握权限访问控制修饰符的使用；

掌握继承的使用。

## 业务要求

1. 保持实验二的代码和`readme`版本不变；
2. 新建代码仓库，在实验二代码的基础上完成本次实验；
3. 业务过程同实验二，但在类的设计上，采用父类-子类的继承关系定义。
4. 测试实体类分别存放于不同的package中，验证权限访问控制、继承后属性及方法的可见性。

## 实验要求

提交源程序到`gitee`或`github`

写实验报告文件（`readme.md`），体现本次实验在实验二基础上的改进

## 实验过程

在本次实验中，我将学生类和老师类共同的属性（名字，学工号，年龄）提出来放在来`people`类里面，并且用学生类和老师类继承`people`类拿到共同的成员属性。

并且为了测试不同包的类继承关系，我把`people`类放到了`text2`包里，其余放到了`text`包。

```java
package text2;

public class people {
        public String m_name;
        public int m_id;
        public int m_age;
}
```

并且在people类中定义了三个函数用来设置姓名，学工号，年龄：

```java
public void setM_name(String name){
	if (name == ""){
		m_name = "无名氏";
	}else
		m_name = name;
}
public void setM_id(int id){
	m_id = id;
	}
public void setM_age(int age) {
	m_age = age;
}
```

在学生类中,通过继承方法定义，并且增加了m_period属性来表示学生是哪届的：

```java
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
```

教师类方法如上继承定义。

最后在Main函数中调用父类中的函数声明对象来更深入的理解继承关系：

```java
Students student1 = new Students();
student1.setM_name("张三");
student1.setM_age(19);
student1.setM_id(2021310872);
student1.setM_period(2021);
student1.printStudent();
```

输出结果：

```java
/*
*姓名：张三、学号：2021310872、年龄：19、届：2021
*课程号：0、课程名：Java、上课地点：1234、上课时间：10月21日 8:00-10:00、授课教师：张老师
*课程号：2、课程名：C++、上课地点：4321、上课时间：10月21日 14:00-16:00、授课教师：王老师
*课程号：3、课程名：JS、上课地点：8765、上课时间：10月23日 10:00-12:00、授课教师：赵老师
*/
```

## 实验总结

通过这次实验，我学会了类的继承关系，了解到了通过继承可以提高代码复用率，节省重复声明的开销，并且学会了，不同包的类之间的继承关系。对类继承有了基本的认识。