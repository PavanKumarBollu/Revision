import java.util.*;
class ArraysMethods 
{
	public static void main(String[] args) 
	{


		int[] arr1 = new int[]{5,4,3,2,1};
		System.out.println("Array Before Sorting : " + Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("Array After Sorting : " + Arrays.toString(arr1));
		System.out.println(" ");
		System.out.println(" ");




		System.out.println("BinarySearch() method : for finding the elements in the sorted Array ");
		int index = Arrays.binarySearch(arr1, 4);
		System.out.println("Index of the 4 is : " + index);
		System.out.println(" ");
		System.out.println(" ");





		int[] arr2 = new int[]{1,2,3,4,5};
		System.out.println("Comparing the Arrays : " + Arrays.equals(arr1, arr2));
		System.out.println(" ");
		System.out.println(" ");




		int[] arr3 = new int[5];
		System.out.println("Filling the Arrays with 5 as a default value in every location : ");
		System.out.println("Before Filling array :  "+ Arrays.toString(arr3));
		Arrays.fill(arr3, 5);
		System.out.println("After Filling array :  " + Arrays.toString(arr3));
		System.out.println(" ");
		System.out.println(" ");
			
		

		int [] arr4 = new int[]{2,3,1,4,5,6,73, 54,232,124,64,75,34,23,32,75,23,34,5432,636,74,234,343,252,231,123,124,125,126,127,128};

		System.out.println("Copying the elements form the array4 : " );
		int[] arr5 =new int[arr4.length];
		System.out.println("Array Before Coping : " + Arrays.toString(arr5));
		arr5=	Arrays.copyOf(arr4, arr5.length);
		System.out.println("Array After  Coping : " + Arrays.toString(arr5));
		System.out.println(" ");
		System.out.println(" ");


		System.out.println("Copying Specific Range :  ");
		int[] arr6 = Arrays.copyOfRange(arr4,0,6);
		Arrays.sort(arr6);
		System.out.println("copied Range Elements : " + Arrays.toString(arr6));

		System.out.println("Converting the Array Into List : ");
		List l=	Arrays.asList(arr4);

		System.out.println("Copied List elements are :  " + l);

		System.out.println("Arrays Stream Object to Access the elements ");
		Arrays.stream(arr4).forEach(System.out::print );
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("Arrays.setAll(array, lamdaExpresion) Method ");

		int[] arr7 = new int[7];
		Arrays.setAll(arr7, i->i * 2);

		System.out.println("After Arrays.setAll() method Execution :  " + Arrays.toString(arr7));
		
		
	}
}
