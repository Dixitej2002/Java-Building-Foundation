import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static void main(String[] args) {
        int arr [] = {1,2,1,3,2,1};



        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int num : arr){
            if(hmap.containsKey(num)){
                hmap.put(num,hmap.get(num) + 1);
            }
            else{
                hmap.put(num,1);
            }
        }
        
        for(int key : hmap.keySet()){
        System.out.println(key + "->" + hmap.get(key));
        }






    //     hmap.put(1, 2);
    //     hmap.put(2, 2);
    //     hmap.put(3, 1);

    //     // hmap.put(1, 2);
    //     System.out.println(hmap);

    //    System.out.println(hmap.get(1)); 
    //     for(Integer num : hmap.keySet()){

    //         System.out.println(num);
    //     }

    //     boolean isCon = hmap.containsKey(5);
    //     System.out.println(isCon);

    //     for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
    //         System.out.println(entry.getKey() + "-->" + entry.getValue());
    //     }
    }
    
}
