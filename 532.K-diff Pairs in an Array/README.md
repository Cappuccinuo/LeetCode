1.`if (nums.length == 0 || k < 0)    return 0`</br>
    pay attention to the corner case</br>
2.`for (int i = 0; i < nums.length; i++)` ----> `for (int i : nums)`</br>
3.`for (Map.Entry<Integer, Integer> entry : map.entrySet()`</br>
4.two cases:</br>
k == 0 || k != 0  ---> `entry.getValue >= 2` || `map.containsKey(entry.getKey() + k)`
