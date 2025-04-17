package com.dj.mapleapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "starforce_option")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StarforceOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "set_name", nullable = false)
    private String setName;

    @Column(name = "starforce", nullable = false)
    private Integer starforce;

    @Column(name = "max_damage")
    private Float maxDamage;

    @Column(name = "final_damage")
    private Float finalDamage;

    @Column(name = "crit_damage")
    private Float critDamage;

    @Column(name = "boss_damage")
    private Float bossDamage;

    @Column(name = "damage")
    private Float damage;

    @Column(name = "attack")
    private Float attack;

    @Column(name = "armor_penetration")
    private Float armorPenetration;
}

