class countReversePair {
    public static int countRevPairs(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static int mergeSort(int[] arr, int left, int right) {
        if (left >= right)
            return 0;
        
        int mid = left + (right - left) / 2;
        
        int count = 0;
        count += mergeSort(arr, left, mid);
        count += mergeSort(arr, mid + 1, right);
        
        // Count reverse pairs
        count += countPairs(arr, left, mid, right);
        
        // Merge the two halves
        merge(arr, left, mid, right);
        
        return count;
    }

    static int countPairs(int[] arr, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;
        
        for (int i = left; i <= mid; i++) {
            while (j <= right && arr[i] > 2L * arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        
        return count;
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        
        while (i < n1) {
            arr[k++] = L[i++];
        }
        
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
    public static void main(String[] args) {
        int arr[]={3,23,23,2,2,1,3,1};
        System.out.println(countRevPairs(arr));
    }
}
