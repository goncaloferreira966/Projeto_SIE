
package com.company.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "BusinessObject")
@Table(name = "BUSINESSOBJECT")
@NamedQueries({
    @NamedQuery(name = "BusinessObject.findByPersistenceId", query = "SELECT b\nFROM BusinessObject b\nWHERE b.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "BusinessObject.findByEncomendaConforme", query = "SELECT b\nFROM BusinessObject b\nWHERE b.encomendaConforme= :encomendaConforme\nORDER BY b.persistenceId"),
    @NamedQuery(name = "BusinessObject.find", query = "SELECT b\nFROM BusinessObject b\nORDER BY b.persistenceId"),
    @NamedQuery(name = "BusinessObject.countForFindByEncomendaConforme", query = "SELECT COUNT(b)\nFROM BusinessObject b\nWHERE b.encomendaConforme= :encomendaConforme\n"),
    @NamedQuery(name = "BusinessObject.countForFind", query = "SELECT COUNT(b)\nFROM BusinessObject b\n")
})
public class BusinessObject implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "ENCOMENDACONFORME", nullable = false)
    private Boolean encomendaConforme;

    public BusinessObject() {
    }

    public void setPersistenceId(Long persistenceId) {
        this.persistenceId = persistenceId;
    }

    public Long getPersistenceId() {
        return persistenceId;
    }

    public void setPersistenceVersion(Long persistenceVersion) {
        this.persistenceVersion = persistenceVersion;
    }

    public Long getPersistenceVersion() {
        return persistenceVersion;
    }

    public void setEncomendaConforme(Boolean encomendaConforme) {
        this.encomendaConforme = encomendaConforme;
    }

    public Boolean isEncomendaConforme() {
        return encomendaConforme;
    }

}
