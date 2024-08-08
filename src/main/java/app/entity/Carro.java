
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
* Classe que representa a tabela CARRO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CARRO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Carro")
@CronappTable(role=CronappTableRole.CLASS)
public class Carro implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Modelo")
    @Column(name = "Modelo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String modelo;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Marca")
    @Column(name = "Marca", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String marca;


    /**
    * Construtor
    * @generated
    */
    public Carro(){
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
    public Carro setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém modelo
    * return modelo
    * @generated
    */
    public java.lang.String getModelo() {
        return this.modelo;
    }

    /**
    * Define modelo
    * @param modelo modelo
    * @generated
    */
    public Carro setModelo(java.lang.String modelo) {
        this.modelo = modelo;
        return this;
    }
    /**
    * Obtém marca
    * return marca
    * @generated
    */
    public java.lang.String getMarca() {
        return this.marca;
    }

    /**
    * Define marca
    * @param marca marca
    * @generated
    */
    public Carro setMarca(java.lang.String marca) {
        this.marca = marca;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Carro object = (Carro)obj;
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