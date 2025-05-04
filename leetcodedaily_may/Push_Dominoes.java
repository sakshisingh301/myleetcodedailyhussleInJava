public class Push_Dominoes {


        public static String pushDominoes(String dominoes) {

            dominoes='L'+dominoes+'R';
            StringBuilder res=new StringBuilder();
            int prev=0;
            for(int curr=1;curr<dominoes.length();curr++)
            {
                if(dominoes.charAt(curr)=='.')
                    continue;
                int span =curr-prev-1;
                if(prev>0)
                    res.append(dominoes.charAt(prev));

                if(dominoes.charAt(curr)==dominoes.charAt(prev))
                {
                    for(int i=0;i<span;i++)
                    {
                        res.append(dominoes.charAt(prev));
                    }
                }
                else if(dominoes.charAt(prev)=='L' && dominoes.charAt(curr)=='R')
                {
                    for(int i=0;i<span;i++)
                    {
                        res.append('.');
                    }
                }
                else {
                    for(int i=0;i<span/2;i++)
                    {
                        res.append('R');
                    }
                    if(span/2==1)
                    {
                        res.append('.');
                    }
                    for(int i=0;i<span/2;i++)
                    {
                        res.append('L');
                    }

                }
                prev=curr;
            }
            return res.toString();

        }

    class Solution {
        public String pushDominoes(String s) {
            s = "L" + s + "R";
            StringBuilder res = new StringBuilder();
            int prev = 0;
            for (int curr = 1; curr < s.length(); ++curr) {
                if (s.charAt(curr) == '.') continue;
                int span = curr - prev - 1;
                if (prev > 0)
                    res.append(s.charAt(prev));
                if (s.charAt(prev) == s.charAt(curr)) {
                    for (int i = 0; i < span; ++i)
                        res.append(s.charAt(prev));
                } else if (s.charAt(prev) == 'L' && s.charAt(curr) == 'R') {
                    for (int i = 0; i < span; ++i)
                        res.append('.');
                } else {
                    for (int i = 0; i < span / 2; ++i)
                        res.append('R');
                    if (span % 2 == 1)
                        res.append('.');
                    for (int i = 0; i < span / 2; ++i)
                        res.append('L');
                }
                prev = curr;
            }
            return res.toString();
        }
    }

    public static void main(String[] args) {
        String s=  "RR.L";
    }




}
