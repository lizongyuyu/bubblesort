package bubblesort;
import java.util.Arrays;
public class bubbltSortTest {
    public static void main(String[] args) {
	/*int [] a = {1,2,3,4,5,6};
	int [] newa = new int[11];
	System.arraycopy(a, 0, newa, 1, a.length);
	System.out.println(Arrays.toString(newa));
	*/
    /*
     * 冒泡排序
     * bubbltSort
     * 規則：元素兩兩比较，元素往后排，一次比较结束，最大值出现，就和水中气泡一样
     * 101 2 34  56 8 99 7 8 一次过后
     * 2 34 56 8 99 7 8 101 二次过后
     * 3 34 8 56  7 8 99 101 以此类推
     * */
    	int [] array = {101,2,34,56,8,99,7,8};
    	for(int j=1;j<array.length;j++) {//j=0;array.length-1
    		for(int i=0;i<array.length-j;i++) {//i<array.length-1-j
        		if(array[i]>array[i+1]) {
        			int temp = array[i];
            		array[i] = array[i+1];
            		array[i+1]  = temp;
        		}
        	}
        	System.out.println(Arrays.toString(array));
    		
    	}
    	
    
    }
}
/*结果
[2, 34, 56, 8, 99, 7, 8, 101]
[2, 34, 8, 56, 7, 8, 99, 101]
[2, 8, 34, 7, 8, 56, 99, 101]
[2, 8, 7, 8, 34, 56, 99, 101]
[2, 7, 8, 8, 34, 56, 99, 101]
[2, 7, 8, 8, 34, 56, 99, 101]
[2, 7, 8, 8, 34, 56, 99, 101]*/
