
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela ABASTECIMENTO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ABASTECIMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Abastecimento")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class Abastecimento implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_carro", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Carro carro;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_posto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Posto posto;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Quantidade")
    @Column(name = "quantidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double quantidade;


    /**
    * Construtor
    * @generated
    */
    public Abastecimento(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Abastecimento setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém carro
    * return carro
    * @generated
    */
    public Carro getCarro() {
        return this.carro;
    }

    /**
    * Define carro
    * @param carro carro
    * @generated
    */
    public Abastecimento setCarro(Carro carro) {
        this.carro = carro;
        return this;
    }
    /**
    * Obtém posto
    * return posto
    * @generated
    */
    public Posto getPosto() {
        return this.posto;
    }

    /**
    * Define posto
    * @param posto posto
    * @generated
    */
    public Abastecimento setPosto(Posto posto) {
        this.posto = posto;
        return this;
    }
    /**
    * Obtém quantidade
    * return quantidade
    * @generated
    */
    public java.lang.Double getQuantidade() {
        return this.quantidade;
    }

    /**
    * Define quantidade
    * @param quantidade quantidade
    * @generated
    */
    public Abastecimento setQuantidade(java.lang.Double quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Abastecimento object = (Abastecimento)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}