package com.coderscampus.Assignment_10.dto;

import java.util.List;


public class DayResponse {

	private List<Meals> meals;
	private Nutrients nutrients;
	
	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

	public List<Meals> getMeals() {
		return meals;
	}

	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}

	@Override
	public String toString() {
		return "DayReponse [meals=" + meals + ", nutrients=" + nutrients + "]";
		}
//	}
//	@JsonProperty("monday")
//	private Days day1;
//	@JsonProperty("tuesday")
//	private Days day2;
//	@JsonProperty("wednesday")
//	private Days day3;
//	@JsonProperty("thursday")
//	private Days day4;
//	@JsonProperty("friday")
//	private Days day5;
//	@JsonProperty("saturday")
//	private Days day6;
//	@JsonProperty("sunday")
//	private Days day7;
//	
//	public Days getDay1() {
//		return day1;
//	}
//	public void setDay1(Days day1) {
//		this.day1 = day1;
//	}
//	public Days getDay2() {
//		return day2;
//	}
//	public void setDay2(Days day2) {
//		this.day2 = day2;
//	}
//	public Days getDay3() {
//		return day3;
//	}
//	public void setDay3(Days day3) {
//		this.day3 = day3;
//	}
//	public Days getDay4() {
//		return day4;
//	}
//	public void setDay4(Days day4) {
//		this.day4 = day4;
//	}
//	public Days getDay5() {
//		return day5;
//	}
//	public void setDay5(Days day5) {
//		this.day5 = day5;
//	}
//	public Days getDay6() {
//		return day6;
//	}
//	public void setDay6(Days day6) {
//		this.day6 = day6;
//	}
//	public Days getDay7() {
//		return day7;
//	}
//	public void setDay7(Days day7) {
//		this.day7 = day7;
//	}
//	@Override
//	public String toString() {
//		return "DayResponse [day1=" + day1 + ", day2=" + day2 + ", day3=" + day3 + ", day4=" + day4 + ", day5=" + day5
//				+ ", day6=" + day6 + ", day7=" + day7 + "]";
//	}

	
	
	

	
}
