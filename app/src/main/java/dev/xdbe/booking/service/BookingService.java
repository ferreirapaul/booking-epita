package dev.xdbe.booking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

import dev.xdbe.booking.model.booking.BookingEntity;
import dev.xdbe.booking.model.booking.BookingDTO;
import dev.xdbe.booking.model.booking.BookingMapper;
import dev.xdbe.booking.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public BookingDTO createBooking(BookingDTO bookingDTO) {
        BookingEntity booking = BookingMapper.INSTANCE.toEntity(bookingDTO);
        BookingEntity savedBooking = bookingRepository.save(booking);
        return BookingMapper.INSTANCE.toDto(savedBooking);
    }

    public List<BookingDTO> getAllBooking() {
        List<BookingEntity> bookingList = bookingRepository.findAll();
        return bookingList.stream()
                .map(BookingMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }
}