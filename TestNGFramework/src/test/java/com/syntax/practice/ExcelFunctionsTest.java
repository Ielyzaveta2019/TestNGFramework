package com.syntax.practice;

import org.testng.annotations.Test;

import com.syntax.utils.Constans;
import com.syntax.utils.ExcelUtility;

public class ExcelFunctionsTest {
	
	@Test
	public void excelTest() {
		ExcelUtility obj = new ExcelUtility();
		obj.openExcel(Constans.XL_FILEPATH, "EmployeeDetails");
		//String value = obj.getCellData(2,3);
		//System.out.println(value);
		
		//retrieve all values from Excel and store 2D Object array
		
		int row = obj.getRowNum();
		int cell = obj.getColNum(0);
		
		
		Object [][] data = new Object[row][cell];
		//loop through each row & column
		
		for (int i=0; i<row; i++) {
			for (int y=0; y<cell; y++) {
				//retrieve value from Excel
				String value = obj.getCellData(i,y);
				//store inside 2D array
				data[i][y]=value;
				
			}
		}
		System.out.println(data.length);
		
	}
}

