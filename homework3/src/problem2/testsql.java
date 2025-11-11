package homework3.src.problem2;

public class testsql {
    public static void main(String[] args) {
        new testsql();
    }

    public testsql() {
        sql sql = new sql.Builder().select("*").from("users").where("UID = 1").build();
        System.out.println(sql);

        // this test should fail because of the missing FROM.
        // sql sql1 = new sql.Builder().select("*").where("UID = 1").build();
        // System.out.println(sql1);
    }
}
