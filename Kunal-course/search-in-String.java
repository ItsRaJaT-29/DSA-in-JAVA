public class Search_in_String {

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
        System.out.println(search(name, 'T')); // true
        System.out.println(search(name, 't')); // true
        System.out.println(search(name, 'z')); // false
    }
}

