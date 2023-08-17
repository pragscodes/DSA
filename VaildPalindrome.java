class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // to remove non aplanumeric characters 
        
        if (s.equals(new StringBuilder(s).reverse().toString())) { 
            return true;
        } else {
            return false;
        }
    }
}

