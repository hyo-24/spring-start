package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class JdbcMemberRepository implements MemberRepository {
// 구현을 메모리에 할건지 데이터베이스랑 연동해서 Jdbc 랑 할건지를 정해야한다

    private final DataSource dataSource;

    public JdbcMemberRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return List.of();
    }


 // 나머지 코드는 치지 않겠다^^ 필기한 걸로 확인하자 너무 길다.




}
