package com.example.ctmb.model

import java.time.LocalDateTime

class Activity {
    var id: Long = 0
    var codeNum: Int = 0
    var title: String? = null
    var voice: String? = null
    var allTheDay: Int = 0
    var startAt: LocalDateTime? = null
    var endAt: LocalDateTime? = null
    var remindAt: LocalDateTime? = null
}