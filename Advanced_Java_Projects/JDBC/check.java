package Advanced_Java_Projects.JDBC;

public class check {
    public static void main(String[] args) {
        String expensetype = "Snacks";
        int expenseamount = 120;

        String query = "INSERT INTO expensetb(expensetype, expenseamount)VALUES('" + expensetype + ",'" + expenseamount +"')";

        System.out.println(query);
    }
}
