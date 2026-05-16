class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        String newStr = sb.toString().toLowerCase();

        int left = 0;
        int right = newStr.length()-1;

        while(left < right){
            if(newStr.charAt(left) != newStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
