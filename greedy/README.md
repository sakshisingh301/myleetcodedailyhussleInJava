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


QUEUE RECONSTRUCTION BY HEIGHT

I started sorting the array by height in decreasing order

but what about when heights are equal then sort the array by positioning in increasing order

people = [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]

after sort

[ [7,0], [7,1], [6,1], [5,0], [5,2], [4,4] ]

Now we ask like this:

[7,0]--i want 0 tall people in front of me so lets put this on the 0th index.

[7,1]-- I want to have 1 tall(or same height) people in front of me. put me at 1st index.

[7,0],[7,1]

[6,1]-- I want 1 tall person in front of me so i will put this at index 1 but element which is already present will be shifted.

[7,0],[6,1],[7,1]

[5,0]-- I want 0 tall person in front of me so put me at index 0

[[5,0], [7,0], [6,1], [7,1]]

[5,2]-- I want 2 tall person in front of me so put me at index 2

[[5,0], [7,0], [5,2], [6,1], [7,1]]

[4,4]--I can afford to have 4 tall or same height person in front of me so put me at index 4th

[[5,0], [7,0], [5,2], [6,1], [7,1], [4,4]]

start learning lambda function in java properly





