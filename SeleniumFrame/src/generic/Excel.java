package generic;

import java.io.File;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Auto_consta
{

/*public void readData() throws EncryptedDocumentException,
InvalidFormatException, IOException
{

// to create a file
           File file=new File("/home/tyss/Desktop/input.xlsx");
           Workbook wb=WorkbookFactory.create(file);

        // to get sheet
           Sheet sh = wb.getSheet("Sheet1");


          Row r=sh.getRow(0);

          Cell c=r.getCell(0);
          emailID
          String data=c.getStringCellValue();

          System.out.println(data);
}*/
public static String getDatas(String path,String sheet,int rn, int cn)
{
	String data="";
try{
File file=new File(path);

data=WorkbookFactory.create(file).getSheet(sheet).getRow(rn).getCell(cn).toString();
}
catch(Exception e)
{

}
return data;
			
}
}
