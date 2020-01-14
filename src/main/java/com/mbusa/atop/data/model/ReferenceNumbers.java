package com.mbusa.atop.data.model;

import java.util.List;

public class ReferenceNumbers {
	private List<String> ReferenceNumber;

	public List<String> getReferenceNumber ()
	{
		return ReferenceNumber;
	}

	public void setReferenceNumber (List<String> ReferenceNumber)
	{
		this.ReferenceNumber = ReferenceNumber;
	}

	@Override
	public String toString()
	{
		return "ReferenceNumbers [ReferenceNumber = "+ReferenceNumber+"]";
	}
}
