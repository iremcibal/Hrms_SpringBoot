package com.example.hrms_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //Swagger'ı başlatan annotation (api üzerinden controlleri tarıyor...vs)
public class HrmsSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrmsSpringBootApplication.class, args);
    }

    @Bean //Bizim uyg. başladığında beani gördüğü zaman bunu belleğe yerleştiriyor.
    public Docket api() {
        //Request handler'ları buluyor bunları dokümantosyon haline getiriyor
        //Bu uygulama içerisinde ki tüm apileri buluyor ve test edebileceğimiz noktaya taşıyor.
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.hrms_springboot"))
                .build();
    }
}
