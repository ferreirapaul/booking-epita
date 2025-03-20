package dev.xdbe.booking.model.booking;

import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.springframework.beans.factory.annotation.Autowired;

import dev.xdbe.booking.helper.CryptoHelper;

@Converter
public class CreditCardConverter implements AttributeConverter<String, String> {

    @Override
    public String convertToDatabaseColumn(String attribute) {
        return attribute;
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        // Step 5: Mask credit card number
        StringBuilder masked = new StringBuilder(dbData);

        for (int i = 4; i < dbData.length() - 4; i++) {
            masked.setCharAt(i, '*');
        }

        return masked.toString();
   }

    
}
