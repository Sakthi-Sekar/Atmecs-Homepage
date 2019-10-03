package com.atmecs.homepage.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.atmecs.homepage.constants.ConstantPaths;

public class ReadPropertiesFile {
	FileInputStream data;
	FileInputStream config;
	FileInputStream locators;
	

	public String readPropertiesFile(String elements) {
		Properties prop = new Properties();
		try {
			data = new FileInputStream(ConstantPaths.DATA_FILE);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
			config = new FileInputStream(ConstantPaths.CONFIG_FILE);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			locators = new FileInputStream(ConstantPaths.LOCATORS_FILE);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			prop.load(data);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			prop.load(config);

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			prop.load(locators);

		} catch (Exception e) {
			e.printStackTrace();
		}
		String data = prop.getProperty(elements);
		return data;

	}
}
