# 实验六 学生选课模拟系统之文件输入输出

## 实验目的

掌握文件输入输出；

掌握对象序列化方法。

## 业务要求

在实验三（学生选课模拟系统）的基础上，利用文件保存选课结果，过程如下：

1.采用对象序列化的`writeObject`方法把选课结果存到硬盘文件系统中；

2.采用对象序列化的`readObject`方法从文件中恢复对象，并操作学生的选课课表，实现退课操作。

3.打印课程对象信息，采用覆盖定义`toString（）`方法的方式。

## 主要代码

将信息写入文件：

```java
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
            
```

将写好的文件读取并输出：

```java
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/桌面/text.txt"));
            // 读取信息
            System.out.println((String) ois.readObject());
            for(int i=0;i<stuCouInfo.size();i++){
                System.out.println(ois.readObject());
            }
        }
```

## 实验总结

通过这次实验，我学会了如何写入和读取文件，并且了解了不同对象在处理时需要注意的问题。