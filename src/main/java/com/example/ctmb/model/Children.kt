package com.example.ctmb.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "children")
class Children {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long = 0

    @Column(name = "birthday")
    var birthday: LocalDateTime? = null

    @Column(name = "gender")
    var gender:String? = null

    @Column(name = "name")
    var name: String? = null

    @OneToMany(mappedBy = "children")
    var family:MutableSet<User> = mutableSetOf()
}