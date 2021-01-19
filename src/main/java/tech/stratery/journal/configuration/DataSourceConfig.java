package tech.stratery.journal.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;

@EnableConfigurationProperties(DataSourcesSettings.class)
@Configuration
public class DataSourceConfig {

    public DataSourceConfig() {}

    @Bean
    @Primary
    public DataSource dataSource(DataSourcesSettings dataSourcesSettings) {

            HikariConfig config = new HikariConfig();
            config.setDriverClassName(dataSourcesSettings.getBase().getDriverClassName());
            config.setJdbcUrl(dataSourcesSettings.getBase().getUrl());
            config.setUsername(dataSourcesSettings.getBase().getUsername());
            config.setPassword(dataSourcesSettings.getBase().getPassword());
            config.setCatalog(dataSourcesSettings.getBase().getCatalog());
            if (!StringUtils.isEmpty(dataSourcesSettings.getBase().getSchema())) {
                config.setSchema(dataSourcesSettings.getBase().getSchema());
            }
            return new HikariDataSource(config);
    }
}
