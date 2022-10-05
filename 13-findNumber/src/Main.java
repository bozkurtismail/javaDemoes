public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int findNumber = 6;

        boolean isThere = false;

        for (int number : numbers) {
            if (number == findNumber) {
                isThere = true;
                break;
            }
        }

        if (isThere) {
            System.out.println("There is number");
        } else {
            System.out.println("There is not number");
        }
    }
}
