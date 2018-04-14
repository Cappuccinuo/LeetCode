// 2018.4.13

public class Codec {
    Map<Integer, String> urlMap = new HashMap<>();
    int count;
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        urlMap.put(count, longUrl);
        return "http://tinyurl.com/" + count++;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urlMap.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));