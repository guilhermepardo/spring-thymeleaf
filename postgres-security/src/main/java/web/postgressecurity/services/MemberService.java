package web.postgressecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import web.postgressecurity.entities.Member;
import web.postgressecurity.entities.Role;
import web.postgressecurity.repositories.MemberRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Member createMember(Member member) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        member.setPassword(encoder.encode(member.getPassword()));
        Role memberRole = new Role("ADMIN");
        List<Role> roles = new ArrayList<>();
        roles.add(memberRole);
        member.setRole(roles);
        memberRepository.save(member);
        return member;

    }

}
