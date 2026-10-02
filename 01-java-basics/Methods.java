public class Methods {
    
    // methods without parameters
    public static void geek()
    {
        System.out.println("Hello, Lokiii!");
    }

    //Methods with parameters
    public static void geeks(String name){
        System.out.println("Hiii, " + name);
    }

    //Methods with multiple parameter
    public static void mgeeks(int bharani, String loki)
    {
        System.out.println(bharani + " what is that number " + loki);
    }

    //method with return type 
    public static int Square(int a)
    {
        return a*a;
    }

    public static void main(String[] args){
        geek();
        geeks("Bharani");
        mgeeks(143, "Lokiii");
        int result = Square(5);
        System.out.print(result);
    }
}
