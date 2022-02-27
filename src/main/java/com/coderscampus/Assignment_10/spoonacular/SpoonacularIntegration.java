package com.coderscampus.Assignment_10.spoonacular;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment_10.dto.DayResponse;
import com.coderscampus.Assignment_10.dto.WeekResponse;

@RestController
public class SpoonacularIntegration {
	@Value("${spoonacular.urls.base}")
	private String baseURL;
	
	@Value("${spoonacular.urls.mealplan}")
	private String mealURL;
	
	@Value("${spoonacular.api.key}")
	private String apikey;
	
	
	
	UriComponentsBuilder builder;
	URI url;
	RestTemplate rt= new RestTemplate();
	
	public ResponseEntity<DayResponse> callDayResponse(String numCalories, String diet, String exclusions) {
		builder = UriComponentsBuilder
				.fromHttpUrl(baseURL+ mealURL)
				.queryParam("timeFrame", "day")
				.queryParam("apiKey", apikey);

		getUrlBuilded(numCalories, diet, exclusions);
		ResponseEntity<DayResponse> response = rt.getForEntity(url, DayResponse.class);
		return response;		
	}
	
	public ResponseEntity<WeekResponse> callWeekResponse(String numCalories, String diet, String exclusions) {

		builder = UriComponentsBuilder
				.fromHttpUrl(baseURL+ mealURL)
				.queryParam("timeFrame", "week")
				.queryParam("apiKey", apikey);

		getUrlBuilded(numCalories, diet, exclusions);
		ResponseEntity<WeekResponse> response = rt.getForEntity(url, WeekResponse.class);

		return response;
	}

	private void getUrlBuilded(String numCalories, String diet, String exclusions) {
		if (StringUtils.hasLength(numCalories)) {
			builder.queryParam("targetCalories", Integer.parseInt(numCalories));
		}
		if (StringUtils.hasText(diet)) {
			builder.queryParam("diet", diet);
		}
		if (StringUtils.hasText(exclusions)) {
			builder.queryParam("exclusions", exclusions);
		}

		url = builder.build().toUri();
	}
}
