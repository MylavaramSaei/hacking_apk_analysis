package njV42vQJoqlfw05NNQ;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final Method f6544lEeR5KfoEr4xU5yHH7;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f6544lEeR5KfoEr4xU5yHH7 = method;
    }

    public static final boolean lEeR5KfoEr4xU5yHH7(Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f6544lEeR5KfoEr4xU5yHH7) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
