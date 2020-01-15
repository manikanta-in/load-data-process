package com.mbusa.atop.LoadXmlProcesser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.mbusa.atop.data.model.Load;

public class LoadDataProcesser {

	public static void main(String[] args) {

		LoadDataProcesser ldp =new LoadDataProcesser();
		ldp.getStringFromResources("xml/Advanced XML Layout.xml");
		try {
			String xmlData = ldp.getStringFromResources("xml/Advanced XML Layout.xml");
			XmlMapper xmlMapper = new XmlMapper();
			
			TypeReference<List<Load>> typeRefrence =new TypeReference<List<Load>>(){};
			
			List<Load> loads = xmlMapper.readValue(xmlData, typeRefrence);
			System.out.println((Load)loads.get(0));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private String getStringFromResources(String fileName) {

		ClassLoader classLoader = getClass().getClassLoader();
		try (InputStream inputStream = classLoader.getResourceAsStream(fileName)) {

			String result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
			return result;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}
}
