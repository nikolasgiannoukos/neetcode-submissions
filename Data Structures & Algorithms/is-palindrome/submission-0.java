class Solution {
    public boolean isPalindrome(String s) {
        String finalString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();;

         char[] strarray = finalString.toCharArray();

        int start = 0;
        int end = strarray.length-1;

        while (start < end) {

            if (strarray[start] != strarray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
// sa vv as
// .    .