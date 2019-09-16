package com.example.ctmb.model

import java.time.LocalDateTime

class Activity {

    companion object {
        const val REPEATYPE_ONETIME = "一次性活动"
        const val REPEATYPE_DAILY = "每天"
        const val REPEATYPE_WEEKLY = "每周"
        const val REPEATYPE_MONTHLY = "每月"

        const val IMPORTANCE_URGENT = "重要且紧急"
        const val IMPORTANCE_NOTURGENT = "重要不紧急"

        const val STATUS_NOTSTARTED = "刚创建未开始"
        const val STATUS_REMINDED = "已提醒未开始"
        const val STATUS_COMPLETED = "已完成"
    }

    var id: Long = 0
    var codeNum: Int = 0
    var title: String? = null
    var voice: String? = null
    var isAllTheDay: Boolean? = null
    var remindMe: Boolean? = null
    var startAt: LocalDateTime? = null
    var endAt: LocalDateTime? = null
    var remindAt: String? = "5分钟"
    var repeatType: String = REPEATYPE_ONETIME
    var label: String? = null
    var background: String? = null
    var importance: String? = null
    var comment: String? = null
    var status:String = STATUS_NOTSTARTED

//    @Document(comment = "激励语")
//    @ManyToOne
//    @JoinColumn(foreignKey = ForeignKey(name = "encouragement_id_fk"), nullable = false)
    var encouragement: Encouragement? = null

    var user: User? = null
}