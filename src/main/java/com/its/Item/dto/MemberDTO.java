package com.its.Item.dto;

import lombok.Data;

@Data
public class MemberDTO {
    private Long id;
    private String memberId;
    private String memberPassword;
    private int memberAge;
    private String memberPhnoe;

    public MemberDTO(String memberId, String memberPassword, int memberAge, String memberPhnoe) {
        this.memberId = memberId;
        this.memberPassword = memberPassword;
        this.memberAge = memberAge;
        this.memberPhnoe = memberPhnoe;
    }
}
