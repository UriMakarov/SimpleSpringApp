package com.colvir.homework.simpleApp.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "payment_orders")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_orders_id_sequence")
    @SequenceGenerator(name = "payment_orders_id_sequence", sequenceName = "payment_orders_id_seq", allocationSize = 1)
    private Integer id ;



    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;
    private double amount;
    private Date transferDate;

    public Payment(Integer id, Employee employee, double amount, Date transferDate) {
        this.id = id;
        this.employee = employee;
        this.amount = amount;
        this.transferDate = transferDate;
    }
    public Payment() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", employee=" + employee +
                ", amount=" + amount +
                ", transferDate=" + transferDate +
                '}';
    }
}
