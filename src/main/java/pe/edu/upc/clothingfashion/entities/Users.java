package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class Users implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nameUser",nullable = false,length = 40)
	private String nameUser;
	@Column(name = "lastNameUser",nullable = false,length = 40)
	private String lastNameUser;
	@Column(name = "addressUser",nullable = false,length = 80)
	private String addressUser;
	@Column(name = "cardUser",nullable = false,length = 16)
	private String cardUser;
	@Column(name = "telephoneUser",nullable = false,length = 9)
	private String telephoneUser;
	@Column(name = "mail",nullable = false,length = 40)
	private String mail;
	@Column(name = "birthDate",nullable = false)
	private LocalDate birthDate;
	@Column(length = 30, unique = true)
	private String username;
	@Column(length = 200)
	private String password;
	private Boolean enabled;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private List<Role> roles;

	public Users() {
	}

	public Users(Long id, String nameUser, String lastNameUser, String addressUser, String cardUser, String telephoneUser, String mail, LocalDate birthDate, String username, String password, Boolean enabled, List<Role> roles) {
		this.id = id;
		this.nameUser = nameUser;
		this.lastNameUser = lastNameUser;
		this.addressUser = addressUser;
		this.cardUser = cardUser;
		this.telephoneUser = telephoneUser;
		this.mail = mail;
		this.birthDate = birthDate;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getLastNameUser() {
		return lastNameUser;
	}

	public void setLastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}

	public String getAddressUser() {
		return addressUser;
	}

	public void setAddressUser(String addressUser) {
		this.addressUser = addressUser;
	}

	public String getCardUser() {
		return cardUser;
	}

	public void setCardUser(String cardUser) {
		this.cardUser = cardUser;
	}

	public String getTelephoneUser() {
		return telephoneUser;
	}

	public void setTelephoneUser(String telephoneUser) {
		this.telephoneUser = telephoneUser;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}