package com.crud.tokobangunan.config.profile;

import com.crud.tokobangunan.config.properties.AppProperties;
import com.crud.tokobangunan.config.variable.AppConstant;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class LocalProfile {

    @Bean(AppConstant.BEAN_APP_CONF)
    public AppProperties loadAppConfig(){
        return new AppProperties();
    }

    @Bean(AppConstant.BEAN_DS_DATABARANG)
    public HikariDataSource tokoBangunanDatasource() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.postgresql.Driver");
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/tokobangunan");
        config.setUsername("postgres");
        config.setPassword("postgres");
        config.setPoolName("Hikaripool-DataBarang");
        return new HikariDataSource(config);
    }
}
