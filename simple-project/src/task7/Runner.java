package task7;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class Runner {

    public static void main(String[] args) {
        List<Account> accounts = List.of(new Account("RUB", 45.5), new Account("RUB", 0.5));
        List<Account> emptyList = Collections.emptyList();


        var accountFutureMap = emptyList.stream()
                .collect(groupingBy(Account::getCurrency,
                        summingDouble(Account::getBalance)));

        System.out.println(accountFutureMap);
    }

    static class Account {
        String currency;
        double balance;

        public Account(String currency, double balance) {
            this.currency = currency;
            this.balance = balance;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
}
