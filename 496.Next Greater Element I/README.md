<p>
Model: A decreasing sequence followed by a greater number.</br>
e.g. [7,6,5,3,2,1,4], 4 is the next greater element of 1,2,3 in the sequence.</br>
We use a stack to keep a decreasing sub-sequence, whenever we see a number x greater than stack.peek(),</br> 
we pop all elements less than x, and for all the popped ones, x is their next greater element.</br>
Back to the example above, the stack will first contain [7,6,5,4,3,2,1],</br> 
then 1,2,3 < 4, so we pop 1 2 3, cause their next greater element is 4.
</p>

Some key points:</br>
1. HashMap, Stack Initial Declaration</br>
Don't forget the '( )' at last.

HashMap:</br>
<code>HashMap<Character, Integer> map = new HashMap<Character, Integer>();</code>

Stack:</br>
<code>Stack<Integer> stack = new Stack<Integer>();</code>

2. HashMap Operations</br>
<code>map.put('c', 1);</code></br>
<code>map.getOrDefault('c', -1);</code></br>
<code>if (map.containsKey('c')) { }</code></br>
<code>if (map.containsValue(1)) { }</code></br>
<code>for (Character d : map.keySet()) { }</code></br>
<code>for (Integer i : map.values()) { }</code></br>
<code>map.isEmpty();</code></br>
<code>map.size();</code>

3. Stack Operations</br>
<code>stack.push(0);</code></br>
<code>stack.pop();</code></br>
<code>stack.peek();(Element on the top of the stack)</code></br>
<code>stack.isEmpty();</code></br>
<code>stack.size();</code></br>

4. Stack.peek() < num</br>

5. <strong><em>while</em></strong> (!stack.isEmpty() && Stack.peek() < num)
