package physicaltherapy.entity.project;

@jakarta.persistence.Entity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0011\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\fR\u001e\u0010\b\u001a\u00020\t8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lphysicaltherapy/entity/project/ProjectEntity;", "Lphysicaltherapy/entity/BaseEntity;", "name", "", "description", "recruitmentEndDate", "Ljava/time/LocalDateTime;", "master", "cycle", "", "startDate", "endDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;ILjava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "getCycle", "()I", "setCycle", "(I)V", "getDescription", "()Ljava/lang/String;", "getEndDate", "()Ljava/time/LocalDateTime;", "getMaster", "getName", "getRecruitmentEndDate", "getStartDate", "db"})
public class ProjectEntity extends physicaltherapy.entity.BaseEntity {
    @jakarta.persistence.Column(name = "name", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @jakarta.persistence.Column(name = "description", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    @jakarta.persistence.Column(name = "recruitment_end_date", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime recruitmentEndDate = null;
    @jakarta.persistence.Column(name = "master", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final java.lang.String master = null;
    @jakarta.persistence.Column(name = "cycle", nullable = false)
    private int cycle;
    @jakarta.persistence.Column(name = "start_date", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime startDate = null;
    @jakarta.persistence.Column(name = "end_date", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime endDate = null;
    
    public ProjectEntity(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime recruitmentEndDate, @org.jetbrains.annotations.NotNull
    java.lang.String master, int cycle, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime startDate, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime endDate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getRecruitmentEndDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getMaster() {
        return null;
    }
    
    public int getCycle() {
        return 0;
    }
    
    public void setCycle(int p0) {
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