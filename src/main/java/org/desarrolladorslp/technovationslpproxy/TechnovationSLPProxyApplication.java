package org.desarrolladorslp.technovationslpproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class TechnovationSLPProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechnovationSLPProxyApplication.class, args);
    }
}
