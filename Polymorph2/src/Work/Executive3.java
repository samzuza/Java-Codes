package Work;

public class Executive3 extends Employee3
{
    private double bonus;
    private int extraVacation;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this executive with the specified
    //  information.
    //-----------------------------------------------------------------
    public Executive3(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, int vDays)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        bonus = 0;  // bonus has yet to be awarded
        extraVacation = vDays;  // extra vacation days
    }

    //-----------------------------------------------------------------
    //  Awards the specified bonus to this executive.
    //-----------------------------------------------------------------
    public void awardBonus(double execBonus)
    {
        bonus = execBonus;
    }

    //-----------------------------------------------------------------
    //  Computes and returns the pay for an executive, which is the
    //  regular employee payment plus a one-time bonus.
    //-----------------------------------------------------------------
    public double pay()
    {
        double payment = super.pay() + bonus;

        bonus = 0;

        return payment;
    }

    //-----------------------------------------------------------------
    //  Returns the number of vacation days for this executive.
    //-----------------------------------------------------------------
    public int vacation()
    {
        return STANDARD_VACATION + extraVacation;
    }
}