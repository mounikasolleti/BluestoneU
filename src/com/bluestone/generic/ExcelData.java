package com.bluestone.generic;

import java.io.File;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	
	public static String getDatas(String path,String sheet, int rn, int cn)
	{
		String data=null;
		try
		{
			File file=new File(path);
			data=WorkbookFactory.create(file).getSheet(sheet).getRow(rn).getCell(cn).toString();
			
		}
		
		catch(Exception e)
		{
		 e.getMessage();
		}
		return data;
	}
}
