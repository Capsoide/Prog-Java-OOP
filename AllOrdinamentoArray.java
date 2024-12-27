
/*Bubble Sort: Semplice da implementare, ma inefficiente per grandi quantita' di dati. Non e' generalmente raccomandato per l'uso in situazioni reali.

Selection Sort: Anche se semplice, e' inefficiente. Deve fare molte operazioni anche se l'array e' quasi ordinato. Non e' spesso preferito per grandi quantita' di dati.

Insertion Sort: Efficiente per piccoli array o quando l'array e' gia' parzialmente ordinato. Non e' molto efficiente per grandi quantita' di dati.

Merge Sort: E' efficiente e stabile indipendentemente dai dati in input, ma richiede spazio aggiuntivo per l'array temporaneo durante la fase di merging.

Quick Sort: E' generalmente veloce ed efficiente. Puo' pero' avere prestazioni peggiori in situazioni in cui l'array e' quasi ordinato o ha molte ripetizioni*/

import java.util.Arrays;

public class AllOrdinamentoArray {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrBubble = arr.clone();
        int[] arrSelection = arr.clone();
        int[] arrInsertion = arr.clone();
        int[] arrMerge = arr.clone();
        int[] arrQuick = arr.clone();

        System.out.println("Array iniziale: " + Arrays.toString(arr));

        // Bubble Sort
        bubbleSort(arrBubble);
        System.out.println("Bubble Sort: " + Arrays.toString(arrBubble));

        // Selection Sort
        selectionSort(arrSelection);
        System.out.println("Selection Sort: " + Arrays.toString(arrSelection));

        // Insertion Sort
        insertionSort(arrInsertion);
        System.out.println("Insertion Sort: " + Arrays.toString(arrInsertion));

        // Merge Sort
        mergeSort(arrMerge, 0, arrMerge.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(arrMerge));

        // Quick Sort
        quickSort(arrQuick, 0, arrQuick.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(arrQuick));
    }
}