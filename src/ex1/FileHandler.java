
package ex1
;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList ;
import java.util.Scanner ;

public class FileHandler {
private String filePath ;
private Integer fileSizeInkb ;
private Integer numberOfLines ;
private ArrayList<String> fileContent  ;        
    private int fileSizeInKb;

public FileHandler(String filepath) throws FileNotFoundException {
        File file = new File(filepath);
        if (file.exists()) {
            this.filePath = filepath ;
            this.fileSizeInkb =0;
            this.numberOfLines=0;
            this.fileContent = new ArrayList<String>()  ;
            readFile() ;
        } else {
            System.out.println("File " + filepath + " does not exist.");
          
        }
    }

private void readFile() throws FileNotFoundException{
      File myObj = new File(filePath);
      Scanner myReader = new Scanner(myObj);
      while(myReader.hasNextLine()){
          String data = myReader.nextLine();
           this.numberOfLines += 1 ;
           this.fileContent.add(data);
      }
      this.fileSizeInKb = (int) myObj.length()/1024; }
public ArrayList<String> findLinesWithPattern(String pattern) {
        ArrayList<String> linesWithPattern = new ArrayList<>();
        for (String l : this.fileContent) {
            if (l.contains(pattern)) {
                linesWithPattern.add(l);
            }
        }
        return linesWithPattern;
    }



public boolean compareStrings1(String str1, String str2) {
        return str1.equals(str2);
    }
public boolean compareStrings2(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }
public boolean compareStrings3(String str1, String str2) {
        return str1 == str2 ;
    }

public void reverseString(int lineIndex) {
        String l = this.fileContent.get(lineIndex);
        StringBuilder reversedL = new StringBuilder(l);
        reversedL.reverse();
        this.fileContent.set(lineIndex, reversedL.toString());
    }
public void removeDuplicates(int lineIndex) {
        String l = this.fileContent.get(lineIndex);
        StringBuilder ch = new StringBuilder();
        for (char c : l.toCharArray()) {
            if (ch.indexOf(String.valueOf(c)) == -1) {
                ch.append(c);
            }
        }
        this.fileContent.set(lineIndex, ch.toString());
    }

    
}




