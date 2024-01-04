package physicaltherapy.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProjectEntity is a Querydsl query type for ProjectEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProjectEntity extends EntityPathBase<ProjectEntity> {

    private static final long serialVersionUID = 1371181848L;

    public static final QProjectEntity projectEntity = new QProjectEntity("projectEntity");

    public final physicaltherapy.entity.QBaseEntity _super = new physicaltherapy.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> cycle = createNumber("cycle", Integer.class);

    public final StringPath description = createString("description");

    public final DateTimePath<java.time.LocalDateTime> endDate = createDateTime("endDate", java.time.LocalDateTime.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath master = createString("master");

    public final StringPath name = createString("name");

    public final DateTimePath<java.time.LocalDateTime> recruitmentEndDate = createDateTime("recruitmentEndDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> startDate = createDateTime("startDate", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    public QProjectEntity(String variable) {
        super(ProjectEntity.class, forVariable(variable));
    }

    public QProjectEntity(Path<? extends ProjectEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProjectEntity(PathMetadata metadata) {
        super(ProjectEntity.class, metadata);
    }

}

