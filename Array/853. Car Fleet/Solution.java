// TreeMap
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position == null || position.length == 0 || speed == null || speed.length == 0) {
            return 0;
        }
        int len = position.length;
        Map<Integer, Double> map = new TreeMap<>();
        int i;
        int fleet = 0;
        for (i = 0; i < len; i++) {
            double time = (double)(target - position[i]) / speed[i];
            map.put(-position[i], time);
        }
        double prev = 0;
        for (double time : map.values()) {
            if (time > prev) {
                prev = time;
                fleet++;
            }
        }
        return fleet;
    }
}


// Stack
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position == null || position.length == 0 || speed == null || speed.length == 0) {
            return 0;
        }
        int len = position.length;
        
        Pair[] pairs = new Pair[len];
        
        int count = 0;
        int i;
        
        for (i = 0; i < len; i++) {
            pairs[i] = new Pair(position[i], speed[i]);
        }
        Arrays.sort(pairs, new Comparator<Pair>() {
           @Override
            public int compare(Pair p1, Pair p2) {
                if (p1.position == p2.position) {
                    return p2.speed - p1.speed;
                }
                return p1.position - p2.position;
            }
        });
        Stack<Double> stack = new Stack<>();
        i = pairs.length - 1;
        stack.push((double)(target - pairs[i].position) / pairs[i].speed);
        int fleet = 1;
        for (i = pairs.length - 2; i >= 0; i--) {
            double time = (double)(target - pairs[i].position) / pairs[i].speed;
            if (time > stack.peek()) {
                fleet++;
                stack.push(time);
            }
        }
        return fleet;
    }
}

class Pair {
    int position;
    int speed;
    Pair(int p, int s) {
        this.position = p;
        this.speed = s;
    }
}