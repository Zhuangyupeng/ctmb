package com.example.ctmb.model

import javax.persistence.*

@Entity
@Table(name = "encouragement")
class Encouragement {

    companion object {
        const val CREATETYPE_MANAGER = "管理员"
        const val CREATETYPE_USER = "用户"
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long = 0
    @Column(name = "content")
    var content: String? = null
    @Column(name = "voice")
    var voice: String? = null
    @Column(name = "createType")
    var createType: String? = null
    @Column(name = "useCount")
    var useCount: Long = 0

    @OneToMany(mappedBy = "encouragement")
    var activity:MutableSet<Activity> = mutableSetOf()

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = ForeignKey(name = "sources_id_fk"))
    var sources:User? = null

//    var admin:Admin? = null
}