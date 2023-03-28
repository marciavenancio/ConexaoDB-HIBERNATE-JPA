package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tbl_fornecedores")
public class Fornecedores {
	
	@Id
    @SequenceGenerator(name="fornecedores",sequenceName="sq_tbl_fornecedores",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="fornecedores")
    @Column(name = "id_fornecedor")
    private Integer id;

    @Column(name = "nome_fornecedor",nullable = false, length = 50)
    private String nome;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_cadastro")
    private Calendar dataCadastro;
    
    @Enumerated(EnumType.STRING)
    private Estado estado;


	public Fornecedores() {
		super();
	}



	public Fornecedores(Integer id, String nome, Calendar dataCadastro, Estado estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.estado = estado;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Calendar getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	

	public Estado getEstado() {
		return estado;
	}

}
