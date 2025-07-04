package androidx.recyclerview.widget;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import W3RZ2dTDKrKpS5Mxdk.zcy2NNbtVXgoGQbfuq;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM;
import androidx.recyclerview.widget.Z9WdNiOsPR0y54zHW4;
import androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls;
import androidx.recyclerview.widget.husNiw3snxdgZPAGJm;
import androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7;
import androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: HZ4bptRS9XIcK1CV95, reason: collision with root package name */
    public static final Interpolator f4019HZ4bptRS9XIcK1CV95;

    /* renamed from: f2zPq7MOnQrtOlZ1Zg, reason: collision with root package name */
    public static final Class[] f4022f2zPq7MOnQrtOlZ1Zg;

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public boolean f4026A49QRPHynYLCBN0SqP;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final Rect f4027Acstmh57AKoSEkEFNJ;

    /* renamed from: CSih7GetOUab1dYQjM, reason: collision with root package name */
    public final ao3wqKm5CXFuvC0q47 f4028CSih7GetOUab1dYQjM;

    /* renamed from: DFYiVi7zXozAjRciKa, reason: collision with root package name */
    public W3RZ2dTDKrKpS5Mxdk.VItLRw50eXTZeEfGl0 f4029DFYiVi7zXozAjRciKa;

    /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
    public EdgeEffect f4030DfpieXfdYs58yZAiXY;

    /* renamed from: FtYx4GXtxwA8al5hBy, reason: collision with root package name */
    public final int[] f4031FtYx4GXtxwA8al5hBy;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public int f4032G7AC3DWIx9i9fdanjk;

    /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
    public EdgeEffect f4033GyWRxpdt1T8mEJXPoD;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public A49QRPHynYLCBN0SqP f4034HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final Runnable f4035IPyIQcaNa8aB7drBED;

    /* renamed from: Jsouc4ileb8SxQhxbX, reason: collision with root package name */
    public final List f4036Jsouc4ileb8SxQhxbX;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM f4037KYHag8HRDlnO3X9zmZ;

    /* renamed from: Kh0uC90qEEhuLdpgB9, reason: collision with root package name */
    public List f4038Kh0uC90qEEhuLdpgB9;

    /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
    public e54J8UWNHWALQNixXM f4039KqgKJKIWne3kz1AdHk;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public boolean f4040LIMtzhnLwQyigzK0KO;

    /* renamed from: LU0fFDMACqnfIfA1AZ, reason: collision with root package name */
    public int f4041LU0fFDMACqnfIfA1AZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public sTkWmhpZ5b1ArQIw4K f4042OANkd3mP6AYvwbNLJM;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public boolean f4043OUd9THiLjZndMj0qdF;

    /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
    public EdgeEffect f4044OqIo5QF00RDxUQb4qq;

    /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
    public int f4045PPkm9uUfOJHHYveeLT;

    /* renamed from: Pum9NZyDBKoCnecvlx, reason: collision with root package name */
    public boolean f4046Pum9NZyDBKoCnecvlx;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public boolean f4047R9SAhYMerGybF9OAjL;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public aPyGSIylzVNKPT1Bls f4048T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f4049TCyPEKSzIyweCN5yp1;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public final AccessibilityManager f4050THTDvPxsHqMeGb512f;

    /* renamed from: ToH8yzk8U1nKT0PUfY, reason: collision with root package name */
    public int f4051ToH8yzk8U1nKT0PUfY;

    /* renamed from: Tu4WCh2gEwj8E4oHbP, reason: collision with root package name */
    public final WWC27LAMFqFFBzfbNw f4052Tu4WCh2gEwj8E4oHbP;

    /* renamed from: Uj8rPa1EWADtk6Oe0S, reason: collision with root package name */
    public boolean f4053Uj8rPa1EWADtk6Oe0S;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public int f4054VItLRw50eXTZeEfGl0;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public Z9WdNiOsPR0y54zHW4 f4055W3RZ2dTDKrKpS5Mxdk;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public boolean f4056WWC27LAMFqFFBzfbNw;

    /* renamed from: XdzLv4NdAtTYoEzVzB, reason: collision with root package name */
    public int f4057XdzLv4NdAtTYoEzVzB;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public int f4058XzJ1BS7H9Ilbkv4eVM;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public boolean f4059Y43RdunnpKgpbny0lE;

    /* renamed from: YlLW4G6OV9TFyuw5ix, reason: collision with root package name */
    public int f4060YlLW4G6OV9TFyuw5ix;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final RectF f4061Z9WdNiOsPR0y54zHW4;

    /* renamed from: ZJNyOIPL0usMs2xSAn, reason: collision with root package name */
    public husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA f4062ZJNyOIPL0usMs2xSAn;

    /* renamed from: aAp6BD79BhftLCnuvf, reason: collision with root package name */
    public int f4063aAp6BD79BhftLCnuvf;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public final ArrayList f4064aPyGSIylzVNKPT1Bls;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public List f4065ao3wqKm5CXFuvC0q47;

    /* renamed from: ayduHasC7VpxsVXE0T, reason: collision with root package name */
    public final int[] f4066ayduHasC7VpxsVXE0T;

    /* renamed from: bBVlTkqEpHW053CjWL, reason: collision with root package name */
    public final OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA f4067bBVlTkqEpHW053CjWL;

    /* renamed from: bMSdooljgH14Jgudph, reason: collision with root package name */
    public float f4068bMSdooljgH14Jgudph;

    /* renamed from: cT5Hs3CQpLK8NvlZAw, reason: collision with root package name */
    public final int f4069cT5Hs3CQpLK8NvlZAw;

    /* renamed from: ctWLFN70QQINH1kyYo, reason: collision with root package name */
    public boolean f4070ctWLFN70QQINH1kyYo;

    /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
    public EdgeEffect f4071e2F9F6h8YJxTHwLCa0;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public TCyPEKSzIyweCN5yp1 f4072e54J8UWNHWALQNixXM;

    /* renamed from: eWK41qw3g36LVd4UnS, reason: collision with root package name */
    public androidx.recyclerview.widget.Z9WdNiOsPR0y54zHW4 f4073eWK41qw3g36LVd4UnS;

    /* renamed from: evSiTWao80SbJUZk9E, reason: collision with root package name */
    public final int[] f4074evSiTWao80SbJUZk9E;

    /* renamed from: fLSSbwbzFBVpwBH5FM, reason: collision with root package name */
    public Runnable f4075fLSSbwbzFBVpwBH5FM;

    /* renamed from: hUNBy66ZO1wVLJGW3l, reason: collision with root package name */
    public float f4076hUNBy66ZO1wVLJGW3l;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public final ArrayList f4077hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA f4078husNiw3snxdgZPAGJm;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public boolean f4079jCtUeU2YI1poCxWcjm;

    /* renamed from: jocVUfxESVhVJU8LoH, reason: collision with root package name */
    public e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7 f4080jocVUfxESVhVJU8LoH;

    /* renamed from: k0CbjZvfUz23r8IN6W, reason: collision with root package name */
    public Y43RdunnpKgpbny0lE f4081k0CbjZvfUz23r8IN6W;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final LIMtzhnLwQyigzK0KO f4082lEeR5KfoEr4xU5yHH7;

    /* renamed from: lLKzvdU99Iw80uVD5I, reason: collision with root package name */
    public VelocityTracker f4083lLKzvdU99Iw80uVD5I;

    /* renamed from: oocVJL811qFf0j0XXZ, reason: collision with root package name */
    public zaq8hOURtfwbcX17cG f4084oocVJL811qFf0j0XXZ;

    /* renamed from: osrHU7fvDp2EgxZPfM, reason: collision with root package name */
    public androidx.recyclerview.widget.husNiw3snxdgZPAGJm f4085osrHU7fvDp2EgxZPfM;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final Rect f4086pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final G7AC3DWIx9i9fdanjk f4087s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public boolean f4088sTkWmhpZ5b1ArQIw4K;

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public int f4089tXWeW0sqVddf7ZBflq;

    /* renamed from: udcVtCzLTM1Loe9KrX, reason: collision with root package name */
    public final int f4090udcVtCzLTM1Loe9KrX;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public boolean f4091xHA29AmDt6y96AnB3t;

    /* renamed from: xMfAHy6F7qK0zhxhKG, reason: collision with root package name */
    public final int[] f4092xMfAHy6F7qK0zhxhKG;

    /* renamed from: zXY7dgnTfw9Pd9RXel, reason: collision with root package name */
    public boolean f4093zXY7dgnTfw9Pd9RXel;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7 f4094zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public boolean f4095zaq8hOURtfwbcX17cG;

    /* renamed from: zcy2NNbtVXgoGQbfuq, reason: collision with root package name */
    public int f4096zcy2NNbtVXgoGQbfuq;

    /* renamed from: yvdWWG9COQQotjfedH, reason: collision with root package name */
    public static final int[] f4025yvdWWG9COQQotjfedH = {R.attr.nestedScrollingEnabled};

    /* renamed from: O1furmptfI76BGfN0d, reason: collision with root package name */
    public static final boolean f4020O1furmptfI76BGfN0d = false;

    /* renamed from: iQCvttGuB7nx4r7kMP, reason: collision with root package name */
    public static final boolean f4023iQCvttGuB7nx4r7kMP = true;

    /* renamed from: yL2E9nlEZpg8ZZx8XE, reason: collision with root package name */
    public static final boolean f4024yL2E9nlEZpg8ZZx8XE = true;

    /* renamed from: Fo9071MN8vwEWamAUX, reason: collision with root package name */
    public static final boolean f4018Fo9071MN8vwEWamAUX = true;

    /* renamed from: Er40JrQbOM51vCQI8w, reason: collision with root package name */
    public static final boolean f4017Er40JrQbOM51vCQI8w = false;

    /* renamed from: Ywqw2A0s86HeuFkDt0, reason: collision with root package name */
    public static final boolean f4021Ywqw2A0s86HeuFkDt0 = false;

    public static class A49QRPHynYLCBN0SqP extends aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7 {
        public static final Parcelable.Creator<A49QRPHynYLCBN0SqP> CREATOR = new lEeR5KfoEr4xU5yHH7();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public Parcelable f4097HJFh0TGMpafqLE9haL;

        public static class lEeR5KfoEr4xU5yHH7 implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
            public A49QRPHynYLCBN0SqP[] newArray(int i) {
                return new A49QRPHynYLCBN0SqP[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
            public A49QRPHynYLCBN0SqP createFromParcel(Parcel parcel) {
                return new A49QRPHynYLCBN0SqP(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
            public A49QRPHynYLCBN0SqP createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new A49QRPHynYLCBN0SqP(parcel, classLoader);
            }
        }

        public A49QRPHynYLCBN0SqP(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4097HJFh0TGMpafqLE9haL = parcel.readParcelable(classLoader == null ? aPyGSIylzVNKPT1Bls.class.getClassLoader() : classLoader);
        }

        @Override // aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4097HJFh0TGMpafqLE9haL, 0);
        }

        public void zZKhbgvUfsK4AEX3r0(A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            this.f4097HJFh0TGMpafqLE9haL = a49QRPHynYLCBN0SqP.f4097HJFh0TGMpafqLE9haL;
        }

        public A49QRPHynYLCBN0SqP(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface Acstmh57AKoSEkEFNJ {
    }

    public final class G7AC3DWIx9i9fdanjk {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final ArrayList f4098HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int f4100KYHag8HRDlnO3X9zmZ;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public R9SAhYMerGybF9OAjL f4101TCyPEKSzIyweCN5yp1;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f4102husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final ArrayList f4103lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public ArrayList f4104s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final List f4105zZKhbgvUfsK4AEX3r0;

        public G7AC3DWIx9i9fdanjk() {
            ArrayList arrayList = new ArrayList();
            this.f4103lEeR5KfoEr4xU5yHH7 = arrayList;
            this.f4104s3fjYDxWOUexjjVgyA = null;
            this.f4098HJFh0TGMpafqLE9haL = new ArrayList();
            this.f4105zZKhbgvUfsK4AEX3r0 = Collections.unmodifiableList(arrayList);
            this.f4102husNiw3snxdgZPAGJm = 2;
            this.f4100KYHag8HRDlnO3X9zmZ = 2;
        }

        public void A49QRPHynYLCBN0SqP(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp12, boolean z) {
            HJFh0TGMpafqLE9haL();
            pbVGzGjWvY2LDXC8vo().IPyIQcaNa8aB7drBED(tCyPEKSzIyweCN5yp1, tCyPEKSzIyweCN5yp12, z);
        }

        public int Acstmh57AKoSEkEFNJ() {
            return this.f4103lEeR5KfoEr4xU5yHH7.size();
        }

        public void DfpieXfdYs58yZAiXY(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            (oUd9THiLjZndMj0qdF.f4121aPyGSIylzVNKPT1Bls ? this.f4104s3fjYDxWOUexjjVgyA : this.f4103lEeR5KfoEr4xU5yHH7).remove(oUd9THiLjZndMj0qdF);
            oUd9THiLjZndMj0qdF.f4123hoXrIDAFrSwfShk8da = null;
            oUd9THiLjZndMj0qdF.f4121aPyGSIylzVNKPT1Bls = false;
            oUd9THiLjZndMj0qdF.husNiw3snxdgZPAGJm();
        }

        public void G7AC3DWIx9i9fdanjk(int i, int i2) {
            int size = this.f4098HJFh0TGMpafqLE9haL.size();
            for (int i3 = 0; i3 < size; i3++) {
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = (OUd9THiLjZndMj0qdF) this.f4098HJFh0TGMpafqLE9haL.get(i3);
                if (oUd9THiLjZndMj0qdF != null && oUd9THiLjZndMj0qdF.f4114HJFh0TGMpafqLE9haL >= i) {
                    oUd9THiLjZndMj0qdF.THTDvPxsHqMeGb512f(i2, true);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f5 A[PHI: r1 r4
          0x00f5: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$OUd9THiLjZndMj0qdF) = 
          (r1v11 androidx.recyclerview.widget.RecyclerView$OUd9THiLjZndMj0qdF)
          (r1v30 androidx.recyclerview.widget.RecyclerView$OUd9THiLjZndMj0qdF)
         binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]
          0x00f5: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01cd A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01d0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.OUd9THiLjZndMj0qdF GyWRxpdt1T8mEJXPoD(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 524
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.G7AC3DWIx9i9fdanjk.GyWRxpdt1T8mEJXPoD(int, boolean, long):androidx.recyclerview.widget.RecyclerView$OUd9THiLjZndMj0qdF");
        }

        public void HJFh0TGMpafqLE9haL() {
            this.f4103lEeR5KfoEr4xU5yHH7.clear();
            WWC27LAMFqFFBzfbNw();
        }

        public OUd9THiLjZndMj0qdF IPyIQcaNa8aB7drBED(int i) {
            int size;
            int iT9PhQIpGRhE4yZDm1C;
            ArrayList arrayList = this.f4104s3fjYDxWOUexjjVgyA;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = (OUd9THiLjZndMj0qdF) this.f4104s3fjYDxWOUexjjVgyA.get(i2);
                    if (!oUd9THiLjZndMj0qdF.KqgKJKIWne3kz1AdHk() && oUd9THiLjZndMj0qdF.T9PhQIpGRhE4yZDm1C() == i) {
                        oUd9THiLjZndMj0qdF.s3fjYDxWOUexjjVgyA(32);
                        return oUd9THiLjZndMj0qdF;
                    }
                }
                if (RecyclerView.this.f4072e54J8UWNHWALQNixXM.TCyPEKSzIyweCN5yp1() && (iT9PhQIpGRhE4yZDm1C = RecyclerView.this.f4094zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(i)) > 0 && iT9PhQIpGRhE4yZDm1C < RecyclerView.this.f4072e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL()) {
                    long jZZKhbgvUfsK4AEX3r0 = RecyclerView.this.f4072e54J8UWNHWALQNixXM.zZKhbgvUfsK4AEX3r0(iT9PhQIpGRhE4yZDm1C);
                    for (int i3 = 0; i3 < size; i3++) {
                        OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF2 = (OUd9THiLjZndMj0qdF) this.f4104s3fjYDxWOUexjjVgyA.get(i3);
                        if (!oUd9THiLjZndMj0qdF2.KqgKJKIWne3kz1AdHk() && oUd9THiLjZndMj0qdF2.Z9WdNiOsPR0y54zHW4() == jZZKhbgvUfsK4AEX3r0) {
                            oUd9THiLjZndMj0qdF2.s3fjYDxWOUexjjVgyA(32);
                            return oUd9THiLjZndMj0qdF2;
                        }
                    }
                }
            }
            return null;
        }

        public int KYHag8HRDlnO3X9zmZ(int i) {
            if (i >= 0 && i < RecyclerView.this.f4052Tu4WCh2gEwj8E4oHbP.s3fjYDxWOUexjjVgyA()) {
                return !RecyclerView.this.f4052Tu4WCh2gEwj8E4oHbP.husNiw3snxdgZPAGJm() ? i : RecyclerView.this.f4094zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f4052Tu4WCh2gEwj8E4oHbP.s3fjYDxWOUexjjVgyA() + RecyclerView.this.lLKzvdU99Iw80uVD5I());
        }

        public boolean KqgKJKIWne3kz1AdHk(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            if (oUd9THiLjZndMj0qdF.xHA29AmDt6y96AnB3t()) {
                return RecyclerView.this.f4052Tu4WCh2gEwj8E4oHbP.husNiw3snxdgZPAGJm();
            }
            int i = oUd9THiLjZndMj0qdF.f4114HJFh0TGMpafqLE9haL;
            if (i >= 0 && i < RecyclerView.this.f4072e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL()) {
                if (RecyclerView.this.f4052Tu4WCh2gEwj8E4oHbP.husNiw3snxdgZPAGJm() || RecyclerView.this.f4072e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm(oUd9THiLjZndMj0qdF.f4114HJFh0TGMpafqLE9haL) == oUd9THiLjZndMj0qdF.e54J8UWNHWALQNixXM()) {
                    return !RecyclerView.this.f4072e54J8UWNHWALQNixXM.TCyPEKSzIyweCN5yp1() || oUd9THiLjZndMj0qdF.Z9WdNiOsPR0y54zHW4() == RecyclerView.this.f4072e54J8UWNHWALQNixXM.zZKhbgvUfsK4AEX3r0(oUd9THiLjZndMj0qdF.f4114HJFh0TGMpafqLE9haL);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + oUd9THiLjZndMj0qdF + RecyclerView.this.lLKzvdU99Iw80uVD5I());
        }

        public void LIMtzhnLwQyigzK0KO(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f4098HJFh0TGMpafqLE9haL.size() - 1; size >= 0; size--) {
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = (OUd9THiLjZndMj0qdF) this.f4098HJFh0TGMpafqLE9haL.get(size);
                if (oUd9THiLjZndMj0qdF != null) {
                    int i4 = oUd9THiLjZndMj0qdF.f4114HJFh0TGMpafqLE9haL;
                    if (i4 >= i3) {
                        oUd9THiLjZndMj0qdF.THTDvPxsHqMeGb512f(-i2, z);
                    } else if (i4 >= i) {
                        oUd9THiLjZndMj0qdF.s3fjYDxWOUexjjVgyA(8);
                        THTDvPxsHqMeGb512f(size);
                    }
                }
            }
        }

        public View OANkd3mP6AYvwbNLJM(int i, boolean z) {
            return GyWRxpdt1T8mEJXPoD(i, z, Long.MAX_VALUE).f4125lEeR5KfoEr4xU5yHH7;
        }

        public void OUd9THiLjZndMj0qdF(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            boolean z;
            boolean z2 = true;
            if (oUd9THiLjZndMj0qdF.LIMtzhnLwQyigzK0KO() || oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(oUd9THiLjZndMj0qdF.LIMtzhnLwQyigzK0KO());
                sb.append(" isAttached:");
                sb.append(oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.getParent() != null);
                sb.append(RecyclerView.this.lLKzvdU99Iw80uVD5I());
                throw new IllegalArgumentException(sb.toString());
            }
            if (oUd9THiLjZndMj0qdF.A49QRPHynYLCBN0SqP()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + oUd9THiLjZndMj0qdF + RecyclerView.this.lLKzvdU99Iw80uVD5I());
            }
            if (oUd9THiLjZndMj0qdF.DfpieXfdYs58yZAiXY()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.lLKzvdU99Iw80uVD5I());
            }
            boolean zIPyIQcaNa8aB7drBED = oUd9THiLjZndMj0qdF.IPyIQcaNa8aB7drBED();
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = RecyclerView.this.f4072e54J8UWNHWALQNixXM;
            if ((tCyPEKSzIyweCN5yp1 != null && zIPyIQcaNa8aB7drBED && tCyPEKSzIyweCN5yp1.T9PhQIpGRhE4yZDm1C(oUd9THiLjZndMj0qdF)) || oUd9THiLjZndMj0qdF.G7AC3DWIx9i9fdanjk()) {
                if (this.f4100KYHag8HRDlnO3X9zmZ <= 0 || oUd9THiLjZndMj0qdF.OANkd3mP6AYvwbNLJM(526)) {
                    z = false;
                } else {
                    int size = this.f4098HJFh0TGMpafqLE9haL.size();
                    if (size >= this.f4100KYHag8HRDlnO3X9zmZ && size > 0) {
                        THTDvPxsHqMeGb512f(0);
                        size--;
                    }
                    if (RecyclerView.f4018Fo9071MN8vwEWamAUX && size > 0 && !RecyclerView.this.f4062ZJNyOIPL0usMs2xSAn.zZKhbgvUfsK4AEX3r0(oUd9THiLjZndMj0qdF.f4114HJFh0TGMpafqLE9haL)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!RecyclerView.this.f4062ZJNyOIPL0usMs2xSAn.zZKhbgvUfsK4AEX3r0(((OUd9THiLjZndMj0qdF) this.f4098HJFh0TGMpafqLE9haL.get(i)).f4114HJFh0TGMpafqLE9haL)) {
                                break;
                            } else {
                                i--;
                            }
                        }
                        size = i + 1;
                    }
                    this.f4098HJFh0TGMpafqLE9haL.add(size, oUd9THiLjZndMj0qdF);
                    z = true;
                }
                if (z) {
                    z2 = false;
                } else {
                    lEeR5KfoEr4xU5yHH7(oUd9THiLjZndMj0qdF, true);
                }
                z = z;
            } else {
                z2 = false;
            }
            RecyclerView.this.f4037KYHag8HRDlnO3X9zmZ.zaq8hOURtfwbcX17cG(oUd9THiLjZndMj0qdF);
            if (z || z2 || !zIPyIQcaNa8aB7drBED) {
                return;
            }
            oUd9THiLjZndMj0qdF.f4128sTkWmhpZ5b1ArQIw4K = null;
        }

        public final boolean OqIo5QF00RDxUQb4qq(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, int i, int i2, long j) {
            oUd9THiLjZndMj0qdF.f4128sTkWmhpZ5b1ArQIw4K = RecyclerView.this;
            int iE54J8UWNHWALQNixXM = oUd9THiLjZndMj0qdF.e54J8UWNHWALQNixXM();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f4101TCyPEKSzIyweCN5yp1.Z9WdNiOsPR0y54zHW4(iE54J8UWNHWALQNixXM, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f4072e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(oUd9THiLjZndMj0qdF, i);
            this.f4101TCyPEKSzIyweCN5yp1.zZKhbgvUfsK4AEX3r0(oUd9THiLjZndMj0qdF.e54J8UWNHWALQNixXM(), RecyclerView.this.getNanoTime() - nanoTime);
            s3fjYDxWOUexjjVgyA(oUd9THiLjZndMj0qdF);
            if (!RecyclerView.this.f4052Tu4WCh2gEwj8E4oHbP.husNiw3snxdgZPAGJm()) {
                return true;
            }
            oUd9THiLjZndMj0qdF.f4119TCyPEKSzIyweCN5yp1 = i2;
            return true;
        }

        public void PPkm9uUfOJHHYveeLT(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f4098HJFh0TGMpafqLE9haL.size() - 1; size >= 0; size--) {
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = (OUd9THiLjZndMj0qdF) this.f4098HJFh0TGMpafqLE9haL.get(size);
                if (oUd9THiLjZndMj0qdF != null && (i3 = oUd9THiLjZndMj0qdF.f4114HJFh0TGMpafqLE9haL) >= i && i3 < i4) {
                    oUd9THiLjZndMj0qdF.s3fjYDxWOUexjjVgyA(2);
                    THTDvPxsHqMeGb512f(size);
                }
            }
        }

        public void R9SAhYMerGybF9OAjL() {
            int size = this.f4098HJFh0TGMpafqLE9haL.size();
            for (int i = 0; i < size; i++) {
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = (OUd9THiLjZndMj0qdF) this.f4098HJFh0TGMpafqLE9haL.get(i);
                if (oUd9THiLjZndMj0qdF != null) {
                    oUd9THiLjZndMj0qdF.s3fjYDxWOUexjjVgyA(6);
                    oUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7(null);
                }
            }
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = RecyclerView.this.f4072e54J8UWNHWALQNixXM;
            if (tCyPEKSzIyweCN5yp1 == null || !tCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1()) {
                WWC27LAMFqFFBzfbNw();
            }
        }

        public OUd9THiLjZndMj0qdF T9PhQIpGRhE4yZDm1C(int i, boolean z) {
            View viewHusNiw3snxdgZPAGJm;
            int size = this.f4103lEeR5KfoEr4xU5yHH7.size();
            for (int i2 = 0; i2 < size; i2++) {
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = (OUd9THiLjZndMj0qdF) this.f4103lEeR5KfoEr4xU5yHH7.get(i2);
                if (!oUd9THiLjZndMj0qdF.KqgKJKIWne3kz1AdHk() && oUd9THiLjZndMj0qdF.T9PhQIpGRhE4yZDm1C() == i && !oUd9THiLjZndMj0qdF.R9SAhYMerGybF9OAjL() && (RecyclerView.this.f4052Tu4WCh2gEwj8E4oHbP.f4157IPyIQcaNa8aB7drBED || !oUd9THiLjZndMj0qdF.xHA29AmDt6y96AnB3t())) {
                    oUd9THiLjZndMj0qdF.s3fjYDxWOUexjjVgyA(32);
                    return oUd9THiLjZndMj0qdF;
                }
            }
            if (z || (viewHusNiw3snxdgZPAGJm = RecyclerView.this.f4078husNiw3snxdgZPAGJm.husNiw3snxdgZPAGJm(i)) == null) {
                int size2 = this.f4098HJFh0TGMpafqLE9haL.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF2 = (OUd9THiLjZndMj0qdF) this.f4098HJFh0TGMpafqLE9haL.get(i3);
                    if (!oUd9THiLjZndMj0qdF2.R9SAhYMerGybF9OAjL() && oUd9THiLjZndMj0qdF2.T9PhQIpGRhE4yZDm1C() == i && !oUd9THiLjZndMj0qdF2.sTkWmhpZ5b1ArQIw4K()) {
                        if (!z) {
                            this.f4098HJFh0TGMpafqLE9haL.remove(i3);
                        }
                        return oUd9THiLjZndMj0qdF2;
                    }
                }
                return null;
            }
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(viewHusNiw3snxdgZPAGJm);
            RecyclerView.this.f4078husNiw3snxdgZPAGJm.Y43RdunnpKgpbny0lE(viewHusNiw3snxdgZPAGJm);
            int iT9PhQIpGRhE4yZDm1C = RecyclerView.this.f4078husNiw3snxdgZPAGJm.T9PhQIpGRhE4yZDm1C(viewHusNiw3snxdgZPAGJm);
            if (iT9PhQIpGRhE4yZDm1C != -1) {
                RecyclerView.this.f4078husNiw3snxdgZPAGJm.zZKhbgvUfsK4AEX3r0(iT9PhQIpGRhE4yZDm1C);
                jCtUeU2YI1poCxWcjm(viewHusNiw3snxdgZPAGJm);
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.s3fjYDxWOUexjjVgyA(8224);
                return oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W + RecyclerView.this.lLKzvdU99Iw80uVD5I());
        }

        public void TCyPEKSzIyweCN5yp1(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            RecyclerView.this.getClass();
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = RecyclerView.this.f4072e54J8UWNHWALQNixXM;
            if (tCyPEKSzIyweCN5yp1 != null) {
                tCyPEKSzIyweCN5yp1.OANkd3mP6AYvwbNLJM(oUd9THiLjZndMj0qdF);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4052Tu4WCh2gEwj8E4oHbP != null) {
                recyclerView.f4037KYHag8HRDlnO3X9zmZ.zaq8hOURtfwbcX17cG(oUd9THiLjZndMj0qdF);
            }
        }

        public void THTDvPxsHqMeGb512f(int i) {
            lEeR5KfoEr4xU5yHH7((OUd9THiLjZndMj0qdF) this.f4098HJFh0TGMpafqLE9haL.get(i), true);
            this.f4098HJFh0TGMpafqLE9haL.remove(i);
        }

        public void VItLRw50eXTZeEfGl0(View view) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(view);
            oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.f4123hoXrIDAFrSwfShk8da = null;
            oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.f4121aPyGSIylzVNKPT1Bls = false;
            oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.husNiw3snxdgZPAGJm();
            OUd9THiLjZndMj0qdF(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
        }

        public void W3RZ2dTDKrKpS5Mxdk(int i) {
            this.f4102husNiw3snxdgZPAGJm = i;
            e2F9F6h8YJxTHwLCa0();
        }

        public void WWC27LAMFqFFBzfbNw() {
            for (int size = this.f4098HJFh0TGMpafqLE9haL.size() - 1; size >= 0; size--) {
                THTDvPxsHqMeGb512f(size);
            }
            this.f4098HJFh0TGMpafqLE9haL.clear();
            if (RecyclerView.f4018Fo9071MN8vwEWamAUX) {
                RecyclerView.this.f4062ZJNyOIPL0usMs2xSAn.s3fjYDxWOUexjjVgyA();
            }
        }

        public void XzJ1BS7H9Ilbkv4eVM(R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL) {
            R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL2 = this.f4101TCyPEKSzIyweCN5yp1;
            if (r9SAhYMerGybF9OAjL2 != null) {
                r9SAhYMerGybF9OAjL2.HJFh0TGMpafqLE9haL();
            }
            this.f4101TCyPEKSzIyweCN5yp1 = r9SAhYMerGybF9OAjL;
            if (r9SAhYMerGybF9OAjL == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f4101TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7();
        }

        public void Y43RdunnpKgpbny0lE() {
            int size = this.f4098HJFh0TGMpafqLE9haL.size();
            for (int i = 0; i < size; i++) {
                OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (OANkd3mP6AYvwbNLJM) ((OUd9THiLjZndMj0qdF) this.f4098HJFh0TGMpafqLE9haL.get(i)).f4125lEeR5KfoEr4xU5yHH7.getLayoutParams();
                if (oANkd3mP6AYvwbNLJM != null) {
                    oANkd3mP6AYvwbNLJM.f4108HJFh0TGMpafqLE9haL = true;
                }
            }
        }

        public List Z9WdNiOsPR0y54zHW4() {
            return this.f4105zZKhbgvUfsK4AEX3r0;
        }

        public View aPyGSIylzVNKPT1Bls(int i) {
            return OANkd3mP6AYvwbNLJM(i, false);
        }

        public void ao3wqKm5CXFuvC0q47(View view) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(view);
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.A49QRPHynYLCBN0SqP()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.LIMtzhnLwQyigzK0KO()) {
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.e2F9F6h8YJxTHwLCa0();
            } else if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.KqgKJKIWne3kz1AdHk()) {
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.husNiw3snxdgZPAGJm();
            }
            OUd9THiLjZndMj0qdF(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
            if (RecyclerView.this.f4039KqgKJKIWne3kz1AdHk == null || oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.G7AC3DWIx9i9fdanjk()) {
                return;
            }
            RecyclerView.this.f4039KqgKJKIWne3kz1AdHk.Acstmh57AKoSEkEFNJ(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
        }

        public void e2F9F6h8YJxTHwLCa0() {
            aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = RecyclerView.this.f4048T9PhQIpGRhE4yZDm1C;
            this.f4100KYHag8HRDlnO3X9zmZ = this.f4102husNiw3snxdgZPAGJm + (apygsiylzvnkpt1bls != null ? apygsiylzvnkpt1bls.f4177T9PhQIpGRhE4yZDm1C : 0);
            for (int size = this.f4098HJFh0TGMpafqLE9haL.size() - 1; size >= 0 && this.f4098HJFh0TGMpafqLE9haL.size() > this.f4100KYHag8HRDlnO3X9zmZ; size--) {
                THTDvPxsHqMeGb512f(size);
            }
        }

        public OUd9THiLjZndMj0qdF e54J8UWNHWALQNixXM(long j, int i, boolean z) {
            for (int size = this.f4103lEeR5KfoEr4xU5yHH7.size() - 1; size >= 0; size--) {
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = (OUd9THiLjZndMj0qdF) this.f4103lEeR5KfoEr4xU5yHH7.get(size);
                if (oUd9THiLjZndMj0qdF.Z9WdNiOsPR0y54zHW4() == j && !oUd9THiLjZndMj0qdF.KqgKJKIWne3kz1AdHk()) {
                    if (i == oUd9THiLjZndMj0qdF.e54J8UWNHWALQNixXM()) {
                        oUd9THiLjZndMj0qdF.s3fjYDxWOUexjjVgyA(32);
                        if (oUd9THiLjZndMj0qdF.xHA29AmDt6y96AnB3t() && !RecyclerView.this.f4052Tu4WCh2gEwj8E4oHbP.husNiw3snxdgZPAGJm()) {
                            oUd9THiLjZndMj0qdF.tXWeW0sqVddf7ZBflq(2, 14);
                        }
                        return oUd9THiLjZndMj0qdF;
                    }
                    if (!z) {
                        this.f4103lEeR5KfoEr4xU5yHH7.remove(size);
                        RecyclerView.this.removeDetachedView(oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7, false);
                        VItLRw50eXTZeEfGl0(oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7);
                    }
                }
            }
            int size2 = this.f4098HJFh0TGMpafqLE9haL.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF2 = (OUd9THiLjZndMj0qdF) this.f4098HJFh0TGMpafqLE9haL.get(size2);
                if (oUd9THiLjZndMj0qdF2.Z9WdNiOsPR0y54zHW4() == j && !oUd9THiLjZndMj0qdF2.sTkWmhpZ5b1ArQIw4K()) {
                    if (i == oUd9THiLjZndMj0qdF2.e54J8UWNHWALQNixXM()) {
                        if (!z) {
                            this.f4098HJFh0TGMpafqLE9haL.remove(size2);
                        }
                        return oUd9THiLjZndMj0qdF2;
                    }
                    if (!z) {
                        THTDvPxsHqMeGb512f(size2);
                        return null;
                    }
                }
            }
        }

        public View hoXrIDAFrSwfShk8da(int i) {
            return ((OUd9THiLjZndMj0qdF) this.f4103lEeR5KfoEr4xU5yHH7.get(i)).f4125lEeR5KfoEr4xU5yHH7;
        }

        public void husNiw3snxdgZPAGJm() {
            this.f4103lEeR5KfoEr4xU5yHH7.clear();
            ArrayList arrayList = this.f4104s3fjYDxWOUexjjVgyA;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public void jCtUeU2YI1poCxWcjm(View view) {
            ArrayList arrayList;
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(view);
            if (!oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.OANkd3mP6AYvwbNLJM(12) && oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.VItLRw50eXTZeEfGl0() && !RecyclerView.this.aPyGSIylzVNKPT1Bls(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W)) {
                if (this.f4104s3fjYDxWOUexjjVgyA == null) {
                    this.f4104s3fjYDxWOUexjjVgyA = new ArrayList();
                }
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.OqIo5QF00RDxUQb4qq(this, true);
                arrayList = this.f4104s3fjYDxWOUexjjVgyA;
            } else {
                if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.R9SAhYMerGybF9OAjL() && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.xHA29AmDt6y96AnB3t() && !RecyclerView.this.f4072e54J8UWNHWALQNixXM.TCyPEKSzIyweCN5yp1()) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.lLKzvdU99Iw80uVD5I());
                }
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.OqIo5QF00RDxUQb4qq(this, false);
                arrayList = this.f4103lEeR5KfoEr4xU5yHH7;
            }
            arrayList.add(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
        }

        public void lEeR5KfoEr4xU5yHH7(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, boolean z) {
            RecyclerView.zaq8hOURtfwbcX17cG(oUd9THiLjZndMj0qdF);
            View view = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7;
            androidx.recyclerview.widget.Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4 = RecyclerView.this.f4073eWK41qw3g36LVd4UnS;
            if (z9WdNiOsPR0y54zHW4 != null) {
                W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7HoXrIDAFrSwfShk8da = z9WdNiOsPR0y54zHW4.hoXrIDAFrSwfShk8da();
                lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(view, leer5kfoer4xu5yhh7HoXrIDAFrSwfShk8da instanceof Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 ? ((Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7) leer5kfoer4xu5yhh7HoXrIDAFrSwfShk8da).hoXrIDAFrSwfShk8da(view) : null);
            }
            if (z) {
                TCyPEKSzIyweCN5yp1(oUd9THiLjZndMj0qdF);
            }
            oUd9THiLjZndMj0qdF.f4128sTkWmhpZ5b1ArQIw4K = null;
            pbVGzGjWvY2LDXC8vo().pbVGzGjWvY2LDXC8vo(oUd9THiLjZndMj0qdF);
        }

        public R9SAhYMerGybF9OAjL pbVGzGjWvY2LDXC8vo() {
            if (this.f4101TCyPEKSzIyweCN5yp1 == null) {
                this.f4101TCyPEKSzIyweCN5yp1 = new R9SAhYMerGybF9OAjL();
            }
            return this.f4101TCyPEKSzIyweCN5yp1;
        }

        public final void s3fjYDxWOUexjjVgyA(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            if (RecyclerView.this.fLSSbwbzFBVpwBH5FM()) {
                View view = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7;
                if (lLKzvdU99Iw80uVD5I.xHA29AmDt6y96AnB3t(view) == 0) {
                    lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(view, 1);
                }
                androidx.recyclerview.widget.Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4 = RecyclerView.this.f4073eWK41qw3g36LVd4UnS;
                if (z9WdNiOsPR0y54zHW4 == null) {
                    return;
                }
                W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7HoXrIDAFrSwfShk8da = z9WdNiOsPR0y54zHW4.hoXrIDAFrSwfShk8da();
                if (leer5kfoer4xu5yhh7HoXrIDAFrSwfShk8da instanceof Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7) {
                    ((Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7) leer5kfoer4xu5yhh7HoXrIDAFrSwfShk8da).aPyGSIylzVNKPT1Bls(view);
                }
                lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(view, leer5kfoer4xu5yhh7HoXrIDAFrSwfShk8da);
            }
        }

        public final void sTkWmhpZ5b1ArQIw4K(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            View view = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7;
            if (view instanceof ViewGroup) {
                zaq8hOURtfwbcX17cG((ViewGroup) view, false);
            }
        }

        public void tXWeW0sqVddf7ZBflq(THTDvPxsHqMeGb512f tHTDvPxsHqMeGb512f) {
        }

        public void xHA29AmDt6y96AnB3t(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f4098HJFh0TGMpafqLE9haL.size();
            for (int i7 = 0; i7 < size; i7++) {
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = (OUd9THiLjZndMj0qdF) this.f4098HJFh0TGMpafqLE9haL.get(i7);
                if (oUd9THiLjZndMj0qdF != null && (i6 = oUd9THiLjZndMj0qdF.f4114HJFh0TGMpafqLE9haL) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        oUd9THiLjZndMj0qdF.THTDvPxsHqMeGb512f(i2 - i, false);
                    } else {
                        oUd9THiLjZndMj0qdF.THTDvPxsHqMeGb512f(i3, false);
                    }
                }
            }
        }

        public void zZKhbgvUfsK4AEX3r0() {
            int size = this.f4098HJFh0TGMpafqLE9haL.size();
            for (int i = 0; i < size; i++) {
                ((OUd9THiLjZndMj0qdF) this.f4098HJFh0TGMpafqLE9haL.get(i)).HJFh0TGMpafqLE9haL();
            }
            int size2 = this.f4103lEeR5KfoEr4xU5yHH7.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((OUd9THiLjZndMj0qdF) this.f4103lEeR5KfoEr4xU5yHH7.get(i2)).HJFh0TGMpafqLE9haL();
            }
            ArrayList arrayList = this.f4104s3fjYDxWOUexjjVgyA;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((OUd9THiLjZndMj0qdF) this.f4104s3fjYDxWOUexjjVgyA.get(i3)).HJFh0TGMpafqLE9haL();
                }
            }
        }

        public final void zaq8hOURtfwbcX17cG(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    zaq8hOURtfwbcX17cG((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }
    }

    public static class HJFh0TGMpafqLE9haL implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public static class IPyIQcaNa8aB7drBED extends Observable {
        public boolean lEeR5KfoEr4xU5yHH7() {
            return !((Observable) this).mObservers.isEmpty();
        }
    }

    public class KYHag8HRDlnO3X9zmZ implements lEeR5KfoEr4xU5yHH7.InterfaceC0052lEeR5KfoEr4xU5yHH7 {
        public KYHag8HRDlnO3X9zmZ() {
        }

        @Override // androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7.InterfaceC0052lEeR5KfoEr4xU5yHH7
        public OUd9THiLjZndMj0qdF HJFh0TGMpafqLE9haL(int i) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFBMSdooljgH14Jgudph = RecyclerView.this.bMSdooljgH14Jgudph(i, true);
            if (oUd9THiLjZndMj0qdFBMSdooljgH14Jgudph == null || RecyclerView.this.f4078husNiw3snxdgZPAGJm.hoXrIDAFrSwfShk8da(oUd9THiLjZndMj0qdFBMSdooljgH14Jgudph.f4125lEeR5KfoEr4xU5yHH7)) {
                return null;
            }
            return oUd9THiLjZndMj0qdFBMSdooljgH14Jgudph;
        }

        @Override // androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7.InterfaceC0052lEeR5KfoEr4xU5yHH7
        public void IPyIQcaNa8aB7drBED(int i, int i2, Object obj) {
            RecyclerView.this.zWzrlx9vIdLp7FoEMD(i, i2, obj);
            RecyclerView.this.f4070ctWLFN70QQINH1kyYo = true;
        }

        @Override // androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7.InterfaceC0052lEeR5KfoEr4xU5yHH7
        public void KYHag8HRDlnO3X9zmZ(lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            pbVGzGjWvY2LDXC8vo(s3fjydxwouexjjvgya);
        }

        @Override // androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7.InterfaceC0052lEeR5KfoEr4xU5yHH7
        public void TCyPEKSzIyweCN5yp1(int i, int i2) {
            RecyclerView.this.Ywqw2A0s86HeuFkDt0(i, i2);
            RecyclerView.this.f4046Pum9NZyDBKoCnecvlx = true;
        }

        @Override // androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7.InterfaceC0052lEeR5KfoEr4xU5yHH7
        public void husNiw3snxdgZPAGJm(int i, int i2) {
            RecyclerView.this.HZ4bptRS9XIcK1CV95(i, i2, false);
            RecyclerView.this.f4046Pum9NZyDBKoCnecvlx = true;
        }

        @Override // androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7.InterfaceC0052lEeR5KfoEr4xU5yHH7
        public void lEeR5KfoEr4xU5yHH7(int i, int i2) {
            RecyclerView.this.f2zPq7MOnQrtOlZ1Zg(i, i2);
            RecyclerView.this.f4046Pum9NZyDBKoCnecvlx = true;
        }

        public void pbVGzGjWvY2LDXC8vo(lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            int i = s3fjydxwouexjjvgya.f4322lEeR5KfoEr4xU5yHH7;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f4048T9PhQIpGRhE4yZDm1C.g0OBkYSIvp0JYnHPjC(recyclerView, s3fjydxwouexjjvgya.f4323s3fjYDxWOUexjjVgyA, s3fjydxwouexjjvgya.f4324zZKhbgvUfsK4AEX3r0);
                return;
            }
            if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f4048T9PhQIpGRhE4yZDm1C.LFGi8lLul9XOP250o9(recyclerView2, s3fjydxwouexjjvgya.f4323s3fjYDxWOUexjjVgyA, s3fjydxwouexjjvgya.f4324zZKhbgvUfsK4AEX3r0);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f4048T9PhQIpGRhE4yZDm1C.cr99CPXhoiknALiHbq(recyclerView3, s3fjydxwouexjjvgya.f4323s3fjYDxWOUexjjVgyA, s3fjydxwouexjjvgya.f4324zZKhbgvUfsK4AEX3r0, s3fjydxwouexjjvgya.f4321HJFh0TGMpafqLE9haL);
            } else {
                if (i != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f4048T9PhQIpGRhE4yZDm1C.h7m69eGbRk1hyaVt28(recyclerView4, s3fjydxwouexjjvgya.f4323s3fjYDxWOUexjjVgyA, s3fjydxwouexjjvgya.f4324zZKhbgvUfsK4AEX3r0, 1);
            }
        }

        @Override // androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7.InterfaceC0052lEeR5KfoEr4xU5yHH7
        public void s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            pbVGzGjWvY2LDXC8vo(s3fjydxwouexjjvgya);
        }

        @Override // androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7.InterfaceC0052lEeR5KfoEr4xU5yHH7
        public void zZKhbgvUfsK4AEX3r0(int i, int i2) {
            RecyclerView.this.HZ4bptRS9XIcK1CV95(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4046Pum9NZyDBKoCnecvlx = true;
            recyclerView.f4052Tu4WCh2gEwj8E4oHbP.f4170zZKhbgvUfsK4AEX3r0 += i2;
        }
    }

    public class LIMtzhnLwQyigzK0KO extends pbVGzGjWvY2LDXC8vo {
        public LIMtzhnLwQyigzK0KO() {
        }
    }

    public static class OANkd3mP6AYvwbNLJM extends ViewGroup.MarginLayoutParams {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public boolean f4108HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public OUd9THiLjZndMj0qdF f4109lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Rect f4110s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public boolean f4111zZKhbgvUfsK4AEX3r0;

        public OANkd3mP6AYvwbNLJM(int i, int i2) {
            super(i, i2);
            this.f4110s3fjYDxWOUexjjVgyA = new Rect();
            this.f4108HJFh0TGMpafqLE9haL = true;
            this.f4111zZKhbgvUfsK4AEX3r0 = false;
        }

        public boolean HJFh0TGMpafqLE9haL() {
            return this.f4109lEeR5KfoEr4xU5yHH7.xHA29AmDt6y96AnB3t();
        }

        public int lEeR5KfoEr4xU5yHH7() {
            return this.f4109lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C();
        }

        public boolean s3fjYDxWOUexjjVgyA() {
            return this.f4109lEeR5KfoEr4xU5yHH7.VItLRw50eXTZeEfGl0();
        }

        public boolean zZKhbgvUfsK4AEX3r0() {
            return this.f4109lEeR5KfoEr4xU5yHH7.R9SAhYMerGybF9OAjL();
        }

        public OANkd3mP6AYvwbNLJM(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4110s3fjYDxWOUexjjVgyA = new Rect();
            this.f4108HJFh0TGMpafqLE9haL = true;
            this.f4111zZKhbgvUfsK4AEX3r0 = false;
        }

        public OANkd3mP6AYvwbNLJM(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4110s3fjYDxWOUexjjVgyA = new Rect();
            this.f4108HJFh0TGMpafqLE9haL = true;
            this.f4111zZKhbgvUfsK4AEX3r0 = false;
        }

        public OANkd3mP6AYvwbNLJM(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4110s3fjYDxWOUexjjVgyA = new Rect();
            this.f4108HJFh0TGMpafqLE9haL = true;
            this.f4111zZKhbgvUfsK4AEX3r0 = false;
        }

        public OANkd3mP6AYvwbNLJM(OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
            super((ViewGroup.LayoutParams) oANkd3mP6AYvwbNLJM);
            this.f4110s3fjYDxWOUexjjVgyA = new Rect();
            this.f4108HJFh0TGMpafqLE9haL = true;
            this.f4111zZKhbgvUfsK4AEX3r0 = false;
        }
    }

    public static abstract class OUd9THiLjZndMj0qdF {

        /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
        public static final List f4112Y43RdunnpKgpbny0lE = Collections.emptyList();

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public int f4113Acstmh57AKoSEkEFNJ;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final View f4125lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public WeakReference f4127s3fjYDxWOUexjjVgyA;

        /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
        public RecyclerView f4128sTkWmhpZ5b1ArQIw4K;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f4114HJFh0TGMpafqLE9haL = -1;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f4129zZKhbgvUfsK4AEX3r0 = -1;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public long f4124husNiw3snxdgZPAGJm = -1;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int f4116KYHag8HRDlnO3X9zmZ = -1;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public int f4119TCyPEKSzIyweCN5yp1 = -1;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public OUd9THiLjZndMj0qdF f4115IPyIQcaNa8aB7drBED = null;

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public OUd9THiLjZndMj0qdF f4126pbVGzGjWvY2LDXC8vo = null;

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public List f4120Z9WdNiOsPR0y54zHW4 = null;

        /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
        public List f4122e54J8UWNHWALQNixXM = null;

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public int f4118T9PhQIpGRhE4yZDm1C = 0;

        /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
        public G7AC3DWIx9i9fdanjk f4123hoXrIDAFrSwfShk8da = null;

        /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
        public boolean f4121aPyGSIylzVNKPT1Bls = false;

        /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
        public int f4117OANkd3mP6AYvwbNLJM = 0;

        /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
        public int f4130zaq8hOURtfwbcX17cG = -1;

        public OUd9THiLjZndMj0qdF(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f4125lEeR5KfoEr4xU5yHH7 = view;
        }

        public boolean A49QRPHynYLCBN0SqP() {
            return (this.f4113Acstmh57AKoSEkEFNJ & 256) != 0;
        }

        public final int Acstmh57AKoSEkEFNJ() {
            RecyclerView recyclerView = this.f4128sTkWmhpZ5b1ArQIw4K;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.CSih7GetOUab1dYQjM(this);
        }

        public boolean DfpieXfdYs58yZAiXY() {
            return (this.f4113Acstmh57AKoSEkEFNJ & 128) != 0;
        }

        public final boolean G7AC3DWIx9i9fdanjk() {
            return (this.f4113Acstmh57AKoSEkEFNJ & 16) == 0 && !lLKzvdU99Iw80uVD5I.KqgKJKIWne3kz1AdHk(this.f4125lEeR5KfoEr4xU5yHH7);
        }

        public boolean GyWRxpdt1T8mEJXPoD() {
            return (this.f4113Acstmh57AKoSEkEFNJ & 16) != 0;
        }

        public void HJFh0TGMpafqLE9haL() {
            this.f4129zZKhbgvUfsK4AEX3r0 = -1;
            this.f4119TCyPEKSzIyweCN5yp1 = -1;
        }

        public boolean IPyIQcaNa8aB7drBED() {
            return (this.f4113Acstmh57AKoSEkEFNJ & 16) == 0 && lLKzvdU99Iw80uVD5I.KqgKJKIWne3kz1AdHk(this.f4125lEeR5KfoEr4xU5yHH7);
        }

        public void KYHag8HRDlnO3X9zmZ() {
            this.f4113Acstmh57AKoSEkEFNJ &= -257;
        }

        public boolean KqgKJKIWne3kz1AdHk() {
            return (this.f4113Acstmh57AKoSEkEFNJ & 32) != 0;
        }

        public boolean LIMtzhnLwQyigzK0KO() {
            return this.f4123hoXrIDAFrSwfShk8da != null;
        }

        public boolean OANkd3mP6AYvwbNLJM(int i) {
            return (i & this.f4113Acstmh57AKoSEkEFNJ) != 0;
        }

        public void OUd9THiLjZndMj0qdF(RecyclerView recyclerView) {
            recyclerView.WaWv1mJ1ya3uoEaKqz(this, this.f4117OANkd3mP6AYvwbNLJM);
            this.f4117OANkd3mP6AYvwbNLJM = 0;
        }

        public void OqIo5QF00RDxUQb4qq(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, boolean z) {
            this.f4123hoXrIDAFrSwfShk8da = g7AC3DWIx9i9fdanjk;
            this.f4121aPyGSIylzVNKPT1Bls = z;
        }

        public boolean R9SAhYMerGybF9OAjL() {
            return (this.f4113Acstmh57AKoSEkEFNJ & 4) != 0;
        }

        public final int T9PhQIpGRhE4yZDm1C() {
            int i = this.f4119TCyPEKSzIyweCN5yp1;
            return i == -1 ? this.f4114HJFh0TGMpafqLE9haL : i;
        }

        public final void TCyPEKSzIyweCN5yp1() {
            if (this.f4120Z9WdNiOsPR0y54zHW4 == null) {
                ArrayList arrayList = new ArrayList();
                this.f4120Z9WdNiOsPR0y54zHW4 = arrayList;
                this.f4122e54J8UWNHWALQNixXM = Collections.unmodifiableList(arrayList);
            }
        }

        public void THTDvPxsHqMeGb512f(int i, boolean z) {
            if (this.f4129zZKhbgvUfsK4AEX3r0 == -1) {
                this.f4129zZKhbgvUfsK4AEX3r0 = this.f4114HJFh0TGMpafqLE9haL;
            }
            if (this.f4119TCyPEKSzIyweCN5yp1 == -1) {
                this.f4119TCyPEKSzIyweCN5yp1 = this.f4114HJFh0TGMpafqLE9haL;
            }
            if (z) {
                this.f4119TCyPEKSzIyweCN5yp1 += i;
            }
            this.f4114HJFh0TGMpafqLE9haL += i;
            if (this.f4125lEeR5KfoEr4xU5yHH7.getLayoutParams() != null) {
                ((OANkd3mP6AYvwbNLJM) this.f4125lEeR5KfoEr4xU5yHH7.getLayoutParams()).f4108HJFh0TGMpafqLE9haL = true;
            }
        }

        public boolean VItLRw50eXTZeEfGl0() {
            return (this.f4113Acstmh57AKoSEkEFNJ & 2) != 0;
        }

        public final void W3RZ2dTDKrKpS5Mxdk(boolean z) {
            int i;
            int i2 = this.f4118T9PhQIpGRhE4yZDm1C;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f4118T9PhQIpGRhE4yZDm1C = i3;
            if (i3 < 0) {
                this.f4118T9PhQIpGRhE4yZDm1C = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f4113Acstmh57AKoSEkEFNJ | 16;
            } else if (!z || i3 != 0) {
                return;
            } else {
                i = this.f4113Acstmh57AKoSEkEFNJ & (-17);
            }
            this.f4113Acstmh57AKoSEkEFNJ = i;
        }

        public boolean WWC27LAMFqFFBzfbNw() {
            return (this.f4113Acstmh57AKoSEkEFNJ & 2) != 0;
        }

        public void XzJ1BS7H9Ilbkv4eVM() {
            if (this.f4129zZKhbgvUfsK4AEX3r0 == -1) {
                this.f4129zZKhbgvUfsK4AEX3r0 = this.f4114HJFh0TGMpafqLE9haL;
            }
        }

        public boolean Y43RdunnpKgpbny0lE() {
            return (this.f4113Acstmh57AKoSEkEFNJ & 1) != 0;
        }

        public final long Z9WdNiOsPR0y54zHW4() {
            return this.f4124husNiw3snxdgZPAGJm;
        }

        public List aPyGSIylzVNKPT1Bls() {
            if ((this.f4113Acstmh57AKoSEkEFNJ & 1024) != 0) {
                return f4112Y43RdunnpKgpbny0lE;
            }
            List list = this.f4120Z9WdNiOsPR0y54zHW4;
            return (list == null || list.size() == 0) ? f4112Y43RdunnpKgpbny0lE : this.f4122e54J8UWNHWALQNixXM;
        }

        public void ao3wqKm5CXFuvC0q47(RecyclerView recyclerView) {
            int iXHA29AmDt6y96AnB3t = this.f4130zaq8hOURtfwbcX17cG;
            if (iXHA29AmDt6y96AnB3t == -1) {
                iXHA29AmDt6y96AnB3t = lLKzvdU99Iw80uVD5I.xHA29AmDt6y96AnB3t(this.f4125lEeR5KfoEr4xU5yHH7);
            }
            this.f4117OANkd3mP6AYvwbNLJM = iXHA29AmDt6y96AnB3t;
            recyclerView.WaWv1mJ1ya3uoEaKqz(this, 4);
        }

        public void e2F9F6h8YJxTHwLCa0() {
            this.f4123hoXrIDAFrSwfShk8da.DfpieXfdYs58yZAiXY(this);
        }

        public final int e54J8UWNHWALQNixXM() {
            return this.f4116KYHag8HRDlnO3X9zmZ;
        }

        public final int hoXrIDAFrSwfShk8da() {
            return this.f4129zZKhbgvUfsK4AEX3r0;
        }

        public void husNiw3snxdgZPAGJm() {
            this.f4113Acstmh57AKoSEkEFNJ &= -33;
        }

        public void jCtUeU2YI1poCxWcjm() {
            this.f4113Acstmh57AKoSEkEFNJ = 0;
            this.f4114HJFh0TGMpafqLE9haL = -1;
            this.f4129zZKhbgvUfsK4AEX3r0 = -1;
            this.f4124husNiw3snxdgZPAGJm = -1L;
            this.f4119TCyPEKSzIyweCN5yp1 = -1;
            this.f4118T9PhQIpGRhE4yZDm1C = 0;
            this.f4115IPyIQcaNa8aB7drBED = null;
            this.f4126pbVGzGjWvY2LDXC8vo = null;
            zZKhbgvUfsK4AEX3r0();
            this.f4117OANkd3mP6AYvwbNLJM = 0;
            this.f4130zaq8hOURtfwbcX17cG = -1;
            RecyclerView.zaq8hOURtfwbcX17cG(this);
        }

        public void lEeR5KfoEr4xU5yHH7(Object obj) {
            if (obj == null) {
                s3fjYDxWOUexjjVgyA(1024);
            } else if ((1024 & this.f4113Acstmh57AKoSEkEFNJ) == 0) {
                TCyPEKSzIyweCN5yp1();
                this.f4120Z9WdNiOsPR0y54zHW4.add(obj);
            }
        }

        public void pbVGzGjWvY2LDXC8vo(int i, int i2, boolean z) {
            s3fjYDxWOUexjjVgyA(8);
            THTDvPxsHqMeGb512f(i2, z);
            this.f4114HJFh0TGMpafqLE9haL = i;
        }

        public void s3fjYDxWOUexjjVgyA(int i) {
            this.f4113Acstmh57AKoSEkEFNJ = i | this.f4113Acstmh57AKoSEkEFNJ;
        }

        public boolean sTkWmhpZ5b1ArQIw4K() {
            return (this.f4125lEeR5KfoEr4xU5yHH7.getParent() == null || this.f4125lEeR5KfoEr4xU5yHH7.getParent() == this.f4128sTkWmhpZ5b1ArQIw4K) ? false : true;
        }

        public void tXWeW0sqVddf7ZBflq(int i, int i2) {
            this.f4113Acstmh57AKoSEkEFNJ = (i & i2) | (this.f4113Acstmh57AKoSEkEFNJ & (~i2));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f4114HJFh0TGMpafqLE9haL + " id=" + this.f4124husNiw3snxdgZPAGJm + ", oldPos=" + this.f4129zZKhbgvUfsK4AEX3r0 + ", pLpos:" + this.f4119TCyPEKSzIyweCN5yp1);
            if (LIMtzhnLwQyigzK0KO()) {
                sb.append(" scrap ");
                sb.append(this.f4121aPyGSIylzVNKPT1Bls ? "[changeScrap]" : "[attachedScrap]");
            }
            if (R9SAhYMerGybF9OAjL()) {
                sb.append(" invalid");
            }
            if (!Y43RdunnpKgpbny0lE()) {
                sb.append(" unbound");
            }
            if (WWC27LAMFqFFBzfbNw()) {
                sb.append(" update");
            }
            if (xHA29AmDt6y96AnB3t()) {
                sb.append(" removed");
            }
            if (DfpieXfdYs58yZAiXY()) {
                sb.append(" ignored");
            }
            if (A49QRPHynYLCBN0SqP()) {
                sb.append(" tmpDetached");
            }
            if (!G7AC3DWIx9i9fdanjk()) {
                sb.append(" not recyclable(" + this.f4118T9PhQIpGRhE4yZDm1C + ")");
            }
            if (zaq8hOURtfwbcX17cG()) {
                sb.append(" undefined adapter position");
            }
            if (this.f4125lEeR5KfoEr4xU5yHH7.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean xHA29AmDt6y96AnB3t() {
            return (this.f4113Acstmh57AKoSEkEFNJ & 8) != 0;
        }

        public void zZKhbgvUfsK4AEX3r0() {
            List list = this.f4120Z9WdNiOsPR0y54zHW4;
            if (list != null) {
                list.clear();
            }
            this.f4113Acstmh57AKoSEkEFNJ &= -1025;
        }

        public boolean zaq8hOURtfwbcX17cG() {
            return (this.f4113Acstmh57AKoSEkEFNJ & 512) != 0 || R9SAhYMerGybF9OAjL();
        }
    }

    public static class R9SAhYMerGybF9OAjL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public SparseArray f4131lEeR5KfoEr4xU5yHH7 = new SparseArray();

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f4132s3fjYDxWOUexjjVgyA = 0;

        public static class lEeR5KfoEr4xU5yHH7 {

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public final ArrayList f4134lEeR5KfoEr4xU5yHH7 = new ArrayList();

            /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
            public int f4135s3fjYDxWOUexjjVgyA = 5;

            /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
            public long f4133HJFh0TGMpafqLE9haL = 0;

            /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
            public long f4136zZKhbgvUfsK4AEX3r0 = 0;
        }

        public long Acstmh57AKoSEkEFNJ(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public void HJFh0TGMpafqLE9haL() {
            this.f4132s3fjYDxWOUexjjVgyA--;
        }

        public void IPyIQcaNa8aB7drBED(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp12, boolean z) {
            if (tCyPEKSzIyweCN5yp1 != null) {
                HJFh0TGMpafqLE9haL();
            }
            if (!z && this.f4132s3fjYDxWOUexjjVgyA == 0) {
                s3fjYDxWOUexjjVgyA();
            }
            if (tCyPEKSzIyweCN5yp12 != null) {
                lEeR5KfoEr4xU5yHH7();
            }
        }

        public OUd9THiLjZndMj0qdF KYHag8HRDlnO3X9zmZ(int i) {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) this.f4131lEeR5KfoEr4xU5yHH7.get(i);
            if (leer5kfoer4xu5yhh7 == null || leer5kfoer4xu5yhh7.f4134lEeR5KfoEr4xU5yHH7.isEmpty()) {
                return null;
            }
            ArrayList arrayList = leer5kfoer4xu5yhh7.f4134lEeR5KfoEr4xU5yHH7;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((OUd9THiLjZndMj0qdF) arrayList.get(size)).sTkWmhpZ5b1ArQIw4K()) {
                    return (OUd9THiLjZndMj0qdF) arrayList.remove(size);
                }
            }
            return null;
        }

        public final lEeR5KfoEr4xU5yHH7 TCyPEKSzIyweCN5yp1(int i) {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) this.f4131lEeR5KfoEr4xU5yHH7.get(i);
            if (leer5kfoer4xu5yhh7 != null) {
                return leer5kfoer4xu5yhh7;
            }
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = new lEeR5KfoEr4xU5yHH7();
            this.f4131lEeR5KfoEr4xU5yHH7.put(i, leer5kfoer4xu5yhh72);
            return leer5kfoer4xu5yhh72;
        }

        public boolean Z9WdNiOsPR0y54zHW4(int i, long j, long j2) {
            long j3 = TCyPEKSzIyweCN5yp1(i).f4136zZKhbgvUfsK4AEX3r0;
            return j3 == 0 || j + j3 < j2;
        }

        public boolean e54J8UWNHWALQNixXM(int i, long j, long j2) {
            long j3 = TCyPEKSzIyweCN5yp1(i).f4133HJFh0TGMpafqLE9haL;
            return j3 == 0 || j + j3 < j2;
        }

        public void husNiw3snxdgZPAGJm(int i, long j) {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7TCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(i);
            leer5kfoer4xu5yhh7TCyPEKSzIyweCN5yp1.f4133HJFh0TGMpafqLE9haL = Acstmh57AKoSEkEFNJ(leer5kfoer4xu5yhh7TCyPEKSzIyweCN5yp1.f4133HJFh0TGMpafqLE9haL, j);
        }

        public void lEeR5KfoEr4xU5yHH7() {
            this.f4132s3fjYDxWOUexjjVgyA++;
        }

        public void pbVGzGjWvY2LDXC8vo(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            int iE54J8UWNHWALQNixXM = oUd9THiLjZndMj0qdF.e54J8UWNHWALQNixXM();
            ArrayList arrayList = TCyPEKSzIyweCN5yp1(iE54J8UWNHWALQNixXM).f4134lEeR5KfoEr4xU5yHH7;
            if (((lEeR5KfoEr4xU5yHH7) this.f4131lEeR5KfoEr4xU5yHH7.get(iE54J8UWNHWALQNixXM)).f4135s3fjYDxWOUexjjVgyA <= arrayList.size()) {
                return;
            }
            oUd9THiLjZndMj0qdF.jCtUeU2YI1poCxWcjm();
            arrayList.add(oUd9THiLjZndMj0qdF);
        }

        public void s3fjYDxWOUexjjVgyA() {
            for (int i = 0; i < this.f4131lEeR5KfoEr4xU5yHH7.size(); i++) {
                ((lEeR5KfoEr4xU5yHH7) this.f4131lEeR5KfoEr4xU5yHH7.valueAt(i)).f4134lEeR5KfoEr4xU5yHH7.clear();
            }
        }

        public void zZKhbgvUfsK4AEX3r0(int i, long j) {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7TCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(i);
            leer5kfoer4xu5yhh7TCyPEKSzIyweCN5yp1.f4136zZKhbgvUfsK4AEX3r0 = Acstmh57AKoSEkEFNJ(leer5kfoer4xu5yhh7TCyPEKSzIyweCN5yp1.f4136zZKhbgvUfsK4AEX3r0, j);
        }
    }

    public class T9PhQIpGRhE4yZDm1C implements e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7 {
        public T9PhQIpGRhE4yZDm1C() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7
        public void lEeR5KfoEr4xU5yHH7(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            oUd9THiLjZndMj0qdF.W3RZ2dTDKrKpS5Mxdk(true);
            if (oUd9THiLjZndMj0qdF.f4115IPyIQcaNa8aB7drBED != null && oUd9THiLjZndMj0qdF.f4126pbVGzGjWvY2LDXC8vo == null) {
                oUd9THiLjZndMj0qdF.f4115IPyIQcaNa8aB7drBED = null;
            }
            oUd9THiLjZndMj0qdF.f4126pbVGzGjWvY2LDXC8vo = null;
            if (oUd9THiLjZndMj0qdF.GyWRxpdt1T8mEJXPoD() || RecyclerView.this.JXsqbvi9UKxeF3HXpU(oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7) || !oUd9THiLjZndMj0qdF.A49QRPHynYLCBN0SqP()) {
                return;
            }
            RecyclerView.this.removeDetachedView(oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7, false);
        }
    }

    public static abstract class TCyPEKSzIyweCN5yp1 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final IPyIQcaNa8aB7drBED f4138lEeR5KfoEr4xU5yHH7 = new IPyIQcaNa8aB7drBED();

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f4139s3fjYDxWOUexjjVgyA = false;

        public void Acstmh57AKoSEkEFNJ(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, int i, List list) {
            pbVGzGjWvY2LDXC8vo(oUd9THiLjZndMj0qdF, i);
        }

        public abstract int HJFh0TGMpafqLE9haL();

        public void IPyIQcaNa8aB7drBED(RecyclerView recyclerView) {
        }

        public final boolean KYHag8HRDlnO3X9zmZ() {
            return this.f4138lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7();
        }

        public void OANkd3mP6AYvwbNLJM(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        }

        public boolean T9PhQIpGRhE4yZDm1C(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            return false;
        }

        public final boolean TCyPEKSzIyweCN5yp1() {
            return this.f4139s3fjYDxWOUexjjVgyA;
        }

        public void Y43RdunnpKgpbny0lE(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
            this.f4138lEeR5KfoEr4xU5yHH7.unregisterObserver(pbvgzgjwvy2ldxc8vo);
        }

        public abstract OUd9THiLjZndMj0qdF Z9WdNiOsPR0y54zHW4(ViewGroup viewGroup, int i);

        public void aPyGSIylzVNKPT1Bls(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        }

        public void e54J8UWNHWALQNixXM(RecyclerView recyclerView) {
        }

        public void hoXrIDAFrSwfShk8da(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        }

        public int husNiw3snxdgZPAGJm(int i) {
            return 0;
        }

        public final void lEeR5KfoEr4xU5yHH7(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, int i) {
            oUd9THiLjZndMj0qdF.f4114HJFh0TGMpafqLE9haL = i;
            if (TCyPEKSzIyweCN5yp1()) {
                oUd9THiLjZndMj0qdF.f4124husNiw3snxdgZPAGJm = zZKhbgvUfsK4AEX3r0(i);
            }
            oUd9THiLjZndMj0qdF.tXWeW0sqVddf7ZBflq(1, 519);
            OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7("RV OnBindView");
            Acstmh57AKoSEkEFNJ(oUd9THiLjZndMj0qdF, i, oUd9THiLjZndMj0qdF.aPyGSIylzVNKPT1Bls());
            oUd9THiLjZndMj0qdF.zZKhbgvUfsK4AEX3r0();
            ViewGroup.LayoutParams layoutParams = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.getLayoutParams();
            if (layoutParams instanceof OANkd3mP6AYvwbNLJM) {
                ((OANkd3mP6AYvwbNLJM) layoutParams).f4108HJFh0TGMpafqLE9haL = true;
            }
            OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
        }

        public abstract void pbVGzGjWvY2LDXC8vo(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, int i);

        public final OUd9THiLjZndMj0qdF s3fjYDxWOUexjjVgyA(ViewGroup viewGroup, int i) {
            try {
                OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7("RV CreateView");
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4(viewGroup, i);
                if (oUd9THiLjZndMj0qdFZ9WdNiOsPR0y54zHW4.f4125lEeR5KfoEr4xU5yHH7.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                oUd9THiLjZndMj0qdFZ9WdNiOsPR0y54zHW4.f4116KYHag8HRDlnO3X9zmZ = i;
                return oUd9THiLjZndMj0qdFZ9WdNiOsPR0y54zHW4;
            } finally {
                OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
            }
        }

        public void sTkWmhpZ5b1ArQIw4K(boolean z) {
            if (KYHag8HRDlnO3X9zmZ()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f4139s3fjYDxWOUexjjVgyA = z;
        }

        public long zZKhbgvUfsK4AEX3r0(int i) {
            return -1L;
        }

        public void zaq8hOURtfwbcX17cG(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
            this.f4138lEeR5KfoEr4xU5yHH7.registerObserver(pbvgzgjwvy2ldxc8vo);
        }
    }

    public static abstract class THTDvPxsHqMeGb512f {
    }

    public static abstract class VItLRw50eXTZeEfGl0 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public aPyGSIylzVNKPT1Bls f4140HJFh0TGMpafqLE9haL;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public boolean f4141IPyIQcaNa8aB7drBED;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public View f4142KYHag8HRDlnO3X9zmZ;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public boolean f4144husNiw3snxdgZPAGJm;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public RecyclerView f4146s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public boolean f4147zZKhbgvUfsK4AEX3r0;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f4145lEeR5KfoEr4xU5yHH7 = -1;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public final lEeR5KfoEr4xU5yHH7 f4143TCyPEKSzIyweCN5yp1 = new lEeR5KfoEr4xU5yHH7(0, 0);

        public static class lEeR5KfoEr4xU5yHH7 {

            /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
            public int f4148HJFh0TGMpafqLE9haL;

            /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
            public boolean f4149KYHag8HRDlnO3X9zmZ;

            /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
            public int f4150TCyPEKSzIyweCN5yp1;

            /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
            public Interpolator f4151husNiw3snxdgZPAGJm;

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public int f4152lEeR5KfoEr4xU5yHH7;

            /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
            public int f4153s3fjYDxWOUexjjVgyA;

            /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
            public int f4154zZKhbgvUfsK4AEX3r0;

            public lEeR5KfoEr4xU5yHH7(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public void HJFh0TGMpafqLE9haL(RecyclerView recyclerView) {
                int i = this.f4154zZKhbgvUfsK4AEX3r0;
                if (i >= 0) {
                    this.f4154zZKhbgvUfsK4AEX3r0 = -1;
                    recyclerView.O1furmptfI76BGfN0d(i);
                    this.f4149KYHag8HRDlnO3X9zmZ = false;
                } else {
                    if (!this.f4149KYHag8HRDlnO3X9zmZ) {
                        this.f4150TCyPEKSzIyweCN5yp1 = 0;
                        return;
                    }
                    husNiw3snxdgZPAGJm();
                    recyclerView.f4028CSih7GetOUab1dYQjM.KYHag8HRDlnO3X9zmZ(this.f4152lEeR5KfoEr4xU5yHH7, this.f4153s3fjYDxWOUexjjVgyA, this.f4148HJFh0TGMpafqLE9haL, this.f4151husNiw3snxdgZPAGJm);
                    int i2 = this.f4150TCyPEKSzIyweCN5yp1 + 1;
                    this.f4150TCyPEKSzIyweCN5yp1 = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4149KYHag8HRDlnO3X9zmZ = false;
                }
            }

            public final void husNiw3snxdgZPAGJm() {
                if (this.f4151husNiw3snxdgZPAGJm != null && this.f4148HJFh0TGMpafqLE9haL < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f4148HJFh0TGMpafqLE9haL < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public boolean lEeR5KfoEr4xU5yHH7() {
                return this.f4154zZKhbgvUfsK4AEX3r0 >= 0;
            }

            public void s3fjYDxWOUexjjVgyA(int i) {
                this.f4154zZKhbgvUfsK4AEX3r0 = i;
            }

            public void zZKhbgvUfsK4AEX3r0(int i, int i2, int i3, Interpolator interpolator) {
                this.f4152lEeR5KfoEr4xU5yHH7 = i;
                this.f4153s3fjYDxWOUexjjVgyA = i2;
                this.f4148HJFh0TGMpafqLE9haL = i3;
                this.f4151husNiw3snxdgZPAGJm = interpolator;
                this.f4149KYHag8HRDlnO3X9zmZ = true;
            }

            public lEeR5KfoEr4xU5yHH7(int i, int i2, int i3, Interpolator interpolator) {
                this.f4154zZKhbgvUfsK4AEX3r0 = -1;
                this.f4149KYHag8HRDlnO3X9zmZ = false;
                this.f4150TCyPEKSzIyweCN5yp1 = 0;
                this.f4152lEeR5KfoEr4xU5yHH7 = i;
                this.f4153s3fjYDxWOUexjjVgyA = i2;
                this.f4148HJFh0TGMpafqLE9haL = i3;
                this.f4151husNiw3snxdgZPAGJm = interpolator;
            }
        }

        public interface s3fjYDxWOUexjjVgyA {
            PointF husNiw3snxdgZPAGJm(int i);
        }

        public void Acstmh57AKoSEkEFNJ(int i, int i2) {
            PointF pointFLEeR5KfoEr4xU5yHH7;
            RecyclerView recyclerView = this.f4146s3fjYDxWOUexjjVgyA;
            if (this.f4145lEeR5KfoEr4xU5yHH7 == -1 || recyclerView == null) {
                sTkWmhpZ5b1ArQIw4K();
            }
            if (this.f4147zZKhbgvUfsK4AEX3r0 && this.f4142KYHag8HRDlnO3X9zmZ == null && this.f4140HJFh0TGMpafqLE9haL != null && (pointFLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(this.f4145lEeR5KfoEr4xU5yHH7)) != null) {
                float f = pointFLEeR5KfoEr4xU5yHH7.x;
                if (f != 0.0f || pointFLEeR5KfoEr4xU5yHH7.y != 0.0f) {
                    recyclerView.h6NrAcYSuIyiU1qV6F((int) Math.signum(f), (int) Math.signum(pointFLEeR5KfoEr4xU5yHH7.y), null);
                }
            }
            this.f4147zZKhbgvUfsK4AEX3r0 = false;
            View view = this.f4142KYHag8HRDlnO3X9zmZ;
            if (view != null) {
                if (zZKhbgvUfsK4AEX3r0(view) == this.f4145lEeR5KfoEr4xU5yHH7) {
                    aPyGSIylzVNKPT1Bls(this.f4142KYHag8HRDlnO3X9zmZ, recyclerView.f4052Tu4WCh2gEwj8E4oHbP, this.f4143TCyPEKSzIyweCN5yp1);
                    this.f4143TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(recyclerView);
                    sTkWmhpZ5b1ArQIw4K();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f4142KYHag8HRDlnO3X9zmZ = null;
                }
            }
            if (this.f4144husNiw3snxdgZPAGJm) {
                e54J8UWNHWALQNixXM(i, i2, recyclerView.f4052Tu4WCh2gEwj8E4oHbP, this.f4143TCyPEKSzIyweCN5yp1);
                boolean zLEeR5KfoEr4xU5yHH7 = this.f4143TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7();
                this.f4143TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(recyclerView);
                if (zLEeR5KfoEr4xU5yHH7 && this.f4144husNiw3snxdgZPAGJm) {
                    this.f4147zZKhbgvUfsK4AEX3r0 = true;
                    recyclerView.f4028CSih7GetOUab1dYQjM.husNiw3snxdgZPAGJm();
                }
            }
        }

        public int HJFh0TGMpafqLE9haL() {
            return this.f4146s3fjYDxWOUexjjVgyA.f4048T9PhQIpGRhE4yZDm1C.lLKzvdU99Iw80uVD5I();
        }

        public boolean IPyIQcaNa8aB7drBED() {
            return this.f4144husNiw3snxdgZPAGJm;
        }

        public int KYHag8HRDlnO3X9zmZ() {
            return this.f4145lEeR5KfoEr4xU5yHH7;
        }

        public void OANkd3mP6AYvwbNLJM(int i) {
            this.f4145lEeR5KfoEr4xU5yHH7 = i;
        }

        public abstract void T9PhQIpGRhE4yZDm1C();

        public boolean TCyPEKSzIyweCN5yp1() {
            return this.f4147zZKhbgvUfsK4AEX3r0;
        }

        public void Z9WdNiOsPR0y54zHW4(View view) {
            if (zZKhbgvUfsK4AEX3r0(view) == KYHag8HRDlnO3X9zmZ()) {
                this.f4142KYHag8HRDlnO3X9zmZ = view;
            }
        }

        public abstract void aPyGSIylzVNKPT1Bls(View view, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7);

        public abstract void e54J8UWNHWALQNixXM(int i, int i2, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7);

        public abstract void hoXrIDAFrSwfShk8da();

        public aPyGSIylzVNKPT1Bls husNiw3snxdgZPAGJm() {
            return this.f4140HJFh0TGMpafqLE9haL;
        }

        public PointF lEeR5KfoEr4xU5yHH7(int i) {
            Object objHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm();
            if (objHusNiw3snxdgZPAGJm instanceof s3fjYDxWOUexjjVgyA) {
                return ((s3fjYDxWOUexjjVgyA) objHusNiw3snxdgZPAGJm).husNiw3snxdgZPAGJm(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + s3fjYDxWOUexjjVgyA.class.getCanonicalName());
            return null;
        }

        public void pbVGzGjWvY2LDXC8vo(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public View s3fjYDxWOUexjjVgyA(int i) {
            return this.f4146s3fjYDxWOUexjjVgyA.f4048T9PhQIpGRhE4yZDm1C.OqIo5QF00RDxUQb4qq(i);
        }

        public final void sTkWmhpZ5b1ArQIw4K() {
            if (this.f4144husNiw3snxdgZPAGJm) {
                this.f4144husNiw3snxdgZPAGJm = false;
                hoXrIDAFrSwfShk8da();
                this.f4146s3fjYDxWOUexjjVgyA.f4052Tu4WCh2gEwj8E4oHbP.f4167lEeR5KfoEr4xU5yHH7 = -1;
                this.f4142KYHag8HRDlnO3X9zmZ = null;
                this.f4145lEeR5KfoEr4xU5yHH7 = -1;
                this.f4147zZKhbgvUfsK4AEX3r0 = false;
                this.f4140HJFh0TGMpafqLE9haL.dCumDqZdWZ8NLrsgb7(this);
                this.f4140HJFh0TGMpafqLE9haL = null;
                this.f4146s3fjYDxWOUexjjVgyA = null;
            }
        }

        public int zZKhbgvUfsK4AEX3r0(View view) {
            return this.f4146s3fjYDxWOUexjjVgyA.ZJNyOIPL0usMs2xSAn(view);
        }

        public void zaq8hOURtfwbcX17cG(RecyclerView recyclerView, aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
            recyclerView.f4028CSih7GetOUab1dYQjM.TCyPEKSzIyweCN5yp1();
            if (this.f4141IPyIQcaNa8aB7drBED) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f4146s3fjYDxWOUexjjVgyA = recyclerView;
            this.f4140HJFh0TGMpafqLE9haL = apygsiylzvnkpt1bls;
            int i = this.f4145lEeR5KfoEr4xU5yHH7;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f4052Tu4WCh2gEwj8E4oHbP.f4167lEeR5KfoEr4xU5yHH7 = i;
            this.f4144husNiw3snxdgZPAGJm = true;
            this.f4147zZKhbgvUfsK4AEX3r0 = true;
            this.f4142KYHag8HRDlnO3X9zmZ = s3fjYDxWOUexjjVgyA(KYHag8HRDlnO3X9zmZ());
            T9PhQIpGRhE4yZDm1C();
            this.f4146s3fjYDxWOUexjjVgyA.f4028CSih7GetOUab1dYQjM.husNiw3snxdgZPAGJm();
            this.f4141IPyIQcaNa8aB7drBED = true;
        }
    }

    public static class WWC27LAMFqFFBzfbNw {

        /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
        public int f4159OANkd3mP6AYvwbNLJM;

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public int f4160T9PhQIpGRhE4yZDm1C;

        /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
        public int f4163aPyGSIylzVNKPT1Bls;

        /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
        public long f4165hoXrIDAFrSwfShk8da;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public SparseArray f4169s3fjYDxWOUexjjVgyA;

        /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
        public int f4171zaq8hOURtfwbcX17cG;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f4167lEeR5KfoEr4xU5yHH7 = -1;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f4156HJFh0TGMpafqLE9haL = 0;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f4170zZKhbgvUfsK4AEX3r0 = 0;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f4166husNiw3snxdgZPAGJm = 1;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int f4158KYHag8HRDlnO3X9zmZ = 0;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public boolean f4161TCyPEKSzIyweCN5yp1 = false;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public boolean f4157IPyIQcaNa8aB7drBED = false;

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public boolean f4168pbVGzGjWvY2LDXC8vo = false;

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public boolean f4155Acstmh57AKoSEkEFNJ = false;

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public boolean f4162Z9WdNiOsPR0y54zHW4 = false;

        /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
        public boolean f4164e54J8UWNHWALQNixXM = false;

        public int HJFh0TGMpafqLE9haL() {
            return this.f4167lEeR5KfoEr4xU5yHH7;
        }

        public void KYHag8HRDlnO3X9zmZ(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1) {
            this.f4166husNiw3snxdgZPAGJm = 1;
            this.f4158KYHag8HRDlnO3X9zmZ = tCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL();
            this.f4157IPyIQcaNa8aB7drBED = false;
            this.f4168pbVGzGjWvY2LDXC8vo = false;
            this.f4155Acstmh57AKoSEkEFNJ = false;
        }

        public boolean TCyPEKSzIyweCN5yp1() {
            return this.f4164e54J8UWNHWALQNixXM;
        }

        public boolean husNiw3snxdgZPAGJm() {
            return this.f4157IPyIQcaNa8aB7drBED;
        }

        public void lEeR5KfoEr4xU5yHH7(int i) {
            if ((this.f4166husNiw3snxdgZPAGJm & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f4166husNiw3snxdgZPAGJm));
        }

        public int s3fjYDxWOUexjjVgyA() {
            return this.f4157IPyIQcaNa8aB7drBED ? this.f4156HJFh0TGMpafqLE9haL - this.f4170zZKhbgvUfsK4AEX3r0 : this.f4158KYHag8HRDlnO3X9zmZ;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4167lEeR5KfoEr4xU5yHH7 + ", mData=" + this.f4169s3fjYDxWOUexjjVgyA + ", mItemCount=" + this.f4158KYHag8HRDlnO3X9zmZ + ", mIsMeasuring=" + this.f4155Acstmh57AKoSEkEFNJ + ", mPreviousLayoutItemCount=" + this.f4156HJFh0TGMpafqLE9haL + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4170zZKhbgvUfsK4AEX3r0 + ", mStructureChanged=" + this.f4161TCyPEKSzIyweCN5yp1 + ", mInPreLayout=" + this.f4157IPyIQcaNa8aB7drBED + ", mRunSimpleAnimations=" + this.f4162Z9WdNiOsPR0y54zHW4 + ", mRunPredictiveAnimations=" + this.f4164e54J8UWNHWALQNixXM + '}';
        }

        public boolean zZKhbgvUfsK4AEX3r0() {
            return this.f4167lEeR5KfoEr4xU5yHH7 != -1;
        }
    }

    public static abstract class Y43RdunnpKgpbny0lE {
        public void lEeR5KfoEr4xU5yHH7(RecyclerView recyclerView, int i) {
        }

        public abstract void s3fjYDxWOUexjjVgyA(RecyclerView recyclerView, int i, int i2);
    }

    public static class Z9WdNiOsPR0y54zHW4 {
        public EdgeEffect lEeR5KfoEr4xU5yHH7(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class aPyGSIylzVNKPT1Bls {

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public boolean f4172Acstmh57AKoSEkEFNJ;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA f4173HJFh0TGMpafqLE9haL;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public boolean f4174IPyIQcaNa8aB7drBED;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls f4175KYHag8HRDlnO3X9zmZ;

        /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
        public int f4176OANkd3mP6AYvwbNLJM;

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public int f4177T9PhQIpGRhE4yZDm1C;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public VItLRw50eXTZeEfGl0 f4178TCyPEKSzIyweCN5yp1;

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public boolean f4179Z9WdNiOsPR0y54zHW4;

        /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
        public int f4180aPyGSIylzVNKPT1Bls;

        /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
        public boolean f4181e54J8UWNHWALQNixXM;

        /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
        public boolean f4182hoXrIDAFrSwfShk8da;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls f4183husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA f4184lEeR5KfoEr4xU5yHH7;

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public boolean f4185pbVGzGjWvY2LDXC8vo;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public RecyclerView f4186s3fjYDxWOUexjjVgyA;

        /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
        public int f4187sTkWmhpZ5b1ArQIw4K;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA f4188zZKhbgvUfsK4AEX3r0;

        /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
        public int f4189zaq8hOURtfwbcX17cG;

        public interface HJFh0TGMpafqLE9haL {
            void lEeR5KfoEr4xU5yHH7(int i, int i2);
        }

        public class lEeR5KfoEr4xU5yHH7 implements aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA {
            public lEeR5KfoEr4xU5yHH7() {
            }

            @Override // androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
            public int HJFh0TGMpafqLE9haL() {
                return aPyGSIylzVNKPT1Bls.this.zXY7dgnTfw9Pd9RXel();
            }

            @Override // androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
            public int husNiw3snxdgZPAGJm(View view) {
                return aPyGSIylzVNKPT1Bls.this.udcVtCzLTM1Loe9KrX(view) - ((ViewGroup.MarginLayoutParams) ((OANkd3mP6AYvwbNLJM) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
            public View lEeR5KfoEr4xU5yHH7(int i) {
                return aPyGSIylzVNKPT1Bls.this.aAp6BD79BhftLCnuvf(i);
            }

            @Override // androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
            public int s3fjYDxWOUexjjVgyA() {
                return aPyGSIylzVNKPT1Bls.this.O1furmptfI76BGfN0d() - aPyGSIylzVNKPT1Bls.this.eWK41qw3g36LVd4UnS();
            }

            @Override // androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
            public int zZKhbgvUfsK4AEX3r0(View view) {
                return aPyGSIylzVNKPT1Bls.this.bMSdooljgH14Jgudph(view) + ((ViewGroup.MarginLayoutParams) ((OANkd3mP6AYvwbNLJM) view.getLayoutParams())).rightMargin;
            }
        }

        public class s3fjYDxWOUexjjVgyA implements aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA {
            public s3fjYDxWOUexjjVgyA() {
            }

            @Override // androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
            public int HJFh0TGMpafqLE9haL() {
                return aPyGSIylzVNKPT1Bls.this.DFYiVi7zXozAjRciKa();
            }

            @Override // androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
            public int husNiw3snxdgZPAGJm(View view) {
                return aPyGSIylzVNKPT1Bls.this.Uj8rPa1EWADtk6Oe0S(view) - ((ViewGroup.MarginLayoutParams) ((OANkd3mP6AYvwbNLJM) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
            public View lEeR5KfoEr4xU5yHH7(int i) {
                return aPyGSIylzVNKPT1Bls.this.aAp6BD79BhftLCnuvf(i);
            }

            @Override // androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
            public int s3fjYDxWOUexjjVgyA() {
                return aPyGSIylzVNKPT1Bls.this.osrHU7fvDp2EgxZPfM() - aPyGSIylzVNKPT1Bls.this.ctWLFN70QQINH1kyYo();
            }

            @Override // androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
            public int zZKhbgvUfsK4AEX3r0(View view) {
                return aPyGSIylzVNKPT1Bls.this.YlLW4G6OV9TFyuw5ix(view) + ((ViewGroup.MarginLayoutParams) ((OANkd3mP6AYvwbNLJM) view.getLayoutParams())).bottomMargin;
            }
        }

        public static class zZKhbgvUfsK4AEX3r0 {

            /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
            public boolean f4192HJFh0TGMpafqLE9haL;

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public int f4193lEeR5KfoEr4xU5yHH7;

            /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
            public int f4194s3fjYDxWOUexjjVgyA;

            /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
            public boolean f4195zZKhbgvUfsK4AEX3r0;
        }

        public aPyGSIylzVNKPT1Bls() {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7();
            this.f4173HJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh7;
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new s3fjYDxWOUexjjVgyA();
            this.f4188zZKhbgvUfsK4AEX3r0 = s3fjydxwouexjjvgya;
            this.f4183husNiw3snxdgZPAGJm = new androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls(leer5kfoer4xu5yhh7);
            this.f4175KYHag8HRDlnO3X9zmZ = new androidx.recyclerview.widget.aPyGSIylzVNKPT1Bls(s3fjydxwouexjjvgya);
            this.f4174IPyIQcaNa8aB7drBED = false;
            this.f4185pbVGzGjWvY2LDXC8vo = false;
            this.f4172Acstmh57AKoSEkEFNJ = false;
            this.f4179Z9WdNiOsPR0y54zHW4 = true;
            this.f4181e54J8UWNHWALQNixXM = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int ToH8yzk8U1nKT0PUfY(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls.ToH8yzk8U1nKT0PUfY(int, int, int, int, boolean):int");
        }

        public static int Y43RdunnpKgpbny0lE(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        public static boolean aRQ2M7vtRaPDEyvpdv(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public static zZKhbgvUfsK4AEX3r0 ayduHasC7VpxsVXE0T(Context context, AttributeSet attributeSet, int i, int i2) {
            zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4685KYHag8HRDlnO3X9zmZ, i, i2);
            zzkhbgvufsk4aex3r0.f4193lEeR5KfoEr4xU5yHH7 = typedArrayObtainStyledAttributes.getInt(bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4688TCyPEKSzIyweCN5yp1, 1);
            zzkhbgvufsk4aex3r0.f4194s3fjYDxWOUexjjVgyA = typedArrayObtainStyledAttributes.getInt(bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4699zaq8hOURtfwbcX17cG, 1);
            zzkhbgvufsk4aex3r0.f4192HJFh0TGMpafqLE9haL = typedArrayObtainStyledAttributes.getBoolean(bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4686OANkd3mP6AYvwbNLJM, false);
            zzkhbgvufsk4aex3r0.f4195zZKhbgvUfsK4AEX3r0 = typedArrayObtainStyledAttributes.getBoolean(bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4697sTkWmhpZ5b1ArQIw4K, false);
            typedArrayObtainStyledAttributes.recycle();
            return zzkhbgvufsk4aex3r0;
        }

        public abstract int A49QRPHynYLCBN0SqP(WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw);

        public void Acstmh57AKoSEkEFNJ(View view, int i) {
            Z9WdNiOsPR0y54zHW4(view, i, false);
        }

        public void BGBL3rAlNaaPWRbRlF(int i) {
            if (aAp6BD79BhftLCnuvf(i) != null) {
                this.f4184lEeR5KfoEr4xU5yHH7.zaq8hOURtfwbcX17cG(i);
            }
        }

        public void Bc5OTyAfOKVCQb8CEz(View view, int i, int i2, int i3, int i4) {
            OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (OANkd3mP6AYvwbNLJM) view.getLayoutParams();
            Rect rect = oANkd3mP6AYvwbNLJM.f4110s3fjYDxWOUexjjVgyA;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).bottomMargin);
        }

        public View CSih7GetOUab1dYQjM() {
            View focusedChild;
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4184lEeR5KfoEr4xU5yHH7.hoXrIDAFrSwfShk8da(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void D3qEI0j1Bvj6FYKAih(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f4186s3fjYDxWOUexjjVgyA = null;
                this.f4184lEeR5KfoEr4xU5yHH7 = null;
                height = 0;
                this.f4189zaq8hOURtfwbcX17cG = 0;
            } else {
                this.f4186s3fjYDxWOUexjjVgyA = recyclerView;
                this.f4184lEeR5KfoEr4xU5yHH7 = recyclerView.f4078husNiw3snxdgZPAGJm;
                this.f4189zaq8hOURtfwbcX17cG = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f4187sTkWmhpZ5b1ArQIw4K = height;
            this.f4180aPyGSIylzVNKPT1Bls = 1073741824;
            this.f4176OANkd3mP6AYvwbNLJM = 1073741824;
        }

        public int DFYiVi7zXozAjRciKa() {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public OANkd3mP6AYvwbNLJM DfpieXfdYs58yZAiXY(Context context, AttributeSet attributeSet) {
            return new OANkd3mP6AYvwbNLJM(context, attributeSet);
        }

        public boolean Er40JrQbOM51vCQI8w() {
            return this.f4172Acstmh57AKoSEkEFNJ;
        }

        public View EscIOBqRhG6irG5q11(View view, int i) {
            return null;
        }

        public abstract void FI7jQXEuEg1AdcOOw7(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw);

        public void FXtjrf53D5B1cLsLFG(View view, G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
            TZ2u8Z18RnXun7OSW0(view);
            g7AC3DWIx9i9fdanjk.ao3wqKm5CXFuvC0q47(view);
        }

        public boolean Fo9071MN8vwEWamAUX() {
            return this.f4185pbVGzGjWvY2LDXC8vo;
        }

        public int FtYx4GXtxwA8al5hBy(View view) {
            return ((OANkd3mP6AYvwbNLJM) view.getLayoutParams()).lEeR5KfoEr4xU5yHH7();
        }

        public void G7AC3DWIx9i9fdanjk(int i, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        }

        public boolean GeBgWLiG3rAOvStVF8(RecyclerView recyclerView, View view, View view2) {
            return HR5vAalpgOKVm2T0Gq() || recyclerView.bBVlTkqEpHW053CjWL();
        }

        public abstract OANkd3mP6AYvwbNLJM GyWRxpdt1T8mEJXPoD();

        public boolean HR5vAalpgOKVm2T0Gq() {
            VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0 = this.f4178TCyPEKSzIyweCN5yp1;
            return vItLRw50eXTZeEfGl0 != null && vItLRw50eXTZeEfGl0.IPyIQcaNa8aB7drBED();
        }

        public boolean HZ4bptRS9XIcK1CV95(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
            return false;
        }

        public void IPyIQcaNa8aB7drBED(View view, int i) {
            Z9WdNiOsPR0y54zHW4(view, i, true);
        }

        public final void JRgQbcjdTfLJPT0BU7(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, int i, View view) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(view);
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY()) {
                return;
            }
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.R9SAhYMerGybF9OAjL() && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.xHA29AmDt6y96AnB3t() && !this.f4186s3fjYDxWOUexjjVgyA.f4072e54J8UWNHWALQNixXM.TCyPEKSzIyweCN5yp1()) {
                BGBL3rAlNaaPWRbRlF(i);
                g7AC3DWIx9i9fdanjk.OUd9THiLjZndMj0qdF(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
            } else {
                OUd9THiLjZndMj0qdF(i);
                g7AC3DWIx9i9fdanjk.jCtUeU2YI1poCxWcjm(view);
                this.f4186s3fjYDxWOUexjjVgyA.f4037KYHag8HRDlnO3X9zmZ.Z9WdNiOsPR0y54zHW4(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
            }
        }

        public void JXsqbvi9UKxeF3HXpU(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            if (this.f4186s3fjYDxWOUexjjVgyA.canScrollVertically(-1) || this.f4186s3fjYDxWOUexjjVgyA.canScrollHorizontally(-1)) {
                a49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7(8192);
                a49QRPHynYLCBN0SqP.HZ4bptRS9XIcK1CV95(true);
            }
            if (this.f4186s3fjYDxWOUexjjVgyA.canScrollVertically(1) || this.f4186s3fjYDxWOUexjjVgyA.canScrollHorizontally(1)) {
                a49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7(4096);
                a49QRPHynYLCBN0SqP.HZ4bptRS9XIcK1CV95(true);
            }
            a49QRPHynYLCBN0SqP.evSiTWao80SbJUZk9E(A49QRPHynYLCBN0SqP.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(Jsouc4ileb8SxQhxbX(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw), zcy2NNbtVXgoGQbfuq(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw), HZ4bptRS9XIcK1CV95(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw), fLSSbwbzFBVpwBH5FM(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw)));
        }

        public int Jsouc4ileb8SxQhxbX(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView == null || recyclerView.f4072e54J8UWNHWALQNixXM == null || !zaq8hOURtfwbcX17cG()) {
                return 1;
            }
            return this.f4186s3fjYDxWOUexjjVgyA.f4072e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL();
        }

        public int Kh0uC90qEEhuLdpgB9() {
            return lLKzvdU99Iw80uVD5I.VItLRw50eXTZeEfGl0(this.f4186s3fjYDxWOUexjjVgyA);
        }

        public int KqgKJKIWne3kz1AdHk() {
            return -1;
        }

        public void LFGi8lLul9XOP250o9(RecyclerView recyclerView, int i, int i2) {
        }

        public abstract int LIMtzhnLwQyigzK0KO(WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw);

        public boolean LU0fFDMACqnfIfA1AZ() {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            return recyclerView != null && recyclerView.f4049TCyPEKSzIyweCN5yp1;
        }

        public boolean LjVYrU4NjguFeQ2fwa(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return hUNDUI3oB5uci3ylnY(recyclerView, view, rect, z, false);
        }

        public void MHebQjnRowM60e3HDn(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i, int i2) {
            this.f4186s3fjYDxWOUexjjVgyA.xHA29AmDt6y96AnB3t(i, i2);
        }

        public void MecTLhJ95ynyqeEob1() {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void Nm04cZudeGY9NQf1y2() {
            this.f4174IPyIQcaNa8aB7drBED = true;
        }

        public int O1furmptfI76BGfN0d() {
            return this.f4189zaq8hOURtfwbcX17cG;
        }

        public abstract boolean OANkd3mP6AYvwbNLJM();

        public void OUd9THiLjZndMj0qdF(int i) {
            jCtUeU2YI1poCxWcjm(i, aAp6BD79BhftLCnuvf(i));
        }

        public void OWyIJu8lIXxQlvLhaC(RecyclerView recyclerView, G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
            yXUWiIShOcfJRNCmU8(recyclerView);
        }

        public View OqIo5QF00RDxUQb4qq(int i) {
            int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I();
            for (int i2 = 0; i2 < iLLKzvdU99Iw80uVD5I; i2++) {
                View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(i2);
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(viewAAp6BD79BhftLCnuvf);
                if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null && oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.T9PhQIpGRhE4yZDm1C() == i && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY() && (this.f4186s3fjYDxWOUexjjVgyA.f4052Tu4WCh2gEwj8E4oHbP.husNiw3snxdgZPAGJm() || !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.xHA29AmDt6y96AnB3t())) {
                    return viewAAp6BD79BhftLCnuvf;
                }
            }
            return null;
        }

        public void PDw1hXOtArGjUqFgpT(RecyclerView recyclerView) {
        }

        public int PPkm9uUfOJHHYveeLT(View view) {
            return ((OANkd3mP6AYvwbNLJM) view.getLayoutParams()).f4110s3fjYDxWOUexjjVgyA.bottom;
        }

        public int Pum9NZyDBKoCnecvlx() {
            return lLKzvdU99Iw80uVD5I.WWC27LAMFqFFBzfbNw(this.f4186s3fjYDxWOUexjjVgyA);
        }

        public void QW0Trt6m3nVBNaYFnP(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            d4ZdBAtGyjVWTQYsYn(recyclerView.f4087s3fjYDxWOUexjjVgyA, recyclerView.f4052Tu4WCh2gEwj8E4oHbP, accessibilityEvent);
        }

        public boolean R6kEk3zZuOluTikhN3(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            return auvQiDfBN48eRz3fFq(recyclerView.f4087s3fjYDxWOUexjjVgyA, recyclerView.f4052Tu4WCh2gEwj8E4oHbP, view, i, bundle);
        }

        public void R9SAhYMerGybF9OAjL(int i, int i2, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        }

        public boolean SF66oTSCsXABfwyWiU(View view, int i, int i2, OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
            return (!view.isLayoutRequested() && this.f4179Z9WdNiOsPR0y54zHW4 && aRQ2M7vtRaPDEyvpdv(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).width) && aRQ2M7vtRaPDEyvpdv(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).height)) ? false : true;
        }

        public void T9PhQIpGRhE4yZDm1C(View view, int i) {
            hoXrIDAFrSwfShk8da(view, i, (OANkd3mP6AYvwbNLJM) view.getLayoutParams());
        }

        public void TCyPEKSzIyweCN5yp1(View view) {
            IPyIQcaNa8aB7drBED(view, -1);
        }

        public abstract int THTDvPxsHqMeGb512f(WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw);

        public void TZ2u8Z18RnXun7OSW0(View view) {
            this.f4184lEeR5KfoEr4xU5yHH7.OANkd3mP6AYvwbNLJM(view);
        }

        public abstract void Tn7MuV14fPMb1UrB5h(RecyclerView recyclerView, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i);

        public int Tu4WCh2gEwj8E4oHbP() {
            return lLKzvdU99Iw80uVD5I.A49QRPHynYLCBN0SqP(this.f4186s3fjYDxWOUexjjVgyA);
        }

        public int Uj8rPa1EWADtk6Oe0S(View view) {
            return view.getTop() - bBVlTkqEpHW053CjWL(view);
        }

        public abstract int VItLRw50eXTZeEfGl0(WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw);

        public View W3RZ2dTDKrKpS5Mxdk(View view) {
            View viewXdzLv4NdAtTYoEzVzB;
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView == null || (viewXdzLv4NdAtTYoEzVzB = recyclerView.XdzLv4NdAtTYoEzVzB(view)) == null || this.f4184lEeR5KfoEr4xU5yHH7.hoXrIDAFrSwfShk8da(viewXdzLv4NdAtTYoEzVzB)) {
                return null;
            }
            return viewXdzLv4NdAtTYoEzVzB;
        }

        public abstract int WWC27LAMFqFFBzfbNw(WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw);

        public boolean WaWv1mJ1ya3uoEaKqz(RecyclerView recyclerView, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, View view, View view2) {
            return GeBgWLiG3rAOvStVF8(recyclerView, view, view2);
        }

        public boolean X3J0rTi7qZISiATDQK(View view, int i, int i2, OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
            return (this.f4179Z9WdNiOsPR0y54zHW4 && aRQ2M7vtRaPDEyvpdv(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).width) && aRQ2M7vtRaPDEyvpdv(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).height)) ? false : true;
        }

        public void X3sgW3wH5gs9BRlOWB() {
            VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0 = this.f4178TCyPEKSzIyweCN5yp1;
            if (vItLRw50eXTZeEfGl0 != null) {
                vItLRw50eXTZeEfGl0.sTkWmhpZ5b1ArQIw4K();
            }
        }

        public final int[] XdzLv4NdAtTYoEzVzB(View view, Rect rect) {
            int iZXY7dgnTfw9Pd9RXel = zXY7dgnTfw9Pd9RXel();
            int iDFYiVi7zXozAjRciKa = DFYiVi7zXozAjRciKa();
            int iO1furmptfI76BGfN0d = O1furmptfI76BGfN0d() - eWK41qw3g36LVd4UnS();
            int iOsrHU7fvDp2EgxZPfM = osrHU7fvDp2EgxZPfM() - ctWLFN70QQINH1kyYo();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - iZXY7dgnTfw9Pd9RXel;
            int iMin = Math.min(0, i);
            int i2 = top - iDFYiVi7zXozAjRciKa;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - iO1furmptfI76BGfN0d;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - iOsrHU7fvDp2EgxZPfM);
            if (Tu4WCh2gEwj8E4oHbP() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        public void XzJ1BS7H9Ilbkv4eVM(RecyclerView recyclerView) {
            this.f4185pbVGzGjWvY2LDXC8vo = true;
            oXIAAdret8ERrYfuyf(recyclerView);
        }

        public void YIIWDMF3jHAs3E0PkN(Parcelable parcelable) {
        }

        public int YlLW4G6OV9TFyuw5ix(View view) {
            return view.getBottom() + PPkm9uUfOJHHYveeLT(view);
        }

        public final boolean Ywqw2A0s86HeuFkDt0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iZXY7dgnTfw9Pd9RXel = zXY7dgnTfw9Pd9RXel();
            int iDFYiVi7zXozAjRciKa = DFYiVi7zXozAjRciKa();
            int iO1furmptfI76BGfN0d = O1furmptfI76BGfN0d() - eWK41qw3g36LVd4UnS();
            int iOsrHU7fvDp2EgxZPfM = osrHU7fvDp2EgxZPfM() - ctWLFN70QQINH1kyYo();
            Rect rect = this.f4186s3fjYDxWOUexjjVgyA.f4086pbVGzGjWvY2LDXC8vo;
            oocVJL811qFf0j0XXZ(focusedChild, rect);
            return rect.left - i < iO1furmptfI76BGfN0d && rect.right - i > iZXY7dgnTfw9Pd9RXel && rect.top - i2 < iOsrHU7fvDp2EgxZPfM && rect.bottom - i2 > iDFYiVi7zXozAjRciKa;
        }

        public final void Z9WdNiOsPR0y54zHW4(View view, int i, boolean z) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(view);
            if (z || oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.xHA29AmDt6y96AnB3t()) {
                this.f4186s3fjYDxWOUexjjVgyA.f4037KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
            } else {
                this.f4186s3fjYDxWOUexjjVgyA.f4037KYHag8HRDlnO3X9zmZ.OANkd3mP6AYvwbNLJM(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
            }
            OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (OANkd3mP6AYvwbNLJM) view.getLayoutParams();
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.KqgKJKIWne3kz1AdHk() || oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.LIMtzhnLwQyigzK0KO()) {
                if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.LIMtzhnLwQyigzK0KO()) {
                    oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.e2F9F6h8YJxTHwLCa0();
                } else {
                    oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.husNiw3snxdgZPAGJm();
                }
                this.f4184lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4186s3fjYDxWOUexjjVgyA) {
                int iT9PhQIpGRhE4yZDm1C = this.f4184lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C(view);
                if (i == -1) {
                    i = this.f4184lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1();
                }
                if (iT9PhQIpGRhE4yZDm1C == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4186s3fjYDxWOUexjjVgyA.indexOfChild(view) + this.f4186s3fjYDxWOUexjjVgyA.lLKzvdU99Iw80uVD5I());
                }
                if (iT9PhQIpGRhE4yZDm1C != i) {
                    this.f4186s3fjYDxWOUexjjVgyA.f4048T9PhQIpGRhE4yZDm1C.fDXXEWvhMVO3O8mnuS(iT9PhQIpGRhE4yZDm1C, i);
                }
            } else {
                this.f4184lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(view, i, false);
                oANkd3mP6AYvwbNLJM.f4108HJFh0TGMpafqLE9haL = true;
                VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0 = this.f4178TCyPEKSzIyweCN5yp1;
                if (vItLRw50eXTZeEfGl0 != null && vItLRw50eXTZeEfGl0.IPyIQcaNa8aB7drBED()) {
                    this.f4178TCyPEKSzIyweCN5yp1.Z9WdNiOsPR0y54zHW4(view);
                }
            }
            if (oANkd3mP6AYvwbNLJM.f4111zZKhbgvUfsK4AEX3r0) {
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.f4125lEeR5KfoEr4xU5yHH7.invalidate();
                oANkd3mP6AYvwbNLJM.f4111zZKhbgvUfsK4AEX3r0 = false;
            }
        }

        public void ZH7ZBRiZvcOTI9arA2(int i, int i2) {
            int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I();
            if (iLLKzvdU99Iw80uVD5I == 0) {
                this.f4186s3fjYDxWOUexjjVgyA.xHA29AmDt6y96AnB3t(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iLLKzvdU99Iw80uVD5I; i7++) {
                View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(i7);
                Rect rect = this.f4186s3fjYDxWOUexjjVgyA.f4086pbVGzGjWvY2LDXC8vo;
                oocVJL811qFf0j0XXZ(viewAAp6BD79BhftLCnuvf, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.f4186s3fjYDxWOUexjjVgyA.f4086pbVGzGjWvY2LDXC8vo.set(i6, i4, i3, i5);
            fB1XGht2x9XoIgekQ8(this.f4186s3fjYDxWOUexjjVgyA.f4086pbVGzGjWvY2LDXC8vo, i, i2);
        }

        public int ZJNyOIPL0usMs2xSAn() {
            return this.f4176OANkd3mP6AYvwbNLJM;
        }

        public View aAp6BD79BhftLCnuvf(int i) {
            androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f4184lEeR5KfoEr4xU5yHH7;
            if (s3fjydxwouexjjvgya != null) {
                return s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ(i);
            }
            return null;
        }

        public void aPyGSIylzVNKPT1Bls(View view, Rect rect) {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.jocVUfxESVhVJU8LoH(view));
            }
        }

        public void aUn6Hqsqw2PVM8685Z(View view, int i, int i2) {
            OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (OANkd3mP6AYvwbNLJM) view.getLayoutParams();
            Rect rectJocVUfxESVhVJU8LoH = this.f4186s3fjYDxWOUexjjVgyA.jocVUfxESVhVJU8LoH(view);
            int i3 = i + rectJocVUfxESVhVJU8LoH.left + rectJocVUfxESVhVJU8LoH.right;
            int i4 = i2 + rectJocVUfxESVhVJU8LoH.top + rectJocVUfxESVhVJU8LoH.bottom;
            int iToH8yzk8U1nKT0PUfY = ToH8yzk8U1nKT0PUfY(O1furmptfI76BGfN0d(), iQCvttGuB7nx4r7kMP(), zXY7dgnTfw9Pd9RXel() + eWK41qw3g36LVd4UnS() + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).leftMargin + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).rightMargin + i3, ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).width, OANkd3mP6AYvwbNLJM());
            int iToH8yzk8U1nKT0PUfY2 = ToH8yzk8U1nKT0PUfY(osrHU7fvDp2EgxZPfM(), ZJNyOIPL0usMs2xSAn(), DFYiVi7zXozAjRciKa() + ctWLFN70QQINH1kyYo() + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).topMargin + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).height, zaq8hOURtfwbcX17cG());
            if (SF66oTSCsXABfwyWiU(view, iToH8yzk8U1nKT0PUfY, iToH8yzk8U1nKT0PUfY2, oANkd3mP6AYvwbNLJM)) {
                view.measure(iToH8yzk8U1nKT0PUfY, iToH8yzk8U1nKT0PUfY2);
            }
        }

        public void ao3wqKm5CXFuvC0q47(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
            for (int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I() - 1; iLLKzvdU99Iw80uVD5I >= 0; iLLKzvdU99Iw80uVD5I--) {
                JRgQbcjdTfLJPT0BU7(g7AC3DWIx9i9fdanjk, iLLKzvdU99Iw80uVD5I, aAp6BD79BhftLCnuvf(iLLKzvdU99Iw80uVD5I));
            }
        }

        public boolean auvQiDfBN48eRz3fFq(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, View view, int i, Bundle bundle) {
            return false;
        }

        public boolean ayaSAlBnO403UB0TMR(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i, Bundle bundle) {
            int iOsrHU7fvDp2EgxZPfM;
            int iO1furmptfI76BGfN0d;
            int i2;
            int i3;
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                iOsrHU7fvDp2EgxZPfM = recyclerView.canScrollVertically(1) ? (osrHU7fvDp2EgxZPfM() - DFYiVi7zXozAjRciKa()) - ctWLFN70QQINH1kyYo() : 0;
                if (this.f4186s3fjYDxWOUexjjVgyA.canScrollHorizontally(1)) {
                    iO1furmptfI76BGfN0d = (O1furmptfI76BGfN0d() - zXY7dgnTfw9Pd9RXel()) - eWK41qw3g36LVd4UnS();
                    i2 = iOsrHU7fvDp2EgxZPfM;
                    i3 = iO1furmptfI76BGfN0d;
                }
                i2 = iOsrHU7fvDp2EgxZPfM;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                iOsrHU7fvDp2EgxZPfM = recyclerView.canScrollVertically(-1) ? -((osrHU7fvDp2EgxZPfM() - DFYiVi7zXozAjRciKa()) - ctWLFN70QQINH1kyYo()) : 0;
                if (this.f4186s3fjYDxWOUexjjVgyA.canScrollHorizontally(-1)) {
                    iO1furmptfI76BGfN0d = -((O1furmptfI76BGfN0d() - zXY7dgnTfw9Pd9RXel()) - eWK41qw3g36LVd4UnS());
                    i2 = iOsrHU7fvDp2EgxZPfM;
                    i3 = iO1furmptfI76BGfN0d;
                }
                i2 = iOsrHU7fvDp2EgxZPfM;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f4186s3fjYDxWOUexjjVgyA.lBAL39rPf03qYLFNNP(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public int bBVlTkqEpHW053CjWL(View view) {
            return ((OANkd3mP6AYvwbNLJM) view.getLayoutParams()).f4110s3fjYDxWOUexjjVgyA.top;
        }

        public int bMSdooljgH14Jgudph(View view) {
            return view.getRight() + xMfAHy6F7qK0zhxhKG(view);
        }

        public int cT5Hs3CQpLK8NvlZAw(View view) {
            Rect rect = ((OANkd3mP6AYvwbNLJM) view.getLayoutParams()).f4110s3fjYDxWOUexjjVgyA;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void cr99CPXhoiknALiHbq(RecyclerView recyclerView, int i, int i2, Object obj) {
            vExXQwwMm8C1aKdGdj(recyclerView, i, i2);
        }

        public int ctWLFN70QQINH1kyYo() {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void d4ZdBAtGyjVWTQYsYn(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f4186s3fjYDxWOUexjjVgyA.canScrollVertically(-1) && !this.f4186s3fjYDxWOUexjjVgyA.canScrollHorizontally(-1) && !this.f4186s3fjYDxWOUexjjVgyA.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f4186s3fjYDxWOUexjjVgyA.f4072e54J8UWNHWALQNixXM;
            if (tCyPEKSzIyweCN5yp1 != null) {
                accessibilityEvent.setItemCount(tCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL());
            }
        }

        public void dCumDqZdWZ8NLrsgb7(VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0) {
            if (this.f4178TCyPEKSzIyweCN5yp1 == vItLRw50eXTZeEfGl0) {
                this.f4178TCyPEKSzIyweCN5yp1 = null;
            }
        }

        public void dvmHGYHwlE2ean7ktb(int i, G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
            View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(i);
            BGBL3rAlNaaPWRbRlF(i);
            g7AC3DWIx9i9fdanjk.ao3wqKm5CXFuvC0q47(viewAAp6BD79BhftLCnuvf);
        }

        public OANkd3mP6AYvwbNLJM e2F9F6h8YJxTHwLCa0(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof OANkd3mP6AYvwbNLJM ? new OANkd3mP6AYvwbNLJM((OANkd3mP6AYvwbNLJM) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new OANkd3mP6AYvwbNLJM((ViewGroup.MarginLayoutParams) layoutParams) : new OANkd3mP6AYvwbNLJM(layoutParams);
        }

        public void e54J8UWNHWALQNixXM(String str) {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView != null) {
                recyclerView.hoXrIDAFrSwfShk8da(str);
            }
        }

        public void e5tXAuLbtMC3XyEoX9(OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            JXsqbvi9UKxeF3HXpU(recyclerView.f4087s3fjYDxWOUexjjVgyA, recyclerView.f4052Tu4WCh2gEwj8E4oHbP, a49QRPHynYLCBN0SqP);
        }

        public int eWK41qw3g36LVd4UnS() {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int evSiTWao80SbJUZk9E() {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView != null) {
                return lLKzvdU99Iw80uVD5I.OUd9THiLjZndMj0qdF(recyclerView);
            }
            return 0;
        }

        public final boolean f2zPq7MOnQrtOlZ1Zg() {
            return this.f4181e54J8UWNHWALQNixXM;
        }

        public void fB1XGht2x9XoIgekQ8(Rect rect, int i, int i2) {
            sKvjC8bExN3ISwwWsb(Y43RdunnpKgpbny0lE(i, rect.width() + zXY7dgnTfw9Pd9RXel() + eWK41qw3g36LVd4UnS(), Pum9NZyDBKoCnecvlx()), Y43RdunnpKgpbny0lE(i2, rect.height() + DFYiVi7zXozAjRciKa() + ctWLFN70QQINH1kyYo(), Kh0uC90qEEhuLdpgB9()));
        }

        public Parcelable fBZDmBPlAHk1Liuf1T() {
            return null;
        }

        public void fDXXEWvhMVO3O8mnuS(int i, int i2) {
            View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(i);
            if (viewAAp6BD79BhftLCnuvf != null) {
                OUd9THiLjZndMj0qdF(i);
                T9PhQIpGRhE4yZDm1C(viewAAp6BD79BhftLCnuvf, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f4186s3fjYDxWOUexjjVgyA.toString());
            }
        }

        public int fLSSbwbzFBVpwBH5FM(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
            return 0;
        }

        public void g0OBkYSIvp0JYnHPjC(RecyclerView recyclerView, int i, int i2) {
        }

        public void gpnYwZkFpQwu7zi2gb(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
            for (int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I() - 1; iLLKzvdU99Iw80uVD5I >= 0; iLLKzvdU99Iw80uVD5I--) {
                if (!RecyclerView.k0CbjZvfUz23r8IN6W(aAp6BD79BhftLCnuvf(iLLKzvdU99Iw80uVD5I)).DfpieXfdYs58yZAiXY()) {
                    dvmHGYHwlE2ean7ktb(iLLKzvdU99Iw80uVD5I, g7AC3DWIx9i9fdanjk);
                }
            }
        }

        public void h6NrAcYSuIyiU1qV6F(WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        }

        public void h7m69eGbRk1hyaVt28(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public int hUNBy66ZO1wVLJGW3l(View view) {
            Rect rect = ((OANkd3mP6AYvwbNLJM) view.getLayoutParams()).f4110s3fjYDxWOUexjjVgyA;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public boolean hUNDUI3oB5uci3ylnY(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] iArrXdzLv4NdAtTYoEzVzB = XdzLv4NdAtTYoEzVzB(view, rect);
            int i = iArrXdzLv4NdAtTYoEzVzB[0];
            int i2 = iArrXdzLv4NdAtTYoEzVzB[1];
            if ((z2 && !Ywqw2A0s86HeuFkDt0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.fBZDmBPlAHk1Liuf1T(i, i2);
            }
            return true;
        }

        public void hgxXdWVkE1CPHCTwpz(int i) {
        }

        public void hoXrIDAFrSwfShk8da(View view, int i, OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(view);
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.xHA29AmDt6y96AnB3t()) {
                this.f4186s3fjYDxWOUexjjVgyA.f4037KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
            } else {
                this.f4186s3fjYDxWOUexjjVgyA.f4037KYHag8HRDlnO3X9zmZ.OANkd3mP6AYvwbNLJM(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
            }
            this.f4184lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(view, i, oANkd3mP6AYvwbNLJM, oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.xHA29AmDt6y96AnB3t());
        }

        public void i8aHOwH04efS6lZ3Oa(int i) {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView != null) {
                recyclerView.Er40JrQbOM51vCQI8w(i);
            }
        }

        public int iQCvttGuB7nx4r7kMP() {
            return this.f4180aPyGSIylzVNKPT1Bls;
        }

        public final void jCtUeU2YI1poCxWcjm(int i, View view) {
            this.f4184lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(i);
        }

        public boolean jguN4azZtOjukyvhIL() {
            return false;
        }

        public int jocVUfxESVhVJU8LoH() {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView != null) {
                return lLKzvdU99Iw80uVD5I.ao3wqKm5CXFuvC0q47(recyclerView);
            }
            return 0;
        }

        public void jsjSYEu4NPZjZxcfmI(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, View view, OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            a49QRPHynYLCBN0SqP.DFYiVi7zXozAjRciKa(A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(zaq8hOURtfwbcX17cG() ? FtYx4GXtxwA8al5hBy(view) : 0, 1, OANkd3mP6AYvwbNLJM() ? FtYx4GXtxwA8al5hBy(view) : 0, 1, false, false));
        }

        public int k0CbjZvfUz23r8IN6W(View view) {
            return ((OANkd3mP6AYvwbNLJM) view.getLayoutParams()).f4110s3fjYDxWOUexjjVgyA.left;
        }

        public boolean lBAL39rPf03qYLFNNP(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            return ayaSAlBnO403UB0TMR(recyclerView.f4087s3fjYDxWOUexjjVgyA, recyclerView.f4052Tu4WCh2gEwj8E4oHbP, i, bundle);
        }

        public int lLKzvdU99Iw80uVD5I() {
            androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f4184lEeR5KfoEr4xU5yHH7;
            if (s3fjydxwouexjjvgya != null) {
                return s3fjydxwouexjjvgya.TCyPEKSzIyweCN5yp1();
            }
            return 0;
        }

        public abstract View oOMFI1Dcqcg1BSVNty(View view, int i, G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw);

        public void oXIAAdret8ERrYfuyf(RecyclerView recyclerView) {
        }

        public void oocVJL811qFf0j0XXZ(View view, Rect rect) {
            RecyclerView.Kh0uC90qEEhuLdpgB9(view, rect);
        }

        public int osrHU7fvDp2EgxZPfM() {
            return this.f4187sTkWmhpZ5b1ArQIw4K;
        }

        public void owCQzRKpGarpL4247z(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp12) {
        }

        public void pbVGzGjWvY2LDXC8vo(View view) {
            Acstmh57AKoSEkEFNJ(view, -1);
        }

        public boolean pgB7Gmjz55y9NQYnAD(View view, boolean z, boolean z2) {
            boolean z3 = this.f4183husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(view, 24579) && this.f4175KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(view, 24579);
            return z ? z3 : !z3;
        }

        public int s3fjYDxWOUexjjVgyA() {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            TCyPEKSzIyweCN5yp1 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.HJFh0TGMpafqLE9haL();
            }
            return 0;
        }

        public void sKvjC8bExN3ISwwWsb(int i, int i2) {
            this.f4186s3fjYDxWOUexjjVgyA.setMeasuredDimension(i, i2);
        }

        public void sKw6Jz5uGcQ479KwIW(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
            int iAcstmh57AKoSEkEFNJ = g7AC3DWIx9i9fdanjk.Acstmh57AKoSEkEFNJ();
            for (int i = iAcstmh57AKoSEkEFNJ - 1; i >= 0; i--) {
                View viewHoXrIDAFrSwfShk8da = g7AC3DWIx9i9fdanjk.hoXrIDAFrSwfShk8da(i);
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(viewHoXrIDAFrSwfShk8da);
                if (!oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY()) {
                    oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.W3RZ2dTDKrKpS5Mxdk(false);
                    if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.A49QRPHynYLCBN0SqP()) {
                        this.f4186s3fjYDxWOUexjjVgyA.removeDetachedView(viewHoXrIDAFrSwfShk8da, false);
                    }
                    e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f4186s3fjYDxWOUexjjVgyA.f4039KqgKJKIWne3kz1AdHk;
                    if (e54j8uwnhwalqnixxm != null) {
                        e54j8uwnhwalqnixxm.Acstmh57AKoSEkEFNJ(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
                    }
                    oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.W3RZ2dTDKrKpS5Mxdk(true);
                    g7AC3DWIx9i9fdanjk.VItLRw50eXTZeEfGl0(viewHoXrIDAFrSwfShk8da);
                }
            }
            g7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm();
            if (iAcstmh57AKoSEkEFNJ > 0) {
                this.f4186s3fjYDxWOUexjjVgyA.invalidate();
            }
        }

        public boolean sTkWmhpZ5b1ArQIw4K(OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
            return oANkd3mP6AYvwbNLJM != null;
        }

        public abstract int tGGjvtdOhUewv2twsg(int i, G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw);

        public void tXWeW0sqVddf7ZBflq(RecyclerView recyclerView, G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
            this.f4185pbVGzGjWvY2LDXC8vo = false;
            OWyIJu8lIXxQlvLhaC(recyclerView, g7AC3DWIx9i9fdanjk);
        }

        public void tmIBXGVvBsrJ7i63G2(View view, OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(view);
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W == null || oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.xHA29AmDt6y96AnB3t() || this.f4184lEeR5KfoEr4xU5yHH7.hoXrIDAFrSwfShk8da(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.f4125lEeR5KfoEr4xU5yHH7)) {
                return;
            }
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            jsjSYEu4NPZjZxcfmI(recyclerView.f4087s3fjYDxWOUexjjVgyA, recyclerView.f4052Tu4WCh2gEwj8E4oHbP, view, a49QRPHynYLCBN0SqP);
        }

        public boolean uAIIhSQWhOmxUb3Bqo(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
            return false;
        }

        public int udcVtCzLTM1Loe9KrX(View view) {
            return view.getLeft() - k0CbjZvfUz23r8IN6W(view);
        }

        public void vExXQwwMm8C1aKdGdj(RecyclerView recyclerView, int i, int i2) {
        }

        public void vlBaBOcZ1q1ndWVoXn(int i) {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView != null) {
                recyclerView.Fo9071MN8vwEWamAUX(i);
            }
        }

        public void w859GrF8FXGM1qrYSH(int i, int i2) {
            this.f4189zaq8hOURtfwbcX17cG = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f4180aPyGSIylzVNKPT1Bls = mode;
            if (mode == 0 && !RecyclerView.f4023iQCvttGuB7nx4r7kMP) {
                this.f4189zaq8hOURtfwbcX17cG = 0;
            }
            this.f4187sTkWmhpZ5b1ArQIw4K = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4176OANkd3mP6AYvwbNLJM = mode2;
            if (mode2 != 0 || RecyclerView.f4023iQCvttGuB7nx4r7kMP) {
                return;
            }
            this.f4187sTkWmhpZ5b1ArQIw4K = 0;
        }

        public boolean w9kKjxxNBwNcD4xB6O() {
            return false;
        }

        public abstract int wUKf1mNArSjssthGmN(int i, G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw);

        public abstract int xHA29AmDt6y96AnB3t(WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw);

        public int xMfAHy6F7qK0zhxhKG(View view) {
            return ((OANkd3mP6AYvwbNLJM) view.getLayoutParams()).f4110s3fjYDxWOUexjjVgyA.right;
        }

        public void xt9LcS8xZRgoStfDrh(RecyclerView recyclerView) {
            w859GrF8FXGM1qrYSH(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public boolean yL2E9nlEZpg8ZZx8XE() {
            int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I();
            for (int i = 0; i < iLLKzvdU99Iw80uVD5I; i++) {
                ViewGroup.LayoutParams layoutParams = aAp6BD79BhftLCnuvf(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void yXUWiIShOcfJRNCmU8(RecyclerView recyclerView) {
        }

        public void yuvys90eVmNOCmVGXw(VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0) {
            VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl02 = this.f4178TCyPEKSzIyweCN5yp1;
            if (vItLRw50eXTZeEfGl02 != null && vItLRw50eXTZeEfGl0 != vItLRw50eXTZeEfGl02 && vItLRw50eXTZeEfGl02.IPyIQcaNa8aB7drBED()) {
                this.f4178TCyPEKSzIyweCN5yp1.sTkWmhpZ5b1ArQIw4K();
            }
            this.f4178TCyPEKSzIyweCN5yp1 = vItLRw50eXTZeEfGl0;
            vItLRw50eXTZeEfGl0.zaq8hOURtfwbcX17cG(this.f4186s3fjYDxWOUexjjVgyA, this);
        }

        public void yvdWWG9COQQotjfedH(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((OANkd3mP6AYvwbNLJM) view.getLayoutParams()).f4110s3fjYDxWOUexjjVgyA;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f4186s3fjYDxWOUexjjVgyA != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f4186s3fjYDxWOUexjjVgyA.f4061Z9WdNiOsPR0y54zHW4;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public abstract void zQjb36M22TWHJmh54i(int i);

        public boolean zWzrlx9vIdLp7FoEMD(Runnable runnable) {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int zXY7dgnTfw9Pd9RXel() {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public abstract boolean zaq8hOURtfwbcX17cG();

        public int zcy2NNbtVXgoGQbfuq(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
            RecyclerView recyclerView = this.f4186s3fjYDxWOUexjjVgyA;
            if (recyclerView == null || recyclerView.f4072e54J8UWNHWALQNixXM == null || !OANkd3mP6AYvwbNLJM()) {
                return 1;
            }
            return this.f4186s3fjYDxWOUexjjVgyA.f4072e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL();
        }
    }

    public class ao3wqKm5CXFuvC0q47 implements Runnable {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public OverScroller f4196HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public boolean f4197KYHag8HRDlnO3X9zmZ;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public boolean f4199husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f4200lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f4201s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public Interpolator f4202zZKhbgvUfsK4AEX3r0;

        public ao3wqKm5CXFuvC0q47() {
            Interpolator interpolator = RecyclerView.f4019HZ4bptRS9XIcK1CV95;
            this.f4202zZKhbgvUfsK4AEX3r0 = interpolator;
            this.f4199husNiw3snxdgZPAGJm = false;
            this.f4197KYHag8HRDlnO3X9zmZ = false;
            this.f4196HJFh0TGMpafqLE9haL = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void HJFh0TGMpafqLE9haL(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f4201s3fjYDxWOUexjjVgyA = 0;
            this.f4200lEeR5KfoEr4xU5yHH7 = 0;
            Interpolator interpolator = this.f4202zZKhbgvUfsK4AEX3r0;
            Interpolator interpolator2 = RecyclerView.f4019HZ4bptRS9XIcK1CV95;
            if (interpolator != interpolator2) {
                this.f4202zZKhbgvUfsK4AEX3r0 = interpolator2;
                this.f4196HJFh0TGMpafqLE9haL = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4196HJFh0TGMpafqLE9haL.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            husNiw3snxdgZPAGJm();
        }

        public void KYHag8HRDlnO3X9zmZ(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = lEeR5KfoEr4xU5yHH7(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f4019HZ4bptRS9XIcK1CV95;
            }
            if (this.f4202zZKhbgvUfsK4AEX3r0 != interpolator) {
                this.f4202zZKhbgvUfsK4AEX3r0 = interpolator;
                this.f4196HJFh0TGMpafqLE9haL = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4201s3fjYDxWOUexjjVgyA = 0;
            this.f4200lEeR5KfoEr4xU5yHH7 = 0;
            RecyclerView.this.setScrollState(2);
            this.f4196HJFh0TGMpafqLE9haL.startScroll(0, 0, i, i2, i4);
            husNiw3snxdgZPAGJm();
        }

        public void TCyPEKSzIyweCN5yp1() {
            RecyclerView.this.removeCallbacks(this);
            this.f4196HJFh0TGMpafqLE9haL.abortAnimation();
        }

        public void husNiw3snxdgZPAGJm() {
            if (this.f4199husNiw3snxdgZPAGJm) {
                this.f4197KYHag8HRDlnO3X9zmZ = true;
            } else {
                zZKhbgvUfsK4AEX3r0();
            }
        }

        public final int lEeR5KfoEr4xU5yHH7(int i, int i2, int i3, int i4) {
            int iRound;
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int iSqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i5 = width / 2;
            float f = width;
            float f2 = i5;
            float fS3fjYDxWOUexjjVgyA = f2 + (s3fjYDxWOUexjjVgyA(Math.min(1.0f, (iSqrt2 * 1.0f) / f)) * f2);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fS3fjYDxWOUexjjVgyA / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4048T9PhQIpGRhE4yZDm1C == null) {
                TCyPEKSzIyweCN5yp1();
                return;
            }
            this.f4197KYHag8HRDlnO3X9zmZ = false;
            this.f4199husNiw3snxdgZPAGJm = true;
            recyclerView.R9SAhYMerGybF9OAjL();
            OverScroller overScroller = this.f4196HJFh0TGMpafqLE9haL;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f4200lEeR5KfoEr4xU5yHH7;
                int i4 = currY - this.f4201s3fjYDxWOUexjjVgyA;
                this.f4200lEeR5KfoEr4xU5yHH7 = currX;
                this.f4201s3fjYDxWOUexjjVgyA = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f4092xMfAHy6F7qK0zhxhKG;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.XzJ1BS7H9Ilbkv4eVM(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f4092xMfAHy6F7qK0zhxhKG;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.Y43RdunnpKgpbny0lE(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f4072e54J8UWNHWALQNixXM != null) {
                    int[] iArr3 = recyclerView3.f4092xMfAHy6F7qK0zhxhKG;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.h6NrAcYSuIyiU1qV6F(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f4092xMfAHy6F7qK0zhxhKG;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0 = recyclerView4.f4048T9PhQIpGRhE4yZDm1C.f4178TCyPEKSzIyweCN5yp1;
                    if (vItLRw50eXTZeEfGl0 != null && !vItLRw50eXTZeEfGl0.TCyPEKSzIyweCN5yp1() && vItLRw50eXTZeEfGl0.IPyIQcaNa8aB7drBED()) {
                        int iS3fjYDxWOUexjjVgyA = RecyclerView.this.f4052Tu4WCh2gEwj8E4oHbP.s3fjYDxWOUexjjVgyA();
                        if (iS3fjYDxWOUexjjVgyA == 0) {
                            vItLRw50eXTZeEfGl0.sTkWmhpZ5b1ArQIw4K();
                        } else {
                            if (vItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ() >= iS3fjYDxWOUexjjVgyA) {
                                vItLRw50eXTZeEfGl0.OANkd3mP6AYvwbNLJM(iS3fjYDxWOUexjjVgyA - 1);
                            }
                            vItLRw50eXTZeEfGl0.Acstmh57AKoSEkEFNJ(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.f4077hoXrIDAFrSwfShk8da.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f4092xMfAHy6F7qK0zhxhKG;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.tXWeW0sqVddf7ZBflq(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f4092xMfAHy6F7qK0zhxhKG;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.OqIo5QF00RDxUQb4qq(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl02 = RecyclerView.this.f4048T9PhQIpGRhE4yZDm1C.f4178TCyPEKSzIyweCN5yp1;
                if ((vItLRw50eXTZeEfGl02 == null || !vItLRw50eXTZeEfGl02.TCyPEKSzIyweCN5yp1()) && z) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.lEeR5KfoEr4xU5yHH7(i7, currVelocity);
                    }
                    if (RecyclerView.f4018Fo9071MN8vwEWamAUX) {
                        RecyclerView.this.f4062ZJNyOIPL0usMs2xSAn.s3fjYDxWOUexjjVgyA();
                    }
                } else {
                    husNiw3snxdgZPAGJm();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.husNiw3snxdgZPAGJm husniw3snxdgzpagjm = recyclerView7.f4085osrHU7fvDp2EgxZPfM;
                    if (husniw3snxdgzpagjm != null) {
                        husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ(recyclerView7, i2, i);
                    }
                }
            }
            VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl03 = RecyclerView.this.f4048T9PhQIpGRhE4yZDm1C.f4178TCyPEKSzIyweCN5yp1;
            if (vItLRw50eXTZeEfGl03 != null && vItLRw50eXTZeEfGl03.TCyPEKSzIyweCN5yp1()) {
                vItLRw50eXTZeEfGl03.Acstmh57AKoSEkEFNJ(0, 0);
            }
            this.f4199husNiw3snxdgZPAGJm = false;
            if (this.f4197KYHag8HRDlnO3X9zmZ) {
                zZKhbgvUfsK4AEX3r0();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.sKw6Jz5uGcQ479KwIW(1);
            }
        }

        public final float s3fjYDxWOUexjjVgyA(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        public final void zZKhbgvUfsK4AEX3r0() {
            RecyclerView.this.removeCallbacks(this);
            lLKzvdU99Iw80uVD5I.ZJNyOIPL0usMs2xSAn(RecyclerView.this, this);
        }
    }

    public static abstract class e54J8UWNHWALQNixXM {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public lEeR5KfoEr4xU5yHH7 f4206lEeR5KfoEr4xU5yHH7 = null;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public ArrayList f4207s3fjYDxWOUexjjVgyA = new ArrayList();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public long f4203HJFh0TGMpafqLE9haL = 120;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public long f4208zZKhbgvUfsK4AEX3r0 = 120;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public long f4205husNiw3snxdgZPAGJm = 250;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public long f4204KYHag8HRDlnO3X9zmZ = 250;

        public interface lEeR5KfoEr4xU5yHH7 {
            void lEeR5KfoEr4xU5yHH7(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF);
        }

        public static class s3fjYDxWOUexjjVgyA {

            /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
            public int f4209HJFh0TGMpafqLE9haL;

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public int f4210lEeR5KfoEr4xU5yHH7;

            /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
            public int f4211s3fjYDxWOUexjjVgyA;

            /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
            public int f4212zZKhbgvUfsK4AEX3r0;

            public s3fjYDxWOUexjjVgyA lEeR5KfoEr4xU5yHH7(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
                return s3fjYDxWOUexjjVgyA(oUd9THiLjZndMj0qdF, 0);
            }

            public s3fjYDxWOUexjjVgyA s3fjYDxWOUexjjVgyA(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, int i) {
                View view = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7;
                this.f4210lEeR5KfoEr4xU5yHH7 = view.getLeft();
                this.f4211s3fjYDxWOUexjjVgyA = view.getTop();
                this.f4209HJFh0TGMpafqLE9haL = view.getRight();
                this.f4212zZKhbgvUfsK4AEX3r0 = view.getBottom();
                return this;
            }
        }

        public static int husNiw3snxdgZPAGJm(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            int i = oUd9THiLjZndMj0qdF.f4113Acstmh57AKoSEkEFNJ;
            int i2 = i & 14;
            if (oUd9THiLjZndMj0qdF.R9SAhYMerGybF9OAjL()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i2;
            }
            int iHoXrIDAFrSwfShk8da = oUd9THiLjZndMj0qdF.hoXrIDAFrSwfShk8da();
            int iAcstmh57AKoSEkEFNJ = oUd9THiLjZndMj0qdF.Acstmh57AKoSEkEFNJ();
            return (iHoXrIDAFrSwfShk8da == -1 || iAcstmh57AKoSEkEFNJ == -1 || iHoXrIDAFrSwfShk8da == iAcstmh57AKoSEkEFNJ) ? i2 : i2 | 2048;
        }

        public abstract void Acstmh57AKoSEkEFNJ(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF);

        public abstract void G7AC3DWIx9i9fdanjk();

        public abstract boolean HJFh0TGMpafqLE9haL(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2);

        public final void IPyIQcaNa8aB7drBED(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            sTkWmhpZ5b1ArQIw4K(oUd9THiLjZndMj0qdF);
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f4206lEeR5KfoEr4xU5yHH7;
            if (leer5kfoer4xu5yhh7 != null) {
                leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(oUd9THiLjZndMj0qdF);
            }
        }

        public abstract boolean KYHag8HRDlnO3X9zmZ(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF);

        public abstract boolean OANkd3mP6AYvwbNLJM();

        public s3fjYDxWOUexjjVgyA R9SAhYMerGybF9OAjL(WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, int i, List list) {
            return zaq8hOURtfwbcX17cG().lEeR5KfoEr4xU5yHH7(oUd9THiLjZndMj0qdF);
        }

        public long T9PhQIpGRhE4yZDm1C() {
            return this.f4204KYHag8HRDlnO3X9zmZ;
        }

        public boolean TCyPEKSzIyweCN5yp1(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, List list) {
            return KYHag8HRDlnO3X9zmZ(oUd9THiLjZndMj0qdF);
        }

        public s3fjYDxWOUexjjVgyA Y43RdunnpKgpbny0lE(WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            return zaq8hOURtfwbcX17cG().lEeR5KfoEr4xU5yHH7(oUd9THiLjZndMj0qdF);
        }

        public abstract void Z9WdNiOsPR0y54zHW4();

        public long aPyGSIylzVNKPT1Bls() {
            return this.f4208zZKhbgvUfsK4AEX3r0;
        }

        public long e54J8UWNHWALQNixXM() {
            return this.f4203HJFh0TGMpafqLE9haL;
        }

        public long hoXrIDAFrSwfShk8da() {
            return this.f4205husNiw3snxdgZPAGJm;
        }

        public abstract boolean lEeR5KfoEr4xU5yHH7(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2);

        public final void pbVGzGjWvY2LDXC8vo() {
            if (this.f4207s3fjYDxWOUexjjVgyA.size() <= 0) {
                this.f4207s3fjYDxWOUexjjVgyA.clear();
            } else {
                androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this.f4207s3fjYDxWOUexjjVgyA.get(0));
                throw null;
            }
        }

        public abstract boolean s3fjYDxWOUexjjVgyA(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF2, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2);

        public void sTkWmhpZ5b1ArQIw4K(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        }

        public void xHA29AmDt6y96AnB3t(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this.f4206lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
        }

        public abstract boolean zZKhbgvUfsK4AEX3r0(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2);

        public s3fjYDxWOUexjjVgyA zaq8hOURtfwbcX17cG() {
            return new s3fjYDxWOUexjjVgyA();
        }
    }

    public static abstract class hoXrIDAFrSwfShk8da {
        public void IPyIQcaNa8aB7drBED(Canvas canvas, RecyclerView recyclerView) {
        }

        public void KYHag8HRDlnO3X9zmZ(Canvas canvas, RecyclerView recyclerView) {
        }

        public void TCyPEKSzIyweCN5yp1(Canvas canvas, RecyclerView recyclerView, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
            KYHag8HRDlnO3X9zmZ(canvas, recyclerView);
        }

        public void husNiw3snxdgZPAGJm(Rect rect, View view, RecyclerView recyclerView, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
            zZKhbgvUfsK4AEX3r0(rect, ((OANkd3mP6AYvwbNLJM) view.getLayoutParams()).lEeR5KfoEr4xU5yHH7(), recyclerView);
        }

        public void pbVGzGjWvY2LDXC8vo(Canvas canvas, RecyclerView recyclerView, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
            IPyIQcaNa8aB7drBED(canvas, recyclerView);
        }

        public void zZKhbgvUfsK4AEX3r0(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }
    }

    public class husNiw3snxdgZPAGJm implements s3fjYDxWOUexjjVgyA.InterfaceC0053s3fjYDxWOUexjjVgyA {
        public husNiw3snxdgZPAGJm() {
        }

        @Override // androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA.InterfaceC0053s3fjYDxWOUexjjVgyA
        public int Acstmh57AKoSEkEFNJ(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA.InterfaceC0053s3fjYDxWOUexjjVgyA
        public void HJFh0TGMpafqLE9haL(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.VItLRw50eXTZeEfGl0(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA.InterfaceC0053s3fjYDxWOUexjjVgyA
        public void IPyIQcaNa8aB7drBED(View view, int i, ViewGroup.LayoutParams layoutParams) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(view);
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null) {
                if (!oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.A49QRPHynYLCBN0SqP() && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W + RecyclerView.this.lLKzvdU99Iw80uVD5I());
                }
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.KYHag8HRDlnO3X9zmZ();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA.InterfaceC0053s3fjYDxWOUexjjVgyA
        public void KYHag8HRDlnO3X9zmZ(int i) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W;
            View viewLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(i);
            if (viewLEeR5KfoEr4xU5yHH7 != null && (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(viewLEeR5KfoEr4xU5yHH7)) != null) {
                if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.A49QRPHynYLCBN0SqP() && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W + RecyclerView.this.lLKzvdU99Iw80uVD5I());
                }
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.s3fjYDxWOUexjjVgyA(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA.InterfaceC0053s3fjYDxWOUexjjVgyA
        public void TCyPEKSzIyweCN5yp1(View view) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(view);
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null) {
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.OUd9THiLjZndMj0qdF(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA.InterfaceC0053s3fjYDxWOUexjjVgyA
        public int Z9WdNiOsPR0y54zHW4() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA.InterfaceC0053s3fjYDxWOUexjjVgyA
        public OUd9THiLjZndMj0qdF husNiw3snxdgZPAGJm(View view) {
            return RecyclerView.k0CbjZvfUz23r8IN6W(view);
        }

        @Override // androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA.InterfaceC0053s3fjYDxWOUexjjVgyA
        public View lEeR5KfoEr4xU5yHH7(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA.InterfaceC0053s3fjYDxWOUexjjVgyA
        public void pbVGzGjWvY2LDXC8vo(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.A49QRPHynYLCBN0SqP(view);
        }

        @Override // androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA.InterfaceC0053s3fjYDxWOUexjjVgyA
        public void s3fjYDxWOUexjjVgyA(View view) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(view);
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null) {
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.ao3wqKm5CXFuvC0q47(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA.InterfaceC0053s3fjYDxWOUexjjVgyA
        public void zZKhbgvUfsK4AEX3r0() {
            int iZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4();
            for (int i = 0; i < iZ9WdNiOsPR0y54zHW4; i++) {
                View viewLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(i);
                RecyclerView.this.VItLRw50eXTZeEfGl0(viewLEeR5KfoEr4xU5yHH7);
                viewLEeR5KfoEr4xU5yHH7.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements Runnable {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f4047R9SAhYMerGybF9OAjL || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f4095zaq8hOURtfwbcX17cG) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f4040LIMtzhnLwQyigzK0KO) {
                recyclerView2.f4091xHA29AmDt6y96AnB3t = true;
            } else {
                recyclerView2.R9SAhYMerGybF9OAjL();
            }
        }
    }

    public static abstract class pbVGzGjWvY2LDXC8vo {
    }

    public class s3fjYDxWOUexjjVgyA implements Runnable {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = RecyclerView.this.f4039KqgKJKIWne3kz1AdHk;
            if (e54j8uwnhwalqnixxm != null) {
                e54j8uwnhwalqnixxm.G7AC3DWIx9i9fdanjk();
            }
            RecyclerView.this.f4093zXY7dgnTfw9Pd9RXel = false;
        }
    }

    public interface sTkWmhpZ5b1ArQIw4K {
        void HJFh0TGMpafqLE9haL(boolean z);

        boolean lEeR5KfoEr4xU5yHH7(RecyclerView recyclerView, MotionEvent motionEvent);

        void s3fjYDxWOUexjjVgyA(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public interface xHA29AmDt6y96AnB3t {
    }

    public class zZKhbgvUfsK4AEX3r0 implements OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA {
        public zZKhbgvUfsK4AEX3r0() {
        }

        @Override // androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA
        public void HJFh0TGMpafqLE9haL(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2) {
            RecyclerView.this.f4087s3fjYDxWOUexjjVgyA.DfpieXfdYs58yZAiXY(oUd9THiLjZndMj0qdF);
            RecyclerView.this.T9PhQIpGRhE4yZDm1C(oUd9THiLjZndMj0qdF, s3fjydxwouexjjvgya, s3fjydxwouexjjvgya2);
        }

        @Override // androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA
        public void lEeR5KfoEr4xU5yHH7(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4048T9PhQIpGRhE4yZDm1C.FXtjrf53D5B1cLsLFG(oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7, recyclerView.f4087s3fjYDxWOUexjjVgyA);
        }

        @Override // androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA
        public void s3fjYDxWOUexjjVgyA(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2) {
            RecyclerView.this.Z9WdNiOsPR0y54zHW4(oUd9THiLjZndMj0qdF, s3fjydxwouexjjvgya, s3fjydxwouexjjvgya2);
        }

        @Override // androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA
        public void zZKhbgvUfsK4AEX3r0(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2) {
            oUd9THiLjZndMj0qdF.W3RZ2dTDKrKpS5Mxdk(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.f4043OUd9THiLjZndMj0qdF;
            e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = recyclerView.f4039KqgKJKIWne3kz1AdHk;
            if (z) {
                if (!e54j8uwnhwalqnixxm.s3fjYDxWOUexjjVgyA(oUd9THiLjZndMj0qdF, oUd9THiLjZndMj0qdF, s3fjydxwouexjjvgya, s3fjydxwouexjjvgya2)) {
                    return;
                }
            } else if (!e54j8uwnhwalqnixxm.zZKhbgvUfsK4AEX3r0(oUd9THiLjZndMj0qdF, s3fjydxwouexjjvgya, s3fjydxwouexjjvgya2)) {
                return;
            }
            RecyclerView.this.owCQzRKpGarpL4247z();
        }
    }

    public static abstract class zaq8hOURtfwbcX17cG {
        public abstract boolean lEeR5KfoEr4xU5yHH7(int i, int i2);
    }

    static {
        Class cls = Integer.TYPE;
        f4022f2zPq7MOnQrtOlZ1Zg = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4019HZ4bptRS9XIcK1CV95 = new HJFh0TGMpafqLE9haL();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bMSdooljgH14Jgudph.lEeR5KfoEr4xU5yHH7.f4700lEeR5KfoEr4xU5yHH7);
    }

    public static void Kh0uC90qEEhuLdpgB9(View view, Rect rect) {
        OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (OANkd3mP6AYvwbNLJM) view.getLayoutParams();
        Rect rect2 = oANkd3mP6AYvwbNLJM.f4110s3fjYDxWOUexjjVgyA;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).bottomMargin);
    }

    private W3RZ2dTDKrKpS5Mxdk.VItLRw50eXTZeEfGl0 getScrollingChildHelper() {
        if (this.f4029DFYiVi7zXozAjRciKa == null) {
            this.f4029DFYiVi7zXozAjRciKa = new W3RZ2dTDKrKpS5Mxdk.VItLRw50eXTZeEfGl0(this);
        }
        return this.f4029DFYiVi7zXozAjRciKa;
    }

    public static OUd9THiLjZndMj0qdF k0CbjZvfUz23r8IN6W(View view) {
        if (view == null) {
            return null;
        }
        return ((OANkd3mP6AYvwbNLJM) view.getLayoutParams()).f4109lEeR5KfoEr4xU5yHH7;
    }

    public static RecyclerView oocVJL811qFf0j0XXZ(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewOocVJL811qFf0j0XXZ = oocVJL811qFf0j0XXZ(viewGroup.getChildAt(i));
            if (recyclerViewOocVJL811qFf0j0XXZ != null) {
                return recyclerViewOocVJL811qFf0j0XXZ;
            }
        }
        return null;
    }

    public static void zaq8hOURtfwbcX17cG(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        WeakReference weakReference = oUd9THiLjZndMj0qdF.f4127s3fjYDxWOUexjjVgyA;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    if (view == oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    }
                }
                oUd9THiLjZndMj0qdF.f4127s3fjYDxWOUexjjVgyA = null;
                return;
            }
        }
    }

    public void A49QRPHynYLCBN0SqP(View view) {
        int size;
        OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(view);
        aRQ2M7vtRaPDEyvpdv(view);
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f4072e54J8UWNHWALQNixXM;
        if (tCyPEKSzIyweCN5yp1 != null && oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null) {
            tCyPEKSzIyweCN5yp1.hoXrIDAFrSwfShk8da(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
        }
        if (this.f4065ao3wqKm5CXFuvC0q47 == null || r2.size() - 1 < 0) {
            return;
        }
        androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this.f4065ao3wqKm5CXFuvC0q47.get(size));
        throw null;
    }

    public void Acstmh57AKoSEkEFNJ(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
        if (this.f4038Kh0uC90qEEhuLdpgB9 == null) {
            this.f4038Kh0uC90qEEhuLdpgB9 = new ArrayList();
        }
        this.f4038Kh0uC90qEEhuLdpgB9.add(y43RdunnpKgpbny0lE);
    }

    public void Bc5OTyAfOKVCQb8CEz() {
        aUn6Hqsqw2PVM8685Z(true);
    }

    public int CSih7GetOUab1dYQjM(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        if (oUd9THiLjZndMj0qdF.OANkd3mP6AYvwbNLJM(524) || !oUd9THiLjZndMj0qdF.Y43RdunnpKgpbny0lE()) {
            return -1;
        }
        return this.f4094zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm(oUd9THiLjZndMj0qdF.f4114HJFh0TGMpafqLE9haL);
    }

    public void DFYiVi7zXozAjRciKa() {
        this.f4094zZKhbgvUfsK4AEX3r0 = new androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7(new KYHag8HRDlnO3X9zmZ());
    }

    public final boolean DfpieXfdYs58yZAiXY(MotionEvent motionEvent) {
        sTkWmhpZ5b1ArQIw4K stkwmhpz5b1arqiw4k = this.f4042OANkd3mP6AYvwbNLJM;
        if (stkwmhpz5b1arqiw4k == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return zcy2NNbtVXgoGQbfuq(motionEvent);
        }
        stkwmhpz5b1arqiw4k.s3fjYDxWOUexjjVgyA(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f4042OANkd3mP6AYvwbNLJM = null;
        }
        return true;
    }

    public void Er40JrQbOM51vCQI8w(int i) {
        int iTCyPEKSzIyweCN5yp1 = this.f4078husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1();
        for (int i2 = 0; i2 < iTCyPEKSzIyweCN5yp1; i2++) {
            this.f4078husNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(i2).offsetTopAndBottom(i);
        }
    }

    public void EscIOBqRhG6irG5q11(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
        List list = this.f4038Kh0uC90qEEhuLdpgB9;
        if (list != null) {
            list.remove(y43RdunnpKgpbny0lE);
        }
    }

    public boolean FI7jQXEuEg1AdcOOw7(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        R9SAhYMerGybF9OAjL();
        if (this.f4072e54J8UWNHWALQNixXM != null) {
            int[] iArr = this.f4092xMfAHy6F7qK0zhxhKG;
            iArr[0] = 0;
            iArr[1] = 0;
            h6NrAcYSuIyiU1qV6F(i, i2, iArr);
            int[] iArr2 = this.f4092xMfAHy6F7qK0zhxhKG;
            int i7 = iArr2[0];
            int i8 = iArr2[1];
            i3 = i8;
            i4 = i7;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.f4077hoXrIDAFrSwfShk8da.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f4092xMfAHy6F7qK0zhxhKG;
        iArr3[0] = 0;
        iArr3[1] = 0;
        tXWeW0sqVddf7ZBflq(i4, i3, i5, i6, this.f4031FtYx4GXtxwA8al5hBy, 0, iArr3);
        int[] iArr4 = this.f4092xMfAHy6F7qK0zhxhKG;
        int i9 = iArr4[0];
        int i10 = i5 - i9;
        int i11 = iArr4[1];
        int i12 = i6 - i11;
        boolean z = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.f4041LU0fFDMACqnfIfA1AZ;
        int[] iArr5 = this.f4031FtYx4GXtxwA8al5hBy;
        int i14 = iArr5[0];
        this.f4041LU0fFDMACqnfIfA1AZ = i13 - i14;
        int i15 = this.f4096zcy2NNbtVXgoGQbfuq;
        int i16 = iArr5[1];
        this.f4096zcy2NNbtVXgoGQbfuq = i15 - i16;
        int[] iArr6 = this.f4066ayduHasC7VpxsVXE0T;
        iArr6[0] = iArr6[0] + i14;
        iArr6[1] = iArr6[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !W3RZ2dTDKrKpS5Mxdk.A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7(motionEvent, 8194)) {
                OWyIJu8lIXxQlvLhaC(motionEvent.getX(), i10, motionEvent.getY(), i12);
            }
            Y43RdunnpKgpbny0lE(i, i2);
        }
        if (i4 != 0 || i3 != 0) {
            OqIo5QF00RDxUQb4qq(i4, i3);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i4 == 0 && i3 == 0) ? false : true;
    }

    public void FXtjrf53D5B1cLsLFG() {
        setScrollState(0);
        dvmHGYHwlE2ean7ktb();
    }

    public void Fo9071MN8vwEWamAUX(int i) {
        int iTCyPEKSzIyweCN5yp1 = this.f4078husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1();
        for (int i2 = 0; i2 < iTCyPEKSzIyweCN5yp1; i2++) {
            this.f4078husNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(i2).offsetLeftAndRight(i);
        }
    }

    public final void FtYx4GXtxwA8al5hBy() {
        if (lLKzvdU99Iw80uVD5I.LIMtzhnLwQyigzK0KO(this) == 0) {
            lLKzvdU99Iw80uVD5I.yL2E9nlEZpg8ZZx8XE(this, 8);
        }
    }

    public final void G7AC3DWIx9i9fdanjk(Context context, String str, AttributeSet attributeSet, int i, int i2) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strCtWLFN70QQINH1kyYo = ctWLFN70QQINH1kyYo(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strCtWLFN70QQINH1kyYo, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(aPyGSIylzVNKPT1Bls.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f4022f2zPq7MOnQrtOlZ1Zg);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strCtWLFN70QQINH1kyYo, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((aPyGSIylzVNKPT1Bls) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strCtWLFN70QQINH1kyYo, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strCtWLFN70QQINH1kyYo, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strCtWLFN70QQINH1kyYo, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strCtWLFN70QQINH1kyYo, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strCtWLFN70QQINH1kyYo, e7);
            }
        }
    }

    public final void GeBgWLiG3rAOvStVF8(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, boolean z, boolean z2) {
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp12 = this.f4072e54J8UWNHWALQNixXM;
        if (tCyPEKSzIyweCN5yp12 != null) {
            tCyPEKSzIyweCN5yp12.Y43RdunnpKgpbny0lE(this.f4082lEeR5KfoEr4xU5yHH7);
            this.f4072e54J8UWNHWALQNixXM.e54J8UWNHWALQNixXM(this);
        }
        if (!z || z2) {
            e5tXAuLbtMC3XyEoX9();
        }
        this.f4094zZKhbgvUfsK4AEX3r0.G7AC3DWIx9i9fdanjk();
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp13 = this.f4072e54J8UWNHWALQNixXM;
        this.f4072e54J8UWNHWALQNixXM = tCyPEKSzIyweCN5yp1;
        if (tCyPEKSzIyweCN5yp1 != null) {
            tCyPEKSzIyweCN5yp1.zaq8hOURtfwbcX17cG(this.f4082lEeR5KfoEr4xU5yHH7);
            tCyPEKSzIyweCN5yp1.IPyIQcaNa8aB7drBED(this);
        }
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null) {
            apygsiylzvnkpt1bls.owCQzRKpGarpL4247z(tCyPEKSzIyweCN5yp13, this.f4072e54J8UWNHWALQNixXM);
        }
        this.f4087s3fjYDxWOUexjjVgyA.A49QRPHynYLCBN0SqP(tCyPEKSzIyweCN5yp13, this.f4072e54J8UWNHWALQNixXM, z);
        this.f4052Tu4WCh2gEwj8E4oHbP.f4161TCyPEKSzIyweCN5yp1 = true;
    }

    public void GyWRxpdt1T8mEJXPoD() {
        int i;
        for (int size = this.f4036Jsouc4ileb8SxQhxbX.size() - 1; size >= 0; size--) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = (OUd9THiLjZndMj0qdF) this.f4036Jsouc4ileb8SxQhxbX.get(size);
            if (oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.getParent() == this && !oUd9THiLjZndMj0qdF.DfpieXfdYs58yZAiXY() && (i = oUd9THiLjZndMj0qdF.f4130zaq8hOURtfwbcX17cG) != -1) {
                lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7, i);
                oUd9THiLjZndMj0qdF.f4130zaq8hOURtfwbcX17cG = -1;
            }
        }
        this.f4036Jsouc4ileb8SxQhxbX.clear();
    }

    public void HR5vAalpgOKVm2T0Gq(View view) {
    }

    public void HZ4bptRS9XIcK1CV95(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iAcstmh57AKoSEkEFNJ = this.f4078husNiw3snxdgZPAGJm.Acstmh57AKoSEkEFNJ();
        for (int i4 = 0; i4 < iAcstmh57AKoSEkEFNJ; i4++) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.pbVGzGjWvY2LDXC8vo(i4));
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY()) {
                int i5 = oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.f4114HJFh0TGMpafqLE9haL;
                if (i5 >= i3) {
                    oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.THTDvPxsHqMeGb512f(-i2, z);
                } else if (i5 >= i) {
                    oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.pbVGzGjWvY2LDXC8vo(i - 1, -i2, z);
                }
                this.f4052Tu4WCh2gEwj8E4oHbP.f4161TCyPEKSzIyweCN5yp1 = true;
            }
        }
        this.f4087s3fjYDxWOUexjjVgyA.LIMtzhnLwQyigzK0KO(i, i2, z);
        requestLayout();
    }

    public void IPyIQcaNa8aB7drBED(hoXrIDAFrSwfShk8da hoxridafrswfshk8da, int i) {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null) {
            apygsiylzvnkpt1bls.e54J8UWNHWALQNixXM("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4077hoXrIDAFrSwfShk8da.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f4077hoXrIDAFrSwfShk8da.add(hoxridafrswfshk8da);
        } else {
            this.f4077hoXrIDAFrSwfShk8da.add(i, hoxridafrswfshk8da);
        }
        iQCvttGuB7nx4r7kMP();
        requestLayout();
    }

    public boolean JXsqbvi9UKxeF3HXpU(View view) {
        R6kEk3zZuOluTikhN3();
        boolean zSTkWmhpZ5b1ArQIw4K = this.f4078husNiw3snxdgZPAGJm.sTkWmhpZ5b1ArQIw4K(view);
        if (zSTkWmhpZ5b1ArQIw4K) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(view);
            this.f4087s3fjYDxWOUexjjVgyA.DfpieXfdYs58yZAiXY(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
            this.f4087s3fjYDxWOUexjjVgyA.OUd9THiLjZndMj0qdF(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
        }
        gpnYwZkFpQwu7zi2gb(!zSTkWmhpZ5b1ArQIw4K);
        return zSTkWmhpZ5b1ArQIw4K;
    }

    public void Jsouc4ileb8SxQhxbX() {
        this.f4071e2F9F6h8YJxTHwLCa0 = null;
        this.f4033GyWRxpdt1T8mEJXPoD = null;
        this.f4030DfpieXfdYs58yZAiXY = null;
        this.f4044OqIo5QF00RDxUQb4qq = null;
    }

    public final void KYHag8HRDlnO3X9zmZ(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        View view = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7;
        boolean z = view.getParent() == this;
        this.f4087s3fjYDxWOUexjjVgyA.DfpieXfdYs58yZAiXY(Tu4WCh2gEwj8E4oHbP(view));
        if (oUd9THiLjZndMj0qdF.A49QRPHynYLCBN0SqP()) {
            this.f4078husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f4078husNiw3snxdgZPAGJm;
        if (z) {
            s3fjydxwouexjjvgya.Z9WdNiOsPR0y54zHW4(view);
        } else {
            s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA(view, true);
        }
    }

    public void KqgKJKIWne3kz1AdHk() {
        int measuredHeight;
        int measuredWidth;
        if (this.f4044OqIo5QF00RDxUQb4qq != null) {
            return;
        }
        EdgeEffect edgeEffectLEeR5KfoEr4xU5yHH7 = this.f4055W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7(this, 0);
        this.f4044OqIo5QF00RDxUQb4qq = edgeEffectLEeR5KfoEr4xU5yHH7;
        if (this.f4049TCyPEKSzIyweCN5yp1) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectLEeR5KfoEr4xU5yHH7.setSize(measuredHeight, measuredWidth);
    }

    public final void LFGi8lLul9XOP250o9() {
        VelocityTracker velocityTracker = this.f4083lLKzvdU99Iw80uVD5I;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        sKw6Jz5uGcQ479KwIW(0);
        d4ZdBAtGyjVWTQYsYn();
    }

    public final boolean LIMtzhnLwQyigzK0KO(int i, int i2) {
        YlLW4G6OV9TFyuw5ix(this.f4074evSiTWao80SbJUZk9E);
        int[] iArr = this.f4074evSiTWao80SbJUZk9E;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    public OUd9THiLjZndMj0qdF LU0fFDMACqnfIfA1AZ(View view) {
        View viewXdzLv4NdAtTYoEzVzB = XdzLv4NdAtTYoEzVzB(view);
        if (viewXdzLv4NdAtTYoEzVzB == null) {
            return null;
        }
        return Tu4WCh2gEwj8E4oHbP(viewXdzLv4NdAtTYoEzVzB);
    }

    public void MHebQjnRowM60e3HDn(int i) {
        if (this.f4040LIMtzhnLwQyigzK0KO) {
            return;
        }
        FXtjrf53D5B1cLsLFG();
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            apygsiylzvnkpt1bls.zQjb36M22TWHJmh54i(i);
            awakenScrollBars();
        }
    }

    public void O1furmptfI76BGfN0d(int i) {
        if (this.f4048T9PhQIpGRhE4yZDm1C == null) {
            return;
        }
        setScrollState(2);
        this.f4048T9PhQIpGRhE4yZDm1C.zQjb36M22TWHJmh54i(i);
        awakenScrollBars();
    }

    public final void OANkd3mP6AYvwbNLJM() {
        LFGi8lLul9XOP250o9();
        setScrollState(0);
    }

    public final void OUd9THiLjZndMj0qdF() {
        R6kEk3zZuOluTikhN3();
        pgB7Gmjz55y9NQYnAD();
        this.f4052Tu4WCh2gEwj8E4oHbP.lEeR5KfoEr4xU5yHH7(6);
        this.f4094zZKhbgvUfsK4AEX3r0.Acstmh57AKoSEkEFNJ();
        this.f4052Tu4WCh2gEwj8E4oHbP.f4158KYHag8HRDlnO3X9zmZ = this.f4072e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL();
        WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw = this.f4052Tu4WCh2gEwj8E4oHbP;
        wWC27LAMFqFFBzfbNw.f4170zZKhbgvUfsK4AEX3r0 = 0;
        wWC27LAMFqFFBzfbNw.f4157IPyIQcaNa8aB7drBED = false;
        this.f4048T9PhQIpGRhE4yZDm1C.FI7jQXEuEg1AdcOOw7(this.f4087s3fjYDxWOUexjjVgyA, wWC27LAMFqFFBzfbNw);
        WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw2 = this.f4052Tu4WCh2gEwj8E4oHbP;
        wWC27LAMFqFFBzfbNw2.f4161TCyPEKSzIyweCN5yp1 = false;
        this.f4034HJFh0TGMpafqLE9haL = null;
        wWC27LAMFqFFBzfbNw2.f4162Z9WdNiOsPR0y54zHW4 = wWC27LAMFqFFBzfbNw2.f4162Z9WdNiOsPR0y54zHW4 && this.f4039KqgKJKIWne3kz1AdHk != null;
        wWC27LAMFqFFBzfbNw2.f4166husNiw3snxdgZPAGJm = 4;
        Bc5OTyAfOKVCQb8CEz();
        gpnYwZkFpQwu7zi2gb(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OWyIJu8lIXxQlvLhaC(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.KqgKJKIWne3kz1AdHk()
            android.widget.EdgeEffect r1 = r6.f4044OqIo5QF00RDxUQb4qq
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
        L1c:
            PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(r1, r4, r9)
            r9 = r3
            goto L39
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L38
            r6.PPkm9uUfOJHHYveeLT()
            android.widget.EdgeEffect r1 = r6.f4030DfpieXfdYs58yZAiXY
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L53
            r6.aAp6BD79BhftLCnuvf()
            android.widget.EdgeEffect r9 = r6.f4033GyWRxpdt1T8mEJXPoD
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(r9, r1, r7)
            goto L6f
        L53:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L6e
            r6.e2F9F6h8YJxTHwLCa0()
            android.widget.EdgeEffect r9 = r6.f4071e2F9F6h8YJxTHwLCa0
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(r9, r1, r2)
            goto L6f
        L6e:
            r3 = r9
        L6f:
            if (r3 != 0) goto L79
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.osrHU7fvDp2EgxZPfM(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OWyIJu8lIXxQlvLhaC(float, float, float, float):void");
    }

    public void OqIo5QF00RDxUQb4qq(int i, int i2) {
        this.f4089tXWeW0sqVddf7ZBflq++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        i8aHOwH04efS6lZ3Oa(i, i2);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f4081k0CbjZvfUz23r8IN6W;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(this, i, i2);
        }
        List list = this.f4038Kh0uC90qEEhuLdpgB9;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((Y43RdunnpKgpbny0lE) this.f4038Kh0uC90qEEhuLdpgB9.get(size)).s3fjYDxWOUexjjVgyA(this, i, i2);
            }
        }
        this.f4089tXWeW0sqVddf7ZBflq--;
    }

    public final void PDw1hXOtArGjUqFgpT(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f4086pbVGzGjWvY2LDXC8vo.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof OANkd3mP6AYvwbNLJM) {
            OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (OANkd3mP6AYvwbNLJM) layoutParams;
            if (!oANkd3mP6AYvwbNLJM.f4108HJFh0TGMpafqLE9haL) {
                Rect rect = oANkd3mP6AYvwbNLJM.f4110s3fjYDxWOUexjjVgyA;
                Rect rect2 = this.f4086pbVGzGjWvY2LDXC8vo;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4086pbVGzGjWvY2LDXC8vo);
            offsetRectIntoDescendantCoords(view, this.f4086pbVGzGjWvY2LDXC8vo);
        }
        this.f4048T9PhQIpGRhE4yZDm1C.hUNDUI3oB5uci3ylnY(this, view, this.f4086pbVGzGjWvY2LDXC8vo, !this.f4047R9SAhYMerGybF9OAjL, view2 == null);
    }

    public void PPkm9uUfOJHHYveeLT() {
        int measuredHeight;
        int measuredWidth;
        if (this.f4030DfpieXfdYs58yZAiXY != null) {
            return;
        }
        EdgeEffect edgeEffectLEeR5KfoEr4xU5yHH7 = this.f4055W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7(this, 2);
        this.f4030DfpieXfdYs58yZAiXY = edgeEffectLEeR5KfoEr4xU5yHH7;
        if (this.f4049TCyPEKSzIyweCN5yp1) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectLEeR5KfoEr4xU5yHH7.setSize(measuredHeight, measuredWidth);
    }

    public final int Pum9NZyDBKoCnecvlx(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    public final void QW0Trt6m3nVBNaYFnP() {
        View viewFindViewById;
        if (!this.f4053Uj8rPa1EWADtk6Oe0S || this.f4072e54J8UWNHWALQNixXM == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f4021Ywqw2A0s86HeuFkDt0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f4078husNiw3snxdgZPAGJm.hoXrIDAFrSwfShk8da(focusedChild)) {
                    return;
                }
            } else if (this.f4078husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1() == 0) {
                requestFocus();
                return;
            }
        }
        View viewUdcVtCzLTM1Loe9KrX = null;
        OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFHUNBy66ZO1wVLJGW3l = (this.f4052Tu4WCh2gEwj8E4oHbP.f4165hoXrIDAFrSwfShk8da == -1 || !this.f4072e54J8UWNHWALQNixXM.TCyPEKSzIyweCN5yp1()) ? null : hUNBy66ZO1wVLJGW3l(this.f4052Tu4WCh2gEwj8E4oHbP.f4165hoXrIDAFrSwfShk8da);
        if (oUd9THiLjZndMj0qdFHUNBy66ZO1wVLJGW3l != null && !this.f4078husNiw3snxdgZPAGJm.hoXrIDAFrSwfShk8da(oUd9THiLjZndMj0qdFHUNBy66ZO1wVLJGW3l.f4125lEeR5KfoEr4xU5yHH7) && oUd9THiLjZndMj0qdFHUNBy66ZO1wVLJGW3l.f4125lEeR5KfoEr4xU5yHH7.hasFocusable()) {
            viewUdcVtCzLTM1Loe9KrX = oUd9THiLjZndMj0qdFHUNBy66ZO1wVLJGW3l.f4125lEeR5KfoEr4xU5yHH7;
        } else if (this.f4078husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1() > 0) {
            viewUdcVtCzLTM1Loe9KrX = udcVtCzLTM1Loe9KrX();
        }
        if (viewUdcVtCzLTM1Loe9KrX != null) {
            int i = this.f4052Tu4WCh2gEwj8E4oHbP.f4163aPyGSIylzVNKPT1Bls;
            if (i != -1 && (viewFindViewById = viewUdcVtCzLTM1Loe9KrX.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewUdcVtCzLTM1Loe9KrX = viewFindViewById;
            }
            viewUdcVtCzLTM1Loe9KrX.requestFocus();
        }
    }

    public void R6kEk3zZuOluTikhN3() {
        int i = this.f4032G7AC3DWIx9i9fdanjk + 1;
        this.f4032G7AC3DWIx9i9fdanjk = i;
        if (i != 1 || this.f4040LIMtzhnLwQyigzK0KO) {
            return;
        }
        this.f4091xHA29AmDt6y96AnB3t = false;
    }

    public void R9SAhYMerGybF9OAjL() {
        if (!this.f4047R9SAhYMerGybF9OAjL || this.f4043OUd9THiLjZndMj0qdF) {
            OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7("RV FullInvalidate");
            THTDvPxsHqMeGb512f();
            OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
            return;
        }
        if (this.f4094zZKhbgvUfsK4AEX3r0.OANkd3mP6AYvwbNLJM()) {
            if (this.f4094zZKhbgvUfsK4AEX3r0.aPyGSIylzVNKPT1Bls(4) && !this.f4094zZKhbgvUfsK4AEX3r0.aPyGSIylzVNKPT1Bls(11)) {
                OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7("RV PartialInvalidate");
                R6kEk3zZuOluTikhN3();
                pgB7Gmjz55y9NQYnAD();
                this.f4094zZKhbgvUfsK4AEX3r0.Y43RdunnpKgpbny0lE();
                if (!this.f4091xHA29AmDt6y96AnB3t) {
                    if (evSiTWao80SbJUZk9E()) {
                        THTDvPxsHqMeGb512f();
                    } else {
                        this.f4094zZKhbgvUfsK4AEX3r0.pbVGzGjWvY2LDXC8vo();
                    }
                }
                gpnYwZkFpQwu7zi2gb(true);
                Bc5OTyAfOKVCQb8CEz();
            } else {
                if (!this.f4094zZKhbgvUfsK4AEX3r0.OANkd3mP6AYvwbNLJM()) {
                    return;
                }
                OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7("RV FullInvalidate");
                THTDvPxsHqMeGb512f();
            }
            OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
        }
    }

    public void T9PhQIpGRhE4yZDm1C(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2) {
        KYHag8HRDlnO3X9zmZ(oUd9THiLjZndMj0qdF);
        oUd9THiLjZndMj0qdF.W3RZ2dTDKrKpS5Mxdk(false);
        if (this.f4039KqgKJKIWne3kz1AdHk.HJFh0TGMpafqLE9haL(oUd9THiLjZndMj0qdF, s3fjydxwouexjjvgya, s3fjydxwouexjjvgya2)) {
            owCQzRKpGarpL4247z();
        }
    }

    public void TCyPEKSzIyweCN5yp1(hoXrIDAFrSwfShk8da hoxridafrswfshk8da) {
        IPyIQcaNa8aB7drBED(hoxridafrswfshk8da, -1);
    }

    public void THTDvPxsHqMeGb512f() {
        String str;
        if (this.f4072e54J8UWNHWALQNixXM == null) {
            str = "No adapter attached; skipping layout";
        } else {
            if (this.f4048T9PhQIpGRhE4yZDm1C != null) {
                WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw = this.f4052Tu4WCh2gEwj8E4oHbP;
                wWC27LAMFqFFBzfbNw.f4155Acstmh57AKoSEkEFNJ = false;
                if (wWC27LAMFqFFBzfbNw.f4166husNiw3snxdgZPAGJm != 1) {
                    if (!this.f4094zZKhbgvUfsK4AEX3r0.zaq8hOURtfwbcX17cG() && this.f4048T9PhQIpGRhE4yZDm1C.O1furmptfI76BGfN0d() == getWidth() && this.f4048T9PhQIpGRhE4yZDm1C.osrHU7fvDp2EgxZPfM() == getHeight()) {
                        this.f4048T9PhQIpGRhE4yZDm1C.xt9LcS8xZRgoStfDrh(this);
                    }
                    jCtUeU2YI1poCxWcjm();
                    return;
                }
                ao3wqKm5CXFuvC0q47();
                this.f4048T9PhQIpGRhE4yZDm1C.xt9LcS8xZRgoStfDrh(this);
                OUd9THiLjZndMj0qdF();
                jCtUeU2YI1poCxWcjm();
                return;
            }
            str = "No layout manager attached; skipping layout";
        }
        Log.e("RecyclerView", str);
    }

    public final void ToH8yzk8U1nKT0PUfY(WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (getScrollState() != 2) {
            wWC27LAMFqFFBzfbNw.f4159OANkd3mP6AYvwbNLJM = 0;
            wWC27LAMFqFFBzfbNw.f4171zaq8hOURtfwbcX17cG = 0;
        } else {
            OverScroller overScroller = this.f4028CSih7GetOUab1dYQjM.f4196HJFh0TGMpafqLE9haL;
            wWC27LAMFqFFBzfbNw.f4159OANkd3mP6AYvwbNLJM = overScroller.getFinalX() - overScroller.getCurrX();
            wWC27LAMFqFFBzfbNw.f4171zaq8hOURtfwbcX17cG = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public OUd9THiLjZndMj0qdF Tu4WCh2gEwj8E4oHbP(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return k0CbjZvfUz23r8IN6W(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean Uj8rPa1EWADtk6Oe0S(int i, int i2) {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f4040LIMtzhnLwQyigzK0KO) {
            return false;
        }
        int iOANkd3mP6AYvwbNLJM = apygsiylzvnkpt1bls.OANkd3mP6AYvwbNLJM();
        boolean zZaq8hOURtfwbcX17cG = this.f4048T9PhQIpGRhE4yZDm1C.zaq8hOURtfwbcX17cG();
        if (iOANkd3mP6AYvwbNLJM == 0 || Math.abs(i) < this.f4090udcVtCzLTM1Loe9KrX) {
            i = 0;
        }
        if (!zZaq8hOURtfwbcX17cG || Math.abs(i2) < this.f4090udcVtCzLTM1Loe9KrX) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = i;
        float f2 = i2;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iOANkd3mP6AYvwbNLJM != 0 || zZaq8hOURtfwbcX17cG;
            dispatchNestedFling(f, f2, z);
            zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg = this.f4084oocVJL811qFf0j0XXZ;
            if (zaq8hourtfwbcx17cg != null && zaq8hourtfwbcx17cg.lEeR5KfoEr4xU5yHH7(i, i2)) {
                return true;
            }
            if (z) {
                if (zZaq8hOURtfwbcX17cG) {
                    iOANkd3mP6AYvwbNLJM = (iOANkd3mP6AYvwbNLJM == true ? 1 : 0) | 2;
                }
                auvQiDfBN48eRz3fFq(iOANkd3mP6AYvwbNLJM, 1);
                int i3 = this.f4069cT5Hs3CQpLK8NvlZAw;
                int iMax = Math.max(-i3, Math.min(i, i3));
                int i4 = this.f4069cT5Hs3CQpLK8NvlZAw;
                this.f4028CSih7GetOUab1dYQjM.HJFh0TGMpafqLE9haL(iMax, Math.max(-i4, Math.min(i2, i4)));
                return true;
            }
        }
        return false;
    }

    public void VItLRw50eXTZeEfGl0(View view) {
        int size;
        OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(view);
        HR5vAalpgOKVm2T0Gq(view);
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f4072e54J8UWNHWALQNixXM;
        if (tCyPEKSzIyweCN5yp1 != null && oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null) {
            tCyPEKSzIyweCN5yp1.aPyGSIylzVNKPT1Bls(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
        }
        if (this.f4065ao3wqKm5CXFuvC0q47 == null || r2.size() - 1 < 0) {
            return;
        }
        androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this.f4065ao3wqKm5CXFuvC0q47.get(size));
        throw null;
    }

    public void W3RZ2dTDKrKpS5Mxdk(int i) {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null) {
            apygsiylzvnkpt1bls.hgxXdWVkE1CPHCTwpz(i);
        }
        vlBaBOcZ1q1ndWVoXn(i);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f4081k0CbjZvfUz23r8IN6W;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.lEeR5KfoEr4xU5yHH7(this, i);
        }
        List list = this.f4038Kh0uC90qEEhuLdpgB9;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((Y43RdunnpKgpbny0lE) this.f4038Kh0uC90qEEhuLdpgB9.get(size)).lEeR5KfoEr4xU5yHH7(this, i);
            }
        }
    }

    public final void WWC27LAMFqFFBzfbNw() {
        int i = this.f4054VItLRw50eXTZeEfGl0;
        this.f4054VItLRw50eXTZeEfGl0 = 0;
        if (i == 0 || !fLSSbwbzFBVpwBH5FM()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        OqIo5QF00RDxUQb4qq.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(accessibilityEventObtain, i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public boolean WaWv1mJ1ya3uoEaKqz(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, int i) {
        if (!bBVlTkqEpHW053CjWL()) {
            lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7, i);
            return true;
        }
        oUd9THiLjZndMj0qdF.f4130zaq8hOURtfwbcX17cG = i;
        this.f4036Jsouc4ileb8SxQhxbX.add(oUd9THiLjZndMj0qdF);
        return false;
    }

    public View XdzLv4NdAtTYoEzVzB(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public boolean XzJ1BS7H9Ilbkv4eVM(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().zZKhbgvUfsK4AEX3r0(i, i2, iArr, iArr2, i3);
    }

    public void Y43RdunnpKgpbny0lE(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f4044OqIo5QF00RDxUQb4qq;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f4044OqIo5QF00RDxUQb4qq.onRelease();
            zIsFinished = this.f4044OqIo5QF00RDxUQb4qq.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4030DfpieXfdYs58yZAiXY;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f4030DfpieXfdYs58yZAiXY.onRelease();
            zIsFinished |= this.f4030DfpieXfdYs58yZAiXY.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4033GyWRxpdt1T8mEJXPoD;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f4033GyWRxpdt1T8mEJXPoD.onRelease();
            zIsFinished |= this.f4033GyWRxpdt1T8mEJXPoD.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4071e2F9F6h8YJxTHwLCa0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f4071e2F9F6h8YJxTHwLCa0.onRelease();
            zIsFinished |= this.f4071e2F9F6h8YJxTHwLCa0.isFinished();
        }
        if (zIsFinished) {
            lLKzvdU99Iw80uVD5I.osrHU7fvDp2EgxZPfM(this);
        }
    }

    public boolean YIIWDMF3jHAs3E0PkN(AccessibilityEvent accessibilityEvent) {
        if (!bBVlTkqEpHW053CjWL()) {
            return false;
        }
        int iLEeR5KfoEr4xU5yHH7 = accessibilityEvent != null ? OqIo5QF00RDxUQb4qq.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(accessibilityEvent) : 0;
        this.f4054VItLRw50eXTZeEfGl0 |= iLEeR5KfoEr4xU5yHH7 != 0 ? iLEeR5KfoEr4xU5yHH7 : 0;
        return true;
    }

    public final void YlLW4G6OV9TFyuw5ix(int[] iArr) {
        int iTCyPEKSzIyweCN5yp1 = this.f4078husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1();
        if (iTCyPEKSzIyweCN5yp1 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iTCyPEKSzIyweCN5yp1; i3++) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(i3));
            if (!oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY()) {
                int iT9PhQIpGRhE4yZDm1C = oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.T9PhQIpGRhE4yZDm1C();
                if (iT9PhQIpGRhE4yZDm1C < i) {
                    i = iT9PhQIpGRhE4yZDm1C;
                }
                if (iT9PhQIpGRhE4yZDm1C > i2) {
                    i2 = iT9PhQIpGRhE4yZDm1C;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void Ywqw2A0s86HeuFkDt0(int i, int i2) {
        int iAcstmh57AKoSEkEFNJ = this.f4078husNiw3snxdgZPAGJm.Acstmh57AKoSEkEFNJ();
        for (int i3 = 0; i3 < iAcstmh57AKoSEkEFNJ; i3++) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.pbVGzGjWvY2LDXC8vo(i3));
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY() && oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.f4114HJFh0TGMpafqLE9haL >= i) {
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.THTDvPxsHqMeGb512f(i2, false);
                this.f4052Tu4WCh2gEwj8E4oHbP.f4161TCyPEKSzIyweCN5yp1 = true;
            }
        }
        this.f4087s3fjYDxWOUexjjVgyA.G7AC3DWIx9i9fdanjk(i, i2);
        requestLayout();
    }

    public void Z9WdNiOsPR0y54zHW4(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2) {
        oUd9THiLjZndMj0qdF.W3RZ2dTDKrKpS5Mxdk(false);
        if (this.f4039KqgKJKIWne3kz1AdHk.lEeR5KfoEr4xU5yHH7(oUd9THiLjZndMj0qdF, s3fjydxwouexjjvgya, s3fjydxwouexjjvgya2)) {
            owCQzRKpGarpL4247z();
        }
    }

    public int ZJNyOIPL0usMs2xSAn(View view) {
        OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(view);
        if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null) {
            return oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.T9PhQIpGRhE4yZDm1C();
        }
        return -1;
    }

    public void aAp6BD79BhftLCnuvf() {
        int measuredWidth;
        int measuredHeight;
        if (this.f4033GyWRxpdt1T8mEJXPoD != null) {
            return;
        }
        EdgeEffect edgeEffectLEeR5KfoEr4xU5yHH7 = this.f4055W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7(this, 1);
        this.f4033GyWRxpdt1T8mEJXPoD = edgeEffectLEeR5KfoEr4xU5yHH7;
        if (this.f4049TCyPEKSzIyweCN5yp1) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectLEeR5KfoEr4xU5yHH7.setSize(measuredWidth, measuredHeight);
    }

    public boolean aPyGSIylzVNKPT1Bls(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f4039KqgKJKIWne3kz1AdHk;
        return e54j8uwnhwalqnixxm == null || e54j8uwnhwalqnixxm.TCyPEKSzIyweCN5yp1(oUd9THiLjZndMj0qdF, oUd9THiLjZndMj0qdF.aPyGSIylzVNKPT1Bls());
    }

    public void aRQ2M7vtRaPDEyvpdv(View view) {
    }

    public void aUn6Hqsqw2PVM8685Z(boolean z) {
        int i = this.f4058XzJ1BS7H9Ilbkv4eVM - 1;
        this.f4058XzJ1BS7H9Ilbkv4eVM = i;
        if (i < 1) {
            this.f4058XzJ1BS7H9Ilbkv4eVM = 0;
            if (z) {
                WWC27LAMFqFFBzfbNw();
                GyWRxpdt1T8mEJXPoD();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls == null || !apygsiylzvnkpt1bls.uAIIhSQWhOmxUb3Bqo(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public final void ao3wqKm5CXFuvC0q47() {
        this.f4052Tu4WCh2gEwj8E4oHbP.lEeR5KfoEr4xU5yHH7(1);
        ToH8yzk8U1nKT0PUfY(this.f4052Tu4WCh2gEwj8E4oHbP);
        this.f4052Tu4WCh2gEwj8E4oHbP.f4155Acstmh57AKoSEkEFNJ = false;
        R6kEk3zZuOluTikhN3();
        this.f4037KYHag8HRDlnO3X9zmZ.KYHag8HRDlnO3X9zmZ();
        pgB7Gmjz55y9NQYnAD();
        oXIAAdret8ERrYfuyf();
        vExXQwwMm8C1aKdGdj();
        WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw = this.f4052Tu4WCh2gEwj8E4oHbP;
        wWC27LAMFqFFBzfbNw.f4168pbVGzGjWvY2LDXC8vo = wWC27LAMFqFFBzfbNw.f4162Z9WdNiOsPR0y54zHW4 && this.f4070ctWLFN70QQINH1kyYo;
        this.f4070ctWLFN70QQINH1kyYo = false;
        this.f4046Pum9NZyDBKoCnecvlx = false;
        wWC27LAMFqFFBzfbNw.f4157IPyIQcaNa8aB7drBED = wWC27LAMFqFFBzfbNw.f4164e54J8UWNHWALQNixXM;
        wWC27LAMFqFFBzfbNw.f4158KYHag8HRDlnO3X9zmZ = this.f4072e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL();
        YlLW4G6OV9TFyuw5ix(this.f4074evSiTWao80SbJUZk9E);
        if (this.f4052Tu4WCh2gEwj8E4oHbP.f4162Z9WdNiOsPR0y54zHW4) {
            int iTCyPEKSzIyweCN5yp1 = this.f4078husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1();
            for (int i = 0; i < iTCyPEKSzIyweCN5yp1; i++) {
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(i));
                if (!oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY() && (!oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.R9SAhYMerGybF9OAjL() || this.f4072e54J8UWNHWALQNixXM.TCyPEKSzIyweCN5yp1())) {
                    this.f4037KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W, this.f4039KqgKJKIWne3kz1AdHk.R9SAhYMerGybF9OAjL(this.f4052Tu4WCh2gEwj8E4oHbP, oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W, e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W), oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.aPyGSIylzVNKPT1Bls()));
                    if (this.f4052Tu4WCh2gEwj8E4oHbP.f4168pbVGzGjWvY2LDXC8vo && oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.VItLRw50eXTZeEfGl0() && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.xHA29AmDt6y96AnB3t() && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY() && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.R9SAhYMerGybF9OAjL()) {
                        this.f4037KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(osrHU7fvDp2EgxZPfM(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W), oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W);
                    }
                }
            }
        }
        if (this.f4052Tu4WCh2gEwj8E4oHbP.f4164e54J8UWNHWALQNixXM) {
            cr99CPXhoiknALiHbq();
            WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw2 = this.f4052Tu4WCh2gEwj8E4oHbP;
            boolean z = wWC27LAMFqFFBzfbNw2.f4161TCyPEKSzIyweCN5yp1;
            wWC27LAMFqFFBzfbNw2.f4161TCyPEKSzIyweCN5yp1 = false;
            this.f4048T9PhQIpGRhE4yZDm1C.FI7jQXEuEg1AdcOOw7(this.f4087s3fjYDxWOUexjjVgyA, wWC27LAMFqFFBzfbNw2);
            this.f4052Tu4WCh2gEwj8E4oHbP.f4161TCyPEKSzIyweCN5yp1 = z;
            for (int i2 = 0; i2 < this.f4078husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1(); i2++) {
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W2 = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(i2));
                if (!oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W2.DfpieXfdYs58yZAiXY() && !this.f4037KYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W2)) {
                    int iHusNiw3snxdgZPAGJm = e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W2);
                    boolean zOANkd3mP6AYvwbNLJM = oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W2.OANkd3mP6AYvwbNLJM(8192);
                    if (!zOANkd3mP6AYvwbNLJM) {
                        iHusNiw3snxdgZPAGJm |= 4096;
                    }
                    e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaR9SAhYMerGybF9OAjL = this.f4039KqgKJKIWne3kz1AdHk.R9SAhYMerGybF9OAjL(this.f4052Tu4WCh2gEwj8E4oHbP, oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W2, iHusNiw3snxdgZPAGJm, oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W2.aPyGSIylzVNKPT1Bls());
                    if (zOANkd3mP6AYvwbNLJM) {
                        oOMFI1Dcqcg1BSVNty(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W2, s3fjydxwouexjjvgyaR9SAhYMerGybF9OAjL);
                    } else {
                        this.f4037KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W2, s3fjydxwouexjjvgyaR9SAhYMerGybF9OAjL);
                    }
                }
            }
        }
        sTkWmhpZ5b1ArQIw4K();
        Bc5OTyAfOKVCQb8CEz();
        gpnYwZkFpQwu7zi2gb(false);
        this.f4052Tu4WCh2gEwj8E4oHbP.f4166husNiw3snxdgZPAGJm = 2;
    }

    public boolean auvQiDfBN48eRz3fFq(int i, int i2) {
        return getScrollingChildHelper().OANkd3mP6AYvwbNLJM(i, i2);
    }

    public void ayaSAlBnO403UB0TMR(int i) {
        if (this.f4040LIMtzhnLwQyigzK0KO) {
            return;
        }
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            apygsiylzvnkpt1bls.Tn7MuV14fPMb1UrB5h(this, this.f4052Tu4WCh2gEwj8E4oHbP, i);
        }
    }

    public final void ayduHasC7VpxsVXE0T() {
        this.f4078husNiw3snxdgZPAGJm = new androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA(new husNiw3snxdgZPAGJm());
    }

    public boolean bBVlTkqEpHW053CjWL() {
        return this.f4058XzJ1BS7H9Ilbkv4eVM > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.OUd9THiLjZndMj0qdF bMSdooljgH14Jgudph(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA r0 = r5.f4078husNiw3snxdgZPAGJm
            int r0 = r0.Acstmh57AKoSEkEFNJ()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA r3 = r5.f4078husNiw3snxdgZPAGJm
            android.view.View r3 = r3.pbVGzGjWvY2LDXC8vo(r2)
            androidx.recyclerview.widget.RecyclerView$OUd9THiLjZndMj0qdF r3 = k0CbjZvfUz23r8IN6W(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.xHA29AmDt6y96AnB3t()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f4114HJFh0TGMpafqLE9haL
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.T9PhQIpGRhE4yZDm1C()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA r1 = r5.f4078husNiw3snxdgZPAGJm
            android.view.View r4 = r3.f4125lEeR5KfoEr4xU5yHH7
            boolean r1 = r1.hoXrIDAFrSwfShk8da(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.bMSdooljgH14Jgudph(int, boolean):androidx.recyclerview.widget.RecyclerView$OUd9THiLjZndMj0qdF");
    }

    public OUd9THiLjZndMj0qdF cT5Hs3CQpLK8NvlZAw(int i) {
        OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = null;
        if (this.f4043OUd9THiLjZndMj0qdF) {
            return null;
        }
        int iAcstmh57AKoSEkEFNJ = this.f4078husNiw3snxdgZPAGJm.Acstmh57AKoSEkEFNJ();
        for (int i2 = 0; i2 < iAcstmh57AKoSEkEFNJ; i2++) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.pbVGzGjWvY2LDXC8vo(i2));
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.xHA29AmDt6y96AnB3t() && CSih7GetOUab1dYQjM(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W) == i) {
                if (!this.f4078husNiw3snxdgZPAGJm.hoXrIDAFrSwfShk8da(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.f4125lEeR5KfoEr4xU5yHH7)) {
                    return oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W;
                }
                oUd9THiLjZndMj0qdF = oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W;
            }
        }
        return oUd9THiLjZndMj0qdF;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof OANkd3mP6AYvwbNLJM) && this.f4048T9PhQIpGRhE4yZDm1C.sTkWmhpZ5b1ArQIw4K((OANkd3mP6AYvwbNLJM) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null && apygsiylzvnkpt1bls.OANkd3mP6AYvwbNLJM()) {
            return this.f4048T9PhQIpGRhE4yZDm1C.xHA29AmDt6y96AnB3t(this.f4052Tu4WCh2gEwj8E4oHbP);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null && apygsiylzvnkpt1bls.OANkd3mP6AYvwbNLJM()) {
            return this.f4048T9PhQIpGRhE4yZDm1C.LIMtzhnLwQyigzK0KO(this.f4052Tu4WCh2gEwj8E4oHbP);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null && apygsiylzvnkpt1bls.OANkd3mP6AYvwbNLJM()) {
            return this.f4048T9PhQIpGRhE4yZDm1C.A49QRPHynYLCBN0SqP(this.f4052Tu4WCh2gEwj8E4oHbP);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null && apygsiylzvnkpt1bls.zaq8hOURtfwbcX17cG()) {
            return this.f4048T9PhQIpGRhE4yZDm1C.VItLRw50eXTZeEfGl0(this.f4052Tu4WCh2gEwj8E4oHbP);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null && apygsiylzvnkpt1bls.zaq8hOURtfwbcX17cG()) {
            return this.f4048T9PhQIpGRhE4yZDm1C.WWC27LAMFqFFBzfbNw(this.f4052Tu4WCh2gEwj8E4oHbP);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null && apygsiylzvnkpt1bls.zaq8hOURtfwbcX17cG()) {
            return this.f4048T9PhQIpGRhE4yZDm1C.THTDvPxsHqMeGb512f(this.f4052Tu4WCh2gEwj8E4oHbP);
        }
        return 0;
    }

    public void cr99CPXhoiknALiHbq() {
        int iAcstmh57AKoSEkEFNJ = this.f4078husNiw3snxdgZPAGJm.Acstmh57AKoSEkEFNJ();
        for (int i = 0; i < iAcstmh57AKoSEkEFNJ; i++) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.pbVGzGjWvY2LDXC8vo(i));
            if (!oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY()) {
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.XzJ1BS7H9Ilbkv4eVM();
            }
        }
    }

    public final String ctWLFN70QQINH1kyYo(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public final void d4ZdBAtGyjVWTQYsYn() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f4044OqIo5QF00RDxUQb4qq;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f4044OqIo5QF00RDxUQb4qq.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f4033GyWRxpdt1T8mEJXPoD;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f4033GyWRxpdt1T8mEJXPoD.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4030DfpieXfdYs58yZAiXY;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f4030DfpieXfdYs58yZAiXY.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4071e2F9F6h8YJxTHwLCa0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f4071e2F9F6h8YJxTHwLCa0.isFinished();
        }
        if (zIsFinished) {
            lLKzvdU99Iw80uVD5I.osrHU7fvDp2EgxZPfM(this);
        }
    }

    public void dCumDqZdWZ8NLrsgb7(int i, int i2, Interpolator interpolator, int i3) {
        lBAL39rPf03qYLFNNP(i, i2, interpolator, i3, false);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().lEeR5KfoEr4xU5yHH7(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().s3fjYDxWOUexjjVgyA(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().HJFh0TGMpafqLE9haL(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().KYHag8HRDlnO3X9zmZ(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        float paddingRight;
        int paddingBottom;
        super.draw(canvas);
        int size = this.f4077hoXrIDAFrSwfShk8da.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((hoXrIDAFrSwfShk8da) this.f4077hoXrIDAFrSwfShk8da.get(i)).pbVGzGjWvY2LDXC8vo(canvas, this, this.f4052Tu4WCh2gEwj8E4oHbP);
        }
        EdgeEffect edgeEffect = this.f4044OqIo5QF00RDxUQb4qq;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.f4049TCyPEKSzIyweCN5yp1 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.f4044OqIo5QF00RDxUQb4qq;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f4033GyWRxpdt1T8mEJXPoD;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f4049TCyPEKSzIyweCN5yp1) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4033GyWRxpdt1T8mEJXPoD;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f4030DfpieXfdYs58yZAiXY;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4049TCyPEKSzIyweCN5yp1 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4030DfpieXfdYs58yZAiXY;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f4071e2F9F6h8YJxTHwLCa0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4049TCyPEKSzIyweCN5yp1) {
                paddingRight = (-getWidth()) + getPaddingRight();
                paddingBottom = (-getHeight()) + getPaddingBottom();
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.f4071e2F9F6h8YJxTHwLCa0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f4039KqgKJKIWne3kz1AdHk == null || this.f4077hoXrIDAFrSwfShk8da.size() <= 0 || !this.f4039KqgKJKIWne3kz1AdHk.OANkd3mP6AYvwbNLJM()) ? z : true) {
            lLKzvdU99Iw80uVD5I.osrHU7fvDp2EgxZPfM(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void dvmHGYHwlE2ean7ktb() {
        this.f4028CSih7GetOUab1dYQjM.TCyPEKSzIyweCN5yp1();
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null) {
            apygsiylzvnkpt1bls.X3sgW3wH5gs9BRlOWB();
        }
    }

    public void e2F9F6h8YJxTHwLCa0() {
        int measuredWidth;
        int measuredHeight;
        if (this.f4071e2F9F6h8YJxTHwLCa0 != null) {
            return;
        }
        EdgeEffect edgeEffectLEeR5KfoEr4xU5yHH7 = this.f4055W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7(this, 3);
        this.f4071e2F9F6h8YJxTHwLCa0 = edgeEffectLEeR5KfoEr4xU5yHH7;
        if (this.f4049TCyPEKSzIyweCN5yp1) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectLEeR5KfoEr4xU5yHH7.setSize(measuredWidth, measuredHeight);
    }

    public final void e54J8UWNHWALQNixXM(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF2, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2, boolean z, boolean z2) {
        oUd9THiLjZndMj0qdF.W3RZ2dTDKrKpS5Mxdk(false);
        if (z) {
            KYHag8HRDlnO3X9zmZ(oUd9THiLjZndMj0qdF);
        }
        if (oUd9THiLjZndMj0qdF != oUd9THiLjZndMj0qdF2) {
            if (z2) {
                KYHag8HRDlnO3X9zmZ(oUd9THiLjZndMj0qdF2);
            }
            oUd9THiLjZndMj0qdF.f4115IPyIQcaNa8aB7drBED = oUd9THiLjZndMj0qdF2;
            KYHag8HRDlnO3X9zmZ(oUd9THiLjZndMj0qdF);
            this.f4087s3fjYDxWOUexjjVgyA.DfpieXfdYs58yZAiXY(oUd9THiLjZndMj0qdF);
            oUd9THiLjZndMj0qdF2.W3RZ2dTDKrKpS5Mxdk(false);
            oUd9THiLjZndMj0qdF2.f4126pbVGzGjWvY2LDXC8vo = oUd9THiLjZndMj0qdF;
        }
        if (this.f4039KqgKJKIWne3kz1AdHk.s3fjYDxWOUexjjVgyA(oUd9THiLjZndMj0qdF, oUd9THiLjZndMj0qdF2, s3fjydxwouexjjvgya, s3fjydxwouexjjvgya2)) {
            owCQzRKpGarpL4247z();
        }
    }

    public void e5tXAuLbtMC3XyEoX9() {
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f4039KqgKJKIWne3kz1AdHk;
        if (e54j8uwnhwalqnixxm != null) {
            e54j8uwnhwalqnixxm.Z9WdNiOsPR0y54zHW4();
        }
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null) {
            apygsiylzvnkpt1bls.gpnYwZkFpQwu7zi2gb(this.f4087s3fjYDxWOUexjjVgyA);
            this.f4048T9PhQIpGRhE4yZDm1C.sKw6Jz5uGcQ479KwIW(this.f4087s3fjYDxWOUexjjVgyA);
        }
        this.f4087s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL();
    }

    public boolean eWK41qw3g36LVd4UnS() {
        return !this.f4047R9SAhYMerGybF9OAjL || this.f4043OUd9THiLjZndMj0qdF || this.f4094zZKhbgvUfsK4AEX3r0.OANkd3mP6AYvwbNLJM();
    }

    public final boolean evSiTWao80SbJUZk9E() {
        int iTCyPEKSzIyweCN5yp1 = this.f4078husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1();
        for (int i = 0; i < iTCyPEKSzIyweCN5yp1; i++) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(i));
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY() && oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.VItLRw50eXTZeEfGl0()) {
                return true;
            }
        }
        return false;
    }

    public void f2zPq7MOnQrtOlZ1Zg(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iAcstmh57AKoSEkEFNJ = this.f4078husNiw3snxdgZPAGJm.Acstmh57AKoSEkEFNJ();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < iAcstmh57AKoSEkEFNJ; i7++) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.pbVGzGjWvY2LDXC8vo(i7));
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null && (i6 = oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.f4114HJFh0TGMpafqLE9haL) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.THTDvPxsHqMeGb512f(i2 - i, false);
                } else {
                    oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.THTDvPxsHqMeGb512f(i5, false);
                }
                this.f4052Tu4WCh2gEwj8E4oHbP.f4161TCyPEKSzIyweCN5yp1 = true;
            }
        }
        this.f4087s3fjYDxWOUexjjVgyA.xHA29AmDt6y96AnB3t(i, i2);
        requestLayout();
    }

    public void fBZDmBPlAHk1Liuf1T(int i, int i2) {
        hgxXdWVkE1CPHCTwpz(i, i2, null);
    }

    public final void fDXXEWvhMVO3O8mnuS(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4063aAp6BD79BhftLCnuvf) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4063aAp6BD79BhftLCnuvf = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f4041LU0fFDMACqnfIfA1AZ = x;
            this.f4051ToH8yzk8U1nKT0PUfY = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f4096zcy2NNbtVXgoGQbfuq = y;
            this.f4057XdzLv4NdAtTYoEzVzB = y;
        }
    }

    public boolean fLSSbwbzFBVpwBH5FM() {
        AccessibilityManager accessibilityManager = this.f4050THTDvPxsHqMeGb512f;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewOOMFI1Dcqcg1BSVNty;
        boolean z;
        View viewEscIOBqRhG6irG5q11 = this.f4048T9PhQIpGRhE4yZDm1C.EscIOBqRhG6irG5q11(view, i);
        if (viewEscIOBqRhG6irG5q11 != null) {
            return viewEscIOBqRhG6irG5q11;
        }
        boolean z2 = (this.f4072e54J8UWNHWALQNixXM == null || this.f4048T9PhQIpGRhE4yZDm1C == null || bBVlTkqEpHW053CjWL() || this.f4040LIMtzhnLwQyigzK0KO) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.f4048T9PhQIpGRhE4yZDm1C.zaq8hOURtfwbcX17cG()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (f4017Er40JrQbOM51vCQI8w) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f4048T9PhQIpGRhE4yZDm1C.OANkd3mP6AYvwbNLJM()) {
                int i3 = (this.f4048T9PhQIpGRhE4yZDm1C.Tu4WCh2gEwj8E4oHbP() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (f4017Er40JrQbOM51vCQI8w) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                R9SAhYMerGybF9OAjL();
                if (XdzLv4NdAtTYoEzVzB(view) == null) {
                    return null;
                }
                R6kEk3zZuOluTikhN3();
                this.f4048T9PhQIpGRhE4yZDm1C.oOMFI1Dcqcg1BSVNty(view, i, this.f4087s3fjYDxWOUexjjVgyA, this.f4052Tu4WCh2gEwj8E4oHbP);
                gpnYwZkFpQwu7zi2gb(false);
            }
            viewOOMFI1Dcqcg1BSVNty = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z2) {
                R9SAhYMerGybF9OAjL();
                if (XdzLv4NdAtTYoEzVzB(view) == null) {
                    return null;
                }
                R6kEk3zZuOluTikhN3();
                viewOOMFI1Dcqcg1BSVNty = this.f4048T9PhQIpGRhE4yZDm1C.oOMFI1Dcqcg1BSVNty(view, i, this.f4087s3fjYDxWOUexjjVgyA, this.f4052Tu4WCh2gEwj8E4oHbP);
                gpnYwZkFpQwu7zi2gb(false);
            } else {
                viewOOMFI1Dcqcg1BSVNty = viewFindNextFocus;
            }
        }
        if (viewOOMFI1Dcqcg1BSVNty == null || viewOOMFI1Dcqcg1BSVNty.hasFocusable()) {
            return yvdWWG9COQQotjfedH(view, viewOOMFI1Dcqcg1BSVNty, i) ? viewOOMFI1Dcqcg1BSVNty : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        PDw1hXOtArGjUqFgpT(viewOOMFI1Dcqcg1BSVNty, null);
        return view;
    }

    public void g0OBkYSIvp0JYnHPjC() {
        OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF;
        int iTCyPEKSzIyweCN5yp1 = this.f4078husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1();
        for (int i = 0; i < iTCyPEKSzIyweCN5yp1; i++) {
            View viewKYHag8HRDlnO3X9zmZ = this.f4078husNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(i);
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFTu4WCh2gEwj8E4oHbP = Tu4WCh2gEwj8E4oHbP(viewKYHag8HRDlnO3X9zmZ);
            if (oUd9THiLjZndMj0qdFTu4WCh2gEwj8E4oHbP != null && (oUd9THiLjZndMj0qdF = oUd9THiLjZndMj0qdFTu4WCh2gEwj8E4oHbP.f4126pbVGzGjWvY2LDXC8vo) != null) {
                View view = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7;
                int left = viewKYHag8HRDlnO3X9zmZ.getLeft();
                int top = viewKYHag8HRDlnO3X9zmZ.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null) {
            return apygsiylzvnkpt1bls.GyWRxpdt1T8mEJXPoD();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + lLKzvdU99Iw80uVD5I());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null) {
            return apygsiylzvnkpt1bls.DfpieXfdYs58yZAiXY(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + lLKzvdU99Iw80uVD5I());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public TCyPEKSzIyweCN5yp1 getAdapter() {
        return this.f4072e54J8UWNHWALQNixXM;
    }

    @Override // android.view.View
    public int getBaseline() {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        return apygsiylzvnkpt1bls != null ? apygsiylzvnkpt1bls.KqgKJKIWne3kz1AdHk() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4049TCyPEKSzIyweCN5yp1;
    }

    public androidx.recyclerview.widget.Z9WdNiOsPR0y54zHW4 getCompatAccessibilityDelegate() {
        return this.f4073eWK41qw3g36LVd4UnS;
    }

    public Z9WdNiOsPR0y54zHW4 getEdgeEffectFactory() {
        return this.f4055W3RZ2dTDKrKpS5Mxdk;
    }

    public e54J8UWNHWALQNixXM getItemAnimator() {
        return this.f4039KqgKJKIWne3kz1AdHk;
    }

    public int getItemDecorationCount() {
        return this.f4077hoXrIDAFrSwfShk8da.size();
    }

    public aPyGSIylzVNKPT1Bls getLayoutManager() {
        return this.f4048T9PhQIpGRhE4yZDm1C;
    }

    public int getMaxFlingVelocity() {
        return this.f4069cT5Hs3CQpLK8NvlZAw;
    }

    public int getMinFlingVelocity() {
        return this.f4090udcVtCzLTM1Loe9KrX;
    }

    public long getNanoTime() {
        if (f4018Fo9071MN8vwEWamAUX) {
            return System.nanoTime();
        }
        return 0L;
    }

    public zaq8hOURtfwbcX17cG getOnFlingListener() {
        return this.f4084oocVJL811qFf0j0XXZ;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4053Uj8rPa1EWADtk6Oe0S;
    }

    public R9SAhYMerGybF9OAjL getRecycledViewPool() {
        return this.f4087s3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo();
    }

    public int getScrollState() {
        return this.f4045PPkm9uUfOJHHYveeLT;
    }

    public void gpnYwZkFpQwu7zi2gb(boolean z) {
        if (this.f4032G7AC3DWIx9i9fdanjk < 1) {
            this.f4032G7AC3DWIx9i9fdanjk = 1;
        }
        if (!z && !this.f4040LIMtzhnLwQyigzK0KO) {
            this.f4091xHA29AmDt6y96AnB3t = false;
        }
        if (this.f4032G7AC3DWIx9i9fdanjk == 1) {
            if (z && this.f4091xHA29AmDt6y96AnB3t && !this.f4040LIMtzhnLwQyigzK0KO && this.f4048T9PhQIpGRhE4yZDm1C != null && this.f4072e54J8UWNHWALQNixXM != null) {
                THTDvPxsHqMeGb512f();
            }
            if (!this.f4040LIMtzhnLwQyigzK0KO) {
                this.f4091xHA29AmDt6y96AnB3t = false;
            }
        }
        this.f4032G7AC3DWIx9i9fdanjk--;
    }

    public void h6NrAcYSuIyiU1qV6F(int i, int i2, int[] iArr) {
        R6kEk3zZuOluTikhN3();
        pgB7Gmjz55y9NQYnAD();
        OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7("RV Scroll");
        ToH8yzk8U1nKT0PUfY(this.f4052Tu4WCh2gEwj8E4oHbP);
        int iTGGjvtdOhUewv2twsg = i != 0 ? this.f4048T9PhQIpGRhE4yZDm1C.tGGjvtdOhUewv2twsg(i, this.f4087s3fjYDxWOUexjjVgyA, this.f4052Tu4WCh2gEwj8E4oHbP) : 0;
        int iWUKf1mNArSjssthGmN = i2 != 0 ? this.f4048T9PhQIpGRhE4yZDm1C.wUKf1mNArSjssthGmN(i2, this.f4087s3fjYDxWOUexjjVgyA, this.f4052Tu4WCh2gEwj8E4oHbP) : 0;
        OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
        g0OBkYSIvp0JYnHPjC();
        Bc5OTyAfOKVCQb8CEz();
        gpnYwZkFpQwu7zi2gb(false);
        if (iArr != null) {
            iArr[0] = iTGGjvtdOhUewv2twsg;
            iArr[1] = iWUKf1mNArSjssthGmN;
        }
    }

    public final void h7m69eGbRk1hyaVt28() {
        WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw = this.f4052Tu4WCh2gEwj8E4oHbP;
        wWC27LAMFqFFBzfbNw.f4165hoXrIDAFrSwfShk8da = -1L;
        wWC27LAMFqFFBzfbNw.f4160T9PhQIpGRhE4yZDm1C = -1;
        wWC27LAMFqFFBzfbNw.f4163aPyGSIylzVNKPT1Bls = -1;
    }

    public OUd9THiLjZndMj0qdF hUNBy66ZO1wVLJGW3l(long j) {
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f4072e54J8UWNHWALQNixXM;
        OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = null;
        if (tCyPEKSzIyweCN5yp1 != null && tCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1()) {
            int iAcstmh57AKoSEkEFNJ = this.f4078husNiw3snxdgZPAGJm.Acstmh57AKoSEkEFNJ();
            for (int i = 0; i < iAcstmh57AKoSEkEFNJ; i++) {
                OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.pbVGzGjWvY2LDXC8vo(i));
                if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.xHA29AmDt6y96AnB3t() && oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.Z9WdNiOsPR0y54zHW4() == j) {
                    if (!this.f4078husNiw3snxdgZPAGJm.hoXrIDAFrSwfShk8da(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.f4125lEeR5KfoEr4xU5yHH7)) {
                        return oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W;
                    }
                    oUd9THiLjZndMj0qdF = oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W;
                }
            }
        }
        return oUd9THiLjZndMj0qdF;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().Acstmh57AKoSEkEFNJ();
    }

    public void hgxXdWVkE1CPHCTwpz(int i, int i2, Interpolator interpolator) {
        dCumDqZdWZ8NLrsgb7(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public void hoXrIDAFrSwfShk8da(String str) {
        if (bBVlTkqEpHW053CjWL()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + lLKzvdU99Iw80uVD5I());
        }
        if (this.f4089tXWeW0sqVddf7ZBflq > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + lLKzvdU99Iw80uVD5I()));
        }
    }

    public void i8aHOwH04efS6lZ3Oa(int i, int i2) {
    }

    public void iQCvttGuB7nx4r7kMP() {
        int iAcstmh57AKoSEkEFNJ = this.f4078husNiw3snxdgZPAGJm.Acstmh57AKoSEkEFNJ();
        for (int i = 0; i < iAcstmh57AKoSEkEFNJ; i++) {
            ((OANkd3mP6AYvwbNLJM) this.f4078husNiw3snxdgZPAGJm.pbVGzGjWvY2LDXC8vo(i).getLayoutParams()).f4108HJFh0TGMpafqLE9haL = true;
        }
        this.f4087s3fjYDxWOUexjjVgyA.Y43RdunnpKgpbny0lE();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f4095zaq8hOURtfwbcX17cG;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f4040LIMtzhnLwQyigzK0KO;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().e54J8UWNHWALQNixXM();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jCtUeU2YI1poCxWcjm() {
        /*
            r11 = this;
            androidx.recyclerview.widget.RecyclerView$WWC27LAMFqFFBzfbNw r0 = r11.f4052Tu4WCh2gEwj8E4oHbP
            r1 = 4
            r0.lEeR5KfoEr4xU5yHH7(r1)
            r11.R6kEk3zZuOluTikhN3()
            r11.pgB7Gmjz55y9NQYnAD()
            androidx.recyclerview.widget.RecyclerView$WWC27LAMFqFFBzfbNw r0 = r11.f4052Tu4WCh2gEwj8E4oHbP
            r1 = 1
            r0.f4166husNiw3snxdgZPAGJm = r1
            boolean r0 = r0.f4162Z9WdNiOsPR0y54zHW4
            if (r0 == 0) goto L88
            androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA r0 = r11.f4078husNiw3snxdgZPAGJm
            int r0 = r0.TCyPEKSzIyweCN5yp1()
            int r0 = r0 - r1
        L1c:
            if (r0 < 0) goto L81
            androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA r2 = r11.f4078husNiw3snxdgZPAGJm
            android.view.View r2 = r2.KYHag8HRDlnO3X9zmZ(r0)
            androidx.recyclerview.widget.RecyclerView$OUd9THiLjZndMj0qdF r5 = k0CbjZvfUz23r8IN6W(r2)
            boolean r2 = r5.DfpieXfdYs58yZAiXY()
            if (r2 == 0) goto L2f
            goto L7e
        L2f:
            long r2 = r11.osrHU7fvDp2EgxZPfM(r5)
            androidx.recyclerview.widget.RecyclerView$e54J8UWNHWALQNixXM r4 = r11.f4039KqgKJKIWne3kz1AdHk
            androidx.recyclerview.widget.RecyclerView$WWC27LAMFqFFBzfbNw r6 = r11.f4052Tu4WCh2gEwj8E4oHbP
            androidx.recyclerview.widget.RecyclerView$e54J8UWNHWALQNixXM$s3fjYDxWOUexjjVgyA r4 = r4.Y43RdunnpKgpbny0lE(r6, r5)
            androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM r6 = r11.f4037KYHag8HRDlnO3X9zmZ
            androidx.recyclerview.widget.RecyclerView$OUd9THiLjZndMj0qdF r6 = r6.TCyPEKSzIyweCN5yp1(r2)
            if (r6 == 0) goto L79
            boolean r7 = r6.DfpieXfdYs58yZAiXY()
            if (r7 != 0) goto L79
            androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM r7 = r11.f4037KYHag8HRDlnO3X9zmZ
            boolean r8 = r7.IPyIQcaNa8aB7drBED(r6)
            androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM r7 = r11.f4037KYHag8HRDlnO3X9zmZ
            boolean r9 = r7.IPyIQcaNa8aB7drBED(r5)
            if (r8 == 0) goto L5a
            if (r6 != r5) goto L5a
            goto L79
        L5a:
            androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM r7 = r11.f4037KYHag8HRDlnO3X9zmZ
            androidx.recyclerview.widget.RecyclerView$e54J8UWNHWALQNixXM$s3fjYDxWOUexjjVgyA r7 = r7.hoXrIDAFrSwfShk8da(r6)
            androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM r10 = r11.f4037KYHag8HRDlnO3X9zmZ
            r10.zZKhbgvUfsK4AEX3r0(r5, r4)
            androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM r4 = r11.f4037KYHag8HRDlnO3X9zmZ
            androidx.recyclerview.widget.RecyclerView$e54J8UWNHWALQNixXM$s3fjYDxWOUexjjVgyA r10 = r4.T9PhQIpGRhE4yZDm1C(r5)
            if (r7 != 0) goto L71
            r11.zXY7dgnTfw9Pd9RXel(r2, r5, r6)
            goto L7e
        L71:
            r3 = r11
            r4 = r6
            r6 = r7
            r7 = r10
            r3.e54J8UWNHWALQNixXM(r4, r5, r6, r7, r8, r9)
            goto L7e
        L79:
            androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM r2 = r11.f4037KYHag8HRDlnO3X9zmZ
            r2.zZKhbgvUfsK4AEX3r0(r5, r4)
        L7e:
            int r0 = r0 + (-1)
            goto L1c
        L81:
            androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM r0 = r11.f4037KYHag8HRDlnO3X9zmZ
            androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM$s3fjYDxWOUexjjVgyA r2 = r11.f4067bBVlTkqEpHW053CjWL
            r0.aPyGSIylzVNKPT1Bls(r2)
        L88:
            androidx.recyclerview.widget.RecyclerView$aPyGSIylzVNKPT1Bls r0 = r11.f4048T9PhQIpGRhE4yZDm1C
            androidx.recyclerview.widget.RecyclerView$G7AC3DWIx9i9fdanjk r2 = r11.f4087s3fjYDxWOUexjjVgyA
            r0.sKw6Jz5uGcQ479KwIW(r2)
            androidx.recyclerview.widget.RecyclerView$WWC27LAMFqFFBzfbNw r0 = r11.f4052Tu4WCh2gEwj8E4oHbP
            int r2 = r0.f4158KYHag8HRDlnO3X9zmZ
            r0.f4156HJFh0TGMpafqLE9haL = r2
            r2 = 0
            r11.f4043OUd9THiLjZndMj0qdF = r2
            r11.f4079jCtUeU2YI1poCxWcjm = r2
            r0.f4162Z9WdNiOsPR0y54zHW4 = r2
            r0.f4164e54J8UWNHWALQNixXM = r2
            androidx.recyclerview.widget.RecyclerView$aPyGSIylzVNKPT1Bls r0 = r11.f4048T9PhQIpGRhE4yZDm1C
            r0.f4174IPyIQcaNa8aB7drBED = r2
            androidx.recyclerview.widget.RecyclerView$G7AC3DWIx9i9fdanjk r0 = r11.f4087s3fjYDxWOUexjjVgyA
            java.util.ArrayList r0 = r0.f4104s3fjYDxWOUexjjVgyA
            if (r0 == 0) goto Lab
            r0.clear()
        Lab:
            androidx.recyclerview.widget.RecyclerView$aPyGSIylzVNKPT1Bls r0 = r11.f4048T9PhQIpGRhE4yZDm1C
            boolean r3 = r0.f4182hoXrIDAFrSwfShk8da
            if (r3 == 0) goto Lba
            r0.f4177T9PhQIpGRhE4yZDm1C = r2
            r0.f4182hoXrIDAFrSwfShk8da = r2
            androidx.recyclerview.widget.RecyclerView$G7AC3DWIx9i9fdanjk r0 = r11.f4087s3fjYDxWOUexjjVgyA
            r0.e2F9F6h8YJxTHwLCa0()
        Lba:
            androidx.recyclerview.widget.RecyclerView$aPyGSIylzVNKPT1Bls r0 = r11.f4048T9PhQIpGRhE4yZDm1C
            androidx.recyclerview.widget.RecyclerView$WWC27LAMFqFFBzfbNw r3 = r11.f4052Tu4WCh2gEwj8E4oHbP
            r0.h6NrAcYSuIyiU1qV6F(r3)
            r11.Bc5OTyAfOKVCQb8CEz()
            r11.gpnYwZkFpQwu7zi2gb(r2)
            androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM r0 = r11.f4037KYHag8HRDlnO3X9zmZ
            r0.KYHag8HRDlnO3X9zmZ()
            int[] r0 = r11.f4074evSiTWao80SbJUZk9E
            r3 = r0[r2]
            r0 = r0[r1]
            boolean r0 = r11.LIMtzhnLwQyigzK0KO(r3, r0)
            if (r0 == 0) goto Ldb
            r11.OqIo5QF00RDxUQb4qq(r2, r2)
        Ldb:
            r11.QW0Trt6m3nVBNaYFnP()
            r11.h7m69eGbRk1hyaVt28()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.jCtUeU2YI1poCxWcjm():void");
    }

    public Rect jocVUfxESVhVJU8LoH(View view) {
        OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (OANkd3mP6AYvwbNLJM) view.getLayoutParams();
        if (!oANkd3mP6AYvwbNLJM.f4108HJFh0TGMpafqLE9haL) {
            return oANkd3mP6AYvwbNLJM.f4110s3fjYDxWOUexjjVgyA;
        }
        if (this.f4052Tu4WCh2gEwj8E4oHbP.husNiw3snxdgZPAGJm() && (oANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA() || oANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0())) {
            return oANkd3mP6AYvwbNLJM.f4110s3fjYDxWOUexjjVgyA;
        }
        Rect rect = oANkd3mP6AYvwbNLJM.f4110s3fjYDxWOUexjjVgyA;
        rect.set(0, 0, 0, 0);
        int size = this.f4077hoXrIDAFrSwfShk8da.size();
        for (int i = 0; i < size; i++) {
            this.f4086pbVGzGjWvY2LDXC8vo.set(0, 0, 0, 0);
            ((hoXrIDAFrSwfShk8da) this.f4077hoXrIDAFrSwfShk8da.get(i)).husNiw3snxdgZPAGJm(this.f4086pbVGzGjWvY2LDXC8vo, view, this, this.f4052Tu4WCh2gEwj8E4oHbP);
            int i2 = rect.left;
            Rect rect2 = this.f4086pbVGzGjWvY2LDXC8vo;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        oANkd3mP6AYvwbNLJM.f4108HJFh0TGMpafqLE9haL = false;
        return rect;
    }

    public void jsjSYEu4NPZjZxcfmI(sTkWmhpZ5b1ArQIw4K stkwmhpz5b1arqiw4k) {
        this.f4064aPyGSIylzVNKPT1Bls.remove(stkwmhpz5b1arqiw4k);
        if (this.f4042OANkd3mP6AYvwbNLJM == stkwmhpz5b1arqiw4k) {
            this.f4042OANkd3mP6AYvwbNLJM = null;
        }
    }

    public void lBAL39rPf03qYLFNNP(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4040LIMtzhnLwQyigzK0KO) {
            return;
        }
        if (!apygsiylzvnkpt1bls.OANkd3mP6AYvwbNLJM()) {
            i = 0;
        }
        if (!this.f4048T9PhQIpGRhE4yZDm1C.zaq8hOURtfwbcX17cG()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 != Integer.MIN_VALUE && i3 <= 0) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            auvQiDfBN48eRz3fFq(i4, 1);
        }
        this.f4028CSih7GetOUab1dYQjM.KYHag8HRDlnO3X9zmZ(i, i2, i3, interpolator);
    }

    public void lEeR5KfoEr4xU5yHH7(int i, int i2) {
        if (i < 0) {
            KqgKJKIWne3kz1AdHk();
            if (this.f4044OqIo5QF00RDxUQb4qq.isFinished()) {
                this.f4044OqIo5QF00RDxUQb4qq.onAbsorb(-i);
            }
        } else if (i > 0) {
            PPkm9uUfOJHHYveeLT();
            if (this.f4030DfpieXfdYs58yZAiXY.isFinished()) {
                this.f4030DfpieXfdYs58yZAiXY.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            aAp6BD79BhftLCnuvf();
            if (this.f4033GyWRxpdt1T8mEJXPoD.isFinished()) {
                this.f4033GyWRxpdt1T8mEJXPoD.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            e2F9F6h8YJxTHwLCa0();
            if (this.f4071e2F9F6h8YJxTHwLCa0.isFinished()) {
                this.f4071e2F9F6h8YJxTHwLCa0.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        lLKzvdU99Iw80uVD5I.osrHU7fvDp2EgxZPfM(this);
    }

    public String lLKzvdU99Iw80uVD5I() {
        return " " + super.toString() + ", adapter:" + this.f4072e54J8UWNHWALQNixXM + ", layout:" + this.f4048T9PhQIpGRhE4yZDm1C + ", context:" + getContext();
    }

    public void oOMFI1Dcqcg1BSVNty(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        oUd9THiLjZndMj0qdF.tXWeW0sqVddf7ZBflq(0, 8192);
        if (this.f4052Tu4WCh2gEwj8E4oHbP.f4168pbVGzGjWvY2LDXC8vo && oUd9THiLjZndMj0qdF.VItLRw50eXTZeEfGl0() && !oUd9THiLjZndMj0qdF.xHA29AmDt6y96AnB3t() && !oUd9THiLjZndMj0qdF.DfpieXfdYs58yZAiXY()) {
            this.f4037KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(osrHU7fvDp2EgxZPfM(oUd9THiLjZndMj0qdF), oUd9THiLjZndMj0qdF);
        }
        this.f4037KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm(oUd9THiLjZndMj0qdF, s3fjydxwouexjjvgya);
    }

    public final void oXIAAdret8ERrYfuyf() {
        boolean z;
        if (this.f4043OUd9THiLjZndMj0qdF) {
            this.f4094zZKhbgvUfsK4AEX3r0.G7AC3DWIx9i9fdanjk();
            if (this.f4079jCtUeU2YI1poCxWcjm) {
                this.f4048T9PhQIpGRhE4yZDm1C.PDw1hXOtArGjUqFgpT(this);
            }
        }
        if (uAIIhSQWhOmxUb3Bqo()) {
            this.f4094zZKhbgvUfsK4AEX3r0.Y43RdunnpKgpbny0lE();
        } else {
            this.f4094zZKhbgvUfsK4AEX3r0.Acstmh57AKoSEkEFNJ();
        }
        boolean z2 = this.f4046Pum9NZyDBKoCnecvlx || this.f4070ctWLFN70QQINH1kyYo;
        this.f4052Tu4WCh2gEwj8E4oHbP.f4162Z9WdNiOsPR0y54zHW4 = this.f4047R9SAhYMerGybF9OAjL && this.f4039KqgKJKIWne3kz1AdHk != null && ((z = this.f4043OUd9THiLjZndMj0qdF) || z2 || this.f4048T9PhQIpGRhE4yZDm1C.f4174IPyIQcaNa8aB7drBED) && (!z || this.f4072e54J8UWNHWALQNixXM.TCyPEKSzIyweCN5yp1());
        WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw = this.f4052Tu4WCh2gEwj8E4oHbP;
        wWC27LAMFqFFBzfbNw.f4164e54J8UWNHWALQNixXM = wWC27LAMFqFFBzfbNw.f4162Z9WdNiOsPR0y54zHW4 && z2 && !this.f4043OUd9THiLjZndMj0qdF && uAIIhSQWhOmxUb3Bqo();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f4058XzJ1BS7H9Ilbkv4eVM = r0
            r1 = 1
            r5.f4095zaq8hOURtfwbcX17cG = r1
            boolean r2 = r5.f4047R9SAhYMerGybF9OAjL
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f4047R9SAhYMerGybF9OAjL = r1
            androidx.recyclerview.widget.RecyclerView$aPyGSIylzVNKPT1Bls r1 = r5.f4048T9PhQIpGRhE4yZDm1C
            if (r1 == 0) goto L1e
            r1.XzJ1BS7H9Ilbkv4eVM(r5)
        L1e:
            r5.f4093zXY7dgnTfw9Pd9RXel = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f4018Fo9071MN8vwEWamAUX
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.husNiw3snxdgZPAGJm.f4299husNiw3snxdgZPAGJm
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.husNiw3snxdgZPAGJm r1 = (androidx.recyclerview.widget.husNiw3snxdgZPAGJm) r1
            r5.f4085osrHU7fvDp2EgxZPfM = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.husNiw3snxdgZPAGJm r1 = new androidx.recyclerview.widget.husNiw3snxdgZPAGJm
            r1.<init>()
            r5.f4085osrHU7fvDp2EgxZPfM = r1
            android.view.Display r1 = W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.sTkWmhpZ5b1ArQIw4K(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.husNiw3snxdgZPAGJm r2 = r5.f4085osrHU7fvDp2EgxZPfM
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f4300HJFh0TGMpafqLE9haL = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.husNiw3snxdgZPAGJm r0 = r5.f4085osrHU7fvDp2EgxZPfM
            r0.lEeR5KfoEr4xU5yHH7(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.husNiw3snxdgZPAGJm husniw3snxdgzpagjm;
        super.onDetachedFromWindow();
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f4039KqgKJKIWne3kz1AdHk;
        if (e54j8uwnhwalqnixxm != null) {
            e54j8uwnhwalqnixxm.Z9WdNiOsPR0y54zHW4();
        }
        FXtjrf53D5B1cLsLFG();
        this.f4095zaq8hOURtfwbcX17cG = false;
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null) {
            apygsiylzvnkpt1bls.tXWeW0sqVddf7ZBflq(this, this.f4087s3fjYDxWOUexjjVgyA);
        }
        this.f4036Jsouc4ileb8SxQhxbX.clear();
        removeCallbacks(this.f4075fLSSbwbzFBVpwBH5FM);
        this.f4037KYHag8HRDlnO3X9zmZ.Acstmh57AKoSEkEFNJ();
        if (!f4018Fo9071MN8vwEWamAUX || (husniw3snxdgzpagjm = this.f4085osrHU7fvDp2EgxZPfM) == null) {
            return;
        }
        husniw3snxdgzpagjm.Acstmh57AKoSEkEFNJ(this);
        this.f4085osrHU7fvDp2EgxZPfM = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4077hoXrIDAFrSwfShk8da.size();
        for (int i = 0; i < size; i++) {
            ((hoXrIDAFrSwfShk8da) this.f4077hoXrIDAFrSwfShk8da.get(i)).TCyPEKSzIyweCN5yp1(canvas, this, this.f4052Tu4WCh2gEwj8E4oHbP);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$aPyGSIylzVNKPT1Bls r0 = r5.f4048T9PhQIpGRhE4yZDm1C
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f4040LIMtzhnLwQyigzK0KO
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$aPyGSIylzVNKPT1Bls r0 = r5.f4048T9PhQIpGRhE4yZDm1C
            boolean r0 = r0.zaq8hOURtfwbcX17cG()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$aPyGSIylzVNKPT1Bls r3 = r5.f4048T9PhQIpGRhE4yZDm1C
            boolean r3 = r3.OANkd3mP6AYvwbNLJM()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$aPyGSIylzVNKPT1Bls r3 = r5.f4048T9PhQIpGRhE4yZDm1C
            boolean r3 = r3.zaq8hOURtfwbcX17cG()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$aPyGSIylzVNKPT1Bls r3 = r5.f4048T9PhQIpGRhE4yZDm1C
            boolean r3 = r3.OANkd3mP6AYvwbNLJM()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f4076hUNBy66ZO1wVLJGW3l
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f4068bMSdooljgH14Jgudph
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.FI7jQXEuEg1AdcOOw7(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f4040LIMtzhnLwQyigzK0KO) {
            return false;
        }
        this.f4042OANkd3mP6AYvwbNLJM = null;
        if (zcy2NNbtVXgoGQbfuq(motionEvent)) {
            OANkd3mP6AYvwbNLJM();
            return true;
        }
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls == null) {
            return false;
        }
        boolean zOANkd3mP6AYvwbNLJM = apygsiylzvnkpt1bls.OANkd3mP6AYvwbNLJM();
        boolean zZaq8hOURtfwbcX17cG = this.f4048T9PhQIpGRhE4yZDm1C.zaq8hOURtfwbcX17cG();
        if (this.f4083lLKzvdU99Iw80uVD5I == null) {
            this.f4083lLKzvdU99Iw80uVD5I = VelocityTracker.obtain();
        }
        this.f4083lLKzvdU99Iw80uVD5I.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4026A49QRPHynYLCBN0SqP) {
                this.f4026A49QRPHynYLCBN0SqP = false;
            }
            this.f4063aAp6BD79BhftLCnuvf = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f4041LU0fFDMACqnfIfA1AZ = x;
            this.f4051ToH8yzk8U1nKT0PUfY = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f4096zcy2NNbtVXgoGQbfuq = y;
            this.f4057XdzLv4NdAtTYoEzVzB = y;
            if (this.f4045PPkm9uUfOJHHYveeLT == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                sKw6Jz5uGcQ479KwIW(1);
            }
            int[] iArr = this.f4066ayduHasC7VpxsVXE0T;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zOANkd3mP6AYvwbNLJM;
            if (zZaq8hOURtfwbcX17cG) {
                i = (zOANkd3mP6AYvwbNLJM ? 1 : 0) | 2;
            }
            auvQiDfBN48eRz3fFq(i, 0);
        } else if (actionMasked == 1) {
            this.f4083lLKzvdU99Iw80uVD5I.clear();
            sKw6Jz5uGcQ479KwIW(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f4063aAp6BD79BhftLCnuvf);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4063aAp6BD79BhftLCnuvf + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f4045PPkm9uUfOJHHYveeLT != 1) {
                int i2 = x2 - this.f4051ToH8yzk8U1nKT0PUfY;
                int i3 = y2 - this.f4057XdzLv4NdAtTYoEzVzB;
                if (zOANkd3mP6AYvwbNLJM == 0 || Math.abs(i2) <= this.f4060YlLW4G6OV9TFyuw5ix) {
                    z = false;
                } else {
                    this.f4041LU0fFDMACqnfIfA1AZ = x2;
                    z = true;
                }
                if (zZaq8hOURtfwbcX17cG && Math.abs(i3) > this.f4060YlLW4G6OV9TFyuw5ix) {
                    this.f4096zcy2NNbtVXgoGQbfuq = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            OANkd3mP6AYvwbNLJM();
        } else if (actionMasked == 5) {
            this.f4063aAp6BD79BhftLCnuvf = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4041LU0fFDMACqnfIfA1AZ = x3;
            this.f4051ToH8yzk8U1nKT0PUfY = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4096zcy2NNbtVXgoGQbfuq = y3;
            this.f4057XdzLv4NdAtTYoEzVzB = y3;
        } else if (actionMasked == 6) {
            fDXXEWvhMVO3O8mnuS(motionEvent);
        }
        return this.f4045PPkm9uUfOJHHYveeLT == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7("RV OnLayout");
        THTDvPxsHqMeGb512f();
        OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
        this.f4047R9SAhYMerGybF9OAjL = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls == null) {
            xHA29AmDt6y96AnB3t(i, i2);
            return;
        }
        if (apygsiylzvnkpt1bls.Er40JrQbOM51vCQI8w()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4048T9PhQIpGRhE4yZDm1C.MHebQjnRowM60e3HDn(this.f4087s3fjYDxWOUexjjVgyA, this.f4052Tu4WCh2gEwj8E4oHbP, i, i2);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.f4072e54J8UWNHWALQNixXM == null) {
                return;
            }
            if (this.f4052Tu4WCh2gEwj8E4oHbP.f4166husNiw3snxdgZPAGJm == 1) {
                ao3wqKm5CXFuvC0q47();
            }
            this.f4048T9PhQIpGRhE4yZDm1C.w859GrF8FXGM1qrYSH(i, i2);
            this.f4052Tu4WCh2gEwj8E4oHbP.f4155Acstmh57AKoSEkEFNJ = true;
            OUd9THiLjZndMj0qdF();
            this.f4048T9PhQIpGRhE4yZDm1C.ZH7ZBRiZvcOTI9arA2(i, i2);
            if (this.f4048T9PhQIpGRhE4yZDm1C.jguN4azZtOjukyvhIL()) {
                this.f4048T9PhQIpGRhE4yZDm1C.w859GrF8FXGM1qrYSH(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f4052Tu4WCh2gEwj8E4oHbP.f4155Acstmh57AKoSEkEFNJ = true;
                OUd9THiLjZndMj0qdF();
                this.f4048T9PhQIpGRhE4yZDm1C.ZH7ZBRiZvcOTI9arA2(i, i2);
                return;
            }
            return;
        }
        if (this.f4088sTkWmhpZ5b1ArQIw4K) {
            this.f4048T9PhQIpGRhE4yZDm1C.MHebQjnRowM60e3HDn(this.f4087s3fjYDxWOUexjjVgyA, this.f4052Tu4WCh2gEwj8E4oHbP, i, i2);
            return;
        }
        if (this.f4056WWC27LAMFqFFBzfbNw) {
            R6kEk3zZuOluTikhN3();
            pgB7Gmjz55y9NQYnAD();
            oXIAAdret8ERrYfuyf();
            Bc5OTyAfOKVCQb8CEz();
            WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw = this.f4052Tu4WCh2gEwj8E4oHbP;
            if (wWC27LAMFqFFBzfbNw.f4164e54J8UWNHWALQNixXM) {
                wWC27LAMFqFFBzfbNw.f4157IPyIQcaNa8aB7drBED = true;
            } else {
                this.f4094zZKhbgvUfsK4AEX3r0.Acstmh57AKoSEkEFNJ();
                this.f4052Tu4WCh2gEwj8E4oHbP.f4157IPyIQcaNa8aB7drBED = false;
            }
            this.f4056WWC27LAMFqFFBzfbNw = false;
            gpnYwZkFpQwu7zi2gb(false);
        } else if (this.f4052Tu4WCh2gEwj8E4oHbP.f4164e54J8UWNHWALQNixXM) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f4072e54J8UWNHWALQNixXM;
        if (tCyPEKSzIyweCN5yp1 != null) {
            this.f4052Tu4WCh2gEwj8E4oHbP.f4158KYHag8HRDlnO3X9zmZ = tCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL();
        } else {
            this.f4052Tu4WCh2gEwj8E4oHbP.f4158KYHag8HRDlnO3X9zmZ = 0;
        }
        R6kEk3zZuOluTikhN3();
        this.f4048T9PhQIpGRhE4yZDm1C.MHebQjnRowM60e3HDn(this.f4087s3fjYDxWOUexjjVgyA, this.f4052Tu4WCh2gEwj8E4oHbP, i, i2);
        gpnYwZkFpQwu7zi2gb(false);
        this.f4052Tu4WCh2gEwj8E4oHbP.f4157IPyIQcaNa8aB7drBED = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (bBVlTkqEpHW053CjWL()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof A49QRPHynYLCBN0SqP)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP = (A49QRPHynYLCBN0SqP) parcelable;
        this.f4034HJFh0TGMpafqLE9haL = a49QRPHynYLCBN0SqP;
        super.onRestoreInstanceState(a49QRPHynYLCBN0SqP.HJFh0TGMpafqLE9haL());
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls == null || (parcelable2 = this.f4034HJFh0TGMpafqLE9haL.f4097HJFh0TGMpafqLE9haL) == null) {
            return;
        }
        apygsiylzvnkpt1bls.YIIWDMF3jHAs3E0PkN(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP = new A49QRPHynYLCBN0SqP(super.onSaveInstanceState());
        A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP2 = this.f4034HJFh0TGMpafqLE9haL;
        if (a49QRPHynYLCBN0SqP2 != null) {
            a49QRPHynYLCBN0SqP.zZKhbgvUfsK4AEX3r0(a49QRPHynYLCBN0SqP2);
        } else {
            aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
            a49QRPHynYLCBN0SqP.f4097HJFh0TGMpafqLE9haL = apygsiylzvnkpt1bls != null ? apygsiylzvnkpt1bls.fBZDmBPlAHk1Liuf1T() : null;
        }
        return a49QRPHynYLCBN0SqP;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        Jsouc4ileb8SxQhxbX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[PHI: r0
      0x00dd: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:46:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public long osrHU7fvDp2EgxZPfM(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        return this.f4072e54J8UWNHWALQNixXM.TCyPEKSzIyweCN5yp1() ? oUd9THiLjZndMj0qdF.Z9WdNiOsPR0y54zHW4() : oUd9THiLjZndMj0qdF.f4114HJFh0TGMpafqLE9haL;
    }

    public void owCQzRKpGarpL4247z() {
        if (this.f4093zXY7dgnTfw9Pd9RXel || !this.f4095zaq8hOURtfwbcX17cG) {
            return;
        }
        lLKzvdU99Iw80uVD5I.ZJNyOIPL0usMs2xSAn(this, this.f4075fLSSbwbzFBVpwBH5FM);
        this.f4093zXY7dgnTfw9Pd9RXel = true;
    }

    public void pbVGzGjWvY2LDXC8vo(sTkWmhpZ5b1ArQIw4K stkwmhpz5b1arqiw4k) {
        this.f4064aPyGSIylzVNKPT1Bls.add(stkwmhpz5b1arqiw4k);
    }

    public void pgB7Gmjz55y9NQYnAD() {
        this.f4058XzJ1BS7H9Ilbkv4eVM++;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(view);
        if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null) {
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.A49QRPHynYLCBN0SqP()) {
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.KYHag8HRDlnO3X9zmZ();
            } else if (!oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W + lLKzvdU99Iw80uVD5I());
            }
        }
        view.clearAnimation();
        VItLRw50eXTZeEfGl0(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f4048T9PhQIpGRhE4yZDm1C.WaWv1mJ1ya3uoEaKqz(this, this.f4052Tu4WCh2gEwj8E4oHbP, view, view2) && view2 != null) {
            PDw1hXOtArGjUqFgpT(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f4048T9PhQIpGRhE4yZDm1C.LjVYrU4NjguFeQ2fwa(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f4064aPyGSIylzVNKPT1Bls.size();
        for (int i = 0; i < size; i++) {
            ((sTkWmhpZ5b1ArQIw4K) this.f4064aPyGSIylzVNKPT1Bls.get(i)).HJFh0TGMpafqLE9haL(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4032G7AC3DWIx9i9fdanjk != 0 || this.f4040LIMtzhnLwQyigzK0KO) {
            this.f4091xHA29AmDt6y96AnB3t = true;
        } else {
            super.requestLayout();
        }
    }

    public void sKw6Jz5uGcQ479KwIW(int i) {
        getScrollingChildHelper().sTkWmhpZ5b1ArQIw4K(i);
    }

    public void sTkWmhpZ5b1ArQIw4K() {
        int iAcstmh57AKoSEkEFNJ = this.f4078husNiw3snxdgZPAGJm.Acstmh57AKoSEkEFNJ();
        for (int i = 0; i < iAcstmh57AKoSEkEFNJ; i++) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.pbVGzGjWvY2LDXC8vo(i));
            if (!oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY()) {
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.HJFh0TGMpafqLE9haL();
            }
        }
        this.f4087s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0();
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4040LIMtzhnLwQyigzK0KO) {
            return;
        }
        boolean zOANkd3mP6AYvwbNLJM = apygsiylzvnkpt1bls.OANkd3mP6AYvwbNLJM();
        boolean zZaq8hOURtfwbcX17cG = this.f4048T9PhQIpGRhE4yZDm1C.zaq8hOURtfwbcX17cG();
        if (zOANkd3mP6AYvwbNLJM || zZaq8hOURtfwbcX17cG) {
            if (!zOANkd3mP6AYvwbNLJM) {
                i = 0;
            }
            if (!zZaq8hOURtfwbcX17cG) {
                i2 = 0;
            }
            FI7jQXEuEg1AdcOOw7(i, i2, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (YIIWDMF3jHAs3E0PkN(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        this.f4073eWK41qw3g36LVd4UnS = z9WdNiOsPR0y54zHW4;
        lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(this, z9WdNiOsPR0y54zHW4);
    }

    public void setAdapter(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1) {
        setLayoutFrozen(false);
        GeBgWLiG3rAOvStVF8(tCyPEKSzIyweCN5yp1, false, true);
        yXUWiIShOcfJRNCmU8(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
        if (acstmh57AKoSEkEFNJ == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f4049TCyPEKSzIyweCN5yp1) {
            Jsouc4ileb8SxQhxbX();
        }
        this.f4049TCyPEKSzIyweCN5yp1 = z;
        super.setClipToPadding(z);
        if (this.f4047R9SAhYMerGybF9OAjL) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(z9WdNiOsPR0y54zHW4);
        this.f4055W3RZ2dTDKrKpS5Mxdk = z9WdNiOsPR0y54zHW4;
        Jsouc4ileb8SxQhxbX();
    }

    public void setHasFixedSize(boolean z) {
        this.f4088sTkWmhpZ5b1ArQIw4K = z;
    }

    public void setItemAnimator(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm2 = this.f4039KqgKJKIWne3kz1AdHk;
        if (e54j8uwnhwalqnixxm2 != null) {
            e54j8uwnhwalqnixxm2.Z9WdNiOsPR0y54zHW4();
            this.f4039KqgKJKIWne3kz1AdHk.xHA29AmDt6y96AnB3t(null);
        }
        this.f4039KqgKJKIWne3kz1AdHk = e54j8uwnhwalqnixxm;
        if (e54j8uwnhwalqnixxm != null) {
            e54j8uwnhwalqnixxm.xHA29AmDt6y96AnB3t(this.f4080jocVUfxESVhVJU8LoH);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f4087s3fjYDxWOUexjjVgyA.W3RZ2dTDKrKpS5Mxdk(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        if (apygsiylzvnkpt1bls == this.f4048T9PhQIpGRhE4yZDm1C) {
            return;
        }
        FXtjrf53D5B1cLsLFG();
        if (this.f4048T9PhQIpGRhE4yZDm1C != null) {
            e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f4039KqgKJKIWne3kz1AdHk;
            if (e54j8uwnhwalqnixxm != null) {
                e54j8uwnhwalqnixxm.Z9WdNiOsPR0y54zHW4();
            }
            this.f4048T9PhQIpGRhE4yZDm1C.gpnYwZkFpQwu7zi2gb(this.f4087s3fjYDxWOUexjjVgyA);
            this.f4048T9PhQIpGRhE4yZDm1C.sKw6Jz5uGcQ479KwIW(this.f4087s3fjYDxWOUexjjVgyA);
            this.f4087s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL();
            if (this.f4095zaq8hOURtfwbcX17cG) {
                this.f4048T9PhQIpGRhE4yZDm1C.tXWeW0sqVddf7ZBflq(this, this.f4087s3fjYDxWOUexjjVgyA);
            }
            this.f4048T9PhQIpGRhE4yZDm1C.D3qEI0j1Bvj6FYKAih(null);
            this.f4048T9PhQIpGRhE4yZDm1C = null;
        } else {
            this.f4087s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL();
        }
        this.f4078husNiw3snxdgZPAGJm.aPyGSIylzVNKPT1Bls();
        this.f4048T9PhQIpGRhE4yZDm1C = apygsiylzvnkpt1bls;
        if (apygsiylzvnkpt1bls != null) {
            if (apygsiylzvnkpt1bls.f4186s3fjYDxWOUexjjVgyA != null) {
                throw new IllegalArgumentException("LayoutManager " + apygsiylzvnkpt1bls + " is already attached to a RecyclerView:" + apygsiylzvnkpt1bls.f4186s3fjYDxWOUexjjVgyA.lLKzvdU99Iw80uVD5I());
            }
            apygsiylzvnkpt1bls.D3qEI0j1Bvj6FYKAih(this);
            if (this.f4095zaq8hOURtfwbcX17cG) {
                this.f4048T9PhQIpGRhE4yZDm1C.XzJ1BS7H9Ilbkv4eVM(this);
            }
        }
        this.f4087s3fjYDxWOUexjjVgyA.e2F9F6h8YJxTHwLCa0();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().T9PhQIpGRhE4yZDm1C(z);
    }

    public void setOnFlingListener(zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg) {
        this.f4084oocVJL811qFf0j0XXZ = zaq8hourtfwbcx17cg;
    }

    @Deprecated
    public void setOnScrollListener(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
        this.f4081k0CbjZvfUz23r8IN6W = y43RdunnpKgpbny0lE;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f4053Uj8rPa1EWADtk6Oe0S = z;
    }

    public void setRecycledViewPool(R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL) {
        this.f4087s3fjYDxWOUexjjVgyA.XzJ1BS7H9Ilbkv4eVM(r9SAhYMerGybF9OAjL);
    }

    public void setRecyclerListener(xHA29AmDt6y96AnB3t xha29amdt6y96anb3t) {
    }

    public void setScrollState(int i) {
        if (i == this.f4045PPkm9uUfOJHHYveeLT) {
            return;
        }
        this.f4045PPkm9uUfOJHHYveeLT = i;
        if (i != 2) {
            dvmHGYHwlE2ean7ktb();
        }
        W3RZ2dTDKrKpS5Mxdk(i);
    }

    public void setScrollingTouchSlop(int i) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i != 1) {
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.f4060YlLW4G6OV9TFyuw5ix = scaledTouchSlop;
    }

    public void setViewCacheExtension(THTDvPxsHqMeGb512f tHTDvPxsHqMeGb512f) {
        this.f4087s3fjYDxWOUexjjVgyA.tXWeW0sqVddf7ZBflq(tHTDvPxsHqMeGb512f);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().aPyGSIylzVNKPT1Bls(i);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().zaq8hOURtfwbcX17cG();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f4040LIMtzhnLwQyigzK0KO) {
            hoXrIDAFrSwfShk8da("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f4040LIMtzhnLwQyigzK0KO = true;
                this.f4026A49QRPHynYLCBN0SqP = true;
                FXtjrf53D5B1cLsLFG();
                return;
            }
            this.f4040LIMtzhnLwQyigzK0KO = false;
            if (this.f4091xHA29AmDt6y96AnB3t && this.f4048T9PhQIpGRhE4yZDm1C != null && this.f4072e54J8UWNHWALQNixXM != null) {
                requestLayout();
            }
            this.f4091xHA29AmDt6y96AnB3t = false;
        }
    }

    public final void tXWeW0sqVddf7ZBflq(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().husNiw3snxdgZPAGJm(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void tmIBXGVvBsrJ7i63G2(hoXrIDAFrSwfShk8da hoxridafrswfshk8da) {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null) {
            apygsiylzvnkpt1bls.e54J8UWNHWALQNixXM("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4077hoXrIDAFrSwfShk8da.remove(hoxridafrswfshk8da);
        if (this.f4077hoXrIDAFrSwfShk8da.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        iQCvttGuB7nx4r7kMP();
        requestLayout();
    }

    public final boolean uAIIhSQWhOmxUb3Bqo() {
        return this.f4039KqgKJKIWne3kz1AdHk != null && this.f4048T9PhQIpGRhE4yZDm1C.w9kKjxxNBwNcD4xB6O();
    }

    public final View udcVtCzLTM1Loe9KrX() {
        OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFCT5Hs3CQpLK8NvlZAw;
        WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw = this.f4052Tu4WCh2gEwj8E4oHbP;
        int i = wWC27LAMFqFFBzfbNw.f4160T9PhQIpGRhE4yZDm1C;
        if (i == -1) {
            i = 0;
        }
        int iS3fjYDxWOUexjjVgyA = wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA();
        for (int i2 = i; i2 < iS3fjYDxWOUexjjVgyA; i2++) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFCT5Hs3CQpLK8NvlZAw2 = cT5Hs3CQpLK8NvlZAw(i2);
            if (oUd9THiLjZndMj0qdFCT5Hs3CQpLK8NvlZAw2 == null) {
                break;
            }
            if (oUd9THiLjZndMj0qdFCT5Hs3CQpLK8NvlZAw2.f4125lEeR5KfoEr4xU5yHH7.hasFocusable()) {
                return oUd9THiLjZndMj0qdFCT5Hs3CQpLK8NvlZAw2.f4125lEeR5KfoEr4xU5yHH7;
            }
        }
        int iMin = Math.min(iS3fjYDxWOUexjjVgyA, i);
        do {
            iMin--;
            if (iMin < 0 || (oUd9THiLjZndMj0qdFCT5Hs3CQpLK8NvlZAw = cT5Hs3CQpLK8NvlZAw(iMin)) == null) {
                return null;
            }
        } while (!oUd9THiLjZndMj0qdFCT5Hs3CQpLK8NvlZAw.f4125lEeR5KfoEr4xU5yHH7.hasFocusable());
        return oUd9THiLjZndMj0qdFCT5Hs3CQpLK8NvlZAw.f4125lEeR5KfoEr4xU5yHH7;
    }

    public final void vExXQwwMm8C1aKdGdj() {
        View focusedChild = (this.f4053Uj8rPa1EWADtk6Oe0S && hasFocus() && this.f4072e54J8UWNHWALQNixXM != null) ? getFocusedChild() : null;
        OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFLU0fFDMACqnfIfA1AZ = focusedChild != null ? LU0fFDMACqnfIfA1AZ(focusedChild) : null;
        if (oUd9THiLjZndMj0qdFLU0fFDMACqnfIfA1AZ == null) {
            h7m69eGbRk1hyaVt28();
            return;
        }
        this.f4052Tu4WCh2gEwj8E4oHbP.f4165hoXrIDAFrSwfShk8da = this.f4072e54J8UWNHWALQNixXM.TCyPEKSzIyweCN5yp1() ? oUd9THiLjZndMj0qdFLU0fFDMACqnfIfA1AZ.Z9WdNiOsPR0y54zHW4() : -1L;
        this.f4052Tu4WCh2gEwj8E4oHbP.f4160T9PhQIpGRhE4yZDm1C = this.f4043OUd9THiLjZndMj0qdF ? -1 : oUd9THiLjZndMj0qdFLU0fFDMACqnfIfA1AZ.xHA29AmDt6y96AnB3t() ? oUd9THiLjZndMj0qdFLU0fFDMACqnfIfA1AZ.f4129zZKhbgvUfsK4AEX3r0 : oUd9THiLjZndMj0qdFLU0fFDMACqnfIfA1AZ.Acstmh57AKoSEkEFNJ();
        this.f4052Tu4WCh2gEwj8E4oHbP.f4163aPyGSIylzVNKPT1Bls = Pum9NZyDBKoCnecvlx(oUd9THiLjZndMj0qdFLU0fFDMACqnfIfA1AZ.f4125lEeR5KfoEr4xU5yHH7);
    }

    public void vlBaBOcZ1q1ndWVoXn(int i) {
    }

    public void xHA29AmDt6y96AnB3t(int i, int i2) {
        setMeasuredDimension(aPyGSIylzVNKPT1Bls.Y43RdunnpKgpbny0lE(i, getPaddingLeft() + getPaddingRight(), lLKzvdU99Iw80uVD5I.WWC27LAMFqFFBzfbNw(this)), aPyGSIylzVNKPT1Bls.Y43RdunnpKgpbny0lE(i2, getPaddingTop() + getPaddingBottom(), lLKzvdU99Iw80uVD5I.VItLRw50eXTZeEfGl0(this)));
    }

    public void xMfAHy6F7qK0zhxhKG(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.zZKhbgvUfsK4AEX3r0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(bMSdooljgH14Jgudph.s3fjYDxWOUexjjVgyA.f4702lEeR5KfoEr4xU5yHH7), resources.getDimensionPixelSize(bMSdooljgH14Jgudph.s3fjYDxWOUexjjVgyA.f4701HJFh0TGMpafqLE9haL), resources.getDimensionPixelOffset(bMSdooljgH14Jgudph.s3fjYDxWOUexjjVgyA.f4703s3fjYDxWOUexjjVgyA));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + lLKzvdU99Iw80uVD5I());
        }
    }

    public void yL2E9nlEZpg8ZZx8XE() {
        int iAcstmh57AKoSEkEFNJ = this.f4078husNiw3snxdgZPAGJm.Acstmh57AKoSEkEFNJ();
        for (int i = 0; i < iAcstmh57AKoSEkEFNJ; i++) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.pbVGzGjWvY2LDXC8vo(i));
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY()) {
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.s3fjYDxWOUexjjVgyA(6);
            }
        }
        iQCvttGuB7nx4r7kMP();
        this.f4087s3fjYDxWOUexjjVgyA.R9SAhYMerGybF9OAjL();
    }

    public void yXUWiIShOcfJRNCmU8(boolean z) {
        this.f4079jCtUeU2YI1poCxWcjm = z | this.f4079jCtUeU2YI1poCxWcjm;
        this.f4043OUd9THiLjZndMj0qdF = true;
        yL2E9nlEZpg8ZZx8XE();
    }

    public final boolean yvdWWG9COQQotjfedH(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || XdzLv4NdAtTYoEzVzB(view2) == null) {
            return false;
        }
        if (view == null || XdzLv4NdAtTYoEzVzB(view) == null) {
            return true;
        }
        this.f4086pbVGzGjWvY2LDXC8vo.set(0, 0, view.getWidth(), view.getHeight());
        this.f4027Acstmh57AKoSEkEFNJ.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f4086pbVGzGjWvY2LDXC8vo);
        offsetDescendantRectToMyCoords(view2, this.f4027Acstmh57AKoSEkEFNJ);
        char c = 65535;
        int i3 = this.f4048T9PhQIpGRhE4yZDm1C.Tu4WCh2gEwj8E4oHbP() == 1 ? -1 : 1;
        Rect rect = this.f4086pbVGzGjWvY2LDXC8vo;
        int i4 = rect.left;
        Rect rect2 = this.f4027Acstmh57AKoSEkEFNJ;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + lLKzvdU99Iw80uVD5I());
    }

    public void zWzrlx9vIdLp7FoEMD(int i, int i2, Object obj) {
        int i3;
        int iAcstmh57AKoSEkEFNJ = this.f4078husNiw3snxdgZPAGJm.Acstmh57AKoSEkEFNJ();
        int i4 = i + i2;
        for (int i5 = 0; i5 < iAcstmh57AKoSEkEFNJ; i5++) {
            View viewPbVGzGjWvY2LDXC8vo = this.f4078husNiw3snxdgZPAGJm.pbVGzGjWvY2LDXC8vo(i5);
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(viewPbVGzGjWvY2LDXC8vo);
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != null && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.DfpieXfdYs58yZAiXY() && (i3 = oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.f4114HJFh0TGMpafqLE9haL) >= i && i3 < i4) {
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.s3fjYDxWOUexjjVgyA(2);
                oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.lEeR5KfoEr4xU5yHH7(obj);
                ((OANkd3mP6AYvwbNLJM) viewPbVGzGjWvY2LDXC8vo.getLayoutParams()).f4108HJFh0TGMpafqLE9haL = true;
            }
        }
        this.f4087s3fjYDxWOUexjjVgyA.PPkm9uUfOJHHYveeLT(i, i2);
    }

    public final void zXY7dgnTfw9Pd9RXel(long j, OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF2) {
        int iTCyPEKSzIyweCN5yp1 = this.f4078husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1();
        for (int i = 0; i < iTCyPEKSzIyweCN5yp1; i++) {
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = k0CbjZvfUz23r8IN6W(this.f4078husNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(i));
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W != oUd9THiLjZndMj0qdF && osrHU7fvDp2EgxZPfM(oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W) == j) {
                TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f4072e54J8UWNHWALQNixXM;
                if (tCyPEKSzIyweCN5yp1 == null || !tCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W + " \n View Holder 2:" + oUd9THiLjZndMj0qdF + lLKzvdU99Iw80uVD5I());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W + " \n View Holder 2:" + oUd9THiLjZndMj0qdF + lLKzvdU99Iw80uVD5I());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + oUd9THiLjZndMj0qdF2 + " cannot be found but it is necessary for " + oUd9THiLjZndMj0qdF + lLKzvdU99Iw80uVD5I());
    }

    public final boolean zcy2NNbtVXgoGQbfuq(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f4064aPyGSIylzVNKPT1Bls.size();
        for (int i = 0; i < size; i++) {
            sTkWmhpZ5b1ArQIw4K stkwmhpz5b1arqiw4k = (sTkWmhpZ5b1ArQIw4K) this.f4064aPyGSIylzVNKPT1Bls.get(i);
            if (stkwmhpz5b1arqiw4k.lEeR5KfoEr4xU5yHH7(this, motionEvent) && action != 3) {
                this.f4042OANkd3mP6AYvwbNLJM = stkwmhpz5b1arqiw4k;
                return true;
            }
        }
        return false;
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i);
        this.f4082lEeR5KfoEr4xU5yHH7 = new LIMtzhnLwQyigzK0KO();
        this.f4087s3fjYDxWOUexjjVgyA = new G7AC3DWIx9i9fdanjk();
        this.f4037KYHag8HRDlnO3X9zmZ = new androidx.recyclerview.widget.OANkd3mP6AYvwbNLJM();
        this.f4035IPyIQcaNa8aB7drBED = new lEeR5KfoEr4xU5yHH7();
        this.f4086pbVGzGjWvY2LDXC8vo = new Rect();
        this.f4027Acstmh57AKoSEkEFNJ = new Rect();
        this.f4061Z9WdNiOsPR0y54zHW4 = new RectF();
        this.f4077hoXrIDAFrSwfShk8da = new ArrayList();
        this.f4064aPyGSIylzVNKPT1Bls = new ArrayList();
        this.f4032G7AC3DWIx9i9fdanjk = 0;
        this.f4043OUd9THiLjZndMj0qdF = false;
        this.f4079jCtUeU2YI1poCxWcjm = false;
        this.f4058XzJ1BS7H9Ilbkv4eVM = 0;
        this.f4089tXWeW0sqVddf7ZBflq = 0;
        this.f4055W3RZ2dTDKrKpS5Mxdk = new Z9WdNiOsPR0y54zHW4();
        this.f4039KqgKJKIWne3kz1AdHk = new androidx.recyclerview.widget.HJFh0TGMpafqLE9haL();
        this.f4045PPkm9uUfOJHHYveeLT = 0;
        this.f4063aAp6BD79BhftLCnuvf = -1;
        this.f4076hUNBy66ZO1wVLJGW3l = Float.MIN_VALUE;
        this.f4068bMSdooljgH14Jgudph = Float.MIN_VALUE;
        this.f4053Uj8rPa1EWADtk6Oe0S = true;
        this.f4028CSih7GetOUab1dYQjM = new ao3wqKm5CXFuvC0q47();
        this.f4062ZJNyOIPL0usMs2xSAn = f4018Fo9071MN8vwEWamAUX ? new husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA() : null;
        this.f4052Tu4WCh2gEwj8E4oHbP = new WWC27LAMFqFFBzfbNw();
        this.f4046Pum9NZyDBKoCnecvlx = false;
        this.f4070ctWLFN70QQINH1kyYo = false;
        this.f4080jocVUfxESVhVJU8LoH = new T9PhQIpGRhE4yZDm1C();
        this.f4093zXY7dgnTfw9Pd9RXel = false;
        this.f4074evSiTWao80SbJUZk9E = new int[2];
        this.f4031FtYx4GXtxwA8al5hBy = new int[2];
        this.f4066ayduHasC7VpxsVXE0T = new int[2];
        this.f4092xMfAHy6F7qK0zhxhKG = new int[2];
        this.f4036Jsouc4ileb8SxQhxbX = new ArrayList();
        this.f4075fLSSbwbzFBVpwBH5FM = new s3fjYDxWOUexjjVgyA();
        this.f4067bBVlTkqEpHW053CjWL = new zZKhbgvUfsK4AEX3r0();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4060YlLW4G6OV9TFyuw5ix = viewConfiguration.getScaledTouchSlop();
        this.f4076hUNBy66ZO1wVLJGW3l = zcy2NNbtVXgoGQbfuq.KYHag8HRDlnO3X9zmZ(viewConfiguration, context);
        this.f4068bMSdooljgH14Jgudph = zcy2NNbtVXgoGQbfuq.Acstmh57AKoSEkEFNJ(viewConfiguration, context);
        this.f4090udcVtCzLTM1Loe9KrX = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4069cT5Hs3CQpLK8NvlZAw = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4039KqgKJKIWne3kz1AdHk.xHA29AmDt6y96AnB3t(this.f4080jocVUfxESVhVJU8LoH);
        DFYiVi7zXozAjRciKa();
        ayduHasC7VpxsVXE0T();
        FtYx4GXtxwA8al5hBy();
        if (lLKzvdU99Iw80uVD5I.xHA29AmDt6y96AnB3t(this) == 0) {
            lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(this, 1);
        }
        this.f4050THTDvPxsHqMeGb512f = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.Z9WdNiOsPR0y54zHW4(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4685KYHag8HRDlnO3X9zmZ, i, 0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            saveAttributeDataForStyleable(context, bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4685KYHag8HRDlnO3X9zmZ, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4690aPyGSIylzVNKPT1Bls);
        if (typedArrayObtainStyledAttributes.getInt(bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4695pbVGzGjWvY2LDXC8vo, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f4049TCyPEKSzIyweCN5yp1 = typedArrayObtainStyledAttributes.getBoolean(bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4684IPyIQcaNa8aB7drBED, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4682Acstmh57AKoSEkEFNJ, false);
        this.f4059Y43RdunnpKgpbny0lE = z;
        if (z) {
            xMfAHy6F7qK0zhxhKG((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4687T9PhQIpGRhE4yZDm1C), typedArrayObtainStyledAttributes.getDrawable(bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4692hoXrIDAFrSwfShk8da), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4689Z9WdNiOsPR0y54zHW4), typedArrayObtainStyledAttributes.getDrawable(bMSdooljgH14Jgudph.HJFh0TGMpafqLE9haL.f4691e54J8UWNHWALQNixXM));
        }
        typedArrayObtainStyledAttributes.recycle();
        G7AC3DWIx9i9fdanjk(context, string, attributeSet, i, 0);
        int[] iArr = f4025yvdWWG9COQQotjfedH;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (i2 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        }
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = this.f4048T9PhQIpGRhE4yZDm1C;
        if (apygsiylzvnkpt1bls != null) {
            return apygsiylzvnkpt1bls.e2F9F6h8YJxTHwLCa0(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + lLKzvdU99Iw80uVD5I());
    }
}
