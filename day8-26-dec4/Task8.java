
class Task8 {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // System.out.print("Merged Array: ");
        int size = arr1.length + arr2.length;
        int count = 0;
        int[] ans = new int[size];
        for (int i : arr1) {
            ans[count] = i;
            count++;
        }
        for (int i : arr2) {
            ans[count] = i;
            count++;
        }
        return ans;
    }

    public static int largest(int[] arr) {
        int ans = arr[0];
        for (int i : arr) {
            ans = Math.max(ans, i);
        }
        return ans;
    }

    public static void findIntersection(int[] arr1, int[] arr2) {
        System.out.print("Intersection: ");
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public static int[] findUnion(int[] arr1, int[] arr2) {
        int max = Math.max(largest(arr1), largest(arr2));
        boolean[] present = new boolean[max + 1];

        for (int num : arr1) {
            present[num] = true;
        }

        for (int num : arr2) {
            present[num] = true;
        }

        int count = 0;
        for (boolean b : present) {
            if (b) {
                count++;
            }
        }

        int[] union = new int[count];
        int idx = 0;

        for (int i = 0; i < present.length; i++) {
            if (present[i]) {
                union[idx++] = i;
            }
        }

        return union;
    }

    public static void occurance(int[] arr){
        int size = largest(arr) + 1;

        int[] count = new int[size];

        for(int x:arr) {
            count[x]++;
        }

        for(int i=0; i < size; i++){
            if(count[i] > 0) System.out.println(i + " -> " + count[i]);
        }
    }

    public static void unique(int[] arr){
        int size = largest(arr) + 1;

        int[] count = new int[size];

        for(int x:arr) {
            count[x]++;
        }

        for(int i=0; i < size; i++){
            if(count[i] == 1) System.out.print(i + " ");
        }
    }

    public static void duplicate(int[] arr){
        int size = largest(arr) + 1;

        int[] count = new int[size];

        for(int x:arr) {
            count[x]++;
        }

        for(int i=0; i < size; i++){
            if(count[i] > 1) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 9, 10, 11, 1, 2, 3, 4};
        int[] merged = mergeArrays(arr1, arr2);

        for (int x : merged) {
            System.out.print(x + " ");
        }
        System.out.println("");

        findIntersection(arr1, arr2);

        int[] union = findUnion(arr1, arr2);

        System.out.print("Union of array: ");
        for(int x:union) {
            System.out.print(x + " ");
        }

        System.out.println("\nOccurance: ");
        occurance(union);

        System.out.print("Unique: ");
        unique(union);

        System.out.print("\nDuplicate: ");
        duplicate(union);


    }
}
