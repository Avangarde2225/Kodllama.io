package Beginner;

public class Replace {
    public static void main(String[] args) {
        String str = "The weather is so nice today";

        String newStr = str.replace(" ", "-");
        System.out.println(newStr);

        System.out.println(str.substring(4));
        System.out.println(str.substring(4, 11));

        for (String s : str.split(" ")) {

            System.out.println(s);
        }
    }
}
