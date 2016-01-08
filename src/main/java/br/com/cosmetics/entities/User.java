package br.com.cosmetics.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "User")
@Table(name = "TB_USER")
public class User extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7357769402609376167L;

	private String login;
	private String password;

	public User() {
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
