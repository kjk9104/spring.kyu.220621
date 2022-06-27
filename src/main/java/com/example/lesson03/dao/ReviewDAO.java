package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	public Review selecReview(@Param("id") int id);
	
	public int insertReview(Review review);
	
	public int insertReviewField(
			@Param("storeName")String storeName,
			@Param("menu")String menu,
			@Param("userName")String userName,
			@Param("point")double point,
			@Param("review")String review);
	
	public int updateReviewById(
			@Param("id")int id,
			@Param("review")String review);
			
}
