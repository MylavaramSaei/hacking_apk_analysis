package com.google.android.material.behavior;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import OqIo5QF00RDxUQb4qq.THTDvPxsHqMeGb512f;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.s3fjYDxWOUexjjVgyA {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public boolean f4807HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public boolean f4811husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL f4812lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f4814s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public float f4815zZKhbgvUfsK4AEX3r0 = 0.0f;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f4809KYHag8HRDlnO3X9zmZ = 2;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public float f4810TCyPEKSzIyweCN5yp1 = 0.5f;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public float f4808IPyIQcaNa8aB7drBED = 0.0f;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public float f4813pbVGzGjWvY2LDXC8vo = 0.5f;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL f4806Acstmh57AKoSEkEFNJ = new lEeR5KfoEr4xU5yHH7();

    public class HJFh0TGMpafqLE9haL implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final View f4817lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final boolean f4818s3fjYDxWOUexjjVgyA;

        public HJFh0TGMpafqLE9haL(View view, boolean z) {
            this.f4817lEeR5KfoEr4xU5yHH7 = view;
            this.f4818s3fjYDxWOUexjjVgyA = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = SwipeDismissBehavior.this.f4812lEeR5KfoEr4xU5yHH7;
            if (hJFh0TGMpafqLE9haL != null && hJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(true)) {
                lLKzvdU99Iw80uVD5I.ZJNyOIPL0usMs2xSAn(this.f4817lEeR5KfoEr4xU5yHH7, this);
            } else if (this.f4818s3fjYDxWOUexjjVgyA) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    public class lEeR5KfoEr4xU5yHH7 extends HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f4820lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f4821s3fjYDxWOUexjjVgyA = -1;

        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public void Acstmh57AKoSEkEFNJ(int i) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public boolean T9PhQIpGRhE4yZDm1C(View view, int i) {
            int i2 = this.f4821s3fjYDxWOUexjjVgyA;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.tXWeW0sqVddf7ZBflq(view);
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public void Z9WdNiOsPR0y54zHW4(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f4808IPyIQcaNa8aB7drBED;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f4813pbVGzGjWvY2LDXC8vo;
            float fAbs = Math.abs(i - this.f4820lEeR5KfoEr4xU5yHH7);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.W3RZ2dTDKrKpS5Mxdk(0.0f, 1.0f - SwipeDismissBehavior.DfpieXfdYs58yZAiXY(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void e54J8UWNHWALQNixXM(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f4821s3fjYDxWOUexjjVgyA = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.hoXrIDAFrSwfShk8da(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.f4820lEeR5KfoEr4xU5yHH7
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.f4820lEeR5KfoEr4xU5yHH7
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.f4820lEeR5KfoEr4xU5yHH7
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL r5 = r5.f4812lEeR5KfoEr4xU5yHH7
                int r1 = r3.getTop()
                boolean r5 = r5.tXWeW0sqVddf7ZBflq(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$HJFh0TGMpafqLE9haL r5 = new com.google.android.material.behavior.SwipeDismissBehavior$HJFh0TGMpafqLE9haL
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.ZJNyOIPL0usMs2xSAn(r3, r5)
                goto L46
            L3f:
                if (r4 == 0) goto L46
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r3.getClass()
            L46:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(android.view.View, float, float):void");
        }

        public final boolean hoXrIDAFrSwfShk8da(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.f4820lEeR5KfoEr4xU5yHH7) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f4810TCyPEKSzIyweCN5yp1);
            }
            boolean z = lLKzvdU99Iw80uVD5I.A49QRPHynYLCBN0SqP(view) == 1;
            int i = SwipeDismissBehavior.this.f4809KYHag8HRDlnO3X9zmZ;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            if (z) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (f >= 0.0f) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int lEeR5KfoEr4xU5yHH7(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.A49QRPHynYLCBN0SqP(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = r0
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f4809KYHag8HRDlnO3X9zmZ
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f4820lEeR5KfoEr4xU5yHH7
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f4820lEeR5KfoEr4xU5yHH7
                goto L37
            L1c:
                int r5 = r2.f4820lEeR5KfoEr4xU5yHH7
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f4820lEeR5KfoEr4xU5yHH7
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f4820lEeR5KfoEr4xU5yHH7
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.OqIo5QF00RDxUQb4qq(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(android.view.View, int, int):int");
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public void pbVGzGjWvY2LDXC8vo(View view, int i) {
            this.f4821s3fjYDxWOUexjjVgyA = i;
            this.f4820lEeR5KfoEr4xU5yHH7 = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f4807HJFh0TGMpafqLE9haL = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f4807HJFh0TGMpafqLE9haL = false;
            }
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public int s3fjYDxWOUexjjVgyA(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public int zZKhbgvUfsK4AEX3r0(View view) {
            return view.getWidth();
        }
    }

    public class s3fjYDxWOUexjjVgyA implements THTDvPxsHqMeGb512f {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // OqIo5QF00RDxUQb4qq.THTDvPxsHqMeGb512f
        public boolean lEeR5KfoEr4xU5yHH7(View view, THTDvPxsHqMeGb512f.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            if (!SwipeDismissBehavior.this.tXWeW0sqVddf7ZBflq(view)) {
                return false;
            }
            boolean z = lLKzvdU99Iw80uVD5I.A49QRPHynYLCBN0SqP(view) == 1;
            int i = SwipeDismissBehavior.this.f4809KYHag8HRDlnO3X9zmZ;
            lLKzvdU99Iw80uVD5I.oocVJL811qFf0j0XXZ(view, (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    public static float DfpieXfdYs58yZAiXY(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public static int OqIo5QF00RDxUQb4qq(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static float W3RZ2dTDKrKpS5Mxdk(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public final void GyWRxpdt1T8mEJXPoD(ViewGroup viewGroup) {
        if (this.f4812lEeR5KfoEr4xU5yHH7 == null) {
            this.f4812lEeR5KfoEr4xU5yHH7 = this.f4811husNiw3snxdgZPAGJm ? lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM(viewGroup, this.f4815zZKhbgvUfsK4AEX3r0, this.f4806Acstmh57AKoSEkEFNJ) : lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C(viewGroup, this.f4806Acstmh57AKoSEkEFNJ);
        }
    }

    public void KqgKJKIWne3kz1AdHk(float f) {
        this.f4808IPyIQcaNa8aB7drBED = W3RZ2dTDKrKpS5Mxdk(0.0f, f, 1.0f);
    }

    public void PPkm9uUfOJHHYveeLT(int i) {
        this.f4809KYHag8HRDlnO3X9zmZ = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean Z9WdNiOsPR0y54zHW4(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zWWC27LAMFqFFBzfbNw = this.f4814s3fjYDxWOUexjjVgyA;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zWWC27LAMFqFFBzfbNw = coordinatorLayout.WWC27LAMFqFFBzfbNw(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f4814s3fjYDxWOUexjjVgyA = zWWC27LAMFqFFBzfbNw;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4814s3fjYDxWOUexjjVgyA = false;
        }
        if (!zWWC27LAMFqFFBzfbNw) {
            return false;
        }
        GyWRxpdt1T8mEJXPoD(coordinatorLayout);
        return !this.f4807HJFh0TGMpafqLE9haL && this.f4812lEeR5KfoEr4xU5yHH7.W3RZ2dTDKrKpS5Mxdk(motionEvent);
    }

    public final void aAp6BD79BhftLCnuvf(View view) {
        lLKzvdU99Iw80uVD5I.k0CbjZvfUz23r8IN6W(view, 1048576);
        if (tXWeW0sqVddf7ZBflq(view)) {
            lLKzvdU99Iw80uVD5I.Pum9NZyDBKoCnecvlx(view, A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1218VItLRw50eXTZeEfGl0, null, new s3fjYDxWOUexjjVgyA());
        }
    }

    public void e2F9F6h8YJxTHwLCa0(float f) {
        this.f4813pbVGzGjWvY2LDXC8vo = W3RZ2dTDKrKpS5Mxdk(0.0f, f, 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean e54J8UWNHWALQNixXM(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean zE54J8UWNHWALQNixXM = super.e54J8UWNHWALQNixXM(coordinatorLayout, view, i);
        if (lLKzvdU99Iw80uVD5I.xHA29AmDt6y96AnB3t(view) == 0) {
            lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(view, 1);
            aAp6BD79BhftLCnuvf(view);
        }
        return zE54J8UWNHWALQNixXM;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean jCtUeU2YI1poCxWcjm(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f4812lEeR5KfoEr4xU5yHH7 == null) {
            return false;
        }
        if (this.f4807HJFh0TGMpafqLE9haL && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f4812lEeR5KfoEr4xU5yHH7.WWC27LAMFqFFBzfbNw(motionEvent);
        return true;
    }

    public boolean tXWeW0sqVddf7ZBflq(View view) {
        return true;
    }
}
