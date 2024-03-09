import java.util.*;

public class Main {
    public static String sortString(String input, String key) {
        char[] sortedString = input.toCharArray();

        for(int i = 0; i < sortedString.length; i++) {
            for(int j = i + 1; j < sortedString.length; j++) {
                char a = Character.toLowerCase(sortedString[i]);
                char b = Character.toLowerCase(sortedString[j]);

                int indexA = key.indexOf(a);
                int indexB = key.indexOf(b);

                if(indexA > indexB) {
                    char temp = sortedString[i];
                    sortedString[i] = sortedString[j];
                    sortedString[j] = temp;
                }
            }
        }

        return new String(sortedString);
    }

    public static void main(String args[]) {
        System.out.println(sortString(args[0], args[1]));
    }
}