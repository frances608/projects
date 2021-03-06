import java.util.*;
	
public class medianTwoSortedArrays{
		
	static int Calculate_median(int a1[], int a2[], int n){
		int i = 0;
		int j = 0;
		int cnt;
		int x = -1, y = -1;

		for (cnt = 0; cnt <= n; cnt++){
			if (i == n){
				x = y;
				y = a2[0];
				break;
			}
			else if (j == n)
			{
				x = y;
				y = a1[0];
				break;
			}

			if (a1[i] < a2[j])
			{
				x = y;
				y = a1[i];
				i++;
			}
			else
			{
				x = y;
				y = a2[j];
				j++;
			}
		}

		return (x + y)/2;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num, i;
		System.out.println("Enter the number of elements: ");
		num = sc.nextInt();
		int a1[] = new int[num];
		int a2[] = new int[num];
		System.out.println("Enter the first array elements: ");
		for(i=0; i<num; i++)
			a1[i] = sc.nextInt();
		System.out.println("Enter the second array elements: ");
		for(i=0; i<num; i++)
			a2[i] = sc.nextInt();
		System.out.println("Median: ");
		System.out.print(Calculate_median(a1, a2, num));
	}
}