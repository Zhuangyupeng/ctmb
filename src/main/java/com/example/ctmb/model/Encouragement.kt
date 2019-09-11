package com.example.ctmb.model

class Encouragement {

    companion object {
        const val CREATETYPE_MANAGER = "管理员"
        const val CREATETYPE_USER = "用户"
    }

    var id: Long = 0
    var content: String? = null
    var voice: String? = null
    var createType: String? = null
    var useCount: Long = 0

    var activity:MutableSet<Activity>? = null
    var user:User? = null
    var admin:Admin? = null
}