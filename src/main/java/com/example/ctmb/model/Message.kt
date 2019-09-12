package com.example.ctmb.model

import java.time.LocalDateTime

class Message {

    companion object {
        val TYPE_BAR = "通知栏推送"
        val TYPE_APP = "APP内消息中心推送"
        val SCOPE_ALL = "全部用户"
        var SCOPE_SECTION = "部分用户"
        val STATUS_PENDING = "待发送"
        val STATUS_SEND = "已发送"
    }

    var id: Long = 0
    var context: String? = null
    var title: String? = null
    var subtitle: String? = null
    var scope: String? = null
    var type: String? = null
    var createAt: LocalDateTime? = null
    var image:String? = null
    var user: User? = null
}