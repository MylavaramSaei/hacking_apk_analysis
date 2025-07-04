package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {

    public static class lEeR5KfoEr4xU5yHH7 {
        public static Handler lEeR5KfoEr4xU5yHH7(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static /* synthetic */ Thread HJFh0TGMpafqLE9haL(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    public static ThreadPoolExecutor s3fjYDxWOUexjjVgyA(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.lEeR5KfoEr4xU5yHH7
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Handler zZKhbgvUfsK4AEX3r0() {
        return Build.VERSION.SDK_INT >= 28 ? lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
