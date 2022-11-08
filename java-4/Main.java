import java.util.Arrays;
import java.util.Objects;


class Students{
    String m_name;
    double m_cash;
    static final int lim_rate_low = 200;
    static final int lim_rate_mid = 500;
    static final int lim_rate_high = 700;

    static final double rate_low = 0.03;
    static final double rate_mid = 0.05;
    static final double rate_high = 0.10;
    Students(String name){
        this.m_name = name;
    }

    public void add_cash(double num){
        this.m_cash = m_cash + num;
    }
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
}

class Laboratory{
    public String m_name;
    public String[] score_list;

    public String toString(){
        return "打扫情况: " + "'" + m_name + '\'' + ", 评分=" + Arrays.toString(score_list);
    }


    Laboratory(String name, String[]score_list){
        this.m_name = name;
        this.score_list = score_list;
    }
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
        return cash;
    }


}

public class Main {
    public static void main(String[] args) {
        // 学生
        Students stu1 = new Students("张三");

        // 打扫情况
        String[] stu1_lab1_score_list = new String[]{"优", "合格", "合格", "良", "优"};
        String[] stu1_lab2_score_list = new String[]{"合格", "良", "合格", "优", "优"};

        // 打扫教室
        Laboratory stu1_lab1 = new Laboratory("计算机网络实验室", stu1_lab1_score_list);
        Laboratory stu1_lab2 = new Laboratory("组成原理实验室", stu1_lab2_score_list);

        // 输出打扫情况
        System.out.println(stu1_lab1);
        System.out.println(stu1_lab2);

        // 计算应得工资 （税前）
        double stu1_cash_of_lab1 = stu1_lab1.computeCash();
        double stu1_cash_of_lab2 = stu1_lab2.computeCash();

        // 保存工资
        stu1.add_cash(stu1_cash_of_lab1);
        stu1.add_cash(stu1_cash_of_lab2);

        // 输出信息
        System.out.println("张三：" + stu1_lab1.m_name + "," + stu1_lab2.m_name);
        System.out.println("税前:" + stu1.m_cash);

        // 计算税率后 输出信息
        stu1.taxation();
        System.out.println("税后:" + stu1.m_cash);


        System.out.println("*****************");


        // 学生
        Students stu2 = new Students("李四");

        // 打扫情况
        String[] stu2_lab1_score_list = new String[]{"合格", "良", "良", "良", "优"};
        String[] stu2_lab2_score_list = new String[]{"合格", "合格", "合格", "优", "合格"};
        String[] stu2_lab3_score_list = new String[]{"良", "合格", "良", "优", "良"};

        // 打扫教室
        Laboratory stu2_lab1 = new Laboratory("计算机网络实验室", stu2_lab1_score_list);
        Laboratory stu2_lab2 = new Laboratory("组成原理实验室", stu2_lab2_score_list);
        Laboratory stu2_lab3 = new Laboratory("大学物理实验室", stu2_lab3_score_list);

        // 输出打扫情况
        System.out.println(stu2_lab1);
        System.out.println(stu2_lab2);
        System.out.println(stu2_lab3);

        // 计算应得工资 （税前）
        double stu2_cash_of_lab1 = stu2_lab1.computeCash();
        double stu2_cash_of_lab2 = stu2_lab2.computeCash();
        double stu2_cash_of_lab3 = stu2_lab3.computeCash();

        // 保存工资
        stu2.add_cash(stu2_cash_of_lab1);
        stu2.add_cash(stu2_cash_of_lab2);
        stu2.add_cash(stu2_cash_of_lab3);

        // 输出信息
        System.out.println("李四：" + stu2_lab1.m_name + "," + stu2_lab2.m_name + "," + stu2_lab3.m_name);
        System.out.println("税前:" + stu2.m_cash);

        // 计算税率后 输出信息
        stu2.taxation();
        System.out.println("税后:" + stu2.m_cash);
    }
}
