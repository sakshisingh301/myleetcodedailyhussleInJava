Frequency of the Most Frequent Element

What a question! Initially i thought its an easy sliding window question but while writing code i was only able to pass 11 testcase.

My initial thought process was:

[1,2,4], k=5: If I am at 2, can i make 1 qual to 2 and still have k left?

yes, I can : k=4 left

now i move to 4. Can i make all the element present before 4 equal to 4 ?

yes, I can : k=0 left 

This logic will not work for more testcase , i found one testcase but it was too long so i could not check manually.

----END---

[1,1,1,2,2,4] ,     k=2

Whenever we see that we will have to use sliding window, start with finding valid window and keep calculating the length of the window and once you encounter the invalid window, you shrink it.

VALID WINDOW:

[1,1,1,2,2,4]:  

left==0 and right==2

If this window is valid then before index=2, all element would be 2

[2,2,2]--> ideal_sum=6

but actual_sum is 3

so if (ideal_sum-actual_sum<=k) ---valid

INVALID WINDOW:

[1,1,1,2,2,4]:  

left==0 and right==3

ideal_sum= 8

actual_sum=5

(ideal_sum- actual_sum)= 3, means in order to make it a valid window i have to do atleast 2 moves which i cannot do because my k==2

shrink the window, update actual_sum and ideal_sum

phewww

