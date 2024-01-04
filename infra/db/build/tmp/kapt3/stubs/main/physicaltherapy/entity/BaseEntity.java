package physicaltherapy.entity;

@jakarta.persistence.MappedSuperclass
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0011\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0097D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR*\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016@TX\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lphysicaltherapy/entity/BaseEntity;", "", "()V", "createdAt", "Ljava/time/ZonedDateTime;", "getCreatedAt", "()Ljava/time/ZonedDateTime;", "id", "", "getId", "()J", "<set-?>", "updatedAt", "getUpdatedAt", "setUpdatedAt", "(Ljava/time/ZonedDateTime;)V", "db"})
public class BaseEntity {
    @org.hibernate.annotations.CreationTimestamp
    @org.jetbrains.annotations.Nullable
    private final java.time.ZonedDateTime createdAt = null;
    @org.hibernate.annotations.UpdateTimestamp
    @org.jetbrains.annotations.Nullable
    private java.time.ZonedDateTime updatedAt;
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private final long id = 0L;
    
    public BaseEntity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public java.time.ZonedDateTime getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public java.time.ZonedDateTime getUpdatedAt() {
        return null;
    }
    
    protected void setUpdatedAt(@org.jetbrains.annotations.Nullable
    java.time.ZonedDateTime p0) {
    }
    
    public long getId() {
        return 0L;
    }
}