package physicaltherapy.entity.notification;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSprintNotification is a Querydsl query type for SprintNotification
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSprintNotification extends EntityPathBase<SprintNotification> {

    private static final long serialVersionUID = 1587443161L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSprintNotification sprintNotification = new QSprintNotification("sprintNotification");

    public final physicaltherapy.entity.QBaseEntity _super = new physicaltherapy.entity.QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final physicaltherapy.entity.notificationChannel.QNotificationChannel notificationChannel;

    public final NumberPath<Integer> reactionCount = createNumber("reactionCount", Integer.class);

    public final NumberPath<Long> sprintId = createNumber("sprintId", Long.class);

    public final EnumPath<NotificationType> type = createEnum("type", NotificationType.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    public QSprintNotification(String variable) {
        this(SprintNotification.class, forVariable(variable), INITS);
    }

    public QSprintNotification(Path<? extends SprintNotification> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSprintNotification(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSprintNotification(PathMetadata metadata, PathInits inits) {
        this(SprintNotification.class, metadata, inits);
    }

    public QSprintNotification(Class<? extends SprintNotification> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.notificationChannel = inits.isInitialized("notificationChannel") ? new physicaltherapy.entity.notificationChannel.QNotificationChannel(forProperty("notificationChannel")) : null;
    }

}

