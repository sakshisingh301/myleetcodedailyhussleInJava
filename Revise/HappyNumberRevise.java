public class HappyNumberRevise {

    public static boolean isHappy(int n) {
     int slow=n;
     int fast=nextNumber(n);

     while(slow!=fast)
     {
         slow=nextNumber(slow);
         fast=nextNumber(fast);
         fast=nextNumber(fast);
     }
     if(slow==1 && fast==1)
     {
        return true;
     }

     return false;


    }

    private static int nextNumber(int n )
    {
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            n=n/10;
            sum=sum+d*d;

        }
        return sum;

    }

    public static void main(String[] args) {
        int n=2;
        System.out.println(isHappy(n));

    }
}
