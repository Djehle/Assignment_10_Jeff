package com.coderscampus.Assignment_10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.coderscampus.Assignment_10.dto.DayResponse;
import com.coderscampus.Assignment_10.dto.WeekResponse;
import com.coderscampus.Assignment_10.spoonacular.SpoonacularIntegration;

@Service
public class SpoonacularFileService {

	@Autowired
	private SpoonacularIntegration spoonacularResponse;
	
	public ResponseEntity<DayResponse> getDay_Meal_Plan(String numCalories, String diet, String exclusions) {
		return spoonacularResponse.callDayResponse(numCalories, diet, exclusions);
	}
	
	public ResponseEntity<WeekResponse> getWeek_Meal_Plan(String numCalories, String diet, String exclusions) {
		return spoonacularResponse.callWeekResponse(numCalories, diet, exclusions);
	}
}