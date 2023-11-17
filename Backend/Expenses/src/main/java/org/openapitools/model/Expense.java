package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Expense
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-17T20:18:07.219970400+01:00[Europe/Rome]")
public class Expense implements Serializable {

  private static final long serialVersionUID = 1L;

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

  public Expense id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Expense data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Expense descrizione(String descrizione) {
    this.descrizione = descrizione;
    return this;
  }

  /**
   * Get descrizione
   * @return descrizione
  */
  
  @Schema(name = "descrizione", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("descrizione")
  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  public Expense importo(BigDecimal importo) {
    this.importo = importo;
    return this;
  }

  /**
   * Get importo
   * @return importo
  */
  @Valid 
  @Schema(name = "importo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("importo")
  public BigDecimal getImporto() {
    return importo;
  }

  public void setImporto(BigDecimal importo) {
    this.importo = importo;
  }

  public Expense categoria(String categoria) {
    this.categoria = categoria;
    return this;
  }

  /**
   * Get categoria
   * @return categoria
  */
  
  @Schema(name = "categoria", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoria")
  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public Expense note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
  */
  
  @Schema(name = "note", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Expense dataInserimento(String dataInserimento) {
    this.dataInserimento = dataInserimento;
    return this;
  }

  /**
   * Get dataInserimento
   * @return dataInserimento
  */
  
  @Schema(name = "dataInserimento", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataInserimento")
  public String getDataInserimento() {
    return dataInserimento;
  }

  public void setDataInserimento(String dataInserimento) {
    this.dataInserimento = dataInserimento;
  }

  public Expense dataUltimaModifica(String dataUltimaModifica) {
    this.dataUltimaModifica = dataUltimaModifica;
    return this;
  }

  /**
   * Get dataUltimaModifica
   * @return dataUltimaModifica
  */
  
  @Schema(name = "dataUltimaModifica", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataUltimaModifica")
  public String getDataUltimaModifica() {
    return dataUltimaModifica;
  }

  public void setDataUltimaModifica(String dataUltimaModifica) {
    this.dataUltimaModifica = dataUltimaModifica;
  }

  public Expense utente(String utente) {
    this.utente = utente;
    return this;
  }

  /**
   * Get utente
   * @return utente
  */
  
  @Schema(name = "utente", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("utente")
  public String getUtente() {
    return utente;
  }

  public void setUtente(String utente) {
    this.utente = utente;
  }

  public Expense stato(String stato) {
    this.stato = stato;
    return this;
  }

  /**
   * Get stato
   * @return stato
  */
  
  @Schema(name = "stato", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stato")
  public String getStato() {
    return stato;
  }

  public void setStato(String stato) {
    this.stato = stato;
  }

  public Expense dataApprovazione(String dataApprovazione) {
    this.dataApprovazione = dataApprovazione;
    return this;
  }

  /**
   * Get dataApprovazione
   * @return dataApprovazione
  */
  
  @Schema(name = "dataApprovazione", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataApprovazione")
  public String getDataApprovazione() {
    return dataApprovazione;
  }

  public void setDataApprovazione(String dataApprovazione) {
    this.dataApprovazione = dataApprovazione;
  }

  public Expense dataRifiuto(String dataRifiuto) {
    this.dataRifiuto = dataRifiuto;
    return this;
  }

  /**
   * Get dataRifiuto
   * @return dataRifiuto
  */
  
  @Schema(name = "dataRifiuto", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataRifiuto")
  public String getDataRifiuto() {
    return dataRifiuto;
  }

  public void setDataRifiuto(String dataRifiuto) {
    this.dataRifiuto = dataRifiuto;
  }

  public Expense motivoRifiuto(String motivoRifiuto) {
    this.motivoRifiuto = motivoRifiuto;
    return this;
  }

  /**
   * Get motivoRifiuto
   * @return motivoRifiuto
  */
  
  @Schema(name = "motivoRifiuto", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("motivoRifiuto")
  public String getMotivoRifiuto() {
    return motivoRifiuto;
  }

  public void setMotivoRifiuto(String motivoRifiuto) {
    this.motivoRifiuto = motivoRifiuto;
  }

  public Expense dataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
    return this;
  }

  /**
   * Get dataPagamento
   * @return dataPagamento
  */
  
  @Schema(name = "dataPagamento", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPagamento")
  public String getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  public Expense metodoPagamento(String metodoPagamento) {
    this.metodoPagamento = metodoPagamento;
    return this;
  }

  /**
   * Get metodoPagamento
   * @return metodoPagamento
  */
  
  @Schema(name = "metodoPagamento", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metodoPagamento")
  public String getMetodoPagamento() {
    return metodoPagamento;
  }

  public void setMetodoPagamento(String metodoPagamento) {
    this.metodoPagamento = metodoPagamento;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expense expense = (Expense) o;
    return Objects.equals(this.id, expense.id) &&
        Objects.equals(this.data, expense.data) &&
        Objects.equals(this.descrizione, expense.descrizione) &&
        Objects.equals(this.importo, expense.importo) &&
        Objects.equals(this.categoria, expense.categoria) &&
        Objects.equals(this.note, expense.note) &&
        Objects.equals(this.dataInserimento, expense.dataInserimento) &&
        Objects.equals(this.dataUltimaModifica, expense.dataUltimaModifica) &&
        Objects.equals(this.utente, expense.utente) &&
        Objects.equals(this.stato, expense.stato) &&
        Objects.equals(this.dataApprovazione, expense.dataApprovazione) &&
        Objects.equals(this.dataRifiuto, expense.dataRifiuto) &&
        Objects.equals(this.motivoRifiuto, expense.motivoRifiuto) &&
        Objects.equals(this.dataPagamento, expense.dataPagamento) &&
        Objects.equals(this.metodoPagamento, expense.metodoPagamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data, descrizione, importo, categoria, note, dataInserimento, dataUltimaModifica, utente, stato, dataApprovazione, dataRifiuto, motivoRifiuto, dataPagamento, metodoPagamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expense {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    importo: ").append(toIndentedString(importo)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    dataInserimento: ").append(toIndentedString(dataInserimento)).append("\n");
    sb.append("    dataUltimaModifica: ").append(toIndentedString(dataUltimaModifica)).append("\n");
    sb.append("    utente: ").append(toIndentedString(utente)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("    dataApprovazione: ").append(toIndentedString(dataApprovazione)).append("\n");
    sb.append("    dataRifiuto: ").append(toIndentedString(dataRifiuto)).append("\n");
    sb.append("    motivoRifiuto: ").append(toIndentedString(motivoRifiuto)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    metodoPagamento: ").append(toIndentedString(metodoPagamento)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

