package THREAD;
//  Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.

public class BankThread {

    public static void main(String[] args) {

        BANK B1 = new BANK(10000);
        System.out.println("ACCOUNT NUMBER : " + B1.getAcc() + "\n" +
                "BALANCE :" + B1.getBal());

        System.out.println("WITHDRAW 200 ");
        B1.withdrawal(200);
        System.out.println(" BALANCE IS " + B1.getBal());
        B1.deposit(400);

        System.out.println("DEPOSIT 400 " + " BALANCE IS " + B1.getBal());
        BANK B2 = new BANK();
        System.out.println("ACCOUNT NUMBER : " + B2.getAcc() + "\n" +
                "BALANCE :" + B2.getBal());
        B2.withdrawal(200);
        System.out.println("WITHDRAW 200 " + " BALANCE IS " + B2.getBal());
        B2.deposit(400);
        System.out.println("DEPOSIT 400 " + " BALANCE IS " + B2.getBal());

        BankThread1 BA1 = new BankThread1(B1);
        BankThread1 BA2 = new BankThread1(B2);

        Thread T1 = new Thread(BA1, "BANK1");
        Thread T2 = new Thread(BA2, "BANK2");
        T1.start();
        T2.start();

    }
}




