package com.javarush.ostapenko.hibernate_final.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.JdbcTypeCode;

import java.math.BigDecimal;
import java.sql.Types;


@Entity
@Table(name = "country_language", schema = "world")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CountryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country countryId;
    @Column(length = 30)
    private String language;
    @Column(name = "is_official")
    @JdbcTypeCode(Types.BIT)
    private Boolean isOfficial;
    private BigDecimal percentage;
}
