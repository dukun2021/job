//学号：202002652
//姓名：杜焜

class Solution {
    public int lengthOfLastWord(String s) {
        int a = s.length() - 1;
        while(a >= 0 && s.charAt(a) == ' ') {
            a--;
        }
        if(a < 0) return 0;

        int b = a;
        while(b >= 0 && s.charAt(b) != ' ') {
            b--;
        }
        return a - b;
    }
}
