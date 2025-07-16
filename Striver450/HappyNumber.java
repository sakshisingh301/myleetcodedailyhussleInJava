import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappy(int n) {


        int slow=n;
        int fast=nextNum(n);
        while (slow!=fast)
        {
            slow=nextNum(slow);
            fast=nextNum(fast);
            fast=nextNum(fast);

        }
        if(slow==1 && fast==1)
        {
            return true;
        }
        return false;

    }

    private static int nextNum(int num)
    {
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            num=num/10;
            sum=sum+(digit*digit);

        }
        return sum;

    }

    public static void main(String[] args) {
        int n = 199;

    }
}
