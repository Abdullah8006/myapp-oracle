package com.appster.abdullah.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan("com.appster.abdullah.entity")
@EnableJpaRepositories("com.appster.abdullah.repository")
public class DatabaseConfig {

}
