TinyURL is a URL shortening service where you enter a URL such as `https://leetcode.com/problems/design-tinyurl` and it returns a short URL such as `http://tinyurl.com/4e9iAk`.

Design the `encode` and `decode` methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.



Using Counter

1. Use a hashmap, key is the integer, value is the original URL for decoding.
2. In encode part, we just use a counter, which is incremented for every new URL encountered.


Using HashCode

1. Use the url's hashcode as the key, and value is url itself. Still using HashMap.
2. Same decoding way as before.

Using Random Number

1. We generate a random integer to be used as the code.
2. The data is again stored in a hashmap to help.