import java.util.stream.Collectors;
import java.util.Arrays;
import java.lang.*;



public class Anagram {
    static String str1="listen";
    static String str2="Silent";

    public static void main(String[] args){
    boolean isAnagram= isAnagram(str1,str2);
    System.out.println(isAnagram ? "Anagram":"Not Anagram");


    }

    public static boolean isAnagram(String s1,String s2){
        s1=s1.replaceAll("\\s+","").toLowerCase();
        s2=s2.replaceAll("\\s+","").toLowerCase();

        if(s1.length()!=s2.length()) return false;

        String sorted1= s1.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());

        String sorted2=s2.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        return sorted1.equals(sorted2);
    }


}