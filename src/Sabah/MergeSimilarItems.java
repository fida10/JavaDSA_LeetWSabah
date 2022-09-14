package Sabah;

import java.util.*;

public class MergeSimilarItems {
    public static void main(String[] args) {
        int [][] items1 = {{1,1},{4,5},{3,8}};
        int [][] items2 = {{3,1},{1,5}};

        System.out.println(mergeSimilarItems(items1,items2));
    }
    static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
            List<List<Integer>> merged = new ArrayList<>();
            Map<Integer,Integer> map = new TreeMap<>();

            for (int [] i : items1){
                map.put(i[0],i[1]);
            }

            for (int [] i: items2){
                if (map.containsKey(i[0])){
                    int total = map.get(i[0]);
                    total+=i[1];
                    map.put(i[0], total);
                }
                else map.put(i[0],i[1]);
            }
            for (Map.Entry<Integer, Integer> e : map.entrySet()){
               List<Integer> it = new ArrayList<>();
               it.add( e.getKey());
               it.add( e.getValue());
               merged.add(it);
            }
            return merged;

    }
}
