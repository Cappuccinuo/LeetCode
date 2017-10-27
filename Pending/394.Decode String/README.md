1.Character.isDigit()     judge if the character of string is a digit</br>
2.s.charAt(idx) - '0'     Character->Integer</br>
3.StringBuilder    sb.insert(n,ch)    sb.append(ch)</br>
4.The train of thought is similar with Arithmetic expression evaluation</br>

<Strong>Two-Stack algorithm</Strong></br>
Value : push onto the value stack</br>
Operator : push onto the operator stack</br>
Left parenthesis : ignore</br>
Right parenthesis : pop operator and two values; </br>
push the result of applying that operator to those values onto the operand stack.
