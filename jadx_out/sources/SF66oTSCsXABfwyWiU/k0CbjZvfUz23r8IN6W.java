package SF66oTSCsXABfwyWiU;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public class k0CbjZvfUz23r8IN6W implements Runnable {

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static Boolean f1471IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final Object f1472KYHag8HRDlnO3X9zmZ = new Object();

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static Boolean f1473TCyPEKSzIyweCN5yp1;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final PowerManager.WakeLock f1474HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final long f1475husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f1476lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final DfpieXfdYs58yZAiXY f1477s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final Tu4WCh2gEwj8E4oHbP f1478zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 extends BroadcastReceiver {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public k0CbjZvfUz23r8IN6W f1479lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(k0CbjZvfUz23r8IN6W k0cbjzvfuz23r8in6w) {
            this.f1479lEeR5KfoEr4xU5yHH7 = k0cbjzvfuz23r8in6w;
        }

        public void lEeR5KfoEr4xU5yHH7() {
            if (k0CbjZvfUz23r8IN6W.Acstmh57AKoSEkEFNJ()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            k0CbjZvfUz23r8IN6W.this.f1476lEeR5KfoEr4xU5yHH7.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                k0CbjZvfUz23r8IN6W k0cbjzvfuz23r8in6w = this.f1479lEeR5KfoEr4xU5yHH7;
                if (k0cbjzvfuz23r8in6w == null) {
                    return;
                }
                if (k0cbjzvfuz23r8in6w.pbVGzGjWvY2LDXC8vo()) {
                    if (k0CbjZvfUz23r8IN6W.Acstmh57AKoSEkEFNJ()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f1479lEeR5KfoEr4xU5yHH7.f1478zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(this.f1479lEeR5KfoEr4xU5yHH7, 0L);
                    context.unregisterReceiver(this);
                    this.f1479lEeR5KfoEr4xU5yHH7 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k0CbjZvfUz23r8IN6W(Tu4WCh2gEwj8E4oHbP tu4WCh2gEwj8E4oHbP, Context context, DfpieXfdYs58yZAiXY dfpieXfdYs58yZAiXY, long j) {
        this.f1478zZKhbgvUfsK4AEX3r0 = tu4WCh2gEwj8E4oHbP;
        this.f1476lEeR5KfoEr4xU5yHH7 = context;
        this.f1475husNiw3snxdgZPAGJm = j;
        this.f1477s3fjYDxWOUexjjVgyA = dfpieXfdYs58yZAiXY;
        this.f1474HJFh0TGMpafqLE9haL = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean Acstmh57AKoSEkEFNJ() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public static boolean IPyIQcaNa8aB7drBED(Context context) {
        boolean zBooleanValue;
        synchronized (f1472KYHag8HRDlnO3X9zmZ) {
            try {
                Boolean bool = f1473TCyPEKSzIyweCN5yp1;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? TCyPEKSzIyweCN5yp1(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f1473TCyPEKSzIyweCN5yp1 = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean KYHag8HRDlnO3X9zmZ(Context context) {
        boolean zBooleanValue;
        synchronized (f1472KYHag8HRDlnO3X9zmZ) {
            try {
                Boolean bool = f1471IPyIQcaNa8aB7drBED;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? TCyPEKSzIyweCN5yp1(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f1471IPyIQcaNa8aB7drBED = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean TCyPEKSzIyweCN5yp1(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", husNiw3snxdgZPAGJm(str));
        }
        return z;
    }

    public static String husNiw3snxdgZPAGJm(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean pbVGzGjWvY2LDXC8vo() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f1476lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: SF66oTSCsXABfwyWiU.k0CbjZvfUz23r8IN6W.pbVGzGjWvY2LDXC8vo():boolean");
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (IPyIQcaNa8aB7drBED(this.f1476lEeR5KfoEr4xU5yHH7)) {
            this.f1474HJFh0TGMpafqLE9haL.acquire(husNiw3snxdgZPAGJm.f1468lEeR5KfoEr4xU5yHH7);
        }
        try {
            try {
                try {
                    this.f1478zZKhbgvUfsK4AEX3r0.aPyGSIylzVNKPT1Bls(true);
                } catch (Throwable th) {
                    if (IPyIQcaNa8aB7drBED(this.f1476lEeR5KfoEr4xU5yHH7)) {
                        try {
                            this.f1474HJFh0TGMpafqLE9haL.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                this.f1478zZKhbgvUfsK4AEX3r0.aPyGSIylzVNKPT1Bls(false);
                if (!IPyIQcaNa8aB7drBED(this.f1476lEeR5KfoEr4xU5yHH7)) {
                    return;
                } else {
                    wakeLock = this.f1474HJFh0TGMpafqLE9haL;
                }
            }
            if (!this.f1477s3fjYDxWOUexjjVgyA.TCyPEKSzIyweCN5yp1()) {
                this.f1478zZKhbgvUfsK4AEX3r0.aPyGSIylzVNKPT1Bls(false);
                if (IPyIQcaNa8aB7drBED(this.f1476lEeR5KfoEr4xU5yHH7)) {
                    try {
                        this.f1474HJFh0TGMpafqLE9haL.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (KYHag8HRDlnO3X9zmZ(this.f1476lEeR5KfoEr4xU5yHH7) && !pbVGzGjWvY2LDXC8vo()) {
                new lEeR5KfoEr4xU5yHH7(this).lEeR5KfoEr4xU5yHH7();
                if (IPyIQcaNa8aB7drBED(this.f1476lEeR5KfoEr4xU5yHH7)) {
                    try {
                        this.f1474HJFh0TGMpafqLE9haL.release();
                        return;
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.f1478zZKhbgvUfsK4AEX3r0.Y43RdunnpKgpbny0lE()) {
                this.f1478zZKhbgvUfsK4AEX3r0.aPyGSIylzVNKPT1Bls(false);
            } else {
                this.f1478zZKhbgvUfsK4AEX3r0.R9SAhYMerGybF9OAjL(this.f1475husNiw3snxdgZPAGJm);
            }
            if (IPyIQcaNa8aB7drBED(this.f1476lEeR5KfoEr4xU5yHH7)) {
                wakeLock = this.f1474HJFh0TGMpafqLE9haL;
                wakeLock.release();
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
