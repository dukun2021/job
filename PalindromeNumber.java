//学号：202002652
//姓名：杜焜


class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        if(x<0) {
            return false;
        }
        else{
            int b=0;
            while(x>0){
                int c=x%10;
                b=b*10+c;
                x/=10;
            }
            if(b==a){
                return true;
            }
            else{
                return false;
            }
        } 
    }
}
