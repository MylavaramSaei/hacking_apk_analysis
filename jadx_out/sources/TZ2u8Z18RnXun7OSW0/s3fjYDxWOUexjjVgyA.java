package TZ2u8Z18RnXun7OSW0;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA implements ThreadFactory {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final ThreadFactory f1614husNiw3snxdgZPAGJm = Executors.defaultThreadFactory();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f1615HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final AtomicLong f1616lEeR5KfoEr4xU5yHH7 = new AtomicLong();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f1617s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f1618zZKhbgvUfsK4AEX3r0;

    public s3fjYDxWOUexjjVgyA(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f1617s3fjYDxWOUexjjVgyA = str;
        this.f1615HJFh0TGMpafqLE9haL = i;
        this.f1618zZKhbgvUfsK4AEX3r0 = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f1614husNiw3snxdgZPAGJm.newThread(new Runnable() { // from class: TZ2u8Z18RnXun7OSW0.lEeR5KfoEr4xU5yHH7
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                this.f1609lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f1617s3fjYDxWOUexjjVgyA, Long.valueOf(this.f1616lEeR5KfoEr4xU5yHH7.getAndIncrement())));
        return threadNewThread;
    }

    public final /* synthetic */ void s3fjYDxWOUexjjVgyA(Runnable runnable) throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f1615HJFh0TGMpafqLE9haL);
        StrictMode.ThreadPolicy threadPolicy = this.f1618zZKhbgvUfsK4AEX3r0;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }
}
