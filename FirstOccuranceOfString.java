import java.util.Scanner;

class Solution {
    public static int strStr(String haystack, String needle) {
        int pos = haystack.indexOf(needle);
        if (pos == -1) {
            return -1;
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();

        int result = strStr(haystack, needle);
        System.out.println(result);

        // Close the Scanner object
        sc.close();
    }
}
