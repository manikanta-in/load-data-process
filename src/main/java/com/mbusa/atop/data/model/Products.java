package com.mbusa.atop.data.model;

import java.util.List;

public class Products {
	private List<Product> Product;

	public List<Product> getProduct ()
	{
		return Product;
	}

	public void setProduct (List<Product> Product)
	{
		this.Product = Product;
	}

	@Override
	public String toString()
	{
		return "Products [Product = "+Product+"]";
	}
}
