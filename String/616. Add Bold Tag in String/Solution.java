class Solution {
    public String addBoldTag(String s, String[] dict) {
        if (dict == null || dict.length == 0) {
            return s;
        }
        List<Interval> list = new LinkedList<>();
        for (String d : dict) {
            int startIndex = s.indexOf(d);
            while (startIndex >= 0) {
                list.add(new Interval(startIndex, startIndex + d.length()));
                startIndex = s.indexOf(d, startIndex + 1);
            }
        }

        list = mergeInterval(list);
        
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = 0;
        for (Interval i : list) {
            end = i.start;
            sb.append(s.substring(start, end));
            sb.append("<b>");
            sb.append(s.substring(i.start, i.end));
            sb.append("</b>");
            start = i.end;
        }
        if (start < s.length()) {
            sb.append(s.substring(start));
        }
        
        return sb.toString();
    }
    
    private List<Interval> mergeInterval(List<Interval> list) {
        List<Interval> result = new LinkedList<>();
        int len = list.size();
        int[] start = new int[len];
        int[] end = new int[len];
        int index = 0;
        for (Interval i : list) {
            start[index] = i.start;
            end[index] = i.end;
            index++;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int i, j = 0;
        for (i = 0; i < len; i++) {
            if (i == len - 1 || start[i + 1] > end[i]) {
                result.add(new Interval(start[j], end[i]));
                j = i + 1;
            }
        }
        return result;
    }
}

class Interval {
    int start;
    int end;
    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}