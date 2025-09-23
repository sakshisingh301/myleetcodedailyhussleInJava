public class BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {

        int skipS=0;
        int skipT=0;
        int i=s.length()-1;
        int j=t.length()-1;

        //skip variable is keeping track of how many variable to skip
        //abc### - 3 variable would be skipped

        while(i>=0 || j>=0)
        {
            while(i>=0)
            {
                if(s.charAt(i)=='#')
                {
                    skipS++;
                    i--;
                }
                else if(skipS>0)
                {
                    skipS--;
                    i--;
                }
                else {
                    break;
                }
            }
            while(j>=0)
            {

                if(t.charAt(j)=='#')
                {
                    skipT++;
                    j--;
                }
                else if(skipT>0)
                {
                    skipT--;
                    j--;
                }
                else {
                    break;
                }

            }

            if(i>=0 && j>=0)
            {
                if(s.charAt(i)!=t.charAt(j)) return false;
            }
            //when character is empty and other is not
            else if (i>=0 || j>=0) {
                return false;
            }


            i--;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
       String s = "bxj##tw", t = "bxj###tw";
       System.out.println(backspaceCompare(s,t));
    }
}
