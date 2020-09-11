package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	String AniName;
	int Aniage;
	String AniSex;
	

	
	public Animal(String aniName, int aniage, String aniSex) {
		super();
		AniName = aniName;
		Aniage = aniage;
		AniSex = aniSex;
	}

	public String getAniName() {
		return AniName;
	}

	public void setAniName(String aniName) {
		AniName = aniName;
	}

	public int getAniage() {
		return Aniage;
	}

	public void setAniage(int aniage) {
		Aniage = aniage;
	}

	public String getAniSex() {
		return AniSex;
	}

	public void setAniSex(String aniSex) {
		AniSex = aniSex;
	}
	
	public List<Animal> getAnimalList() {
		List<Animal> list = new ArrayList<>();
		list.add(new Animal("야옹이", 2, "수컷"));
		list.add(new Animal("똘똘이", 7, "수컷"));
		list.add(new Animal("귀염이", 5, "수컷"));
		return list;
	}

	@Override
	public String toString() {
		return "Animal [AniName=" + AniName + ", Aniage=" + Aniage + ", AniSex=" + AniSex + "]";
	}
}
