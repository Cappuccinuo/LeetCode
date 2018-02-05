class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] arr = a.split("\\+|i");
        String[] brr = b.split("\\+|i");
        int a_real = Integer.parseInt(arr[0]);
        int a_imp = Integer.parseInt(arr[1]);
        int b_real = Integer.parseInt(brr[0]);
        int b_imp = Integer.parseInt(brr[1]);
        return (a_real * b_real - a_imp * b_imp) + "+" + (a_real * b_imp + a_imp * b_real) + "i";
    }
}