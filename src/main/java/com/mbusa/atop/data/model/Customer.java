package com.mbusa.atop.data.model;

public class Customer {
	private PONumbers PONumbers;

	private PointOfContact PointOfContact;

	private String ShipTo;

	private String Id;

	private String Name;

	public PONumbers getPONumbers ()
	{
		return PONumbers;
	}

	public void setPONumbers (PONumbers PONumbers)
	{
		this.PONumbers = PONumbers;
	}

	public PointOfContact getPointOfContact ()
	{
		return PointOfContact;
	}

	public void setPointOfContact (PointOfContact PointOfContact)
	{
		this.PointOfContact = PointOfContact;
	}

	public String getShipTo ()
	{
		return ShipTo;
	}

	public void setShipTo (String ShipTo)
	{
		this.ShipTo = ShipTo;
	}

	public String getId ()
	{
		return Id;
	}

	public void setId (String Id)
	{
		this.Id = Id;
	}

	public String getName ()
	{
		return Name;
	}

	public void setName (String Name)
	{
		this.Name = Name;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [PONumbers = "+PONumbers+", PointOfContact = "+PointOfContact+", ShipTo = "+ShipTo+", Id = "+Id+", Name = "+Name+"]";
	}
}
