package com.mbusa.atop.data.model;

public class Tags {

	private String[] Tag;

    public String[] getTag ()
    {
        return Tag;
    }

    public void setTag (String[] Tag)
    {
        this.Tag = Tag;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Tag = "+Tag+"]";
    }
}
