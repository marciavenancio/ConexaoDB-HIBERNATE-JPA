package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;

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
@Table(name = "tbl_estabelecimento")
public class Estabelecimento {

    @Id
    @SequenceGenerator(name="estabelecimento",sequenceName="sq_tbl_estabelecimento",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="estabelecimento")
    @Column(name = "id_estabelecimento")
    private Integer id;

    @Column(name = "nome_estabelecimento",nullable = false, length = 50)
    private String nome;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_criacao")
    private Calendar dataCriacao;

    public Estabelecimento() {
		super();
    }

	public Estabelecimento(Integer id, String nome, Calendar dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
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

    public Calendar getDataCriacao() {
         return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
         this.dataCriacao = dataCriacao;
    }

}