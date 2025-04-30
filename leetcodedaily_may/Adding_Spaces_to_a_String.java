public class Adding_Spaces_to_a_String {

    public static String addSpaces(String s, int[] spaces) {

        StringBuilder stringBuilderOld=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            stringBuilderOld.append(s.charAt(i));
        }
        StringBuilder stringBuilderNew=new StringBuilder();
        int start=0;
        for(int i=0;i<spaces.length;i++)
        {
            int space=spaces[i];
           String sb=stringBuilderOld.substring(start,space);
            stringBuilderNew.append(sb);
            stringBuilderNew.append(" ");
            start=space;
        }
        if(spaces[spaces.length-1]!=s.length())
        {
            String sb=s.substring(spaces[spaces.length-1],s.length());
            stringBuilderNew.append(sb);
        }
        return stringBuilderNew.toString();

    }

    public static void main(String[] args) {
       String s = "LeetcodeHelpsMeLearn";
       int [] spaces = {8,13,15};
       System.out.println(addSpaces(s,spaces));

    }
}
