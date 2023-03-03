package leetcode.solution.array;

import java.time.Duration;
import java.time.LocalDateTime;

public class commonSorts {

    public static int[] bubbleSort(int arr[]) {
        System.out.println("bubbleSort");
        int tem = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
              if(arr[i]>arr[j]){
                  swap(arr,i,j);
              }
            }
        }


        return arr;
    }

    public static int[] selectSort(int arr[]) {

        if (arr == null || arr.length < 2) {
            return arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                //如果右边的数小于左边的数，则交换
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }

        return arr;
    }

    /**
     * @Description: insertion sort, in some situation(array already sorted )
     * time complexity could be O(N)
     * @Author: Yang
     * @Date: 2023/3/3 11:29
     */
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            {
                return;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            //0~i做到有序
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }


    public static void quickSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        } else {
            int middle = findMiddle(arr, start, end);
            quickSort(arr, start, middle - 1);
            quickSort(arr, middle + 1, end);
        }

    }

    public static int findMiddle(int arr[], int start, int end) {
        int left = start;
        int right = end - 1;
        int temp = arr[end];

        while (true) {
            //1. ?????????????????????????????
            while (left < end && arr[left] <= temp) {
                left++;
                if (left == end) {
                    break;
                }
            }
            //2. ???????????????????????С??????
            while (right >= start && arr[right] >= temp) {
                right--;
            }
            //3. ?ж?????
            if (left < right) {
                //4. ?????н??? ???????λ??
                int d = arr[left];
                arr[left] = arr[right];
                arr[right] = d;
            } else {
                //5?? ??????? ????????λ??
                int d = arr[left];
                arr[left] = arr[end];
                arr[end] = d;
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
        int arr[] = {287, 91, 368, 272, 50, 211, 355, 204, 516, 131, 888, 54,
                903, 769, 996, 904, 800, 955, 47, 479, 328, 43, 478, 862, 568,
                956, 671, 570, 820, 642, 773, 903, 824, 194, 292, 745, 431, 390,
                602, 454, 757, 692, 46, 679, 347, 136, 670, 402, 785, 857, 732, 436,
                444, 913, 375, 768, 874, 375, 837, 754, 991, 302, 803, 495, 669, 77,
                409, 406, 835, 404, 514, 610, 120, 516, 10, 373, 787, 30, 34, 648, 802,
                908, 182, 121, 728, 768, 20, 745, 703, 438, 536, 25, 804, 277, 329, 353,
                124, 441, 809, 808, 179, 242, 692, 721, 970, 318, 225, 76, 56, 655, 714,
                571, 320, 209, 562, 731, 393, 174, 875, 964, 71, 343, 864, 523, 753, 358,
                746, 92, 819, 840, 391, 101, 398, 507, 550, 654, 85, 617, 57, 465, 743, 582,
                565, 360, 836, 508, 377, 752, 496, 16, 480, 497, 326, 39, 794, 222, 383, 632,
                988, 221, 57, 771, 355, 397, 244, 398, 300, 278, 13, 454, 280, 838, 311, 738,
                214, 141, 420, 936, 689, 497, 487, 597, 939, 719, 499, 998, 189, 691, 460, 333,
                751, 936, 370, 262, 55, 378, 696, 426, 639, 246, 787, 725, 529, 294, 384, 952, 553,
                985, 276, 572, 464, 108, 214, 57, 26, 215, 417, 708, 208, 300, 564, 146, 707, 461,
                913, 161, 731, 507, 34, 827, 245, 766, 844, 475, 622, 745, 744, 540, 491, 547, 929,
                386, 559, 276, 951, 153, 304, 632};
        //bubbleSort(arr);
        //showArr(arr);
        //quickSort(arr, 0, arr.length - 1);
        LocalDateTime before = LocalDateTime.now();
        System.out.printf("before : %s", before);
        System.out.println();
        bubbleSort(arr);
        LocalDateTime after = LocalDateTime.now();
        System.out.printf("after : %s", after);

        showArr(arr);
        Duration duration = Duration.between(before, after);
        System.out.printf("cost : %s milliseconds", duration.toMillis());

    }

}
