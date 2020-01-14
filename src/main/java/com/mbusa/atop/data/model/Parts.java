package com.mbusa.atop.data.model;

import java.util.List;

public class Parts {
	private List<Part> Part;

	public List<Part> getPart ()
	{
		return Part;
	}

	public void setPart (List<Part> Part)
	{
		this.Part = Part;
	}

	@Override
	public String toString()
	{
		return "Parts [Part = "+Part+"]";
	}
}
