package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Suscipcion")
public class Suscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscription;
    @Column(name = "amount",nullable = false,length = 6)
    private double amount;
    @Column(name = "paymentDate",nullable = false)
    private LocalDate paymentDate;
    @Column(name = "state",nullable = false)
    private char state;
    @Column(name = "startSuscription",nullable = false)
    private LocalDate startSuscription;
    @ManyToOne
    @JoinColumn(name = "idUsers")
    private Users users;

    public Suscription() {
    }

    public Suscription(int idSuscription, double amount, LocalDate paymentDate, char state, LocalDate startSuscription, Users users) {
        this.idSuscription = idSuscription;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.state = state;
        this.startSuscription = startSuscription;
        this.users = users;
    }

    public int getIdSuscription() {
        return idSuscription;
    }

    public void setIdSuscription(int idSuscription) {
        this.idSuscription = idSuscription;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

    public LocalDate getStartSuscription() {
        return startSuscription;
    }

    public void setStartSuscription(LocalDate startSuscription) {
        this.startSuscription = startSuscription;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
