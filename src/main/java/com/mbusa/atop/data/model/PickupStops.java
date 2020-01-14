package com.mbusa.atop.data.model;

import java.util.List;

public class PickupStops
{
    private List<PickupStop> PickupStop;

    public List<PickupStop> getPickupStop ()
    {
        return PickupStop;
    }

    public void setPickupStop (List<PickupStop> PickupStop)
    {
        this.PickupStop = PickupStop;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [PickupStop = "+PickupStop+"]";
    }
}
			
			