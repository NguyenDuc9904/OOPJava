package Chuong4.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg", "Qunag Ngai");
        hashMapCity.put("QN", "Qunag Nam");
        hashMapCity.put("QN", "Qunag Ninh");
        hashMapCity.put("HCM", "TP Ho Chi Minh");

        System.out.println("danh sach ca thanh pho co trong hashapCity : ");
        Set<Map.Entry<String, String>> setCity =hashMapCity.entrySet();
        System.out.println(setCity);

        System.out.println("QNg :" + hashMapCity.get("QNg"));
        System.out.println("NT :" + hashMapCity.get("NT"));

        if (hashMapCity.containsValue("TP Ho Chi Minh")) {
            System.out.println("TP Ho Chi Minh co trong hashMapCity");
            
        }

    }
    
}
