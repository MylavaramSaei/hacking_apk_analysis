package HR5vAalpgOKVm2T0Gq;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class IPyIQcaNa8aB7drBED {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static HandlerThread f319HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static boolean f320husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final Object f321lEeR5KfoEr4xU5yHH7 = new Object();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static Pum9NZyDBKoCnecvlx f322s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static Executor f323zZKhbgvUfsK4AEX3r0;

    public static IPyIQcaNa8aB7drBED lEeR5KfoEr4xU5yHH7(Context context) {
        synchronized (f321lEeR5KfoEr4xU5yHH7) {
            try {
                if (f322s3fjYDxWOUexjjVgyA == null) {
                    f322s3fjYDxWOUexjjVgyA = new Pum9NZyDBKoCnecvlx(context.getApplicationContext(), f320husNiw3snxdgZPAGJm ? s3fjYDxWOUexjjVgyA().getLooper() : context.getMainLooper(), f323zZKhbgvUfsK4AEX3r0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f322s3fjYDxWOUexjjVgyA;
    }

    public static HandlerThread s3fjYDxWOUexjjVgyA() {
        synchronized (f321lEeR5KfoEr4xU5yHH7) {
            try {
                HandlerThread handlerThread = f319HJFh0TGMpafqLE9haL;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f319HJFh0TGMpafqLE9haL = handlerThread2;
                handlerThread2.start();
                return f319HJFh0TGMpafqLE9haL;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void HJFh0TGMpafqLE9haL(osrHU7fvDp2EgxZPfM osrhu7fvdp2egxzpfm, ServiceConnection serviceConnection, String str);

    public abstract boolean husNiw3snxdgZPAGJm(osrHU7fvDp2EgxZPfM osrhu7fvdp2egxzpfm, ServiceConnection serviceConnection, String str, Executor executor);

    public final void zZKhbgvUfsK4AEX3r0(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        HJFh0TGMpafqLE9haL(new osrHU7fvDp2EgxZPfM(str, str2, 4225, z), serviceConnection, str3);
    }
}
