import java.util.*;

class Main
{
    public static<T> void println(T info)
    {
        System.out.println(info);
    }

    public static void main(String[] args)
    { 
        println("Welcome to Pascal!!!"); 
        PascalFunctions.printPascalArray(PascalFunctions.getPascalArray(10));  
        // new PascalFrame();

        for(;;);
    }
}