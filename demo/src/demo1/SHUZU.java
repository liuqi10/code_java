package demo1;

import java.util.Arrays;

public class SHUZU {
    public static void main(String[] args){
        System.out.println("hewwod");
        ArrayMath am = new ArrayMath();
        am.bianLi();
        am.bianLiForEach();
        am.bianLiK();
    }
}

// 数组相关
class ArrayMath{
    private int[] arrays = {7,2,3,1,2,9,23,1,32};

    public void bianLi(){
        for(int i=0; i<arrays.length; i++){
            int n = arrays[i];
            System.out.println(n);
        }
    }

    public void bianLiForEach(){
        for(int array:arrays){
            System.out.print(array +";");
        }
    }

    public void bianLiK(){
        System.out.println(Arrays.toString(arrays));
    }
}

//class ArraysSort extends ArrayMath{
//    pass
//}