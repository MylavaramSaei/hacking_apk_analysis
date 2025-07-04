package fDXXEWvhMVO3O8mnuS;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {
    public static byte[] lEeR5KfoEr4xU5yHH7(Context context, String str) {
        MessageDigest messageDigestS3fjYDxWOUexjjVgyA;
        PackageInfo packageInfoZZKhbgvUfsK4AEX3r0 = i8aHOwH04efS6lZ3Oa.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(context).zZKhbgvUfsK4AEX3r0(str, 64);
        Signature[] signatureArr = packageInfoZZKhbgvUfsK4AEX3r0.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA("SHA1")) == null) {
            return null;
        }
        return messageDigestS3fjYDxWOUexjjVgyA.digest(packageInfoZZKhbgvUfsK4AEX3r0.signatures[0].toByteArray());
    }

    public static MessageDigest s3fjYDxWOUexjjVgyA(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
