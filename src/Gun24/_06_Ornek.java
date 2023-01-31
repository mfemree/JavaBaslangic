package Gun24;

import java.util.TreeMap;

public class _06_Ornek {
    public static void main(String[] args) {

        // bir seyleri saydirma

        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        Integer[] list = {9, 2, 3, 4, 5, 6, 7, 10, 3, 4, 2, 3, 4, 2, 3};

        for (Integer num : list)
            if (map.get(num) == null)
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);
        System.out.println(map.values());
    }
    }
