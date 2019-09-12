package com.example.ctmb.model

class Message {

    companion object {
        var TYPE_BAR = "通知栏推送"
        var TYPE_APP = "APP内消息中心推送"
        var SCOPE_ALL = "全部用户"
        var SCOPE_SECTION = "指定用户"
    }

    var id: Long = 0
    var context: String? = null
    var title: String? = null
    var subtitle: String? = null
    var scope: String? = null
    var type: String? = null


}