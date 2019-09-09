package com.example.ctmb.model

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "users")
class User {
    var id: Long = 0;
    var phone: String? = null
    var nickname: String? = null
    var baby: Baby? = null
    var device: Device? = null
    var createAt: LocalDateTime? = null
    var accessAt: LocalDateTime? = null
    var status:String? = null
    var avatar: String? = null
}