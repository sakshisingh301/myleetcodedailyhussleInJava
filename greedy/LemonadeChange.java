public class LemonadeChange {

    public static boolean lemonadeChange(int[] bills) {
        int noOfFive=0;
        int noOfTens=0;

        for(int i=0;i< bills.length;i++)
        {
            int curr=bills[i];
            if(curr==5)
            {
                noOfFive++;
            }
            else if(curr==10)
            {
                noOfTens++;
                if(noOfFive>0)
                {
                    noOfFive--;
                }
                else{
                    return false;
                }
            }
            else{
                if(noOfTens>0 &&noOfFive>0)
                {
                    noOfTens--;
                    noOfFive--;
                } else if (noOfTens==0 &&noOfFive>=3) {
                    noOfFive=noOfFive-3;
                }
                else {
                    return false;
                }

            }
        }
        return true;


    }

    public static void main(String[] args) {
        int [] bills = {5,5,5,10,20};

    }
}
