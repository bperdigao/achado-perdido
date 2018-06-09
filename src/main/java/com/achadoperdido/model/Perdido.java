package com.achadoperdido.model;

import java.util.Date;

/**
 *
 * @author Bruno Bernardo
 * Classe criada a partir da ideia inicial do David
 */
public class Perdido {
    
    private Integer id;
    private String 	cor;
    private String 	modelo;
    private Date 	dataAchado;
    private String 	local;
    private String 	telefone;
    private String 	email;
    private String 	nomeEncontrou;
    
	public Perdido(Integer id, String cor, String modelo, Date dataAchado, String local, String telefone, String email,
			String nomeEncontrou) {
		
		super();
		this.id = id;
		this.cor = cor;
		this.modelo = modelo;
		this.dataAchado = dataAchado;
		this.local = local;
		this.telefone = telefone;
		this.email = email;
		this.nomeEncontrou = nomeEncontrou;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Date getDataAchado() {
		return dataAchado;
	}
	
	public void setDataAchado(Date dataAchado) {
		this.dataAchado = dataAchado;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNomeEncontrou() {
		return nomeEncontrou;
	}
	
	public void setNomeEncontrou(String nomeEncontrou) {
		this.nomeEncontrou = nomeEncontrou;
	}
    
	//apenas teste
	public void compara() {
		
	}
}
