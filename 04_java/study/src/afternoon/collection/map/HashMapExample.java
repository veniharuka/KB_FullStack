package afternoon.collection.map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap();

        hashMap.put("사과", 14000);
        hashMap.put("바나나", 3000);
        hashMap.put("토마토", 5500);
        hashMap.put("수박", 19800);

        System.out.println("hashMap = " + hashMap);
        //특정 키의 값 가져오기

        int applePrice = hashMap.get("사과");
        System.out.println("applePrice = " + applePrice);

        // 키 존재 확인
        boolean hasBanana = hashMap.containsKey("바나나");
        System.out.println("바나나 존재 여부 확인 = " + hasBanana);

        //값이 존재 하는지 확인
        boolean hasValue3000 = hashMap.containsValue(3000);
        System.out.println("3000원 과일 존재 여부 = " + hasValue3000);

        // 삭제
        int removedValue = hashMap.remove("수박");
        System.out.println("removedValue = " + removedValue);

        System.out.println("hashMap = " + hashMap);
    }
}
