//Cameron Grigsby
import java.util.*;
public class Lab1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int [] nums = {1,4,13,43,-25,17,22,-37,19};
System.out.println("The largest value in nums is : " + findlargest(nums));
int [] data = new int [20];
randGenerator(data);
System.out.println("The largest value in data is: " + findlargest(data));
System.out.println("The sum of nums and dat is: "+ (findlargest(nums) + findlargest(data)));
System.out.print("Contents of data: [");
for(int i =0; i < data.length; i++) {
	int count = data[i];
	System.out.print(count + ",");
}
System.out.print("]\n");
System.out.print("Longest series of positive integers: " + longestPositiveSeries(data));
	}
public static int findlargest (int array[]) {
	int max = 0;
	for (int i=0; i< array.length; i++) {
		if (array[i] > max) {
			max = array[i];
		}
	}
	return max;
}
public static void randGenerator (int [] array) {
	Random rand = new Random();
	for(int i =0; i< array.length; i++) {
		array[i] = -100 + rand.nextInt(201);
	}
}
public static int longestPositiveSeries (int [] array) {
	int count = 0;
	int longestPositiveInt = 0;
	for (int i = 0; i < array.length; i++) {
		if (array[i] > 0) {
			count++;
			if(longestPositiveInt < count)
				longestPositiveInt = count;
		}
		else 
			count = 0;
	}
	return longestPositiveInt;
}
}