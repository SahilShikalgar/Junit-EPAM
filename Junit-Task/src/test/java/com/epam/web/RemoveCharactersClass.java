package com.epam.web;

public class RemoveCharactersClass {

	public String remove(String string) {
		int stringLength = string.length();
		return (stringLength < 2) ? string.replaceAll("A", "") : string.substring(0, 2).replaceAll("A", "") + string.substring(2, stringLength);
	}
}
