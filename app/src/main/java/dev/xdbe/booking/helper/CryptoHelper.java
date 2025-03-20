package dev.xdbe.booking.helper;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Base64;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;

@Component
public class CryptoHelper {

    private static final String CIPHER_INSTANCE = "AES/GCM/NoPadding";
    private static final String SECRET = "secret-key-12345";
    private static final int CRYPTO_IV_LENGTH = 16;
    private static final int CRYPTO_AUTH_TAG_LENGTH = 128;

    public static String encryptData(String plainData) {
        // Step 6: Encrypt credit card number
        // insert your code here 
        return plainData;
    }

    public static String decryptData(String encryptedDataInBase64) {
        // Step 6: Encrypt credit card number
        // insert your code here 
        return encryptedDataInBase64;
    }
}