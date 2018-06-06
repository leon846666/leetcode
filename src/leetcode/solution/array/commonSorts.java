package leetcode.solution.array;

public class commonSorts {

	public static int[] bubbleSort(int arr []) {
		System.out.println("bubbleSort");
		int tem=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					tem=arr[j];
					arr[j]=arr[i];
					arr[i]=tem;
				}
				
			}
		}
		
		
		return arr;
	}
	public static int[] selectSort(int arr []) {
		System.out.println("chooseSort");
		int index=-1;
		int t =0;
		for (int i = 0; i < arr.length; i++) {
			index=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					index=j;
				}
				if (i!=index) {
					t=arr[i];
					arr[i]=arr[j];
						arr[j]=t;
				}
			}
		}
		
		return arr;
	}
	
	public static void  quickSort(int arr[],int start,int end) {
		if (start>=end) {
			return;
		}
		else{
			int middle = findMiddle(arr, start, end);
			quickSort(arr, start, middle-1);
			quickSort(arr, middle+1,end);
		}
	
	}
	public static int findMiddle(int arr[],int start,int end) {
		int left=start;
		int right=end-1;
		int temp = arr[end];
		
		while(true){
			//1. ����߿�ʼ�ң��ҵ���һ���Ȳ��մ������
			while (left<end && arr[left]<=temp) {
				left++;
				if (left ==end) {
					break;
				}
			}
			//2. ���ұ߿�ʼ�ң��ҵ���һ���Ȳ���С������
			while (right>=start && arr[right]>=temp) {
				right--;
			}
			//3. �ж��Ƿ񽻲�
			if(left<right){
				//4. ���û�н��� ���һ���λ��
				int d = arr[left];
				arr[left]=arr[right];
				arr[right]=d;
			}else{
				//5�� ������� ��Ͳ����ﻻλ��
				int d = arr[left];
				arr[left]=arr[end];
				arr[end]=d;
				break;
			}
		
		}
		
		
		
		return left;
		
	}
	
	public static void showArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {2,5,6,3,5,10,22,1};
		//bubbleSort(arr);
		//showArr(arr);
		quickSort(arr, 0, arr.length-1);
		showArr(arr);
		
	}
	
}
