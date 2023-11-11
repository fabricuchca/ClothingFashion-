package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Users;

public class ClosetDTO {
    private int idCloset;
    private String styleCloset;
    private String nameCloset;
    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public int getIdCloset() {
        return idCloset;
    }

    public void setIdCloset(int idCloset) {
        this.idCloset = idCloset;
    }

    public String getstyleCloset() {
        return styleCloset;
    }

    public void setstyleCloset(String styleCloset) {
        this.styleCloset = styleCloset;
    }

    public String getnameCloset() {
        return nameCloset;
    }

    public void setnameCloset(String nameCloset) {
        this.nameCloset = nameCloset;
    }
}
