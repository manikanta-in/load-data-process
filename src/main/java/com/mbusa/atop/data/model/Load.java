package com.mbusa.atop.data.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonPropertyOrder(value = "Load")
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Load
{



	@JacksonXmlProperty(localName = "DriverPhone")
	private String DriverPhone;

	@JacksonXmlProperty(localName = "RelayLoad")
	private String RelayLoad;

	private HaulParameters HaulParameters;

	@JacksonXmlProperty(localName = "Action")
	private String action;

	private String DisplayLoadNumber;

	private Products Products;

	private String RailEquipmentInitials;

	private String DeviceID;

	private String HighPriority;

	@JacksonXmlProperty(localName = "BillOfLading")
	private String billOfLading;

	private DeliveryStops DeliveryStops;

	private String RailEquipmentNumber;

	private ReferenceNumbers ReferenceNumbers;

	private String TruckNumber;

	private String PRONumber;

	private Carrier Carrier;

	private Tags Tags;

	private PickupStops PickupStops;

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

	public Products getProducts ()
	{
		return Products;
	}

	public void setProducts (Products Products)
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

	public DeliveryStops getDeliveryStops ()
	{
		return DeliveryStops;
	}

	public void setDeliveryStops (DeliveryStops DeliveryStops)
	{
		this.DeliveryStops = DeliveryStops;
	}

	public Load(String billOfLading) {
		super();	
		this.billOfLading = billOfLading;
	}

	public String getRailEquipmentNumber ()
	{
		return RailEquipmentNumber;
	}

	public void setRailEquipmentNumber (String RailEquipmentNumber)
	{
		this.RailEquipmentNumber = RailEquipmentNumber;
	}

	public ReferenceNumbers getReferenceNumbers ()
	{
		return ReferenceNumbers;
	}

	public void setReferenceNumbers (ReferenceNumbers ReferenceNumbers)
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

	public PickupStops getPickupStops ()
	{
		return PickupStops;
	}

	public void setPickupStops (PickupStops PickupStops)
	{
		this.PickupStops = PickupStops;
	}

	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return "ClassPojo [DriverPhone = "+DriverPhone+", RelayLoad = "+RelayLoad+", HaulParameters = "+HaulParameters+", Action = "+action+", DisplayLoadNumber = "+DisplayLoadNumber+", Products = "+Products+", RailEquipmentInitials = "+RailEquipmentInitials+", DeviceID = "+DeviceID+", HighPriority = "+HighPriority+", BillOfLading = "+billOfLading+", DeliveryStops = "+DeliveryStops+", RailEquipmentNumber = "+RailEquipmentNumber+", ReferenceNumbers = "+ReferenceNumbers+", TruckNumber = "+TruckNumber+", PRONumber = "+PRONumber+", Carrier = "+Carrier+", Tags = "+Tags+", PickupStops = "+PickupStops+"]";
	}
}
