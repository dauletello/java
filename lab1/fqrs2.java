package New;

public class fqrs2 {

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        fqrs2 obj = new fqrs2();
        int result = obj.sum(5, 7);
        System.out.println("Sum = " + result);
    }
}