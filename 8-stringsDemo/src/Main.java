public class Main {

    public static void main(String[] args) {
        String message = "The weather is very nice today.";

        System.out.println(message);

        //Length
        System.out.println("Elements Count :" + message.length());

        //Concat
        System.out.println("5. Element :" + message.charAt(4));

        System.out.println(message.concat("Hurray!"));

        //StartsWith
        System.out.println(message.startsWith("T"));
        //EndsWith
        System.out.println(message.endsWith("."));

        //GetChars
        char[] characters = new char[11];
        message.getChars(0, 11, characters, 0);
        System.out.println(characters);

        //IndexOf
        System.out.println(message.indexOf('a'));
        System.out.println(message.indexOf("we"));
        //LastIndexOf
        System.out.println(message.lastIndexOf("to"));

        //Replace
        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);

        //Substring
        System.out.println(message.substring(3));
        System.out.println(message.substring(0, 4));

        //Split
        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        //toLowerCase
        System.out.println(message.toLowerCase());

        //Trim
        String difMessage = "      The weather is very nice today.      ";
        System.out.println(difMessage.trim());


    }
}
