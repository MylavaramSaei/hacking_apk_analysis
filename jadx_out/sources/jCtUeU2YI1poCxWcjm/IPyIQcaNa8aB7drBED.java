package jCtUeU2YI1poCxWcjm;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class IPyIQcaNa8aB7drBED {

    public static class lEeR5KfoEr4xU5yHH7 implements ThreadFactory {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public String f6049lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f6050s3fjYDxWOUexjjVgyA;

        /* renamed from: jCtUeU2YI1poCxWcjm.IPyIQcaNa8aB7drBED$lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
        public static class C0095lEeR5KfoEr4xU5yHH7 extends Thread {

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public final int f6051lEeR5KfoEr4xU5yHH7;

            public C0095lEeR5KfoEr4xU5yHH7(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f6051lEeR5KfoEr4xU5yHH7 = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f6051lEeR5KfoEr4xU5yHH7);
                super.run();
            }
        }

        public lEeR5KfoEr4xU5yHH7(String str, int i) {
            this.f6049lEeR5KfoEr4xU5yHH7 = str;
            this.f6050s3fjYDxWOUexjjVgyA = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0095lEeR5KfoEr4xU5yHH7(runnable, this.f6049lEeR5KfoEr4xU5yHH7, this.f6050s3fjYDxWOUexjjVgyA);
        }
    }

    public static class s3fjYDxWOUexjjVgyA implements Runnable {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public Handler f6052HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public Callable f6053lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7 f6054s3fjYDxWOUexjjVgyA;

        public class lEeR5KfoEr4xU5yHH7 implements Runnable {

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public final /* synthetic */ tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7 f6056lEeR5KfoEr4xU5yHH7;

            /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
            public final /* synthetic */ Object f6057s3fjYDxWOUexjjVgyA;

            public lEeR5KfoEr4xU5yHH7(tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Object obj) {
                this.f6056lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
                this.f6057s3fjYDxWOUexjjVgyA = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6056lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f6057s3fjYDxWOUexjjVgyA);
            }
        }

        public s3fjYDxWOUexjjVgyA(Handler handler, Callable callable, tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this.f6053lEeR5KfoEr4xU5yHH7 = callable;
            this.f6054s3fjYDxWOUexjjVgyA = leer5kfoer4xu5yhh7;
            this.f6052HJFh0TGMpafqLE9haL = handler;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            Object objCall;
            try {
                objCall = this.f6053lEeR5KfoEr4xU5yHH7.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f6052HJFh0TGMpafqLE9haL.post(new lEeR5KfoEr4xU5yHH7(this.f6054s3fjYDxWOUexjjVgyA, objCall));
        }
    }

    public static Object HJFh0TGMpafqLE9haL(ExecutorService executorService, Callable callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    public static ThreadPoolExecutor lEeR5KfoEr4xU5yHH7(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new lEeR5KfoEr4xU5yHH7(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void s3fjYDxWOUexjjVgyA(Executor executor, Callable callable, tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        executor.execute(new s3fjYDxWOUexjjVgyA(jCtUeU2YI1poCxWcjm.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(), callable, leer5kfoer4xu5yhh7));
    }
}
