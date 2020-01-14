package com.mbusa.atop.data.model;

public class Product {
	private String TimeToleranceInMinutes;

    private String UpperTemperatureThreshold;

    private String ProductType;

    private String ProductId;

    private String LowerTemperatureThreshold;

    private String SetTemperature;

    public String getTimeToleranceInMinutes ()
    {
        return TimeToleranceInMinutes;
    }

    public void setTimeToleranceInMinutes (String TimeToleranceInMinutes)
    {
        this.TimeToleranceInMinutes = TimeToleranceInMinutes;
    }

    public String getUpperTemperatureThreshold ()
    {
        return UpperTemperatureThreshold;
    }

    public void setUpperTemperatureThreshold (String UpperTemperatureThreshold)
    {
        this.UpperTemperatureThreshold = UpperTemperatureThreshold;
    }

    public String getProductType ()
    {
        return ProductType;
    }

    public void setProductType (String ProductType)
    {
        this.ProductType = ProductType;
    }

    public String getProductId ()
    {
        return ProductId;
    }

    public void setProductId (String ProductId)
    {
        this.ProductId = ProductId;
    }

    public String getLowerTemperatureThreshold ()
    {
        return LowerTemperatureThreshold;
    }

    public void setLowerTemperatureThreshold (String LowerTemperatureThreshold)
    {
        this.LowerTemperatureThreshold = LowerTemperatureThreshold;
    }

    public String getSetTemperature ()
    {
        return SetTemperature;
    }

    public void setSetTemperature (String SetTemperature)
    {
        this.SetTemperature = SetTemperature;
    }

    @Override
    public String toString()
    {
        return "Product [TimeToleranceInMinutes = "+TimeToleranceInMinutes+", UpperTemperatureThreshold = "+UpperTemperatureThreshold+", ProductType = "+ProductType+", ProductId = "+ProductId+", LowerTemperatureThreshold = "+LowerTemperatureThreshold+", SetTemperature = "+SetTemperature+"]";
    }
}
