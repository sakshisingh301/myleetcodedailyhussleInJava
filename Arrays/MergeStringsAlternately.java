package ArraysQuestion;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {

        int i=0;
        int j=0;
        StringBuilder stringBuilder=new StringBuilder();

        while(i<word1.length() && j<word2.length())
        {
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(j));
            i++;
            j++;

        }

        while(i<word1.length())
        {
            stringBuilder.append(word1.charAt(i));
            i++;
        }

        while(j<word2.length())
        {
            stringBuilder.append(word2.charAt(j));
            j++;
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {

       String word1 = "abc";
       String word2 = "pqr";

    }
}
