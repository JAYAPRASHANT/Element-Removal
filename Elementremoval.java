package Elementremoval;
import java.util.Scanner;
public class Elementremoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			int max=a[0];
			
			
		}
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
		}
		
		int cost=0;
		for(int i=0;i<n;i++) {
			cost+=(a[i]*(i+1));
			
		}System.out.println(cost);

	}

}

