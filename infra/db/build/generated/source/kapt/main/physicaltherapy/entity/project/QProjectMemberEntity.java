package physicaltherapy.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProjectMemberEntity is a Querydsl query type for ProjectMemberEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProjectMemberEntity extends EntityPathBase<ProjectMemberEntity> {

    private static final long serialVersionUID = 16593554L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProjectMemberEntity projectMemberEntity = new QProjectMemberEntity("projectMemberEntity");

    public final physicaltherapy.entity.QBaseEntity _super = new physicaltherapy.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QProjectEntity projectEntity;

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    public final StringPath userId = createString("userId");

    public QProjectMemberEntity(String variable) {
        this(ProjectMemberEntity.class, forVariable(variable), INITS);
    }

    public QProjectMemberEntity(Path<? extends ProjectMemberEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProjectMemberEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProjectMemberEntity(PathMetadata metadata, PathInits inits) {
        this(ProjectMemberEntity.class, metadata, inits);
    }

    public QProjectMemberEntity(Class<? extends ProjectMemberEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.projectEntity = inits.isInitialized("projectEntity") ? new QProjectEntity(forProperty("projectEntity")) : null;
    }

}

