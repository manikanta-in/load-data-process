package com.mbusa.atop.data.model;

public class PointOfContact {
	private String Email;

	private String Phone;

	private String Name;

	public String getEmail ()
	{
		return Email;
	}

	public void setEmail (String Email)
	{
		this.Email = Email;
	}

	public String getPhone ()
	{
		return Phone;
	}

	public void setPhone (String Phone)
	{
		this.Phone = Phone;
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
		return "PointOfContact [Email = "+Email+", Phone = "+Phone+", Name = "+Name+"]";
	}
}
