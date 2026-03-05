import java.util.Scanner;

class SearchThread extends Thread {
    int[] arr;
    int start, end, key;

    SearchThread(int[] arr, int start, int end, int key) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.key = key;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            if (arr[i] == key) {
                System.out.println(
                    "Element " + key + " found at pos " + (i+1)
                );
            }
        }
    }
}

class Pgm28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int threads = n / 5;
        if (threads == 0)
            threads = 1;

        int chunkSize = n / threads;
        int start = 0;

        for (int i = 0; i < threads; i++) {
            int end = (i == threads - 1) ? n : start + chunkSize;

            SearchThread t = new SearchThread(arr, start, end, key);
            t.setName("Thread-" + (i + 1));
            t.start();

            start = end;
        }
    }
}