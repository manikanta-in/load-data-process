package com.mbusa.atop.LoadXmlProcesser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.mbusa.atop.data.model.Loads;

public class LoadDataProcesser {

	public static void main(String[] args) {

		LoadDataProcesser ldp =new LoadDataProcesser();
		ldp.getStringFromResources("xml/Advanced XML Layout.xml");
		try {
			String xmlData = ldp.getStringFromResources("xml/Advanced XML Layout.xml");
			System.out.println(xmlData);
			XmlMapper xmlMapper = new XmlMapper();
			Loads loads = xmlMapper.readValue(xmlData, Loads.class);
			System.out.println("loads from data");
			System.out.println(loads);

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
