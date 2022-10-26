public class Main {

    public static void main(String[] args) {
        String message = "The weather is very nice today";
        String newMessage = giveCity();
        System.out.println(newMessage);
        int number = addition(5,7);
        System.out.println(number);

        int total = addition2(1,3,4,5,62,1,4,6,3);
        System.out.println(total);
    }

    public static void add(){
        System.out.println("Added");
    }

    public static void delete(){
        System.out.println("Deleted");
    }

    public static void update(){
        System.out.println("Updated");
    }

    public static String giveCity(){
        return "Ankara";
    }

    public static int addition(int number1,int number2){
        return number1+number2;
    }

    public static int addition2(int... numbers) { //contains multiple numbers - create array - variable arguments
        int total = 0;
        for (int number: numbers) {
            total += number;
        }
        return total;
    }
}
