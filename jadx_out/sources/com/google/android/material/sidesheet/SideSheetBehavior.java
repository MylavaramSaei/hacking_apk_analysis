package com.google.android.material.sidesheet;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import OqIo5QF00RDxUQb4qq.THTDvPxsHqMeGb512f;
import W3RZ2dTDKrKpS5Mxdk.Y43RdunnpKgpbny0lE;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.zZKhbgvUfsK4AEX3r0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1;
import ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;
import tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED;
import tmIBXGVvBsrJ7i63G2.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.s3fjYDxWOUexjjVgyA {

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public final Set f5258A49QRPHynYLCBN0SqP;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public int f5259Acstmh57AKoSEkEFNJ;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public VelocityTracker f5260G7AC3DWIx9i9fdanjk;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public TCyPEKSzIyweCN5yp1 f5261HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f5262IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f5263KYHag8HRDlnO3X9zmZ;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public int f5264LIMtzhnLwQyigzK0KO;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public int f5265OANkd3mP6AYvwbNLJM;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public int f5266R9SAhYMerGybF9OAjL;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public float f5267T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public float f5268TCyPEKSzIyweCN5yp1;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL f5269VItLRw50eXTZeEfGl0;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public WeakReference f5270Y43RdunnpKgpbny0lE;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL f5271Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public int f5272aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public boolean f5273e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public int f5274hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public Z9WdNiOsPR0y54zHW4 f5275husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL f5276lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int f5277pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public float f5278s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public WeakReference f5279sTkWmhpZ5b1ArQIw4K;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public fBZDmBPlAHk1Liuf1T.HJFh0TGMpafqLE9haL f5280xHA29AmDt6y96AnB3t;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public ColorStateList f5281zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public int f5282zaq8hOURtfwbcX17cG;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public static final int f5257WWC27LAMFqFFBzfbNw = IPyIQcaNa8aB7drBED.f7054R9SAhYMerGybF9OAjL;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public static final int f5256THTDvPxsHqMeGb512f = pbVGzGjWvY2LDXC8vo.f7166husNiw3snxdgZPAGJm;

    public class HJFh0TGMpafqLE9haL {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final Runnable f5283HJFh0TGMpafqLE9haL = new Runnable() { // from class: R6kEk3zZuOluTikhN3.TCyPEKSzIyweCN5yp1
            @Override // java.lang.Runnable
            public final void run() {
                this.f1356lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL();
            }
        };

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f5284lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f5285s3fjYDxWOUexjjVgyA;

        public HJFh0TGMpafqLE9haL() {
        }

        public final /* synthetic */ void HJFh0TGMpafqLE9haL() {
            this.f5285s3fjYDxWOUexjjVgyA = false;
            if (SideSheetBehavior.this.f5271Z9WdNiOsPR0y54zHW4 != null && SideSheetBehavior.this.f5271Z9WdNiOsPR0y54zHW4.Z9WdNiOsPR0y54zHW4(true)) {
                s3fjYDxWOUexjjVgyA(this.f5284lEeR5KfoEr4xU5yHH7);
            } else if (SideSheetBehavior.this.f5277pbVGzGjWvY2LDXC8vo == 2) {
                SideSheetBehavior.this.HZ4bptRS9XIcK1CV95(this.f5284lEeR5KfoEr4xU5yHH7);
            }
        }

        public void s3fjYDxWOUexjjVgyA(int i) {
            if (SideSheetBehavior.this.f5279sTkWmhpZ5b1ArQIw4K == null || SideSheetBehavior.this.f5279sTkWmhpZ5b1ArQIw4K.get() == null) {
                return;
            }
            this.f5284lEeR5KfoEr4xU5yHH7 = i;
            if (this.f5285s3fjYDxWOUexjjVgyA) {
                return;
            }
            lLKzvdU99Iw80uVD5I.ZJNyOIPL0usMs2xSAn((View) SideSheetBehavior.this.f5279sTkWmhpZ5b1ArQIw4K.get(), this.f5283HJFh0TGMpafqLE9haL);
            this.f5285s3fjYDxWOUexjjVgyA = true;
        }
    }

    public class lEeR5KfoEr4xU5yHH7 extends HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public void Acstmh57AKoSEkEFNJ(int i) {
            if (i == 1 && SideSheetBehavior.this.f5262IPyIQcaNa8aB7drBED) {
                SideSheetBehavior.this.HZ4bptRS9XIcK1CV95(1);
            }
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public boolean T9PhQIpGRhE4yZDm1C(View view, int i) {
            return (SideSheetBehavior.this.f5277pbVGzGjWvY2LDXC8vo == 1 || SideSheetBehavior.this.f5279sTkWmhpZ5b1ArQIw4K == null || SideSheetBehavior.this.f5279sTkWmhpZ5b1ArQIw4K.get() != view) ? false : true;
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public void Z9WdNiOsPR0y54zHW4(View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewUj8rPa1EWADtk6Oe0S = SideSheetBehavior.this.Uj8rPa1EWADtk6Oe0S();
            if (viewUj8rPa1EWADtk6Oe0S != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewUj8rPa1EWADtk6Oe0S.getLayoutParams()) != null) {
                SideSheetBehavior.this.f5276lEeR5KfoEr4xU5yHH7.hoXrIDAFrSwfShk8da(marginLayoutParams, view.getLeft(), view.getRight());
                viewUj8rPa1EWADtk6Oe0S.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.udcVtCzLTM1Loe9KrX(view, i);
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public void e54J8UWNHWALQNixXM(View view, float f, float f2) {
            int iLU0fFDMACqnfIfA1AZ = SideSheetBehavior.this.LU0fFDMACqnfIfA1AZ(view, f, f2);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.aUn6Hqsqw2PVM8685Z(view, iLU0fFDMACqnfIfA1AZ, sideSheetBehavior.Bc5OTyAfOKVCQb8CEz());
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public int lEeR5KfoEr4xU5yHH7(View view, int i, int i2) {
            return ao3wqKm5CXFuvC0q47.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(i, SideSheetBehavior.this.f5276lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(), SideSheetBehavior.this.f5276lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm());
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public int s3fjYDxWOUexjjVgyA(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public int zZKhbgvUfsK4AEX3r0(View view) {
            return SideSheetBehavior.this.f5274hoXrIDAFrSwfShk8da + SideSheetBehavior.this.Tu4WCh2gEwj8E4oHbP();
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7 {
        public static final Parcelable.Creator<s3fjYDxWOUexjjVgyA> CREATOR = new lEeR5KfoEr4xU5yHH7();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final int f5288HJFh0TGMpafqLE9haL;

        public class lEeR5KfoEr4xU5yHH7 implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
            public s3fjYDxWOUexjjVgyA[] newArray(int i) {
                return new s3fjYDxWOUexjjVgyA[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
            public s3fjYDxWOUexjjVgyA createFromParcel(Parcel parcel) {
                return new s3fjYDxWOUexjjVgyA(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
            public s3fjYDxWOUexjjVgyA createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new s3fjYDxWOUexjjVgyA(parcel, classLoader);
            }
        }

        public s3fjYDxWOUexjjVgyA(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5288HJFh0TGMpafqLE9haL = parcel.readInt();
        }

        @Override // aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5288HJFh0TGMpafqLE9haL);
        }

        public s3fjYDxWOUexjjVgyA(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f5288HJFh0TGMpafqLE9haL = sideSheetBehavior.f5277pbVGzGjWvY2LDXC8vo;
        }
    }

    public SideSheetBehavior() {
        this.f5263KYHag8HRDlnO3X9zmZ = new HJFh0TGMpafqLE9haL();
        this.f5262IPyIQcaNa8aB7drBED = true;
        this.f5277pbVGzGjWvY2LDXC8vo = 5;
        this.f5259Acstmh57AKoSEkEFNJ = 5;
        this.f5267T9PhQIpGRhE4yZDm1C = 0.1f;
        this.f5266R9SAhYMerGybF9OAjL = -1;
        this.f5258A49QRPHynYLCBN0SqP = new LinkedHashSet();
        this.f5269VItLRw50eXTZeEfGl0 = new lEeR5KfoEr4xU5yHH7();
    }

    private THTDvPxsHqMeGb512f YlLW4G6OV9TFyuw5ix(final int i) {
        return new THTDvPxsHqMeGb512f() { // from class: R6kEk3zZuOluTikhN3.husNiw3snxdgZPAGJm
            @Override // OqIo5QF00RDxUQb4qq.THTDvPxsHqMeGb512f
            public final boolean lEeR5KfoEr4xU5yHH7(View view, THTDvPxsHqMeGb512f.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
                return this.f1357lEeR5KfoEr4xU5yHH7.Jsouc4ileb8SxQhxbX(i, view, leer5kfoer4xu5yhh7);
            }
        };
    }

    private boolean aRQ2M7vtRaPDEyvpdv() {
        return this.f5271Z9WdNiOsPR0y54zHW4 != null && (this.f5262IPyIQcaNa8aB7drBED || this.f5277pbVGzGjWvY2LDXC8vo == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aUn6Hqsqw2PVM8685Z(View view, int i, boolean z) {
        if (!xMfAHy6F7qK0zhxhKG(view, i, z)) {
            HZ4bptRS9XIcK1CV95(i);
        } else {
            HZ4bptRS9XIcK1CV95(2);
            this.f5263KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(i);
        }
    }

    private void fDXXEWvhMVO3O8mnuS() {
        View view;
        WeakReference weakReference = this.f5279sTkWmhpZ5b1ArQIw4K;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        lLKzvdU99Iw80uVD5I.k0CbjZvfUz23r8IN6W(view, 262144);
        lLKzvdU99Iw80uVD5I.k0CbjZvfUz23r8IN6W(view, 1048576);
        if (this.f5277pbVGzGjWvY2LDXC8vo != 5) {
            yvdWWG9COQQotjfedH(view, A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1218VItLRw50eXTZeEfGl0, 5);
        }
        if (this.f5277pbVGzGjWvY2LDXC8vo != 3) {
            yvdWWG9COQQotjfedH(view, A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1207LIMtzhnLwQyigzK0KO, 3);
        }
    }

    private int hUNBy66ZO1wVLJGW3l(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    private void iQCvttGuB7nx4r7kMP(View view, Runnable runnable) {
        if (ayduHasC7VpxsVXE0T(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void oocVJL811qFf0j0XXZ(Context context) {
        if (this.f5275husNiw3snxdgZPAGJm == null) {
            return;
        }
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new TCyPEKSzIyweCN5yp1(this.f5275husNiw3snxdgZPAGJm);
        this.f5261HJFh0TGMpafqLE9haL = tCyPEKSzIyweCN5yp1;
        tCyPEKSzIyweCN5yp1.DfpieXfdYs58yZAiXY(context);
        ColorStateList colorStateList = this.f5281zZKhbgvUfsK4AEX3r0;
        if (colorStateList != null) {
            this.f5261HJFh0TGMpafqLE9haL.YlLW4G6OV9TFyuw5ix(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f5261HJFh0TGMpafqLE9haL.setTint(typedValue.data);
    }

    private void yvdWWG9COQQotjfedH(View view, A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i) {
        lLKzvdU99Iw80uVD5I.Pum9NZyDBKoCnecvlx(view, leer5kfoer4xu5yhh7, null, YlLW4G6OV9TFyuw5ix(i));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public void A49QRPHynYLCBN0SqP(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) parcelable;
        if (s3fjydxwouexjjvgya.HJFh0TGMpafqLE9haL() != null) {
            super.A49QRPHynYLCBN0SqP(coordinatorLayout, view, s3fjydxwouexjjvgya.HJFh0TGMpafqLE9haL());
        }
        int i = s3fjydxwouexjjvgya.f5288HJFh0TGMpafqLE9haL;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f5277pbVGzGjWvY2LDXC8vo = i;
        this.f5259Acstmh57AKoSEkEFNJ = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public void Acstmh57AKoSEkEFNJ() {
        super.Acstmh57AKoSEkEFNJ();
        this.f5279sTkWmhpZ5b1ArQIw4K = null;
        this.f5271Z9WdNiOsPR0y54zHW4 = null;
        this.f5280xHA29AmDt6y96AnB3t = null;
    }

    public boolean Bc5OTyAfOKVCQb8CEz() {
        return true;
    }

    public int CSih7GetOUab1dYQjM() {
        return this.f5276lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL();
    }

    public final boolean DFYiVi7zXozAjRciKa(MotionEvent motionEvent) {
        return aRQ2M7vtRaPDEyvpdv() && XdzLv4NdAtTYoEzVzB((float) this.f5264LIMtzhnLwQyigzK0KO, motionEvent.getX()) > ((float) this.f5271Z9WdNiOsPR0y54zHW4.G7AC3DWIx9i9fdanjk());
    }

    public final void Er40JrQbOM51vCQI8w(int i) {
        R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f5276lEeR5KfoEr4xU5yHH7;
        if (hJFh0TGMpafqLE9haL == null || hJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo() != i) {
            if (i == 0) {
                this.f5276lEeR5KfoEr4xU5yHH7 = new R6kEk3zZuOluTikhN3.s3fjYDxWOUexjjVgyA(this);
                if (this.f5275husNiw3snxdgZPAGJm == null || evSiTWao80SbJUZk9E()) {
                    return;
                }
                Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t = this.f5275husNiw3snxdgZPAGJm.xHA29AmDt6y96AnB3t();
                s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t.XzJ1BS7H9Ilbkv4eVM(0.0f).LIMtzhnLwQyigzK0KO(0.0f);
                vlBaBOcZ1q1ndWVoXn(s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t.T9PhQIpGRhE4yZDm1C());
                return;
            }
            if (i == 1) {
                this.f5276lEeR5KfoEr4xU5yHH7 = new R6kEk3zZuOluTikhN3.lEeR5KfoEr4xU5yHH7(this);
                if (this.f5275husNiw3snxdgZPAGJm == null || eWK41qw3g36LVd4UnS()) {
                    return;
                }
                Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t2 = this.f5275husNiw3snxdgZPAGJm.xHA29AmDt6y96AnB3t();
                s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t2.THTDvPxsHqMeGb512f(0.0f).Y43RdunnpKgpbny0lE(0.0f);
                vlBaBOcZ1q1ndWVoXn(s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t2.T9PhQIpGRhE4yZDm1C());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i + ". Must be 0 or 1.");
        }
    }

    public void Fo9071MN8vwEWamAUX(boolean z) {
        this.f5262IPyIQcaNa8aB7drBED = z;
    }

    public final boolean FtYx4GXtxwA8al5hBy(float f) {
        return this.f5276lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(f);
    }

    public boolean HR5vAalpgOKVm2T0Gq(View view, float f) {
        return this.f5276lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C(view, f);
    }

    public void HZ4bptRS9XIcK1CV95(int i) {
        View view;
        if (this.f5277pbVGzGjWvY2LDXC8vo == i) {
            return;
        }
        this.f5277pbVGzGjWvY2LDXC8vo = i;
        if (i == 3 || i == 5) {
            this.f5259Acstmh57AKoSEkEFNJ = i;
        }
        WeakReference weakReference = this.f5279sTkWmhpZ5b1ArQIw4K;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        i8aHOwH04efS6lZ3Oa(view);
        Iterator it = this.f5258A49QRPHynYLCBN0SqP.iterator();
        if (it.hasNext()) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(it.next());
            throw null;
        }
        fDXXEWvhMVO3O8mnuS();
    }

    public final /* synthetic */ boolean Jsouc4ileb8SxQhxbX(int i, View view, THTDvPxsHqMeGb512f.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        f2zPq7MOnQrtOlZ1Zg(i);
        return true;
    }

    public int Kh0uC90qEEhuLdpgB9() {
        return this.f5265OANkd3mP6AYvwbNLJM;
    }

    public final int LU0fFDMACqnfIfA1AZ(View view, float f, float f2) {
        if (FtYx4GXtxwA8al5hBy(f)) {
            return 3;
        }
        if (HR5vAalpgOKVm2T0Gq(view, f)) {
            if (!this.f5276lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(f, f2) && !this.f5276lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(view)) {
                return 3;
            }
        } else if (f == 0.0f || !R6kEk3zZuOluTikhN3.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(f, f2)) {
            int left = view.getLeft();
            if (Math.abs(left - CSih7GetOUab1dYQjM()) < Math.abs(left - this.f5276lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0())) {
                return 3;
            }
        }
        return 5;
    }

    public final void O1furmptfI76BGfN0d() {
        VelocityTracker velocityTracker = this.f5260G7AC3DWIx9i9fdanjk;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5260G7AC3DWIx9i9fdanjk = null;
        }
    }

    public int Pum9NZyDBKoCnecvlx() {
        return this.f5272aPyGSIylzVNKPT1Bls;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean T9PhQIpGRhE4yZDm1C(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(hUNBy66ZO1wVLJGW3l(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), hUNBy66ZO1wVLJGW3l(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public void TCyPEKSzIyweCN5yp1(CoordinatorLayout.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        super.TCyPEKSzIyweCN5yp1(husniw3snxdgzpagjm);
        this.f5279sTkWmhpZ5b1ArQIw4K = null;
        this.f5271Z9WdNiOsPR0y54zHW4 = null;
        this.f5280xHA29AmDt6y96AnB3t = null;
    }

    public final int ToH8yzk8U1nKT0PUfY(int i, View view) {
        int i2 = this.f5277pbVGzGjWvY2LDXC8vo;
        if (i2 == 1 || i2 == 2) {
            return i - this.f5276lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(view);
        }
        if (i2 == 3) {
            return 0;
        }
        if (i2 == 5) {
            return this.f5276lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0();
        }
        throw new IllegalStateException("Unexpected value: " + this.f5277pbVGzGjWvY2LDXC8vo);
    }

    public int Tu4WCh2gEwj8E4oHbP() {
        return this.f5282zaq8hOURtfwbcX17cG;
    }

    public View Uj8rPa1EWADtk6Oe0S() {
        WeakReference weakReference = this.f5270Y43RdunnpKgpbny0lE;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public Parcelable VItLRw50eXTZeEfGl0(CoordinatorLayout coordinatorLayout, View view) {
        return new s3fjYDxWOUexjjVgyA(super.VItLRw50eXTZeEfGl0(coordinatorLayout, view), this);
    }

    public final float XdzLv4NdAtTYoEzVzB(float f, float f2) {
        return Math.abs(f - f2);
    }

    public final void Ywqw2A0s86HeuFkDt0(View view, int i) {
        Er40JrQbOM51vCQI8w(Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(((CoordinatorLayout.husNiw3snxdgZPAGJm) view.getLayoutParams()).f3225HJFh0TGMpafqLE9haL, i) == 3 ? 1 : 0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean Z9WdNiOsPR0y54zHW4(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL;
        if (!pgB7Gmjz55y9NQYnAD(view)) {
            this.f5273e54J8UWNHWALQNixXM = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            O1furmptfI76BGfN0d();
        }
        if (this.f5260G7AC3DWIx9i9fdanjk == null) {
            this.f5260G7AC3DWIx9i9fdanjk = VelocityTracker.obtain();
        }
        this.f5260G7AC3DWIx9i9fdanjk.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f5264LIMtzhnLwQyigzK0KO = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f5273e54J8UWNHWALQNixXM) {
            this.f5273e54J8UWNHWALQNixXM = false;
            return false;
        }
        return (this.f5273e54J8UWNHWALQNixXM || (hJFh0TGMpafqLE9haL = this.f5271Z9WdNiOsPR0y54zHW4) == null || !hJFh0TGMpafqLE9haL.W3RZ2dTDKrKpS5Mxdk(motionEvent)) ? false : true;
    }

    public float ZJNyOIPL0usMs2xSAn() {
        return 0.5f;
    }

    public final boolean ayduHasC7VpxsVXE0T(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && lLKzvdU99Iw80uVD5I.aAp6BD79BhftLCnuvf(view);
    }

    public final void bBVlTkqEpHW053CjWL(CoordinatorLayout coordinatorLayout) {
        int i;
        View viewFindViewById;
        if (this.f5270Y43RdunnpKgpbny0lE != null || (i = this.f5266R9SAhYMerGybF9OAjL) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i)) == null) {
            return;
        }
        this.f5270Y43RdunnpKgpbny0lE = new WeakReference(viewFindViewById);
    }

    public int bMSdooljgH14Jgudph() {
        return this.f5274hoXrIDAFrSwfShk8da;
    }

    public final void cT5Hs3CQpLK8NvlZAw(View view) {
        if (lLKzvdU99Iw80uVD5I.e54J8UWNHWALQNixXM(view) == null) {
            lLKzvdU99Iw80uVD5I.FtYx4GXtxwA8al5hBy(view, view.getResources().getString(f5257WWC27LAMFqFFBzfbNw));
        }
    }

    public int ctWLFN70QQINH1kyYo() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean e54J8UWNHWALQNixXM(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (lLKzvdU99Iw80uVD5I.G7AC3DWIx9i9fdanjk(coordinatorLayout) && !lLKzvdU99Iw80uVD5I.G7AC3DWIx9i9fdanjk(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f5279sTkWmhpZ5b1ArQIw4K == null) {
            this.f5279sTkWmhpZ5b1ArQIw4K = new WeakReference(view);
            this.f5280xHA29AmDt6y96AnB3t = new fBZDmBPlAHk1Liuf1T.HJFh0TGMpafqLE9haL(view);
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f5261HJFh0TGMpafqLE9haL;
            if (tCyPEKSzIyweCN5yp1 != null) {
                lLKzvdU99Iw80uVD5I.ayduHasC7VpxsVXE0T(view, tCyPEKSzIyweCN5yp1);
                TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp12 = this.f5261HJFh0TGMpafqLE9haL;
                float fY43RdunnpKgpbny0lE = this.f5268TCyPEKSzIyweCN5yp1;
                if (fY43RdunnpKgpbny0lE == -1.0f) {
                    fY43RdunnpKgpbny0lE = lLKzvdU99Iw80uVD5I.Y43RdunnpKgpbny0lE(view);
                }
                tCyPEKSzIyweCN5yp12.zcy2NNbtVXgoGQbfuq(fY43RdunnpKgpbny0lE);
            } else {
                ColorStateList colorStateList = this.f5281zZKhbgvUfsK4AEX3r0;
                if (colorStateList != null) {
                    lLKzvdU99Iw80uVD5I.xMfAHy6F7qK0zhxhKG(view, colorStateList);
                }
            }
            i8aHOwH04efS6lZ3Oa(view);
            fDXXEWvhMVO3O8mnuS();
            if (lLKzvdU99Iw80uVD5I.xHA29AmDt6y96AnB3t(view) == 0) {
                lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(view, 1);
            }
            cT5Hs3CQpLK8NvlZAw(view);
        }
        Ywqw2A0s86HeuFkDt0(view, i);
        if (this.f5271Z9WdNiOsPR0y54zHW4 == null) {
            this.f5271Z9WdNiOsPR0y54zHW4 = lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C(coordinatorLayout, this.f5269VItLRw50eXTZeEfGl0);
        }
        int iTCyPEKSzIyweCN5yp1 = this.f5276lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(view);
        coordinatorLayout.W3RZ2dTDKrKpS5Mxdk(view, i);
        this.f5272aPyGSIylzVNKPT1Bls = coordinatorLayout.getWidth();
        this.f5265OANkd3mP6AYvwbNLJM = this.f5276lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(coordinatorLayout);
        this.f5274hoXrIDAFrSwfShk8da = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f5282zaq8hOURtfwbcX17cG = marginLayoutParams != null ? this.f5276lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(marginLayoutParams) : 0;
        lLKzvdU99Iw80uVD5I.oocVJL811qFf0j0XXZ(view, ToH8yzk8U1nKT0PUfY(iTCyPEKSzIyweCN5yp1, view));
        bBVlTkqEpHW053CjWL(coordinatorLayout);
        Iterator it = this.f5258A49QRPHynYLCBN0SqP.iterator();
        while (it.hasNext()) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(it.next());
        }
        return true;
    }

    public final boolean eWK41qw3g36LVd4UnS() {
        CoordinatorLayout.husNiw3snxdgZPAGJm husniw3snxdgzpagjmZXY7dgnTfw9Pd9RXel = zXY7dgnTfw9Pd9RXel();
        return husniw3snxdgzpagjmZXY7dgnTfw9Pd9RXel != null && ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjmZXY7dgnTfw9Pd9RXel).leftMargin > 0;
    }

    public final boolean evSiTWao80SbJUZk9E() {
        CoordinatorLayout.husNiw3snxdgZPAGJm husniw3snxdgzpagjmZXY7dgnTfw9Pd9RXel = zXY7dgnTfw9Pd9RXel();
        return husniw3snxdgzpagjmZXY7dgnTfw9Pd9RXel != null && ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjmZXY7dgnTfw9Pd9RXel).rightMargin > 0;
    }

    public void f2zPq7MOnQrtOlZ1Zg(final int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f5279sTkWmhpZ5b1ArQIw4K;
        if (weakReference == null || weakReference.get() == null) {
            HZ4bptRS9XIcK1CV95(i);
        } else {
            iQCvttGuB7nx4r7kMP((View) this.f5279sTkWmhpZ5b1ArQIw4K.get(), new Runnable() { // from class: R6kEk3zZuOluTikhN3.KYHag8HRDlnO3X9zmZ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1354lEeR5KfoEr4xU5yHH7.fLSSbwbzFBVpwBH5FM(i);
                }
            });
        }
    }

    public final /* synthetic */ void fLSSbwbzFBVpwBH5FM(int i) {
        View view = (View) this.f5279sTkWmhpZ5b1ArQIw4K.get();
        if (view != null) {
            aUn6Hqsqw2PVM8685Z(view, i, false);
        }
    }

    public final void i8aHOwH04efS6lZ3Oa(View view) {
        int i = this.f5277pbVGzGjWvY2LDXC8vo == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean jCtUeU2YI1poCxWcjm(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5277pbVGzGjWvY2LDXC8vo == 1 && actionMasked == 0) {
            return true;
        }
        if (aRQ2M7vtRaPDEyvpdv()) {
            this.f5271Z9WdNiOsPR0y54zHW4.WWC27LAMFqFFBzfbNw(motionEvent);
        }
        if (actionMasked == 0) {
            O1furmptfI76BGfN0d();
        }
        if (this.f5260G7AC3DWIx9i9fdanjk == null) {
            this.f5260G7AC3DWIx9i9fdanjk = VelocityTracker.obtain();
        }
        this.f5260G7AC3DWIx9i9fdanjk.addMovement(motionEvent);
        if (aRQ2M7vtRaPDEyvpdv() && actionMasked == 2 && !this.f5273e54J8UWNHWALQNixXM && DFYiVi7zXozAjRciKa(motionEvent)) {
            this.f5271Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f5273e54J8UWNHWALQNixXM;
    }

    public lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL jocVUfxESVhVJU8LoH() {
        return this.f5271Z9WdNiOsPR0y54zHW4;
    }

    public int k0CbjZvfUz23r8IN6W(int i) {
        if (i == 3) {
            return CSih7GetOUab1dYQjM();
        }
        if (i == 5) {
            return this.f5276lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i);
    }

    public float osrHU7fvDp2EgxZPfM() {
        return this.f5267T9PhQIpGRhE4yZDm1C;
    }

    public final boolean pgB7Gmjz55y9NQYnAD(View view) {
        return (view.isShown() || lLKzvdU99Iw80uVD5I.e54J8UWNHWALQNixXM(view) != null) && this.f5262IPyIQcaNa8aB7drBED;
    }

    public final void udcVtCzLTM1Loe9KrX(View view, int i) {
        if (this.f5258A49QRPHynYLCBN0SqP.isEmpty()) {
            return;
        }
        this.f5276lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(i);
        Iterator it = this.f5258A49QRPHynYLCBN0SqP.iterator();
        if (it.hasNext()) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(it.next());
            throw null;
        }
    }

    public final void vlBaBOcZ1q1ndWVoXn(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f5261HJFh0TGMpafqLE9haL;
        if (tCyPEKSzIyweCN5yp1 != null) {
            tCyPEKSzIyweCN5yp1.setShapeAppearanceModel(z9WdNiOsPR0y54zHW4);
        }
    }

    public final boolean xMfAHy6F7qK0zhxhKG(View view, int i, boolean z) {
        int iK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(i);
        lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLJocVUfxESVhVJU8LoH = jocVUfxESVhVJU8LoH();
        return hJFh0TGMpafqLE9haLJocVUfxESVhVJU8LoH != null && (!z ? !hJFh0TGMpafqLE9haLJocVUfxESVhVJU8LoH.OqIo5QF00RDxUQb4qq(view, iK0CbjZvfUz23r8IN6W, view.getTop()) : !hJFh0TGMpafqLE9haLJocVUfxESVhVJU8LoH.tXWeW0sqVddf7ZBflq(iK0CbjZvfUz23r8IN6W, view.getTop()));
    }

    public void yL2E9nlEZpg8ZZx8XE(int i) {
        this.f5266R9SAhYMerGybF9OAjL = i;
        zcy2NNbtVXgoGQbfuq();
        WeakReference weakReference = this.f5279sTkWmhpZ5b1ArQIw4K;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i == -1 || !lLKzvdU99Iw80uVD5I.lLKzvdU99Iw80uVD5I(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    public final CoordinatorLayout.husNiw3snxdgZPAGJm zXY7dgnTfw9Pd9RXel() {
        View view;
        WeakReference weakReference = this.f5279sTkWmhpZ5b1ArQIw4K;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.husNiw3snxdgZPAGJm)) {
            return null;
        }
        return (CoordinatorLayout.husNiw3snxdgZPAGJm) view.getLayoutParams();
    }

    public final void zcy2NNbtVXgoGQbfuq() {
        WeakReference weakReference = this.f5270Y43RdunnpKgpbny0lE;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5270Y43RdunnpKgpbny0lE = null;
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5263KYHag8HRDlnO3X9zmZ = new HJFh0TGMpafqLE9haL();
        this.f5262IPyIQcaNa8aB7drBED = true;
        this.f5277pbVGzGjWvY2LDXC8vo = 5;
        this.f5259Acstmh57AKoSEkEFNJ = 5;
        this.f5267T9PhQIpGRhE4yZDm1C = 0.1f;
        this.f5266R9SAhYMerGybF9OAjL = -1;
        this.f5258A49QRPHynYLCBN0SqP = new LinkedHashSet();
        this.f5269VItLRw50eXTZeEfGl0 = new lEeR5KfoEr4xU5yHH7();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Acstmh57AKoSEkEFNJ.rFFnAu67ZB7G1DiYVL);
        if (typedArrayObtainStyledAttributes.hasValue(Acstmh57AKoSEkEFNJ.Ezx31zqRGWEh2n7KAa)) {
            this.f5281zZKhbgvUfsK4AEX3r0 = hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(context, typedArrayObtainStyledAttributes, Acstmh57AKoSEkEFNJ.Ezx31zqRGWEh2n7KAa);
        }
        if (typedArrayObtainStyledAttributes.hasValue(Acstmh57AKoSEkEFNJ.WdFsNlIsytUDOBF3tn)) {
            this.f5275husNiw3snxdgZPAGJm = Z9WdNiOsPR0y54zHW4.husNiw3snxdgZPAGJm(context, attributeSet, 0, f5256THTDvPxsHqMeGb512f).T9PhQIpGRhE4yZDm1C();
        }
        if (typedArrayObtainStyledAttributes.hasValue(Acstmh57AKoSEkEFNJ.uqiqWjzYjTPv16sgqs)) {
            yL2E9nlEZpg8ZZx8XE(typedArrayObtainStyledAttributes.getResourceId(Acstmh57AKoSEkEFNJ.uqiqWjzYjTPv16sgqs, -1));
        }
        oocVJL811qFf0j0XXZ(context);
        this.f5268TCyPEKSzIyweCN5yp1 = typedArrayObtainStyledAttributes.getDimension(Acstmh57AKoSEkEFNJ.DuV31F8X4xB9cWnvZo, -1.0f);
        Fo9071MN8vwEWamAUX(typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.MoW36Yff4vwaEnO7Uf, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f5278s3fjYDxWOUexjjVgyA = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
