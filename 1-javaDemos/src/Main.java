public class Main {

    public static void main(String[] args) {
        //intellisens

        //Hello World
        System.out.println("Hello Java");
        System.out.println("Hello Java 2");

        //Variables
        //reusability(tekrar kullanılabilirlik)
        System.out.println("My student count :" + 9);
        System.out.println("My student count :" + 9);
        System.out.println("My student count :" + 9);

        //camelCasing
        int studentCount = 12;

        System.out.println("My student count :" + studentCount);

        String message = "My student count :";

        System.out.println(message + studentCount);

        //DataTypes
        boolean isCorrect = true;
        boolean isNotCorrect = false;

        char characters = 'A';

        byte byteNumberMax = 127;
        byte byteNumberMin = -128;

        short shortNumberMax = 32767;
        short shortNumberMin = -32768;

        int intNumberMax = 2147483647;
        int intNumberMin = -2147483648;

        //long longNumberMax = 9223372036854775807;
        //long longNumberMin = -9223372036854775808;

    }
}
