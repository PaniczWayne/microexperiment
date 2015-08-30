package org.xstream.microexperiment.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableZuulProxy
@EnableEurekaClient
public class EdgeApplication {
    public static void main(String[] args) {
        SpringApplication.run(EdgeApplication.class, args);
    }
}
