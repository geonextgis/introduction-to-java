/*
 * String Methods in Java
 * 
 * Strings in Java have various built-in methods for performing operations such as modifying, analyzing, and searching strings. 
 * Below are some commonly used methods:
 */

 package code.JavaCourseCWH.src.codes;

 public class P010_String_Methods {
     public static void main (String[] args) {
         // Creating a string
         String st = "Krishnagopal Halder"; 
         System.out.println("The value in the String: " + st); 
 
         // 1. length(): Returns the length of the string
         int length = st.length(); 
         System.out.println("The length of the string: " + length); 
 
         // 2. toLowerCase() and toUpperCase(): Converts the string to lower or upper case
         String st_lower = st.toLowerCase(); 
         System.out.println("The string in lower case: " + st_lower); 
         String st_upper = st.toUpperCase(); 
         System.out.println("The string in upper case: " + st_upper); 
 
         // 3. trim(): Removes leading and trailing spaces from the string
         String non_trimmed_st = "     Krishnagopal Halder        "; 
         System.out.println("Non trimmed string: " + non_trimmed_st); 
         System.out.println("Trimmed string: " + non_trimmed_st.trim()); 
 
         // 4. substring(): Extracts a portion of the string
         System.out.println("Substring from index 5: " + st.substring(5)); 
         System.out.println("Substring from index 5 to 10: " + st.substring(5, 10)); 
 
         // 5. replace(): Replaces characters or substrings in the string
         System.out.println("Replace character 'r' with 'p': " + st.replace("r", "p")); 
 
         // 6. startsWith() and endsWith(): Checks if the string starts or ends with a specific substring
         System.out.println("String starts with 'K': " + st.startsWith("K")); 
         System.out.println("String ends with 'er': " + st.endsWith("er")); 
 
         // 7. charAt(): Returns the character at the specified index
         System.out.println("Character at index 5: " + st.charAt(5)); 
 
         // 8. indexOf() and lastIndexOf(): Finds the first or last occurrence of a character or substring
         String modified_st = "Krrish"; 
         System.out.println("Index of 'r': " + modified_st.indexOf("r")); 
         System.out.println("Index of 'r' from index 4: " + modified_st.indexOf("r", 4)); 
         System.out.println("Last index of 'r': " + modified_st.lastIndexOf("r")); 
 
         // 9. equals() and equalsIgnoreCase(): Compares strings for equality (case-sensitive or case-insensitive)
         System.out.println("Strings are equal: " + st.equals("Krishnagopal Halder")); 
         System.out.println("Strings are equal (ignore case): " + st.equalsIgnoreCase("krishnagopal halder")); 
 
         /*
          * Escape Sequences in Java
          * Escape sequences are used to represent certain special characters within strings.
          * Common escape sequences include:
          * - \" for double quote
          * - \\ for backslash
          * - \n for new line
          * - \t for tab
          */
         System.out.println("Example of escape sequence: I am escape sequence \"double quote");
     }
 }
 