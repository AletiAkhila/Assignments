public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1000.0);
        System.out.println("The Current Balance in your Account is " + account.getBalance());
        account.debit(200);
        System.out.println(account.getBalance());
        account.debit(2000);
        System.out.println("Final Balance in your account is: " + account.getBalance());
    }
}
