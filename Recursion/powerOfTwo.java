public class powerOfTwo {

    public boolean isPowerOfTwo(int n) {

        //base condition
        //hypothesis
        //induction
        if(n==1) return true;
        if(n<=0 || n%2!=0) return false;
        return isPowerOfTwo(n/2);

    }
}
