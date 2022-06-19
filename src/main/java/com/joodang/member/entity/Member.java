package com.joodang.member.entity;

import com.joodang.member.constant.Role;
import com.joodang.member.dto.MemberFormDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "members")
@Getter @Setter @ToString
public class Member {
    @Id
    private String email ;

    @Column(nullable = false)
    private String mPassword ;

    @Column(nullable = false)
    private String mName;

    @Column(nullable = false)
    private String mPhone;

    private String mGender;

    @Column(nullable = false)
    private String mZipcode;

    @Column(nullable = false)
    private String mAddress1;
    @Column(nullable = false)
    private String mAddress2;

    @Column(nullable = false)
    private String mRegion;

    @Column(nullable = false, columnDefinition = "date default sysdate")
    @Temporal(TemporalType.DATE)
    private Date mJoinDate = new Date();

    private int mCoupon;

    @Column(columnDefinition = "number default 0")
    private int mPoint;

    private String mRemark;

    @Enumerated(EnumType.STRING)
    private Role mRole ;

    public static Member createMember(MemberFormDto memberFormDto, PasswordEncoder passwordEncoder){
        Member member = new Member();
        member.setMName(memberFormDto.getMName());
        member.setMAddress1(memberFormDto.getMAddress1());
        member.setMAddress2(memberFormDto.getMAddress2());
        member.setMGender(memberFormDto.getMGender());
        member.setMPhone(memberFormDto.getMPhone());
        member.setMZipcode(memberFormDto.getMZipcode());

        String Mpassword = passwordEncoder.encode(memberFormDto.getMPassword());
        member.setMPassword(Mpassword);
        member.setMRole(Role.USER); // 일반 사용자로 회원 가입

        return member ;
    }
}
