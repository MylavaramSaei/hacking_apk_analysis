package e5tXAuLbtMC3XyEoX9;

import HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da;
import OWyIJu8lIXxQlvLhaC.IPyIQcaNa8aB7drBED;
import OWyIJu8lIXxQlvLhaC.pbVGzGjWvY2LDXC8vo;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import fDXXEWvhMVO3O8mnuS.T9PhQIpGRhE4yZDm1C;
import fDXXEWvhMVO3O8mnuS.e54J8UWNHWALQNixXM;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public fDXXEWvhMVO3O8mnuS.zZKhbgvUfsK4AEX3r0 f5653Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f5654HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int f5655IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final Set f5656KYHag8HRDlnO3X9zmZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public AtomicInteger f5657OANkd3mP6AYvwbNLJM;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public final String f5658T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f5659TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public WorkSource f5660Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public final Map f5661aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final String f5662e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public final Context f5663hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public long f5664husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Object f5665lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public OWyIJu8lIXxQlvLhaC.s3fjYDxWOUexjjVgyA f5666pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final PowerManager.WakeLock f5667s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public Future f5668zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public final ScheduledExecutorService f5669zaq8hOURtfwbcX17cG;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public static final long f5652sTkWmhpZ5b1ArQIw4K = TimeUnit.DAYS.toMillis(366);

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public static volatile ScheduledExecutorService f5651Y43RdunnpKgpbny0lE = null;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public static final Object f5650R9SAhYMerGybF9OAjL = new Object();

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public static volatile husNiw3snxdgZPAGJm f5649G7AC3DWIx9i9fdanjk = new HJFh0TGMpafqLE9haL();

    public lEeR5KfoEr4xU5yHH7(Context context, int i, String str) {
        String packageName = context.getPackageName();
        this.f5665lEeR5KfoEr4xU5yHH7 = new Object();
        this.f5654HJFh0TGMpafqLE9haL = 0;
        this.f5656KYHag8HRDlnO3X9zmZ = new HashSet();
        this.f5659TCyPEKSzIyweCN5yp1 = true;
        this.f5653Acstmh57AKoSEkEFNJ = fDXXEWvhMVO3O8mnuS.husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA();
        this.f5661aPyGSIylzVNKPT1Bls = new HashMap();
        this.f5657OANkd3mP6AYvwbNLJM = new AtomicInteger(0);
        hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(context, "WakeLock: context must not be null");
        hoXrIDAFrSwfShk8da.husNiw3snxdgZPAGJm(str, "WakeLock: wakeLockName must not be empty");
        this.f5663hoXrIDAFrSwfShk8da = context.getApplicationContext();
        this.f5658T9PhQIpGRhE4yZDm1C = str;
        this.f5666pbVGzGjWvY2LDXC8vo = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f5662e54J8UWNHWALQNixXM = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f5662e54J8UWNHWALQNixXM = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new pbVGzGjWvY2LDXC8vo(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i, str);
        this.f5667s3fjYDxWOUexjjVgyA = wakeLockNewWakeLock;
        if (T9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL(context)) {
            WorkSource workSourceS3fjYDxWOUexjjVgyA = T9PhQIpGRhE4yZDm1C.s3fjYDxWOUexjjVgyA(context, e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(packageName) ? context.getPackageName() : packageName);
            this.f5660Z9WdNiOsPR0y54zHW4 = workSourceS3fjYDxWOUexjjVgyA;
            if (workSourceS3fjYDxWOUexjjVgyA != null) {
                pbVGzGjWvY2LDXC8vo(wakeLockNewWakeLock, workSourceS3fjYDxWOUexjjVgyA);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f5651Y43RdunnpKgpbny0lE;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f5650R9SAhYMerGybF9OAjL) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f5651Y43RdunnpKgpbny0lE;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f5651Y43RdunnpKgpbny0lE = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f5669zaq8hOURtfwbcX17cG = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void husNiw3snxdgZPAGJm(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        synchronized (leer5kfoer4xu5yhh7.f5665lEeR5KfoEr4xU5yHH7) {
            try {
                if (leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA()) {
                    Log.e("WakeLock", String.valueOf(leer5kfoer4xu5yhh7.f5662e54J8UWNHWALQNixXM).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    leer5kfoer4xu5yhh7.TCyPEKSzIyweCN5yp1();
                    if (leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA()) {
                        leer5kfoer4xu5yhh7.f5654HJFh0TGMpafqLE9haL = 1;
                        leer5kfoer4xu5yhh7.IPyIQcaNa8aB7drBED(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void pbVGzGjWvY2LDXC8vo(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public void HJFh0TGMpafqLE9haL() {
        if (this.f5657OANkd3mP6AYvwbNLJM.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f5662e54J8UWNHWALQNixXM).concat(" release without a matched acquire!"));
        }
        synchronized (this.f5665lEeR5KfoEr4xU5yHH7) {
            try {
                KYHag8HRDlnO3X9zmZ(null);
                if (this.f5661aPyGSIylzVNKPT1Bls.containsKey(null)) {
                    zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) this.f5661aPyGSIylzVNKPT1Bls.get(null);
                    if (zzkhbgvufsk4aex3r0 != null) {
                        int i = zzkhbgvufsk4aex3r0.f5671lEeR5KfoEr4xU5yHH7 - 1;
                        zzkhbgvufsk4aex3r0.f5671lEeR5KfoEr4xU5yHH7 = i;
                        if (i == 0) {
                            this.f5661aPyGSIylzVNKPT1Bls.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f5662e54J8UWNHWALQNixXM).concat(" counter does not exist"));
                }
                IPyIQcaNa8aB7drBED(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void IPyIQcaNa8aB7drBED(int i) {
        synchronized (this.f5665lEeR5KfoEr4xU5yHH7) {
            try {
                if (s3fjYDxWOUexjjVgyA()) {
                    if (this.f5659TCyPEKSzIyweCN5yp1) {
                        int i2 = this.f5654HJFh0TGMpafqLE9haL - 1;
                        this.f5654HJFh0TGMpafqLE9haL = i2;
                        if (i2 > 0) {
                            return;
                        }
                    } else {
                        this.f5654HJFh0TGMpafqLE9haL = 0;
                    }
                    TCyPEKSzIyweCN5yp1();
                    Iterator it = this.f5661aPyGSIylzVNKPT1Bls.values().iterator();
                    while (it.hasNext()) {
                        ((zZKhbgvUfsK4AEX3r0) it.next()).f5671lEeR5KfoEr4xU5yHH7 = 0;
                    }
                    this.f5661aPyGSIylzVNKPT1Bls.clear();
                    Future future = this.f5668zZKhbgvUfsK4AEX3r0;
                    if (future != null) {
                        future.cancel(false);
                        this.f5668zZKhbgvUfsK4AEX3r0 = null;
                        this.f5664husNiw3snxdgZPAGJm = 0L;
                    }
                    this.f5655IPyIQcaNa8aB7drBED = 0;
                    if (this.f5667s3fjYDxWOUexjjVgyA.isHeld()) {
                        try {
                            try {
                                this.f5667s3fjYDxWOUexjjVgyA.release();
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.f5662e54J8UWNHWALQNixXM).concat(" failed to release!"), e);
                                if (this.f5666pbVGzGjWvY2LDXC8vo != null) {
                                }
                            }
                        } finally {
                            if (this.f5666pbVGzGjWvY2LDXC8vo != null) {
                                this.f5666pbVGzGjWvY2LDXC8vo = null;
                            }
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f5662e54J8UWNHWALQNixXM).concat(" should be held!"));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String KYHag8HRDlnO3X9zmZ(String str) {
        if (this.f5659TCyPEKSzIyweCN5yp1) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    public final void TCyPEKSzIyweCN5yp1() {
        if (this.f5656KYHag8HRDlnO3X9zmZ.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f5656KYHag8HRDlnO3X9zmZ);
        this.f5656KYHag8HRDlnO3X9zmZ.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(arrayList.get(0));
        throw null;
    }

    public void lEeR5KfoEr4xU5yHH7(long j) {
        this.f5657OANkd3mP6AYvwbNLJM.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f5652sTkWmhpZ5b1ArQIw4K), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.f5665lEeR5KfoEr4xU5yHH7) {
            try {
                if (!s3fjYDxWOUexjjVgyA()) {
                    this.f5666pbVGzGjWvY2LDXC8vo = OWyIJu8lIXxQlvLhaC.s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(false, null);
                    this.f5667s3fjYDxWOUexjjVgyA.acquire();
                    this.f5653Acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
                }
                this.f5654HJFh0TGMpafqLE9haL++;
                this.f5655IPyIQcaNa8aB7drBED++;
                KYHag8HRDlnO3X9zmZ(null);
                zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) this.f5661aPyGSIylzVNKPT1Bls.get(null);
                if (zzkhbgvufsk4aex3r0 == null) {
                    zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0(null);
                    this.f5661aPyGSIylzVNKPT1Bls.put(null, zzkhbgvufsk4aex3r0);
                }
                zzkhbgvufsk4aex3r0.f5671lEeR5KfoEr4xU5yHH7++;
                long jLEeR5KfoEr4xU5yHH7 = this.f5653Acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
                long j2 = Long.MAX_VALUE - jLEeR5KfoEr4xU5yHH7 > jMax ? jLEeR5KfoEr4xU5yHH7 + jMax : Long.MAX_VALUE;
                if (j2 > this.f5664husNiw3snxdgZPAGJm) {
                    this.f5664husNiw3snxdgZPAGJm = j2;
                    Future future = this.f5668zZKhbgvUfsK4AEX3r0;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f5668zZKhbgvUfsK4AEX3r0 = this.f5669zaq8hOURtfwbcX17cG.schedule(new Runnable() { // from class: e5tXAuLbtMC3XyEoX9.s3fjYDxWOUexjjVgyA
                        @Override // java.lang.Runnable
                        public final void run() {
                            lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(this.f5670lEeR5KfoEr4xU5yHH7);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean s3fjYDxWOUexjjVgyA() {
        boolean z;
        synchronized (this.f5665lEeR5KfoEr4xU5yHH7) {
            z = this.f5654HJFh0TGMpafqLE9haL > 0;
        }
        return z;
    }

    public void zZKhbgvUfsK4AEX3r0(boolean z) {
        synchronized (this.f5665lEeR5KfoEr4xU5yHH7) {
            this.f5659TCyPEKSzIyweCN5yp1 = z;
        }
    }
}
