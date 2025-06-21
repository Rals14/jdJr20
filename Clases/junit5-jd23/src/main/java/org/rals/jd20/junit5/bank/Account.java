package org.rals.jd20.junit5.bank;

import java.math.BigDecimal;

public class Account {
    private String person;
    private BigDecimal balance;

//    public Account() {}

    public Account(String Person, BigDecimal Balance) {
        this.person = Person;
        this.balance = Balance;
    }

    public String getPerson() {
        return person;
    }
    public void setPerson(String person) {
        this.person = person;
    }

    public BigDecimal getBalance() {
        return balance;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || (obj instanceof Account)) {
            return false;
        }
        Account c = (Account) obj;
        if (this.person == null || this.balance == null) {
            return false;
        }
        return this.person.equals(c.getPerson()) && this.balance.equals(c.getBalance());
    }
}
