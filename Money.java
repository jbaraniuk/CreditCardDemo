/**
 * Justin Baraniuk
 * October 19, 2018
 * This class represents nonnegative amounts of money.
 */

public class Money {
    private long dollars; 
    private long cents;
    
    /**
    Constructor
    @param amount The amount in decimal format.
     */
    public Money(double amount) {
        if (amount < 0) {
            System.out.println("Error: Negative amounts " +
                "of money are not allowed.");
            System.exit(0);
        } else {
            long allCents = Math.round(amount * 100);
            this.dollars = allCents / 100;
            this.cents = allCents % 100;
        }
    }
     
    /** 
     Copy Constructor copies the fields of one Money object into a new 
     Money object.
     @param otherObject The object to be copied.
     */
      public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }
    
    /**
    The add method
    @param otherAmount The amount of money to add.
    @return The sum of the calling Money object
    and the parameter Money object.
     */
    public Money add(Money otherAmount) {
        Money sum = new Money(0);
        sum.cents = this.cents + otherAmount.cents;
        long carryDollars = sum.cents / 100;
        sum.cents = sum.cents % 100;
        sum.dollars = this.dollars + otherAmount.dollars +
        carryDollars;
        return sum;
    }

    /**
    The subtract method
    @param amount The amount of money to subtract.
    @return The difference between the calling Money
    object and the parameter Money object.
     */
    public Money subtract (Money amount) {
        Money difference = new Money(0);
        if (this.cents < amount.cents) {
            this.dollars = this.dollars - 1;
            this.cents = this.cents + 100;
        }
        difference.dollars = this.dollars - amount.dollars;
        difference.cents = this.cents - amount.cents;
        return difference;
    }

    /**
    The compareTo method
    @param amount The amount of money to compare against.
    @return -1 if the dollars and the cents of the calling object are less than the dollars and
    the cents of the parameter object. 0 if the dollars and the cents of the calling object are 
    equal to the dollars and cents of the parameter object. 1 if the dollars and the cents of the 
    calling object are more than the dollars and the cents of the parameter object.
     */
    public int compareTo(Money amount) {
        int value;
        if(this.dollars < amount.dollars)
            value = -1;
        else if (this.dollars > amount.dollars)
            value = 1;
        else if (this.cents < amount.cents)
            value = -1;
        else if (this.cents > amount.cents)
            value = 1;
        else
            value = 0;
        return value;
    }
 
    /** 
    The equals method compares a dollar amount with another dollar amount.
    @param otherObject The object amount for comparison.
    @return boolean True or false.
     */
    public boolean equals(Money otherObject) {        
         return (dollars == otherObject.dollars && cents == otherObject.cents); 
    }
    
    /**
    The toString method return the dollar amount as a String.
    @return String dollar value as a String.
     */
    public String toString() {    
        String centsAdjusted = "" + cents;
        if (cents < 10) { 
            centsAdjusted = "0" + cents;
        }
        return "$" + dollars + "." + centsAdjusted;
    }
}
 