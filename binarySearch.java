
package binarySearch;
public class binarySearch
{
	public static int searchElementAndReturnTheIndex(int[] arr, int number)
	{
		if (arr == null || arr.length == 0) {
			return -1;
		}
		
		int start = 0;
		int end= arr.length-1;
		
		while (start<=end) {
			int mid=(start+end)/2;
			if ((arr[mid]==number) && ((mid==0) ||(arr[mid-1]<number))) {
				return mid;
			}
			else if (number<=arr[mid]) {
				end = mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}


public static void main(String[] args)
{
	int [] arr= {0,1,2,2,4,5,5,4,7,7,5,8};
	int number = 5;
	int index = searchElementAndReturnTheIndex(arr,number);
	System.out.println("Element " + number + (index >= 0 ? (" found at index " + index) : " not found!"));
}

}
