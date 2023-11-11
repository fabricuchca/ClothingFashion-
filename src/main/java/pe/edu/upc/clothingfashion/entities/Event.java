package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvent;
    @Column(name = "theme",nullable = false,length = 50)
    private String theme;
    @Column(name = "descriptionEvent",nullable = false,length = 50)
    private String descriptionEvent;
    public Event() {
    }
    public Event(int idEvent, String theme, String descriptionEvent) {
        this.idEvent = idEvent;
        this.theme = theme;
        this.descriptionEvent = descriptionEvent;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescriptionEvent() {
        return descriptionEvent;
    }

    public void setDescriptionEvent(String descriptionEvent) {
        this.descriptionEvent = descriptionEvent;
    }
}
