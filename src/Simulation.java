public class Simulation {
    public void runSim(){
        System.out.println("running sim");
        Account myAccount = new Account(1000);
        myAccount.withdraw(500);
    }
}
