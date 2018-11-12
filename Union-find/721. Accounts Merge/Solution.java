class Solution {
    UnionFind uf;
    
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> result = new LinkedList<>();
        int len = accounts.size();
        uf = new UnionFind(len);
        Map<String, List<Integer>> emailToIds = getEmailToIds(accounts);
        for (String email : emailToIds.keySet()) {
            List<Integer> ids = emailToIds.get(email);
            for (int i = 1; i < ids.size(); i++) {
                uf.union(ids.get(0), ids.get(i));
            }
        }
        
        Map<Integer, Set<String>> idToEmails = getIdToEmails(accounts);
        for (Integer id : idToEmails.keySet()) {
            Set<String> emails = idToEmails.get(id);
            List<String> list = new LinkedList<>(emails);
            String name = accounts.get(id).get(0);
            list.add(0, name);
            result.add(list);
        }
        return result;
    }
    
    private Map<String, List<Integer>> getEmailToIds(List<List<String>> accounts) {
        Map<String, List<Integer>> emailToIds = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            List<String> account = accounts.get(i);
            for (int j = 1; j < account.size(); j++) {
                String email = account.get(j);
                if (!emailToIds.containsKey(email)) {
                    emailToIds.put(email, new LinkedList<>());
                }
                emailToIds.get(email).add(i);
            }
        }
        return emailToIds;
    }
    
    private Map<Integer, Set<String>> getIdToEmails(List<List<String>> accounts) {
        Map<Integer, Set<String>> idToEmails = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            int root = uf.find(i);
            List<String> account = accounts.get(i);
            if (!idToEmails.containsKey(root)) {
                idToEmails.put(root, new TreeSet<>());
            }
            for (int j = 1; j < account.size(); j++) {
                String email = account.get(j);
                idToEmails.get(root).add(email);
            }
        }
        return idToEmails;
    }
    
    class UnionFind {
        int[] father;
        
        UnionFind (int n) {
            father = new int[n];
            for (int i = 0; i < n; i++) {
                father[i] = i;
            }
        }
        
        void union(int x, int y) {
            int root_x = find(x);
            int root_y = find(y);
            if (root_x != root_y) {
                father[root_x] = root_y;
            }
        }
        
        int find (int num) {
            if (father[num] == num) {
                return num;
            }
            
            Stack<Integer> stack = new Stack<>();
            while (father[num] != num) {
                stack.push(num);
                num = father[num];
            }
            while (!stack.isEmpty()) {
                father[stack.pop()] = num;
            }
            return num;
        }
    }
}