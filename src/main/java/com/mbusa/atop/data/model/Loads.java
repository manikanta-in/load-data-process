package com.mbusa.atop.data.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "Loads")
public class Loads {
	
	
	@JacksonXmlProperty(localName = "Load")
	private List<Load> load;

	public List<Load> getLoads ()
	{
		return load;
	}

	public void setLoads (List<Load> load)
	{
		this.load = load;
	}

	@Override
	public String toString()
	{
		return "Loads [Load = "+load+"]";
	}
}
