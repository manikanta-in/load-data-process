package com.mbusa.atop.data.model;

public class PickupStop
{
    private String LatestPlannedPickupTime;

    private String Action;

    private String StopId;

    private String UnloadTime;

    private String LocationId;

    private String GeofenceRadius;

    private String City;

    private String TimezoneOffset;

    private String StopSequence;

    private String StreetAddress2;

    private String Name;

    private String StreetAddress;

    private String State;

    private String EarliestPlannedPickupTime;

    private String Country;

    private String Postal;

    private String WantTime;

    public String getLatestPlannedPickupTime ()
    {
        return LatestPlannedPickupTime;
    }

    public void setLatestPlannedPickupTime (String LatestPlannedPickupTime)
    {
        this.LatestPlannedPickupTime = LatestPlannedPickupTime;
    }

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

    public String getGeofenceRadius ()
    {
        return GeofenceRadius;
    }

    public void setGeofenceRadius (String GeofenceRadius)
    {
        this.GeofenceRadius = GeofenceRadius;
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

    public String getEarliestPlannedPickupTime ()
    {
        return EarliestPlannedPickupTime;
    }

    public void setEarliestPlannedPickupTime (String EarliestPlannedPickupTime)
    {
        this.EarliestPlannedPickupTime = EarliestPlannedPickupTime;
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
        return "PickupStop [LatestPlannedPickupTime = "+LatestPlannedPickupTime+", Action = "+Action+", StopId = "+StopId+", UnloadTime = "+UnloadTime+", LocationId = "+LocationId+", GeofenceRadius = "+GeofenceRadius+", City = "+City+", TimezoneOffset = "+TimezoneOffset+", StopSequence = "+StopSequence+", StreetAddress2 = "+StreetAddress2+", Name = "+Name+", StreetAddress = "+StreetAddress+", State = "+State+", EarliestPlannedPickupTime = "+EarliestPlannedPickupTime+", Country = "+Country+", Postal = "+Postal+", WantTime = "+WantTime+"]";
    }
}
			