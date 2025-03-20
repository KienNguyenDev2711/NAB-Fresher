# NAB-Fresher - This's just a suggested solution

## Task 1:
![Task 1](/image/image.png)
- Count the times each letter can appear:  
cnt = n / numLetters

 - Count how many different letters can be used:
num_letters = min(26, n)

 - Create a string by looping through the letters and adding them to the resulting string.    


## Task 2:

![Task 2](/image/image-2.png)    

 - Iterate through tasks: Use a loop to iterate through tasks from start to finish.
 - Check condition: On each day, start from one task and continue adding next tasks if the difficulty difference does not exceed X.
 - Increase number of days: When the next task cannot be added on the current day, increase the number of days and start a new day with the next task.

## Task 3:
![Task 3](/image/image-3.png)
 #### Let's init left array and right array:
 - left array: Stores the maximum distance the frog can jump to the left from each block.
 - right array: Stores the maximum distance the frog can jump to the right from each block.
 1) Calculate left:
 Traverse from left to right, if the current block is higher than or equal to the previous block, increase the jump distance.
 2) Calculate right:
 Traverse from right to left, if the current block is higher than or equal to the next block, increase the jump distance.
 3) Find maximum distance:
Traverse all blocks and sum the left and right jump distances, add 1 (current position), to find the maximum distance.