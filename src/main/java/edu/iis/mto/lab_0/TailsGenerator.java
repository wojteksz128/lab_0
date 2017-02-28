package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

	public List<String> tails(String value) {
		List<String> tails = new ArrayList<>(value.length());

		for (int i = 1; i <= value.length(); i++) {
			tails.add(value.substring(i-1));
		}
		tails.add("");
		return tails;
	}

}
