package aUn6Hqsqw2PVM8685Z;

import HR5vAalpgOKVm2T0Gq.ctWLFN70QQINH1kyYo;
import HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo;
import i8aHOwH04efS6lZ3Oa.zZKhbgvUfsK4AEX3r0;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static volatile s3fjYDxWOUexjjVgyA f2527HJFh0TGMpafqLE9haL;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final Object f2528s3fjYDxWOUexjjVgyA = new Object();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ConcurrentHashMap f2529lEeR5KfoEr4xU5yHH7 = new ConcurrentHashMap();

    public static final boolean IPyIQcaNa8aB7drBED(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!pbVGzGjWvY2LDXC8vo.pbVGzGjWvY2LDXC8vo() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    public static boolean TCyPEKSzIyweCN5yp1(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof ctWLFN70QQINH1kyYo);
    }

    public static void husNiw3snxdgZPAGJm(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public static s3fjYDxWOUexjjVgyA s3fjYDxWOUexjjVgyA() {
        if (f2527HJFh0TGMpafqLE9haL == null) {
            synchronized (f2528s3fjYDxWOUexjjVgyA) {
                try {
                    if (f2527HJFh0TGMpafqLE9haL == null) {
                        f2527HJFh0TGMpafqLE9haL = new s3fjYDxWOUexjjVgyA();
                    }
                } finally {
                }
            }
        }
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = f2527HJFh0TGMpafqLE9haL;
        hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(s3fjydxwouexjjvgya);
        return s3fjydxwouexjjvgya;
    }

    public void HJFh0TGMpafqLE9haL(Context context, ServiceConnection serviceConnection) {
        if (!TCyPEKSzIyweCN5yp1(serviceConnection) || !this.f2529lEeR5KfoEr4xU5yHH7.containsKey(serviceConnection)) {
            husNiw3snxdgZPAGJm(context, serviceConnection);
            return;
        }
        try {
            husNiw3snxdgZPAGJm(context, (ServiceConnection) this.f2529lEeR5KfoEr4xU5yHH7.get(serviceConnection));
        } finally {
            this.f2529lEeR5KfoEr4xU5yHH7.remove(serviceConnection);
        }
    }

    public final boolean KYHag8HRDlnO3X9zmZ(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(context).s3fjYDxWOUexjjVgyA(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!TCyPEKSzIyweCN5yp1(serviceConnection)) {
            return IPyIQcaNa8aB7drBED(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f2529lEeR5KfoEr4xU5yHH7.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(context, intent, serviceConnection, i, executor);
            if (zIPyIQcaNa8aB7drBED) {
                return zIPyIQcaNa8aB7drBED;
            }
            return false;
        } finally {
            this.f2529lEeR5KfoEr4xU5yHH7.remove(serviceConnection, serviceConnection);
        }
    }

    public boolean lEeR5KfoEr4xU5yHH7(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return KYHag8HRDlnO3X9zmZ(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    public final boolean zZKhbgvUfsK4AEX3r0(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return KYHag8HRDlnO3X9zmZ(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
