public class Simulation {
    public void runSim(){
        System.out.println("running sim");
        Account myAccount = new Account(1000);
        Runnable runWithdraw = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    myAccount.withdraw(100);
                }
            }
        };
        Thread thread1 = new Thread(runWithdraw, "Thread 1");
        thread1.start();
        System.out.println("sim over. shutting down");
    }
}
