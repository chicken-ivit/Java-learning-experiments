# 实验四 学生实验室勤工俭学模拟

## 实验目的

掌握系统中涉及的类的定义；

应用顶层Object类中`toString()`方法；

掌握static、final等修饰符的用法

## 实验内容

某学校给学生提供勤工俭学机会，选派部分学生参与实验室的卫生清洁工作。每个学生被分配若干间实验室，视实验室的卫生评分给予劳务费。

## 系统要求

1. 设计系统中的类；
2. 应用数组定义周数。方便赋值期间，一学期按5周计；
3. 每个学生负责的实验室数量不一定相同；
4. 对学期勤工俭学收入和纳税进行统计，求得实际收入；
5. 输出某学生的实验室清洁记录；
6. 国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑应用static、final修饰。

## 实验过程

分别定义了Students、Laboratory类。

Students类核心设计：

分别定义了汇率所需的数据，因为这些数据属于某一时期的特定固定值，与实例化对象没有关系，所以用了static final 的方法修饰。

```java
    static final int lim_rate_low = 200;
    static final int lim_rate_mid = 500;
    static final int lim_rate_high = 700;
    static final double rate_low = 0.03;
    static final double rate_mid = 0.05;
    static final double rate_high = 0.10;

    public void taxation(){
        if (this.m_cash > lim_rate_low){
            m_cash = m_cash - m_cash * rate_low;
        }
        if (this.m_cash > lim_rate_mid){
            m_cash = m_cash - m_cash * rate_mid;
        }
        if (this.m_cash > lim_rate_high){
            m_cash = m_cash - m_cash * rate_high;
        }
    }
```

Laboratory类核心设计：

应用`toString`方法返回实验室的打扫情况：

```java
public String toString(){
        return "打扫情况: " + "'" + m_name + '\'' + ", 评分=" + Arrays.toString(score_list);
    }
```

根据评分计算应得的工资。

```java
    double computeCash(){
        double cash = 0;
        for (String s : this.score_list) {
            if (Objects.equals(s, "优")) {
                cash += 100;
            }
            if (Objects.equals(s, "良")) {
                cash += 85;
            }
            if (Objects.equals(s, "合格")) {
                cash += 60;
            }
        }
```

通过在最后的main函数里进行实例化并且设置评分。最后输出情况是：

```java
/*
打扫情况: '计算机网络实验室', 评分=[优, 合格, 合格, 良, 优]
打扫情况: '组成原理实验室', 评分=[合格, 良, 合格, 优, 优]
张三：计算机网络实验室,组成原理实验室
税前:810.0
税后:671.7735
*****************
打扫情况: '计算机网络实验室', 评分=[合格, 良, 良, 良, 优]
打扫情况: '组成原理实验室', 评分=[合格, 合格, 合格, 优, 合格]
打扫情况: '大学物理实验室', 评分=[良, 合格, 良, 优, 良]
李四：计算机网络实验室,组成原理实验室,大学物理实验室
税前:1170.0
税后:970.3395000000002
*/
```

## 实验总结

通过本次的实验我学会了`toString()`的使用方法。并且学会了对于特定固定值使用final和static的修饰方法。同时对OOP有了更深刻的认识。