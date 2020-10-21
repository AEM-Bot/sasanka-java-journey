package com.exceptionhandling;

/*
    Unchecked Expressions are RuntimeExceptions
 */
class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    //Checked Exceptions must be handled
    public void add(Amount that) throws CurrenciesDoNotMatchException {
        //how to throw exception
        if (!this.currency.equals(that.currency)) {
            throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " +
                    that.currency);
            // throw new RuntimeException("Currencies don't match");
//            throw new Exception("Currencies Don't Match " + this.currency + " & "
//                    + that.currency);
        } else {
            this.amount += that.amount;
        }
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}

class CurrenciesDoNotMatchException extends Exception {
    public CurrenciesDoNotMatchException(String msg) {
        super(msg);
    }

}

public class ThrowingExceptionRunner {

    /*
        here either try catch block or throws Exception --> Typically
        in large projects must be handled with try catch block
     */
    public static void main(String[] args) throws CurrenciesDoNotMatchException {
        Amount amount1 = new Amount("USD", 10);
        Amount amount2 = new Amount("EUR", 20);
        amount1.add(amount2);
        System.out.println(amount1);

    }
}
