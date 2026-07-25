package com.gestao.financeira.entity.model;

import com.gestao.financeira.entity.enums.TypeOfTransaction;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String description;
    public BigDecimal value;
    public TypeOfTransaction type;
    public LocalDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    public Long userId;
    @ManyToOne(fetch = FetchType.LAZY)
    public Long accountId;

}