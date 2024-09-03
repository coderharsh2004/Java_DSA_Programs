import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();int flag=0;int j=0;
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Element to be searched");
        int x = sc.nextInt();
        for(j=0;j<n;j++){
            if(arr[j]==x){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Element present at Position:"+(j+1));
        }
    }
}
