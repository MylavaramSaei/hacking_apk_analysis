package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class IPyIQcaNa8aB7drBED {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final IPyIQcaNa8aB7drBED f3768lEeR5KfoEr4xU5yHH7 = new IPyIQcaNa8aB7drBED();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final AtomicBoolean f3769s3fjYDxWOUexjjVgyA = new AtomicBoolean(false);

    public static final class lEeR5KfoEr4xU5yHH7 extends HJFh0TGMpafqLE9haL {
        @Override // androidx.lifecycle.HJFh0TGMpafqLE9haL, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            R9SAhYMerGybF9OAjL.f3807s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(activity);
        }
    }

    public static final void lEeR5KfoEr4xU5yHH7(Context context) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(context, "context");
        if (f3769s3fjYDxWOUexjjVgyA.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new lEeR5KfoEr4xU5yHH7());
    }
}
