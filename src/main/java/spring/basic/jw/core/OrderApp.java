package spring.basic.jw.core;

import spring.basic.jw.core.member.Grade;
import spring.basic.jw.core.member.Member;
import spring.basic.jw.core.member.MemberService;
import spring.basic.jw.core.member.MemberServiceImpl;
import spring.basic.jw.core.order.Order;
import spring.basic.jw.core.order.OrderService;
import spring.basic.jw.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl(memberRepository);
        OrderService orderService = new OrderServiceImpl(discountPolicy);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());

    }

}
