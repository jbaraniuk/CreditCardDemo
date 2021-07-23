/**
 * Justin Baraniuk
 * October 19, 2018
 * This class represents a credit card and it's owner, balance and limit.
 */

public class CreditCard
{
    private Money balance;
    private Money creditLimit;
    private Person owner;
    
    /**
    Constructor
    @param newCardHolder Information about the person.
    @param limit The card's credit limit.
     */
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }
    
    /** 
    The getBalance method creates a copy of the balance and returns the
    balance in dollars.
    @return Money The balance in dollars.
     */
    public Money getBalance() {
        return new Money(balance);
    }
    
    /**
    The getCreditLimit method creates a copy of creditLimit and returns 
    the credit limit in dollars.
    @return Money The credit limit in dollars.
     */
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }
    
    /**
    The getPersonals method calls the toString method of the credit card's 
    owner object to print information about the person.
    @return Information about the person.
     */
    public String getPersonals() {
        return owner.toString();
    }
    
    /**
    The charge method adds amount to balance if transaction will not 
    exceed the credit limit.
    @param Money Amount in dollars.
     */
    public void charge(Money amount) {
        if (creditLimit.compareTo(balance.add(amount)) == -1) {
           System.out.println("Exceeds credit limit");
        } else {
            this.balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        }
    }
    
    /** 
    The payment method subtracts the amount from the balance.
    @param Money amount in dollars.
     */
    public void payment(Money amount) {
        this.balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
