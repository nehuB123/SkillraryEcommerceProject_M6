package generic_Library;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Property_File 
{
	public String getProprtydata(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis= new FileInputStream(IPathConstant.propertyFilePath);
		p.load(fis);
		return p.getProperty(key);
	}

}
