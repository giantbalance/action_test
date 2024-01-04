package physicaltherapy.config;

@org.springframework.context.annotation.Configuration
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\u0007\u001a\u00020\u0006H\u0017\u00a8\u0006\b"}, d2 = {"Lphysicaltherapy/config/DataSourceConfig;", "", "()V", "mainDataSource", "Lcom/zaxxer/hikari/HikariDataSource;", "config", "Lcom/zaxxer/hikari/HikariConfig;", "mainHikariConfig", "db"})
public class DataSourceConfig {
    
    public DataSourceConfig() {
        super();
    }
    
    @org.springframework.context.annotation.Bean
    @org.springframework.boot.context.properties.ConfigurationProperties(prefix = "physical-therapy.datasource.main")
    @org.jetbrains.annotations.NotNull
    public com.zaxxer.hikari.HikariConfig mainHikariConfig() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean
    @org.jetbrains.annotations.NotNull
    public com.zaxxer.hikari.HikariDataSource mainDataSource(@org.springframework.beans.factory.annotation.Qualifier(value = "mainHikariConfig")
    @org.jetbrains.annotations.NotNull
    com.zaxxer.hikari.HikariConfig config) {
        return null;
    }
}