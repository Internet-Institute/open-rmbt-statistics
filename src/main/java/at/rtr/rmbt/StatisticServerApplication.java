package at.rtr.rmbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class StatisticServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StatisticServerApplication.class, args);
    }
}
