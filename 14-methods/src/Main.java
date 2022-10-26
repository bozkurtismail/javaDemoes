public class Main {

    public static void main(String[] args) {
        findNumber();
    }

    findNumber();
    findNumber();

}
    public static void findNumber(){
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int findNumber = 6;

        boolean isThere = false;

        for (int number : numbers) {
            if (number == findNumber) {
                isThere = true;
                break;
            }
        }

        String message = "";
        if (isThere) {
            message = "There is number " + findNumber;
            getMessage(message);
        } else {
            message = "There is not number " + findNumber;
            getMessage(message);
        }
    }

    public static void getMessage(String message){
        System.out.println(message);
    }
}
