package com.mbusa.atop.data.model;

public class HaulParameters {
	private String HaulParameter2;

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
