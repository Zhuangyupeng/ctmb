package com.example.ctmb.model

import dev.longan.annotation.Document
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
class User {
    companion object {
        const val TYPE_FATHER = "爸爸"
        const val TYPE_MOTHER = "妈妈"
        const val TYPE_GRANDFATHER = "爷爷"
        const val TYPE_GRANDMOTHER = "奶奶"
        const val GENDER_MALE = "男"
        const val GENDER_FEMALE = "女"
        const val STATUS_ENABLE = "已启用"
        const val STATUS_DISABLE = "已禁用"
    }

    @Document(alias = "主键", sample = "1")
    @Id
    @Column(name = "id")
    var id: Long = 0

    var phone: String? = null
    var password: String? =null
    var qqId: String? = null
    var wechatId: String? = null
    var nickname: String? = null
    var createAt: LocalDateTime? = null
    var accessAt: LocalDateTime? = null

    @Document(alias = "类型", sample = "爸爸")
    var type: String? = null

    @Document(alias = "主账号")
    var master: User? = null

    @Document(alias = "从账号")
    var slave: MutableSet<User>? = null


    var status: String? = null
    var avatar: String? = null
    var gender: String? = null
    var email: String? = null
    var province: String? = null
    var city: String? = null
    var district: String? = null
    var career: String? = null
    var children: Children? = null
    var device: Device? = null
    var comment: String? = null

}