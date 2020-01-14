package com.mbusa.atop.data.model;

public class Pallet {
	private String Number;

	private Parts Parts;

	public String getNumber ()
	{
		return Number;
	}

	public void setNumber (String Number)
	{
		this.Number = Number;
	}

	public Parts getParts ()
	{
		return Parts;
	}

	public void setParts (Parts Parts)
	{
		this.Parts = Parts;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [Number = "+Number+", Parts = "+Parts+"]";
	}
}
