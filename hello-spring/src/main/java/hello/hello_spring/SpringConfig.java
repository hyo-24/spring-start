package hello.hello_spring;

import hello.hello_spring.repository.JdbcMemberRepository;
import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.repository.MemoryMemberRepository;
import hello.hello_spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig { // 조립 설정을 선언해두는 클래스 (DI)

    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() { // 아직 DB 가 선정이 안되서 변경 가능성이 있는 경우는 이렇게 스프링 컨테이너에 등록한다.
        // return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
    }

}
