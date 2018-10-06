class Solution {
    UnionFind uf;

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> result = new LinkedList<>();
        int N = accounts.size();
        uf = new UnionFind(N);
        Map<String, List<Integer>> emailToIds = getEmailToIds(accounts);
        for (String email : emailToIds.keySet()) {
            List<Integer> ids = emailToIds.get(email);
            for (int i = 1; i < ids.size(); i++) {
                uf.union(ids.get(i), ids.get(0));
            }
        }

        Map<Integer, Set<String>> idToEmails = getIdToEmails(accounts);
        for (Integer user_id : idToEmails.keySet()) {
            Set<String> emails = idToEmails.get(user_id);
            List<String> sortedEmails = new LinkedList<>(emails);
            sortedEmails.add(0, accounts.get(user_id).get(0));
            Collections.sort(sortedEmails);
            result.add(sortedEmails);
        }
        return result;
    } 

    private Map<String, List<Integer>> getEmailToIds(List<List<String>> accounts) {
        Map<String, List<Integer>> emailToIds = new HashMap<>();

        for (int user_id = 0; user_id < accounts.size(); user_id++) {
            List<String> emails = accounts.get(user_id);
            for (int i = 1; i < emails.size(); i++) {
                String email = emails.get(i);
                if (!emailToIds.containsKey(email)) {
                    emailToIds.put(email, new LinkedList<>());
                }
                emailToIds.get(email).add(user_id);
            }
        }

        return emailToIds;
    }

    private Map<Integer, Set<String>> getIdToEmails(List<List<String>> accounts) {
        Map<Integer, Set<String>> idToEmails = new HashMap<>();

        for (int user_id = 0; user_id < accounts.size(); user_id++) {
            int id = uf.find(user_id);
            List<String> account = accounts.get(user_id);
            Set<String> emailSet = idToEmails.getOrDefault(id, new HashSet());
            for (int i = 1; i < account.size(); i++) {
                emailSet.add(account.get(i));
            }
            idToEmails.put(id, emailSet);
        }

        return idToEmails;
    }
}

class UnionFind {
    int[] father;

    UnionFind(int n) {
        father = new int[n];
        for (int i = 0; i < n; i++) {
            father[i] = i;
        }
    }

    int find(int id) {
        if (father[id] == id) {
            return id;
        }
        return find(father[id]);
    }

    void union(int id1, int id2) {
        int root1 = find(id1);
        int root2 = find(id2);
        if (root1 != root2) {
            father[root1] = father[root2];
        }
    }
}