package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;

// @Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired // 스프링이 스프링 컨테이너에서 연관된 객체를 찾아 넣어줌. (아 이 스프링빈은 memberService 랑 연결해줘야겠네?)
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
