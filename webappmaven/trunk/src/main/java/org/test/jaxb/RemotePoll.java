package org.test.jaxb;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.tomcat.jni.Poll;


/**
 * <p>Classe Java pour RemotePoll complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RemotePoll">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remoteServer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poll" type="{urn:epcglobal:epcis-query:xsd:1}Poll"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemotePoll", propOrder = {
    "remoteServer",
    "poll"
})
public class RemotePoll {

    @XmlElement(required = true)
    protected String remoteServer;
    @XmlElement(required = true)
    protected Poll poll;

    /**
     * Obtient la valeur de la propriété remoteServer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteServer() {
        return remoteServer;
    }

    /**
     * Définit la valeur de la propriété remoteServer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteServer(String value) {
        this.remoteServer = value;
    }

    /**
     * Obtient la valeur de la propriété poll.
     * 
     * @return
     *     possible object is
     *     {@link Poll }
     *     
     */
    public Poll getPoll() {
        return poll;
    }

    /**
     * Définit la valeur de la propriété poll.
     * 
     * @param value
     *     allowed object is
     *     {@link Poll }
     *     
     */
    public void setPoll(Poll value) {
        this.poll = value;
    }

}
