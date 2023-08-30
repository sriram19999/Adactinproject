package com.Adactin.Helper;

import java.io.IOException;

import com.Adactin.properties.Configuration_Reader;

public class File_Readermanager {
	
	private File_Readermanager() {
		
	}

	 public static File_Readermanager getnInstance() {
		
		File_Readermanager help = new File_Readermanager();
		return help;

	}
	
	
	 public Configuration_Reader getInstanceCR() throws IOException {
		
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}

}
