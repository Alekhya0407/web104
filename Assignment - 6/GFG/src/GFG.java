import java.io.*;
import java.util.*;
  
// Main class 
class GFG {
    static void traverseString(String str)
    {
        // Traverse the string
        for (int i = 0; i < str.length(); i++) {
  
            // Print current character
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args)
    {
        String str = "Be Happy";
        traverseString(str);
    }
}
