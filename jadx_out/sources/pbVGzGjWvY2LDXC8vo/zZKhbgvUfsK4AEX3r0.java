package pbVGzGjWvY2LDXC8vo;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class zZKhbgvUfsK4AEX3r0 extends husNiw3snxdgZPAGJm {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public volatile Handler f6563HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Object f6564lEeR5KfoEr4xU5yHH7 = new Object();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final ExecutorService f6565s3fjYDxWOUexjjVgyA = Executors.newFixedThreadPool(4, new lEeR5KfoEr4xU5yHH7());

    public class lEeR5KfoEr4xU5yHH7 implements ThreadFactory {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final AtomicInteger f6566lEeR5KfoEr4xU5yHH7 = new AtomicInteger(0);

        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f6566lEeR5KfoEr4xU5yHH7.getAndIncrement());
            return thread;
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static Handler lEeR5KfoEr4xU5yHH7(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler zZKhbgvUfsK4AEX3r0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm
    public void HJFh0TGMpafqLE9haL(Runnable runnable) {
        if (this.f6563HJFh0TGMpafqLE9haL == null) {
            synchronized (this.f6564lEeR5KfoEr4xU5yHH7) {
                try {
                    if (this.f6563HJFh0TGMpafqLE9haL == null) {
                        this.f6563HJFh0TGMpafqLE9haL = zZKhbgvUfsK4AEX3r0(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f6563HJFh0TGMpafqLE9haL.post(runnable);
    }

    @Override // pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm
    public void lEeR5KfoEr4xU5yHH7(Runnable runnable) {
        this.f6565s3fjYDxWOUexjjVgyA.execute(runnable);
    }

    @Override // pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm
    public boolean s3fjYDxWOUexjjVgyA() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
