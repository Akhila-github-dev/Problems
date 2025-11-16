package com.javascriptobjectnotation;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class XmlStreamPractice {
	
	public static void main(String[] args) {
		XMLOutputFactory xof= XMLOutputFactory.newInstance();
		
		try {
			XMLStreamWriter xsw= xof.createXMLStreamWriter(new FileWriter("akhil.xml"));
			
			xsw.writeStartDocument("UTF-8","1.0");
			
			xsw.writeStartElement("transactions");
			xsw.writeStartElement("transaction");
			xsw.writeAttribute("id","1");
			
			xsw.writeStartElement("date");
			xsw.writeCharacters("2020-2-28");
			xsw.writeEndElement();
			
			xsw.writeStartElement("name");
			xsw.writeCharacters("akhila");
			xsw.writeEndElement();
			
			xsw.writeStartElement("amount");
			xsw.writeCharacters("10008");
			xsw.writeEndElement();
			
			
			xsw.writeEndElement();
			xsw.writeEndDocument();
			
			xsw.close();
			
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
