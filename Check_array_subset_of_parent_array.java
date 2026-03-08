class Check_array_subset_of_parent_array {
    public static void main(String[] args) {
        int[] a = { 11, 7, 1, 13, 21, 3, 7, 3 };
        int[] b = { 11, 3, 7, 1, 12 };
        int[] sortedA = sortArray(a);
        int[] sortedB = sortArray(b);

        boolean res = checkSubArray(sortedA, sortedB);
        if (res) {
            System.out.print("Given array sub array of their parent array");
        } else {
            System.out.print("Given array is not sub array of their parent array");
        }

    }

    // sort the array
    static int[] sortArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    // check given array subset of parent array or not
    static boolean checkSubArray(int[] a, int[] b) {
        int x = 0, y = 0;
        while (x < a.length && y < b.length) {
            if (a[x] == b[y]) {
                x++;
                y++;
            } else {
                x++;
            }
            if (y == b.length) {
                return true;
            }
        }
        return false;
    }
}