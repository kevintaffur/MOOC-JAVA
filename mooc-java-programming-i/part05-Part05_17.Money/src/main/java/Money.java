
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int total = ((this.euros() * 100) + this.cents()) + ((addition.euros() * 100) + addition.cents());
        Money newMoney = new Money(0, total);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros() < compared.euros() || (this.euros() == compared.euros() && this.cents() < compared.cents())) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        int total = ((this.euros() * 100) + this.cents()) - ((decreaser.euros() * 100) + decreaser.cents());
        if(total < 0) {
            total = 0;
        }
        Money newMoney = new Money(0, total);
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
