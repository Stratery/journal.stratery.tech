package tech.stratery.journal.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("datasources")
public class DataSourcesSettings {

    private DataSourceYamlConfig base;

    @Data
    protected static class DataSourceYamlConfig {
        private String driverClassName;
        private String password;
        private String username;
        private String url;
        private String platform;
        private String catalog;
        private String schema;
    }
}
