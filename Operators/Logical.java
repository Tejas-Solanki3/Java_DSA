public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c;

        // Logical AND
        c = a && b; // c will be false
        System.out.println("a && b: " + c);

        // Logical OR
        c = a || b; // c will be true
        System.out.println("a || b: " + c);

        // Logical NOT
        c = !a; // c will be false
        System.out.println("!a: " + c);
    }
}
