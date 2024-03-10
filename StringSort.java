import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String Str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPLKJHGFDSAMNBVCXZ";
        System.out.println(Str);

        char[] st = Str.toCharArray();
        Arrays.sort(st);
        System.out.println(Arrays.toString(st));

        char[] str = Str.toCharArray();
        for (int i = 0; i < 49; i++) {
            for (int j = i + 1; j < 50; j++) {
                if (str[j] < str[i]) {
                    char temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (char ch : str) {
            System.out.print(ch);
        }
        
    }
}
