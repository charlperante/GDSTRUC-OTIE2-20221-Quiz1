public class Main {
    public static void main(String[] args) {

        // Initialize variables
        int[] numbers1 = new int[10];
        int[] numbers2 = new int[10];

        numbers1[0] = 32; numbers1[1] = 56;
        numbers1[2] = 35; numbers1[3] = 86;
        numbers1[4] = -8; numbers1[5] = 145;
        numbers1[6] = 63; numbers1[7] = 10;
        numbers1[8] = 67; numbers1[9] = 14;

        numbers2[0] = 54; numbers2[1] = 87;
        numbers2[2] = 23; numbers2[3] = 102;
        numbers2[4] = -13; numbers2[5] = 135;
        numbers2[6] = 10; numbers2[7] = 14;
        numbers2[8] = 45; numbers2[9] = 23;

        // Print numbers before bubble sort
        System.out.println("Before Bubble Sort: ");
        printArrayElements(numbers1);

        // Execute bubble sort
        bubbleSort(numbers1);
        System.out.println("\n\nAfter Bubble Sort (Descending): ");
        printArrayElements(numbers1);

        // Print numbers before selection sort
        System.out.println("\n\nBefore Selection Sort: ");
        printArrayElements(numbers2);

        // Execute selection sort
        selectionSort(numbers2);
        System.out.println("\n\nAfter Selection Sort (Descending): ");
        printArrayElements(numbers2);
    }
    private static void bubbleSort(int[] arr)
    {
        // Loop to check each array element
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            // Loop to compare array elements
            for (int i = 0; i < lastSortedIndex; i++)
            {
                // Compare two adjacent elements
                if (arr[i] < arr[i + 1])
                {
                    // Swap elements if not in place
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }}}}

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = 0; lastSortedIndex < arr.length - 1; lastSortedIndex++)
        {
            int smallestIndex = lastSortedIndex;

            for (int i = lastSortedIndex + 1; i < arr.length; i++)
            {
                if (arr[i] > arr[smallestIndex])
                {
                    smallestIndex = i;

                }}
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }}

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}