package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;

/* loaded from: classes.dex */
public class R9SAhYMerGybF9OAjL extends Fragment {

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final s3fjYDxWOUexjjVgyA f3807s3fjYDxWOUexjjVgyA = new s3fjYDxWOUexjjVgyA(null);

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public lEeR5KfoEr4xU5yHH7 f3808lEeR5KfoEr4xU5yHH7;

    public static final class HJFh0TGMpafqLE9haL implements Application.ActivityLifecycleCallbacks {
        public static final lEeR5KfoEr4xU5yHH7 Companion = new lEeR5KfoEr4xU5yHH7(null);

        public static final class lEeR5KfoEr4xU5yHH7 {
            public lEeR5KfoEr4xU5yHH7() {
            }

            public final void lEeR5KfoEr4xU5yHH7(Activity activity) {
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new HJFh0TGMpafqLE9haL());
            }

            public /* synthetic */ lEeR5KfoEr4xU5yHH7(jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
                this();
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.lEeR5KfoEr4xU5yHH7(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            R9SAhYMerGybF9OAjL.f3807s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(activity, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            R9SAhYMerGybF9OAjL.f3807s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(activity, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            R9SAhYMerGybF9OAjL.f3807s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(activity, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            R9SAhYMerGybF9OAjL.f3807s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(activity, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            R9SAhYMerGybF9OAjL.f3807s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(activity, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            R9SAhYMerGybF9OAjL.f3807s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(activity, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
        }
    }

    public interface lEeR5KfoEr4xU5yHH7 {
        void HJFh0TGMpafqLE9haL();

        void lEeR5KfoEr4xU5yHH7();

        void s3fjYDxWOUexjjVgyA();
    }

    public static final class s3fjYDxWOUexjjVgyA {
        public s3fjYDxWOUexjjVgyA() {
        }

        public final void HJFh0TGMpafqLE9haL(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                HJFh0TGMpafqLE9haL.Companion.lEeR5KfoEr4xU5yHH7(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new R9SAhYMerGybF9OAjL(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void lEeR5KfoEr4xU5yHH7(Activity activity, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "activity");
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "event");
            if (activity instanceof Z9WdNiOsPR0y54zHW4) {
                KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1 = ((Z9WdNiOsPR0y54zHW4) activity).TCyPEKSzIyweCN5yp1();
                if (kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1 instanceof e54J8UWNHWALQNixXM) {
                    ((e54J8UWNHWALQNixXM) kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1).IPyIQcaNa8aB7drBED(leer5kfoer4xu5yhh7);
                }
            }
        }

        public final R9SAhYMerGybF9OAjL s3fjYDxWOUexjjVgyA(Activity activity) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (R9SAhYMerGybF9OAjL) fragmentFindFragmentByTag;
        }

        public /* synthetic */ s3fjYDxWOUexjjVgyA(jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this();
        }
    }

    public final void HJFh0TGMpafqLE9haL(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA();
        }
    }

    public final void husNiw3snxdgZPAGJm(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f3808lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
    }

    public final void lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (Build.VERSION.SDK_INT < 29) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = f3807s3fjYDxWOUexjjVgyA;
            Activity activity = getActivity();
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(activity, "activity");
            s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(activity, leer5kfoer4xu5yhh7);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        s3fjYDxWOUexjjVgyA(this.f3808lEeR5KfoEr4xU5yHH7);
        lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_DESTROY);
        this.f3808lEeR5KfoEr4xU5yHH7 = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        HJFh0TGMpafqLE9haL(this.f3808lEeR5KfoEr4xU5yHH7);
        lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        zZKhbgvUfsK4AEX3r0(this.f3808lEeR5KfoEr4xU5yHH7);
        lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_STOP);
    }

    public final void s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7();
        }
    }

    public final void zZKhbgvUfsK4AEX3r0(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL();
        }
    }
}
