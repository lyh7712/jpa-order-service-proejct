package lyh7712.shopservice.service;

import lombok.RequiredArgsConstructor;
import lyh7712.shopservice.domain.Member;
import lyh7712.shopservice.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    MemberRepository repository;

    /**
     * 회원 가입
     */

    @Transactional
    public Long join(Member member) {
        validDuplicateMember(member);
        repository.save(member);
        return member.getId();
    }

    public void validDuplicateMember(Member member) {
        List<Member> findMembers = repository.findName(member.getName());
        if (!findMembers.isEmpty()) {
            throw new IllegalArgumentException("이미 존재하는 회원입니다.");
        }
    }


    public List<Member> findMembers() {
        return repository.findAll();
    }

    public Member findOne(Long id) {
        return repository.findOne(id);
    }
}
