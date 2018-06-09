// 2018.6.9
public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new LinkedList<>();
        if (s.equals("")) {
            return result;
        }
        while (!s.equals("")) {
            int splitIndex = s.indexOf("#");
            int len = Integer.valueOf(s.substring(0, splitIndex));
            String next = s.substring(splitIndex + 1, splitIndex + len + 1);
            result.add(next);
            if (splitIndex + len + 1 < s.length()) {
                s = s.substring(splitIndex + len + 1);
            }
            else {
                s = "";
            }
        }
        return result;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));