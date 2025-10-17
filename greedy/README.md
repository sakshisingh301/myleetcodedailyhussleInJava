MAXIMISE THE TOPMOST ELEMENT AFTER K MOVES

this question is full of testcases

we are trying to maximise the top element here 

edge cases: When size of array==1 and k>1

nums= {1} k=1

remove 1 and you cannot add back any element because you dont have any element to add.

nums= {1} k=2

remove 1 still i have one more move left so we can add back 1 to it and that would an answer

nums= {4,2,1} k==3

remove 4, 2,, we can add back 4 and that would be the answer

nums= {4,2,1} k==4

remove 4,2,1 we can add back 4 

nums={5,2,2,4,0,6} k==4

remove 5,2,2 and add back 5

It took me lot of trials to pass all the testcases

