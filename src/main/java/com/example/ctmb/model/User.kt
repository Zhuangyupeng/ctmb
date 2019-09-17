package com.example.ctmb.model

import dev.longan.annotation.Document
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "users")
class User {
    companion object {
        const val TYPE_MASTER = "主账号"
        const val TYPE_SLAVE = "次账号"

        const val ROLE_FATHER = "爸爸"
        const val ROLE_MOTHER = "妈妈"
        const val ROLE_GRANDFATHER = "爷爷"
        const val ROLE_GRANDMOTHER = "奶奶"

        const val GENDER_MALE = "男"
        const val GENDER_FEMALE = "女"

        const val STATUS_ENABLE = "已启用"
        const val STATUS_DISABLE = "已禁用"
    }

    @Document(alias = "主键", sample = "1")
    @Id
    @Column(name = "id")
    var id: Long = 0

    @Column(name = "familyCode")
    var familyCode: String? = null

    @Column(name = "phone")
    var phone: String? = null

    @Column(name = "password")
    var password: String? = null

    @Column(name = "qqId")
    var qqId: String? = null

    @Column(name = "wechatId")
    var wechatId: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "nickname")
    var nickname: String? = null

    @Column(name = "createAt")
    var createAt: LocalDateTime? = null

    @Column(name = "accessAt")
    var accessAt: LocalDateTime? = null

    @Column(name = "status")
    var status: String? = null

    @Column(name = "avatar")
    var avatar: String? = null

    @Column(name = "gender")
    var gender: String? = null

    @Column(name = "province")
    var province: String? = null

    @Column(name = "city")
    var city: String? = null

    @Column(name = "district")
    var district: String? = null

    @Column(name = "career")
    var career: String? = null

    @Column(name = "comment")
    var comment: String? = null

    @Column(name = "type")
    var type: String? = null

    @Column(name = "familyRole")
    var familyRole: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = ForeignKey(name = "children_id_fk"))
    var children: Children? = null

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "users")
    var devices: MutableSet<Device> = mutableSetOf()
//    var encouragement: MutableSet<Encouragement> = mutableSetOf()
//    var activity: MutableSet<Activity> = mutableSetOf()
//    var sendInvitation: MutableSet<Invitation> = mutableSetOf()
//    var receivedInvitation: MutableSet<Invitation> = mutableSetOf()
}