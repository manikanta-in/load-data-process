package com.mbusa.atop.data.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Carrier")
public class Carrier {

	@JacksonXmlProperty(localName = "Name")
	private String Name;
	
	@JacksonXmlProperty(localName = "SCAC")
	private String SCAC;
	public String getName() {
		return Name;
	}

	public String getSCAC() {
		return SCAC;
	}


	public void setName(String Name) {
		this.Name = Name;
	}

	public void setSCAC(String SCAC) {
		this.SCAC = SCAC;
	}

	@Override
	public String toString() {
		return "Carrier [Name=" + Name + ", SCAC=" + SCAC + ", getName()=" + getName() + ", getSCAC()=" + getSCAC()
				+ "]";
	}
}
