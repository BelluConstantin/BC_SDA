
public class MergeSort {

	void merge(int arr[], int l, int m, int r) 
    { 
        //Aflarea dimensiunilor celor doua subsiruri care urmeaza sa fie unite
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        // Crearea a doua siruri temporare 
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        // Copierea cifrelor in sirurile temporare
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        // Unirea celor doua siruri temporare //
        // Indexii initiali a primului si al doilea subsir 
        int i = 0, j = 0; 
  
        // Index initial al sirului compus din sirurile temporare
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        // Copierea elementelor din L[] daca exista
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        // Copierea elementelor din R[] daca exista
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Gasirea mijlocului
            int m = (l+r)/2; 
  
            // Sortarea primelor doua jumatati
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Unirea celor doua jumatati sortate
            merge(arr, l, m, r); 
        } 
    } 
  
    // Afisarea sirului
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
   
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7, 14, 16}; 
  
        System.out.println("Sirul dat"); 
        printArray(arr); 
  
        MergeSort array = new MergeSort(); 
        array.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSirul sortat"); 
        printArray(arr); 
    } 
} 

