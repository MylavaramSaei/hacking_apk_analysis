package SF66oTSCsXABfwyWiU;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class Pum9NZyDBKoCnecvlx {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static e5tXAuLbtMC3XyEoX9.lEeR5KfoEr4xU5yHH7 f1393HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final long f1394lEeR5KfoEr4xU5yHH7 = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final Object f1395s3fjYDxWOUexjjVgyA = new Object();

    public static void HJFh0TGMpafqLE9haL(Intent intent) {
        synchronized (f1395s3fjYDxWOUexjjVgyA) {
            try {
                if (f1393HJFh0TGMpafqLE9haL != null && zZKhbgvUfsK4AEX3r0(intent)) {
                    TCyPEKSzIyweCN5yp1(intent, false);
                    f1393HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName IPyIQcaNa8aB7drBED(Context context, Intent intent) {
        synchronized (f1395s3fjYDxWOUexjjVgyA) {
            try {
                s3fjYDxWOUexjjVgyA(context);
                boolean zZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(intent);
                TCyPEKSzIyweCN5yp1(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zZZKhbgvUfsK4AEX3r0) {
                    f1393HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(f1394lEeR5KfoEr4xU5yHH7);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void KYHag8HRDlnO3X9zmZ(Context context, evSiTWao80SbJUZk9E evsitwao80sbjuzk9e, final Intent intent) {
        synchronized (f1395s3fjYDxWOUexjjVgyA) {
            try {
                s3fjYDxWOUexjjVgyA(context);
                boolean zZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(intent);
                TCyPEKSzIyweCN5yp1(intent, true);
                if (!zZZKhbgvUfsK4AEX3r0) {
                    f1393HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(f1394lEeR5KfoEr4xU5yHH7);
                }
                evsitwao80sbjuzk9e.zZKhbgvUfsK4AEX3r0(intent).s3fjYDxWOUexjjVgyA(new JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0() { // from class: SF66oTSCsXABfwyWiU.Kh0uC90qEEhuLdpgB9
                    @Override // JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0
                    public final void lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
                        Pum9NZyDBKoCnecvlx.HJFh0TGMpafqLE9haL(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void TCyPEKSzIyweCN5yp1(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static void s3fjYDxWOUexjjVgyA(Context context) {
        if (f1393HJFh0TGMpafqLE9haL == null) {
            e5tXAuLbtMC3XyEoX9.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new e5tXAuLbtMC3XyEoX9.lEeR5KfoEr4xU5yHH7(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f1393HJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh7;
            leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0(true);
        }
    }

    public static boolean zZKhbgvUfsK4AEX3r0(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }
}
