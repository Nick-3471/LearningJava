package Projects;

public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2; //1+2=3
        result = result - 1;
        System.out.println(result);
        result = result * 10;
        System.out.println(result);
        result = result / 5;
        System.out.println(result);

        int previousReslut = result - 1;
        // System.out.println(previousReslut);
        
        result = result % 3;
        System.out.println("The total is " + result);

    }
}