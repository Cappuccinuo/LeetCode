class ExamRoom {
    private TreeSet<Integer> students;
    private int N;
    
    public ExamRoom(int N) {
        this.N = N;
        students = new TreeSet<>();
    }
    
    public int seat() {
        int student = 0;
        if (students.size() > 0) {
            Integer prev = null;
            int dist = students.first();
            for (Integer s : students) {
                if (prev != null) {
                    int d = (s - prev) / 2;
                    if (d > dist) {
                        dist = d;
                        student = d + prev;
                    }
                }
                
                prev = s;
            }
            
            if (N - 1 - students.last() > dist) {
                student = N - 1;
            }
        }
        
        students.add(student);
        return student;
    }
    
    public void leave(int p) {
        students.remove(p);
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(N);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */