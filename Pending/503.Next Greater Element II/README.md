The first typical way to solve circular array problems is to extend the original array to twice length, </br>
2nd half has the same element as first half.</br>
Naive by simple solution, just look for the next greater element directly.</br>
Time complexity: O(n^2).</br>

</br>
The second way is to use a stack to facilitate the look up. </br>
First we put all indexes into the stack, smaller index on the top. </br>
Then we start from end of the array look for the first element (index) in the stack which is greater than the current one. </br>
That one is guaranteed to be the Next Greater Element. Then put the current element (index) into the stack.</br>
Time complexity: O(n).</br>
