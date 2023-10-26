import java.util.ArrayList;

public class APCSA_4B {

    public static boolean IsPalindrome(String str) {
        String nonLetters = ",.:;()[]{}!?@#$%^&* ";
        String noletter = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonLetters.contains(str.substring(i, i + 1))) {
                noletter += str.substring(i, i + 1).toLowerCase();
            }
        }
        int le = 0;
        int ri = noletter.length() - 1;
        while (le < ri) {
            if (noletter.charAt(le) != noletter.charAt(ri)) {
                return false;
            }
            le++;
            ri--;
        }
        return true;
    }

    public static String Pig_latin(String str){
        int a = 0;
        ArrayList<String> num = new ArrayList<>();
        for(int j = 0; j< str.length(); j++){
            if(str.charAt(j) ==' ') {
                num.add(str.substring(a, j));
                a = j + 1;
            }
        }
        num.add(str.substring(a));

        for(int i = 0; i<num.size(); i++){
            String c = "";
            if(num.get(i).length()>=3){
                c = num.get(i).substring(1) + num.get(i).substring(0,1);
                c+= "ay";
                num.remove(i);
                num.add(i,c);
                c = "";
            }

        }
        String result = "";
        for(int p = 0; p<num.size(); p++){
            result = result + num.get(p) + " ";
        }
        return result;
    }

    public static int AscendingNumbers(int Min, int Max){
        int result = 0;
        for(int i = Min; i<= Max; i++) {
            String num = Integer.toString(i);
            boolean c = true;


            for (int j = 0; j < num.length()-1; j++) {
                int a1 = i / (int) Math.pow(10, j + 1) % 10;
                int b1 = i / (int) Math.pow(10, j) % 10;
                if (b1<=a1) {
                    c = false;
                    break;
                }
            }
            if(c){
                result++;
                System.out.println(i);
            }
        }
        return result;
    }
    

    public static void Times_table(int num){
        Integer c = new Integer(num*num);
        String b = c.toString();
        int d = b.length();
        for(int i = 1; i<=num; i++){
            for(int j =1; j<=num; j++ ){
                Integer g = new Integer(i*j);
                String q = g.toString();
                System.out.print(i*j);
                for(int p = 1; p<=d - q.length()+1; p++ ){
                    System.out.print(" ");
                }

            }
            System.out.println();;
        }
    }

}
