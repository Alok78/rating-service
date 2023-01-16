package com.pratice.hotelserevice.service;

import java.util.List;

import com.pratice.hotelserevice.entity.Rating;

public interface RatingService
{
	Rating createRating(Rating rating);
	List<Rating> getAllRating();
	
	List<Rating> getRatingByUserId(String userId );
	List<Rating> getRatingByHotelId(String hotelId );
}
