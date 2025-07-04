package SF66oTSCsXABfwyWiU;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class osrHU7fvDp2EgxZPfM {

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static WeakReference f1507zZKhbgvUfsK4AEX3r0;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Executor f1508HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final SharedPreferences f1509lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public bMSdooljgH14Jgudph f1510s3fjYDxWOUexjjVgyA;

    public osrHU7fvDp2EgxZPfM(SharedPreferences sharedPreferences, Executor executor) {
        this.f1508HJFh0TGMpafqLE9haL = executor;
        this.f1509lEeR5KfoEr4xU5yHH7 = sharedPreferences;
    }

    public static synchronized osrHU7fvDp2EgxZPfM s3fjYDxWOUexjjVgyA(Context context, Executor executor) {
        osrHU7fvDp2EgxZPfM osrhu7fvdp2egxzpfm;
        try {
            WeakReference weakReference = f1507zZKhbgvUfsK4AEX3r0;
            osrhu7fvdp2egxzpfm = weakReference != null ? (osrHU7fvDp2EgxZPfM) weakReference.get() : null;
            if (osrhu7fvdp2egxzpfm == null) {
                osrhu7fvdp2egxzpfm = new osrHU7fvDp2EgxZPfM(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                osrhu7fvdp2egxzpfm.zZKhbgvUfsK4AEX3r0();
                f1507zZKhbgvUfsK4AEX3r0 = new WeakReference(osrhu7fvdp2egxzpfm);
            }
        } catch (Throwable th) {
            throw th;
        }
        return osrhu7fvdp2egxzpfm;
    }

    public synchronized CSih7GetOUab1dYQjM HJFh0TGMpafqLE9haL() {
        return CSih7GetOUab1dYQjM.lEeR5KfoEr4xU5yHH7(this.f1510s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ());
    }

    public synchronized boolean husNiw3snxdgZPAGJm(CSih7GetOUab1dYQjM cSih7GetOUab1dYQjM) {
        return this.f1510s3fjYDxWOUexjjVgyA.TCyPEKSzIyweCN5yp1(cSih7GetOUab1dYQjM.husNiw3snxdgZPAGJm());
    }

    public synchronized boolean lEeR5KfoEr4xU5yHH7(CSih7GetOUab1dYQjM cSih7GetOUab1dYQjM) {
        return this.f1510s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(cSih7GetOUab1dYQjM.husNiw3snxdgZPAGJm());
    }

    public final synchronized void zZKhbgvUfsK4AEX3r0() {
        this.f1510s3fjYDxWOUexjjVgyA = bMSdooljgH14Jgudph.zZKhbgvUfsK4AEX3r0(this.f1509lEeR5KfoEr4xU5yHH7, "topic_operation_queue", ",", this.f1508HJFh0TGMpafqLE9haL);
    }
}
