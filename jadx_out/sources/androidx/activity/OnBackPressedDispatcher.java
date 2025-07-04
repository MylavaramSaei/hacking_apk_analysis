package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final F8je6vTkTMHm5WbjEC.zZKhbgvUfsK4AEX3r0 f2539HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f2540IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public OnBackInvokedDispatcher f2541KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f2542TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public OnBackInvokedCallback f2543husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Runnable f2544lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7 f2545s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public androidx.activity.pbVGzGjWvY2LDXC8vo f2546zZKhbgvUfsK4AEX3r0;

    public static final class HJFh0TGMpafqLE9haL extends jpEZy3U5wFkT2e9PKQ.Acstmh57AKoSEkEFNJ implements RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 {
        public HJFh0TGMpafqLE9haL() {
            super(0);
        }

        @Override // RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7
        public /* bridge */ /* synthetic */ Object lEeR5KfoEr4xU5yHH7() {
            zZKhbgvUfsK4AEX3r0();
            return GraqRgO5nDZP94CSeH.Acstmh57AKoSEkEFNJ.f265lEeR5KfoEr4xU5yHH7;
        }

        public final void zZKhbgvUfsK4AEX3r0() {
            OnBackPressedDispatcher.this.Acstmh57AKoSEkEFNJ();
        }
    }

    public final class IPyIQcaNa8aB7drBED implements androidx.activity.HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final androidx.activity.pbVGzGjWvY2LDXC8vo f2548lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f2549s3fjYDxWOUexjjVgyA;

        public IPyIQcaNa8aB7drBED(OnBackPressedDispatcher onBackPressedDispatcher, androidx.activity.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(pbvgzgjwvy2ldxc8vo, "onBackPressedCallback");
            this.f2549s3fjYDxWOUexjjVgyA = onBackPressedDispatcher;
            this.f2548lEeR5KfoEr4xU5yHH7 = pbvgzgjwvy2ldxc8vo;
        }

        @Override // androidx.activity.HJFh0TGMpafqLE9haL
        public void cancel() {
            this.f2549s3fjYDxWOUexjjVgyA.f2539HJFh0TGMpafqLE9haL.remove(this.f2548lEeR5KfoEr4xU5yHH7);
            if (jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(this.f2549s3fjYDxWOUexjjVgyA.f2546zZKhbgvUfsK4AEX3r0, this.f2548lEeR5KfoEr4xU5yHH7)) {
                this.f2548lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL();
                this.f2549s3fjYDxWOUexjjVgyA.f2546zZKhbgvUfsK4AEX3r0 = null;
            }
            this.f2548lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(this);
            RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA = this.f2548lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
            if (leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA != null) {
                leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7();
            }
            this.f2548lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(null);
        }
    }

    public static final class KYHag8HRDlnO3X9zmZ {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final KYHag8HRDlnO3X9zmZ f2550lEeR5KfoEr4xU5yHH7 = new KYHag8HRDlnO3X9zmZ();

        public static final void HJFh0TGMpafqLE9haL(RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "$onBackInvoked");
            leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7();
        }

        public final void husNiw3snxdgZPAGJm(Object obj, Object obj2) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(obj, "dispatcher");
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }

        public final OnBackInvokedCallback s3fjYDxWOUexjjVgyA(final RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.Acstmh57AKoSEkEFNJ
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(leer5kfoer4xu5yhh7);
                }
            };
        }

        public final void zZKhbgvUfsK4AEX3r0(Object obj, int i, Object obj2) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(obj, "dispatcher");
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }
    }

    public final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.pbVGzGjWvY2LDXC8vo, androidx.activity.HJFh0TGMpafqLE9haL {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public androidx.activity.HJFh0TGMpafqLE9haL f2551HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final androidx.lifecycle.KYHag8HRDlnO3X9zmZ f2552lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final androidx.activity.pbVGzGjWvY2LDXC8vo f2553s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f2554zZKhbgvUfsK4AEX3r0;

        @Override // androidx.activity.HJFh0TGMpafqLE9haL
        public void cancel() {
            this.f2552lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(this);
            this.f2553s3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo(this);
            androidx.activity.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f2551HJFh0TGMpafqLE9haL;
            if (hJFh0TGMpafqLE9haL != null) {
                hJFh0TGMpafqLE9haL.cancel();
            }
            this.f2551HJFh0TGMpafqLE9haL = null;
        }

        @Override // androidx.lifecycle.pbVGzGjWvY2LDXC8vo
        public void zZKhbgvUfsK4AEX3r0(androidx.lifecycle.Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(z9WdNiOsPR0y54zHW4, "source");
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "event");
            if (leer5kfoer4xu5yhh7 == KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_START) {
                this.f2551HJFh0TGMpafqLE9haL = this.f2554zZKhbgvUfsK4AEX3r0.IPyIQcaNa8aB7drBED(this.f2553s3fjYDxWOUexjjVgyA);
                return;
            }
            if (leer5kfoer4xu5yhh7 != KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_STOP) {
                if (leer5kfoer4xu5yhh7 == KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f2551HJFh0TGMpafqLE9haL;
                if (hJFh0TGMpafqLE9haL != null) {
                    hJFh0TGMpafqLE9haL.cancel();
                }
            }
        }
    }

    public static final class TCyPEKSzIyweCN5yp1 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final TCyPEKSzIyweCN5yp1 f2555lEeR5KfoEr4xU5yHH7 = new TCyPEKSzIyweCN5yp1();

        public static final class lEeR5KfoEr4xU5yHH7 implements OnBackAnimationCallback {

            /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
            public final /* synthetic */ RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 f2556HJFh0TGMpafqLE9haL;

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public final /* synthetic */ RkBK3rbmyPvWiHUrac.e54J8UWNHWALQNixXM f2557lEeR5KfoEr4xU5yHH7;

            /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
            public final /* synthetic */ RkBK3rbmyPvWiHUrac.e54J8UWNHWALQNixXM f2558s3fjYDxWOUexjjVgyA;

            /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
            public final /* synthetic */ RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 f2559zZKhbgvUfsK4AEX3r0;

            public lEeR5KfoEr4xU5yHH7(RkBK3rbmyPvWiHUrac.e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm, RkBK3rbmyPvWiHUrac.e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm2, RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72) {
                this.f2557lEeR5KfoEr4xU5yHH7 = e54j8uwnhwalqnixxm;
                this.f2558s3fjYDxWOUexjjVgyA = e54j8uwnhwalqnixxm2;
                this.f2556HJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh7;
                this.f2559zZKhbgvUfsK4AEX3r0 = leer5kfoer4xu5yhh72;
            }

            public void onBackCancelled() {
                this.f2559zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7();
            }

            public void onBackInvoked() {
                this.f2556HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
            }

            public void onBackProgressed(BackEvent backEvent) {
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(backEvent, "backEvent");
                this.f2558s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(new androidx.activity.s3fjYDxWOUexjjVgyA(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(backEvent, "backEvent");
                this.f2557lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(new androidx.activity.s3fjYDxWOUexjjVgyA(backEvent));
            }
        }

        public final OnBackInvokedCallback lEeR5KfoEr4xU5yHH7(RkBK3rbmyPvWiHUrac.e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm, RkBK3rbmyPvWiHUrac.e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm2, RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(e54j8uwnhwalqnixxm, "onBackStarted");
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(e54j8uwnhwalqnixxm2, "onBackProgressed");
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "onBackInvoked");
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh72, "onBackCancelled");
            return new lEeR5KfoEr4xU5yHH7(e54j8uwnhwalqnixxm, e54j8uwnhwalqnixxm2, leer5kfoer4xu5yhh7, leer5kfoer4xu5yhh72);
        }
    }

    public static final class husNiw3snxdgZPAGJm extends jpEZy3U5wFkT2e9PKQ.Acstmh57AKoSEkEFNJ implements RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 {
        public husNiw3snxdgZPAGJm() {
            super(0);
        }

        @Override // RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7
        public /* bridge */ /* synthetic */ Object lEeR5KfoEr4xU5yHH7() {
            zZKhbgvUfsK4AEX3r0();
            return GraqRgO5nDZP94CSeH.Acstmh57AKoSEkEFNJ.f265lEeR5KfoEr4xU5yHH7;
        }

        public final void zZKhbgvUfsK4AEX3r0() {
            OnBackPressedDispatcher.this.Acstmh57AKoSEkEFNJ();
        }
    }

    public static final class lEeR5KfoEr4xU5yHH7 extends jpEZy3U5wFkT2e9PKQ.Acstmh57AKoSEkEFNJ implements RkBK3rbmyPvWiHUrac.e54J8UWNHWALQNixXM {
        public lEeR5KfoEr4xU5yHH7() {
            super(1);
        }

        @Override // RkBK3rbmyPvWiHUrac.e54J8UWNHWALQNixXM
        public /* bridge */ /* synthetic */ Object HJFh0TGMpafqLE9haL(Object obj) {
            zZKhbgvUfsK4AEX3r0((androidx.activity.s3fjYDxWOUexjjVgyA) obj);
            return GraqRgO5nDZP94CSeH.Acstmh57AKoSEkEFNJ.f265lEeR5KfoEr4xU5yHH7;
        }

        public final void zZKhbgvUfsK4AEX3r0(androidx.activity.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya, "backEvent");
            OnBackPressedDispatcher.this.e54J8UWNHWALQNixXM(s3fjydxwouexjjvgya);
        }
    }

    public /* synthetic */ class pbVGzGjWvY2LDXC8vo extends jpEZy3U5wFkT2e9PKQ.IPyIQcaNa8aB7drBED implements RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 {
        public pbVGzGjWvY2LDXC8vo(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void IPyIQcaNa8aB7drBED() {
            ((OnBackPressedDispatcher) this.f6189s3fjYDxWOUexjjVgyA).aPyGSIylzVNKPT1Bls();
        }

        @Override // RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7
        public /* bridge */ /* synthetic */ Object lEeR5KfoEr4xU5yHH7() {
            IPyIQcaNa8aB7drBED();
            return GraqRgO5nDZP94CSeH.Acstmh57AKoSEkEFNJ.f265lEeR5KfoEr4xU5yHH7;
        }
    }

    public static final class s3fjYDxWOUexjjVgyA extends jpEZy3U5wFkT2e9PKQ.Acstmh57AKoSEkEFNJ implements RkBK3rbmyPvWiHUrac.e54J8UWNHWALQNixXM {
        public s3fjYDxWOUexjjVgyA() {
            super(1);
        }

        @Override // RkBK3rbmyPvWiHUrac.e54J8UWNHWALQNixXM
        public /* bridge */ /* synthetic */ Object HJFh0TGMpafqLE9haL(Object obj) {
            zZKhbgvUfsK4AEX3r0((androidx.activity.s3fjYDxWOUexjjVgyA) obj);
            return GraqRgO5nDZP94CSeH.Acstmh57AKoSEkEFNJ.f265lEeR5KfoEr4xU5yHH7;
        }

        public final void zZKhbgvUfsK4AEX3r0(androidx.activity.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya, "backEvent");
            OnBackPressedDispatcher.this.Z9WdNiOsPR0y54zHW4(s3fjydxwouexjjvgya);
        }
    }

    public static final class zZKhbgvUfsK4AEX3r0 extends jpEZy3U5wFkT2e9PKQ.Acstmh57AKoSEkEFNJ implements RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 {
        public zZKhbgvUfsK4AEX3r0() {
            super(0);
        }

        @Override // RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7
        public /* bridge */ /* synthetic */ Object lEeR5KfoEr4xU5yHH7() {
            zZKhbgvUfsK4AEX3r0();
            return GraqRgO5nDZP94CSeH.Acstmh57AKoSEkEFNJ.f265lEeR5KfoEr4xU5yHH7;
        }

        public final void zZKhbgvUfsK4AEX3r0() {
            OnBackPressedDispatcher.this.pbVGzGjWvY2LDXC8vo();
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }

    public final void Acstmh57AKoSEkEFNJ() {
        Object objPrevious;
        F8je6vTkTMHm5WbjEC.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f2539HJFh0TGMpafqLE9haL;
        ListIterator<E> listIterator = zzkhbgvufsk4aex3r0.listIterator(zzkhbgvufsk4aex3r0.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((androidx.activity.pbVGzGjWvY2LDXC8vo) objPrevious).TCyPEKSzIyweCN5yp1()) {
                    break;
                }
            }
        }
        androidx.activity.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = (androidx.activity.pbVGzGjWvY2LDXC8vo) objPrevious;
        this.f2546zZKhbgvUfsK4AEX3r0 = null;
        if (pbvgzgjwvy2ldxc8vo != null) {
            pbvgzgjwvy2ldxc8vo.zZKhbgvUfsK4AEX3r0();
            return;
        }
        Runnable runnable = this.f2544lEeR5KfoEr4xU5yHH7;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final androidx.activity.HJFh0TGMpafqLE9haL IPyIQcaNa8aB7drBED(androidx.activity.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(pbvgzgjwvy2ldxc8vo, "onBackPressedCallback");
        this.f2539HJFh0TGMpafqLE9haL.add(pbvgzgjwvy2ldxc8vo);
        IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED = new IPyIQcaNa8aB7drBED(this, pbvgzgjwvy2ldxc8vo);
        pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7(iPyIQcaNa8aB7drBED);
        aPyGSIylzVNKPT1Bls();
        pbvgzgjwvy2ldxc8vo.Z9WdNiOsPR0y54zHW4(new pbVGzGjWvY2LDXC8vo(this));
        return iPyIQcaNa8aB7drBED;
    }

    public final void T9PhQIpGRhE4yZDm1C(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(onBackInvokedDispatcher, "invoker");
        this.f2541KYHag8HRDlnO3X9zmZ = onBackInvokedDispatcher;
        hoXrIDAFrSwfShk8da(this.f2540IPyIQcaNa8aB7drBED);
    }

    public final void Z9WdNiOsPR0y54zHW4(androidx.activity.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        Object objPrevious;
        F8je6vTkTMHm5WbjEC.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f2539HJFh0TGMpafqLE9haL;
        ListIterator<E> listIterator = zzkhbgvufsk4aex3r0.listIterator(zzkhbgvufsk4aex3r0.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((androidx.activity.pbVGzGjWvY2LDXC8vo) objPrevious).TCyPEKSzIyweCN5yp1()) {
                    break;
                }
            }
        }
        androidx.activity.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = (androidx.activity.pbVGzGjWvY2LDXC8vo) objPrevious;
        if (pbvgzgjwvy2ldxc8vo != null) {
            pbvgzgjwvy2ldxc8vo.husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya);
        }
    }

    public final void aPyGSIylzVNKPT1Bls() {
        boolean z = this.f2540IPyIQcaNa8aB7drBED;
        F8je6vTkTMHm5WbjEC.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f2539HJFh0TGMpafqLE9haL;
        boolean z2 = false;
        if (!(zzkhbgvufsk4aex3r0 instanceof Collection) || !zzkhbgvufsk4aex3r0.isEmpty()) {
            Iterator<E> it = zzkhbgvufsk4aex3r0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((androidx.activity.pbVGzGjWvY2LDXC8vo) it.next()).TCyPEKSzIyweCN5yp1()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f2540IPyIQcaNa8aB7drBED = z2;
        if (z2 != z) {
            tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2545s3fjYDxWOUexjjVgyA;
            if (leer5kfoer4xu5yhh7 != null) {
                leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                hoXrIDAFrSwfShk8da(z2);
            }
        }
    }

    public final void e54J8UWNHWALQNixXM(androidx.activity.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        Object objPrevious;
        F8je6vTkTMHm5WbjEC.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f2539HJFh0TGMpafqLE9haL;
        ListIterator<E> listIterator = zzkhbgvufsk4aex3r0.listIterator(zzkhbgvufsk4aex3r0.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((androidx.activity.pbVGzGjWvY2LDXC8vo) objPrevious).TCyPEKSzIyweCN5yp1()) {
                    break;
                }
            }
        }
        androidx.activity.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = (androidx.activity.pbVGzGjWvY2LDXC8vo) objPrevious;
        this.f2546zZKhbgvUfsK4AEX3r0 = pbvgzgjwvy2ldxc8vo;
        if (pbvgzgjwvy2ldxc8vo != null) {
            pbvgzgjwvy2ldxc8vo.KYHag8HRDlnO3X9zmZ(s3fjydxwouexjjvgya);
        }
    }

    public final void hoXrIDAFrSwfShk8da(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f2541KYHag8HRDlnO3X9zmZ;
        OnBackInvokedCallback onBackInvokedCallback = this.f2543husNiw3snxdgZPAGJm;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.f2542TCyPEKSzIyweCN5yp1) {
            KYHag8HRDlnO3X9zmZ.f2550lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f2542TCyPEKSzIyweCN5yp1 = true;
        } else {
            if (z || !this.f2542TCyPEKSzIyweCN5yp1) {
                return;
            }
            KYHag8HRDlnO3X9zmZ.f2550lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2542TCyPEKSzIyweCN5yp1 = false;
        }
    }

    public final void pbVGzGjWvY2LDXC8vo() {
        Object objPrevious;
        F8je6vTkTMHm5WbjEC.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f2539HJFh0TGMpafqLE9haL;
        ListIterator<E> listIterator = zzkhbgvufsk4aex3r0.listIterator(zzkhbgvufsk4aex3r0.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((androidx.activity.pbVGzGjWvY2LDXC8vo) objPrevious).TCyPEKSzIyweCN5yp1()) {
                    break;
                }
            }
        }
        androidx.activity.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = (androidx.activity.pbVGzGjWvY2LDXC8vo) objPrevious;
        this.f2546zZKhbgvUfsK4AEX3r0 = null;
        if (pbvgzgjwvy2ldxc8vo != null) {
            pbvgzgjwvy2ldxc8vo.HJFh0TGMpafqLE9haL();
        }
    }

    public OnBackPressedDispatcher(Runnable runnable, tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f2544lEeR5KfoEr4xU5yHH7 = runnable;
        this.f2545s3fjYDxWOUexjjVgyA = leer5kfoer4xu5yhh7;
        this.f2539HJFh0TGMpafqLE9haL = new F8je6vTkTMHm5WbjEC.zZKhbgvUfsK4AEX3r0();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f2543husNiw3snxdgZPAGJm = i >= 34 ? TCyPEKSzIyweCN5yp1.f2555lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(new lEeR5KfoEr4xU5yHH7(), new s3fjYDxWOUexjjVgyA(), new HJFh0TGMpafqLE9haL(), new zZKhbgvUfsK4AEX3r0()) : KYHag8HRDlnO3X9zmZ.f2550lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(new husNiw3snxdgZPAGJm());
        }
    }
}
