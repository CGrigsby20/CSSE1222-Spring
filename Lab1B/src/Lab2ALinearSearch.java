//Cameron Grigsby
import java.util.*;
public class Lab2ALinearSearch {
static int key;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] nums = {1,4,4,22,-5,10,21,-47,23};
Scanner scan = new Scanner(System.in);
System.out.println("Enter number to be found:");
key = scan.nextInt();
System.out.print("Nums: [");
for(int i =0; i<nums.length; i++){
	int count = nums[i];
	System.out.print(count +", ");
}
System.out.print("]\n");
if (linearSearch(nums) != -1) {
	System.out.println("Index of key: " + linearSearch(nums));}
	else
		System.out.println("Value not found in the array");
int [] data = new int [20];
randNumGenerator(data);
System.out.print("Data: [");
for(int i =0; i<data.length; i++){
	int count2 = data[i];
	System.out.print(count2 + ", ");
}
System.out.print("]\n");
if (linearSearch(data) != -1) {
	System.out.println("Index of key: " + linearSearch(data));}
	else
		System.out.println("Value not found in the array");
	}
	
	public static int linearSearch (int [] array) {
		int index = -1;
		for(int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				index = i;}
		}
		return index;
	}
	
	public static void randNumGenerator( int [] array) {
		Random rand = new Random();
		for(int i=0; i < array.length; i++) {
			array[i] = -100 + rand.nextInt(201);
		}
	}
}


