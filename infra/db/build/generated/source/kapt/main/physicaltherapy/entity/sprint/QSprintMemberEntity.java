package physicaltherapy.entity.sprint;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSprintMemberEntity is a Querydsl query type for SprintMemberEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSprintMemberEntity extends EntityPathBase<SprintMemberEntity> {

    private static final long serialVersionUID = -1343584452L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSprintMemberEntity sprintMemberEntity = new QSprintMemberEntity("sprintMemberEntity");

    public final physicaltherapy.entity.QBaseEntity _super = new physicaltherapy.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QSprintEntity sprintEntity;

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    public final StringPath userId = createString("userId");

    public QSprintMemberEntity(String variable) {
        this(SprintMemberEntity.class, forVariable(variable), INITS);
    }

    public QSprintMemberEntity(Path<? extends SprintMemberEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSprintMemberEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSprintMemberEntity(PathMetadata metadata, PathInits inits) {
        this(SprintMemberEntity.class, metadata, inits);
    }

    public QSprintMemberEntity(Class<? extends SprintMemberEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sprintEntity = inits.isInitialized("sprintEntity") ? new QSprintEntity(forProperty("sprintEntity"), inits.get("sprintEntity")) : null;
    }

}

