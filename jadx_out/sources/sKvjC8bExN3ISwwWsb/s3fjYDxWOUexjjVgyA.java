package sKvjC8bExN3ISwwWsb;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final String[] f6610HJFh0TGMpafqLE9haL = {"*", "FCM", "GCM", ""};

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final SharedPreferences f6611lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f6612s3fjYDxWOUexjjVgyA;

    public s3fjYDxWOUexjjVgyA(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this.f6611lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm.Acstmh57AKoSEkEFNJ().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f6612s3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(husniw3snxdgzpagjm);
    }

    public static String HJFh0TGMpafqLE9haL(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public static String s3fjYDxWOUexjjVgyA(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        String strZZKhbgvUfsK4AEX3r0 = husniw3snxdgzpagjm.T9PhQIpGRhE4yZDm1C().zZKhbgvUfsK4AEX3r0();
        if (strZZKhbgvUfsK4AEX3r0 != null) {
            return strZZKhbgvUfsK4AEX3r0;
        }
        String strHJFh0TGMpafqLE9haL = husniw3snxdgzpagjm.T9PhQIpGRhE4yZDm1C().HJFh0TGMpafqLE9haL();
        if (!strHJFh0TGMpafqLE9haL.startsWith("1:") && !strHJFh0TGMpafqLE9haL.startsWith("2:")) {
            return strHJFh0TGMpafqLE9haL;
        }
        String[] strArrSplit = strHJFh0TGMpafqLE9haL.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public final String IPyIQcaNa8aB7drBED() {
        synchronized (this.f6611lEeR5KfoEr4xU5yHH7) {
            try {
                String string = this.f6611lEeR5KfoEr4xU5yHH7.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(string);
                if (publicKeyHusNiw3snxdgZPAGJm == null) {
                    return null;
                }
                return HJFh0TGMpafqLE9haL(publicKeyHusNiw3snxdgZPAGJm);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String KYHag8HRDlnO3X9zmZ() {
        synchronized (this.f6611lEeR5KfoEr4xU5yHH7) {
            try {
                String strTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1();
                if (strTCyPEKSzIyweCN5yp1 != null) {
                    return strTCyPEKSzIyweCN5yp1;
                }
                return IPyIQcaNa8aB7drBED();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String TCyPEKSzIyweCN5yp1() {
        String string;
        synchronized (this.f6611lEeR5KfoEr4xU5yHH7) {
            string = this.f6611lEeR5KfoEr4xU5yHH7.getString("|S|id", null);
        }
        return string;
    }

    public final PublicKey husNiw3snxdgZPAGJm(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    public final String lEeR5KfoEr4xU5yHH7(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public String pbVGzGjWvY2LDXC8vo() {
        synchronized (this.f6611lEeR5KfoEr4xU5yHH7) {
            try {
                for (String str : f6610HJFh0TGMpafqLE9haL) {
                    String string = this.f6611lEeR5KfoEr4xU5yHH7.getString(lEeR5KfoEr4xU5yHH7(this.f6612s3fjYDxWOUexjjVgyA, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = zZKhbgvUfsK4AEX3r0(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zZKhbgvUfsK4AEX3r0(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }
}
