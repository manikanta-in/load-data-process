package com.mbusa.atop.data.model;

public class Part {
	private String CustomerPartNumber;

	private String ShipperPartNumber;

	private String Quantity;

	private String Weight;

	public String getCustomerPartNumber ()
	{
		return CustomerPartNumber;
	}

	public void setCustomerPartNumber (String CustomerPartNumber)
	{
		this.CustomerPartNumber = CustomerPartNumber;
	}

	public String getShipperPartNumber ()
	{
		return ShipperPartNumber;
	}

	public void setShipperPartNumber (String ShipperPartNumber)
	{
		this.ShipperPartNumber = ShipperPartNumber;
	}

	public String getQuantity ()
	{
		return Quantity;
	}

	public void setQuantity (String Quantity)
	{
		this.Quantity = Quantity;
	}

	public String getWeight ()
	{
		return Weight;
	}

	public void setWeight (String Weight)
	{
		this.Weight = Weight;
	}

	@Override
	public String toString()
	{
		return "Part [CustomerPartNumber = "+CustomerPartNumber+", ShipperPartNumber = "+ShipperPartNumber+", Quantity = "+Quantity+", Weight = "+Weight+"]";
	}
}
