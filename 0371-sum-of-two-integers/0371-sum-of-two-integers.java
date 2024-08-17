class Solution {
    public int getSum(int a, int b) {

        while( b != 0){
    
            int carry = a & b;
             a ^= b; // -> equivalent to   a=a+b, a=a^b, 
            
            //so, now sum would be 3, which is the value of a.
	
            b = carry << 1; 
        }
        return a;
    }
}