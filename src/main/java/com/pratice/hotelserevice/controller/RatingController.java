package com.pratice.hotelserevice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.hotelserevice.entity.Rating;
import com.pratice.hotelserevice.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController
{
	@Autowired
	private RatingService ratingService;
	
	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating)
	{
		Rating createRating = ratingService.createRating(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(createRating);
	}
	@GetMapping
	public ResponseEntity<List<Rating>> getAllRating()
	{
		List<Rating> allRating = ratingService.getAllRating();
		return ResponseEntity.ok(allRating);
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId)
	{
		List<Rating> ratingByUserId = ratingService.getRatingByUserId(userId);
		return ResponseEntity.ok(ratingByUserId);
	}
	
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId)
	{
		List<Rating> ratingByHotelId = ratingService.getRatingByHotelId(hotelId);
		return ResponseEntity.ok(ratingByHotelId);
	}
}
