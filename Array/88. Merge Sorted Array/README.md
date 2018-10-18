Time spent :  min()

GIVEN:

RETURNS:

EXAMPLES:

Algorithm:



For the problem of merge k sorted arrays, that is given k sorted arrays of size n each. There are three thoughts:

1. Create an output array of size n * k, and one by one copy all arrays into it, then using any O(nlogn) sorting algorithm. This approach takes O(nk log nk) time.
2. One efficient solution is to first merge arrays into groups of 2. After first merging, we have k / 2 arrays. We again merge arrays in groups, now we have k / 4 arrays. Keep doing it until we have one array left. The time complexity is O(nk log k). As every merging in first iteration takes 2n time, since there are k / 2 merging, total time in first iteration would be O(nk). There are O(log k) iterations, so the time complexity is O(nk log k)
3. Another efficient solution is to use min heap. The time complexity is also O(nk log k), but for different sized array, it works much better. First create an output array of size n * k, then create a min heap of size k and insert 1st element in all the arrays in the heap. Finally repeat following steps  n * k times. Get minimum element from heap, store it in output array, replace heap root with next element from the array from which the element is extracted.