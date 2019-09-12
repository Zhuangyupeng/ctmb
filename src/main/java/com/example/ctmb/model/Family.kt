package com.example.ctmb.model

class Family{

    companion object {
        const val STATUS_PENDING = "等待验证"
        const val STATUS_ACCEPTED = "已添加"
        const val STATUS_REJECTED = "拒绝"

        const val TYPE_MASTER = "主账号"
        const val TYPE_SLAVE = "次账号"

        const val ROLE_FATHER = "爸爸"
        const val ROLE_MOTHER = "妈妈"
        const val ROLE_GRANDFATHER = "爷爷"
        const val ROLE_GRANDMOTHER = "奶奶"
    }
    var id:Long = 0
    var groupId:String? = null
    var status: String? = null
    var type: String? = null
    var familyRole: String? = null
    var user:User? = null
}
