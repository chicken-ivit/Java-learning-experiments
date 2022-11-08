package rewrite;
import rewrite.*;

public class Test {
    public static void main(String[] args) {
        re_Customer customer;
        re_Account account;

        customer = new re_Customer("金", "英诺", "male");
        System.out.println( "name:" +
                            customer.getM_firstName() + " " +
                            customer.getM_lastName() + "\nsex:" +
                            customer.getM_sex());
        customer.setAccount(new re_Account(1000.00));
        account = customer.getAccount();
        System.out.println(account.getBalance());
        account.save(123.32);
        System.out.println(account.getBalance());
        account.withdraw(432.11);
        System.out.println(account.getBalance());

    }
}