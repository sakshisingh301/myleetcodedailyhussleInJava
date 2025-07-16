public class FirstBadVersion {

    public int firstBadVersion(int n) {

        int start=0;
        int end=n;


        while(start<=end)
        {
            int mid=start+(end-start)/2;
            Boolean isBad= isBadVersion(mid);
            if(!isBad)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return start;

    }

    private Boolean isBadVersion(int mid) {
        return true;
    }
}
