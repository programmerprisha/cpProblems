class SortArray {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1; 

        for(int j = low; j <= high - 1; j++){
            if(arr[j] < pivot){
                i++; 
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
           int randomIndex = low + (int)(Math.random() * (high - low + 1));
           swap(arr, randomIndex, high);
           int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

}
