package SF66oTSCsXABfwyWiU;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class zaq8hOURtfwbcX17cG implements Application.ActivityLifecycleCallbacks {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Queue f1528lEeR5KfoEr4xU5yHH7 = new ArrayDeque(10);

    /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
    public final void s3fjYDxWOUexjjVgyA(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String strIPyIQcaNa8aB7drBED = GyWRxpdt1T8mEJXPoD.IPyIQcaNa8aB7drBED(extras);
                if (!TextUtils.isEmpty(strIPyIQcaNa8aB7drBED)) {
                    if (this.f1528lEeR5KfoEr4xU5yHH7.contains(strIPyIQcaNa8aB7drBED)) {
                        return;
                    } else {
                        this.f1528lEeR5KfoEr4xU5yHH7.add(strIPyIQcaNa8aB7drBED);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (GyWRxpdt1T8mEJXPoD.XzJ1BS7H9Ilbkv4eVM(bundle)) {
            GyWRxpdt1T8mEJXPoD.A49QRPHynYLCBN0SqP(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: SF66oTSCsXABfwyWiU.OANkd3mP6AYvwbNLJM
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1390lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(intent);
                }
            });
        } else {
            s3fjYDxWOUexjjVgyA(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
