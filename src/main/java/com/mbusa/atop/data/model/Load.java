package com.mbusa.atop.data.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;



@JacksonXmlRootElement(localName = "Load")
public class Load
{



	@JacksonXmlProperty(localName = "DriverPhone")
	private String DriverPhone;

	@JacksonXmlProperty(localName = "RelayLoad")
	private String RelayLoad;

	@JacksonXmlProperty(localName = "HaulParameters")
	private HaulParameters HaulParameters;

	@JacksonXmlProperty(localName = "Action")
	private String action;

	@JacksonXmlProperty(localName = "DisplayLoadNumber")
	private String DisplayLoadNumber;

	@JacksonXmlProperty(localName = "Products")
	private List<Product> Products;

	@JacksonXmlProperty(localName = "RailEquipmentInitials")
	private String RailEquipmentInitials;

	@JacksonXmlProperty(localName = "DeviceID")
	private String DeviceID;

	@JacksonXmlProperty(localName = "HighPriority")
	private String HighPriority;

	@JacksonXmlProperty(localName = "BillOfLading")
	private String billOfLading;

	@JacksonXmlProperty(localName = "DeliveryStops")
	private List<DeliveryStop> DeliveryStops;

	@JacksonXmlProperty(localName = "RailEquipmentNumber")
	private String RailEquipmentNumber;

	@JacksonXmlProperty(localName = "ReferenceNumbers")
	private List<String> ReferenceNumbers;

	@JacksonXmlProperty(localName = "TruckNumber")
	private String TruckNumber;

	@JacksonXmlProperty(localName = "PRONumber")
	private String PRONumber;

	@JacksonXmlProperty(localName = "Carrier")
	private Carrier Carrier;

	@JacksonXmlProperty(localName = "Tags")
	private Tags Tags;

	@JacksonXmlProperty(localName = "PickupStops")
	private List<PickupStop> PickupStops;

	public String getDriverPhone ()
	{
		return DriverPhone;
	}

	public void setDriverPhone (String DriverPhone)
	{
		this.DriverPhone = DriverPhone;
	}

	public String getRelayLoad ()
	{
		return RelayLoad;
	}

	public void setRelayLoad (String RelayLoad)
	{
		this.RelayLoad = RelayLoad;
	}

	public HaulParameters getHaulParameters ()
	{
		return HaulParameters;
	}

	public void setHaulParameters (HaulParameters HaulParameters)
	{
		this.HaulParameters = HaulParameters;
	}

	public String getAction ()
	{
		return action;
	}

	public void setAction (String Action)
	{
		this.action = Action;
	}

	public String getDisplayLoadNumber ()
	{
		return DisplayLoadNumber;
	}

	public void setDisplayLoadNumber (String DisplayLoadNumber)
	{
		this.DisplayLoadNumber = DisplayLoadNumber;
	}

	public List<Product> getProducts ()
	{
		return Products;
	}

	public void setProducts (List<Product> Products)
	{
		this.Products = Products;
	}

	public String getRailEquipmentInitials ()
	{
		return RailEquipmentInitials;
	}

	public void setRailEquipmentInitials (String RailEquipmentInitials)
	{
		this.RailEquipmentInitials = RailEquipmentInitials;
	}

	public String getDeviceID ()
	{
		return DeviceID;
	}

	public void setDeviceID (String DeviceID)
	{
		this.DeviceID = DeviceID;
	}

	public String getHighPriority ()
	{
		return HighPriority;
	}

	public void setHighPriority (String HighPriority)
	{
		this.HighPriority = HighPriority;
	}

	public String getBillOfLading ()
	{
		return billOfLading;
	}

	public void setBillOfLading (String BillOfLading)
	{
		this.billOfLading = BillOfLading;
	}

	public List<DeliveryStop> getDeliveryStops ()
	{
		return DeliveryStops;
	}

	public void setDeliveryStops (List<DeliveryStop> DeliveryStops)
	{
		this.DeliveryStops = DeliveryStops;
	}

	

	public String getRailEquipmentNumber ()
	{
		return RailEquipmentNumber;
	}

	public void setRailEquipmentNumber (String RailEquipmentNumber)
	{
		this.RailEquipmentNumber = RailEquipmentNumber;
	}

	public List<String> getReferenceNumbers ()
	{
		return ReferenceNumbers;
	}

	public void setReferenceNumbers (List<String> ReferenceNumbers)
	{
		this.ReferenceNumbers = ReferenceNumbers;
	}

	public String getTruckNumber ()
	{
		return TruckNumber;
	}

	public void setTruckNumber (String TruckNumber)
	{
		this.TruckNumber = TruckNumber;
	}

	public String getPRONumber ()
	{
		return PRONumber;
	}

	public void setPRONumber (String PRONumber)
	{
		this.PRONumber = PRONumber;
	}

	public Carrier getCarrier ()
	{
		return Carrier;
	}

	public void setCarrier (Carrier Carrier)
	{
		this.Carrier = Carrier;
	}

	public Tags getTags ()
	{
		return Tags;
	}

	public void setTags (Tags Tags)
	{
		this.Tags = Tags;
	}

	public List<PickupStop> getPickupStops ()
	{
		return PickupStops;
	}

	public void setPickupStops (List<PickupStop> PickupStops)
	{
		this.PickupStops = PickupStops;
	}

	public Load() {
		super();
	}

	@Override
	public String toString()
	{
		return "Load [DriverPhone = "+DriverPhone+", RelayLoad = "+RelayLoad+", HaulParameters = "+HaulParameters+", Action = "+action+", DisplayLoadNumber = "+DisplayLoadNumber+", Products = "+Products+", RailEquipmentInitials = "+RailEquipmentInitials+", DeviceID = "+DeviceID+", HighPriority = "+HighPriority+", BillOfLading = "+billOfLading+", DeliveryStops = "+DeliveryStops+", RailEquipmentNumber = "+RailEquipmentNumber+", ReferenceNumbers = "+ReferenceNumbers+", TruckNumber = "+TruckNumber+", PRONumber = "+PRONumber+", Carrier = "+Carrier+", Tags = "+Tags+", PickupStops = "+PickupStops+"]";
	}
}
