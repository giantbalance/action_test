package physicaltherapy.entity.sprint;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSprintEntity is a Querydsl query type for SprintEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSprintEntity extends EntityPathBase<SprintEntity> {

    private static final long serialVersionUID = -1077465278L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSprintEntity sprintEntity = new QSprintEntity("sprintEntity");

    public final physicaltherapy.entity.QBaseEntity _super = new physicaltherapy.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> cycle = createNumber("cycle", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> endDate = createDateTime("endDate", java.time.LocalDateTime.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final physicaltherapy.entity.project.QProjectEntity projectEntity;

    public final NumberPath<Integer> round = createNumber("round", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> startDate = createDateTime("startDate", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    public QSprintEntity(String variable) {
        this(SprintEntity.class, forVariable(variable), INITS);
    }

    public QSprintEntity(Path<? extends SprintEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSprintEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSprintEntity(PathMetadata metadata, PathInits inits) {
        this(SprintEntity.class, metadata, inits);
    }

    public QSprintEntity(Class<? extends SprintEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.projectEntity = inits.isInitialized("projectEntity") ? new physicaltherapy.entity.project.QProjectEntity(forProperty("projectEntity")) : null;
    }

}

