package com.example.ctmb.model

import java.time.LocalDateTime

class Children {
    var id: Long = 0
    var birthday: LocalDateTime? = null
    var gender:String? = null
    var name: String? = null

    var family:MutableSet<User>? = null
}