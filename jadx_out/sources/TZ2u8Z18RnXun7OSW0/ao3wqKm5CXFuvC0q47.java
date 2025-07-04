package TZ2u8Z18RnXun7OSW0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public enum ao3wqKm5CXFuvC0q47 implements Executor {
    INSTANCE;


    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final Handler f1601s3fjYDxWOUexjjVgyA = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f1601s3fjYDxWOUexjjVgyA.post(runnable);
    }
}
