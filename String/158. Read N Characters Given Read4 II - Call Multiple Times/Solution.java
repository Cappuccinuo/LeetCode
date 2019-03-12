/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf); 
 */
public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    int start = 0;
    int end = 0;
    char[] cache = new char[4];
    
    public int read(char[] buf, int n) {
        int hasRead = 0;
        while (hasRead < n) {
            if (start == end) {
                start = 0;
                end = read4(cache);
                if (end == 0) {
                    break;
                }
            }
            buf[hasRead++] = cache[start++];
        }
        return hasRead;
    }
}