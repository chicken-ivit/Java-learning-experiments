package rewrite;

public class re_Customer {
    private re_Account account;
    private String m_firstName;
    private String m_lastName;
    private String m_sex;
    public re_Customer(String firstName, String lastName, String sex){
        m_firstName = firstName;
        m_lastName = lastName;
        m_sex = sex;
    }
    public String getM_firstName(){ return m_firstName;}
    public String getM_lastName(){ return m_lastName;}
    public String getM_sex(){ return m_sex;}
    public void setAccount(re_Account acct){
        account = acct;
    }

    public re_Account getAccount(){
        return account;
    }

}

