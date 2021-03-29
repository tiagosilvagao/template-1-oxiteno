package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela AGENDADOR
* @generated
*/
@Entity
@Table(name = "\"AGENDADOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.agendador")
public class agendador implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "title", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String title;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date start;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date end;

    /**
    * @generated
    */
    @Column(name = "starttimezone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String starttimezone;

    /**
    * @generated
    */
    @Column(name = "endtimezone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String endtimezone;

    /**
    * @generated
    */
    @Column(name = "description", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String description;

    /**
    * @generated
    */
    @Column(name = "recurrencerule", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String recurrencerule;

    /**
    * @generated
    */
    @Column(name = "recurrenceexception", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String recurrenceexception;

    /**
    * @generated
    */
    @Column(name = "isallday", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean isallday;

    /**
    * Construtor
    * @generated
    */
    public agendador(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public agendador setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém title
    * return title
    * @generated
    */
    
    public java.lang.String getTitle(){
        return this.title;
    }

    /**
    * Define title
    * @param title title
    * @generated
    */
    public agendador setTitle(java.lang.String title){
        this.title = title;
        return this;
    }
    /**
    * Obtém start
    * return start
    * @generated
    */
    
    public java.util.Date getStart(){
        return this.start;
    }

    /**
    * Define start
    * @param start start
    * @generated
    */
    public agendador setStart(java.util.Date start){
        this.start = start;
        return this;
    }
    /**
    * Obtém end
    * return end
    * @generated
    */
    
    public java.util.Date getEnd(){
        return this.end;
    }

    /**
    * Define end
    * @param end end
    * @generated
    */
    public agendador setEnd(java.util.Date end){
        this.end = end;
        return this;
    }
    /**
    * Obtém starttimezone
    * return starttimezone
    * @generated
    */
    
    public java.lang.String getStarttimezone(){
        return this.starttimezone;
    }

    /**
    * Define starttimezone
    * @param starttimezone starttimezone
    * @generated
    */
    public agendador setStarttimezone(java.lang.String starttimezone){
        this.starttimezone = starttimezone;
        return this;
    }
    /**
    * Obtém endtimezone
    * return endtimezone
    * @generated
    */
    
    public java.lang.String getEndtimezone(){
        return this.endtimezone;
    }

    /**
    * Define endtimezone
    * @param endtimezone endtimezone
    * @generated
    */
    public agendador setEndtimezone(java.lang.String endtimezone){
        this.endtimezone = endtimezone;
        return this;
    }
    /**
    * Obtém description
    * return description
    * @generated
    */
    
    public java.lang.String getDescription(){
        return this.description;
    }

    /**
    * Define description
    * @param description description
    * @generated
    */
    public agendador setDescription(java.lang.String description){
        this.description = description;
        return this;
    }
    /**
    * Obtém recurrencerule
    * return recurrencerule
    * @generated
    */
    
    public java.lang.String getRecurrencerule(){
        return this.recurrencerule;
    }

    /**
    * Define recurrencerule
    * @param recurrencerule recurrencerule
    * @generated
    */
    public agendador setRecurrencerule(java.lang.String recurrencerule){
        this.recurrencerule = recurrencerule;
        return this;
    }
    /**
    * Obtém recurrenceexception
    * return recurrenceexception
    * @generated
    */
    
    public java.lang.String getRecurrenceexception(){
        return this.recurrenceexception;
    }

    /**
    * Define recurrenceexception
    * @param recurrenceexception recurrenceexception
    * @generated
    */
    public agendador setRecurrenceexception(java.lang.String recurrenceexception){
        this.recurrenceexception = recurrenceexception;
        return this;
    }
    /**
    * Obtém isallday
    * return isallday
    * @generated
    */
    
    public java.lang.Boolean getIsallday(){
        return this.isallday;
    }

    /**
    * Define isallday
    * @param isallday isallday
    * @generated
    */
    public agendador setIsallday(java.lang.Boolean isallday){
        this.isallday = isallday;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
agendador object = (agendador)obj;
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