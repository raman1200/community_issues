import java.util.*;
    class Celsius_to_fahrenheit {
    public static void main(String[] args)
    {
       	System.out.println("Enter value in celcius");
		Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = 0.0;
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Value of temperature in fahrenheit:" + fahrenheit);
    }
}
