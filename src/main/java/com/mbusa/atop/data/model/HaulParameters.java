package com.mbusa.atop.data.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "HaulParameters")
public class HaulParameters {
	@JacksonXmlProperty(localName = "HaulParameter2")
	private String HaulParameter2;

	@JacksonXmlProperty(localName = "HaulType")
	private String HaulType;

	public String getHaulParameter2 ()
	{
		return HaulParameter2;
	}

	public void setHaulParameter2 (String HaulParameter2)
	{
		this.HaulParameter2 = HaulParameter2;
	}

	public String getHaulType ()
	{
		return HaulType;
	}

	public void setHaulType (String HaulType)
	{
		this.HaulType = HaulType;
	}

	@Override
	public String toString()
	{
		return "HaulParameters [HaulParameter2 = "+HaulParameter2+", HaulType = "+HaulType+"]";
	}
}
