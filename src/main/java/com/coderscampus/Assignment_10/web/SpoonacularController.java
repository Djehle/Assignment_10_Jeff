package com.coderscampus.Assignment_10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coderscampus.Assignment_10.dto.DayResponse;
import com.coderscampus.Assignment_10.dto.WeekResponse;
import com.coderscampus.Assignment_10.service.SpoonacularFileService;

@RestController
public class SpoonacularController {
		
	@Autowired
	private SpoonacularFileService response;

	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
		return  response.getWeek_Meal_Plan(numCalories, diet, exclusions);
	}
	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
		return response.getDay_Meal_Plan(numCalories,diet,  exclusions);
	}

	
}
