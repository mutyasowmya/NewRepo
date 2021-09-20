module origin {
	exports org.cap.dao;
	exports org.cap.exception;
	exports org.cap.test.bankapp;
	exports org.cap.dto;
	exports org.cap.service;
	exports org.cap.util;

	requires junit;
	requires mockito.all;
}