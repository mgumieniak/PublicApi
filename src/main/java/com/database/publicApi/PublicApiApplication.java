package com.database.publicApi;

import com.database.client.sharedConfig.SharedConfigurationReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SharedConfigurationReference.class, com.database.security.sharedConfig.SharedConfigurationReference.class})
public class PublicApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PublicApiApplication.class, args);
    }
}
