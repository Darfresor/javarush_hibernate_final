package com.javarush.ostapenko.hibernate_final.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.JdbcTypeCode;

import java.math.BigDecimal;
import java.sql.Types;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "country", schema = "world")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 3)
    private String code;
    @Column(name = "code_2", length = 3)
    private String alternativeCode;
    @Column(length = 52)
    private String name;
    @Column(name = "continent")
    @Enumerated(EnumType.ORDINAL)
    @JdbcTypeCode(Types.INTEGER)
    private Continent continent;
    @Column(length = 26)
    private String region;
    @Column(name = "surface_area")
    private BigDecimal surfaceArea;
    @Column(name = "indep_year")
    private Short indepYear;
    private Integer population;
    @Column(name = "life_expectancy")
    private BigDecimal lifeExpectancy;
    private BigDecimal gnp;
    @Column(name = "gnpo_id")
    private BigDecimal gnpoId;
    @Column(name = "local_name", length = 45)
    private String localName;
    @Column(name = "government_form", length = 45)
    private String governmentForm;
    @Column(name = "head_of_state", length = 60)
    private String headOfState;
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<City> capital;

    @OneToMany(mappedBy = "countryId", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
    private Set<CountryLanguage> countryLanguages;

}
