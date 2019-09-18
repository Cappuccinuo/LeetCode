class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        Set<String> result = new HashSet();
        Map<String, List<Info>> map = new HashMap<>();
        
        for (String transaction : transactions) {
            String[] info = transaction.split(",");
            String name = info[0];
            int time = Integer.parseInt(info[1]);
            int amount = Integer.parseInt(info[2]);
            String city = info[3];
            
            if (amount > 1000) {
                result.add(transaction);
            }
            
            List<Info> infos = map.get(name);
            
            if (infos == null) {
                infos = new LinkedList<>();
                infos.add(new Info(name, time, amount, city, transaction));
                map.put(name, infos);
            }
            else {
                for (Info i : infos) {
                    if (!i.city.equals(city) && Math.abs(i.time - time) <= 60) {
                        result.add(i.transaction);
                        result.add(transaction);
                    }
                }
                
                infos.add(new Info(name, time, amount, city, transaction));
            }
        }

        return new LinkedList<>(result);
    }
}

class Info {
    String name;
    int time;
    int amount;
    String city;
    String transaction;
    
    public Info(String name, int time, int amount, String city, String transaction) {
        this.name = name;
        this.time = time;
        this.amount = amount;
        this.city = city;
        this.transaction = transaction;
    }
}