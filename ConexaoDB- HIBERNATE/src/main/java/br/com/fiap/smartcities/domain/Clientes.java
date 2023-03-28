package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tbl_clientes")
public class Clientes {
	
	@Id
    @SequenceGenerator(name="clientes",sequenceName="sq_tbl_clientes",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="clientes")
    @Column(name = "id_clientes")
    private Integer id;

    @Column(name = "nome_cliente",nullable = false, length = 50)
    private String nome;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_cadastro")
    private Calendar dataCadastro;
    
    @UpdateTimestamp
    @Column(name = "dt_ultima_compra")
    private Calendar dataUltimaCompra;
    
    

	public Clientes() {
		super();
		
	}

	public Clientes(Integer id, String nome, Calendar dataCadastro, Calendar dataUltimaCompra) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.dataUltimaCompra = dataUltimaCompra;
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

	public Calendar getDataUltimaCompra() {
		return dataUltimaCompra;
	}

	public void setDataUltimaCompra(Calendar dataUltimaCompra) {
		this.dataUltimaCompra = dataUltimaCompra;
	}

	

}
