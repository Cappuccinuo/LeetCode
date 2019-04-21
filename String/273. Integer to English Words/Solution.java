class Solution {
    private static final String[] digits = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",                                                 "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", 
                                          "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", 
                                                      "Seventy", "Eighty", "Ninety"};
    private static final String[] orders = new String[]{"Thousand", "Million", "Billion"};
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
    
        int low = num % 1000;
        String result = translateHelper(low);
        
        int i;
        for (i = 0; i < 3; i++) {
            num = num / 1000;
            String current = translateHelper(num % 1000) + " " + orders[i];
            if (num % 1000 != 0) {
                result = current + " " + result.trim();
            }
        }

        return result.trim();
    }
    
    private String translateHelper(int num) {
        int first = num % 10;
        int second = num / 10 % 10;
        int third = num / 100 % 10;
        
        String result = "";
        if (third != 0) {
            String digit = digits[third];
            result = digit + " Hundred";
            if (second != 0 || first != 0) {
                result = result + " ";
            }
        }
        if (second != 0) {
            int combine = second * 10 + first;
            if (combine < 20) {
                result = result + digits[combine];
                return result;
            }
            else {
                result = result + tens[second];
            }
            if (first != 0) {
                result = result + " ";
            }
        }
        if (first != 0) {
            result = result + digits[first];
        }
        return result;
    }
}