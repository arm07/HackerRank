import java.util.Scanner;


public class DuplicatesArray {

		public static void main(String[] args) 
	    {
			Scanner s=new Scanner(System.in);
			System.out.print("enter size of array");
			int size=s.nextInt();
			int[] nums=new int[size];
			System.out.print("enter array of numbers");	
			for (int i = 0; i < nums.length; i++) {
				nums[i]=s.nextInt();
			}   
	        //printRepeating(nums, size);
	        findBiggestNSmallest(nums);
	    }	
		static void findBiggestNSmallest(int[] numbers){
			int smallest=numbers[0],largest=numbers[0];
			for (int i : numbers) {
			    if (i < smallest) {
			        smallest = i;
			    } // end finding smallest
			    else if (i > largest) {
			        largest = i;
			    } // end finding largest number 
			} 
			System.out.println("Largest ele:"+largest);
			System.out.println("Smalest Ele:"+smallest);	
		}
	    static void printRepeating(int arr[], int size)
	    {
	        int i;  
	        System.out.println("The repeating elements are : ");  
	        for (i = 0; i < size; i++)
	        {
	            if (arr[Math.abs(arr[i])] >= 0)
	                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
	            else
	                System.out.print(Math.abs(arr[i]) + " ");
	        }         
	    } 
}