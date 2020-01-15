package com.mbusa.atop.data.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Tags")
public class Tags {

	@JacksonXmlProperty(localName = "Tag")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private List<String> Tag;

    public List<String> getTag ()
    {
        return Tag;
    }

    public void setTag (List<String> Tag)
    {
        this.Tag = Tag;
    }

    @Override
    public String toString()
    {
        return "Tags [Tag = "+Tag+"]";
    }
}
