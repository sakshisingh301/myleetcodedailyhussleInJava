public class FindThreeConsecutiveIntegersThatSumtoaGivenNumber {

    public static long[] sumOfThree(long num) {

        if(num%3!=0)
            return null;
        long[] res=new long[3];
        long mid= num/3;


        if(mid+mid+1+mid-1==num)
        {
            res[0]=mid-1;
            res[1]=mid;
            res[2]=mid+1;
        }
        return res;

    }

    public static void main(String[] args) {
        long num=33;
        System.out.println(sumOfThree(num));
    }




}
