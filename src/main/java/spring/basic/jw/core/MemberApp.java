package spring.basic.jw.core;

import spring.basic.jw.core.member.Grade;
import spring.basic.jw.core.member.Member;
import spring.basic.jw.core.member.MemberService;
import spring.basic.jw.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
    }
}