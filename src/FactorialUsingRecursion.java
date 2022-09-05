public class FactorialUsingRecursion {
    static int fact = 1;

    int calFact(int no) {
        if (no > 1) {
            fact = fact * no;
            calFact(no - 1);
        }
        return fact;
    }

    public static void main(String[] args) {
        int no = 5, res;
        FactorialUsingRecursion f = new FactorialUsingRecursion();
        res = f.calFact(no);
        System.out.println(res);
    }
}
