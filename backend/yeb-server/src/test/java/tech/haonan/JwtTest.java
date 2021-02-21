package tech.haonan;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import tech.haonan.server.util.JwtUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {

    private static final String CLAIM_KEY_USERNAME="sub";
    private static final String CLAIM_KEY_CREATED="created_time";

    @Test
    public void test(){

    }


    @Test
    public void testSpringSecurity(){
        // 加密密码
        PasswordEncoder ps =  new BCryptPasswordEncoder();
        String encode = ps.encode("123");
        System.out.println(encode);
        // 比较密码
        System.out.println(ps.matches("123", encode));
    }

}
