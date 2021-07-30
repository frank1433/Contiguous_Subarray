import java.util.Arrays;

public class SubArraySum {

    int subArraySum(int arr[], int n, int sum) {
        int curr_sum, i, j;

        for (i = 0; i < n; i++) {
            curr_sum = arr[i];

            for (j = i + 1; j <= n; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println("Sum found between index " + i + " to " + p + " = " + sum);
                    int[] subArray = Arrays.copyOfRange(arr, i, p + 1);
                    System.out.print("Elements are ");
                    for (int t = 0; t < subArray.length; t++) {

                        System.out.print(subArray[t] + ", ");
                    }
                    return 1;
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }

        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args) {
        SubArraySum arraysum = new SubArraySum();
        int arr[] = { 14, 12, 70, 15, 99, 65, 21, 90 };
        int n = arr.length;
        int X = 97;
        arraysum.subArraySum(arr, n, X);
    }
}