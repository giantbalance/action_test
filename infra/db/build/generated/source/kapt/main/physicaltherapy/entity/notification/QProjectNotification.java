package physicaltherapy.entity.notification;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProjectNotification is a Querydsl query type for ProjectNotification
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProjectNotification extends EntityPathBase<ProjectNotification> {

    private static final long serialVersionUID = 564597616L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProjectNotification projectNotification = new QProjectNotification("projectNotification");

    public final physicaltherapy.entity.QBaseEntity _super = new physicaltherapy.entity.QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final physicaltherapy.entity.notificationChannel.QNotificationChannel notificationChannel;

    public final NumberPath<Long> projectId = createNumber("projectId", Long.class);

    public final NumberPath<Integer> reactionCount = createNumber("reactionCount", Integer.class);

    public final EnumPath<NotificationType> type = createEnum("type", NotificationType.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    public QProjectNotification(String variable) {
        this(ProjectNotification.class, forVariable(variable), INITS);
    }

    public QProjectNotification(Path<? extends ProjectNotification> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProjectNotification(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProjectNotification(PathMetadata metadata, PathInits inits) {
        this(ProjectNotification.class, metadata, inits);
    }

    public QProjectNotification(Class<? extends ProjectNotification> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.notificationChannel = inits.isInitialized("notificationChannel") ? new physicaltherapy.entity.notificationChannel.QNotificationChannel(forProperty("notificationChannel")) : null;
    }

}

