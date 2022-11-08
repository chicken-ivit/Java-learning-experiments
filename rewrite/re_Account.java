package rewrite;
public class re_Account {
    private double balance;

    public re_Account(double v) {
        balance = v;
    }


    public double save(double money){
        balance = balance + money;
        return balance;
    }
    public double withdraw(double withdraw_money){     // 提取
        balance = balance - withdraw_money;
        return balance;
    }
    public double getBalance(){
        return balance;
    }
}

