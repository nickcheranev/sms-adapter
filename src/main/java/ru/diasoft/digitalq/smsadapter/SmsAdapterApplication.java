package ru.diasoft.digitalq.smsadapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding({ConsumerChannels.class, ProducerChannels.class})
public class SmsAdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsAdapterApplication.class, args);
    }

}
