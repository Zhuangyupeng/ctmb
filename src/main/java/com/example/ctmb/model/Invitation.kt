package com.example.ctmb.model

import java.time.LocalDateTime

class Invitation {
    companion object {
        const val STATUS_PENDING = "等待验证"
        const val STATUS_ACCEPTED = "已添加"
        const val STATUS_REJECTED = "拒绝"
    }


    var id: Long = 0
    var status: String? = null
    var comment: String? = null
    var createAt: LocalDateTime? = null
    var familyCode:String? = null
    var inviter: User? = null
    var guest: User? = null

}
