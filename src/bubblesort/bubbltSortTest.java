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
     * ð������
     * bubbltSort
     * Ҏ�t��Ԫ�؃ɃɱȽϣ�Ԫ�������ţ�һ�αȽϽ��������ֵ���֣��ͺ�ˮ������һ��
     * 101 2 34  56 8 99 7 8 һ�ι���
     * 2 34 56 8 99 7 8 101 ���ι���
     * 3 34 8 56  7 8 99 101 �Դ�����
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
/*���
[2, 34, 56, 8, 99, 7, 8, 101]
[2, 34, 8, 56, 7, 8, 99, 101]
[2, 8, 34, 7, 8, 56, 99, 101]
[2, 8, 7, 8, 34, 56, 99, 101]
[2, 7, 8, 8, 34, 56, 99, 101]
[2, 7, 8, 8, 34, 56, 99, 101]
[2, 7, 8, 8, 34, 56, 99, 101]*/
