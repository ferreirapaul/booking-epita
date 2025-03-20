package dev.xdbe.booking;

import java.util.Optional;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import dev.xdbe.booking.repository.BookingRepository;
import dev.xdbe.booking.model.booking.BookingEntity;

@DataJpaTest
@Sql({"/initDatabaseForCreditCardEncryptionTest.sql"})
class CreditCardEncryptionTest {

    @Autowired
    private BookingRepository bookingRepository;

    @Test
	void bookingByJohnDoeShouldExitOnlyOnce() {
        List<BookingEntity> bookings = bookingRepository.findByName("John Doe");
        assertEquals(1,bookings.size());
	}

    @Test
	void bookingByJohnDoeShouldExitWithCreditCardNumber12345() {
        List<BookingEntity> bookings = bookingRepository.findByName("John Doe");
        BookingEntity booking = bookings.get(0);
        assertEquals("1234*********4444", booking.getCreditCardNumber());
	}
}