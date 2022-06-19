package com.joodang.member.dto;

import com.joodang.member.constant.Role;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

// 회원 가입 화면에서 넘겨지는 파라미터를 저장할 Dto 클래스 (커맨드객체)
@Getter @Setter
public class MemberFormDto {
    @NotBlank(message = "이메일은 필수 입력 사항입니다.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String email ;

    @NotEmpty(message = "이름은 필수 입력 사항입니다.")
    @Length(min = 1, max = 8, message = "이름은 1자 이상, 8자 이하로 입력해주세요.")
    private String mName;

    @NotEmpty(message = "비밀번호는 필수 입력 값입니다.")
    @Length(min = 8, max = 16, message = "비밀번호는 8자 이상, 16자 이하로 입력해주세요.")
    private String mPassword ;

    @NotEmpty(message = "핸드폰번호는 필수 입력 값입니다.")
    private String mPhone;

    @NotEmpty(message = "성별은 필수 입력 값입니다.")
    private String mGender;

    private String mZipcode;

    @NotEmpty(message = "주소는 필수 입력 값입니다.")
    private String mAddress1;

    @NotEmpty(message = "상세주소는 필수 입력 값입니다.")
    private String mAddress2;
}
