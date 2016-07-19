package task;

import java.util.ArrayList;  
import java.util.List;  
import java.util.Random;  
  
public class Test {  
    public static void main(String[] args) {  
        List<Integer> list = new ArrayList<Integer>();  
        list.add(2);  
        list.add(3);  
        list.add(5);  
        list.add(7);  
        int[] ret = getRandomArrayFromList(list,3);  
        for(Integer val : ret)  
            System.out.println(val);  
    }  
    public static int[] getRandomArrayFromList(List<Integer> list,int number){    
        int ret[] = new int[number];    
        Random random = new Random();  
        for(int i=0;i<number;i++){  
            if (list != null && list.size() > 0 ){    
                int ran = random.nextInt(list.size());  
                ret[i] = list.get(ran);  
                list.remove(ran);  
            }    
        }  
        return ret;    
        }    
      
}  