public class Operators {
    public static void main(String[] args) {
        int a = 13;
        int b = 3;
        int c = 6;
        int d = 15;

       
        
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

        //Assignment Operators(=, +=, -=, *=, /=, %=)
        System.out.println("\nAssignment Operators:");
        System.out.println("Assignment: " + (a = d));
        System.out.println("Addition Assignment: " + (a += b));
        System.out.println("Subtraction Assignment: " + (a -= b));
        System.out.println("Multiplication Assignment: " + (a *= b));
        System.out.println("Division Assignment: " + (a /= b));
        System.out.println("Modulus Assignment: " + (a %= b));  
        

    //Increment and Decrement Operators(++, --)
        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("Increment: " + (a++));
        System.out.println("Decrement: " + (a--));  

    }
}