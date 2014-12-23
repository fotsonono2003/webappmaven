package org.test.jaxb;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

public class TestJaxb {
	
	public void method1() throws JAXBException {
		InputStream input = getClass().getResourceAsStream(
				"AuditPollOnRemoteServer_Result.xml");
		JAXBContext context = JAXBContext.newInstance(RemotePoll.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		JAXBElement<RemotePoll> element = unmarshaller.unmarshal(new StreamSource(input), RemotePoll.class);
		RemotePoll remotePoll = element.getValue();
		System.out.println("/*/*/**/*/*/*/*/*/*/Test unmarshall:"
				+ remotePoll.getRemoteServer());
	}

	public void method2() throws JAXBException {
		InputStream input=getClass().getResourceAsStream("AuditPollOnRemoteServer_Result.xml");
		JAXBContext jc = JAXBContext.newInstance(RemotePoll.class.getPackage().getName());
	    Unmarshaller unmarshaller = jc.createUnmarshaller();
	    Object object= unmarshaller.unmarshal(input);
	    System.out.println("JaxBIntrospector:"+JAXBIntrospector.getValue(object).getClass());
	    RemotePoll remotePoll=(RemotePoll)JAXBIntrospector.getValue(object);
	    System.out.println("/*/*/*/*/*/*/*/*/*/Remote:"+remotePoll.getRemoteServer());
	}
	
	public void method3() throws JAXBException
	{
		InputStream input=getClass().getResourceAsStream("AuditPollOnRemoteServer_Result.xml");
		JAXBContext context = JAXBContext.newInstance(RemotePoll.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        JAXBElement<RemotePoll> jaxbElement= unmarshaller.unmarshal(new StreamSource(input), RemotePoll.class);
        System.out.println("JaxBIntrospector:"+JAXBIntrospector.getValue(jaxbElement).getClass());
        RemotePoll remotePoll=(RemotePoll)JAXBIntrospector.getValue(jaxbElement);
        System.out.println("/*/*/*/*/*/*/*/*/*/Remote:"+remotePoll.getRemoteServer());
	}
	
	public static void main(String[] arg) throws JAXBException {
		TestJaxb test=new TestJaxb();
		test.method1();
		test.method2();
		test.method3();
	}
}
