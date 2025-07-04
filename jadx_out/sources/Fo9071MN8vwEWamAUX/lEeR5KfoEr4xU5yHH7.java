package Fo9071MN8vwEWamAUX;

import HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Lock f143HJFh0TGMpafqLE9haL = new ReentrantLock();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static lEeR5KfoEr4xU5yHH7 f144zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Lock f145lEeR5KfoEr4xU5yHH7 = new ReentrantLock();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final SharedPreferences f146s3fjYDxWOUexjjVgyA;

    public lEeR5KfoEr4xU5yHH7(Context context) {
        this.f146s3fjYDxWOUexjjVgyA = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7(Context context) {
        hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(context);
        Lock lock = f143HJFh0TGMpafqLE9haL;
        lock.lock();
        try {
            if (f144zZKhbgvUfsK4AEX3r0 == null) {
                f144zZKhbgvUfsK4AEX3r0 = new lEeR5KfoEr4xU5yHH7(context.getApplicationContext());
            }
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = f144zZKhbgvUfsK4AEX3r0;
            lock.unlock();
            return leer5kfoer4xu5yhh7;
        } catch (Throwable th) {
            f143HJFh0TGMpafqLE9haL.unlock();
            throw th;
        }
    }

    public static final String zZKhbgvUfsK4AEX3r0(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public final String HJFh0TGMpafqLE9haL(String str) {
        this.f145lEeR5KfoEr4xU5yHH7.lock();
        try {
            return this.f146s3fjYDxWOUexjjVgyA.getString(str, null);
        } finally {
            this.f145lEeR5KfoEr4xU5yHH7.unlock();
        }
    }

    public GoogleSignInAccount s3fjYDxWOUexjjVgyA() {
        String strHJFh0TGMpafqLE9haL;
        String strHJFh0TGMpafqLE9haL2 = HJFh0TGMpafqLE9haL("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strHJFh0TGMpafqLE9haL2) || (strHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(zZKhbgvUfsK4AEX3r0("googleSignInAccount", strHJFh0TGMpafqLE9haL2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.T9PhQIpGRhE4yZDm1C(strHJFh0TGMpafqLE9haL);
        } catch (JSONException unused) {
            return null;
        }
    }
}
