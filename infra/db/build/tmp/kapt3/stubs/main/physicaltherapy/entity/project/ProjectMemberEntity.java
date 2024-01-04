package physicaltherapy.entity.project;

@jakarta.persistence.Entity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0011\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lphysicaltherapy/entity/project/ProjectMemberEntity;", "Lphysicaltherapy/entity/BaseEntity;", "projectEntity", "Lphysicaltherapy/entity/project/ProjectEntity;", "userId", "", "(Lphysicaltherapy/entity/project/ProjectEntity;Ljava/lang/String;)V", "getProjectEntity", "()Lphysicaltherapy/entity/project/ProjectEntity;", "getUserId", "()Ljava/lang/String;", "db"})
public class ProjectMemberEntity extends physicaltherapy.entity.BaseEntity {
    @jakarta.persistence.JoinColumn(name = "project_id", nullable = false)
    @jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @org.jetbrains.annotations.NotNull
    private final physicaltherapy.entity.project.ProjectEntity projectEntity = null;
    @jakarta.persistence.Column(name = "user_id", nullable = false)
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userId = null;
    
    public ProjectMemberEntity(@org.jetbrains.annotations.NotNull
    physicaltherapy.entity.project.ProjectEntity projectEntity, @org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public physicaltherapy.entity.project.ProjectEntity getProjectEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getUserId() {
        return null;
    }
}