package afternoon.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        //중복 데이터 추가 시도
        boolean isAdded = set.add(30);
        System.out.println("30추가 시도 : " + isAdded);
        System.out.println(set);

        //데이터 검색
        boolean contains20 = set.contains(20);
        System.out.println(contains20);

        //데이터 삭제
        boolean isRemoved = set.remove(20);
        boolean isRemoved2 = set.remove(60);

        System.out.println( "20 삭제 시도 결과"+isRemoved);
        System.out.println( "60 삭제 시도 결과"+isRemoved2);

    }
}
