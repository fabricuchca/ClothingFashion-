package pe.edu.upc.clothingfashion.dtos;

import java.time.LocalDate;

public class SuscriptionUsersDTO {
    private LocalDate paymentDate;
    private int quantityUsers;

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getQuantityUsers() {
        return quantityUsers;
    }

    public void setQuantityUsers(int quantityUsers) {
        this.quantityUsers = quantityUsers;
    }
}
