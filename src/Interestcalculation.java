 class Mainclass {
    public static void savingsUserAccount(){
        float amritaBalance = 100000f;
        float roiSaving = 0.03f;
        float roiPerMonthSavings = (roiSaving/12);
        float interest =0;
        float newBalanceSavings;

        //First 3 months
        interest = interest + (amritaBalance*3*roiPerMonthSavings);
        newBalanceSavings = amritaBalance + interest;

        System.out.println("Interest for the first quarter = " + interest);
        System.out.println("Amount in the account after first quarter = " + newBalanceSavings);
        System.out.println();
    }

    public static void currentUserAccount(){
        float initialBalance =50000f;
        float deposit = 10000f;
        float newBalance = initialBalance+ deposit;
        float overdraft = 0.2f;
        float withdrawAmount = 70000f;
        float maxWithdraw = 0,remainingBalance = 0;

        maxWithdraw = newBalance + newBalance*overdraft;
        remainingBalance = maxWithdraw - withdrawAmount;

        if (maxWithdraw > withdrawAmount){
            System.out.println("Yes, the requested funds can be withdrawn");
            System.out.println("Your new balance after withdrawal is: " + remainingBalance);
        }
        else{
            System.out.println("Insufficient Balance");
        }

    }

}

 public class Interestcalculation {
    public static void main(String[] args) {
        Mainclass.savingsUserAccount();
        Mainclass.currentUserAccount();
    }
}