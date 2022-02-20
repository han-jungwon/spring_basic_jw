package spring.basic.jw.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.basic.jw.core.discount.DiscountPolicy;
import spring.basic.jw.core.discount.FixDiscountPolicy;
import spring.basic.jw.core.discount.RateDiscountPolicy;
import spring.basic.jw.core.member.MemberRepository;
import spring.basic.jw.core.member.MemberService;
import spring.basic.jw.core.member.MemberServiceImpl;
import spring.basic.jw.core.member.MemoryMemberRepository;
import spring.basic.jw.core.order.OrderService;
import spring.basic.jw.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(
                new MemoryMemberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
