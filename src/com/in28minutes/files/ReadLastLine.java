package com.in28minutes.files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadLastLine{

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("./resources/data.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		String strLine = null, tmp;

		while ((tmp = br.readLine()) != null)
		{
			strLine = tmp;
		}

		String lastLine = strLine;

		System.out.println(lastLine);

		in.close();
	}
}



