public class Operators {
    public static void main(String[] args) {
        int a = 13;
        int b = 3;
        int c = 6;
        
        //Arithmetic Operators(+, -, *, /, %)
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("modulus: " + ( a % b));

        //Relational Operators(==, !=, >, <, >=, <=)
        System.out.println("\nRelational Operators:");
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not Equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));    
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        //Logical Operators(&&, ||, !)
        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + ((a > b) && (b < c)));
        System.out.println("Logical OR: " + ((a > b) || (b < c)));
        System.out.println("Logical NOT: " + (!(a > b)));

    }
}