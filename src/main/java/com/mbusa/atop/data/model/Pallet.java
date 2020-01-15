package com.mbusa.atop.data.model;

import java.util.List;

public class Pallet {
	private String Number;

	private List<Part> Parts;

	public String getNumber ()
	{
		return Number;
	}

	public void setNumber (String Number)
	{
		this.Number = Number;
	}

	public List<Part> getParts ()
	{
		return Parts;
	}

	public void setParts (List<Part> Parts)
	{
		this.Parts = Parts;
	}

	@Override
	public String toString()
	{
		return "Pallet [Number = "+Number+", Parts = "+Parts+"]";
	}
}
