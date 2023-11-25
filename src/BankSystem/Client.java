package BankSystem;

import java.util.Comparator;
import java.util.TreeSet;

public class Client implements Comparable<Client> {
    private String passport;
    private String name;
    private Bank.Account account;
    public Client(String name, String passport){
        this.passport = passport;
        this.name = name;
    }
    public String getPassport() {
        return passport;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return this.name+" "+this.passport;
    }
    @Override
    public int compareTo(Client cl) {
        return passport.compareTo(cl.getPassport());
    }

}
