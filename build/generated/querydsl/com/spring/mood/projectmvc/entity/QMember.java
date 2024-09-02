package com.spring.mood.projectmvc.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 535398747L;

    public static final QMember member = new QMember("member1");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> limitTime = createDateTime("limitTime", java.time.LocalDateTime.class);

    public final NumberPath<Integer> roomId = createNumber("roomId", Integer.class);

    public final StringPath sessionId = createString("sessionId");

    public final StringPath userAccount = createString("userAccount");

    public final StringPath userAddress = createString("userAddress");

    public final DatePath<java.time.LocalDate> userBirth = createDate("userBirth", java.time.LocalDate.class);

    public final StringPath userEmail = createString("userEmail");

    public final StringPath userName = createString("userName");

    public final StringPath userPassword = createString("userPassword");

    public final NumberPath<Integer> userPoint = createNumber("userPoint", Integer.class);

    public final StringPath userProfile = createString("userProfile");

    public final StringPath userRole = createString("userRole");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

