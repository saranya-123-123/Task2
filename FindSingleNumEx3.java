package week1.day2;

public class FindSingleNumEx3 {

	public static void main(String[] args) {
	

		int arr[]= {1};
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = 0; j < arr.length; j++) {
					
	if(arr[i]==arr[j]) {
		count=count+1;	}}
					if(count==1) {
				
				System.out.println(arr[i]);
			}}}}



