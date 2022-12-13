public class Main {
    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "How are you?";

        String x =  string1.substring(0,2);
        String y =  string2.substring(10);

        char[] charArray = (x + y).toCharArray();
        System.out.println(charArray);


    }
}