package com.syntax.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.pages.HomePage;
import com.syntax.pages.LocationPage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LocationPageTest extends BaseClass{

	@Test (dataProvider = "locationData")
	public void addLocation(String nameData, String countryData, String cityData, String zipData) {
		//login
		LoginPage login = new LoginPage();	

		CommonMethods.sendText(login.userName, ConfigsReader.getProperty("username"));
		CommonMethods.sendText(login.password, ConfigsReader.getProperty("password"));
		CommonMethods.click(login.loginBtn);

		HomePage home = new HomePage();
		//Admin tab
		CommonMethods.click(home.Admin);
		//Organization
		CommonMethods.click(home.Organization);
		//Location
		CommonMethods.click(home.Locations);
		//click add button
		
		LocationPage locations = new LocationPage();	
		CommonMethods.click(locations.add);
		
		//fillout the addlocation form
		CommonMethods.sendText(locations.name, nameData);
		
		CommonMethods.click(locations.country);
		
		CommonMethods.waitForElementBeClickable(locations.selectCountry, 10);
		CommonMethods.selectList(locations.selectCountry, countryData);
		//CommonMethods.sendText(locations.country, countryData);
		CommonMethods.sendText(locations.city , cityData);
		CommonMethods.sendText(locations.zipCode, zipData);
		
		CommonMethods.click(locations.saveBtn);
		CommonMethods.takeScreenshot("06132019", nameData+"_location_data");
	}
	
	@DataProvider (name="locationData")
	public Object[][] locationData(){
		Object[][] data = new Object[3][4];
			data[0][0] = "Liza";
			data[0][1] = "Ukraine";
			data[0][2] = "Kiev";
			data[0][3] = "20005";
			
			data[1][0] = "Kasu";
			data[1][1] = "Ethiopia";
			data[1][2] = "Addis";
			data[1][3] = "4561";
			
			data[2][0] = "Ryan";
			data[2][1] = "Korea";
			data[2][2] = "Seoul";
			data[2][3] = "15478";
		
		return data;
	}
}
