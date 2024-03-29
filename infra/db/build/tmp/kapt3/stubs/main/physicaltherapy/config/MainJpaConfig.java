package physicaltherapy.config;

@org.springframework.context.annotation.Configuration
@org.springframework.transaction.annotation.EnableTransactionManagement
@org.springframework.boot.autoconfigure.domain.EntityScan(basePackages = {"physicaltherapy"})
@org.springframework.data.jpa.repository.config.EnableJpaRepositories(basePackages = {"physicaltherapy"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lphysicaltherapy/config/MainJpaConfig;", "", "()V", "db"})
public class MainJpaConfig {
    
    public MainJpaConfig() {
        super();
    }
}