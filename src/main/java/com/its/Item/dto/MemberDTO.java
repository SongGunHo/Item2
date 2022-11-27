package com.its.Item.dto;

import lombok.Data;

@Data
public class MemberDTO {
    private Long id;
    private String memberId;
    private String memberPassword;
    private String memberName;
    private int memberAge;
    private String memberPhone;

    public MemberDTO(Long id, String memberId, String memberPassword, String memberName, int memberAge, String memberPhone) {
        this.id = id;
        this.memberId = memberId;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.memberPhone = memberPhone;
    }
}
