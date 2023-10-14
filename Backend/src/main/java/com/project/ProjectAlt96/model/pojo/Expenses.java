package com.project.ProjectAlt96.model.pojo;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.Date;
@Entity
@Table(name = "expenses")
@Component
public class Expenses {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "referenceDate")
    private Date referenceDate;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "macroarea")
    private Macroarea macroarea;
    @Column(name = "expense")
    private String expense;
    @Column(name = "value")
    private Double value;
    @Column(name = "salary")
    private Double salary;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user")
    private Users user;


    public Expenses(Date referenceDate, Macroarea macroarea, String expense, Double value, Double salary, Users user){
        this.referenceDate = referenceDate;
        this.macroarea = macroarea;
        this.expense = expense;
        this.value = value;
        this.salary = salary;
        this.user = user;
    }

    public Expenses(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getReferenceDate() {
        return referenceDate;
    }

    public void setReferenceDate(Date referenceDate) {
        this.referenceDate = referenceDate;
    }

    public Macroarea getMacroarea() {
        return macroarea;
    }

    public void setMacroarea(Macroarea macroarea) {
        this.macroarea = macroarea;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Expenses{" +
                "id=" + id + '\n' +
                ", referenceDate=" + referenceDate + '\n' +
                ", macroarea='" + macroarea + '\n' +
                ", expense='" + expense + '\n' +
                ", value=" + value + '\n' +
                ", salary=" + salary +'\n' +
                ", user=" + user + '\n' +
                '}';
    }
}
