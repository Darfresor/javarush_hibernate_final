package com.javarush.ostapenko.hibernate_final.redis;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Language {
    private String language;
    private Boolean isOfficial;
    private BigDecimal percentage;
}
