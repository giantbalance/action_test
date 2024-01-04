package physicaltherapy.entity.notificationChannel;

@jakarta.persistence.Entity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lphysicaltherapy/entity/notificationChannel/NotificationChannel;", "Lphysicaltherapy/entity/BaseEntity;", "channelName", "", "(Ljava/lang/String;)V", "getChannelName", "()Ljava/lang/String;", "db"})
public class NotificationChannel extends physicaltherapy.entity.BaseEntity {
    @jakarta.persistence.Column(name = "channel_name", nullable = false, unique = true)
    @org.jetbrains.annotations.NotNull
    private final java.lang.String channelName = null;
    
    public NotificationChannel(@org.jetbrains.annotations.NotNull
    java.lang.String channelName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getChannelName() {
        return null;
    }
}