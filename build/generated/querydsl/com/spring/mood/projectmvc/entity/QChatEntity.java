package com.spring.mood.projectmvc.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChatEntity is a Querydsl query type for ChatEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChatEntity extends EntityPathBase<ChatEntity> {

    private static final long serialVersionUID = 1743992732L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChatEntity chatEntity = new QChatEntity("chatEntity");

    public final BooleanPath chatJoin = createBoolean("chatJoin");

    public final QChatRoom chatRoom;

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> timestamp = createDateTime("timestamp", java.time.LocalDateTime.class);

    public final QUser user;

    public final StringPath userProfile = createString("userProfile");

    public QChatEntity(String variable) {
        this(ChatEntity.class, forVariable(variable), INITS);
    }

    public QChatEntity(Path<? extends ChatEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChatEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChatEntity(PathMetadata metadata, PathInits inits) {
        this(ChatEntity.class, metadata, inits);
    }

    public QChatEntity(Class<? extends ChatEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chatRoom = inits.isInitialized("chatRoom") ? new QChatRoom(forProperty("chatRoom"), inits.get("chatRoom")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user"), inits.get("user")) : null;
    }

}

