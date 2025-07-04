package W3RZ2dTDKrKpS5Mxdk;

import W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cT5Hs3CQpLK8NvlZAw {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f1858lEeR5KfoEr4xU5yHH7;

    public static class HJFh0TGMpafqLE9haL extends husNiw3snxdgZPAGJm {

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public static final Interpolator f1861husNiw3snxdgZPAGJm = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public static final Interpolator f1859KYHag8HRDlnO3X9zmZ = new YlLW4G6OV9TFyuw5ix.lEeR5KfoEr4xU5yHH7();

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public static final Interpolator f1860TCyPEKSzIyweCN5yp1 = new DecelerateInterpolator();

        public static class lEeR5KfoEr4xU5yHH7 implements View.OnApplyWindowInsetsListener {

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public final s3fjYDxWOUexjjVgyA f1862lEeR5KfoEr4xU5yHH7;

            /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
            public zXY7dgnTfw9Pd9RXel f1863s3fjYDxWOUexjjVgyA;

            /* renamed from: W3RZ2dTDKrKpS5Mxdk.cT5Hs3CQpLK8NvlZAw$HJFh0TGMpafqLE9haL$lEeR5KfoEr4xU5yHH7$HJFh0TGMpafqLE9haL, reason: collision with other inner class name */
            public class RunnableC0020HJFh0TGMpafqLE9haL implements Runnable {

                /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
                public final /* synthetic */ lEeR5KfoEr4xU5yHH7 f1864HJFh0TGMpafqLE9haL;

                /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
                public final /* synthetic */ View f1866lEeR5KfoEr4xU5yHH7;

                /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
                public final /* synthetic */ cT5Hs3CQpLK8NvlZAw f1867s3fjYDxWOUexjjVgyA;

                /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f1868zZKhbgvUfsK4AEX3r0;

                public RunnableC0020HJFh0TGMpafqLE9haL(View view, cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, ValueAnimator valueAnimator) {
                    this.f1866lEeR5KfoEr4xU5yHH7 = view;
                    this.f1867s3fjYDxWOUexjjVgyA = ct5hs3cqplk8nvlzaw;
                    this.f1864HJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh7;
                    this.f1868zZKhbgvUfsK4AEX3r0 = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    HJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM(this.f1866lEeR5KfoEr4xU5yHH7, this.f1867s3fjYDxWOUexjjVgyA, this.f1864HJFh0TGMpafqLE9haL);
                    this.f1868zZKhbgvUfsK4AEX3r0.start();
                }
            }

            /* renamed from: W3RZ2dTDKrKpS5Mxdk.cT5Hs3CQpLK8NvlZAw$HJFh0TGMpafqLE9haL$lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
            public class C0021lEeR5KfoEr4xU5yHH7 implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
                public final /* synthetic */ zXY7dgnTfw9Pd9RXel f1869HJFh0TGMpafqLE9haL;

                /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
                public final /* synthetic */ View f1871husNiw3snxdgZPAGJm;

                /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
                public final /* synthetic */ cT5Hs3CQpLK8NvlZAw f1872lEeR5KfoEr4xU5yHH7;

                /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
                public final /* synthetic */ zXY7dgnTfw9Pd9RXel f1873s3fjYDxWOUexjjVgyA;

                /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
                public final /* synthetic */ int f1874zZKhbgvUfsK4AEX3r0;

                public C0021lEeR5KfoEr4xU5yHH7(cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw, zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel, zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel2, int i, View view) {
                    this.f1872lEeR5KfoEr4xU5yHH7 = ct5hs3cqplk8nvlzaw;
                    this.f1873s3fjYDxWOUexjjVgyA = zxy7dgntfw9pd9rxel;
                    this.f1869HJFh0TGMpafqLE9haL = zxy7dgntfw9pd9rxel2;
                    this.f1874zZKhbgvUfsK4AEX3r0 = i;
                    this.f1871husNiw3snxdgZPAGJm = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f1872lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(valueAnimator.getAnimatedFraction());
                    HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(this.f1871husNiw3snxdgZPAGJm, HJFh0TGMpafqLE9haL.aPyGSIylzVNKPT1Bls(this.f1873s3fjYDxWOUexjjVgyA, this.f1869HJFh0TGMpafqLE9haL, this.f1872lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(), this.f1874zZKhbgvUfsK4AEX3r0), Collections.singletonList(this.f1872lEeR5KfoEr4xU5yHH7));
                }
            }

            public class s3fjYDxWOUexjjVgyA extends AnimatorListenerAdapter {

                /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
                public final /* synthetic */ cT5Hs3CQpLK8NvlZAw f1876lEeR5KfoEr4xU5yHH7;

                /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
                public final /* synthetic */ View f1877s3fjYDxWOUexjjVgyA;

                public s3fjYDxWOUexjjVgyA(cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw, View view) {
                    this.f1876lEeR5KfoEr4xU5yHH7 = ct5hs3cqplk8nvlzaw;
                    this.f1877s3fjYDxWOUexjjVgyA = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f1876lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(1.0f);
                    HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(this.f1877s3fjYDxWOUexjjVgyA, this.f1876lEeR5KfoEr4xU5yHH7);
                }
            }

            public lEeR5KfoEr4xU5yHH7(View view, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
                this.f1862lEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya;
                zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxelJCtUeU2YI1poCxWcjm = lLKzvdU99Iw80uVD5I.jCtUeU2YI1poCxWcjm(view);
                this.f1863s3fjYDxWOUexjjVgyA = zxy7dgntfw9pd9rxelJCtUeU2YI1poCxWcjm != null ? new zXY7dgnTfw9Pd9RXel.s3fjYDxWOUexjjVgyA(zxy7dgntfw9pd9rxelJCtUeU2YI1poCxWcjm).lEeR5KfoEr4xU5yHH7() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int iHusNiw3snxdgZPAGJm;
                if (view.isLaidOut()) {
                    zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk = zXY7dgnTfw9Pd9RXel.G7AC3DWIx9i9fdanjk(windowInsets, view);
                    if (this.f1863s3fjYDxWOUexjjVgyA == null) {
                        this.f1863s3fjYDxWOUexjjVgyA = lLKzvdU99Iw80uVD5I.jCtUeU2YI1poCxWcjm(view);
                    }
                    if (this.f1863s3fjYDxWOUexjjVgyA != null) {
                        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da = HJFh0TGMpafqLE9haL.hoXrIDAFrSwfShk8da(view);
                        if ((s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da == null || !Objects.equals(s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da.f1884lEeR5KfoEr4xU5yHH7, windowInsets)) && (iHusNiw3snxdgZPAGJm = HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk, this.f1863s3fjYDxWOUexjjVgyA)) != 0) {
                            zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel = this.f1863s3fjYDxWOUexjjVgyA;
                            cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw = new cT5Hs3CQpLK8NvlZAw(iHusNiw3snxdgZPAGJm, HJFh0TGMpafqLE9haL.TCyPEKSzIyweCN5yp1(iHusNiw3snxdgZPAGJm, zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk, zxy7dgntfw9pd9rxel), 160L);
                            ct5hs3cqplk8nvlzaw.husNiw3snxdgZPAGJm(0.0f);
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ct5hs3cqplk8nvlzaw.lEeR5KfoEr4xU5yHH7());
                            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ = HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk, zxy7dgntfw9pd9rxel, iHusNiw3snxdgZPAGJm);
                            HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(view, ct5hs3cqplk8nvlzaw, windowInsets, false);
                            duration.addUpdateListener(new C0021lEeR5KfoEr4xU5yHH7(ct5hs3cqplk8nvlzaw, zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk, zxy7dgntfw9pd9rxel, iHusNiw3snxdgZPAGJm, view));
                            duration.addListener(new s3fjYDxWOUexjjVgyA(ct5hs3cqplk8nvlzaw, view));
                            tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7(view, new RunnableC0020HJFh0TGMpafqLE9haL(view, ct5hs3cqplk8nvlzaw, leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ, duration));
                        }
                        return HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C(view, windowInsets);
                    }
                    this.f1863s3fjYDxWOUexjjVgyA = zxy7dgntfw9pd9rxelG7AC3DWIx9i9fdanjk;
                } else {
                    this.f1863s3fjYDxWOUexjjVgyA = zXY7dgnTfw9Pd9RXel.G7AC3DWIx9i9fdanjk(windowInsets, view);
                }
                return HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C(view, windowInsets);
            }
        }

        public HJFh0TGMpafqLE9haL(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        public static void Acstmh57AKoSEkEFNJ(View view, cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw, WindowInsets windowInsets, boolean z) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(view);
            if (s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da != null) {
                s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da.f1884lEeR5KfoEr4xU5yHH7 = windowInsets;
                if (!z) {
                    s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(ct5hs3cqplk8nvlzaw);
                    z = s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    Acstmh57AKoSEkEFNJ(viewGroup.getChildAt(i), ct5hs3cqplk8nvlzaw, windowInsets, z);
                }
            }
        }

        public static View.OnApplyWindowInsetsListener IPyIQcaNa8aB7drBED(View view, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            return new lEeR5KfoEr4xU5yHH7(view, s3fjydxwouexjjvgya);
        }

        public static lEeR5KfoEr4xU5yHH7 KYHag8HRDlnO3X9zmZ(zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel, zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel2, int i) {
            VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ KYHag8HRDlnO3X9zmZ2 = zxy7dgntfw9pd9rxel.KYHag8HRDlnO3X9zmZ(i);
            VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ KYHag8HRDlnO3X9zmZ3 = zxy7dgntfw9pd9rxel2.KYHag8HRDlnO3X9zmZ(i);
            return new lEeR5KfoEr4xU5yHH7(VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(Math.min(KYHag8HRDlnO3X9zmZ2.f1804lEeR5KfoEr4xU5yHH7, KYHag8HRDlnO3X9zmZ3.f1804lEeR5KfoEr4xU5yHH7), Math.min(KYHag8HRDlnO3X9zmZ2.f1805s3fjYDxWOUexjjVgyA, KYHag8HRDlnO3X9zmZ3.f1805s3fjYDxWOUexjjVgyA), Math.min(KYHag8HRDlnO3X9zmZ2.f1803HJFh0TGMpafqLE9haL, KYHag8HRDlnO3X9zmZ3.f1803HJFh0TGMpafqLE9haL), Math.min(KYHag8HRDlnO3X9zmZ2.f1806zZKhbgvUfsK4AEX3r0, KYHag8HRDlnO3X9zmZ3.f1806zZKhbgvUfsK4AEX3r0)), VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(Math.max(KYHag8HRDlnO3X9zmZ2.f1804lEeR5KfoEr4xU5yHH7, KYHag8HRDlnO3X9zmZ3.f1804lEeR5KfoEr4xU5yHH7), Math.max(KYHag8HRDlnO3X9zmZ2.f1805s3fjYDxWOUexjjVgyA, KYHag8HRDlnO3X9zmZ3.f1805s3fjYDxWOUexjjVgyA), Math.max(KYHag8HRDlnO3X9zmZ2.f1803HJFh0TGMpafqLE9haL, KYHag8HRDlnO3X9zmZ3.f1803HJFh0TGMpafqLE9haL), Math.max(KYHag8HRDlnO3X9zmZ2.f1806zZKhbgvUfsK4AEX3r0, KYHag8HRDlnO3X9zmZ3.f1806zZKhbgvUfsK4AEX3r0)));
        }

        public static void OANkd3mP6AYvwbNLJM(View view, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            Object tag = view.getTag(G7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL.f196KqgKJKIWne3kz1AdHk);
            if (s3fjydxwouexjjvgya == null) {
                view.setTag(G7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL.f198LU0fFDMACqnfIfA1AZ, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(view, s3fjydxwouexjjvgya);
            view.setTag(G7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL.f198LU0fFDMACqnfIfA1AZ, onApplyWindowInsetsListenerIPyIQcaNa8aB7drBED);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerIPyIQcaNa8aB7drBED);
            }
        }

        public static WindowInsets T9PhQIpGRhE4yZDm1C(View view, WindowInsets windowInsets) {
            return view.getTag(G7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL.f196KqgKJKIWne3kz1AdHk) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static Interpolator TCyPEKSzIyweCN5yp1(int i, zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel, zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel2) {
            return (i & 8) != 0 ? zxy7dgntfw9pd9rxel.KYHag8HRDlnO3X9zmZ(zXY7dgnTfw9Pd9RXel.T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7()).f1806zZKhbgvUfsK4AEX3r0 > zxy7dgntfw9pd9rxel2.KYHag8HRDlnO3X9zmZ(zXY7dgnTfw9Pd9RXel.T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7()).f1806zZKhbgvUfsK4AEX3r0 ? f1861husNiw3snxdgZPAGJm : f1859KYHag8HRDlnO3X9zmZ : f1860TCyPEKSzIyweCN5yp1;
        }

        public static void Z9WdNiOsPR0y54zHW4(View view, zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel, List list) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(view);
            if (s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da != null) {
                zxy7dgntfw9pd9rxel = s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da.zZKhbgvUfsK4AEX3r0(zxy7dgntfw9pd9rxel, list);
                if (s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    Z9WdNiOsPR0y54zHW4(viewGroup.getChildAt(i), zxy7dgntfw9pd9rxel, list);
                }
            }
        }

        public static zXY7dgnTfw9Pd9RXel aPyGSIylzVNKPT1Bls(zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel, zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel2, float f, int i) {
            VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZT9PhQIpGRhE4yZDm1C;
            zXY7dgnTfw9Pd9RXel.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new zXY7dgnTfw9Pd9RXel.s3fjYDxWOUexjjVgyA(zxy7dgntfw9pd9rxel);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    kYHag8HRDlnO3X9zmZT9PhQIpGRhE4yZDm1C = zxy7dgntfw9pd9rxel.KYHag8HRDlnO3X9zmZ(i2);
                } else {
                    VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ KYHag8HRDlnO3X9zmZ2 = zxy7dgntfw9pd9rxel.KYHag8HRDlnO3X9zmZ(i2);
                    VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ KYHag8HRDlnO3X9zmZ3 = zxy7dgntfw9pd9rxel2.KYHag8HRDlnO3X9zmZ(i2);
                    float f2 = 1.0f - f;
                    kYHag8HRDlnO3X9zmZT9PhQIpGRhE4yZDm1C = zXY7dgnTfw9Pd9RXel.T9PhQIpGRhE4yZDm1C(KYHag8HRDlnO3X9zmZ2, (int) (((KYHag8HRDlnO3X9zmZ2.f1804lEeR5KfoEr4xU5yHH7 - KYHag8HRDlnO3X9zmZ3.f1804lEeR5KfoEr4xU5yHH7) * f2) + 0.5d), (int) (((KYHag8HRDlnO3X9zmZ2.f1805s3fjYDxWOUexjjVgyA - KYHag8HRDlnO3X9zmZ3.f1805s3fjYDxWOUexjjVgyA) * f2) + 0.5d), (int) (((KYHag8HRDlnO3X9zmZ2.f1803HJFh0TGMpafqLE9haL - KYHag8HRDlnO3X9zmZ3.f1803HJFh0TGMpafqLE9haL) * f2) + 0.5d), (int) (((KYHag8HRDlnO3X9zmZ2.f1806zZKhbgvUfsK4AEX3r0 - KYHag8HRDlnO3X9zmZ3.f1806zZKhbgvUfsK4AEX3r0) * f2) + 0.5d));
                }
                s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA(i2, kYHag8HRDlnO3X9zmZT9PhQIpGRhE4yZDm1C);
            }
            return s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7();
        }

        public static void e54J8UWNHWALQNixXM(View view, cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(view);
            if (s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da != null) {
                s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da.husNiw3snxdgZPAGJm(ct5hs3cqplk8nvlzaw, leer5kfoer4xu5yhh7);
                if (s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e54J8UWNHWALQNixXM(viewGroup.getChildAt(i), ct5hs3cqplk8nvlzaw, leer5kfoer4xu5yhh7);
                }
            }
        }

        public static s3fjYDxWOUexjjVgyA hoXrIDAFrSwfShk8da(View view) {
            Object tag = view.getTag(G7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL.f198LU0fFDMACqnfIfA1AZ);
            if (tag instanceof lEeR5KfoEr4xU5yHH7) {
                return ((lEeR5KfoEr4xU5yHH7) tag).f1862lEeR5KfoEr4xU5yHH7;
            }
            return null;
        }

        public static int husNiw3snxdgZPAGJm(zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel, zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!zxy7dgntfw9pd9rxel.KYHag8HRDlnO3X9zmZ(i2).equals(zxy7dgntfw9pd9rxel2.KYHag8HRDlnO3X9zmZ(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        public static void pbVGzGjWvY2LDXC8vo(View view, cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(view);
            if (s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da != null) {
                s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA(ct5hs3cqplk8nvlzaw);
                if (s3fjydxwouexjjvgyaHoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    pbVGzGjWvY2LDXC8vo(viewGroup.getChildAt(i), ct5hs3cqplk8nvlzaw);
                }
            }
        }
    }

    public static class husNiw3snxdgZPAGJm {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final Interpolator f1878HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final int f1879lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public float f1880s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final long f1881zZKhbgvUfsK4AEX3r0;

        public husNiw3snxdgZPAGJm(int i, Interpolator interpolator, long j) {
            this.f1879lEeR5KfoEr4xU5yHH7 = i;
            this.f1878HJFh0TGMpafqLE9haL = interpolator;
            this.f1881zZKhbgvUfsK4AEX3r0 = j;
        }

        public int HJFh0TGMpafqLE9haL() {
            return this.f1879lEeR5KfoEr4xU5yHH7;
        }

        public long lEeR5KfoEr4xU5yHH7() {
            return this.f1881zZKhbgvUfsK4AEX3r0;
        }

        public float s3fjYDxWOUexjjVgyA() {
            Interpolator interpolator = this.f1878HJFh0TGMpafqLE9haL;
            return interpolator != null ? interpolator.getInterpolation(this.f1880s3fjYDxWOUexjjVgyA) : this.f1880s3fjYDxWOUexjjVgyA;
        }

        public void zZKhbgvUfsK4AEX3r0(float f) {
            this.f1880s3fjYDxWOUexjjVgyA = f;
        }
    }

    public static final class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ f1882lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ f1883s3fjYDxWOUexjjVgyA;

        public lEeR5KfoEr4xU5yHH7(VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ, VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ2) {
            this.f1882lEeR5KfoEr4xU5yHH7 = kYHag8HRDlnO3X9zmZ;
            this.f1883s3fjYDxWOUexjjVgyA = kYHag8HRDlnO3X9zmZ2;
        }

        public static lEeR5KfoEr4xU5yHH7 zZKhbgvUfsK4AEX3r0(WindowInsetsAnimation.Bounds bounds) {
            return new lEeR5KfoEr4xU5yHH7(bounds);
        }

        public WindowInsetsAnimation.Bounds HJFh0TGMpafqLE9haL() {
            return zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm(this);
        }

        public VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ lEeR5KfoEr4xU5yHH7() {
            return this.f1882lEeR5KfoEr4xU5yHH7;
        }

        public VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ s3fjYDxWOUexjjVgyA() {
            return this.f1883s3fjYDxWOUexjjVgyA;
        }

        public String toString() {
            return "Bounds{lower=" + this.f1882lEeR5KfoEr4xU5yHH7 + " upper=" + this.f1883s3fjYDxWOUexjjVgyA + "}";
        }

        public lEeR5KfoEr4xU5yHH7(WindowInsetsAnimation.Bounds bounds) {
            this.f1882lEeR5KfoEr4xU5yHH7 = zZKhbgvUfsK4AEX3r0.TCyPEKSzIyweCN5yp1(bounds);
            this.f1883s3fjYDxWOUexjjVgyA = zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(bounds);
        }
    }

    public static abstract class s3fjYDxWOUexjjVgyA {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public WindowInsets f1884lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final int f1885s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(int i) {
            this.f1885s3fjYDxWOUexjjVgyA = i;
        }

        public abstract void HJFh0TGMpafqLE9haL(cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw);

        public abstract lEeR5KfoEr4xU5yHH7 husNiw3snxdgZPAGJm(cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7);

        public final int lEeR5KfoEr4xU5yHH7() {
            return this.f1885s3fjYDxWOUexjjVgyA;
        }

        public abstract void s3fjYDxWOUexjjVgyA(cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw);

        public abstract zXY7dgnTfw9Pd9RXel zZKhbgvUfsK4AEX3r0(zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel, List list);
    }

    public static class zZKhbgvUfsK4AEX3r0 extends husNiw3snxdgZPAGJm {

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final WindowInsetsAnimation f1886husNiw3snxdgZPAGJm;

        public static class lEeR5KfoEr4xU5yHH7 extends WindowInsetsAnimation$Callback {

            /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
            public ArrayList f1887HJFh0TGMpafqLE9haL;

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public final s3fjYDxWOUexjjVgyA f1888lEeR5KfoEr4xU5yHH7;

            /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
            public List f1889s3fjYDxWOUexjjVgyA;

            /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
            public final HashMap f1890zZKhbgvUfsK4AEX3r0;

            public lEeR5KfoEr4xU5yHH7(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
                super(s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7());
                this.f1890zZKhbgvUfsK4AEX3r0 = new HashMap();
                this.f1888lEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya;
            }

            public final cT5Hs3CQpLK8NvlZAw lEeR5KfoEr4xU5yHH7(WindowInsetsAnimation windowInsetsAnimation) {
                cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw = (cT5Hs3CQpLK8NvlZAw) this.f1890zZKhbgvUfsK4AEX3r0.get(windowInsetsAnimation);
                if (ct5hs3cqplk8nvlzaw != null) {
                    return ct5hs3cqplk8nvlzaw;
                }
                cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzawKYHag8HRDlnO3X9zmZ = cT5Hs3CQpLK8NvlZAw.KYHag8HRDlnO3X9zmZ(windowInsetsAnimation);
                this.f1890zZKhbgvUfsK4AEX3r0.put(windowInsetsAnimation, ct5hs3cqplk8nvlzawKYHag8HRDlnO3X9zmZ);
                return ct5hs3cqplk8nvlzawKYHag8HRDlnO3X9zmZ;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f1888lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7(windowInsetsAnimation));
                this.f1890zZKhbgvUfsK4AEX3r0.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f1888lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(lEeR5KfoEr4xU5yHH7(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f1887HJFh0TGMpafqLE9haL;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f1887HJFh0TGMpafqLE9haL = arrayList2;
                    this.f1889s3fjYDxWOUexjjVgyA = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationLEeR5KfoEr4xU5yHH7 = ctWLFN70QQINH1kyYo.lEeR5KfoEr4xU5yHH7(list.get(size));
                    cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzawLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(windowInsetsAnimationLEeR5KfoEr4xU5yHH7);
                    ct5hs3cqplk8nvlzawLEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(windowInsetsAnimationLEeR5KfoEr4xU5yHH7.getFraction());
                    this.f1887HJFh0TGMpafqLE9haL.add(ct5hs3cqplk8nvlzawLEeR5KfoEr4xU5yHH7);
                }
                return this.f1888lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(zXY7dgnTfw9Pd9RXel.R9SAhYMerGybF9OAjL(windowInsets), this.f1889s3fjYDxWOUexjjVgyA).Y43RdunnpKgpbny0lE();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f1888lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(lEeR5KfoEr4xU5yHH7(windowInsetsAnimation), lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(bounds)).HJFh0TGMpafqLE9haL();
            }
        }

        public zZKhbgvUfsK4AEX3r0(int i, Interpolator interpolator, long j) {
            this(ZJNyOIPL0usMs2xSAn.lEeR5KfoEr4xU5yHH7(i, interpolator, j));
        }

        public static void IPyIQcaNa8aB7drBED(View view, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            view.setWindowInsetsAnimationCallback(s3fjydxwouexjjvgya != null ? new lEeR5KfoEr4xU5yHH7(s3fjydxwouexjjvgya) : null);
        }

        public static VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ KYHag8HRDlnO3X9zmZ(WindowInsetsAnimation.Bounds bounds) {
            return VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0(bounds.getUpperBound());
        }

        public static VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ TCyPEKSzIyweCN5yp1(WindowInsetsAnimation.Bounds bounds) {
            return VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0(bounds.getLowerBound());
        }

        public static WindowInsetsAnimation.Bounds husNiw3snxdgZPAGJm(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            k0CbjZvfUz23r8IN6W.lEeR5KfoEr4xU5yHH7();
            return Tu4WCh2gEwj8E4oHbP.lEeR5KfoEr4xU5yHH7(leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7().husNiw3snxdgZPAGJm(), leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm());
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.cT5Hs3CQpLK8NvlZAw.husNiw3snxdgZPAGJm
        public int HJFh0TGMpafqLE9haL() {
            return this.f1886husNiw3snxdgZPAGJm.getTypeMask();
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.cT5Hs3CQpLK8NvlZAw.husNiw3snxdgZPAGJm
        public long lEeR5KfoEr4xU5yHH7() {
            return this.f1886husNiw3snxdgZPAGJm.getDurationMillis();
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.cT5Hs3CQpLK8NvlZAw.husNiw3snxdgZPAGJm
        public float s3fjYDxWOUexjjVgyA() {
            return this.f1886husNiw3snxdgZPAGJm.getInterpolatedFraction();
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.cT5Hs3CQpLK8NvlZAw.husNiw3snxdgZPAGJm
        public void zZKhbgvUfsK4AEX3r0(float f) {
            this.f1886husNiw3snxdgZPAGJm.setFraction(f);
        }

        public zZKhbgvUfsK4AEX3r0(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f1886husNiw3snxdgZPAGJm = windowInsetsAnimation;
        }
    }

    public cT5Hs3CQpLK8NvlZAw(int i, Interpolator interpolator, long j) {
        this.f1858lEeR5KfoEr4xU5yHH7 = Build.VERSION.SDK_INT >= 30 ? new zZKhbgvUfsK4AEX3r0(i, interpolator, j) : new HJFh0TGMpafqLE9haL(i, interpolator, j);
    }

    public static cT5Hs3CQpLK8NvlZAw KYHag8HRDlnO3X9zmZ(WindowInsetsAnimation windowInsetsAnimation) {
        return new cT5Hs3CQpLK8NvlZAw(windowInsetsAnimation);
    }

    public static void zZKhbgvUfsK4AEX3r0(View view, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        if (Build.VERSION.SDK_INT >= 30) {
            zZKhbgvUfsK4AEX3r0.IPyIQcaNa8aB7drBED(view, s3fjydxwouexjjvgya);
        } else {
            HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(view, s3fjydxwouexjjvgya);
        }
    }

    public int HJFh0TGMpafqLE9haL() {
        return this.f1858lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL();
    }

    public void husNiw3snxdgZPAGJm(float f) {
        this.f1858lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(f);
    }

    public long lEeR5KfoEr4xU5yHH7() {
        return this.f1858lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7();
    }

    public float s3fjYDxWOUexjjVgyA() {
        return this.f1858lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
    }

    public cT5Hs3CQpLK8NvlZAw(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1858lEeR5KfoEr4xU5yHH7 = new zZKhbgvUfsK4AEX3r0(windowInsetsAnimation);
        }
    }
}
