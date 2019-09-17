package com.example.ctmb.model

import dev.longan.annotation.Document
import javax.persistence.*

@Entity
@Table(name = "device")
class Device {

    @Document(alias = "主键", sample = "1")
    @Id
    @Column(name = "id")
    var id: Long = 0
    @Column(name = "serialNum")
    var serialNum: String? = null
    @Column(name = "deviceNum")
    var deviceNum: String? = null
    @Column(name = "versionNum")
    var versionNum: String? = null
    @Column(name = "wifiName")
    var wifiName: String? = null
    @Column(name = "wifiStrength")
    var wifiStrength: Int? = null
    @Column(name = "ipAddr")
    var ipAddr: String? = null

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_device", joinColumns = [JoinColumn(foreignKey = ForeignKey(name = "device_id_fk"), name = "device_id")],
            inverseJoinColumns = [JoinColumn(foreignKey = ForeignKey(name = "user_id_fk"), name = "user_id")])
    var users: MutableSet<User> = mutableSetOf()
}