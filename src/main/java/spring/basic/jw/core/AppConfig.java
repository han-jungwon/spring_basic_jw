package spring.basic.jw.core;

import spring.basic.jw.core.discount.FixDiscountPolicy;
import spring.basic.jw.core.member.MemberService;
import spring.basic.jw.core.member.MemberServiceImpl;
import spring.basic.jw.core.member.MemoryMemberRepository;
import spring.basic.jw.core.order.OrderService;
import spring.basic.jw.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
