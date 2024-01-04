package physicaltherapy.entity.sprint;

@jakarta.persistence.Entity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0011\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lphysicaltherapy/entity/sprint/SprintMemberEntity;", "Lphysicaltherapy/entity/BaseEntity;", "sprintEntity", "Lphysicaltherapy/entity/sprint/SprintEntity;", "userId", "", "(Lphysicaltherapy/entity/sprint/SprintEntity;Ljava/lang/String;)V", "getSprintEntity", "()Lphysicaltherapy/entity/sprint/SprintEntity;", "getUserId", "()Ljava/lang/String;", "db"})
public class SprintMemberEntity extends physicaltherapy.entity.BaseEntity {
    @jakarta.persistence.JoinColumn(name = "sprint_id", nullable = false)
    @jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @org.jetbrains.annotations.NotNull
    private final physicaltherapy.entity.sprint.SprintEntity sprintEntity = null;
    @jakarta.persistence.Column(name = "user_id", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userId = null;
    
    public SprintMemberEntity(@org.jetbrains.annotations.NotNull
    physicaltherapy.entity.sprint.SprintEntity sprintEntity, @org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public physicaltherapy.entity.sprint.SprintEntity getSprintEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getUserId() {
        return null;
    }
}