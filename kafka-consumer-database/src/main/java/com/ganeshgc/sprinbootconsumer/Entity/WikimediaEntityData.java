package com.ganeshgc.sprinbootconsumer.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="wikimedia_data")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class WikimediaEntityData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String wikimediadata;
}
