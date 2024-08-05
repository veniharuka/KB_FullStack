package org.example.dto;

import java.util.ArrayList;
import java.util.List;

public class MemberDtoListV1 {
    private static MemberDtoListV1 instance;
    private List<MemberDto> memberDtoList;

    private MemberDtoListV1() {
        this.memberDtoList = new ArrayList<>();
        this.addList("tetz","이효석");
        this.addList("siwan","김시완");
    }

    // synchronized를 통해 자바가 멀티스레드 식으로 하려는 거 막아준다.
    // 하나만 손대게 하고 그거 끝나야 다른 스레드 손댈 수 있게
    public static synchronized MemberDtoListV1 getInstance() {
        if (instance == null) {
            instance = new MemberDtoListV1();
        }
        return instance;
    }

    public void addList(String id , String name){
        memberDtoList.add(new MemberDto(id, name));
    }

    public List<MemberDto> getList() {
        return memberDtoList;
    }

}
