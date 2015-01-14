package com.ibm.belarus;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	//public String srcContents;
	//public static String cvtContents, cvtRes;
	//public static String pcmContents, pcmRes;
	//public String cmlContents;
	//static String[] bundleNumArray = new String[2048]; // ????
	public static ArrayList<String> mtmNumArrayList = new ArrayList<>();
	public static ArrayList<String> ptnNumArrayList = new ArrayList<>();
	
	public String resContents;

	public static void main(String[] args) {

		Pattern p = Pattern.compile(Constants.regx);
		Matcher m = p.matcher(Constants.sourceString);
		int i = 0;
		while (m.find()) {

			if (i % 2 == 0) {
				mtmNumArrayList.add(m.group());
			/*	if (cvtRes == null)
					cvtRes = StringGenerator.cvtGen(m.group());
				else
					cvtRes += StringGenerator.cvtGen(m.group());
				if (pcmRes == null)
					pcmRes = StringGenerator.pcmGenFirstPart(m.group());
				else
					pcmRes += StringGenerator.pcmGenFirstPart(m.group());
			} else {
				if (pcmRes == null)
					pcmRes = StringGenerator.pcmGenSecondPart(m.group());
				else
					pcmRes += StringGenerator.pcmGenSecondPart(m.group());*/
			}
			else ptnNumArrayList.add(m.group());
			;

			//allNumArray[i] = m.group();
			i++;
		}
		System.out.println(ptnNumArrayList);

	}

	
}
