package fB1XGht2x9XoIgekQ8;

import java.util.concurrent.TimeUnit;
import w859GrF8FXGM1qrYSH.OANkd3mP6AYvwbNLJM;

/* loaded from: classes.dex */
public class husNiw3snxdgZPAGJm {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f5836HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final OANkd3mP6AYvwbNLJM f5837lEeR5KfoEr4xU5yHH7 = OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public long f5838s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final long f5835zZKhbgvUfsK4AEX3r0 = TimeUnit.HOURS.toMillis(24);

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final long f5834husNiw3snxdgZPAGJm = TimeUnit.MINUTES.toMillis(30);

    public static boolean HJFh0TGMpafqLE9haL(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    public static boolean zZKhbgvUfsK4AEX3r0(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    public synchronized void KYHag8HRDlnO3X9zmZ(int i) {
        if (zZKhbgvUfsK4AEX3r0(i)) {
            husNiw3snxdgZPAGJm();
            return;
        }
        this.f5836HJFh0TGMpafqLE9haL++;
        this.f5838s3fjYDxWOUexjjVgyA = this.f5837lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7() + lEeR5KfoEr4xU5yHH7(i);
    }

    public final synchronized void husNiw3snxdgZPAGJm() {
        this.f5836HJFh0TGMpafqLE9haL = 0;
    }

    public final synchronized long lEeR5KfoEr4xU5yHH7(int i) {
        if (HJFh0TGMpafqLE9haL(i)) {
            return (long) Math.min(Math.pow(2.0d, this.f5836HJFh0TGMpafqLE9haL) + this.f5837lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(), f5834husNiw3snxdgZPAGJm);
        }
        return f5835zZKhbgvUfsK4AEX3r0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean s3fjYDxWOUexjjVgyA() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f5836HJFh0TGMpafqLE9haL     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            w859GrF8FXGM1qrYSH.OANkd3mP6AYvwbNLJM r0 = r4.f5837lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Throwable -> L14
            long r0 = r0.lEeR5KfoEr4xU5yHH7()     // Catch: java.lang.Throwable -> L14
            long r2 = r4.f5838s3fjYDxWOUexjjVgyA     // Catch: java.lang.Throwable -> L14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r4)
            return r0
        L19:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fB1XGht2x9XoIgekQ8.husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA():boolean");
    }
}
