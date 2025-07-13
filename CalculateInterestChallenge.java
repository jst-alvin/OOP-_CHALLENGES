// A program to calculate the compound interest
// It demonstrates the use of variables in java
public class CalculateInterestChallenge {
    double principal = 20000;
    double rate = 12;
    int months = 23;


    public double calculateInterest(){
        // Uses the compound interest formula A = P*(1+R/100)^n
        return principal*Math.pow((1+rate/100), months);


    }

    public static void main(String[] args){
        double amount = (new CalculateInterestChallenge()).calculateInterest();
        System.out.println("The amount is:"+amount);

    }

}
