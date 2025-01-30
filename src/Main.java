public class Main
{
    public static void main(String[] args)
    {
        double startingBalance = 5000.0;
        double INTEREST_RATE = 0.17;
        double oneMonthInterest = 0;
        double twoMonthInterest = 0;

        oneMonthInterest = Math.round(startingBalance * INTEREST_RATE);
        twoMonthInterest = oneMonthInterest * INTEREST_RATE;

        System.out.println("Your interest due after one month is " + oneMonthInterest + " dollars.");
        System.out.println("Your interest due after two months is " + twoMonthInterest + " dollars.");

    }
}