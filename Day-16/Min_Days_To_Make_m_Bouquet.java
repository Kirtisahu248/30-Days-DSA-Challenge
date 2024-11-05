class Solution {
    public int MaxValue(int[] bloomDay){
        int largest = bloomDay[0];
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] > largest){
                largest = bloomDay[i];
            }
        }
        return largest;
    }
    public int minValue(int[] bloomDay){
        int smallest = bloomDay[0];
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]< smallest){
            smallest = bloomDay[i];
          }
        }
        return smallest;
    }
    public boolean bloomed(int[] bloomDay,int day,int m,int k){
        int cnt =0;
        int no_of_Bouq = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= day){
                cnt++;
            }
            else{
                no_of_Bouq += (cnt/k);
                cnt = 0;
            }
        }
        no_of_Bouq += (cnt/k);
        if(no_of_Bouq >= m){
            return true;
        }
        else{
            return false;
        }
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low = minValue(bloomDay);
        int high = MaxValue(bloomDay);
        long n = bloomDay.length;
        if((long) m * k > n){
            return -1;
        }

        while(low <= high){
            int mid = (low + high)/2;
            boolean possible = bloomed(bloomDay,mid,m,k);
            if(possible == true){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}