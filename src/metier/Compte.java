package metier;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="compte")
/*
 * les annotations de JXWS sont accessibles pour les getters 
 *  pour les mettre sur les fields on utilise l'annotation suivante
 */
@XmlAccessorType(XmlAccessType.FIELD) 
public class Compte implements Serializable{

	private Long code;
	private double solde;
	
	  //la date de creation n'est pas vue par le client
	  @XmlTransient
	 
	private Date dateCreation;
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/*
	 * //la date de creation n'est pas vue par le client
	 * @XmlTransient
	 */
		
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Compte(Long code, double solde, Date dateCreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	public Compte() {
		super();
	}
	
	
}
