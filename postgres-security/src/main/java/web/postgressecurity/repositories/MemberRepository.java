package web.postgressecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import web.postgressecurity.entities.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

}
