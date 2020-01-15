package com.mbusa.atop.data.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "DeliveryStop")
public class DeliveryStop {

	private String Action;

    private String StopId;

    private Customer Customer;

    private String UnloadTime;

    private String LocationId;

    private String EarliestAppointmentTime;

    private String GeofenceRadius;

    private String LatestAppointmentTime;

    private String City;

    private String TimezoneOffset;

    private String StopSequence;

    private String StreetAddress2;

    private List<Pallet> Pallets;

    private String Name;

    private String StreetAddress;

    private String State;

    private List<String> ReferenceNumbers;

    private String Country;

    private String Postal;

    private String WantTime;

    public String getAction ()
    {
        return Action;
    }

    public void setAction (String Action)
    {
        this.Action = Action;
    }

    public String getStopId ()
    {
        return StopId;
    }

    public void setStopId (String StopId)
    {
        this.StopId = StopId;
    }

    public Customer getCustomer ()
    {
        return Customer;
    }

    public void setCustomer (Customer Customer)
    {
        this.Customer = Customer;
    }

    public String getUnloadTime ()
    {
        return UnloadTime;
    }

    public void setUnloadTime (String UnloadTime)
    {
        this.UnloadTime = UnloadTime;
    }

    public String getLocationId ()
    {
        return LocationId;
    }

    public void setLocationId (String LocationId)
    {
        this.LocationId = LocationId;
    }

    public String getEarliestAppointmentTime ()
    {
        return EarliestAppointmentTime;
    }

    public void setEarliestAppointmentTime (String EarliestAppointmentTime)
    {
        this.EarliestAppointmentTime = EarliestAppointmentTime;
    }

    public String getGeofenceRadius ()
    {
        return GeofenceRadius;
    }

    public void setGeofenceRadius (String GeofenceRadius)
    {
        this.GeofenceRadius = GeofenceRadius;
    }

    public String getLatestAppointmentTime ()
    {
        return LatestAppointmentTime;
    }

    public void setLatestAppointmentTime (String LatestAppointmentTime)
    {
        this.LatestAppointmentTime = LatestAppointmentTime;
    }

    public String getCity ()
    {
        return City;
    }

    public void setCity (String City)
    {
        this.City = City;
    }

    public String getTimezoneOffset ()
    {
        return TimezoneOffset;
    }

    public void setTimezoneOffset (String TimezoneOffset)
    {
        this.TimezoneOffset = TimezoneOffset;
    }

    public String getStopSequence ()
    {
        return StopSequence;
    }

    public void setStopSequence (String StopSequence)
    {
        this.StopSequence = StopSequence;
    }

    public String getStreetAddress2 ()
    {
        return StreetAddress2;
    }

    public void setStreetAddress2 (String StreetAddress2)
    {
        this.StreetAddress2 = StreetAddress2;
    }

    public List<Pallet> getPallets ()
    {
        return Pallets;
    }

    public void setPallets (List<Pallet> Pallets)
    {
        this.Pallets = Pallets;
    }

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getStreetAddress ()
    {
        return StreetAddress;
    }

    public void setStreetAddress (String StreetAddress)
    {
        this.StreetAddress = StreetAddress;
    }

    public String getState ()
    {
        return State;
    }

    public void setState (String State)
    {
        this.State = State;
    }

    public List<String> getReferenceNumbers ()
    {
        return ReferenceNumbers;
    }

    public void setReferenceNumbers (List<String> ReferenceNumbers)
    {
        this.ReferenceNumbers = ReferenceNumbers;
    }

    public String getCountry ()
    {
        return Country;
    }

    public void setCountry (String Country)
    {
        this.Country = Country;
    }

    public String getPostal ()
    {
        return Postal;
    }

    public void setPostal (String Postal)
    {
        this.Postal = Postal;
    }

    public String getWantTime ()
    {
        return WantTime;
    }

    public void setWantTime (String WantTime)
    {
        this.WantTime = WantTime;
    }

    @Override
    public String toString()
    {
        return "DeliveryStop [Action = "+Action+", StopId = "+StopId+", Customer = "+Customer+", UnloadTime = "+UnloadTime+", LocationId = "+LocationId+", EarliestAppointmentTime = "+EarliestAppointmentTime+", GeofenceRadius = "+GeofenceRadius+", LatestAppointmentTime = "+LatestAppointmentTime+", City = "+City+", TimezoneOffset = "+TimezoneOffset+", StopSequence = "+StopSequence+", StreetAddress2 = "+StreetAddress2+", Pallets = "+Pallets+", Name = "+Name+", StreetAddress = "+StreetAddress+", State = "+State+", ReferenceNumbers = "+ReferenceNumbers+", Country = "+Country+", Postal = "+Postal+", WantTime = "+WantTime+"]";
    }
}
