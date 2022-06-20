package com.joodang.member.entity;

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

    private static final long serialVersionUID = -2020336756L;

    public static final QMember member = new QMember("member1");

    public final StringPath email = createString("email");

    public final StringPath mAddress1 = createString("mAddress1");

    public final StringPath mAddress2 = createString("mAddress2");

    public final NumberPath<Integer> mCoupon = createNumber("mCoupon", Integer.class);

    public final EnumPath<com.joodang.member.constant.Gender> mGender = createEnum("mGender", com.joodang.member.constant.Gender.class);

    public final DatePath<java.util.Date> mJoinDate = createDate("mJoinDate", java.util.Date.class);

    public final StringPath mName = createString("mName");

    public final StringPath mPhone = createString("mPhone");

    public final NumberPath<Integer> mPoint = createNumber("mPoint", Integer.class);

    public final StringPath mRegion = createString("mRegion");

    public final StringPath mRemark = createString("mRemark");

    public final EnumPath<com.joodang.member.constant.Role> mRole = createEnum("mRole", com.joodang.member.constant.Role.class);

    public final StringPath mZipcode = createString("mZipcode");

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

