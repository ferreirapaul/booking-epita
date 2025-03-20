package dev.xdbe.booking.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.xdbe.booking.model.booking.BookingEntity;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long> {
    public List<BookingEntity> findByName(String name);
}