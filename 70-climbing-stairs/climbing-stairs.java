class Solution {
    public int climbStairs(int n) {
        int []arr = new int[n+1];
        int ans = DP(n,arr);
        return ans;
    }
    private int DP(int n, int arr[]){
        if(n == 1 || n == 2)return n;

        if(arr[n] != 0){
            return arr[n];
        }
        arr[n] = DP(n-1,arr)+DP(n-2,arr);
        return arr[n];
    }
}