package tech.haonan.server;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("tech.haonan.server.mapper")
public class YunYiBanApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(YunYiBanApplication.class,args);
    }
}
