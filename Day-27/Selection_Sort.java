class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
         int min =i;
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[j]<arr[min]){
	                min = j;
	            }
	        }
	       return min;
	}
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n-1;i++){
	        //swap
	        int key = select(arr,i);
	        int temp = arr[i];
	        arr[i] = arr[key];
	        arr[key] = temp;
	     }
	        
	  }
}