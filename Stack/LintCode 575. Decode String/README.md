Time spent : 30 min(Self)

Solution : 1 Stack or 2 Stack

GIVEN: an expression s includes number, letters, and brackets. 

RETURNS: Expanded expression

Example:

s = `abc3[a]` return `abcaaa`
s = `3[abc]` return `abcabcabc`
s = `4[ac]dy`, return `acacacacdy`
s = `3[2[ad]3[pf]]xyz`, return `adadpfpfpfadadpfpfpfadadpfpfpfxyz`

Solution:

1 Stack:

The main idea is when current char is not ']', then we push the character into stack. Otherwise we need to first arrange the string that between the bracket.

`String str = ""`

`while (!stack.peek().equals("[")) {`

`  str = stack.pop() + str;`

`}`

After that, we need to know how many string int [] should be append. So we also need to arrange the repeat times. 

`String num = ""`

`while (!stack.isEmpty() && isNum(stack.peek())) {`

`num = stack.pop() + num;`

`}`

After that we parse the num to integer. If the integer is not 0, we make a newstr, that repeate str for num times, and push that string into stack again.

At last, the stack is not empty, we reversely append stack.pop() into result string. 

For the example, 3[abc].

First we push 3[abc into stack. Then we came into ]. We pop all character until [. Now string is "abc". Then we pop '[', initiate a string num. Now the num is 3 which is not 0, so we append abc to result 3 times, and push "abcabcabc" into stack. At last, the result is just "abcabcabc".



2 Stack:

One store repeatTimes, one store the string before '['.

When the character is digit, we continuous calculate the number, and push the number into counts stack.

`if (Character.isDigit(s.charAt(i))) {`

`while (Character.isDigit(s.charAt(i))) {`

`count = count * 10 + s.charAt(i) - '0';`

`i++;}`

`counts.push(count);`

`count = 0;}`

Else if we came into '[', we just push current result into tempStr. Assign result to "", and add i.

Else if we came into ']', we pop the tempStr, cause it is previous result. And pop the repeat time from counts. Append it to previous result cnt times.

Other condition is just letters, we append to result and add i.

For example 3[abc], count first is 3, counts stack has 3 in it. 

Then '[', we push result("") into it. Then assign result "".

Then abc we append to result, now result is "abc".

Then ']', we pop tempStr which is "", and repeat times 3. Then final result is "abcabcabc"