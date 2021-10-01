//***BRP 004 (DAY 7) PROGRAM***
//2nd largest and 2nd smallest element from an unsorted array
public class LargestSmallest2nd {
        public static void main(String[] args) {
            int[] a = {6, 8, 2, 4, 3, 1, 5, 7};
            int temp;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] < a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            for (int i = 0; i < a.length; i++)
            {
                System.out.println("second largest element" + a[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            for (int i = 0; i < a.length; i++) {
                System.out.println("second smallest element" + a[i] + " ");
            }
        }
    }


