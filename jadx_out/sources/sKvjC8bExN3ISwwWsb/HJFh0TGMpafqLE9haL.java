package sKvjC8bExN3ISwwWsb;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm;

/* loaded from: classes.dex */
public class HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public File f6588lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final husNiw3snxdgZPAGJm f6589s3fjYDxWOUexjjVgyA;

    public enum lEeR5KfoEr4xU5yHH7 {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public HJFh0TGMpafqLE9haL(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this.f6589s3fjYDxWOUexjjVgyA = husniw3snxdgzpagjm;
    }

    public final JSONObject HJFh0TGMpafqLE9haL() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(lEeR5KfoEr4xU5yHH7());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public final File lEeR5KfoEr4xU5yHH7() {
        if (this.f6588lEeR5KfoEr4xU5yHH7 == null) {
            synchronized (this) {
                try {
                    if (this.f6588lEeR5KfoEr4xU5yHH7 == null) {
                        this.f6588lEeR5KfoEr4xU5yHH7 = new File(this.f6589s3fjYDxWOUexjjVgyA.Acstmh57AKoSEkEFNJ().getFilesDir(), "PersistedInstallation." + this.f6589s3fjYDxWOUexjjVgyA.hoXrIDAFrSwfShk8da() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f6588lEeR5KfoEr4xU5yHH7;
    }

    public zZKhbgvUfsK4AEX3r0 s3fjYDxWOUexjjVgyA(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) throws JSONException, IOException {
        File fileCreateTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0());
            jSONObject.put("Status", zzkhbgvufsk4aex3r0.TCyPEKSzIyweCN5yp1().ordinal());
            jSONObject.put("AuthToken", zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA());
            jSONObject.put("RefreshToken", zzkhbgvufsk4aex3r0.KYHag8HRDlnO3X9zmZ());
            jSONObject.put("TokenCreationEpochInSecs", zzkhbgvufsk4aex3r0.IPyIQcaNa8aB7drBED());
            jSONObject.put("ExpiresInSecs", zzkhbgvufsk4aex3r0.HJFh0TGMpafqLE9haL());
            jSONObject.put("FisError", zzkhbgvufsk4aex3r0.husNiw3snxdgZPAGJm());
            fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f6589s3fjYDxWOUexjjVgyA.Acstmh57AKoSEkEFNJ().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (fileCreateTempFile.renameTo(lEeR5KfoEr4xU5yHH7())) {
            return zzkhbgvufsk4aex3r0;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public zZKhbgvUfsK4AEX3r0 zZKhbgvUfsK4AEX3r0() throws IOException {
        JSONObject jSONObjectHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL();
        String strOptString = jSONObjectHJFh0TGMpafqLE9haL.optString("Fid", null);
        int iOptInt = jSONObjectHJFh0TGMpafqLE9haL.optInt("Status", lEeR5KfoEr4xU5yHH7.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectHJFh0TGMpafqLE9haL.optString("AuthToken", null);
        String strOptString3 = jSONObjectHJFh0TGMpafqLE9haL.optString("RefreshToken", null);
        long jOptLong = jSONObjectHJFh0TGMpafqLE9haL.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectHJFh0TGMpafqLE9haL.optLong("ExpiresInSecs", 0L);
        return zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7().zZKhbgvUfsK4AEX3r0(strOptString).TCyPEKSzIyweCN5yp1(lEeR5KfoEr4xU5yHH7.values()[iOptInt]).s3fjYDxWOUexjjVgyA(strOptString2).KYHag8HRDlnO3X9zmZ(strOptString3).IPyIQcaNa8aB7drBED(jOptLong).HJFh0TGMpafqLE9haL(jOptLong2).husNiw3snxdgZPAGJm(jSONObjectHJFh0TGMpafqLE9haL.optString("FisError", null)).lEeR5KfoEr4xU5yHH7();
    }
}
