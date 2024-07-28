
//********************************************************************
//  RationalNumber.java       Java Foundations
//
//  Represents one rational number with a numerator and denominator.
//********************************************************************

//(Program 1 - #2)

public class RationalNumber implements Comparable 
{
    private int numerator, denominator;
    
    public double scale = Math.pow(10, 4);

    //-----------------------------------------------------------------
    //  Constructor: Sets up the rational number by ensuring a nonzero
    //  denominator and making only the numerator signed.
    //-----------------------------------------------------------------
    public RationalNumber(int numer, int denom)
    {
        if (denom == 0)
            denom = 1;

        // Make the numerator "store" the sign
        if (denom < 0)
        {
            numer = numer * -1;
            denom = denom * -1;
        } //end if

        numerator = numer;
        denominator = denom;

        reduce();
    } //end RationalNumber

    //-----------------------------------------------------------------
    //  Returns the numerator of this rational number.
    //-----------------------------------------------------------------
    public int getNumerator()
    {
        return numerator;
    } //end getNumerator

    //-----------------------------------------------------------------
    //  Returns the denominator of this rational number.
    //-----------------------------------------------------------------
    public int getDenominator()
    {
        return denominator;
    } //end getDenominator

    //-----------------------------------------------------------------
    //  Returns the reciprocal of this rational number.
    //-----------------------------------------------------------------
    public RationalNumber reciprocal()
    {
        return new RationalNumber(denominator, numerator);
    } //end reciprocal

    //-----------------------------------------------------------------
    //  Adds this rational number to the one passed as a parameter.
    //  A common denominator is found by multiplying the individual
    //  denominators.
    //-----------------------------------------------------------------
    public RationalNumber add(RationalNumber op2)
    {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;

        return new RationalNumber(sum, commonDenominator);
    } //end add

    //-----------------------------------------------------------------
    //  Subtracts the rational number passed as a parameter from this
    //  rational number.
    //-----------------------------------------------------------------
    public RationalNumber subtract(RationalNumber op2)
    {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;

        return new RationalNumber(difference, commonDenominator);
    } //end subtract

    //-----------------------------------------------------------------
    //  Multiplies this rational number by the one passed as a
    //  parameter.
    //-----------------------------------------------------------------
    public RationalNumber multiply(RationalNumber op2)
    {
        int numer = numerator * op2.getNumerator();
        int denom = denominator * op2.getDenominator();

        return new RationalNumber(numer, denom);
    } //end multiply

    //-----------------------------------------------------------------
    //  Divides this rational number by the one passed as a parameter
    //  by multiplying by the reciprocal of the second rational.
    //-----------------------------------------------------------------
    public RationalNumber divide(RationalNumber op2)
    {
        return multiply(op2.reciprocal());
    } //end divide

    //-----------------------------------------------------------------
    //  Determines if this rational number is equal to the one passed
    //  as a parameter. Assumes they are both reduced.
    //-----------------------------------------------------------------
    public boolean isLike(RationalNumber op2)
    {
        return (numerator == op2.getNumerator() &&
                denominator == op2.getDenominator());
    } //end isLike

    //-----------------------------------------------------------------
    //  Returns this rational number as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result;
        
        if (numerator == 0)
            result = "0";
        else
            if (denominator == 1)
                result = numerator + "";
            else
                result = numerator + "/" + denominator;
        
        return result;
    } //end toString

    //-----------------------------------------------------------------
    //  Reduces this rational number by dividing both the numerator
    //  and the denominator by their greatest common divisor.
    //-----------------------------------------------------------------
    private void reduce()
    {
        if (numerator != 0)
        {
            int common = gcd(Math.abs(numerator), denominator);

            numerator = numerator / common;
            denominator = denominator / common;
        } //end if
    } //end reduce

    //-----------------------------------------------------------------
    //  Computes and returns the greatest common divisor of the two
    //  positive parameters. Uses Euclid's algorithm.
    //-----------------------------------------------------------------
    private int gcd(int num1, int num2)
    {
        while (num1 != num2)
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;

        return num1;
        
    } //end gcd
    
    //(Program 1 - #3)
    
	@Override
	public boolean compareRational(RationalNumber op2) {
		// calc local to 4 decimals
		System.out.println("Local value " + numerator + "/" + denominator);
		double localDecimal = (double) numerator / denominator;
		System.out.println("localDecimal " + localDecimal);
		localDecimal = Math.round(localDecimal * scale) / scale;
		System.out.println("localDecimal " + localDecimal);
		
		// calc op2 to 4 decimals
		System.out.println("op2 value " + op2.getNumerator() + "/" + op2.getDenominator());
		double op2Decimal = (double) op2.getNumerator() / op2.getDenominator();
		System.out.println("op2Decimal " + op2Decimal);
		op2Decimal = Math.round(op2Decimal * scale) / scale;
		System.out.println("op2Decimal " + op2Decimal);
		
		// compare
		return localDecimal == op2Decimal;
	} //end compareRational

	
} //end class

