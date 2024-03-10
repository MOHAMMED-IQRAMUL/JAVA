package THREAD;

class BankThread1 implements Runnable {

    int[] Depo = { 100, 200, 300, 400, 500 };
    int[] WidT = { 200, 400, 600, 800, 100 };
    private BANK BK;

    public BankThread1(BANK A) {
        this.BK = A;
    }

    @Override
    public void run() {
        try {
            for (int I = 0; I < 5; I++) {

                System.out.println("WITHDRAW " + WidT[I]);
                BK.withdrawal(WidT[I]);
                System.out.println(" BALANCE IS " + BK.getBal());
                Thread.sleep(100);
                BK.deposit(Depo[I]);

                System.out.println("DEPOSIT  " + Depo[I] + " BALANCE IS " + BK.getBal());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {

        }

    }

}
