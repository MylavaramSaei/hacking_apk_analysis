package X3J0rTi7qZISiATDQK;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final X3J0rTi7qZISiATDQK.lEeR5KfoEr4xU5yHH7 f2087lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static volatile X3J0rTi7qZISiATDQK.lEeR5KfoEr4xU5yHH7 f2088s3fjYDxWOUexjjVgyA;

    /* renamed from: X3J0rTi7qZISiATDQK.s3fjYDxWOUexjjVgyA$s3fjYDxWOUexjjVgyA, reason: collision with other inner class name */
    public static class C0026s3fjYDxWOUexjjVgyA implements X3J0rTi7qZISiATDQK.lEeR5KfoEr4xU5yHH7 {
        public C0026s3fjYDxWOUexjjVgyA() {
        }

        @Override // X3J0rTi7qZISiATDQK.lEeR5KfoEr4xU5yHH7
        public ExecutorService lEeR5KfoEr4xU5yHH7(ThreadFactory threadFactory, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            return s3fjYDxWOUexjjVgyA(1, threadFactory, hJFh0TGMpafqLE9haL);
        }

        public ExecutorService s3fjYDxWOUexjjVgyA(int i, ThreadFactory threadFactory, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0026s3fjYDxWOUexjjVgyA c0026s3fjYDxWOUexjjVgyA = new C0026s3fjYDxWOUexjjVgyA();
        f2087lEeR5KfoEr4xU5yHH7 = c0026s3fjYDxWOUexjjVgyA;
        f2088s3fjYDxWOUexjjVgyA = c0026s3fjYDxWOUexjjVgyA;
    }

    public static X3J0rTi7qZISiATDQK.lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7() {
        return f2088s3fjYDxWOUexjjVgyA;
    }
}
