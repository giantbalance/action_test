package physicaltherapy.entity.notificationChannel;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotificationChannel is a Querydsl query type for NotificationChannel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotificationChannel extends EntityPathBase<NotificationChannel> {

    private static final long serialVersionUID = 491465427L;

    public static final QNotificationChannel notificationChannel = new QNotificationChannel("notificationChannel");

    public final physicaltherapy.entity.QBaseEntity _super = new physicaltherapy.entity.QBaseEntity(this);

    public final StringPath channelName = createString("channelName");

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    public QNotificationChannel(String variable) {
        super(NotificationChannel.class, forVariable(variable));
    }

    public QNotificationChannel(Path<? extends NotificationChannel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotificationChannel(PathMetadata metadata) {
        super(NotificationChannel.class, metadata);
    }

}

