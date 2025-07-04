package aRQ2M7vtRaPDEyvpdv;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class HJFh0TGMpafqLE9haL implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final HJFh0TGMpafqLE9haL f2418husNiw3snxdgZPAGJm = new HJFh0TGMpafqLE9haL();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final AtomicBoolean f2420lEeR5KfoEr4xU5yHH7 = new AtomicBoolean();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final AtomicBoolean f2421s3fjYDxWOUexjjVgyA = new AtomicBoolean();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final ArrayList f2419HJFh0TGMpafqLE9haL = new ArrayList();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f2422zZKhbgvUfsK4AEX3r0 = false;

    public interface lEeR5KfoEr4xU5yHH7 {
        void lEeR5KfoEr4xU5yHH7(boolean z);
    }

    public static void HJFh0TGMpafqLE9haL(Application application) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = f2418husNiw3snxdgZPAGJm;
        synchronized (hJFh0TGMpafqLE9haL) {
            try {
                if (!hJFh0TGMpafqLE9haL.f2422zZKhbgvUfsK4AEX3r0) {
                    application.registerActivityLifecycleCallbacks(hJFh0TGMpafqLE9haL);
                    application.registerComponentCallbacks(hJFh0TGMpafqLE9haL);
                    hJFh0TGMpafqLE9haL.f2422zZKhbgvUfsK4AEX3r0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA() {
        return f2418husNiw3snxdgZPAGJm;
    }

    public final void KYHag8HRDlnO3X9zmZ(boolean z) {
        synchronized (f2418husNiw3snxdgZPAGJm) {
            try {
                Iterator it = this.f2419HJFh0TGMpafqLE9haL.iterator();
                while (it.hasNext()) {
                    ((lEeR5KfoEr4xU5yHH7) it.next()).lEeR5KfoEr4xU5yHH7(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean husNiw3snxdgZPAGJm(boolean z) {
        if (!this.f2421s3fjYDxWOUexjjVgyA.get()) {
            if (!fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f2421s3fjYDxWOUexjjVgyA.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f2420lEeR5KfoEr4xU5yHH7.set(true);
            }
        }
        return zZKhbgvUfsK4AEX3r0();
    }

    public void lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        synchronized (f2418husNiw3snxdgZPAGJm) {
            this.f2419HJFh0TGMpafqLE9haL.add(leer5kfoer4xu5yhh7);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f2421s3fjYDxWOUexjjVgyA;
        boolean zCompareAndSet = this.f2420lEeR5KfoEr4xU5yHH7.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            KYHag8HRDlnO3X9zmZ(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f2421s3fjYDxWOUexjjVgyA;
        boolean zCompareAndSet = this.f2420lEeR5KfoEr4xU5yHH7.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            KYHag8HRDlnO3X9zmZ(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f2420lEeR5KfoEr4xU5yHH7.compareAndSet(false, true)) {
            this.f2421s3fjYDxWOUexjjVgyA.set(true);
            KYHag8HRDlnO3X9zmZ(true);
        }
    }

    public boolean zZKhbgvUfsK4AEX3r0() {
        return this.f2420lEeR5KfoEr4xU5yHH7.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
