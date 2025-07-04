package com.example.fcmexpr;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {
    public static InputStream lEeR5KfoEr4xU5yHH7(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            String str2 = str.split(File.separator)[r0.length - 1];
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("SHA-1").digest(str2.getBytes(StandardCharsets.UTF_8)), 16), "AES"), new IvParameterSpec(new byte[cipher.getBlockSize()]));
            return new CipherInputStream(new FileInputStream(str), cipher);
        } catch (Exception e) {
            return null;
        }
    }
}
