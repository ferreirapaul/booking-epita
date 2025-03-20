package dev.xdbe.booking.model.booking;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import dev.xdbe.booking.model.booking.BookingEntity;
import dev.xdbe.booking.model.booking.BookingDTO;

@Mapper
public interface BookingMapper {

    BookingMapper INSTANCE = Mappers.getMapper(BookingMapper.class);

    //@Mapping(target = "id", ignore = true)
    BookingDTO toDto(BookingEntity booking);

    //@Mapping(target = "id", ignore = true)
    BookingEntity toEntity(BookingDTO bookingDTO);

}
