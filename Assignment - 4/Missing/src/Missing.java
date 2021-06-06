import java.util.*;
 
class Missing{
static void printMissingElements(int arr[],
                                 int N)
{
    int diff = arr[0] - 0;
 
    for(int i = 0; i < N; i++)
    {
        if (arr[i] - i != diff)
        {
            while (diff < arr[i] - i)
            {
                System.out.print((i + diff) + " ");
                diff++;
            }
        }
    }
}
public static void main (String[] args)
{
    int arr[] = { 6, 5, 8, 15, 17 };
     
    int N = arr.length;
    printMissingElements(arr, N);
}
}
 
