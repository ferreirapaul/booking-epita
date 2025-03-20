package dev.xdbe.booking.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeanUtils;

import dev.xdbe.booking.model.booking.BookingEntity;
import dev.xdbe.booking.model.booking.BookingDTO;
import dev.xdbe.booking.service.BookingService;

@Controller
public class BookingController {

	@Autowired
    private BookingService bookingService;

	@GetMapping("/")
	public String getform(Model model) {
		return "booking";
	}

	@PostMapping("/")
    public String handleform( BookingDTO bookingNew) {
        // Process the form data
		BookingDTO booking = bookingService.createBooking(bookingNew);
        booking.setCreditCardNumber(CreditCardNumberPadding(booking.getCreditCardNumber()));
        System.out.println("Credit Card Number: " + booking.getCreditCardNumber());
        return "confirmation";
    }

    private String CreditCardNumberPadding(String CreditCardNumber){
        int zerosNeeded = 16 - CreditCardNumber.length();
        if (zerosNeeded <= 0) {
            return CreditCardNumber;
        }
        StringBuilder zeroPaddedNumber = new StringBuilder();
        for (int i = 0; i < zerosNeeded; i++) {
            zeroPaddedNumber.append('0');
        }
        zeroPaddedNumber.append(CreditCardNumber);
        return zeroPaddedNumber.toString();
    }

}