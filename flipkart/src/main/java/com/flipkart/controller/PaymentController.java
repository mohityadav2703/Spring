package com.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.flipkart.model.PaymentData;
import com.flipkart.service.PaymentService;

@Controller 
public class PaymentController {

	@Autowired
	PaymentService service;
	
	@PostMapping("/payment/make")
	public ResponseEntity<String> makePayment(){
		
		String response=service.makePayment();
		if(response.equals("success")) {
			return new ResponseEntity<String>(response,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>(response,HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/track/payment/{paymentId}")
	public ResponseEntity<PaymentData> getPaymentData(@PathVariable String paymentId){
		System.out.println("Checking Payment Details For Payment Id"+paymentId);
		PaymentData data =service.getPaymentData(paymentId);
		if(data !=null) {
			return new ResponseEntity<PaymentData>(data,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<PaymentData>(data,HttpStatus.NO_CONTENT);
		}
	}
	@DeleteMapping("/delete/payment/{paymentId}")
	public ResponseEntity<String> deletePaymentData(@PathVariable String paymentId){
		System.out.println("Deleting Payment Details For PaymentId"+paymentId);
		String result=service.deletePaymentData(paymentId);
		if(result !=null) {
			return new ResponseEntity<String>(result,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No Payment Id Existed"+paymentId,HttpStatus.NO_CONTENT);
		}
	}
	
}
