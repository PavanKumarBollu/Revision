import java.util.Arrays;
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

		int[] arr2 = new int[]{1,2,3,4,5};

		System.out.println("Comparing the Arrays : " + Arrays.equls(arr1, arr2));

			
		
		
		
	}
}
