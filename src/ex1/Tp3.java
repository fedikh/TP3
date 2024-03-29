
package ex1;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Tp3 {
    public static void main(String[] args) throws FileNotFoundException {
    FileHandler fileHandler = new FileHandler("file.log");

        int lineIndexToReverse = 1;
        fileHandler.reverseString(lineIndexToReverse);

        int lineIndexToRemoveDuplicates = 2;
        fileHandler.removeDuplicates(lineIndexToRemoveDuplicates);

        String pattern = "epoch";
        ArrayList<String> linesWithPattern = fileHandler.findLinesWithPattern(pattern);

        String str1 = "hello";
        String str2 = "Hello";
        System.out.println("Comparaison avec equals : " + fileHandler.compareStrings1(str1, str2));

        String str5 = "hello";
        String str6 = "HELLO";
        System.out.println("Comparaison avec equalsIgnoreCase : " + fileHandler.compareStrings2(str5, str6));

        String str7 = "hello";
        String str8 = "hello";
        System.out.println("Comparaison avec == : " + fileHandler.compareStrings3(str7, str8));

        // Test avec différentes instances de String
        System.out.println("Comparaison avec == : " + fileHandler.compareStrings3(new String("hello"), "hello"));
        System.out.println("Comparaison avec == : " + fileHandler.compareStrings3(new String("hello"), new String("hello")));

        System.out.println("Ligne contenant le motif ’" + pattern + "’ : " + linesWithPattern.get(0));
     
        
    }
    
}
