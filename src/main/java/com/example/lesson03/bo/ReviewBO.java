package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewDAO;
import com.example.lesson03.model.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewDAO reviewDAO;
	
	//int null 허용X
	//Integer null 허용O
	public Review getReviewBO(int id) {
		return reviewDAO.selecReview(id);
	}
	
	public int addReview(Review review) {
		return reviewDAO.insertReview(review);
	}
	
	public int addReviewField(String storeName, String menu, String userName,
			double point, String review) {
		return reviewDAO.insertReviewField(storeName, menu, userName, point, review);
		
	}
	public int updateReviewById(int id, String review) {
		return reviewDAO.updateReviewById(id, review);
	}
}
