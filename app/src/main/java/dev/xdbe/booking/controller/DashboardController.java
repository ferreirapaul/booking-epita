package dev.xdbe.booking.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import dev.xdbe.booking.service.BookingService;
import dev.xdbe.booking.model.booking.BookingDTO;

@Controller
public class DashboardController {

	@Autowired
    private BookingService bookingService;

	@GetMapping("/dashboard")
	public String getform(Model model) {
        List<BookingDTO> BookingList = bookingService.getAllBooking();
        model.addAttribute("BookingList", BookingList);
		return "dashboard";
	}
}