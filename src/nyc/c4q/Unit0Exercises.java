package nyc.c4q;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

//For "testAlternateS1andS2XTimes", "testEmptyString", "testStringSplit", there must be sth wrong with my code,
// but when I copy them to another regular new opened class, it works.....

public class Unit0Exercises {
    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     * additional information in the comments of each method
     */
    public static void main(String args[]) {
        // Use main to test your methods
        print();
        returnPrimitiveBooleanFalse();
        returnPrimitiveInt55Plus44();
        returnPrimitiveDouble2Point718();
        returnPrimitiveCharASCII35();
        System.out.println(isEven(3));

        returnSumOfOddNumbersBetween1And100();
        returnSumOfTheFirst200MultiplesOf3();
        isEmptyString(" ");
        System.out.println(alternateS1AndS2Xtimes("abra", "cadabra", 3));
        System.out.println(alternateS1AndS2Xtimes("abra", "cadabra", 0));
        System.out.println(alternateS1AndS2Xtimes("abra", "cadabra", -3));

        stringSplit("ubiquitous", "q").equals("ubi");
        stringSplit("hellogoodbye", "good").equals("hello");
        stringSplit("fancy seeing you", "there");

    }

    public static void print() {
        String say = "I'm sorry Dave, I'm afraid I can't let you do that.";
        // print out "I'm sorry Dave, I'm afraid I can't let you do that."
        System.out.println(say);
    }

    public static boolean returnPrimitiveBooleanFalse() {
        boolean result = 2 > 3;
        return result;
    }

    public static int returnPrimitiveInt55Plus44() {
        return (55 + 44);
    }

    public static double returnPrimitiveDouble2Point718() {
        // This is the start of a famous mathematical constant.
        // What's that constant?
        return 2.718;
    }

    public static char returnPrimitiveCharASCII35() {
        // What's the character for the ASCII number 35?
        // Look at an ASCII table and return that character.
        // You can look at the ASCII table at http://www.asciitable.com/
        return '#';
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else
            return false;
    }

    public static boolean isMultipleOfX(int n, int x) {

        if (n%x==0 && x!=0){
            return true;
        }else
            return false;

        // 0 is a multiple of every number (except 0)
        // For example:
        //      isMultipleOfX(0, 3) == true
        //      isMultipleOfX(1, 3) == false
        //      isMultipleOfX(3, 3) == true
        //      isMultipleOfX(10, 3) == false
        //      isMultipleOfX(28, 7) == true
        // TODO expect a ArithmeticException in Test with x==0
    }

    public static int returnSumOfOddNumbersBetween1And100() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            } else
                continue;
        }
        // Starts with [1, 3, 5, ...]
        // Ends with   [..., 95, 97, 99]
        return sum;
    }

    public static int returnSumOfTheFirst200MultiplesOf3() {

        int sum = 0;
        for (int j = 0; j <= 597; j = j + 3) {
            sum = sum + j;
        }
        // Starts with [0, 3, 6, ...]
        // Ends with   [..., 591, 594, 597]
        return sum;
    }

    public static boolean isEmptyString(String str) {

        if (str.length() == 0 && str == null) {
            return true;
        } else
            return false;
    }

    // Given string `s1`, `s2` and a positive integer `x`,
    // return a string that is equal to s1 + s2 repeated x times.
    // If x is 0 or negative negative, return an empty string `""`.
    // For example:
    //      alternateS1AndS2Xtimes("abra", "cadabra", 0).equals("") == true
    //      alternateS1AndS2Xtimes("abra", "cadabra", 1).equals("abracadabra") == true
    //      alternateS1AndS2Xtimes("abra", "cadabra", 2).equals("abracadabraabracadabra") == true
    //      alternateS1AndS2Xtimes("abra", "cadabra", 3).equals("abracadabraabracadabraabracadabra") == true
    public static String alternateS1AndS2Xtimes(String s1, String s2, int x) {
        String result = " ";
        for (int i = 1; i <= x; i++) {
            result = result + s1 + s2;
            if (x == 0) {
                System.out.println(" ");
            } else
                continue;
        }
        return result;
    }

    // Given string s, return a string that stops at the first occurrence of "split".
    // For example:
    //      stringSplit("ubiquitous", "q").equals("ubi") == true
    //      stringSplit("hellogoodbye", "good").equals("hello") == true
    //      stringSplit("fancy seeing you", "there").equals("") == true
    // If the string does not contain split, then return the empty string "".
    public static String stringSplit(String s, String splitOn) {
        String result = " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.contains(splitOn)) {
                result = result + s.substring(0, s.indexOf(splitOn));
                System.out.println(result);
                break;
            } else
                result = result + " ";
        }
        return result;
    }

    public static Singer returnBeyonce() {
        Singer b = new Singer("Beyonce","USA");
        // should return an instance of Singer with the name "Beyonce" and location "USA"
        return null;
    }

    public static Singer returnSingerChild(Singer s1, Singer s2) {
        s1.setName("Ada");
        s1.setLocation("NewYork");

        s2.setName("John");
        s2.setLocation("Beijing");

        // should return an instance of Singer with the name of s1 and the location of s2.
        // For example:
        //      Singer queenB = new Singer("Beyonce", "USA");
        //      Singer rihanna = new Singer("Rihanna", "Barbados");
        //      returnSingerChild(queenB, rihanna) ==> returns an instance of Singer with name "Beyonce" and location "Barbados".
        return null;
    }

    public static HashMap<String, Singer> returnSingers() {
        HashMap singer = new HashMap();

        singer.put("Beyonce", "USA");
        singer.put("Jay-Z",  "USA");
        singer.put("Bieber","Canada");
        singer.put("Drake", "Canada");
        singer.put("Jepsen","Canada");
        // should return a HashMap of the following singers:

        return singer;
    }

    public static boolean isFromCanada(Singer person) {
        return false;
    }

    public static void changeJayZsLocationToLosAngeles(HashMap<String, Singer> people) {
        // people will have the values of the `returnSingers()` method you filled in previously.
        // the city should be set to "Los Angeles"
        // old value of Jay-Z:
        //      Singer(name="Jay-Z",   location="USA")
        // new value of Jay-Z:
        //      Singer(name="Jay-Z",   location="Los Angeles")
    }

    public static void removeJepsenFromSingers(HashMap<String, Singer> people) {
        // people will have the values of the `returnSingers()` method you filled in previously.
        // old keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake", "Jepsen"]
        // new keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake"]

    }

    // Bonus Problems
    public static void readFileAndOnlyPrintCanadianCelebrities() {
        // TODO Use Apache Commons CSV and provide boilerplate for reading the file
        // https://commons.apache.org/proper/commons-csv/
        try {
            FileReader fr = new FileReader("celebrities.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readFileAndPrintCelebrityAges() {
        // TODO similar as above
    }
}
