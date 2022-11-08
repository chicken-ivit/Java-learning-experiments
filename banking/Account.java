package banking;
public class Account {
    private double balance;     // 结余
    public Account(double bal){     // 账户
        balance = bal;
    }
    public double getBalance(){
        return balance;
    }
    public boolean deposit(double amount){     // 存款
        balance = balance + amount;
        return true;
    }
    public boolean withdraw(double amount){     // 提取
        boolean result = true;
        if ( balance < amount ){
            result = false;
        } else {
            balance = balance - amount;
        }
        return  result;
    }
}
