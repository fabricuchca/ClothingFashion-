package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Users;

import java.time.LocalDate;

public class SuscriptionDTO {
    private int idSuscription;
    private double amount;
    private LocalDate paymentDate;
    private char state;
    private LocalDate startSuscription;
    private Users users;

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
