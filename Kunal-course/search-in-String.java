import java.util.Arrays;
public class Search_in_String {


    static boolean search2(String str, char target){

        // NOTE: Uses str.toCharArray() to convert the String into a new char[] array.
        // This allows us to use the clean "enhanced for-loop" (for char ch : ...).
        // KEY DIFFERENCES from search():
        // 1. This is CASE-SENSITIVE (does not use toLowerCase).
        // 2. It creates a new character array in memory, whereas search() uses 
        //    str.charAt(i) which reads the existing string without making a copy.
        
      
        if(str.length() == 0){ //isEmpty can also be good
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }



    static boolean search(String str, char target){
        if(str.length() == 0){ //isEmpty can also be good
            return false;
        }

        str = str.toLowerCase(); // it converts all the string to lower case

        // IF i search for element 'T' in 'rajat' it will automatically lowercase it and wont return false
        target = Character.toLowerCase(target);




        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){ // to check the character use charAt()
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "Rajat";

        System.out.println(Arrays.toString(name.toCharArray()));

//        System.out.println(search(name, 'T')); // true
//        System.out.println(search(name, 't')); // true
//        System.out.println(search(name, 'z')); // false
    }
}
