package com.projectx.codeecho.repositoy;

import com.projectx.codeecho.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import com.projectx.codeecho.domain.entity.*;
import com.projectx.codeecho.repository.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Properties;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = Member.class)
//@ContextConfiguration(classes = Member.class)
//@ExtendWith(SpringExtension.class)
//@DataJpaTest(properties = "spring.main.allow-bean-definition-overriding=true")
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MemberRepositoryTest {
    //@Autowired
    //private TestEntityManager entityManager;
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void testFindByName(){
        Member member = new Member();
        member.setName("hi");
        member.setAccount("hi@example.com");

       //entityManager.persist(member);

        Member found = memberRepository.findByName("hi");

        assertThat(found.getName()).isEqualTo("hi");
    }


}
