package com.mbusa.atop.data.model;

public class PONumbers {
	private String PONumber;

	public String getPONumber ()
	{
		return PONumber;
	}

	public void setPONumber (String PONumber)
	{
		this.PONumber = PONumber;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [PONumber = "+PONumber+"]";
	}
}
