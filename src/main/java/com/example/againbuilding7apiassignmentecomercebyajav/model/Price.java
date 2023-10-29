package com.example.againbuilding7apiassignmentecomercebyajav.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Price extends BaseModel {
    private  String currency;
    private  Double price;
}
