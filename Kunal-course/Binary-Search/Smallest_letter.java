public class Smallest_letter {
    static char smallest(char[] letter, char target){
        int start = 0;
        int end = letter.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(letter[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return letter[start % letter.length];

    }

    public static void main(String[] args) {
        char[] letters = {'x','x','y','z'};
        System.out.println("Target 'a': " + smallest(letters, 'a'));
    }

}
