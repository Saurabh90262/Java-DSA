public class acess_modifers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "sashiMaurya";
        System.out.println(myAcc.username);
        // myAcc.password = "11223344"; here password is inacessible to this class
        myAcc.setPassword("11223344");
    }
}

class BankAccount {
    public String username; // username is public and acessible to all
    private String password; // password is private and it is acessible only inside the class

    public void setPassword(String pwd) {
        password = pwd;
    }
}