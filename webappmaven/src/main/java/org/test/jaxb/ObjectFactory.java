package org.test.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the axway.tnt.query package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _RemotePoll_QNAME = new QName(
			"urn:axway:tnt:query", "RemotePoll");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: axway.tnt.query
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link RemotePoll }
	 * 
	 */
	public RemotePoll createRemotePoll() {
		return new RemotePoll();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link RemotePoll }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:axway:tnt:query", name = "RemotePoll")
	public JAXBElement<RemotePoll> createRemotePoll(RemotePoll value) {
		return new JAXBElement<RemotePoll>(_RemotePoll_QNAME, RemotePoll.class,
				null, value);
	}
}
