package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import androidx.lifecycle.R9SAhYMerGybF9OAjL;

/* loaded from: classes.dex */
public final class Y43RdunnpKgpbny0lE implements Z9WdNiOsPR0y54zHW4 {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public Handler f3836husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f3837lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f3838s3fjYDxWOUexjjVgyA;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public static final s3fjYDxWOUexjjVgyA f3831pbVGzGjWvY2LDXC8vo = new s3fjYDxWOUexjjVgyA(null);

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public static final Y43RdunnpKgpbny0lE f3830Acstmh57AKoSEkEFNJ = new Y43RdunnpKgpbny0lE();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public boolean f3832HJFh0TGMpafqLE9haL = true;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f3839zZKhbgvUfsK4AEX3r0 = true;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final e54J8UWNHWALQNixXM f3834KYHag8HRDlnO3X9zmZ = new e54J8UWNHWALQNixXM(this);

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final Runnable f3835TCyPEKSzIyweCN5yp1 = new Runnable() { // from class: androidx.lifecycle.sTkWmhpZ5b1ArQIw4K
        @Override // java.lang.Runnable
        public final void run() {
            Y43RdunnpKgpbny0lE.Z9WdNiOsPR0y54zHW4(this.f3862lEeR5KfoEr4xU5yHH7);
        }
    };

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final R9SAhYMerGybF9OAjL.lEeR5KfoEr4xU5yHH7 f3833IPyIQcaNa8aB7drBED = new zZKhbgvUfsK4AEX3r0();

    public static final class HJFh0TGMpafqLE9haL extends androidx.lifecycle.HJFh0TGMpafqLE9haL {

        public static final class lEeR5KfoEr4xU5yHH7 extends androidx.lifecycle.HJFh0TGMpafqLE9haL {
            final /* synthetic */ Y43RdunnpKgpbny0lE this$0;

            public lEeR5KfoEr4xU5yHH7(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
                this.this$0 = y43RdunnpKgpbny0lE;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
                this.this$0.KYHag8HRDlnO3X9zmZ();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
                this.this$0.IPyIQcaNa8aB7drBED();
            }
        }

        public HJFh0TGMpafqLE9haL() {
        }

        @Override // androidx.lifecycle.HJFh0TGMpafqLE9haL, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                R9SAhYMerGybF9OAjL.f3807s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(activity).husNiw3snxdgZPAGJm(Y43RdunnpKgpbny0lE.this.f3833IPyIQcaNa8aB7drBED);
            }
        }

        @Override // androidx.lifecycle.HJFh0TGMpafqLE9haL, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            Y43RdunnpKgpbny0lE.this.husNiw3snxdgZPAGJm();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(activity, new lEeR5KfoEr4xU5yHH7(Y43RdunnpKgpbny0lE.this));
        }

        @Override // androidx.lifecycle.HJFh0TGMpafqLE9haL, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            Y43RdunnpKgpbny0lE.this.pbVGzGjWvY2LDXC8vo();
        }
    }

    public static final class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f3840lEeR5KfoEr4xU5yHH7 = new lEeR5KfoEr4xU5yHH7();

        public static final void lEeR5KfoEr4xU5yHH7(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class s3fjYDxWOUexjjVgyA {
        public s3fjYDxWOUexjjVgyA() {
        }

        public final Z9WdNiOsPR0y54zHW4 lEeR5KfoEr4xU5yHH7() {
            return Y43RdunnpKgpbny0lE.f3830Acstmh57AKoSEkEFNJ;
        }

        public final void s3fjYDxWOUexjjVgyA(Context context) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(context, "context");
            Y43RdunnpKgpbny0lE.f3830Acstmh57AKoSEkEFNJ.Acstmh57AKoSEkEFNJ(context);
        }

        public /* synthetic */ s3fjYDxWOUexjjVgyA(jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this();
        }
    }

    public static final class zZKhbgvUfsK4AEX3r0 implements R9SAhYMerGybF9OAjL.lEeR5KfoEr4xU5yHH7 {
        public zZKhbgvUfsK4AEX3r0() {
        }

        @Override // androidx.lifecycle.R9SAhYMerGybF9OAjL.lEeR5KfoEr4xU5yHH7
        public void HJFh0TGMpafqLE9haL() {
            Y43RdunnpKgpbny0lE.this.IPyIQcaNa8aB7drBED();
        }

        @Override // androidx.lifecycle.R9SAhYMerGybF9OAjL.lEeR5KfoEr4xU5yHH7
        public void lEeR5KfoEr4xU5yHH7() {
        }

        @Override // androidx.lifecycle.R9SAhYMerGybF9OAjL.lEeR5KfoEr4xU5yHH7
        public void s3fjYDxWOUexjjVgyA() {
            Y43RdunnpKgpbny0lE.this.KYHag8HRDlnO3X9zmZ();
        }
    }

    public static final void Z9WdNiOsPR0y54zHW4(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(y43RdunnpKgpbny0lE, "this$0");
        y43RdunnpKgpbny0lE.e54J8UWNHWALQNixXM();
        y43RdunnpKgpbny0lE.T9PhQIpGRhE4yZDm1C();
    }

    public final void Acstmh57AKoSEkEFNJ(Context context) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(context, "context");
        this.f3836husNiw3snxdgZPAGJm = new Handler();
        this.f3834KYHag8HRDlnO3X9zmZ.IPyIQcaNa8aB7drBED(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new HJFh0TGMpafqLE9haL());
    }

    public final void IPyIQcaNa8aB7drBED() {
        int i = this.f3837lEeR5KfoEr4xU5yHH7 + 1;
        this.f3837lEeR5KfoEr4xU5yHH7 = i;
        if (i == 1 && this.f3839zZKhbgvUfsK4AEX3r0) {
            this.f3834KYHag8HRDlnO3X9zmZ.IPyIQcaNa8aB7drBED(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_START);
            this.f3839zZKhbgvUfsK4AEX3r0 = false;
        }
    }

    public final void KYHag8HRDlnO3X9zmZ() {
        int i = this.f3838s3fjYDxWOUexjjVgyA + 1;
        this.f3838s3fjYDxWOUexjjVgyA = i;
        if (i == 1) {
            if (this.f3832HJFh0TGMpafqLE9haL) {
                this.f3834KYHag8HRDlnO3X9zmZ.IPyIQcaNa8aB7drBED(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_RESUME);
                this.f3832HJFh0TGMpafqLE9haL = false;
            } else {
                Handler handler = this.f3836husNiw3snxdgZPAGJm;
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(handler);
                handler.removeCallbacks(this.f3835TCyPEKSzIyweCN5yp1);
            }
        }
    }

    public final void T9PhQIpGRhE4yZDm1C() {
        if (this.f3837lEeR5KfoEr4xU5yHH7 == 0 && this.f3832HJFh0TGMpafqLE9haL) {
            this.f3834KYHag8HRDlnO3X9zmZ.IPyIQcaNa8aB7drBED(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_STOP);
            this.f3839zZKhbgvUfsK4AEX3r0 = true;
        }
    }

    @Override // androidx.lifecycle.Z9WdNiOsPR0y54zHW4
    public KYHag8HRDlnO3X9zmZ TCyPEKSzIyweCN5yp1() {
        return this.f3834KYHag8HRDlnO3X9zmZ;
    }

    public final void e54J8UWNHWALQNixXM() {
        if (this.f3838s3fjYDxWOUexjjVgyA == 0) {
            this.f3832HJFh0TGMpafqLE9haL = true;
            this.f3834KYHag8HRDlnO3X9zmZ.IPyIQcaNa8aB7drBED(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_PAUSE);
        }
    }

    public final void husNiw3snxdgZPAGJm() {
        int i = this.f3838s3fjYDxWOUexjjVgyA - 1;
        this.f3838s3fjYDxWOUexjjVgyA = i;
        if (i == 0) {
            Handler handler = this.f3836husNiw3snxdgZPAGJm;
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(handler);
            handler.postDelayed(this.f3835TCyPEKSzIyweCN5yp1, 700L);
        }
    }

    public final void pbVGzGjWvY2LDXC8vo() {
        this.f3837lEeR5KfoEr4xU5yHH7--;
        T9PhQIpGRhE4yZDm1C();
    }
}
