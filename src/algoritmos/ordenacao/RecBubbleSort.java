package algoritmos.ordenacao;

import java.util.Arrays;

public class RecBubbleSort {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 8, 4, 1, 9, -2 };
		 
        bubbleSort(arr, arr.length);
 
        // imprime o array ordenado
        System.out.println(Arrays.toString(arr));

	}

	public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    // Fun��o recursivo para realizar ordena��o por bolha no subarray `arr[i�n]`
    public static void bubbleSort(int[] arr, int n)
    {
        for (int i = 0; i < n - 1; i++)
        {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
 
        if (n - 1 > 1) {
            bubbleSort(arr, n - 1);
        }

	}
}
