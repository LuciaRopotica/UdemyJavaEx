package com.in28minutes.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class LineNumberReaderExample {
	public static void main(String[] args) {


		File file = new File("./resources/data.txt");
		nrLinii(file);
		try {
			ultLinie(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void nrLinii(File file) {
		try {
			if (file.exists()) {
				FileReader fr = new FileReader(file);
				LineNumberReader lnr = new LineNumberReader(fr);

				int linenumber = 0;

				while (lnr.readLine() != null) {
					linenumber++;
				}

				System.out.println("Total number of lines : " + linenumber);


				lnr.close();

			} else {
				System.out.println("File does not exists!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void ultLinie(File file) throws IOException {

		FileInputStream in = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		String strLine = null, tmp;

		while ((tmp = br.readLine()) != null) {
			strLine = tmp;
		}

		String lastLine = strLine;

		System.out.println("Last line from the file is: " + lastLine);

		in.close();
	}
}
