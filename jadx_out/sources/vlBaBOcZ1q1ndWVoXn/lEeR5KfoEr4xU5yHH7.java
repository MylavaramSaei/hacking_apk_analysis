package vlBaBOcZ1q1ndWVoXn;

import HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 implements ThreadFactory {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final String f7198lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final ThreadFactory f7199s3fjYDxWOUexjjVgyA = Executors.defaultThreadFactory();

    public lEeR5KfoEr4xU5yHH7(String str) {
        hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(str, "Name must not be null");
        this.f7198lEeR5KfoEr4xU5yHH7 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f7199s3fjYDxWOUexjjVgyA.newThread(new s3fjYDxWOUexjjVgyA(runnable, 0));
        threadNewThread.setName(this.f7198lEeR5KfoEr4xU5yHH7);
        return threadNewThread;
    }
}
