package com.projectalt96.expenses.connector.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "expense")
@Data
@Component
public class ExpenseJPAEntity implements Serializable {
    @Id
    private Integer id;

    private String data;

    private String descrizione;

    private BigDecimal importo;

    private String categoria;

    private String note;

    private String dataInserimento;

    private String dataUltimaModifica;

    private String utente;

    private String stato;

    private String dataApprovazione;

    private String dataRifiuto;

    private String motivoRifiuto;

    private String dataPagamento;

    private String metodoPagamento;

}
