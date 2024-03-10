package THREAD;
public class BANK {
    private int ACC;
    private int Balance;
    private static int IT = 1000;

    BANK() {
        this.SetAcc_Balance(++IT, 100);
    }

    BANK(int BAl) {
        this.SetAcc_Balance(++IT, BAl);
    }

    public void SetAcc_Balance(int Acc, int Balance) {
        this.ACC = Acc;
        this.Balance = Balance;
    }

    public void SetBalance(int Balance) {
        this.Balance = Balance;
    }

    public int getAcc() {
        return ACC;
    }

    public int getBal() {
        return Balance;
    }

    public void withdrawal(int n) {

        if (Balance - n > 0) {
            Balance -= n;
            System.out.print(" WITHDRAW SUCCSESSFULL ");
        } else
            System.out.print(" WITHDRAW UNSUCCSESSFULL LOW BALANCE  ");

    }

    public void deposit(int n) {
        Balance += n;
    }

}