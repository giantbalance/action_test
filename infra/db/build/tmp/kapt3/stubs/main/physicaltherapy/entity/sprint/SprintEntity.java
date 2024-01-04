package physicaltherapy.entity.sprint;

@jakarta.persistence.Entity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0011\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lphysicaltherapy/entity/sprint/SprintEntity;", "Lphysicaltherapy/entity/BaseEntity;", "projectEntity", "Lphysicaltherapy/entity/project/ProjectEntity;", "round", "", "cycle", "startDate", "Ljava/time/LocalDateTime;", "endDate", "(Lphysicaltherapy/entity/project/ProjectEntity;IILjava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "getCycle", "()I", "getEndDate", "()Ljava/time/LocalDateTime;", "getProjectEntity", "()Lphysicaltherapy/entity/project/ProjectEntity;", "getRound", "getStartDate", "db"})
public class SprintEntity extends physicaltherapy.entity.BaseEntity {
    @jakarta.persistence.JoinColumn(name = "project_id", nullable = false)
    @jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @org.jetbrains.annotations.NotNull
    private final physicaltherapy.entity.project.ProjectEntity projectEntity = null;
    @jakarta.persistence.Column(name = "round", nullable = false)
    private final int round = 0;
    @jakarta.persistence.Column(name = "cycle", nullable = false)
    private final int cycle = 0;
    @jakarta.persistence.Column(name = "start_date", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime startDate = null;
    @jakarta.persistence.Column(name = "end_date", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime endDate = null;
    
    public SprintEntity(@org.jetbrains.annotations.NotNull
    physicaltherapy.entity.project.ProjectEntity projectEntity, int round, int cycle, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime startDate, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime endDate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public physicaltherapy.entity.project.ProjectEntity getProjectEntity() {
        return null;
    }
    
    public int getRound() {
        return 0;
    }
    
    public int getCycle() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getStartDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getEndDate() {
        return null;
    }
}