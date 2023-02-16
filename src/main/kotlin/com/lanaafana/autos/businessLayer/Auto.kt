package com.lanaafana.autos.businessLayer

import jakarta.persistence.*
import org.springframework.stereotype.Component

//@Data
//@AllArgsConstructor
@Entity
@Table(name = "AUTO")

data class AutoDTO(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
//    @JsonIgnore
    private var id: Long,

//    @Column
//    @ManyToOne
//    @JoinColumn(name = "id")
//    private var brand: Brand? = null,
    private var brand: String?,

//    @Column
//    @ManyToOne
//    @JoinColumn(name = "id")
//    private var model: Model? = null,
    private var model: String?,

//    @Column
//    @ManyToOne
//    @JoinColumn(name = "id")
//    private var color: Color? = null,
    private var color: String?,

//    @Column
    private var engineNumber: String?
)