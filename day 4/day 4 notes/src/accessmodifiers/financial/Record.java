package accessmodifiers.financial;

public class Record {
    void displayBalance() {
        Balance balance = new Balance();
//        if(balance.amount < 900) { wrong!! hindi dadaan. Check modifier.
//           balance.amount = 900;
//        }
//
//        balance.amount = 900;
//
//        System.out.println(balance.amount);

    }

    public static void main(String[] args) {
        Record record = new Record();
        record.displayBalance();
    }
}
