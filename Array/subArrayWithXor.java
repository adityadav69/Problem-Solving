import java.util.HashMap;

class subArrayWithXor {
    public static long subarrayXor(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixXor = 0;
        long count = 0;

        map.put(0, 1);

        for(int i = 0; i < arr.length; i++) {
            prefixXor ^= arr[i];

            int target = prefixXor ^ k;

            if(map.containsKey(target)) {
                count += map.get(target);
            }

            map.put(prefixXor, map.getOrDefault(prefixXor, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[]={2,3,2,4,4,2,5};
        System.out.println(subarrayXor(arr,5));
    }
}

