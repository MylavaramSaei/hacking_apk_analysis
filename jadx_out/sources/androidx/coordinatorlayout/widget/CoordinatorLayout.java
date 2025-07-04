package androidx.coordinatorlayout.widget;

import W3RZ2dTDKrKpS5Mxdk.OUd9THiLjZndMj0qdF;
import W3RZ2dTDKrKpS5Mxdk.THTDvPxsHqMeGb512f;
import W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw;
import W3RZ2dTDKrKpS5Mxdk.Y43RdunnpKgpbny0lE;
import W3RZ2dTDKrKpS5Mxdk.ao3wqKm5CXFuvC0q47;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements WWC27LAMFqFFBzfbNw, THTDvPxsHqMeGb512f {

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public static final Comparator f3197A49QRPHynYLCBN0SqP;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public static final String f3198G7AC3DWIx9i9fdanjk;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public static final ThreadLocal f3199LIMtzhnLwQyigzK0KO;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public static final tXWeW0sqVddf7ZBflq.zZKhbgvUfsK4AEX3r0 f3200VItLRw50eXTZeEfGl0;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public static final Class[] f3201xHA29AmDt6y96AnB3t;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public int[] f3202Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final List f3203HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f3204IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final int[] f3205KYHag8HRDlnO3X9zmZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public boolean f3206OANkd3mP6AYvwbNLJM;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public final ao3wqKm5CXFuvC0q47 f3207R9SAhYMerGybF9OAjL;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public KYHag8HRDlnO3X9zmZ f3208T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final int[] f3209TCyPEKSzIyweCN5yp1;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public OUd9THiLjZndMj0qdF f3210Y43RdunnpKgpbny0lE;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public View f3211Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public zXY7dgnTfw9Pd9RXel f3212aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public View f3213e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public boolean f3214hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public Paint f3215husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final List f3216lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f3217pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final R9SAhYMerGybF9OAjL.s3fjYDxWOUexjjVgyA f3218s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f3219sTkWmhpZ5b1ArQIw4K;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final List f3220zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public Drawable f3221zaq8hOURtfwbcX17cG;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface HJFh0TGMpafqLE9haL {
        Class value();
    }

    public static class IPyIQcaNa8aB7drBED implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fGyWRxpdt1T8mEJXPoD = lLKzvdU99Iw80uVD5I.GyWRxpdt1T8mEJXPoD(view);
            float fGyWRxpdt1T8mEJXPoD2 = lLKzvdU99Iw80uVD5I.GyWRxpdt1T8mEJXPoD(view2);
            if (fGyWRxpdt1T8mEJXPoD > fGyWRxpdt1T8mEJXPoD2) {
                return -1;
            }
            return fGyWRxpdt1T8mEJXPoD < fGyWRxpdt1T8mEJXPoD2 ? 1 : 0;
        }
    }

    public class KYHag8HRDlnO3X9zmZ implements ViewTreeObserver.OnPreDrawListener {
        public KYHag8HRDlnO3X9zmZ() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.tXWeW0sqVddf7ZBflq(0);
            return true;
        }
    }

    public static class TCyPEKSzIyweCN5yp1 extends aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7 {
        public static final Parcelable.Creator<TCyPEKSzIyweCN5yp1> CREATOR = new lEeR5KfoEr4xU5yHH7();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public SparseArray f3223HJFh0TGMpafqLE9haL;

        public static class lEeR5KfoEr4xU5yHH7 implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
            public TCyPEKSzIyweCN5yp1[] newArray(int i) {
                return new TCyPEKSzIyweCN5yp1[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
            public TCyPEKSzIyweCN5yp1 createFromParcel(Parcel parcel) {
                return new TCyPEKSzIyweCN5yp1(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
            public TCyPEKSzIyweCN5yp1 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new TCyPEKSzIyweCN5yp1(parcel, classLoader);
            }
        }

        public TCyPEKSzIyweCN5yp1(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f3223HJFh0TGMpafqLE9haL = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f3223HJFh0TGMpafqLE9haL.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.f3223HJFh0TGMpafqLE9haL;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f3223HJFh0TGMpafqLE9haL.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f3223HJFh0TGMpafqLE9haL.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public TCyPEKSzIyweCN5yp1(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class husNiw3snxdgZPAGJm extends ViewGroup.MarginLayoutParams {

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public int f3224Acstmh57AKoSEkEFNJ;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f3225HJFh0TGMpafqLE9haL;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public int f3226IPyIQcaNa8aB7drBED;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int f3227KYHag8HRDlnO3X9zmZ;

        /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
        public boolean f3228OANkd3mP6AYvwbNLJM;

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public boolean f3229T9PhQIpGRhE4yZDm1C;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public int f3230TCyPEKSzIyweCN5yp1;

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public View f3231Z9WdNiOsPR0y54zHW4;

        /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
        public boolean f3232aPyGSIylzVNKPT1Bls;

        /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
        public View f3233e54J8UWNHWALQNixXM;

        /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
        public boolean f3234hoXrIDAFrSwfShk8da;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f3235husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public s3fjYDxWOUexjjVgyA f3236lEeR5KfoEr4xU5yHH7;

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public int f3237pbVGzGjWvY2LDXC8vo;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f3238s3fjYDxWOUexjjVgyA;

        /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
        public Object f3239sTkWmhpZ5b1ArQIw4K;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f3240zZKhbgvUfsK4AEX3r0;

        /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
        public final Rect f3241zaq8hOURtfwbcX17cG;

        public husNiw3snxdgZPAGJm(int i, int i2) {
            super(i, i2);
            this.f3238s3fjYDxWOUexjjVgyA = false;
            this.f3225HJFh0TGMpafqLE9haL = 0;
            this.f3240zZKhbgvUfsK4AEX3r0 = 0;
            this.f3235husNiw3snxdgZPAGJm = -1;
            this.f3227KYHag8HRDlnO3X9zmZ = -1;
            this.f3230TCyPEKSzIyweCN5yp1 = 0;
            this.f3226IPyIQcaNa8aB7drBED = 0;
            this.f3241zaq8hOURtfwbcX17cG = new Rect();
        }

        public void Acstmh57AKoSEkEFNJ() {
            this.f3228OANkd3mP6AYvwbNLJM = false;
        }

        public boolean HJFh0TGMpafqLE9haL() {
            if (this.f3236lEeR5KfoEr4xU5yHH7 == null) {
                this.f3229T9PhQIpGRhE4yZDm1C = false;
            }
            return this.f3229T9PhQIpGRhE4yZDm1C;
        }

        public boolean IPyIQcaNa8aB7drBED(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f3229T9PhQIpGRhE4yZDm1C;
            if (z) {
                return true;
            }
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f3236lEeR5KfoEr4xU5yHH7;
            boolean zLEeR5KfoEr4xU5yHH7 = (s3fjydxwouexjjvgya != null ? s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(coordinatorLayout, view) : false) | z;
            this.f3229T9PhQIpGRhE4yZDm1C = zLEeR5KfoEr4xU5yHH7;
            return zLEeR5KfoEr4xU5yHH7;
        }

        public boolean KYHag8HRDlnO3X9zmZ() {
            return this.f3228OANkd3mP6AYvwbNLJM;
        }

        public void OANkd3mP6AYvwbNLJM(Rect rect) {
            this.f3241zaq8hOURtfwbcX17cG.set(rect);
        }

        public final void T9PhQIpGRhE4yZDm1C(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f3227KYHag8HRDlnO3X9zmZ);
            this.f3231Z9WdNiOsPR0y54zHW4 = viewFindViewById;
            if (viewFindViewById != null) {
                if (viewFindViewById != coordinatorLayout) {
                    for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                viewFindViewById = parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f3233e54J8UWNHWALQNixXM = viewFindViewById;
                    return;
                }
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3227KYHag8HRDlnO3X9zmZ) + " to anchor view " + view);
            }
            this.f3233e54J8UWNHWALQNixXM = null;
            this.f3231Z9WdNiOsPR0y54zHW4 = null;
        }

        public Rect TCyPEKSzIyweCN5yp1() {
            return this.f3241zaq8hOURtfwbcX17cG;
        }

        public final boolean Y43RdunnpKgpbny0lE(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3231Z9WdNiOsPR0y54zHW4.getId() != this.f3227KYHag8HRDlnO3X9zmZ) {
                return false;
            }
            View view2 = this.f3231Z9WdNiOsPR0y54zHW4;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f3233e54J8UWNHWALQNixXM = null;
                    this.f3231Z9WdNiOsPR0y54zHW4 = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f3233e54J8UWNHWALQNixXM = view2;
            return true;
        }

        public void Z9WdNiOsPR0y54zHW4(int i) {
            zaq8hOURtfwbcX17cG(i, false);
        }

        public void aPyGSIylzVNKPT1Bls(boolean z) {
            this.f3228OANkd3mP6AYvwbNLJM = z;
        }

        public void e54J8UWNHWALQNixXM() {
            this.f3229T9PhQIpGRhE4yZDm1C = false;
        }

        public void hoXrIDAFrSwfShk8da(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2 = this.f3236lEeR5KfoEr4xU5yHH7;
            if (s3fjydxwouexjjvgya2 != s3fjydxwouexjjvgya) {
                if (s3fjydxwouexjjvgya2 != null) {
                    s3fjydxwouexjjvgya2.Acstmh57AKoSEkEFNJ();
                }
                this.f3236lEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya;
                this.f3239sTkWmhpZ5b1ArQIw4K = null;
                this.f3238s3fjYDxWOUexjjVgyA = true;
                if (s3fjydxwouexjjvgya != null) {
                    s3fjydxwouexjjvgya.TCyPEKSzIyweCN5yp1(this);
                }
            }
        }

        public s3fjYDxWOUexjjVgyA husNiw3snxdgZPAGJm() {
            return this.f3236lEeR5KfoEr4xU5yHH7;
        }

        public boolean lEeR5KfoEr4xU5yHH7() {
            return this.f3231Z9WdNiOsPR0y54zHW4 == null && this.f3227KYHag8HRDlnO3X9zmZ != -1;
        }

        public boolean pbVGzGjWvY2LDXC8vo(int i) {
            if (i == 0) {
                return this.f3234hoXrIDAFrSwfShk8da;
            }
            if (i != 1) {
                return false;
            }
            return this.f3232aPyGSIylzVNKPT1Bls;
        }

        public boolean s3fjYDxWOUexjjVgyA(CoordinatorLayout coordinatorLayout, View view, View view2) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya;
            return view2 == this.f3233e54J8UWNHWALQNixXM || sTkWmhpZ5b1ArQIw4K(view2, lLKzvdU99Iw80uVD5I.A49QRPHynYLCBN0SqP(coordinatorLayout)) || ((s3fjydxwouexjjvgya = this.f3236lEeR5KfoEr4xU5yHH7) != null && s3fjydxwouexjjvgya.husNiw3snxdgZPAGJm(coordinatorLayout, view, view2));
        }

        public final boolean sTkWmhpZ5b1ArQIw4K(View view, int i) {
            int iS3fjYDxWOUexjjVgyA = Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(((husNiw3snxdgZPAGJm) view.getLayoutParams()).f3230TCyPEKSzIyweCN5yp1, i);
            return iS3fjYDxWOUexjjVgyA != 0 && (Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(this.f3226IPyIQcaNa8aB7drBED, i) & iS3fjYDxWOUexjjVgyA) == iS3fjYDxWOUexjjVgyA;
        }

        public View zZKhbgvUfsK4AEX3r0(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3227KYHag8HRDlnO3X9zmZ == -1) {
                this.f3233e54J8UWNHWALQNixXM = null;
                this.f3231Z9WdNiOsPR0y54zHW4 = null;
                return null;
            }
            if (this.f3231Z9WdNiOsPR0y54zHW4 == null || !Y43RdunnpKgpbny0lE(view, coordinatorLayout)) {
                T9PhQIpGRhE4yZDm1C(view, coordinatorLayout);
            }
            return this.f3231Z9WdNiOsPR0y54zHW4;
        }

        public void zaq8hOURtfwbcX17cG(int i, boolean z) {
            if (i == 0) {
                this.f3234hoXrIDAFrSwfShk8da = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.f3232aPyGSIylzVNKPT1Bls = z;
            }
        }

        public husNiw3snxdgZPAGJm(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3238s3fjYDxWOUexjjVgyA = false;
            this.f3225HJFh0TGMpafqLE9haL = 0;
            this.f3240zZKhbgvUfsK4AEX3r0 = 0;
            this.f3235husNiw3snxdgZPAGJm = -1;
            this.f3227KYHag8HRDlnO3X9zmZ = -1;
            this.f3230TCyPEKSzIyweCN5yp1 = 0;
            this.f3226IPyIQcaNa8aB7drBED = 0;
            this.f3241zaq8hOURtfwbcX17cG = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2168husNiw3snxdgZPAGJm);
            this.f3225HJFh0TGMpafqLE9haL = typedArrayObtainStyledAttributes.getInteger(Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2160KYHag8HRDlnO3X9zmZ, 0);
            this.f3227KYHag8HRDlnO3X9zmZ = typedArrayObtainStyledAttributes.getResourceId(Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2163TCyPEKSzIyweCN5yp1, -1);
            this.f3240zZKhbgvUfsK4AEX3r0 = typedArrayObtainStyledAttributes.getInteger(Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2159IPyIQcaNa8aB7drBED, 0);
            this.f3235husNiw3snxdgZPAGJm = typedArrayObtainStyledAttributes.getInteger(Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2166e54J8UWNHWALQNixXM, -1);
            this.f3230TCyPEKSzIyweCN5yp1 = typedArrayObtainStyledAttributes.getInt(Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2164Z9WdNiOsPR0y54zHW4, 0);
            this.f3226IPyIQcaNa8aB7drBED = typedArrayObtainStyledAttributes.getInt(Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2157Acstmh57AKoSEkEFNJ, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2170pbVGzGjWvY2LDXC8vo);
            this.f3238s3fjYDxWOUexjjVgyA = zHasValue;
            if (zHasValue) {
                this.f3236lEeR5KfoEr4xU5yHH7 = CoordinatorLayout.GyWRxpdt1T8mEJXPoD(context, attributeSet, typedArrayObtainStyledAttributes.getString(Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2170pbVGzGjWvY2LDXC8vo));
            }
            typedArrayObtainStyledAttributes.recycle();
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f3236lEeR5KfoEr4xU5yHH7;
            if (s3fjydxwouexjjvgya != null) {
                s3fjydxwouexjjvgya.TCyPEKSzIyweCN5yp1(this);
            }
        }

        public husNiw3snxdgZPAGJm(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3238s3fjYDxWOUexjjVgyA = false;
            this.f3225HJFh0TGMpafqLE9haL = 0;
            this.f3240zZKhbgvUfsK4AEX3r0 = 0;
            this.f3235husNiw3snxdgZPAGJm = -1;
            this.f3227KYHag8HRDlnO3X9zmZ = -1;
            this.f3230TCyPEKSzIyweCN5yp1 = 0;
            this.f3226IPyIQcaNa8aB7drBED = 0;
            this.f3241zaq8hOURtfwbcX17cG = new Rect();
        }

        public husNiw3snxdgZPAGJm(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3238s3fjYDxWOUexjjVgyA = false;
            this.f3225HJFh0TGMpafqLE9haL = 0;
            this.f3240zZKhbgvUfsK4AEX3r0 = 0;
            this.f3235husNiw3snxdgZPAGJm = -1;
            this.f3227KYHag8HRDlnO3X9zmZ = -1;
            this.f3230TCyPEKSzIyweCN5yp1 = 0;
            this.f3226IPyIQcaNa8aB7drBED = 0;
            this.f3241zaq8hOURtfwbcX17cG = new Rect();
        }

        public husNiw3snxdgZPAGJm(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            super((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm);
            this.f3238s3fjYDxWOUexjjVgyA = false;
            this.f3225HJFh0TGMpafqLE9haL = 0;
            this.f3240zZKhbgvUfsK4AEX3r0 = 0;
            this.f3235husNiw3snxdgZPAGJm = -1;
            this.f3227KYHag8HRDlnO3X9zmZ = -1;
            this.f3230TCyPEKSzIyweCN5yp1 = 0;
            this.f3226IPyIQcaNa8aB7drBED = 0;
            this.f3241zaq8hOURtfwbcX17cG = new Rect();
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements OUd9THiLjZndMj0qdF {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.OUd9THiLjZndMj0qdF
        public zXY7dgnTfw9Pd9RXel lEeR5KfoEr4xU5yHH7(View view, zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel) {
            return CoordinatorLayout.this.oocVJL811qFf0j0XXZ(zxy7dgntfw9pd9rxel);
        }
    }

    public static abstract class s3fjYDxWOUexjjVgyA {
        public s3fjYDxWOUexjjVgyA() {
        }

        public void A49QRPHynYLCBN0SqP(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public void Acstmh57AKoSEkEFNJ() {
        }

        public void G7AC3DWIx9i9fdanjk(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        }

        public int HJFh0TGMpafqLE9haL(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public boolean IPyIQcaNa8aB7drBED(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean LIMtzhnLwQyigzK0KO(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            return false;
        }

        public void OANkd3mP6AYvwbNLJM(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        }

        public void OUd9THiLjZndMj0qdF(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            if (i == 0) {
                ao3wqKm5CXFuvC0q47(coordinatorLayout, view, view2);
            }
        }

        public void R9SAhYMerGybF9OAjL(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            Y43RdunnpKgpbny0lE(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
        }

        public boolean T9PhQIpGRhE4yZDm1C(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return false;
        }

        public void TCyPEKSzIyweCN5yp1(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        }

        public boolean THTDvPxsHqMeGb512f(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i2 == 0) {
                return WWC27LAMFqFFBzfbNw(coordinatorLayout, view, view2, view3, i);
            }
            return false;
        }

        public Parcelable VItLRw50eXTZeEfGl0(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean WWC27LAMFqFFBzfbNw(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
            return false;
        }

        public void Y43RdunnpKgpbny0lE(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                sTkWmhpZ5b1ArQIw4K(coordinatorLayout, view, view2, i, i2, i3, i4);
            }
        }

        public boolean Z9WdNiOsPR0y54zHW4(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean aPyGSIylzVNKPT1Bls(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
            return false;
        }

        public void ao3wqKm5CXFuvC0q47(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public boolean e54J8UWNHWALQNixXM(CoordinatorLayout coordinatorLayout, View view, int i) {
            return false;
        }

        public boolean hoXrIDAFrSwfShk8da(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
            return false;
        }

        public boolean husNiw3snxdgZPAGJm(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean jCtUeU2YI1poCxWcjm(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean lEeR5KfoEr4xU5yHH7(CoordinatorLayout coordinatorLayout, View view) {
            return zZKhbgvUfsK4AEX3r0(coordinatorLayout, view) > 0.0f;
        }

        public void pbVGzGjWvY2LDXC8vo(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public boolean s3fjYDxWOUexjjVgyA(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public void sTkWmhpZ5b1ArQIw4K(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        }

        public void xHA29AmDt6y96AnB3t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i2 == 0) {
                G7AC3DWIx9i9fdanjk(coordinatorLayout, view, view2, view3, i);
            }
        }

        public float zZKhbgvUfsK4AEX3r0(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public void zaq8hOURtfwbcX17cG(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                OANkd3mP6AYvwbNLJM(coordinatorLayout, view, view2, i, i2, iArr);
            }
        }

        public s3fjYDxWOUexjjVgyA(Context context, AttributeSet attributeSet) {
        }

        public zXY7dgnTfw9Pd9RXel KYHag8HRDlnO3X9zmZ(CoordinatorLayout coordinatorLayout, View view, zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel) {
            return zxy7dgntfw9pd9rxel;
        }
    }

    public class zZKhbgvUfsK4AEX3r0 implements ViewGroup.OnHierarchyChangeListener {
        public zZKhbgvUfsK4AEX3r0() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3219sTkWmhpZ5b1ArQIw4K;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.tXWeW0sqVddf7ZBflq(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3219sTkWmhpZ5b1ArQIw4K;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f3198G7AC3DWIx9i9fdanjk = r0 != null ? r0.getName() : null;
        f3197A49QRPHynYLCBN0SqP = new IPyIQcaNa8aB7drBED();
        f3201xHA29AmDt6y96AnB3t = new Class[]{Context.class, AttributeSet.class};
        f3199LIMtzhnLwQyigzK0KO = new ThreadLocal();
        f3200VItLRw50eXTZeEfGl0 = new tXWeW0sqVddf7ZBflq.KYHag8HRDlnO3X9zmZ(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y43RdunnpKgpbny0lE.lEeR5KfoEr4xU5yHH7.f2173lEeR5KfoEr4xU5yHH7);
    }

    public static s3fjYDxWOUexjjVgyA GyWRxpdt1T8mEJXPoD(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f3198G7AC3DWIx9i9fdanjk;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f3199LIMtzhnLwQyigzK0KO;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f3201xHA29AmDt6y96AnB3t);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (s3fjYDxWOUexjjVgyA) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    public static int LU0fFDMACqnfIfA1AZ(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    public static void PPkm9uUfOJHHYveeLT(Rect rect) {
        rect.setEmpty();
        f3200VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7(rect);
    }

    public static Rect TCyPEKSzIyweCN5yp1() {
        Rect rect = (Rect) f3200VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA();
        return rect == null ? new Rect() : rect;
    }

    public static int ToH8yzk8U1nKT0PUfY(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    public static int XdzLv4NdAtTYoEzVzB(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int pbVGzGjWvY2LDXC8vo(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public final void A49QRPHynYLCBN0SqP(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator comparator = f3197A49QRPHynYLCBN0SqP;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final void Acstmh57AKoSEkEFNJ(husNiw3snxdgZPAGJm husniw3snxdgzpagjm, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final boolean DfpieXfdYs58yZAiXY(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f3203HJFh0TGMpafqLE9haL;
        A49QRPHynYLCBN0SqP(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zZ9WdNiOsPR0y54zHW4 = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) view.getLayoutParams();
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = husniw3snxdgzpagjm.husNiw3snxdgZPAGJm();
            if (!(zZ9WdNiOsPR0y54zHW4 || z) || actionMasked == 0) {
                if (!zZ9WdNiOsPR0y54zHW4 && s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm != null) {
                    if (i == 0) {
                        zZ9WdNiOsPR0y54zHW4 = s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.Z9WdNiOsPR0y54zHW4(this, view, motionEvent);
                    } else if (i == 1) {
                        zZ9WdNiOsPR0y54zHW4 = s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.jCtUeU2YI1poCxWcjm(this, view, motionEvent);
                    }
                    if (zZ9WdNiOsPR0y54zHW4) {
                        this.f3211Z9WdNiOsPR0y54zHW4 = view;
                    }
                }
                boolean zHJFh0TGMpafqLE9haL = husniw3snxdgzpagjm.HJFh0TGMpafqLE9haL();
                boolean zIPyIQcaNa8aB7drBED = husniw3snxdgzpagjm.IPyIQcaNa8aB7drBED(this, view);
                z = zIPyIQcaNa8aB7drBED && !zHJFh0TGMpafqLE9haL;
                if (zIPyIQcaNa8aB7drBED && !z) {
                    break;
                }
            } else if (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.Z9WdNiOsPR0y54zHW4(this, view, motionEventObtain);
                } else if (i == 1) {
                    s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.jCtUeU2YI1poCxWcjm(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zZ9WdNiOsPR0y54zHW4;
    }

    public final int G7AC3DWIx9i9fdanjk(int i) {
        StringBuilder sb;
        int[] iArr = this.f3202Acstmh57AKoSEkEFNJ;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else {
            if (i >= 0 && i < iArr.length) {
                return iArr[i];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public void HJFh0TGMpafqLE9haL(View view, int i, int i2, int[] iArr, int i3) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) childAt.getLayoutParams();
                if (husniw3snxdgzpagjm.pbVGzGjWvY2LDXC8vo(i3) && (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = husniw3snxdgzpagjm.husNiw3snxdgZPAGJm()) != null) {
                    int[] iArr2 = this.f3205KYHag8HRDlnO3X9zmZ;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.zaq8hOURtfwbcX17cG(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f3205KYHag8HRDlnO3X9zmZ;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f3205KYHag8HRDlnO3X9zmZ;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            tXWeW0sqVddf7ZBflq(1);
        }
    }

    public void IPyIQcaNa8aB7drBED() {
        if (this.f3217pbVGzGjWvY2LDXC8vo) {
            if (this.f3208T9PhQIpGRhE4yZDm1C == null) {
                this.f3208T9PhQIpGRhE4yZDm1C = new KYHag8HRDlnO3X9zmZ();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3208T9PhQIpGRhE4yZDm1C);
        }
        this.f3214hoXrIDAFrSwfShk8da = true;
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public boolean KYHag8HRDlnO3X9zmZ(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) childAt.getLayoutParams();
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = husniw3snxdgzpagjm.husNiw3snxdgZPAGJm();
                if (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm != null) {
                    boolean zTHTDvPxsHqMeGb512f = s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.THTDvPxsHqMeGb512f(this, childAt, view, view2, i, i2);
                    z |= zTHTDvPxsHqMeGb512f;
                    husniw3snxdgzpagjm.zaq8hOURtfwbcX17cG(i2, zTHTDvPxsHqMeGb512f);
                } else {
                    husniw3snxdgzpagjm.zaq8hOURtfwbcX17cG(i2, false);
                }
            }
        }
        return z;
    }

    public void KqgKJKIWne3kz1AdHk(View view, Rect rect) {
        ((husNiw3snxdgZPAGJm) view.getLayoutParams()).OANkd3mP6AYvwbNLJM(rect);
    }

    public husNiw3snxdgZPAGJm LIMtzhnLwQyigzK0KO(View view) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) view.getLayoutParams();
        if (!husniw3snxdgzpagjm.f3238s3fjYDxWOUexjjVgyA) {
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) superclass.getAnnotation(HJFh0TGMpafqLE9haL.class);
                if (hJFh0TGMpafqLE9haL != null) {
                    break;
                }
            }
            if (hJFh0TGMpafqLE9haL != null) {
                try {
                    husniw3snxdgzpagjm.hoXrIDAFrSwfShk8da((s3fjYDxWOUexjjVgyA) hJFh0TGMpafqLE9haL.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + hJFh0TGMpafqLE9haL.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            husniw3snxdgzpagjm.f3238s3fjYDxWOUexjjVgyA = true;
        }
        return husniw3snxdgzpagjm;
    }

    public void OANkd3mP6AYvwbNLJM(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            sTkWmhpZ5b1ArQIw4K(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void OUd9THiLjZndMj0qdF(View view, int i, int i2) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) view.getLayoutParams();
        int iS3fjYDxWOUexjjVgyA = Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(LU0fFDMACqnfIfA1AZ(husniw3snxdgzpagjm.f3225HJFh0TGMpafqLE9haL), i2);
        int i3 = iS3fjYDxWOUexjjVgyA & 7;
        int i4 = iS3fjYDxWOUexjjVgyA & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int iG7AC3DWIx9i9fdanjk = G7AC3DWIx9i9fdanjk(i) - measuredWidth;
        if (i3 == 1) {
            iG7AC3DWIx9i9fdanjk += measuredWidth / 2;
        } else if (i3 == 5) {
            iG7AC3DWIx9i9fdanjk += measuredWidth;
        }
        int i5 = i4 != 16 ? i4 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).leftMargin, Math.min(iG7AC3DWIx9i9fdanjk, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    public void OqIo5QF00RDxUQb4qq(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final void R9SAhYMerGybF9OAjL(View view, int i, Rect rect, Rect rect2, husNiw3snxdgZPAGJm husniw3snxdgzpagjm, int i2, int i3) {
        int iS3fjYDxWOUexjjVgyA = Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(ToH8yzk8U1nKT0PUfY(husniw3snxdgzpagjm.f3225HJFh0TGMpafqLE9haL), i);
        int iS3fjYDxWOUexjjVgyA2 = Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(XdzLv4NdAtTYoEzVzB(husniw3snxdgzpagjm.f3240zZKhbgvUfsK4AEX3r0), i);
        int i4 = iS3fjYDxWOUexjjVgyA & 7;
        int i5 = iS3fjYDxWOUexjjVgyA & 112;
        int i6 = iS3fjYDxWOUexjjVgyA2 & 7;
        int i7 = iS3fjYDxWOUexjjVgyA2 & 112;
        int iWidth = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            iWidth -= i2 / 2;
        } else if (i4 != 5) {
            iWidth -= i2;
        }
        if (i5 == 16) {
            iHeight -= i3 / 2;
        } else if (i5 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    @Override // android.view.ViewGroup
    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: merged with bridge method [inline-methods] */
    public husNiw3snxdgZPAGJm generateDefaultLayoutParams() {
        return new husNiw3snxdgZPAGJm(-2, -2);
    }

    public final void THTDvPxsHqMeGb512f(View view, int i) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) view.getLayoutParams();
        Rect rectTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1();
        rectTCyPEKSzIyweCN5yp1.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).bottomMargin);
        if (this.f3212aPyGSIylzVNKPT1Bls != null && lLKzvdU99Iw80uVD5I.G7AC3DWIx9i9fdanjk(this) && !lLKzvdU99Iw80uVD5I.G7AC3DWIx9i9fdanjk(view)) {
            rectTCyPEKSzIyweCN5yp1.left += this.f3212aPyGSIylzVNKPT1Bls.pbVGzGjWvY2LDXC8vo();
            rectTCyPEKSzIyweCN5yp1.top += this.f3212aPyGSIylzVNKPT1Bls.Z9WdNiOsPR0y54zHW4();
            rectTCyPEKSzIyweCN5yp1.right -= this.f3212aPyGSIylzVNKPT1Bls.Acstmh57AKoSEkEFNJ();
            rectTCyPEKSzIyweCN5yp1.bottom -= this.f3212aPyGSIylzVNKPT1Bls.IPyIQcaNa8aB7drBED();
        }
        Rect rectTCyPEKSzIyweCN5yp12 = TCyPEKSzIyweCN5yp1();
        Y43RdunnpKgpbny0lE.lEeR5KfoEr4xU5yHH7(XdzLv4NdAtTYoEzVzB(husniw3snxdgzpagjm.f3225HJFh0TGMpafqLE9haL), view.getMeasuredWidth(), view.getMeasuredHeight(), rectTCyPEKSzIyweCN5yp1, rectTCyPEKSzIyweCN5yp12, i);
        view.layout(rectTCyPEKSzIyweCN5yp12.left, rectTCyPEKSzIyweCN5yp12.top, rectTCyPEKSzIyweCN5yp12.right, rectTCyPEKSzIyweCN5yp12.bottom);
        PPkm9uUfOJHHYveeLT(rectTCyPEKSzIyweCN5yp1);
        PPkm9uUfOJHHYveeLT(rectTCyPEKSzIyweCN5yp12);
    }

    public final boolean VItLRw50eXTZeEfGl0(View view) {
        return this.f3218s3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo(view);
    }

    public void W3RZ2dTDKrKpS5Mxdk(View view, int i) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) view.getLayoutParams();
        if (husniw3snxdgzpagjm.lEeR5KfoEr4xU5yHH7()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = husniw3snxdgzpagjm.f3231Z9WdNiOsPR0y54zHW4;
        if (view2 != null) {
            ao3wqKm5CXFuvC0q47(view, view2, i);
            return;
        }
        int i2 = husniw3snxdgzpagjm.f3235husNiw3snxdgZPAGJm;
        if (i2 >= 0) {
            OUd9THiLjZndMj0qdF(view, i2, i);
        } else {
            THTDvPxsHqMeGb512f(view, i);
        }
    }

    public boolean WWC27LAMFqFFBzfbNw(View view, int i, int i2) {
        Rect rectTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1();
        sTkWmhpZ5b1ArQIw4K(view, rectTCyPEKSzIyweCN5yp1);
        try {
            return rectTCyPEKSzIyweCN5yp1.contains(i, i2);
        } finally {
            PPkm9uUfOJHHYveeLT(rectTCyPEKSzIyweCN5yp1);
        }
    }

    public void XzJ1BS7H9Ilbkv4eVM(View view, int i) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm;
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) view.getLayoutParams();
        if (husniw3snxdgzpagjm.f3231Z9WdNiOsPR0y54zHW4 != null) {
            Rect rectTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1();
            Rect rectTCyPEKSzIyweCN5yp12 = TCyPEKSzIyweCN5yp1();
            Rect rectTCyPEKSzIyweCN5yp13 = TCyPEKSzIyweCN5yp1();
            sTkWmhpZ5b1ArQIw4K(husniw3snxdgzpagjm.f3231Z9WdNiOsPR0y54zHW4, rectTCyPEKSzIyweCN5yp1);
            OANkd3mP6AYvwbNLJM(view, false, rectTCyPEKSzIyweCN5yp12);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            R9SAhYMerGybF9OAjL(view, i, rectTCyPEKSzIyweCN5yp1, rectTCyPEKSzIyweCN5yp13, husniw3snxdgzpagjm, measuredWidth, measuredHeight);
            boolean z = (rectTCyPEKSzIyweCN5yp13.left == rectTCyPEKSzIyweCN5yp12.left && rectTCyPEKSzIyweCN5yp13.top == rectTCyPEKSzIyweCN5yp12.top) ? false : true;
            Acstmh57AKoSEkEFNJ(husniw3snxdgzpagjm, rectTCyPEKSzIyweCN5yp13, measuredWidth, measuredHeight);
            int i2 = rectTCyPEKSzIyweCN5yp13.left - rectTCyPEKSzIyweCN5yp12.left;
            int i3 = rectTCyPEKSzIyweCN5yp13.top - rectTCyPEKSzIyweCN5yp12.top;
            if (i2 != 0) {
                lLKzvdU99Iw80uVD5I.oocVJL811qFf0j0XXZ(view, i2);
            }
            if (i3 != 0) {
                lLKzvdU99Iw80uVD5I.udcVtCzLTM1Loe9KrX(view, i3);
            }
            if (z && (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = husniw3snxdgzpagjm.husNiw3snxdgZPAGJm()) != null) {
                s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.IPyIQcaNa8aB7drBED(this, view, husniw3snxdgzpagjm.f3231Z9WdNiOsPR0y54zHW4);
            }
            PPkm9uUfOJHHYveeLT(rectTCyPEKSzIyweCN5yp1);
            PPkm9uUfOJHHYveeLT(rectTCyPEKSzIyweCN5yp12);
            PPkm9uUfOJHHYveeLT(rectTCyPEKSzIyweCN5yp13);
        }
    }

    public void Y43RdunnpKgpbny0lE(View view, int i, Rect rect, Rect rect2) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        R9SAhYMerGybF9OAjL(view, i, rect, rect2, husniw3snxdgzpagjm, measuredWidth, measuredHeight);
        Acstmh57AKoSEkEFNJ(husniw3snxdgzpagjm, rect2, measuredWidth, measuredHeight);
    }

    public final void YlLW4G6OV9TFyuw5ix(View view, int i) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) view.getLayoutParams();
        int i2 = husniw3snxdgzpagjm.f3224Acstmh57AKoSEkEFNJ;
        if (i2 != i) {
            lLKzvdU99Iw80uVD5I.udcVtCzLTM1Loe9KrX(view, i - i2);
            husniw3snxdgzpagjm.f3224Acstmh57AKoSEkEFNJ = i;
        }
    }

    public final zXY7dgnTfw9Pd9RXel Z9WdNiOsPR0y54zHW4(zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm;
        if (zxy7dgntfw9pd9rxel.hoXrIDAFrSwfShk8da()) {
            return zxy7dgntfw9pd9rxel;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (lLKzvdU99Iw80uVD5I.G7AC3DWIx9i9fdanjk(childAt) && (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = ((husNiw3snxdgZPAGJm) childAt.getLayoutParams()).husNiw3snxdgZPAGJm()) != null) {
                zxy7dgntfw9pd9rxel = s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(this, childAt, zxy7dgntfw9pd9rxel);
                if (zxy7dgntfw9pd9rxel.hoXrIDAFrSwfShk8da()) {
                    break;
                }
            }
        }
        return zxy7dgntfw9pd9rxel;
    }

    public void aAp6BD79BhftLCnuvf() {
        if (this.f3217pbVGzGjWvY2LDXC8vo && this.f3208T9PhQIpGRhE4yZDm1C != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3208T9PhQIpGRhE4yZDm1C);
        }
        this.f3214hoXrIDAFrSwfShk8da = false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: aPyGSIylzVNKPT1Bls, reason: merged with bridge method [inline-methods] */
    public husNiw3snxdgZPAGJm generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof husNiw3snxdgZPAGJm ? new husNiw3snxdgZPAGJm((husNiw3snxdgZPAGJm) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new husNiw3snxdgZPAGJm((ViewGroup.MarginLayoutParams) layoutParams) : new husNiw3snxdgZPAGJm(layoutParams);
    }

    public final void ao3wqKm5CXFuvC0q47(View view, View view2, int i) {
        Rect rectTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1();
        Rect rectTCyPEKSzIyweCN5yp12 = TCyPEKSzIyweCN5yp1();
        try {
            sTkWmhpZ5b1ArQIw4K(view2, rectTCyPEKSzIyweCN5yp1);
            Y43RdunnpKgpbny0lE(view, i, rectTCyPEKSzIyweCN5yp1, rectTCyPEKSzIyweCN5yp12);
            view.layout(rectTCyPEKSzIyweCN5yp12.left, rectTCyPEKSzIyweCN5yp12.top, rectTCyPEKSzIyweCN5yp12.right, rectTCyPEKSzIyweCN5yp12.bottom);
        } finally {
            PPkm9uUfOJHHYveeLT(rectTCyPEKSzIyweCN5yp1);
            PPkm9uUfOJHHYveeLT(rectTCyPEKSzIyweCN5yp12);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof husNiw3snxdgZPAGJm) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) view.getLayoutParams();
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = husniw3snxdgzpagjm.f3236lEeR5KfoEr4xU5yHH7;
        if (s3fjydxwouexjjvgya != null) {
            float fZZKhbgvUfsK4AEX3r0 = s3fjydxwouexjjvgya.zZKhbgvUfsK4AEX3r0(this, view);
            if (fZZKhbgvUfsK4AEX3r0 > 0.0f) {
                if (this.f3215husNiw3snxdgZPAGJm == null) {
                    this.f3215husNiw3snxdgZPAGJm = new Paint();
                }
                this.f3215husNiw3snxdgZPAGJm.setColor(husniw3snxdgzpagjm.f3236lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(this, view));
                this.f3215husNiw3snxdgZPAGJm.setAlpha(pbVGzGjWvY2LDXC8vo(Math.round(fZZKhbgvUfsK4AEX3r0 * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f3215husNiw3snxdgZPAGJm);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3221zaq8hOURtfwbcX17cG;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e2F9F6h8YJxTHwLCa0() {
        this.f3216lEeR5KfoEr4xU5yHH7.clear();
        this.f3218s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            husNiw3snxdgZPAGJm husniw3snxdgzpagjmLIMtzhnLwQyigzK0KO = LIMtzhnLwQyigzK0KO(childAt);
            husniw3snxdgzpagjmLIMtzhnLwQyigzK0KO.zZKhbgvUfsK4AEX3r0(this, childAt);
            this.f3218s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (husniw3snxdgzpagjmLIMtzhnLwQyigzK0KO.s3fjYDxWOUexjjVgyA(this, childAt, childAt2)) {
                        if (!this.f3218s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(childAt2)) {
                            this.f3218s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(childAt2);
                        }
                        this.f3218s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(childAt2, childAt);
                    }
                }
            }
        }
        this.f3216lEeR5KfoEr4xU5yHH7.addAll(this.f3218s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED());
        Collections.reverse(this.f3216lEeR5KfoEr4xU5yHH7);
    }

    public void e54J8UWNHWALQNixXM() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (VItLRw50eXTZeEfGl0(getChildAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.f3214hoXrIDAFrSwfShk8da) {
            if (z) {
                IPyIQcaNa8aB7drBED();
            } else {
                aAp6BD79BhftLCnuvf();
            }
        }
    }

    public final List<View> getDependencySortedChildren() {
        e2F9F6h8YJxTHwLCa0();
        return Collections.unmodifiableList(this.f3216lEeR5KfoEr4xU5yHH7);
    }

    public final zXY7dgnTfw9Pd9RXel getLastWindowInsets() {
        return this.f3212aPyGSIylzVNKPT1Bls;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3207R9SAhYMerGybF9OAjL.lEeR5KfoEr4xU5yHH7();
    }

    public Drawable getStatusBarBackground() {
        return this.f3221zaq8hOURtfwbcX17cG;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup
    /* renamed from: hoXrIDAFrSwfShk8da, reason: merged with bridge method [inline-methods] */
    public husNiw3snxdgZPAGJm generateLayoutParams(AttributeSet attributeSet) {
        return new husNiw3snxdgZPAGJm(getContext(), attributeSet);
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public void husNiw3snxdgZPAGJm(View view, int i, int i2, int i3, int i4, int i5) {
        zZKhbgvUfsK4AEX3r0(view, i, i2, i3, i4, 0, this.f3209TCyPEKSzIyweCN5yp1);
    }

    public final void jCtUeU2YI1poCxWcjm(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (lLKzvdU99Iw80uVD5I.lLKzvdU99Iw80uVD5I(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) view.getLayoutParams();
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = husniw3snxdgzpagjm.husNiw3snxdgZPAGJm();
            Rect rectTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1();
            Rect rectTCyPEKSzIyweCN5yp12 = TCyPEKSzIyweCN5yp1();
            rectTCyPEKSzIyweCN5yp12.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm == null || !s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(this, view, rectTCyPEKSzIyweCN5yp1)) {
                rectTCyPEKSzIyweCN5yp1.set(rectTCyPEKSzIyweCN5yp12);
            } else if (!rectTCyPEKSzIyweCN5yp12.contains(rectTCyPEKSzIyweCN5yp1)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectTCyPEKSzIyweCN5yp1.toShortString() + " | Bounds:" + rectTCyPEKSzIyweCN5yp12.toShortString());
            }
            PPkm9uUfOJHHYveeLT(rectTCyPEKSzIyweCN5yp12);
            if (rectTCyPEKSzIyweCN5yp1.isEmpty()) {
                PPkm9uUfOJHHYveeLT(rectTCyPEKSzIyweCN5yp1);
                return;
            }
            int iS3fjYDxWOUexjjVgyA = Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(husniw3snxdgzpagjm.f3226IPyIQcaNa8aB7drBED, i);
            boolean z3 = true;
            if ((iS3fjYDxWOUexjjVgyA & 48) != 48 || (i6 = (rectTCyPEKSzIyweCN5yp1.top - ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).topMargin) - husniw3snxdgzpagjm.f3224Acstmh57AKoSEkEFNJ) >= (i7 = rect.top)) {
                z = false;
            } else {
                YlLW4G6OV9TFyuw5ix(view, i7 - i6);
                z = true;
            }
            if ((iS3fjYDxWOUexjjVgyA & 80) == 80 && (height = ((getHeight() - rectTCyPEKSzIyweCN5yp1.bottom) - ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).bottomMargin) + husniw3snxdgzpagjm.f3224Acstmh57AKoSEkEFNJ) < (i5 = rect.bottom)) {
                YlLW4G6OV9TFyuw5ix(view, height - i5);
                z = true;
            }
            if (!z) {
                YlLW4G6OV9TFyuw5ix(view, 0);
            }
            if ((iS3fjYDxWOUexjjVgyA & 3) != 3 || (i3 = (rectTCyPEKSzIyweCN5yp1.left - ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).leftMargin) - husniw3snxdgzpagjm.f3237pbVGzGjWvY2LDXC8vo) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                zcy2NNbtVXgoGQbfuq(view, i4 - i3);
                z2 = true;
            }
            if ((iS3fjYDxWOUexjjVgyA & 5) != 5 || (width = ((getWidth() - rectTCyPEKSzIyweCN5yp1.right) - ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).rightMargin) + husniw3snxdgzpagjm.f3237pbVGzGjWvY2LDXC8vo) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                zcy2NNbtVXgoGQbfuq(view, width - i2);
            }
            if (!z3) {
                zcy2NNbtVXgoGQbfuq(view, 0);
            }
            PPkm9uUfOJHHYveeLT(rectTCyPEKSzIyweCN5yp1);
        }
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public void lEeR5KfoEr4xU5yHH7(View view, View view2, int i, int i2) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm;
        this.f3207R9SAhYMerGybF9OAjL.HJFh0TGMpafqLE9haL(view, view2, i, i2);
        this.f3213e54J8UWNHWALQNixXM = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) childAt.getLayoutParams();
            if (husniw3snxdgzpagjm.pbVGzGjWvY2LDXC8vo(i2) && (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = husniw3snxdgzpagjm.husNiw3snxdgZPAGJm()) != null) {
                s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.xHA29AmDt6y96AnB3t(this, childAt, view, view2, i, i2);
            }
        }
    }

    public final void lLKzvdU99Iw80uVD5I(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = ((husNiw3snxdgZPAGJm) childAt.getLayoutParams()).husNiw3snxdgZPAGJm();
            if (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.Z9WdNiOsPR0y54zHW4(this, childAt, motionEventObtain);
                } else {
                    s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.jCtUeU2YI1poCxWcjm(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((husNiw3snxdgZPAGJm) getChildAt(i2).getLayoutParams()).e54J8UWNHWALQNixXM();
        }
        this.f3211Z9WdNiOsPR0y54zHW4 = null;
        this.f3204IPyIQcaNa8aB7drBED = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lLKzvdU99Iw80uVD5I(false);
        if (this.f3214hoXrIDAFrSwfShk8da) {
            if (this.f3208T9PhQIpGRhE4yZDm1C == null) {
                this.f3208T9PhQIpGRhE4yZDm1C = new KYHag8HRDlnO3X9zmZ();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3208T9PhQIpGRhE4yZDm1C);
        }
        if (this.f3212aPyGSIylzVNKPT1Bls == null && lLKzvdU99Iw80uVD5I.G7AC3DWIx9i9fdanjk(this)) {
            lLKzvdU99Iw80uVD5I.ctWLFN70QQINH1kyYo(this);
        }
        this.f3217pbVGzGjWvY2LDXC8vo = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lLKzvdU99Iw80uVD5I(false);
        if (this.f3214hoXrIDAFrSwfShk8da && this.f3208T9PhQIpGRhE4yZDm1C != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3208T9PhQIpGRhE4yZDm1C);
        }
        View view = this.f3213e54J8UWNHWALQNixXM;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3217pbVGzGjWvY2LDXC8vo = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3206OANkd3mP6AYvwbNLJM || this.f3221zaq8hOURtfwbcX17cG == null) {
            return;
        }
        zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel = this.f3212aPyGSIylzVNKPT1Bls;
        int iZ9WdNiOsPR0y54zHW4 = zxy7dgntfw9pd9rxel != null ? zxy7dgntfw9pd9rxel.Z9WdNiOsPR0y54zHW4() : 0;
        if (iZ9WdNiOsPR0y54zHW4 > 0) {
            this.f3221zaq8hOURtfwbcX17cG.setBounds(0, 0, getWidth(), iZ9WdNiOsPR0y54zHW4);
            this.f3221zaq8hOURtfwbcX17cG.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            lLKzvdU99Iw80uVD5I(true);
        }
        boolean zDfpieXfdYs58yZAiXY = DfpieXfdYs58yZAiXY(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            lLKzvdU99Iw80uVD5I(true);
        }
        return zDfpieXfdYs58yZAiXY;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm;
        int iA49QRPHynYLCBN0SqP = lLKzvdU99Iw80uVD5I.A49QRPHynYLCBN0SqP(this);
        int size = this.f3216lEeR5KfoEr4xU5yHH7.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f3216lEeR5KfoEr4xU5yHH7.get(i5);
            if (view.getVisibility() != 8 && ((s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = ((husNiw3snxdgZPAGJm) view.getLayoutParams()).husNiw3snxdgZPAGJm()) == null || !s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.e54J8UWNHWALQNixXM(this, view, iA49QRPHynYLCBN0SqP))) {
                W3RZ2dTDKrKpS5Mxdk(view, iA49QRPHynYLCBN0SqP);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm;
        int childCount = getChildCount();
        boolean zHoXrIDAFrSwfShk8da = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) childAt.getLayoutParams();
                if (husniw3snxdgzpagjm.pbVGzGjWvY2LDXC8vo(0) && (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = husniw3snxdgzpagjm.husNiw3snxdgZPAGJm()) != null) {
                    zHoXrIDAFrSwfShk8da |= s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.hoXrIDAFrSwfShk8da(this, childAt, view, f, f2, z);
                }
            }
        }
        if (zHoXrIDAFrSwfShk8da) {
            tXWeW0sqVddf7ZBflq(1);
        }
        return zHoXrIDAFrSwfShk8da;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm;
        int childCount = getChildCount();
        boolean zAPyGSIylzVNKPT1Bls = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) childAt.getLayoutParams();
                if (husniw3snxdgzpagjm.pbVGzGjWvY2LDXC8vo(0) && (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = husniw3snxdgzpagjm.husNiw3snxdgZPAGJm()) != null) {
                    zAPyGSIylzVNKPT1Bls |= s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.aPyGSIylzVNKPT1Bls(this, childAt, view, f, f2);
                }
            }
        }
        return zAPyGSIylzVNKPT1Bls;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        HJFh0TGMpafqLE9haL(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        husNiw3snxdgZPAGJm(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        lEeR5KfoEr4xU5yHH7(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof TCyPEKSzIyweCN5yp1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = (TCyPEKSzIyweCN5yp1) parcelable;
        super.onRestoreInstanceState(tCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL());
        SparseArray sparseArray = tCyPEKSzIyweCN5yp1.f3223HJFh0TGMpafqLE9haL;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = LIMtzhnLwQyigzK0KO(childAt).husNiw3snxdgZPAGJm();
            if (id != -1 && s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.A49QRPHynYLCBN0SqP(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableVItLRw50eXTZeEfGl0;
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new TCyPEKSzIyweCN5yp1(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = ((husNiw3snxdgZPAGJm) childAt.getLayoutParams()).husNiw3snxdgZPAGJm();
            if (id != -1 && s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm != null && (parcelableVItLRw50eXTZeEfGl0 = s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.VItLRw50eXTZeEfGl0(this, childAt)) != null) {
                sparseArray.append(id, parcelableVItLRw50eXTZeEfGl0);
            }
        }
        tCyPEKSzIyweCN5yp1.f3223HJFh0TGMpafqLE9haL = sparseArray;
        return tCyPEKSzIyweCN5yp1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return KYHag8HRDlnO3X9zmZ(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        s3fjYDxWOUexjjVgyA(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3211Z9WdNiOsPR0y54zHW4
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.DfpieXfdYs58yZAiXY(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f3211Z9WdNiOsPR0y54zHW4
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$husNiw3snxdgZPAGJm r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.husNiw3snxdgZPAGJm) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$s3fjYDxWOUexjjVgyA r6 = r6.husNiw3snxdgZPAGJm()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f3211Z9WdNiOsPR0y54zHW4
            boolean r6 = r6.jCtUeU2YI1poCxWcjm(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f3211Z9WdNiOsPR0y54zHW4
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.lLKzvdU99Iw80uVD5I(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final zXY7dgnTfw9Pd9RXel oocVJL811qFf0j0XXZ(zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel) {
        if (tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f3212aPyGSIylzVNKPT1Bls, zxy7dgntfw9pd9rxel)) {
            return zxy7dgntfw9pd9rxel;
        }
        this.f3212aPyGSIylzVNKPT1Bls = zxy7dgntfw9pd9rxel;
        boolean z = false;
        boolean z2 = zxy7dgntfw9pd9rxel != null && zxy7dgntfw9pd9rxel.Z9WdNiOsPR0y54zHW4() > 0;
        this.f3206OANkd3mP6AYvwbNLJM = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxelZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4(zxy7dgntfw9pd9rxel);
        requestLayout();
        return zxy7dgntfw9pd9rxelZ9WdNiOsPR0y54zHW4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = ((husNiw3snxdgZPAGJm) view.getLayoutParams()).husNiw3snxdgZPAGJm();
        if (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm == null || !s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.LIMtzhnLwQyigzK0KO(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f3204IPyIQcaNa8aB7drBED) {
            return;
        }
        lLKzvdU99Iw80uVD5I(false);
        this.f3204IPyIQcaNa8aB7drBED = true;
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public void s3fjYDxWOUexjjVgyA(View view, int i) {
        this.f3207R9SAhYMerGybF9OAjL.zZKhbgvUfsK4AEX3r0(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) childAt.getLayoutParams();
            if (husniw3snxdgzpagjm.pbVGzGjWvY2LDXC8vo(i)) {
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = husniw3snxdgzpagjm.husNiw3snxdgZPAGJm();
                if (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm != null) {
                    s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.OUd9THiLjZndMj0qdF(this, childAt, view, i);
                }
                husniw3snxdgzpagjm.Z9WdNiOsPR0y54zHW4(i);
                husniw3snxdgzpagjm.Acstmh57AKoSEkEFNJ();
            }
        }
        this.f3213e54J8UWNHWALQNixXM = null;
    }

    public void sTkWmhpZ5b1ArQIw4K(View view, Rect rect) {
        R9SAhYMerGybF9OAjL.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this, view, rect);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        udcVtCzLTM1Loe9KrX();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3219sTkWmhpZ5b1ArQIw4K = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f3221zaq8hOURtfwbcX17cG;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f3221zaq8hOURtfwbcX17cG = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f3221zaq8hOURtfwbcX17cG.setState(getDrawableState());
                }
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(this.f3221zaq8hOURtfwbcX17cG, lLKzvdU99Iw80uVD5I.A49QRPHynYLCBN0SqP(this));
                this.f3221zaq8hOURtfwbcX17cG.setVisible(getVisibility() == 0, false);
                this.f3221zaq8hOURtfwbcX17cG.setCallback(this);
            }
            lLKzvdU99Iw80uVD5I.osrHU7fvDp2EgxZPfM(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f3221zaq8hOURtfwbcX17cG;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f3221zaq8hOURtfwbcX17cG.setVisible(z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tXWeW0sqVddf7ZBflq(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.tXWeW0sqVddf7ZBflq(int):void");
    }

    public final void udcVtCzLTM1Loe9KrX() {
        if (!lLKzvdU99Iw80uVD5I.G7AC3DWIx9i9fdanjk(this)) {
            lLKzvdU99Iw80uVD5I.Er40JrQbOM51vCQI8w(this, null);
            return;
        }
        if (this.f3210Y43RdunnpKgpbny0lE == null) {
            this.f3210Y43RdunnpKgpbny0lE = new lEeR5KfoEr4xU5yHH7();
        }
        lLKzvdU99Iw80uVD5I.Er40JrQbOM51vCQI8w(this, this.f3210Y43RdunnpKgpbny0lE);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3221zaq8hOURtfwbcX17cG;
    }

    public void xHA29AmDt6y96AnB3t(View view, Rect rect) {
        rect.set(((husNiw3snxdgZPAGJm) view.getLayoutParams()).TCyPEKSzIyweCN5yp1());
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.THTDvPxsHqMeGb512f
    public void zZKhbgvUfsK4AEX3r0(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm;
        boolean z;
        int iMin;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) childAt.getLayoutParams();
                if (husniw3snxdgzpagjm.pbVGzGjWvY2LDXC8vo(i5) && (s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm = husniw3snxdgzpagjm.husNiw3snxdgZPAGJm()) != null) {
                    int[] iArr2 = this.f3205KYHag8HRDlnO3X9zmZ;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    s3fjydxwouexjjvgyaHusNiw3snxdgZPAGJm.R9SAhYMerGybF9OAjL(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f3205KYHag8HRDlnO3X9zmZ;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        iMin = Math.max(i6, this.f3205KYHag8HRDlnO3X9zmZ[1]);
                    } else {
                        z = true;
                        iMin = Math.min(i6, this.f3205KYHag8HRDlnO3X9zmZ[1]);
                    }
                    i6 = iMin;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i6;
        if (z2) {
            tXWeW0sqVddf7ZBflq(1);
        }
    }

    public List zaq8hOURtfwbcX17cG(View view) {
        List listTCyPEKSzIyweCN5yp1 = this.f3218s3fjYDxWOUexjjVgyA.TCyPEKSzIyweCN5yp1(view);
        this.f3220zZKhbgvUfsK4AEX3r0.clear();
        if (listTCyPEKSzIyweCN5yp1 != null) {
            this.f3220zZKhbgvUfsK4AEX3r0.addAll(listTCyPEKSzIyweCN5yp1);
        }
        return this.f3220zZKhbgvUfsK4AEX3r0;
    }

    public final void zcy2NNbtVXgoGQbfuq(View view, int i) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) view.getLayoutParams();
        int i2 = husniw3snxdgzpagjm.f3237pbVGzGjWvY2LDXC8vo;
        if (i2 != i) {
            lLKzvdU99Iw80uVD5I.oocVJL811qFf0j0XXZ(view, i - i2);
            husniw3snxdgzpagjm.f3237pbVGzGjWvY2LDXC8vo = i;
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3216lEeR5KfoEr4xU5yHH7 = new ArrayList();
        this.f3218s3fjYDxWOUexjjVgyA = new R9SAhYMerGybF9OAjL.s3fjYDxWOUexjjVgyA();
        this.f3203HJFh0TGMpafqLE9haL = new ArrayList();
        this.f3220zZKhbgvUfsK4AEX3r0 = new ArrayList();
        this.f3205KYHag8HRDlnO3X9zmZ = new int[2];
        this.f3209TCyPEKSzIyweCN5yp1 = new int[2];
        this.f3207R9SAhYMerGybF9OAjL = new ao3wqKm5CXFuvC0q47(this);
        int[] iArr = Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2171s3fjYDxWOUexjjVgyA;
        TypedArray typedArrayObtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA.f2174lEeR5KfoEr4xU5yHH7) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2171s3fjYDxWOUexjjVgyA;
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes, 0, Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA.f2174lEeR5KfoEr4xU5yHH7);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2158HJFh0TGMpafqLE9haL, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3202Acstmh57AKoSEkEFNJ = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f3202Acstmh57AKoSEkEFNJ.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f3202Acstmh57AKoSEkEFNJ[i2] = (int) (r12[i2] * f);
            }
        }
        this.f3221zaq8hOURtfwbcX17cG = typedArrayObtainStyledAttributes.getDrawable(Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL.f2172zZKhbgvUfsK4AEX3r0);
        typedArrayObtainStyledAttributes.recycle();
        udcVtCzLTM1Loe9KrX();
        super.setOnHierarchyChangeListener(new zZKhbgvUfsK4AEX3r0());
        if (lLKzvdU99Iw80uVD5I.xHA29AmDt6y96AnB3t(this) == 0) {
            lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(this, 1);
        }
    }
}
