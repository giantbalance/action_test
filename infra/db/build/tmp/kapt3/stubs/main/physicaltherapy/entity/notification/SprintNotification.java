package physicaltherapy.entity.notification;

@jakarta.persistence.Entity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\b\u001a\u00020\t8\u0012@\u0012X\u0093\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lphysicaltherapy/entity/notification/SprintNotification;", "Lphysicaltherapy/entity/BaseEntity;", "sprintId", "", "notificationChannel", "Lphysicaltherapy/entity/notificationChannel/NotificationChannel;", "content", "", "reactionCount", "", "type", "Lphysicaltherapy/entity/notification/NotificationType;", "(JLphysicaltherapy/entity/notificationChannel/NotificationChannel;Ljava/lang/String;ILphysicaltherapy/entity/notification/NotificationType;)V", "getContent", "()Ljava/lang/String;", "getNotificationChannel", "()Lphysicaltherapy/entity/notificationChannel/NotificationChannel;", "getSprintId", "()J", "getType", "()Lphysicaltherapy/entity/notification/NotificationType;", "db"})
public class SprintNotification extends physicaltherapy.entity.BaseEntity {
    @jakarta.persistence.Column(name = "sprint_id", nullable = false)
    private final long sprintId = 0L;
    @jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @jakarta.persistence.JoinColumn(name = "notification_channel_id", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final physicaltherapy.entity.notificationChannel.NotificationChannel notificationChannel = null;
    @jakarta.persistence.Column(name = "content", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final java.lang.String content = null;
    @jakarta.persistence.Column(name = "reaction_count", nullable = false)
    private int reactionCount;
    @jakarta.persistence.Enumerated(value = jakarta.persistence.EnumType.STRING)
    @jakarta.persistence.Column(name = "notification_type", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final physicaltherapy.entity.notification.NotificationType type = null;
    
    public SprintNotification(long sprintId, @org.jetbrains.annotations.NotNull
    physicaltherapy.entity.notificationChannel.NotificationChannel notificationChannel, @org.jetbrains.annotations.NotNull
    java.lang.String content, int reactionCount, @org.jetbrains.annotations.NotNull
    physicaltherapy.entity.notification.NotificationType type) {
        super();
    }
    
    public long getSprintId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public physicaltherapy.entity.notificationChannel.NotificationChannel getNotificationChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public physicaltherapy.entity.notification.NotificationType getType() {
        return null;
    }
}