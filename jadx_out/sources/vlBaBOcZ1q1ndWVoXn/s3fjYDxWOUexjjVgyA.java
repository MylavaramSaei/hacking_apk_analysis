package vlBaBOcZ1q1ndWVoXn;

import android.os.Process;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA implements Runnable {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Runnable f7200lEeR5KfoEr4xU5yHH7;

    public s3fjYDxWOUexjjVgyA(Runnable runnable, int i) {
        this.f7200lEeR5KfoEr4xU5yHH7 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.f7200lEeR5KfoEr4xU5yHH7.run();
    }
}
