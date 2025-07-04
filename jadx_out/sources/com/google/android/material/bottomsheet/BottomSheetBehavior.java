package com.google.android.material.bottomsheet;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import OqIo5QF00RDxUQb4qq.THTDvPxsHqMeGb512f;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;
import tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED;
import tmIBXGVvBsrJ7i63G2.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.s3fjYDxWOUexjjVgyA {

    /* renamed from: jocVUfxESVhVJU8LoH, reason: collision with root package name */
    public static final int f4831jocVUfxESVhVJU8LoH = pbVGzGjWvY2LDXC8vo.f7169s3fjYDxWOUexjjVgyA;

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public int f4832A49QRPHynYLCBN0SqP;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 f4833Acstmh57AKoSEkEFNJ;

    /* renamed from: CSih7GetOUab1dYQjM, reason: collision with root package name */
    public VelocityTracker f4834CSih7GetOUab1dYQjM;

    /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
    public boolean f4835DfpieXfdYs58yZAiXY;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public boolean f4836G7AC3DWIx9i9fdanjk;

    /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
    public float f4837GyWRxpdt1T8mEJXPoD;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public boolean f4838HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int f4839IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f4840KYHag8HRDlnO3X9zmZ;

    /* renamed from: Kh0uC90qEEhuLdpgB9, reason: collision with root package name */
    public Map f4841Kh0uC90qEEhuLdpgB9;

    /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
    public boolean f4842KqgKJKIWne3kz1AdHk;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public int f4843LIMtzhnLwQyigzK0KO;

    /* renamed from: LU0fFDMACqnfIfA1AZ, reason: collision with root package name */
    public boolean f4844LU0fFDMACqnfIfA1AZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public boolean f4845OANkd3mP6AYvwbNLJM;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public ValueAnimator f4846OUd9THiLjZndMj0qdF;

    /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
    public int f4847OqIo5QF00RDxUQb4qq;

    /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
    public int f4848PPkm9uUfOJHHYveeLT;

    /* renamed from: Pum9NZyDBKoCnecvlx, reason: collision with root package name */
    public final SparseIntArray f4849Pum9NZyDBKoCnecvlx;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public boolean f4850R9SAhYMerGybF9OAjL;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public int f4851T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f4852TCyPEKSzIyweCN5yp1;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public boolean f4853THTDvPxsHqMeGb512f;

    /* renamed from: ToH8yzk8U1nKT0PUfY, reason: collision with root package name */
    public boolean f4854ToH8yzk8U1nKT0PUfY;

    /* renamed from: Tu4WCh2gEwj8E4oHbP, reason: collision with root package name */
    public int f4855Tu4WCh2gEwj8E4oHbP;

    /* renamed from: Uj8rPa1EWADtk6Oe0S, reason: collision with root package name */
    public final ArrayList f4856Uj8rPa1EWADtk6Oe0S;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public boolean f4857VItLRw50eXTZeEfGl0;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public float f4858W3RZ2dTDKrKpS5Mxdk;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public Z9WdNiOsPR0y54zHW4 f4859WWC27LAMFqFFBzfbNw;

    /* renamed from: XdzLv4NdAtTYoEzVzB, reason: collision with root package name */
    public int f4860XdzLv4NdAtTYoEzVzB;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public int f4861XzJ1BS7H9Ilbkv4eVM;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public boolean f4862Y43RdunnpKgpbny0lE;

    /* renamed from: YlLW4G6OV9TFyuw5ix, reason: collision with root package name */
    public int f4863YlLW4G6OV9TFyuw5ix;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public ColorStateList f4864Z9WdNiOsPR0y54zHW4;

    /* renamed from: ZJNyOIPL0usMs2xSAn, reason: collision with root package name */
    public int f4865ZJNyOIPL0usMs2xSAn;

    /* renamed from: aAp6BD79BhftLCnuvf, reason: collision with root package name */
    public int f4866aAp6BD79BhftLCnuvf;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public boolean f4867aPyGSIylzVNKPT1Bls;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public final TCyPEKSzIyweCN5yp1 f4868ao3wqKm5CXFuvC0q47;

    /* renamed from: bMSdooljgH14Jgudph, reason: collision with root package name */
    public WeakReference f4869bMSdooljgH14Jgudph;

    /* renamed from: cT5Hs3CQpLK8NvlZAw, reason: collision with root package name */
    public WeakReference f4870cT5Hs3CQpLK8NvlZAw;

    /* renamed from: ctWLFN70QQINH1kyYo, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL f4871ctWLFN70QQINH1kyYo;

    /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
    public boolean f4872e2F9F6h8YJxTHwLCa0;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public int f4873e54J8UWNHWALQNixXM;

    /* renamed from: hUNBy66ZO1wVLJGW3l, reason: collision with root package name */
    public WeakReference f4874hUNBy66ZO1wVLJGW3l;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public int f4875hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f4876husNiw3snxdgZPAGJm;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public int f4877jCtUeU2YI1poCxWcjm;

    /* renamed from: k0CbjZvfUz23r8IN6W, reason: collision with root package name */
    public boolean f4878k0CbjZvfUz23r8IN6W;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f4879lEeR5KfoEr4xU5yHH7;

    /* renamed from: lLKzvdU99Iw80uVD5I, reason: collision with root package name */
    public lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL f4880lLKzvdU99Iw80uVD5I;

    /* renamed from: oocVJL811qFf0j0XXZ, reason: collision with root package name */
    public int f4881oocVJL811qFf0j0XXZ;

    /* renamed from: osrHU7fvDp2EgxZPfM, reason: collision with root package name */
    public fBZDmBPlAHk1Liuf1T.s3fjYDxWOUexjjVgyA f4882osrHU7fvDp2EgxZPfM;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int f4883pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f4884s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public boolean f4885sTkWmhpZ5b1ArQIw4K;

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public int f4886tXWeW0sqVddf7ZBflq;

    /* renamed from: udcVtCzLTM1Loe9KrX, reason: collision with root package name */
    public int f4887udcVtCzLTM1Loe9KrX;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public boolean f4888xHA29AmDt6y96AnB3t;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public float f4889zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public boolean f4890zaq8hOURtfwbcX17cG;

    /* renamed from: zcy2NNbtVXgoGQbfuq, reason: collision with root package name */
    public float f4891zcy2NNbtVXgoGQbfuq;

    public class HJFh0TGMpafqLE9haL implements hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ boolean f4892lEeR5KfoEr4xU5yHH7;

        public HJFh0TGMpafqLE9haL(boolean z) {
            this.f4892lEeR5KfoEr4xU5yHH7 = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel lEeR5KfoEr4xU5yHH7(android.view.View r11, W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel r12, WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da.zZKhbgvUfsK4AEX3r0 r13) {
            /*
                r10 = this;
                int r0 = W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel.T9PhQIpGRhE4yZDm1C.zZKhbgvUfsK4AEX3r0()
                VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ r0 = r12.KYHag8HRDlnO3X9zmZ(r0)
                int r1 = W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel.T9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL()
                VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ r1 = r12.KYHag8HRDlnO3X9zmZ(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f1805s3fjYDxWOUexjjVgyA
                com.google.android.material.bottomsheet.BottomSheetBehavior.ToH8yzk8U1nKT0PUfY(r2, r3)
                boolean r2 = WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da.TCyPEKSzIyweCN5yp1(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.XdzLv4NdAtTYoEzVzB(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.IPyIQcaNa8aB7drBED()
                com.google.android.material.bottomsheet.BottomSheetBehavior.zcy2NNbtVXgoGQbfuq(r3, r6)
                int r3 = r13.f1993zZKhbgvUfsK4AEX3r0
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.LU0fFDMACqnfIfA1AZ(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.YlLW4G6OV9TFyuw5ix(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f1990HJFh0TGMpafqLE9haL
                goto L50
            L4e:
                int r4 = r13.f1991lEeR5KfoEr4xU5yHH7
            L50:
                int r6 = r0.f1804lEeR5KfoEr4xU5yHH7
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.oocVJL811qFf0j0XXZ(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f1991lEeR5KfoEr4xU5yHH7
                goto L62
            L60:
                int r13 = r13.f1990HJFh0TGMpafqLE9haL
            L62:
                int r2 = r0.f1803HJFh0TGMpafqLE9haL
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.udcVtCzLTM1Loe9KrX(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f1804lEeR5KfoEr4xU5yHH7
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.cT5Hs3CQpLK8NvlZAw(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f1803HJFh0TGMpafqLE9haL
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.tXWeW0sqVddf7ZBflq(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f1805s3fjYDxWOUexjjVgyA
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f4892lEeR5KfoEr4xU5yHH7
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f1806zZKhbgvUfsK4AEX3r0
                com.google.android.material.bottomsheet.BottomSheetBehavior.W3RZ2dTDKrKpS5Mxdk(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.XdzLv4NdAtTYoEzVzB(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f4892lEeR5KfoEr4xU5yHH7
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.OqIo5QF00RDxUQb4qq(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(android.view.View, W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel, WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da$zZKhbgvUfsK4AEX3r0):W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel");
        }
    }

    public static class KYHag8HRDlnO3X9zmZ extends aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7 {
        public static final Parcelable.Creator<KYHag8HRDlnO3X9zmZ> CREATOR = new lEeR5KfoEr4xU5yHH7();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final int f4894HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public boolean f4895KYHag8HRDlnO3X9zmZ;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public boolean f4896TCyPEKSzIyweCN5yp1;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public boolean f4897husNiw3snxdgZPAGJm;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f4898zZKhbgvUfsK4AEX3r0;

        public class lEeR5KfoEr4xU5yHH7 implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
            public KYHag8HRDlnO3X9zmZ[] newArray(int i) {
                return new KYHag8HRDlnO3X9zmZ[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
            public KYHag8HRDlnO3X9zmZ createFromParcel(Parcel parcel) {
                return new KYHag8HRDlnO3X9zmZ(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
            public KYHag8HRDlnO3X9zmZ createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new KYHag8HRDlnO3X9zmZ(parcel, classLoader);
            }
        }

        public KYHag8HRDlnO3X9zmZ(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4894HJFh0TGMpafqLE9haL = parcel.readInt();
            this.f4898zZKhbgvUfsK4AEX3r0 = parcel.readInt();
            this.f4897husNiw3snxdgZPAGJm = parcel.readInt() == 1;
            this.f4895KYHag8HRDlnO3X9zmZ = parcel.readInt() == 1;
            this.f4896TCyPEKSzIyweCN5yp1 = parcel.readInt() == 1;
        }

        @Override // aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4894HJFh0TGMpafqLE9haL);
            parcel.writeInt(this.f4898zZKhbgvUfsK4AEX3r0);
            parcel.writeInt(this.f4897husNiw3snxdgZPAGJm ? 1 : 0);
            parcel.writeInt(this.f4895KYHag8HRDlnO3X9zmZ ? 1 : 0);
            parcel.writeInt(this.f4896TCyPEKSzIyweCN5yp1 ? 1 : 0);
        }

        public KYHag8HRDlnO3X9zmZ(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f4894HJFh0TGMpafqLE9haL = bottomSheetBehavior.f4848PPkm9uUfOJHHYveeLT;
            this.f4898zZKhbgvUfsK4AEX3r0 = bottomSheetBehavior.f4840KYHag8HRDlnO3X9zmZ;
            this.f4897husNiw3snxdgZPAGJm = bottomSheetBehavior.f4884s3fjYDxWOUexjjVgyA;
            this.f4895KYHag8HRDlnO3X9zmZ = bottomSheetBehavior.f4835DfpieXfdYs58yZAiXY;
            this.f4896TCyPEKSzIyweCN5yp1 = bottomSheetBehavior.f4872e2F9F6h8YJxTHwLCa0;
        }
    }

    public class TCyPEKSzIyweCN5yp1 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final Runnable f4899HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f4900lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f4901s3fjYDxWOUexjjVgyA;

        public class lEeR5KfoEr4xU5yHH7 implements Runnable {
            public lEeR5KfoEr4xU5yHH7() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TCyPEKSzIyweCN5yp1.this.f4901s3fjYDxWOUexjjVgyA = false;
                lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = BottomSheetBehavior.this.f4880lLKzvdU99Iw80uVD5I;
                if (hJFh0TGMpafqLE9haL != null && hJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(true)) {
                    TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1.this;
                    tCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(tCyPEKSzIyweCN5yp1.f4900lEeR5KfoEr4xU5yHH7);
                    return;
                }
                TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp12 = TCyPEKSzIyweCN5yp1.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f4848PPkm9uUfOJHHYveeLT == 2) {
                    bottomSheetBehavior.OWyIJu8lIXxQlvLhaC(tCyPEKSzIyweCN5yp12.f4900lEeR5KfoEr4xU5yHH7);
                }
            }
        }

        public TCyPEKSzIyweCN5yp1() {
            this.f4899HJFh0TGMpafqLE9haL = new lEeR5KfoEr4xU5yHH7();
        }

        public void HJFh0TGMpafqLE9haL(int i) {
            WeakReference weakReference = BottomSheetBehavior.this.f4870cT5Hs3CQpLK8NvlZAw;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f4900lEeR5KfoEr4xU5yHH7 = i;
            if (this.f4901s3fjYDxWOUexjjVgyA) {
                return;
            }
            lLKzvdU99Iw80uVD5I.ZJNyOIPL0usMs2xSAn((View) BottomSheetBehavior.this.f4870cT5Hs3CQpLK8NvlZAw.get(), this.f4899HJFh0TGMpafqLE9haL);
            this.f4901s3fjYDxWOUexjjVgyA = true;
        }

        public /* synthetic */ TCyPEKSzIyweCN5yp1(BottomSheetBehavior bottomSheetBehavior, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this();
        }
    }

    public class husNiw3snxdgZPAGJm implements THTDvPxsHqMeGb512f {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ int f4904lEeR5KfoEr4xU5yHH7;

        public husNiw3snxdgZPAGJm(int i) {
            this.f4904lEeR5KfoEr4xU5yHH7 = i;
        }

        @Override // OqIo5QF00RDxUQb4qq.THTDvPxsHqMeGb512f
        public boolean lEeR5KfoEr4xU5yHH7(View view, THTDvPxsHqMeGb512f.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            BottomSheetBehavior.this.yXUWiIShOcfJRNCmU8(this.f4904lEeR5KfoEr4xU5yHH7);
            return true;
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ View f4907lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ int f4908s3fjYDxWOUexjjVgyA;

        public lEeR5KfoEr4xU5yHH7(View view, int i) {
            this.f4907lEeR5KfoEr4xU5yHH7 = view;
            this.f4908s3fjYDxWOUexjjVgyA = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.jsjSYEu4NPZjZxcfmI(this.f4907lEeR5KfoEr4xU5yHH7, this.f4908s3fjYDxWOUexjjVgyA, false);
        }
    }

    public class s3fjYDxWOUexjjVgyA implements ValueAnimator.AnimatorUpdateListener {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f4833Acstmh57AKoSEkEFNJ != null) {
                BottomSheetBehavior.this.f4833Acstmh57AKoSEkEFNJ.oocVJL811qFf0j0XXZ(fFloatValue);
            }
        }
    }

    public class zZKhbgvUfsK4AEX3r0 extends HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public long f4910lEeR5KfoEr4xU5yHH7;

        public zZKhbgvUfsK4AEX3r0() {
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public void Acstmh57AKoSEkEFNJ(int i) {
            if (i == 1 && BottomSheetBehavior.this.f4842KqgKJKIWne3kz1AdHk) {
                BottomSheetBehavior.this.OWyIJu8lIXxQlvLhaC(1);
            }
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public boolean T9PhQIpGRhE4yZDm1C(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f4848PPkm9uUfOJHHYveeLT;
            if (i2 == 1 || bottomSheetBehavior.f4878k0CbjZvfUz23r8IN6W) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f4865ZJNyOIPL0usMs2xSAn == i) {
                WeakReference weakReference = bottomSheetBehavior.f4869bMSdooljgH14Jgudph;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f4910lEeR5KfoEr4xU5yHH7 = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f4870cT5Hs3CQpLK8NvlZAw;
            return weakReference2 != null && weakReference2.get() == view;
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public void Z9WdNiOsPR0y54zHW4(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.zXY7dgnTfw9Pd9RXel(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void e54J8UWNHWALQNixXM(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.zZKhbgvUfsK4AEX3r0.e54J8UWNHWALQNixXM(android.view.View, float, float):void");
        }

        public final boolean hoXrIDAFrSwfShk8da(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f4887udcVtCzLTM1Loe9KrX + bottomSheetBehavior.DFYiVi7zXozAjRciKa()) / 2;
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public int husNiw3snxdgZPAGJm(View view) {
            return BottomSheetBehavior.this.k0CbjZvfUz23r8IN6W() ? BottomSheetBehavior.this.f4887udcVtCzLTM1Loe9KrX : BottomSheetBehavior.this.f4847OqIo5QF00RDxUQb4qq;
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public int lEeR5KfoEr4xU5yHH7(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL.AbstractC0099HJFh0TGMpafqLE9haL
        public int s3fjYDxWOUexjjVgyA(View view, int i, int i2) {
            return ao3wqKm5CXFuvC0q47.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(i, BottomSheetBehavior.this.DFYiVi7zXozAjRciKa(), husNiw3snxdgZPAGJm(view));
        }
    }

    public BottomSheetBehavior() {
        this.f4879lEeR5KfoEr4xU5yHH7 = 0;
        this.f4884s3fjYDxWOUexjjVgyA = true;
        this.f4838HJFh0TGMpafqLE9haL = false;
        this.f4873e54J8UWNHWALQNixXM = -1;
        this.f4851T9PhQIpGRhE4yZDm1C = -1;
        this.f4868ao3wqKm5CXFuvC0q47 = new TCyPEKSzIyweCN5yp1(this, null);
        this.f4858W3RZ2dTDKrKpS5Mxdk = 0.5f;
        this.f4837GyWRxpdt1T8mEJXPoD = -1.0f;
        this.f4842KqgKJKIWne3kz1AdHk = true;
        this.f4848PPkm9uUfOJHHYveeLT = 4;
        this.f4866aAp6BD79BhftLCnuvf = 4;
        this.f4891zcy2NNbtVXgoGQbfuq = 0.1f;
        this.f4856Uj8rPa1EWADtk6Oe0S = new ArrayList();
        this.f4855Tu4WCh2gEwj8E4oHbP = -1;
        this.f4849Pum9NZyDBKoCnecvlx = new SparseIntArray();
        this.f4871ctWLFN70QQINH1kyYo = new zZKhbgvUfsK4AEX3r0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public void A49QRPHynYLCBN0SqP(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = (KYHag8HRDlnO3X9zmZ) parcelable;
        super.A49QRPHynYLCBN0SqP(coordinatorLayout, view, kYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL());
        Er40JrQbOM51vCQI8w(kYHag8HRDlnO3X9zmZ);
        int i = kYHag8HRDlnO3X9zmZ.f4894HJFh0TGMpafqLE9haL;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.f4848PPkm9uUfOJHHYveeLT = i;
        this.f4866aAp6BD79BhftLCnuvf = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public void Acstmh57AKoSEkEFNJ() {
        super.Acstmh57AKoSEkEFNJ();
        this.f4870cT5Hs3CQpLK8NvlZAw = null;
        this.f4880lLKzvdU99Iw80uVD5I = null;
        this.f4882osrHU7fvDp2EgxZPfM = null;
    }

    public void Bc5OTyAfOKVCQb8CEz(boolean z) {
        if (this.f4835DfpieXfdYs58yZAiXY != z) {
            this.f4835DfpieXfdYs58yZAiXY = z;
            if (!z && this.f4848PPkm9uUfOJHHYveeLT == 5) {
                yXUWiIShOcfJRNCmU8(4);
            }
            EscIOBqRhG6irG5q11();
        }
    }

    public final void CSih7GetOUab1dYQjM() {
        this.f4886tXWeW0sqVddf7ZBflq = (int) (this.f4887udcVtCzLTM1Loe9KrX * (1.0f - this.f4858W3RZ2dTDKrKpS5Mxdk));
    }

    public int DFYiVi7zXozAjRciKa() {
        if (this.f4884s3fjYDxWOUexjjVgyA) {
            return this.f4861XzJ1BS7H9Ilbkv4eVM;
        }
        return Math.max(this.f4877jCtUeU2YI1poCxWcjm, this.f4862Y43RdunnpKgpbny0lE ? 0 : this.f4832A49QRPHynYLCBN0SqP);
    }

    public final void Er40JrQbOM51vCQI8w(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        int i = this.f4879lEeR5KfoEr4xU5yHH7;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f4840KYHag8HRDlnO3X9zmZ = kYHag8HRDlnO3X9zmZ.f4898zZKhbgvUfsK4AEX3r0;
        }
        if (i == -1 || (i & 2) == 2) {
            this.f4884s3fjYDxWOUexjjVgyA = kYHag8HRDlnO3X9zmZ.f4897husNiw3snxdgZPAGJm;
        }
        if (i == -1 || (i & 4) == 4) {
            this.f4835DfpieXfdYs58yZAiXY = kYHag8HRDlnO3X9zmZ.f4895KYHag8HRDlnO3X9zmZ;
        }
        if (i == -1 || (i & 8) == 8) {
            this.f4872e2F9F6h8YJxTHwLCa0 = kYHag8HRDlnO3X9zmZ.f4896TCyPEKSzIyweCN5yp1;
        }
    }

    public final void EscIOBqRhG6irG5q11() {
        WeakReference weakReference = this.f4870cT5Hs3CQpLK8NvlZAw;
        if (weakReference != null) {
            g0OBkYSIvp0JYnHPjC((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f4874hUNBy66ZO1wVLJGW3l;
        if (weakReference2 != null) {
            g0OBkYSIvp0JYnHPjC((View) weakReference2.get(), 1);
        }
    }

    public final void Fo9071MN8vwEWamAUX() {
        this.f4865ZJNyOIPL0usMs2xSAn = -1;
        this.f4855Tu4WCh2gEwj8E4oHbP = -1;
        VelocityTracker velocityTracker = this.f4834CSih7GetOUab1dYQjM;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4834CSih7GetOUab1dYQjM = null;
        }
    }

    public final int FtYx4GXtxwA8al5hBy(int i) {
        if (i == 3) {
            return DFYiVi7zXozAjRciKa();
        }
        if (i == 4) {
            return this.f4847OqIo5QF00RDxUQb4qq;
        }
        if (i == 5) {
            return this.f4887udcVtCzLTM1Loe9KrX;
        }
        if (i == 6) {
            return this.f4886tXWeW0sqVddf7ZBflq;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    public void HR5vAalpgOKVm2T0Gq(boolean z) {
        this.f4867aPyGSIylzVNKPT1Bls = z;
    }

    public void HZ4bptRS9XIcK1CV95(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f4877jCtUeU2YI1poCxWcjm = i;
        PDw1hXOtArGjUqFgpT(this.f4848PPkm9uUfOJHHYveeLT, true);
    }

    public boolean JXsqbvi9UKxeF3HXpU() {
        return false;
    }

    public final boolean Jsouc4ileb8SxQhxbX() {
        return this.f4848PPkm9uUfOJHHYveeLT == 3 && (this.f4857VItLRw50eXTZeEfGl0 || xMfAHy6F7qK0zhxhKG());
    }

    public final void Kh0uC90qEEhuLdpgB9(View view, int i) {
        if (view == null) {
            return;
        }
        lLKzvdU99Iw80uVD5I.k0CbjZvfUz23r8IN6W(view, 524288);
        lLKzvdU99Iw80uVD5I.k0CbjZvfUz23r8IN6W(view, 262144);
        lLKzvdU99Iw80uVD5I.k0CbjZvfUz23r8IN6W(view, 1048576);
        int i2 = this.f4849Pum9NZyDBKoCnecvlx.get(i, -1);
        if (i2 != -1) {
            lLKzvdU99Iw80uVD5I.k0CbjZvfUz23r8IN6W(view, i2);
            this.f4849Pum9NZyDBKoCnecvlx.delete(i);
        }
    }

    public final void LFGi8lLul9XOP250o9(boolean z) {
        View view;
        if (this.f4870cT5Hs3CQpLK8NvlZAw != null) {
            bMSdooljgH14Jgudph();
            if (this.f4848PPkm9uUfOJHHYveeLT != 4 || (view = (View) this.f4870cT5Hs3CQpLK8NvlZAw.get()) == null) {
                return;
            }
            if (z) {
                yXUWiIShOcfJRNCmU8(4);
            } else {
                view.requestLayout();
            }
        }
    }

    public final boolean O1furmptfI76BGfN0d(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && lLKzvdU99Iw80uVD5I.aAp6BD79BhftLCnuvf(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OUd9THiLjZndMj0qdF(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.DFYiVi7zXozAjRciKa()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.OWyIJu8lIXxQlvLhaC(r0)
            return
        Lf:
            boolean r3 = r2.iQCvttGuB7nx4r7kMP()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f4869bMSdooljgH14Jgudph
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f4844LU0fFDMACqnfIfA1AZ
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f4860XdzLv4NdAtTYoEzVzB
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f4884s3fjYDxWOUexjjVgyA
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f4886tXWeW0sqVddf7ZBflq
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f4835DfpieXfdYs58yZAiXY
            if (r3 == 0) goto L49
            float r3 = r2.ayduHasC7VpxsVXE0T()
            boolean r3 = r2.e5tXAuLbtMC3XyEoX9(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f4860XdzLv4NdAtTYoEzVzB
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f4884s3fjYDxWOUexjjVgyA
            if (r1 == 0) goto L68
            int r5 = r2.f4861XzJ1BS7H9Ilbkv4eVM
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f4847OqIo5QF00RDxUQb4qq
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f4886tXWeW0sqVddf7ZBflq
            if (r3 >= r1) goto L7e
            int r1 = r2.f4847OqIo5QF00RDxUQb4qq
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.JXsqbvi9UKxeF3HXpU()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f4847OqIo5QF00RDxUQb4qq
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f4884s3fjYDxWOUexjjVgyA
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f4886tXWeW0sqVddf7ZBflq
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f4847OqIo5QF00RDxUQb4qq
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.jsjSYEu4NPZjZxcfmI(r4, r0, r3)
            r2.f4844LU0fFDMACqnfIfA1AZ = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.OUd9THiLjZndMj0qdF(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void OWyIJu8lIXxQlvLhaC(int i) {
        if (this.f4848PPkm9uUfOJHHYveeLT == i) {
            return;
        }
        this.f4848PPkm9uUfOJHHYveeLT = i;
        if (i == 4 || i == 3 || i == 6 || (this.f4835DfpieXfdYs58yZAiXY && i == 5)) {
            this.f4866aAp6BD79BhftLCnuvf = i;
        }
        WeakReference weakReference = this.f4870cT5Hs3CQpLK8NvlZAw;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            h7m69eGbRk1hyaVt28(true);
        } else if (i == 6 || i == 5 || i == 4) {
            h7m69eGbRk1hyaVt28(false);
        }
        PDw1hXOtArGjUqFgpT(i, true);
        if (this.f4856Uj8rPa1EWADtk6Oe0S.size() <= 0) {
            EscIOBqRhG6irG5q11();
        } else {
            androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this.f4856Uj8rPa1EWADtk6Oe0S.get(0));
            throw null;
        }
    }

    public final void PDw1hXOtArGjUqFgpT(int i, boolean z) {
        boolean zJsouc4ileb8SxQhxbX;
        ValueAnimator valueAnimator;
        if (i == 2 || this.f4853THTDvPxsHqMeGb512f == (zJsouc4ileb8SxQhxbX = Jsouc4ileb8SxQhxbX()) || this.f4833Acstmh57AKoSEkEFNJ == null) {
            return;
        }
        this.f4853THTDvPxsHqMeGb512f = zJsouc4ileb8SxQhxbX;
        if (!z || (valueAnimator = this.f4846OUd9THiLjZndMj0qdF) == null) {
            ValueAnimator valueAnimator2 = this.f4846OUd9THiLjZndMj0qdF;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f4846OUd9THiLjZndMj0qdF.cancel();
            }
            this.f4833Acstmh57AKoSEkEFNJ.oocVJL811qFf0j0XXZ(this.f4853THTDvPxsHqMeGb512f ? osrHU7fvDp2EgxZPfM() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f4846OUd9THiLjZndMj0qdF.reverse();
        } else {
            this.f4846OUd9THiLjZndMj0qdF.setFloatValues(this.f4833Acstmh57AKoSEkEFNJ.LIMtzhnLwQyigzK0KO(), zJsouc4ileb8SxQhxbX ? osrHU7fvDp2EgxZPfM() : 1.0f);
            this.f4846OUd9THiLjZndMj0qdF.start();
        }
    }

    public final THTDvPxsHqMeGb512f Pum9NZyDBKoCnecvlx(int i) {
        return new husNiw3snxdgZPAGJm(i);
    }

    public boolean QW0Trt6m3nVBNaYFnP(long j, float f) {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public void R9SAhYMerGybF9OAjL(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean T9PhQIpGRhE4yZDm1C(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(evSiTWao80SbJUZk9E(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f4873e54J8UWNHWALQNixXM, marginLayoutParams.width), evSiTWao80SbJUZk9E(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f4851T9PhQIpGRhE4yZDm1C, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public void TCyPEKSzIyweCN5yp1(CoordinatorLayout.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        super.TCyPEKSzIyweCN5yp1(husniw3snxdgzpagjm);
        this.f4870cT5Hs3CQpLK8NvlZAw = null;
        this.f4880lLKzvdU99Iw80uVD5I = null;
        this.f4882osrHU7fvDp2EgxZPfM = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean THTDvPxsHqMeGb512f(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.f4860XdzLv4NdAtTYoEzVzB = 0;
        this.f4844LU0fFDMACqnfIfA1AZ = false;
        return (i & 2) != 0;
    }

    public final float Tu4WCh2gEwj8E4oHbP(int i) {
        float f;
        float fDFYiVi7zXozAjRciKa;
        int i2 = this.f4847OqIo5QF00RDxUQb4qq;
        if (i > i2 || i2 == DFYiVi7zXozAjRciKa()) {
            int i3 = this.f4847OqIo5QF00RDxUQb4qq;
            f = i3 - i;
            fDFYiVi7zXozAjRciKa = this.f4887udcVtCzLTM1Loe9KrX - i3;
        } else {
            int i4 = this.f4847OqIo5QF00RDxUQb4qq;
            f = i4 - i;
            fDFYiVi7zXozAjRciKa = i4 - DFYiVi7zXozAjRciKa();
        }
        return f / fDFYiVi7zXozAjRciKa;
    }

    public final float Uj8rPa1EWADtk6Oe0S(float f, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f > 0.0f) {
                return radius / f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public Parcelable VItLRw50eXTZeEfGl0(CoordinatorLayout coordinatorLayout, View view) {
        return new KYHag8HRDlnO3X9zmZ(super.VItLRw50eXTZeEfGl0(coordinatorLayout, view), this);
    }

    public final void Ywqw2A0s86HeuFkDt0(View view, Runnable runnable) {
        if (O1furmptfI76BGfN0d(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean Z9WdNiOsPR0y54zHW4(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL;
        if (!view.isShown() || !this.f4842KqgKJKIWne3kz1AdHk) {
            this.f4854ToH8yzk8U1nKT0PUfY = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Fo9071MN8vwEWamAUX();
        }
        if (this.f4834CSih7GetOUab1dYQjM == null) {
            this.f4834CSih7GetOUab1dYQjM = VelocityTracker.obtain();
        }
        this.f4834CSih7GetOUab1dYQjM.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f4855Tu4WCh2gEwj8E4oHbP = (int) motionEvent.getY();
            if (this.f4848PPkm9uUfOJHHYveeLT != 2) {
                WeakReference weakReference = this.f4869bMSdooljgH14Jgudph;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.WWC27LAMFqFFBzfbNw(view2, x, this.f4855Tu4WCh2gEwj8E4oHbP)) {
                    this.f4865ZJNyOIPL0usMs2xSAn = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f4878k0CbjZvfUz23r8IN6W = true;
                }
            }
            this.f4854ToH8yzk8U1nKT0PUfY = this.f4865ZJNyOIPL0usMs2xSAn == -1 && !coordinatorLayout.WWC27LAMFqFFBzfbNw(view, x, this.f4855Tu4WCh2gEwj8E4oHbP);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4878k0CbjZvfUz23r8IN6W = false;
            this.f4865ZJNyOIPL0usMs2xSAn = -1;
            if (this.f4854ToH8yzk8U1nKT0PUfY) {
                this.f4854ToH8yzk8U1nKT0PUfY = false;
                return false;
            }
        }
        if (!this.f4854ToH8yzk8U1nKT0PUfY && (hJFh0TGMpafqLE9haL = this.f4880lLKzvdU99Iw80uVD5I) != null && hJFh0TGMpafqLE9haL.W3RZ2dTDKrKpS5Mxdk(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f4869bMSdooljgH14Jgudph;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f4854ToH8yzk8U1nKT0PUfY || this.f4848PPkm9uUfOJHHYveeLT == 1 || coordinatorLayout.WWC27LAMFqFFBzfbNw(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f4880lLKzvdU99Iw80uVD5I == null || (i = this.f4855Tu4WCh2gEwj8E4oHbP) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f4880lLKzvdU99Iw80uVD5I.G7AC3DWIx9i9fdanjk())) ? false : true;
    }

    public final int ZJNyOIPL0usMs2xSAn() {
        int i;
        return this.f4852TCyPEKSzIyweCN5yp1 ? Math.min(Math.max(this.f4839IPyIQcaNa8aB7drBED, this.f4887udcVtCzLTM1Loe9KrX - ((this.f4881oocVJL811qFf0j0XXZ * 9) / 16)), this.f4863YlLW4G6OV9TFyuw5ix) + this.f4843LIMtzhnLwQyigzK0KO : (this.f4867aPyGSIylzVNKPT1Bls || this.f4845OANkd3mP6AYvwbNLJM || (i = this.f4875hoXrIDAFrSwfShk8da) <= 0) ? this.f4840KYHag8HRDlnO3X9zmZ + this.f4843LIMtzhnLwQyigzK0KO : Math.max(this.f4840KYHag8HRDlnO3X9zmZ, i + this.f4883pbVGzGjWvY2LDXC8vo);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean aPyGSIylzVNKPT1Bls(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        WeakReference weakReference;
        if (iQCvttGuB7nx4r7kMP() && (weakReference = this.f4869bMSdooljgH14Jgudph) != null && view2 == weakReference.get()) {
            return this.f4848PPkm9uUfOJHHYveeLT != 3 || super.aPyGSIylzVNKPT1Bls(coordinatorLayout, view, view2, f, f2);
        }
        return false;
    }

    public void aRQ2M7vtRaPDEyvpdv(boolean z) {
        if (this.f4884s3fjYDxWOUexjjVgyA == z) {
            return;
        }
        this.f4884s3fjYDxWOUexjjVgyA = z;
        if (this.f4870cT5Hs3CQpLK8NvlZAw != null) {
            bMSdooljgH14Jgudph();
        }
        OWyIJu8lIXxQlvLhaC((this.f4884s3fjYDxWOUexjjVgyA && this.f4848PPkm9uUfOJHHYveeLT == 6) ? 3 : this.f4848PPkm9uUfOJHHYveeLT);
        PDw1hXOtArGjUqFgpT(this.f4848PPkm9uUfOJHHYveeLT, true);
        EscIOBqRhG6irG5q11();
    }

    public void aUn6Hqsqw2PVM8685Z(int i) {
        this.f4851T9PhQIpGRhE4yZDm1C = i;
    }

    public final float ayduHasC7VpxsVXE0T() {
        VelocityTracker velocityTracker = this.f4834CSih7GetOUab1dYQjM;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f4889zZKhbgvUfsK4AEX3r0);
        return this.f4834CSih7GetOUab1dYQjM.getYVelocity(this.f4865ZJNyOIPL0usMs2xSAn);
    }

    public boolean bBVlTkqEpHW053CjWL() {
        return this.f4835DfpieXfdYs58yZAiXY;
    }

    public final void bMSdooljgH14Jgudph() {
        int iZJNyOIPL0usMs2xSAn = ZJNyOIPL0usMs2xSAn();
        if (this.f4884s3fjYDxWOUexjjVgyA) {
            this.f4847OqIo5QF00RDxUQb4qq = Math.max(this.f4887udcVtCzLTM1Loe9KrX - iZJNyOIPL0usMs2xSAn, this.f4861XzJ1BS7H9Ilbkv4eVM);
        } else {
            this.f4847OqIo5QF00RDxUQb4qq = this.f4887udcVtCzLTM1Loe9KrX - iZJNyOIPL0usMs2xSAn;
        }
    }

    public final void ctWLFN70QQINH1kyYo(Context context) {
        if (this.f4859WWC27LAMFqFFBzfbNw == null) {
            return;
        }
        ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1(this.f4859WWC27LAMFqFFBzfbNw);
        this.f4833Acstmh57AKoSEkEFNJ = tCyPEKSzIyweCN5yp1;
        tCyPEKSzIyweCN5yp1.DfpieXfdYs58yZAiXY(context);
        ColorStateList colorStateList = this.f4864Z9WdNiOsPR0y54zHW4;
        if (colorStateList != null) {
            this.f4833Acstmh57AKoSEkEFNJ.YlLW4G6OV9TFyuw5ix(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f4833Acstmh57AKoSEkEFNJ.setTint(typedValue.data);
    }

    public final boolean d4ZdBAtGyjVWTQYsYn() {
        return this.f4880lLKzvdU99Iw80uVD5I != null && (this.f4842KqgKJKIWne3kz1AdHk || this.f4848PPkm9uUfOJHHYveeLT == 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[PHI: r5 r7
      0x009c: PHI (r5v23 int) = (r5v22 int), (r5v24 int) binds: [B:34:0x00a6, B:29:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r7v7 int) = (r7v5 int), (r7v2 int) binds: [B:34:0x00a6, B:29:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e54J8UWNHWALQNixXM(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, int r7) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e54J8UWNHWALQNixXM(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public boolean e5tXAuLbtMC3XyEoX9(View view, float f) {
        if (this.f4872e2F9F6h8YJxTHwLCa0) {
            return true;
        }
        if (yvdWWG9COQQotjfedH() && view.getTop() >= this.f4847OqIo5QF00RDxUQb4qq) {
            return Math.abs((((float) view.getTop()) + (f * this.f4891zcy2NNbtVXgoGQbfuq)) - ((float) this.f4847OqIo5QF00RDxUQb4qq)) / ((float) ZJNyOIPL0usMs2xSAn()) > 0.5f;
        }
        return false;
    }

    public View eWK41qw3g36LVd4UnS(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (lLKzvdU99Iw80uVD5I.ToH8yzk8U1nKT0PUfY(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewEWK41qw3g36LVd4UnS = eWK41qw3g36LVd4UnS(viewGroup.getChildAt(i));
                if (viewEWK41qw3g36LVd4UnS != null) {
                    return viewEWK41qw3g36LVd4UnS;
                }
            }
        }
        return null;
    }

    public final int evSiTWao80SbJUZk9E(int i, int i2, int i3, int i4) {
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

    public void f2zPq7MOnQrtOlZ1Zg(boolean z) {
        this.f4842KqgKJKIWne3kz1AdHk = z;
    }

    public void fDXXEWvhMVO3O8mnuS(int i) {
        this.f4873e54J8UWNHWALQNixXM = i;
    }

    public boolean fLSSbwbzFBVpwBH5FM() {
        return this.f4867aPyGSIylzVNKPT1Bls;
    }

    public final void g0OBkYSIvp0JYnHPjC(View view, int i) {
        int i2;
        A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7;
        if (view == null) {
            return;
        }
        Kh0uC90qEEhuLdpgB9(view, i);
        if (!this.f4884s3fjYDxWOUexjjVgyA && this.f4848PPkm9uUfOJHHYveeLT != 6) {
            this.f4849Pum9NZyDBKoCnecvlx.put(i, hUNBy66ZO1wVLJGW3l(view, IPyIQcaNa8aB7drBED.f7063lEeR5KfoEr4xU5yHH7, 6));
        }
        if (this.f4835DfpieXfdYs58yZAiXY && yvdWWG9COQQotjfedH() && this.f4848PPkm9uUfOJHHYveeLT != 5) {
            yL2E9nlEZpg8ZZx8XE(view, A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1218VItLRw50eXTZeEfGl0, 5);
        }
        int i3 = this.f4848PPkm9uUfOJHHYveeLT;
        if (i3 == 3) {
            i2 = this.f4884s3fjYDxWOUexjjVgyA ? 4 : 6;
            leer5kfoer4xu5yhh7 = A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1199A49QRPHynYLCBN0SqP;
        } else {
            if (i3 != 4) {
                if (i3 != 6) {
                    return;
                }
                yL2E9nlEZpg8ZZx8XE(view, A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1199A49QRPHynYLCBN0SqP, 4);
                yL2E9nlEZpg8ZZx8XE(view, A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1207LIMtzhnLwQyigzK0KO, 3);
                return;
            }
            i2 = this.f4884s3fjYDxWOUexjjVgyA ? 3 : 6;
            leer5kfoer4xu5yhh7 = A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1207LIMtzhnLwQyigzK0KO;
        }
        yL2E9nlEZpg8ZZx8XE(view, leer5kfoer4xu5yhh7, i2);
    }

    public final void h7m69eGbRk1hyaVt28(boolean z) {
        Map map;
        int iIntValue;
        WeakReference weakReference = this.f4870cT5Hs3CQpLK8NvlZAw;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f4841Kh0uC90qEEhuLdpgB9 != null) {
                    return;
                } else {
                    this.f4841Kh0uC90qEEhuLdpgB9 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f4870cT5Hs3CQpLK8NvlZAw.get()) {
                    if (z) {
                        this.f4841Kh0uC90qEEhuLdpgB9.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f4838HJFh0TGMpafqLE9haL) {
                            iIntValue = 4;
                            lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(childAt, iIntValue);
                        }
                    } else if (this.f4838HJFh0TGMpafqLE9haL && (map = this.f4841Kh0uC90qEEhuLdpgB9) != null && map.containsKey(childAt)) {
                        iIntValue = ((Integer) this.f4841Kh0uC90qEEhuLdpgB9.get(childAt)).intValue();
                        lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(childAt, iIntValue);
                    }
                }
            }
            if (!z) {
                this.f4841Kh0uC90qEEhuLdpgB9 = null;
            } else if (this.f4838HJFh0TGMpafqLE9haL) {
                ((View) this.f4870cT5Hs3CQpLK8NvlZAw.get()).sendAccessibilityEvent(8);
            }
        }
    }

    public final int hUNBy66ZO1wVLJGW3l(View view, int i, int i2) {
        return lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL(view, view.getResources().getString(i), Pum9NZyDBKoCnecvlx(i2));
    }

    public final void i8aHOwH04efS6lZ3Oa(int i, boolean z) {
        if (i == -1) {
            if (this.f4852TCyPEKSzIyweCN5yp1) {
                return;
            } else {
                this.f4852TCyPEKSzIyweCN5yp1 = true;
            }
        } else {
            if (!this.f4852TCyPEKSzIyweCN5yp1 && this.f4840KYHag8HRDlnO3X9zmZ == i) {
                return;
            }
            this.f4852TCyPEKSzIyweCN5yp1 = false;
            this.f4840KYHag8HRDlnO3X9zmZ = Math.max(0, i);
        }
        LFGi8lLul9XOP250o9(z);
    }

    public boolean iQCvttGuB7nx4r7kMP() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean jCtUeU2YI1poCxWcjm(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4848PPkm9uUfOJHHYveeLT == 1 && actionMasked == 0) {
            return true;
        }
        if (d4ZdBAtGyjVWTQYsYn()) {
            this.f4880lLKzvdU99Iw80uVD5I.WWC27LAMFqFFBzfbNw(motionEvent);
        }
        if (actionMasked == 0) {
            Fo9071MN8vwEWamAUX();
        }
        if (this.f4834CSih7GetOUab1dYQjM == null) {
            this.f4834CSih7GetOUab1dYQjM = VelocityTracker.obtain();
        }
        this.f4834CSih7GetOUab1dYQjM.addMovement(motionEvent);
        if (d4ZdBAtGyjVWTQYsYn() && actionMasked == 2 && !this.f4854ToH8yzk8U1nKT0PUfY && Math.abs(this.f4855Tu4WCh2gEwj8E4oHbP - motionEvent.getY()) > this.f4880lLKzvdU99Iw80uVD5I.G7AC3DWIx9i9fdanjk()) {
            this.f4880lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f4854ToH8yzk8U1nKT0PUfY;
    }

    public final void jocVUfxESVhVJU8LoH() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(osrHU7fvDp2EgxZPfM(), 1.0f);
        this.f4846OUd9THiLjZndMj0qdF = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f4846OUd9THiLjZndMj0qdF.addUpdateListener(new s3fjYDxWOUexjjVgyA());
    }

    public final void jsjSYEu4NPZjZxcfmI(View view, int i, boolean z) {
        int iFtYx4GXtxwA8al5hBy = FtYx4GXtxwA8al5hBy(i);
        lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4880lLKzvdU99Iw80uVD5I;
        if (hJFh0TGMpafqLE9haL == null || (!z ? hJFh0TGMpafqLE9haL.OqIo5QF00RDxUQb4qq(view, view.getLeft(), iFtYx4GXtxwA8al5hBy) : hJFh0TGMpafqLE9haL.tXWeW0sqVddf7ZBflq(view.getLeft(), iFtYx4GXtxwA8al5hBy))) {
            OWyIJu8lIXxQlvLhaC(i);
            return;
        }
        OWyIJu8lIXxQlvLhaC(2);
        PDw1hXOtArGjUqFgpT(i, true);
        this.f4868ao3wqKm5CXFuvC0q47.HJFh0TGMpafqLE9haL(i);
    }

    public final boolean k0CbjZvfUz23r8IN6W() {
        return bBVlTkqEpHW053CjWL() && yvdWWG9COQQotjfedH();
    }

    public final void oOMFI1Dcqcg1BSVNty(View view) {
        boolean z = (Build.VERSION.SDK_INT < 29 || fLSSbwbzFBVpwBH5FM() || this.f4852TCyPEKSzIyweCN5yp1) ? false : true;
        if (this.f4845OANkd3mP6AYvwbNLJM || this.f4890zaq8hOURtfwbcX17cG || this.f4885sTkWmhpZ5b1ArQIw4K || this.f4850R9SAhYMerGybF9OAjL || this.f4836G7AC3DWIx9i9fdanjk || this.f4888xHA29AmDt6y96AnB3t || z) {
            hoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA(view, new HJFh0TGMpafqLE9haL(z));
        }
    }

    public void oXIAAdret8ERrYfuyf(boolean z) {
        this.f4872e2F9F6h8YJxTHwLCa0 = z;
    }

    public final float osrHU7fvDp2EgxZPfM() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f4833Acstmh57AKoSEkEFNJ == null || (weakReference = this.f4870cT5Hs3CQpLK8NvlZAw) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f4870cT5Hs3CQpLK8NvlZAw.get();
        if (!xMfAHy6F7qK0zhxhKG() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(Uj8rPa1EWADtk6Oe0S(this.f4833Acstmh57AKoSEkEFNJ.OUd9THiLjZndMj0qdF(), rootWindowInsets.getRoundedCorner(0)), Uj8rPa1EWADtk6Oe0S(this.f4833Acstmh57AKoSEkEFNJ.jCtUeU2YI1poCxWcjm(), rootWindowInsets.getRoundedCorner(1)));
    }

    public void owCQzRKpGarpL4247z(int i) {
        this.f4879lEeR5KfoEr4xU5yHH7 = i;
    }

    public void pgB7Gmjz55y9NQYnAD(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f4858W3RZ2dTDKrKpS5Mxdk = f;
        if (this.f4870cT5Hs3CQpLK8NvlZAw != null) {
            CSih7GetOUab1dYQjM();
        }
    }

    public boolean tmIBXGVvBsrJ7i63G2() {
        return true;
    }

    public void uAIIhSQWhOmxUb3Bqo(int i) {
        this.f4876husNiw3snxdgZPAGJm = i;
    }

    public void vlBaBOcZ1q1ndWVoXn(int i) {
        i8aHOwH04efS6lZ3Oa(i, false);
    }

    public final boolean xMfAHy6F7qK0zhxhKG() {
        WeakReference weakReference = this.f4870cT5Hs3CQpLK8NvlZAw;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f4870cT5Hs3CQpLK8NvlZAw.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void yL2E9nlEZpg8ZZx8XE(View view, A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i) {
        lLKzvdU99Iw80uVD5I.Pum9NZyDBKoCnecvlx(view, leer5kfoer4xu5yhh7, null, Pum9NZyDBKoCnecvlx(i));
    }

    public void yXUWiIShOcfJRNCmU8(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f4835DfpieXfdYs58yZAiXY && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f4884s3fjYDxWOUexjjVgyA && FtYx4GXtxwA8al5hBy(i) <= this.f4861XzJ1BS7H9Ilbkv4eVM) ? 3 : i;
        WeakReference weakReference = this.f4870cT5Hs3CQpLK8NvlZAw;
        if (weakReference == null || weakReference.get() == null) {
            OWyIJu8lIXxQlvLhaC(i);
        } else {
            View view = (View) this.f4870cT5Hs3CQpLK8NvlZAw.get();
            Ywqw2A0s86HeuFkDt0(view, new lEeR5KfoEr4xU5yHH7(view, i2));
        }
    }

    public boolean yvdWWG9COQQotjfedH() {
        return true;
    }

    public void zXY7dgnTfw9Pd9RXel(int i) {
        if (((View) this.f4870cT5Hs3CQpLK8NvlZAw.get()) == null || this.f4856Uj8rPa1EWADtk6Oe0S.isEmpty()) {
            return;
        }
        Tu4WCh2gEwj8E4oHbP(i);
        if (this.f4856Uj8rPa1EWADtk6Oe0S.size() <= 0) {
            return;
        }
        androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this.f4856Uj8rPa1EWADtk6Oe0S.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public void zaq8hOURtfwbcX17cG(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f4869bMSdooljgH14Jgudph;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!iQCvttGuB7nx4r7kMP() || view2 == view3) {
            int top = view.getTop();
            int i5 = top - i2;
            if (i2 > 0) {
                if (i5 < DFYiVi7zXozAjRciKa()) {
                    int iDFYiVi7zXozAjRciKa = top - DFYiVi7zXozAjRciKa();
                    iArr[1] = iDFYiVi7zXozAjRciKa;
                    lLKzvdU99Iw80uVD5I.udcVtCzLTM1Loe9KrX(view, -iDFYiVi7zXozAjRciKa);
                    i4 = 3;
                    OWyIJu8lIXxQlvLhaC(i4);
                } else {
                    if (!this.f4842KqgKJKIWne3kz1AdHk) {
                        return;
                    }
                    iArr[1] = i2;
                    lLKzvdU99Iw80uVD5I.udcVtCzLTM1Loe9KrX(view, -i2);
                    OWyIJu8lIXxQlvLhaC(1);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                if (i5 > this.f4847OqIo5QF00RDxUQb4qq && !k0CbjZvfUz23r8IN6W()) {
                    int i6 = top - this.f4847OqIo5QF00RDxUQb4qq;
                    iArr[1] = i6;
                    lLKzvdU99Iw80uVD5I.udcVtCzLTM1Loe9KrX(view, -i6);
                    i4 = 4;
                    OWyIJu8lIXxQlvLhaC(i4);
                } else {
                    if (!this.f4842KqgKJKIWne3kz1AdHk) {
                        return;
                    }
                    iArr[1] = i2;
                    lLKzvdU99Iw80uVD5I.udcVtCzLTM1Loe9KrX(view, -i2);
                    OWyIJu8lIXxQlvLhaC(1);
                }
            }
            zXY7dgnTfw9Pd9RXel(view.getTop());
            this.f4860XdzLv4NdAtTYoEzVzB = i2;
            this.f4844LU0fFDMACqnfIfA1AZ = true;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f4879lEeR5KfoEr4xU5yHH7 = 0;
        this.f4884s3fjYDxWOUexjjVgyA = true;
        this.f4838HJFh0TGMpafqLE9haL = false;
        this.f4873e54J8UWNHWALQNixXM = -1;
        this.f4851T9PhQIpGRhE4yZDm1C = -1;
        this.f4868ao3wqKm5CXFuvC0q47 = new TCyPEKSzIyweCN5yp1(this, null);
        this.f4858W3RZ2dTDKrKpS5Mxdk = 0.5f;
        this.f4837GyWRxpdt1T8mEJXPoD = -1.0f;
        this.f4842KqgKJKIWne3kz1AdHk = true;
        this.f4848PPkm9uUfOJHHYveeLT = 4;
        this.f4866aAp6BD79BhftLCnuvf = 4;
        this.f4891zcy2NNbtVXgoGQbfuq = 0.1f;
        this.f4856Uj8rPa1EWADtk6Oe0S = new ArrayList();
        this.f4855Tu4WCh2gEwj8E4oHbP = -1;
        this.f4849Pum9NZyDBKoCnecvlx = new SparseIntArray();
        this.f4871ctWLFN70QQINH1kyYo = new zZKhbgvUfsK4AEX3r0();
        this.f4883pbVGzGjWvY2LDXC8vo = context.getResources().getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7009LU0fFDMACqnfIfA1AZ);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Acstmh57AKoSEkEFNJ.f6835A49QRPHynYLCBN0SqP);
        if (typedArrayObtainStyledAttributes.hasValue(Acstmh57AKoSEkEFNJ.f6914ao3wqKm5CXFuvC0q47)) {
            this.f4864Z9WdNiOsPR0y54zHW4 = hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(context, typedArrayObtainStyledAttributes, Acstmh57AKoSEkEFNJ.f6914ao3wqKm5CXFuvC0q47);
        }
        if (typedArrayObtainStyledAttributes.hasValue(Acstmh57AKoSEkEFNJ.f6905YlLW4G6OV9TFyuw5ix)) {
            this.f4859WWC27LAMFqFFBzfbNw = Z9WdNiOsPR0y54zHW4.husNiw3snxdgZPAGJm(context, attributeSet, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7151lEeR5KfoEr4xU5yHH7, f4831jocVUfxESVhVJU8LoH).T9PhQIpGRhE4yZDm1C();
        }
        ctWLFN70QQINH1kyYo(context);
        jocVUfxESVhVJU8LoH();
        this.f4837GyWRxpdt1T8mEJXPoD = typedArrayObtainStyledAttributes.getDimension(Acstmh57AKoSEkEFNJ.f6888THTDvPxsHqMeGb512f, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(Acstmh57AKoSEkEFNJ.f6894VItLRw50eXTZeEfGl0)) {
            fDXXEWvhMVO3O8mnuS(typedArrayObtainStyledAttributes.getDimensionPixelSize(Acstmh57AKoSEkEFNJ.f6894VItLRw50eXTZeEfGl0, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(Acstmh57AKoSEkEFNJ.f6896WWC27LAMFqFFBzfbNw)) {
            aUn6Hqsqw2PVM8685Z(typedArrayObtainStyledAttributes.getDimensionPixelSize(Acstmh57AKoSEkEFNJ.f6896WWC27LAMFqFFBzfbNw, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(Acstmh57AKoSEkEFNJ.f6877OqIo5QF00RDxUQb4qq);
        vlBaBOcZ1q1ndWVoXn((typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) ? typedArrayObtainStyledAttributes.getDimensionPixelSize(Acstmh57AKoSEkEFNJ.f6877OqIo5QF00RDxUQb4qq, -1) : i);
        Bc5OTyAfOKVCQb8CEz(typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6895W3RZ2dTDKrKpS5Mxdk, false));
        HR5vAalpgOKVm2T0Gq(typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6865KqgKJKIWne3kz1AdHk, false));
        aRQ2M7vtRaPDEyvpdv(typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6901XzJ1BS7H9Ilbkv4eVM, true));
        oXIAAdret8ERrYfuyf(typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6927e2F9F6h8YJxTHwLCa0, false));
        f2zPq7MOnQrtOlZ1Zg(typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6875OUd9THiLjZndMj0qdF, true));
        owCQzRKpGarpL4247z(typedArrayObtainStyledAttributes.getInt(Acstmh57AKoSEkEFNJ.f6854GyWRxpdt1T8mEJXPoD, 0));
        pgB7Gmjz55y9NQYnAD(typedArrayObtainStyledAttributes.getFloat(Acstmh57AKoSEkEFNJ.f6976tXWeW0sqVddf7ZBflq, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(Acstmh57AKoSEkEFNJ.f6950jCtUeU2YI1poCxWcjm);
        HZ4bptRS9XIcK1CV95((typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(Acstmh57AKoSEkEFNJ.f6950jCtUeU2YI1poCxWcjm, 0) : typedValuePeekValue2.data);
        uAIIhSQWhOmxUb3Bqo(typedArrayObtainStyledAttributes.getInt(Acstmh57AKoSEkEFNJ.f6843DfpieXfdYs58yZAiXY, 500));
        this.f4845OANkd3mP6AYvwbNLJM = typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6891ToH8yzk8U1nKT0PUfY, false);
        this.f4890zaq8hOURtfwbcX17cG = typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6900XdzLv4NdAtTYoEzVzB, false);
        this.f4885sTkWmhpZ5b1ArQIw4K = typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6868LU0fFDMACqnfIfA1AZ, false);
        this.f4862Y43RdunnpKgpbny0lE = typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6998zcy2NNbtVXgoGQbfuq, true);
        this.f4850R9SAhYMerGybF9OAjL = typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6879PPkm9uUfOJHHYveeLT, false);
        this.f4836G7AC3DWIx9i9fdanjk = typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6910aAp6BD79BhftLCnuvf, false);
        this.f4888xHA29AmDt6y96AnB3t = typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6958lLKzvdU99Iw80uVD5I, false);
        this.f4857VItLRw50eXTZeEfGl0 = typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6963oocVJL811qFf0j0XXZ, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f4889zZKhbgvUfsK4AEX3r0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
