package com.example.ctmb.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "activity")
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long = 0
    @Column(name = "codeNum")
    var codeNum: Int = 0
    @Column(name = "title")
    var title: String? = null
    @Column(name = "voice")
    var voice: String? = null
    @Column(name = "isAllTheDay")
    var isAllTheDay: Boolean? = null
    @Column(name = "remindMe")
    var remindMe: Boolean? = null
    @Column(name = "startAt")
    var startAt: LocalDateTime? = null
    @Column(name = "endAt")
    var endAt: LocalDateTime? = null
    @Column(name = "remindAt")
    var remindAt: String? = "5分钟"
    @Column(name = "repeatType")
    var repeatType: String = REPEATYPE_ONETIME
    @Column(name = "label")
    var label: String? = null
    @Column(name = "background")
    var background: String? = null
    @Column(name = "importance")
    var importance: String? = null
    @Column(name = "comment")
    var comment: String? = null
    @Column(name = "status")
    var status:String = STATUS_NOTSTARTED

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = ForeignKey(name = "encouragement_id_fk"))
    var encouragement: Encouragement? = null

    @ManyToOne
    @JoinColumn(foreignKey = ForeignKey(name = "creator_id_fk"))
    var creator: User? = null
}