package Sabah;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char [] letters = {'c','f','j'};

        char found = nextGreatestLetter(letters, 'j');
        System.out.println(found);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int s = 0, e = n-1;

        while(s <= e){
            int m = s + (e-s)/2;

            if (letters[m] > target){
                e=m-1;
            }
            else{
                s= m+1;

            }
        }
       // int p = s % n;
        return letters[s%n];
    }


}
