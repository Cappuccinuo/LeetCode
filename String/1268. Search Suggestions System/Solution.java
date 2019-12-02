class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new LinkedList<>();
        Arrays.sort(products);
        
        for (int i = 1; i <= searchWord.length(); i++) {
            String currentMatching = searchWord.substring(0, i);
            List<String> list = new LinkedList<>();
            for (String product : products) {
                if (product.length() >= i && product.substring(0, i).equals(currentMatching)) {
                    list.add(product);
                    if (list.size() == 3) {
                        break;
                    }
                }
            }
            result.add(list);
        }
        
        return result;
    }
}