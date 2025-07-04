package SF66oTSCsXABfwyWiU;

import android.content.Context;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class Tu4WCh2gEwj8E4oHbP {

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public static final long f1402pbVGzGjWvY2LDXC8vo = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final XzJ1BS7H9Ilbkv4eVM f1403HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final osrHU7fvDp2EgxZPfM f1404IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final ScheduledExecutorService f1405KYHag8HRDlnO3X9zmZ;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f1408lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final DfpieXfdYs58yZAiXY f1409s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final FirebaseMessaging f1410zZKhbgvUfsK4AEX3r0;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final Map f1407husNiw3snxdgZPAGJm = new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7();

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f1406TCyPEKSzIyweCN5yp1 = false;

    public Tu4WCh2gEwj8E4oHbP(FirebaseMessaging firebaseMessaging, DfpieXfdYs58yZAiXY dfpieXfdYs58yZAiXY, osrHU7fvDp2EgxZPfM osrhu7fvdp2egxzpfm, XzJ1BS7H9Ilbkv4eVM xzJ1BS7H9Ilbkv4eVM, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f1410zZKhbgvUfsK4AEX3r0 = firebaseMessaging;
        this.f1409s3fjYDxWOUexjjVgyA = dfpieXfdYs58yZAiXY;
        this.f1404IPyIQcaNa8aB7drBED = osrhu7fvdp2egxzpfm;
        this.f1403HJFh0TGMpafqLE9haL = xzJ1BS7H9Ilbkv4eVM;
        this.f1408lEeR5KfoEr4xU5yHH7 = context;
        this.f1405KYHag8HRDlnO3X9zmZ = scheduledExecutorService;
    }

    public static /* synthetic */ Tu4WCh2gEwj8E4oHbP Acstmh57AKoSEkEFNJ(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, DfpieXfdYs58yZAiXY dfpieXfdYs58yZAiXY, XzJ1BS7H9Ilbkv4eVM xzJ1BS7H9Ilbkv4eVM) {
        return new Tu4WCh2gEwj8E4oHbP(firebaseMessaging, dfpieXfdYs58yZAiXY, osrHU7fvDp2EgxZPfM.s3fjYDxWOUexjjVgyA(context, scheduledExecutorService), xzJ1BS7H9Ilbkv4eVM, context, scheduledExecutorService);
    }

    public static void HJFh0TGMpafqLE9haL(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) throws IOException {
        try {
            JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA(pbvgzgjwvy2ldxc8vo, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static boolean IPyIQcaNa8aB7drBED() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public static JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo KYHag8HRDlnO3X9zmZ(final FirebaseMessaging firebaseMessaging, final DfpieXfdYs58yZAiXY dfpieXfdYs58yZAiXY, final XzJ1BS7H9Ilbkv4eVM xzJ1BS7H9Ilbkv4eVM, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL(scheduledExecutorService, new Callable() { // from class: SF66oTSCsXABfwyWiU.ZJNyOIPL0usMs2xSAn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Tu4WCh2gEwj8E4oHbP.Acstmh57AKoSEkEFNJ(context, scheduledExecutorService, firebaseMessaging, dfpieXfdYs58yZAiXY, xzJ1BS7H9Ilbkv4eVM);
            }
        });
    }

    public final void OANkd3mP6AYvwbNLJM() {
        if (pbVGzGjWvY2LDXC8vo()) {
            return;
        }
        R9SAhYMerGybF9OAjL(0L);
    }

    public void R9SAhYMerGybF9OAjL(long j) {
        T9PhQIpGRhE4yZDm1C(new k0CbjZvfUz23r8IN6W(this, this.f1408lEeR5KfoEr4xU5yHH7, this.f1409s3fjYDxWOUexjjVgyA, Math.min(Math.max(30L, 2 * j), f1402pbVGzGjWvY2LDXC8vo)), j);
        aPyGSIylzVNKPT1Bls(true);
    }

    public void T9PhQIpGRhE4yZDm1C(Runnable runnable, long j) {
        this.f1405KYHag8HRDlnO3X9zmZ.schedule(runnable, j, TimeUnit.SECONDS);
    }

    public boolean TCyPEKSzIyweCN5yp1() {
        return this.f1404IPyIQcaNa8aB7drBED.HJFh0TGMpafqLE9haL() != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (IPyIQcaNa8aB7drBED() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Y43RdunnpKgpbny0lE() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            SF66oTSCsXABfwyWiU.osrHU7fvDp2EgxZPfM r0 = r2.f1404IPyIQcaNa8aB7drBED     // Catch: java.lang.Throwable -> L17
            SF66oTSCsXABfwyWiU.CSih7GetOUab1dYQjM r0 = r0.HJFh0TGMpafqLE9haL()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = IPyIQcaNa8aB7drBED()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            r0 = 1
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.e54J8UWNHWALQNixXM(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            SF66oTSCsXABfwyWiU.osrHU7fvDp2EgxZPfM r1 = r2.f1404IPyIQcaNa8aB7drBED
            r1.husNiw3snxdgZPAGJm(r0)
            r2.Z9WdNiOsPR0y54zHW4(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: SF66oTSCsXABfwyWiU.Tu4WCh2gEwj8E4oHbP.Y43RdunnpKgpbny0lE():boolean");
    }

    public final void Z9WdNiOsPR0y54zHW4(CSih7GetOUab1dYQjM cSih7GetOUab1dYQjM) {
        synchronized (this.f1407husNiw3snxdgZPAGJm) {
            try {
                String strHusNiw3snxdgZPAGJm = cSih7GetOUab1dYQjM.husNiw3snxdgZPAGJm();
                if (this.f1407husNiw3snxdgZPAGJm.containsKey(strHusNiw3snxdgZPAGJm)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f1407husNiw3snxdgZPAGJm.get(strHusNiw3snxdgZPAGJm);
                    JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = (JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ) arrayDeque.poll();
                    if (acstmh57AKoSEkEFNJ != null) {
                        acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f1407husNiw3snxdgZPAGJm.remove(strHusNiw3snxdgZPAGJm);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void aPyGSIylzVNKPT1Bls(boolean z) {
        this.f1406TCyPEKSzIyweCN5yp1 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e54J8UWNHWALQNixXM(SF66oTSCsXABfwyWiU.CSih7GetOUab1dYQjM r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.s3fjYDxWOUexjjVgyA()     // Catch: java.io.IOException -> L1f
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L1f
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L22
            r4 = 85
            if (r3 == r4) goto L15
            goto L2c
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r5
            goto L2d
        L1f:
            r7 = move-exception
            goto La0
        L22:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r1
            goto L2d
        L2c:
            r2 = -1
        L2d:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L79
            if (r2 == r5) goto L53
            boolean r2 = IPyIQcaNa8aB7drBED()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
        L4f:
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
            goto L9f
        L53:
            java.lang.String r2 = r7.HJFh0TGMpafqLE9haL()     // Catch: java.io.IOException -> L1f
            r6.husNiw3snxdgZPAGJm(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = IPyIQcaNa8aB7drBED()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.HJFh0TGMpafqLE9haL()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            goto L4f
        L79:
            java.lang.String r2 = r7.HJFh0TGMpafqLE9haL()     // Catch: java.io.IOException -> L1f
            r6.zZKhbgvUfsK4AEX3r0(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = IPyIQcaNa8aB7drBED()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.HJFh0TGMpafqLE9haL()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            goto L4f
        L9f:
            return r5
        La0:
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Ld2
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Ld2
            java.lang.String r2 = "TOO_MANY_SUBSCRIBERS"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lc5
            goto Ld2
        Lc5:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Ld1
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
        Lcd:
            android.util.Log.e(r0, r7)
            return r1
        Ld1:
            throw r7
        Ld2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: SF66oTSCsXABfwyWiU.Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM(SF66oTSCsXABfwyWiU.CSih7GetOUab1dYQjM):boolean");
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo hoXrIDAFrSwfShk8da(CSih7GetOUab1dYQjM cSih7GetOUab1dYQjM) {
        this.f1404IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(cSih7GetOUab1dYQjM);
        JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = new JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ();
        s3fjYDxWOUexjjVgyA(cSih7GetOUab1dYQjM, acstmh57AKoSEkEFNJ);
        return acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
    }

    public final void husNiw3snxdgZPAGJm(String str) throws IOException {
        HJFh0TGMpafqLE9haL(this.f1403HJFh0TGMpafqLE9haL.hoXrIDAFrSwfShk8da(this.f1410zZKhbgvUfsK4AEX3r0.e54J8UWNHWALQNixXM(), str));
    }

    public synchronized boolean pbVGzGjWvY2LDXC8vo() {
        return this.f1406TCyPEKSzIyweCN5yp1;
    }

    public final void s3fjYDxWOUexjjVgyA(CSih7GetOUab1dYQjM cSih7GetOUab1dYQjM, JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
        ArrayDeque arrayDeque;
        synchronized (this.f1407husNiw3snxdgZPAGJm) {
            try {
                String strHusNiw3snxdgZPAGJm = cSih7GetOUab1dYQjM.husNiw3snxdgZPAGJm();
                if (this.f1407husNiw3snxdgZPAGJm.containsKey(strHusNiw3snxdgZPAGJm)) {
                    arrayDeque = (ArrayDeque) this.f1407husNiw3snxdgZPAGJm.get(strHusNiw3snxdgZPAGJm);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f1407husNiw3snxdgZPAGJm.put(strHusNiw3snxdgZPAGJm, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(acstmh57AKoSEkEFNJ);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo sTkWmhpZ5b1ArQIw4K(String str) {
        JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(CSih7GetOUab1dYQjM.KYHag8HRDlnO3X9zmZ(str));
        zaq8hOURtfwbcX17cG();
        return pbvgzgjwvy2ldxc8voHoXrIDAFrSwfShk8da;
    }

    public final void zZKhbgvUfsK4AEX3r0(String str) throws IOException {
        HJFh0TGMpafqLE9haL(this.f1403HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C(this.f1410zZKhbgvUfsK4AEX3r0.e54J8UWNHWALQNixXM(), str));
    }

    public void zaq8hOURtfwbcX17cG() {
        if (TCyPEKSzIyweCN5yp1()) {
            OANkd3mP6AYvwbNLJM();
        }
    }
}
