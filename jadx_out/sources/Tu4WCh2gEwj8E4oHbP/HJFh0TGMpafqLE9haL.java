package Tu4WCh2gEwj8E4oHbP;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* loaded from: classes.dex */
public class HJFh0TGMpafqLE9haL extends e54J8UWNHWALQNixXM {

    /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
    public static final String[] f1640PPkm9uUfOJHHYveeLT = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: aAp6BD79BhftLCnuvf, reason: collision with root package name */
    public static final Property f1644aAp6BD79BhftLCnuvf = new s3fjYDxWOUexjjVgyA(PointF.class, "boundsOrigin");

    /* renamed from: lLKzvdU99Iw80uVD5I, reason: collision with root package name */
    public static final Property f1645lLKzvdU99Iw80uVD5I = new C0018HJFh0TGMpafqLE9haL(PointF.class, "topLeft");

    /* renamed from: ToH8yzk8U1nKT0PUfY, reason: collision with root package name */
    public static final Property f1641ToH8yzk8U1nKT0PUfY = new zZKhbgvUfsK4AEX3r0(PointF.class, "bottomRight");

    /* renamed from: XdzLv4NdAtTYoEzVzB, reason: collision with root package name */
    public static final Property f1642XdzLv4NdAtTYoEzVzB = new husNiw3snxdgZPAGJm(PointF.class, "bottomRight");

    /* renamed from: LU0fFDMACqnfIfA1AZ, reason: collision with root package name */
    public static final Property f1639LU0fFDMACqnfIfA1AZ = new KYHag8HRDlnO3X9zmZ(PointF.class, "topLeft");

    /* renamed from: zcy2NNbtVXgoGQbfuq, reason: collision with root package name */
    public static final Property f1646zcy2NNbtVXgoGQbfuq = new TCyPEKSzIyweCN5yp1(PointF.class, "position");

    /* renamed from: YlLW4G6OV9TFyuw5ix, reason: collision with root package name */
    public static Tu4WCh2gEwj8E4oHbP.Acstmh57AKoSEkEFNJ f1643YlLW4G6OV9TFyuw5ix = new Tu4WCh2gEwj8E4oHbP.Acstmh57AKoSEkEFNJ();

    /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
    public int[] f1647DfpieXfdYs58yZAiXY = new int[2];

    /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
    public boolean f1649e2F9F6h8YJxTHwLCa0 = false;

    /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
    public boolean f1648KqgKJKIWne3kz1AdHk = false;

    public class Acstmh57AKoSEkEFNJ extends T9PhQIpGRhE4yZDm1C {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f1651lEeR5KfoEr4xU5yHH7 = false;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f1652s3fjYDxWOUexjjVgyA;

        public Acstmh57AKoSEkEFNJ(ViewGroup viewGroup) {
            this.f1652s3fjYDxWOUexjjVgyA = viewGroup;
        }

        @Override // Tu4WCh2gEwj8E4oHbP.T9PhQIpGRhE4yZDm1C, Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM.KYHag8HRDlnO3X9zmZ
        public void HJFh0TGMpafqLE9haL(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
            A49QRPHynYLCBN0SqP.HJFh0TGMpafqLE9haL(this.f1652s3fjYDxWOUexjjVgyA, false);
        }

        @Override // Tu4WCh2gEwj8E4oHbP.T9PhQIpGRhE4yZDm1C, Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM.KYHag8HRDlnO3X9zmZ
        public void husNiw3snxdgZPAGJm(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
            A49QRPHynYLCBN0SqP.HJFh0TGMpafqLE9haL(this.f1652s3fjYDxWOUexjjVgyA, false);
            this.f1651lEeR5KfoEr4xU5yHH7 = true;
        }

        @Override // Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM.KYHag8HRDlnO3X9zmZ
        public void lEeR5KfoEr4xU5yHH7(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
            if (!this.f1651lEeR5KfoEr4xU5yHH7) {
                A49QRPHynYLCBN0SqP.HJFh0TGMpafqLE9haL(this.f1652s3fjYDxWOUexjjVgyA, false);
            }
            e54j8uwnhwalqnixxm.ToH8yzk8U1nKT0PUfY(this);
        }

        @Override // Tu4WCh2gEwj8E4oHbP.T9PhQIpGRhE4yZDm1C, Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM.KYHag8HRDlnO3X9zmZ
        public void s3fjYDxWOUexjjVgyA(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
            A49QRPHynYLCBN0SqP.HJFh0TGMpafqLE9haL(this.f1652s3fjYDxWOUexjjVgyA, true);
        }
    }

    /* renamed from: Tu4WCh2gEwj8E4oHbP.HJFh0TGMpafqLE9haL$HJFh0TGMpafqLE9haL, reason: collision with other inner class name */
    public static class C0018HJFh0TGMpafqLE9haL extends Property {
        public C0018HJFh0TGMpafqLE9haL(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public PointF get(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public void set(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, PointF pointF) {
            z9WdNiOsPR0y54zHW4.HJFh0TGMpafqLE9haL(pointF);
        }
    }

    public class IPyIQcaNa8aB7drBED extends AnimatorListenerAdapter {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ Z9WdNiOsPR0y54zHW4 f1653lEeR5KfoEr4xU5yHH7;
        private Z9WdNiOsPR0y54zHW4 mViewBounds;

        public IPyIQcaNa8aB7drBED(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
            this.f1653lEeR5KfoEr4xU5yHH7 = z9WdNiOsPR0y54zHW4;
            this.mViewBounds = z9WdNiOsPR0y54zHW4;
        }
    }

    public static class KYHag8HRDlnO3X9zmZ extends Property {
        public KYHag8HRDlnO3X9zmZ(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            THTDvPxsHqMeGb512f.KYHag8HRDlnO3X9zmZ(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public static class TCyPEKSzIyweCN5yp1 extends Property {
        public TCyPEKSzIyweCN5yp1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            THTDvPxsHqMeGb512f.KYHag8HRDlnO3X9zmZ(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    public static class Z9WdNiOsPR0y54zHW4 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f1655HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int f1656KYHag8HRDlnO3X9zmZ;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public int f1657TCyPEKSzIyweCN5yp1;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public View f1658husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f1659lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f1660s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f1661zZKhbgvUfsK4AEX3r0;

        public Z9WdNiOsPR0y54zHW4(View view) {
            this.f1658husNiw3snxdgZPAGJm = view;
        }

        public void HJFh0TGMpafqLE9haL(PointF pointF) {
            this.f1659lEeR5KfoEr4xU5yHH7 = Math.round(pointF.x);
            this.f1660s3fjYDxWOUexjjVgyA = Math.round(pointF.y);
            int i = this.f1656KYHag8HRDlnO3X9zmZ + 1;
            this.f1656KYHag8HRDlnO3X9zmZ = i;
            if (i == this.f1657TCyPEKSzIyweCN5yp1) {
                s3fjYDxWOUexjjVgyA();
            }
        }

        public void lEeR5KfoEr4xU5yHH7(PointF pointF) {
            this.f1655HJFh0TGMpafqLE9haL = Math.round(pointF.x);
            this.f1661zZKhbgvUfsK4AEX3r0 = Math.round(pointF.y);
            int i = this.f1657TCyPEKSzIyweCN5yp1 + 1;
            this.f1657TCyPEKSzIyweCN5yp1 = i;
            if (this.f1656KYHag8HRDlnO3X9zmZ == i) {
                s3fjYDxWOUexjjVgyA();
            }
        }

        public final void s3fjYDxWOUexjjVgyA() {
            THTDvPxsHqMeGb512f.KYHag8HRDlnO3X9zmZ(this.f1658husNiw3snxdgZPAGJm, this.f1659lEeR5KfoEr4xU5yHH7, this.f1660s3fjYDxWOUexjjVgyA, this.f1655HJFh0TGMpafqLE9haL, this.f1661zZKhbgvUfsK4AEX3r0);
            this.f1656KYHag8HRDlnO3X9zmZ = 0;
            this.f1657TCyPEKSzIyweCN5yp1 = 0;
        }
    }

    public static class husNiw3snxdgZPAGJm extends Property {
        public husNiw3snxdgZPAGJm(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            THTDvPxsHqMeGb512f.KYHag8HRDlnO3X9zmZ(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public class lEeR5KfoEr4xU5yHH7 extends AnimatorListenerAdapter {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ View f1662HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f1664lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f1665s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final /* synthetic */ float f1666zZKhbgvUfsK4AEX3r0;

        public lEeR5KfoEr4xU5yHH7(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f1664lEeR5KfoEr4xU5yHH7 = viewGroup;
            this.f1665s3fjYDxWOUexjjVgyA = bitmapDrawable;
            this.f1662HJFh0TGMpafqLE9haL = view;
            this.f1666zZKhbgvUfsK4AEX3r0 = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA(this.f1664lEeR5KfoEr4xU5yHH7).zZKhbgvUfsK4AEX3r0(this.f1665s3fjYDxWOUexjjVgyA);
            THTDvPxsHqMeGb512f.TCyPEKSzIyweCN5yp1(this.f1662HJFh0TGMpafqLE9haL, this.f1666zZKhbgvUfsK4AEX3r0);
        }
    }

    public class pbVGzGjWvY2LDXC8vo extends AnimatorListenerAdapter {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ Rect f1667HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public final /* synthetic */ int f1669KYHag8HRDlnO3X9zmZ;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public final /* synthetic */ int f1670TCyPEKSzIyweCN5yp1;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final /* synthetic */ int f1671husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f1672lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ View f1673s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final /* synthetic */ int f1674zZKhbgvUfsK4AEX3r0;

        public pbVGzGjWvY2LDXC8vo(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f1673s3fjYDxWOUexjjVgyA = view;
            this.f1667HJFh0TGMpafqLE9haL = rect;
            this.f1674zZKhbgvUfsK4AEX3r0 = i;
            this.f1671husNiw3snxdgZPAGJm = i2;
            this.f1669KYHag8HRDlnO3X9zmZ = i3;
            this.f1670TCyPEKSzIyweCN5yp1 = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1672lEeR5KfoEr4xU5yHH7 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1672lEeR5KfoEr4xU5yHH7) {
                return;
            }
            W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.fLSSbwbzFBVpwBH5FM(this.f1673s3fjYDxWOUexjjVgyA, this.f1667HJFh0TGMpafqLE9haL);
            THTDvPxsHqMeGb512f.KYHag8HRDlnO3X9zmZ(this.f1673s3fjYDxWOUexjjVgyA, this.f1674zZKhbgvUfsK4AEX3r0, this.f1671husNiw3snxdgZPAGJm, this.f1669KYHag8HRDlnO3X9zmZ, this.f1670TCyPEKSzIyweCN5yp1);
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends Property {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public Rect f1675lEeR5KfoEr4xU5yHH7;

        public s3fjYDxWOUexjjVgyA(Class cls, String str) {
            super(cls, str);
            this.f1675lEeR5KfoEr4xU5yHH7 = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f1675lEeR5KfoEr4xU5yHH7);
            Rect rect = this.f1675lEeR5KfoEr4xU5yHH7;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f1675lEeR5KfoEr4xU5yHH7);
            this.f1675lEeR5KfoEr4xU5yHH7.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f1675lEeR5KfoEr4xU5yHH7);
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 extends Property {
        public zZKhbgvUfsK4AEX3r0(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public PointF get(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public void set(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, PointF pointF) {
            z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(pointF);
        }
    }

    @Override // Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM
    public void Acstmh57AKoSEkEFNJ(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
        ZJNyOIPL0usMs2xSAn(y43RdunnpKgpbny0lE);
    }

    @Override // Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM
    public void TCyPEKSzIyweCN5yp1(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
        ZJNyOIPL0usMs2xSAn(y43RdunnpKgpbny0lE);
    }

    public final boolean Tu4WCh2gEwj8E4oHbP(View view, View view2) {
        if (!this.f1648KqgKJKIWne3kz1AdHk) {
            return true;
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lER9SAhYMerGybF9OAjL = R9SAhYMerGybF9OAjL(view, true);
        if (y43RdunnpKgpbny0lER9SAhYMerGybF9OAjL == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == y43RdunnpKgpbny0lER9SAhYMerGybF9OAjL.f1698s3fjYDxWOUexjjVgyA) {
            return true;
        }
        return false;
    }

    public final void ZJNyOIPL0usMs2xSAn(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
        View view = y43RdunnpKgpbny0lE.f1698s3fjYDxWOUexjjVgyA;
        if (!W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.lLKzvdU99Iw80uVD5I(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.put("android:changeBounds:parent", y43RdunnpKgpbny0lE.f1698s3fjYDxWOUexjjVgyA.getParent());
        if (this.f1648KqgKJKIWne3kz1AdHk) {
            y43RdunnpKgpbny0lE.f1698s3fjYDxWOUexjjVgyA.getLocationInWindow(this.f1647DfpieXfdYs58yZAiXY);
            y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.put("android:changeBounds:windowX", Integer.valueOf(this.f1647DfpieXfdYs58yZAiXY[0]));
            y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.put("android:changeBounds:windowY", Integer.valueOf(this.f1647DfpieXfdYs58yZAiXY[1]));
        }
        if (this.f1649e2F9F6h8YJxTHwLCa0) {
            y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.put("android:changeBounds:clip", W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.zaq8hOURtfwbcX17cG(view));
        }
    }

    @Override // Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM
    public Animator hoXrIDAFrSwfShk8da(ViewGroup viewGroup, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE2) {
        int i;
        View view;
        int i2;
        ObjectAnimator objectAnimator;
        Animator animatorHJFh0TGMpafqLE9haL;
        Path pathLEeR5KfoEr4xU5yHH7;
        Property property;
        if (y43RdunnpKgpbny0lE == null || y43RdunnpKgpbny0lE2 == null) {
            return null;
        }
        Map map = y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7;
        Map map2 = y43RdunnpKgpbny0lE2.f1697lEeR5KfoEr4xU5yHH7;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = y43RdunnpKgpbny0lE2.f1698s3fjYDxWOUexjjVgyA;
        if (!Tu4WCh2gEwj8E4oHbP(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) y43RdunnpKgpbny0lE2.f1697lEeR5KfoEr4xU5yHH7.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) y43RdunnpKgpbny0lE2.f1697lEeR5KfoEr4xU5yHH7.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f1647DfpieXfdYs58yZAiXY);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fHJFh0TGMpafqLE9haL = THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL(view2);
            THTDvPxsHqMeGb512f.TCyPEKSzIyweCN5yp1(view2, 0.0f);
            THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA(viewGroup).s3fjYDxWOUexjjVgyA(bitmapDrawable);
            Tu4WCh2gEwj8E4oHbP.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1XHA29AmDt6y96AnB3t = xHA29AmDt6y96AnB3t();
            int[] iArr = this.f1647DfpieXfdYs58yZAiXY;
            int i3 = iArr[0];
            int i4 = iArr[1];
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, Tu4WCh2gEwj8E4oHbP.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(f1644aAp6BD79BhftLCnuvf, tCyPEKSzIyweCN5yp1XHA29AmDt6y96AnB3t.lEeR5KfoEr4xU5yHH7(iIntValue - i3, iIntValue2 - i4, iIntValue3 - i3, iIntValue4 - i4)));
            objectAnimatorOfPropertyValuesHolder.addListener(new lEeR5KfoEr4xU5yHH7(viewGroup, bitmapDrawable, view2, fHJFh0TGMpafqLE9haL));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect = (Rect) y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) y43RdunnpKgpbny0lE2.f1697lEeR5KfoEr4xU5yHH7.get("android:changeBounds:bounds");
        int i5 = rect.left;
        int i6 = rect2.left;
        int i7 = rect.top;
        int i8 = rect2.top;
        int i9 = rect.right;
        int i10 = rect2.right;
        int i11 = rect.bottom;
        int i12 = rect2.bottom;
        int i13 = i9 - i5;
        int i14 = i11 - i7;
        int i15 = i10 - i6;
        int i16 = i12 - i8;
        Rect rect3 = (Rect) y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.get("android:changeBounds:clip");
        Rect rect4 = (Rect) y43RdunnpKgpbny0lE2.f1697lEeR5KfoEr4xU5yHH7.get("android:changeBounds:clip");
        if ((i13 == 0 || i14 == 0) && (i15 == 0 || i16 == 0)) {
            i = 0;
        } else {
            i = (i5 == i6 && i7 == i8) ? 0 : 1;
            if (i9 != i10 || i11 != i12) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        if (this.f1649e2F9F6h8YJxTHwLCa0) {
            view = view2;
            THTDvPxsHqMeGb512f.KYHag8HRDlnO3X9zmZ(view, i5, i7, Math.max(i13, i15) + i5, Math.max(i14, i16) + i7);
            ObjectAnimator objectAnimatorLEeR5KfoEr4xU5yHH7 = (i5 == i6 && i7 == i8) ? null : Tu4WCh2gEwj8E4oHbP.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(view, f1646zcy2NNbtVXgoGQbfuq, xHA29AmDt6y96AnB3t().lEeR5KfoEr4xU5yHH7(i5, i7, i6, i8));
            if (rect3 == null) {
                i2 = 0;
                rect3 = new Rect(0, 0, i13, i14);
            } else {
                i2 = 0;
            }
            Rect rect5 = rect4 == null ? new Rect(i2, i2, i15, i16) : rect4;
            if (rect3.equals(rect5)) {
                objectAnimator = null;
            } else {
                W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.fLSSbwbzFBVpwBH5FM(view, rect3);
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f1643YlLW4G6OV9TFyuw5ix, rect3, rect5);
                objectAnimatorOfObject.addListener(new pbVGzGjWvY2LDXC8vo(view, rect4, i6, i8, i10, i12));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorHJFh0TGMpafqLE9haL = sTkWmhpZ5b1ArQIw4K.HJFh0TGMpafqLE9haL(objectAnimatorLEeR5KfoEr4xU5yHH7, objectAnimator);
        } else {
            view = view2;
            THTDvPxsHqMeGb512f.KYHag8HRDlnO3X9zmZ(view, i5, i7, i9, i11);
            if (i == 2) {
                if (i13 == i15 && i14 == i16) {
                    pathLEeR5KfoEr4xU5yHH7 = xHA29AmDt6y96AnB3t().lEeR5KfoEr4xU5yHH7(i5, i7, i6, i8);
                    property = f1646zcy2NNbtVXgoGQbfuq;
                } else {
                    Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4 = new Z9WdNiOsPR0y54zHW4(view);
                    ObjectAnimator objectAnimatorLEeR5KfoEr4xU5yHH72 = Tu4WCh2gEwj8E4oHbP.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(z9WdNiOsPR0y54zHW4, f1645lLKzvdU99Iw80uVD5I, xHA29AmDt6y96AnB3t().lEeR5KfoEr4xU5yHH7(i5, i7, i6, i8));
                    ObjectAnimator objectAnimatorLEeR5KfoEr4xU5yHH73 = Tu4WCh2gEwj8E4oHbP.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(z9WdNiOsPR0y54zHW4, f1641ToH8yzk8U1nKT0PUfY, xHA29AmDt6y96AnB3t().lEeR5KfoEr4xU5yHH7(i9, i11, i10, i12));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorLEeR5KfoEr4xU5yHH72, objectAnimatorLEeR5KfoEr4xU5yHH73);
                    animatorSet.addListener(new IPyIQcaNa8aB7drBED(z9WdNiOsPR0y54zHW4));
                    animatorHJFh0TGMpafqLE9haL = animatorSet;
                }
            } else if (i5 == i6 && i7 == i8) {
                pathLEeR5KfoEr4xU5yHH7 = xHA29AmDt6y96AnB3t().lEeR5KfoEr4xU5yHH7(i9, i11, i10, i12);
                property = f1642XdzLv4NdAtTYoEzVzB;
            } else {
                pathLEeR5KfoEr4xU5yHH7 = xHA29AmDt6y96AnB3t().lEeR5KfoEr4xU5yHH7(i5, i7, i6, i8);
                property = f1639LU0fFDMACqnfIfA1AZ;
            }
            animatorHJFh0TGMpafqLE9haL = Tu4WCh2gEwj8E4oHbP.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(view, property, pathLEeR5KfoEr4xU5yHH7);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            A49QRPHynYLCBN0SqP.HJFh0TGMpafqLE9haL(viewGroup4, true);
            lEeR5KfoEr4xU5yHH7(new Acstmh57AKoSEkEFNJ(viewGroup4));
        }
        return animatorHJFh0TGMpafqLE9haL;
    }

    @Override // Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM
    public String[] jCtUeU2YI1poCxWcjm() {
        return f1640PPkm9uUfOJHHYveeLT;
    }
}
