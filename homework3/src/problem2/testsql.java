package problem2;

public class testsql {
    public static void main(String[] args) {
        new testsql();
    }

    public testsql() {
        sql prompt2 = new sql.Builder().select("fname, lname, address").from("Employee join Department on dnumber=dno").where("dname='research';").build();
        // System.out.println(prompt2);

        sql prompt3 = new sql.Builder().select("fname, lname, address").from("Employee").build();
        // System.out.println(prompt3);

        sql prompt4 = new sql.Builder().select("pnumber, pname, budget, count(*)").from("Project join Works_on on pnumber=pno").where("budget > 200000").groupBy("pnumber, pname, budget").having("count(*) > 2").orderBy("pnumber").build();
        System.out.println(prompt4);
    }
}
