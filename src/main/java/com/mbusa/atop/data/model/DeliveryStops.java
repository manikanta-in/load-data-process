package com.mbusa.atop.data.model;

import java.util.List;

public class DeliveryStops {
	private List<DeliveryStop> DeliveryStop;

    public List<DeliveryStop> getPickupStop ()
    {
        return DeliveryStop;
    }

    public void setPickupStop (List<DeliveryStop> DeliveryStop)
    {
        this.DeliveryStop = DeliveryStop;
    }

    @Override
    public String toString()
    {
        return "DeliveryStops [DeliveryStop = "+DeliveryStop+"]";
    }
}
