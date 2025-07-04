package com.google.android.material.appbar;

import EscIOBqRhG6irG5q11.s3fjYDxWOUexjjVgyA;
import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.zZKhbgvUfsK4AEX3r0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.List;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;

/* loaded from: classes.dex */
public abstract class AppBarLayout extends LinearLayout {

    public static class BaseBehavior<T extends AppBarLayout> extends EscIOBqRhG6irG5q11.lEeR5KfoEr4xU5yHH7 {

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public lEeR5KfoEr4xU5yHH7 f4777T9PhQIpGRhE4yZDm1C;

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public int f4778Z9WdNiOsPR0y54zHW4;

        /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
        public int f4779e54J8UWNHWALQNixXM;

        /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
        public WeakReference f4780hoXrIDAFrSwfShk8da;

        public static class lEeR5KfoEr4xU5yHH7 extends aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7 {
            public static final Parcelable.Creator<lEeR5KfoEr4xU5yHH7> CREATOR = new C0077lEeR5KfoEr4xU5yHH7();

            /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
            public boolean f4781HJFh0TGMpafqLE9haL;

            /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
            public float f4782KYHag8HRDlnO3X9zmZ;

            /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
            public boolean f4783TCyPEKSzIyweCN5yp1;

            /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
            public int f4784husNiw3snxdgZPAGJm;

            /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
            public boolean f4785zZKhbgvUfsK4AEX3r0;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
            public class C0077lEeR5KfoEr4xU5yHH7 implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
                public lEeR5KfoEr4xU5yHH7[] newArray(int i) {
                    return new lEeR5KfoEr4xU5yHH7[i];
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
                public lEeR5KfoEr4xU5yHH7 createFromParcel(Parcel parcel) {
                    return new lEeR5KfoEr4xU5yHH7(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
                public lEeR5KfoEr4xU5yHH7 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new lEeR5KfoEr4xU5yHH7(parcel, classLoader);
                }
            }

            public lEeR5KfoEr4xU5yHH7(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f4781HJFh0TGMpafqLE9haL = parcel.readByte() != 0;
                this.f4785zZKhbgvUfsK4AEX3r0 = parcel.readByte() != 0;
                this.f4784husNiw3snxdgZPAGJm = parcel.readInt();
                this.f4782KYHag8HRDlnO3X9zmZ = parcel.readFloat();
                this.f4783TCyPEKSzIyweCN5yp1 = parcel.readByte() != 0;
            }

            @Override // aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f4781HJFh0TGMpafqLE9haL ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f4785zZKhbgvUfsK4AEX3r0 ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f4784husNiw3snxdgZPAGJm);
                parcel.writeFloat(this.f4782KYHag8HRDlnO3X9zmZ);
                parcel.writeByte(this.f4783TCyPEKSzIyweCN5yp1 ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ void A49QRPHynYLCBN0SqP(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            Uj8rPa1EWADtk6Oe0S(coordinatorLayout, null, parcelable);
        }

        public Parcelable CSih7GetOUab1dYQjM(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableVItLRw50eXTZeEfGl0 = super.VItLRw50eXTZeEfGl0(coordinatorLayout, appBarLayout);
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7K0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(parcelableVItLRw50eXTZeEfGl0, appBarLayout);
            return leer5kfoer4xu5yhh7K0CbjZvfUz23r8IN6W == null ? parcelableVItLRw50eXTZeEfGl0 : leer5kfoer4xu5yhh7K0CbjZvfUz23r8IN6W;
        }

        @Override // EscIOBqRhG6irG5q11.lEeR5KfoEr4xU5yHH7
        public /* bridge */ /* synthetic */ int DfpieXfdYs58yZAiXY(View view) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return zcy2NNbtVXgoGQbfuq(null);
        }

        public int Kh0uC90qEEhuLdpgB9(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int iKqgKJKIWne3kz1AdHk = KqgKJKIWne3kz1AdHk();
            if (i2 == 0 || iKqgKJKIWne3kz1AdHk < i2 || iKqgKJKIWne3kz1AdHk > i3) {
                this.f4778Z9WdNiOsPR0y54zHW4 = 0;
            } else if (iKqgKJKIWne3kz1AdHk != ao3wqKm5CXFuvC0q47.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(i, i2, i3)) {
                throw null;
            }
            ctWLFN70QQINH1kyYo(coordinatorLayout, appBarLayout);
            return 0;
        }

        @Override // EscIOBqRhG6irG5q11.lEeR5KfoEr4xU5yHH7
        public int KqgKJKIWne3kz1AdHk() {
            return XzJ1BS7H9Ilbkv4eVM() + this.f4778Z9WdNiOsPR0y54zHW4;
        }

        public boolean LU0fFDMACqnfIfA1AZ(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f4780hoXrIDAFrSwfShk8da;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ void OUd9THiLjZndMj0qdF(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            ZJNyOIPL0usMs2xSAn(coordinatorLayout, null, view2, i);
        }

        @Override // EscIOBqRhG6irG5q11.lEeR5KfoEr4xU5yHH7
        public /* bridge */ /* synthetic */ void PPkm9uUfOJHHYveeLT(CoordinatorLayout coordinatorLayout, View view) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            oocVJL811qFf0j0XXZ(coordinatorLayout, null);
        }

        public final void Pum9NZyDBKoCnecvlx(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ void R9SAhYMerGybF9OAjL(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            bMSdooljgH14Jgudph(coordinatorLayout, null, view2, i, i2, i3, i4, i5, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean T9PhQIpGRhE4yZDm1C(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return cT5Hs3CQpLK8NvlZAw(coordinatorLayout, null, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean THTDvPxsHqMeGb512f(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return osrHU7fvDp2EgxZPfM(coordinatorLayout, null, view2, view3, i, i2);
        }

        @Override // EscIOBqRhG6irG5q11.lEeR5KfoEr4xU5yHH7
        public /* bridge */ /* synthetic */ int ToH8yzk8U1nKT0PUfY(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return Kh0uC90qEEhuLdpgB9(coordinatorLayout, null, i, i2, i3);
        }

        public void Tu4WCh2gEwj8E4oHbP(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, boolean z) {
            if (this.f4777T9PhQIpGRhE4yZDm1C == null || z) {
                this.f4777T9PhQIpGRhE4yZDm1C = leer5kfoer4xu5yhh7;
            }
        }

        public void Uj8rPa1EWADtk6Oe0S(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof lEeR5KfoEr4xU5yHH7) {
                Tu4WCh2gEwj8E4oHbP((lEeR5KfoEr4xU5yHH7) parcelable, true);
                super.A49QRPHynYLCBN0SqP(coordinatorLayout, appBarLayout, this.f4777T9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL());
            } else {
                super.A49QRPHynYLCBN0SqP(coordinatorLayout, appBarLayout, parcelable);
                this.f4777T9PhQIpGRhE4yZDm1C = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ Parcelable VItLRw50eXTZeEfGl0(CoordinatorLayout coordinatorLayout, View view) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return CSih7GetOUab1dYQjM(coordinatorLayout, null);
        }

        @Override // EscIOBqRhG6irG5q11.lEeR5KfoEr4xU5yHH7
        public /* bridge */ /* synthetic */ boolean W3RZ2dTDKrKpS5Mxdk(View view) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return LU0fFDMACqnfIfA1AZ(null);
        }

        public int YlLW4G6OV9TFyuw5ix(AppBarLayout appBarLayout) {
            throw null;
        }

        public void ZJNyOIPL0usMs2xSAn(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (this.f4779e54J8UWNHWALQNixXM == 0 || i == 1) {
                Pum9NZyDBKoCnecvlx(coordinatorLayout, appBarLayout);
                throw null;
            }
            this.f4780hoXrIDAFrSwfShk8da = new WeakReference(view);
        }

        public void bMSdooljgH14Jgudph(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                throw null;
            }
            if (i4 == 0) {
                ctWLFN70QQINH1kyYo(coordinatorLayout, appBarLayout);
            }
        }

        public boolean cT5Hs3CQpLK8NvlZAw(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            throw null;
        }

        public final void ctWLFN70QQINH1kyYo(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            lLKzvdU99Iw80uVD5I.k0CbjZvfUz23r8IN6W(coordinatorLayout, A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1241zaq8hOURtfwbcX17cG.s3fjYDxWOUexjjVgyA());
            lLKzvdU99Iw80uVD5I.k0CbjZvfUz23r8IN6W(coordinatorLayout, A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1237sTkWmhpZ5b1ArQIw4K.s3fjYDxWOUexjjVgyA());
            throw null;
        }

        @Override // EscIOBqRhG6irG5q11.lEeR5KfoEr4xU5yHH7
        public /* bridge */ /* synthetic */ int e2F9F6h8YJxTHwLCa0(View view) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return YlLW4G6OV9TFyuw5ix(null);
        }

        @Override // EscIOBqRhG6irG5q11.HJFh0TGMpafqLE9haL, androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean e54J8UWNHWALQNixXM(CoordinatorLayout coordinatorLayout, View view, int i) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return udcVtCzLTM1Loe9KrX(coordinatorLayout, null, i);
        }

        public void hUNBy66ZO1wVLJGW3l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            throw null;
        }

        public lEeR5KfoEr4xU5yHH7 k0CbjZvfUz23r8IN6W(Parcelable parcelable, AppBarLayout appBarLayout) {
            XzJ1BS7H9Ilbkv4eVM();
            throw null;
        }

        public void oocVJL811qFf0j0XXZ(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Pum9NZyDBKoCnecvlx(coordinatorLayout, appBarLayout);
            throw null;
        }

        public boolean osrHU7fvDp2EgxZPfM(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            if ((i & 2) != 0) {
                throw null;
            }
            this.f4780hoXrIDAFrSwfShk8da = null;
            this.f4779e54J8UWNHWALQNixXM = i2;
            return false;
        }

        public boolean udcVtCzLTM1Loe9KrX(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            super.e54J8UWNHWALQNixXM(coordinatorLayout, appBarLayout, i);
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ void zaq8hOURtfwbcX17cG(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            hUNBy66ZO1wVLJGW3l(coordinatorLayout, null, view2, i, i2, iArr, i3);
        }

        public int zcy2NNbtVXgoGQbfuq(AppBarLayout appBarLayout) {
            throw null;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable CSih7GetOUab1dYQjM(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.CSih7GetOUab1dYQjM(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void Uj8rPa1EWADtk6Oe0S(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.Uj8rPa1EWADtk6Oe0S(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // EscIOBqRhG6irG5q11.HJFh0TGMpafqLE9haL
        public /* bridge */ /* synthetic */ int XzJ1BS7H9Ilbkv4eVM() {
            return super.XzJ1BS7H9Ilbkv4eVM();
        }

        @Override // EscIOBqRhG6irG5q11.lEeR5KfoEr4xU5yHH7, androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean Z9WdNiOsPR0y54zHW4(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.Z9WdNiOsPR0y54zHW4(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void ZJNyOIPL0usMs2xSAn(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.ZJNyOIPL0usMs2xSAn(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void bMSdooljgH14Jgudph(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.bMSdooljgH14Jgudph(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean cT5Hs3CQpLK8NvlZAw(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.cT5Hs3CQpLK8NvlZAw(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void hUNBy66ZO1wVLJGW3l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.hUNBy66ZO1wVLJGW3l(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // EscIOBqRhG6irG5q11.lEeR5KfoEr4xU5yHH7, androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean jCtUeU2YI1poCxWcjm(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.jCtUeU2YI1poCxWcjm(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean osrHU7fvDp2EgxZPfM(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.osrHU7fvDp2EgxZPfM(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean udcVtCzLTM1Loe9KrX(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.udcVtCzLTM1Loe9KrX(coordinatorLayout, appBarLayout, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends s3fjYDxWOUexjjVgyA {
        public ScrollingViewBehavior() {
        }

        @Override // EscIOBqRhG6irG5q11.s3fjYDxWOUexjjVgyA
        public int DfpieXfdYs58yZAiXY(View view) {
            return super.DfpieXfdYs58yZAiXY(view);
        }

        @Override // EscIOBqRhG6irG5q11.s3fjYDxWOUexjjVgyA
        public float GyWRxpdt1T8mEJXPoD(View view) {
            return 0.0f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public boolean IPyIQcaNa8aB7drBED(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ToH8yzk8U1nKT0PUfY(view, view2);
            XdzLv4NdAtTYoEzVzB(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public boolean LIMtzhnLwQyigzK0KO(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            lLKzvdU99Iw80uVD5I(coordinatorLayout.zaq8hOURtfwbcX17cG(view));
            return false;
        }

        @Override // EscIOBqRhG6irG5q11.s3fjYDxWOUexjjVgyA, androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean T9PhQIpGRhE4yZDm1C(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.T9PhQIpGRhE4yZDm1C(coordinatorLayout, view, i, i2, i3, i4);
        }

        public final void ToH8yzk8U1nKT0PUfY(View view, View view2) {
            CoordinatorLayout.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = ((CoordinatorLayout.husNiw3snxdgZPAGJm) view2.getLayoutParams()).husNiw3snxdgZPAGJm();
            if (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm instanceof BaseBehavior) {
                lLKzvdU99Iw80uVD5I.udcVtCzLTM1Loe9KrX(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm).f4778Z9WdNiOsPR0y54zHW4) + e2F9F6h8YJxTHwLCa0()) - OqIo5QF00RDxUQb4qq(view2));
            }
        }

        @Override // EscIOBqRhG6irG5q11.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ View W3RZ2dTDKrKpS5Mxdk(List list) {
            lLKzvdU99Iw80uVD5I(list);
            return null;
        }

        public final void XdzLv4NdAtTYoEzVzB(View view, View view2) {
        }

        @Override // EscIOBqRhG6irG5q11.HJFh0TGMpafqLE9haL, androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean e54J8UWNHWALQNixXM(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.e54J8UWNHWALQNixXM(coordinatorLayout, view, i);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public boolean husNiw3snxdgZPAGJm(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public AppBarLayout lLKzvdU99Iw80uVD5I(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public void pbVGzGjWvY2LDXC8vo(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Acstmh57AKoSEkEFNJ.lveOFTS2lNtik4smTM);
            PPkm9uUfOJHHYveeLT(typedArrayObtainStyledAttributes.getDimensionPixelSize(Acstmh57AKoSEkEFNJ.LKQRsCqzSNh8wKlkAU, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
