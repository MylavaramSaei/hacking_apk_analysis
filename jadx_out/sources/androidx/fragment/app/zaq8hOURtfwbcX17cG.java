package androidx.fragment.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.VItLRw50eXTZeEfGl0;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import zcy2NNbtVXgoGQbfuq.HJFh0TGMpafqLE9haL;

/* loaded from: classes.dex */
public abstract class zaq8hOURtfwbcX17cG {

    /* renamed from: lLKzvdU99Iw80uVD5I, reason: collision with root package name */
    public static boolean f3709lLKzvdU99Iw80uVD5I;

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public Fragment f3710A49QRPHynYLCBN0SqP;

    /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
    public ArrayList f3712DfpieXfdYs58yZAiXY;

    /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
    public ArrayList f3714GyWRxpdt1T8mEJXPoD;

    /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
    public R9SAhYMerGybF9OAjL f3718KqgKJKIWne3kz1AdHk;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public Fragment f3719LIMtzhnLwQyigzK0KO;

    /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
    public boolean f3722OqIo5QF00RDxUQb4qq;

    /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL.C0115HJFh0TGMpafqLE9haL f3723PPkm9uUfOJHHYveeLT;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public ArrayList f3725T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public OnBackPressedDispatcher f3726TCyPEKSzIyweCN5yp1;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public boolean f3729W3RZ2dTDKrKpS5Mxdk;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public boolean f3731XzJ1BS7H9Ilbkv4eVM;

    /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
    public ArrayList f3737e2F9F6h8YJxTHwLCa0;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public ArrayList f3740husNiw3snxdgZPAGJm;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public boolean f3741jCtUeU2YI1poCxWcjm;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f3744s3fjYDxWOUexjjVgyA;

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public boolean f3746tXWeW0sqVddf7ZBflq;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public androidx.fragment.app.IPyIQcaNa8aB7drBED f3747xHA29AmDt6y96AnB3t;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public ArrayList f3748zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ArrayList f3742lEeR5KfoEr4xU5yHH7 = new ArrayList();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final A49QRPHynYLCBN0SqP f3715HJFh0TGMpafqLE9haL = new A49QRPHynYLCBN0SqP();

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final Z9WdNiOsPR0y54zHW4 f3717KYHag8HRDlnO3X9zmZ = new Z9WdNiOsPR0y54zHW4(this);

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final androidx.activity.pbVGzGjWvY2LDXC8vo f3716IPyIQcaNa8aB7drBED = new lEeR5KfoEr4xU5yHH7(false);

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final AtomicInteger f3743pbVGzGjWvY2LDXC8vo = new AtomicInteger();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final Map f3711Acstmh57AKoSEkEFNJ = Collections.synchronizedMap(new HashMap());

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final Map f3733Z9WdNiOsPR0y54zHW4 = Collections.synchronizedMap(new HashMap());

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final Map f3738e54J8UWNHWALQNixXM = Collections.synchronizedMap(new HashMap());

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public final e54J8UWNHWALQNixXM f3739hoXrIDAFrSwfShk8da = new e54J8UWNHWALQNixXM(this);

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public final CopyOnWriteArrayList f3735aPyGSIylzVNKPT1Bls = new CopyOnWriteArrayList();

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public final tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7 f3720OANkd3mP6AYvwbNLJM = new tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7() { // from class: androidx.fragment.app.T9PhQIpGRhE4yZDm1C
        @Override // tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7
        public final void lEeR5KfoEr4xU5yHH7(Object obj) {
            this.f3505lEeR5KfoEr4xU5yHH7.HZ4bptRS9XIcK1CV95((Configuration) obj);
        }
    };

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public final tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7 f3749zaq8hOURtfwbcX17cG = new tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7() { // from class: androidx.fragment.app.hoXrIDAFrSwfShk8da
        @Override // tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7
        public final void lEeR5KfoEr4xU5yHH7(Object obj) {
            this.f3606lEeR5KfoEr4xU5yHH7.aRQ2M7vtRaPDEyvpdv((Integer) obj);
        }
    };

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public final tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7 f3745sTkWmhpZ5b1ArQIw4K = new tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7() { // from class: androidx.fragment.app.aPyGSIylzVNKPT1Bls
        @Override // tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7
        public final void lEeR5KfoEr4xU5yHH7(Object obj) {
            zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg = this.f3597lEeR5KfoEr4xU5yHH7;
            androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(obj);
            zaq8hourtfwbcx17cg.HR5vAalpgOKVm2T0Gq(null);
        }
    };

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public final tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7 f3732Y43RdunnpKgpbny0lE = new tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7() { // from class: androidx.fragment.app.OANkd3mP6AYvwbNLJM
        @Override // tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7
        public final void lEeR5KfoEr4xU5yHH7(Object obj) {
            zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg = this.f3492lEeR5KfoEr4xU5yHH7;
            androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(obj);
            zaq8hourtfwbcx17cg.pgB7Gmjz55y9NQYnAD(null);
        }
    };

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public final W3RZ2dTDKrKpS5Mxdk.LIMtzhnLwQyigzK0KO f3724R9SAhYMerGybF9OAjL = new s3fjYDxWOUexjjVgyA();

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public int f3713G7AC3DWIx9i9fdanjk = -1;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public androidx.fragment.app.pbVGzGjWvY2LDXC8vo f3728VItLRw50eXTZeEfGl0 = null;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public androidx.fragment.app.pbVGzGjWvY2LDXC8vo f3730WWC27LAMFqFFBzfbNw = new HJFh0TGMpafqLE9haL();

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public tXWeW0sqVddf7ZBflq f3727THTDvPxsHqMeGb512f = null;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public tXWeW0sqVddf7ZBflq f3736ao3wqKm5CXFuvC0q47 = new zZKhbgvUfsK4AEX3r0();

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public ArrayDeque f3721OUd9THiLjZndMj0qdF = new ArrayDeque();

    /* renamed from: aAp6BD79BhftLCnuvf, reason: collision with root package name */
    public Runnable f3734aAp6BD79BhftLCnuvf = new husNiw3snxdgZPAGJm();

    public class HJFh0TGMpafqLE9haL extends androidx.fragment.app.pbVGzGjWvY2LDXC8vo {
        public HJFh0TGMpafqLE9haL() {
        }

        @Override // androidx.fragment.app.pbVGzGjWvY2LDXC8vo
        public Fragment lEeR5KfoEr4xU5yHH7(ClassLoader classLoader, String str) {
            zaq8hOURtfwbcX17cG.this.ctWLFN70QQINH1kyYo();
            zaq8hOURtfwbcX17cG.this.ctWLFN70QQINH1kyYo();
            throw null;
        }
    }

    public interface IPyIQcaNa8aB7drBED {
        boolean lEeR5KfoEr4xU5yHH7(ArrayList arrayList, ArrayList arrayList2);
    }

    public class KYHag8HRDlnO3X9zmZ implements G7AC3DWIx9i9fdanjk {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ Fragment f3751lEeR5KfoEr4xU5yHH7;

        public KYHag8HRDlnO3X9zmZ(Fragment fragment) {
            this.f3751lEeR5KfoEr4xU5yHH7 = fragment;
        }
    }

    public static class TCyPEKSzIyweCN5yp1 implements Parcelable {
        public static final Parcelable.Creator<TCyPEKSzIyweCN5yp1> CREATOR = new lEeR5KfoEr4xU5yHH7();

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public String f3753lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f3754s3fjYDxWOUexjjVgyA;

        public class lEeR5KfoEr4xU5yHH7 implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
            public TCyPEKSzIyweCN5yp1 createFromParcel(Parcel parcel) {
                return new TCyPEKSzIyweCN5yp1(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
            public TCyPEKSzIyweCN5yp1[] newArray(int i) {
                return new TCyPEKSzIyweCN5yp1[i];
            }
        }

        public TCyPEKSzIyweCN5yp1(Parcel parcel) {
            this.f3753lEeR5KfoEr4xU5yHH7 = parcel.readString();
            this.f3754s3fjYDxWOUexjjVgyA = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3753lEeR5KfoEr4xU5yHH7);
            parcel.writeInt(this.f3754s3fjYDxWOUexjjVgyA);
        }
    }

    public class husNiw3snxdgZPAGJm implements Runnable {
        public husNiw3snxdgZPAGJm() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zaq8hOURtfwbcX17cG.this.XdzLv4NdAtTYoEzVzB(true);
        }
    }

    public class lEeR5KfoEr4xU5yHH7 extends androidx.activity.pbVGzGjWvY2LDXC8vo {
        public lEeR5KfoEr4xU5yHH7(boolean z) {
            super(z);
        }

        @Override // androidx.activity.pbVGzGjWvY2LDXC8vo
        public void zZKhbgvUfsK4AEX3r0() {
            zaq8hOURtfwbcX17cG.this.xMfAHy6F7qK0zhxhKG();
        }
    }

    public class pbVGzGjWvY2LDXC8vo implements IPyIQcaNa8aB7drBED {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final int f3757HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final String f3758lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final int f3759s3fjYDxWOUexjjVgyA;

        public pbVGzGjWvY2LDXC8vo(String str, int i, int i2) {
            this.f3758lEeR5KfoEr4xU5yHH7 = str;
            this.f3759s3fjYDxWOUexjjVgyA = i;
            this.f3757HJFh0TGMpafqLE9haL = i2;
        }

        @Override // androidx.fragment.app.zaq8hOURtfwbcX17cG.IPyIQcaNa8aB7drBED
        public boolean lEeR5KfoEr4xU5yHH7(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = zaq8hOURtfwbcX17cG.this.f3710A49QRPHynYLCBN0SqP;
            if (fragment == null || this.f3759s3fjYDxWOUexjjVgyA >= 0 || this.f3758lEeR5KfoEr4xU5yHH7 != null || !fragment.hoXrIDAFrSwfShk8da().owCQzRKpGarpL4247z()) {
                return zaq8hOURtfwbcX17cG.this.yXUWiIShOcfJRNCmU8(arrayList, arrayList2, this.f3758lEeR5KfoEr4xU5yHH7, this.f3759s3fjYDxWOUexjjVgyA, this.f3757HJFh0TGMpafqLE9haL);
            }
            return false;
        }
    }

    public class s3fjYDxWOUexjjVgyA implements W3RZ2dTDKrKpS5Mxdk.LIMtzhnLwQyigzK0KO {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.LIMtzhnLwQyigzK0KO
        public boolean HJFh0TGMpafqLE9haL(MenuItem menuItem) {
            return zaq8hOURtfwbcX17cG.this.OUd9THiLjZndMj0qdF(menuItem);
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.LIMtzhnLwQyigzK0KO
        public void lEeR5KfoEr4xU5yHH7(Menu menu, MenuInflater menuInflater) {
            zaq8hOURtfwbcX17cG.this.A49QRPHynYLCBN0SqP(menu, menuInflater);
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.LIMtzhnLwQyigzK0KO
        public void s3fjYDxWOUexjjVgyA(Menu menu) {
            zaq8hOURtfwbcX17cG.this.tXWeW0sqVddf7ZBflq(menu);
        }
    }

    public class zZKhbgvUfsK4AEX3r0 implements tXWeW0sqVddf7ZBflq {
        public zZKhbgvUfsK4AEX3r0() {
        }

        @Override // androidx.fragment.app.tXWeW0sqVddf7ZBflq
        public XzJ1BS7H9Ilbkv4eVM lEeR5KfoEr4xU5yHH7(ViewGroup viewGroup) {
            return new androidx.fragment.app.zZKhbgvUfsK4AEX3r0(viewGroup);
        }
    }

    public static Fragment FtYx4GXtxwA8al5hBy(View view) {
        Object tag = view.getTag(LU0fFDMACqnfIfA1AZ.s3fjYDxWOUexjjVgyA.f937lEeR5KfoEr4xU5yHH7);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static Fragment Uj8rPa1EWADtk6Oe0S(View view) {
        while (view != null) {
            Fragment fragmentFtYx4GXtxwA8al5hBy = FtYx4GXtxwA8al5hBy(view);
            if (fragmentFtYx4GXtxwA8al5hBy != null) {
                return fragmentFtYx4GXtxwA8al5hBy;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static zaq8hOURtfwbcX17cG bMSdooljgH14Jgudph(View view) {
        Fragment fragmentUj8rPa1EWADtk6Oe0S = Uj8rPa1EWADtk6Oe0S(view);
        if (fragmentUj8rPa1EWADtk6Oe0S == null) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        }
        if (fragmentUj8rPa1EWADtk6Oe0S.LU0fFDMACqnfIfA1AZ()) {
            return fragmentUj8rPa1EWADtk6Oe0S.hoXrIDAFrSwfShk8da();
        }
        throw new IllegalStateException("The Fragment " + fragmentUj8rPa1EWADtk6Oe0S + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
    }

    public static int e5tXAuLbtMC3XyEoX9(int i) {
        int i2 = 4097;
        if (i == 4097) {
            return 8194;
        }
        if (i != 8194) {
            i2 = 8197;
            if (i == 8197) {
                return 4100;
            }
            if (i == 4099) {
                return 4099;
            }
            if (i != 4100) {
                return 0;
            }
        }
        return i2;
    }

    public static boolean yvdWWG9COQQotjfedH(int i) {
        return f3709lLKzvdU99Iw80uVD5I || Log.isLoggable("FragmentManager", i);
    }

    public static void zcy2NNbtVXgoGQbfuq(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        while (i < i2) {
            androidx.fragment.app.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (androidx.fragment.app.lEeR5KfoEr4xU5yHH7) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                leer5kfoer4xu5yhh7.aPyGSIylzVNKPT1Bls(-1);
                leer5kfoer4xu5yhh7.R9SAhYMerGybF9OAjL();
            } else {
                leer5kfoer4xu5yhh7.aPyGSIylzVNKPT1Bls(1);
                leer5kfoer4xu5yhh7.Y43RdunnpKgpbny0lE();
            }
            i++;
        }
    }

    public boolean A49QRPHynYLCBN0SqP(Menu menu, MenuInflater menuInflater) {
        if (this.f3713G7AC3DWIx9i9fdanjk < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f3715HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C()) {
            if (fragment != null && Fo9071MN8vwEWamAUX(fragment) && fragment.Fo9071MN8vwEWamAUX(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f3740husNiw3snxdgZPAGJm != null) {
            for (int i = 0; i < this.f3740husNiw3snxdgZPAGJm.size(); i++) {
                Fragment fragment2 = (Fragment) this.f3740husNiw3snxdgZPAGJm.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.Tu4WCh2gEwj8E4oHbP();
                }
            }
        }
        this.f3740husNiw3snxdgZPAGJm = arrayList;
        return z;
    }

    public int Acstmh57AKoSEkEFNJ() {
        return this.f3743pbVGzGjWvY2LDXC8vo.getAndIncrement();
    }

    public void Bc5OTyAfOKVCQb8CEz(int i, boolean z) {
        if (i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f3713G7AC3DWIx9i9fdanjk) {
            this.f3713G7AC3DWIx9i9fdanjk = i;
            this.f3715HJFh0TGMpafqLE9haL.sTkWmhpZ5b1ArQIw4K();
            h7m69eGbRk1hyaVt28();
        }
    }

    public final void CSih7GetOUab1dYQjM() {
        Iterator it = zaq8hOURtfwbcX17cG().iterator();
        while (it.hasNext()) {
            ((XzJ1BS7H9Ilbkv4eVM) it.next()).Z9WdNiOsPR0y54zHW4();
        }
    }

    public HJFh0TGMpafqLE9haL.C0115HJFh0TGMpafqLE9haL DFYiVi7zXozAjRciKa() {
        return this.f3723PPkm9uUfOJHHYveeLT;
    }

    public final void DfpieXfdYs58yZAiXY(int i) {
        try {
            this.f3744s3fjYDxWOUexjjVgyA = true;
            this.f3715HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(i);
            Bc5OTyAfOKVCQb8CEz(i, false);
            Iterator it = zaq8hOURtfwbcX17cG().iterator();
            while (it.hasNext()) {
                ((XzJ1BS7H9Ilbkv4eVM) it.next()).Acstmh57AKoSEkEFNJ();
            }
            this.f3744s3fjYDxWOUexjjVgyA = false;
            XdzLv4NdAtTYoEzVzB(true);
        } catch (Throwable th) {
            this.f3744s3fjYDxWOUexjjVgyA = false;
            throw th;
        }
    }

    public boolean Er40JrQbOM51vCQI8w(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg = fragment.f3425Y43RdunnpKgpbny0lE;
        return fragment.equals(zaq8hourtfwbcx17cg.eWK41qw3g36LVd4UnS()) && Er40JrQbOM51vCQI8w(zaq8hourtfwbcx17cg.f3719LIMtzhnLwQyigzK0KO);
    }

    public void EscIOBqRhG6irG5q11(Fragment fragment) {
        if (fragment == null || fragment.equals(oocVJL811qFf0j0XXZ(fragment.f3437husNiw3snxdgZPAGJm))) {
            Fragment fragment2 = this.f3710A49QRPHynYLCBN0SqP;
            this.f3710A49QRPHynYLCBN0SqP = fragment;
            jCtUeU2YI1poCxWcjm(fragment2);
            jCtUeU2YI1poCxWcjm(this.f3710A49QRPHynYLCBN0SqP);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public boolean Fo9071MN8vwEWamAUX(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.oocVJL811qFf0j0XXZ();
    }

    public void G7AC3DWIx9i9fdanjk() {
        this.f3731XzJ1BS7H9Ilbkv4eVM = false;
        this.f3746tXWeW0sqVddf7ZBflq = false;
        this.f3718KqgKJKIWne3kz1AdHk.T9PhQIpGRhE4yZDm1C(false);
        DfpieXfdYs58yZAiXY(4);
    }

    public void GyWRxpdt1T8mEJXPoD() {
        this.f3731XzJ1BS7H9Ilbkv4eVM = false;
        this.f3746tXWeW0sqVddf7ZBflq = false;
        this.f3718KqgKJKIWne3kz1AdHk.T9PhQIpGRhE4yZDm1C(false);
        DfpieXfdYs58yZAiXY(5);
    }

    public final /* synthetic */ void HR5vAalpgOKVm2T0Gq(xHA29AmDt6y96AnB3t.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        if (iQCvttGuB7nx4r7kMP()) {
            throw null;
        }
    }

    public final /* synthetic */ void HZ4bptRS9XIcK1CV95(Configuration configuration) {
        if (iQCvttGuB7nx4r7kMP()) {
            xHA29AmDt6y96AnB3t(configuration, false);
        }
    }

    public LIMtzhnLwQyigzK0KO IPyIQcaNa8aB7drBED(Fragment fragment) {
        String str = fragment.f3440lLKzvdU99Iw80uVD5I;
        if (str != null) {
            zcy2NNbtVXgoGQbfuq.HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(fragment, str);
        }
        if (yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KOY43RdunnpKgpbny0lE = Y43RdunnpKgpbny0lE(fragment);
        fragment.f3425Y43RdunnpKgpbny0lE = this;
        this.f3715HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(lIMtzhnLwQyigzK0KOY43RdunnpKgpbny0lE);
        if (!fragment.f3422WWC27LAMFqFFBzfbNw) {
            this.f3715HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(fragment);
            fragment.f3434e54J8UWNHWALQNixXM = false;
            if (fragment.f3421W3RZ2dTDKrKpS5Mxdk == null) {
                fragment.f3408KqgKJKIWne3kz1AdHk = false;
            }
            if (O1furmptfI76BGfN0d(fragment)) {
                this.f3741jCtUeU2YI1poCxWcjm = true;
            }
        }
        return lIMtzhnLwQyigzK0KOY43RdunnpKgpbny0lE;
    }

    public Bundle JXsqbvi9UKxeF3HXpU() {
        androidx.fragment.app.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr;
        int size;
        Bundle bundle = new Bundle();
        CSih7GetOUab1dYQjM();
        aAp6BD79BhftLCnuvf();
        XdzLv4NdAtTYoEzVzB(true);
        this.f3731XzJ1BS7H9Ilbkv4eVM = true;
        this.f3718KqgKJKIWne3kz1AdHk.T9PhQIpGRhE4yZDm1C(true);
        ArrayList arrayListLIMtzhnLwQyigzK0KO = this.f3715HJFh0TGMpafqLE9haL.LIMtzhnLwQyigzK0KO();
        ArrayList arrayListZ9WdNiOsPR0y54zHW4 = this.f3715HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4();
        if (!arrayListZ9WdNiOsPR0y54zHW4.isEmpty()) {
            ArrayList arrayListA49QRPHynYLCBN0SqP = this.f3715HJFh0TGMpafqLE9haL.A49QRPHynYLCBN0SqP();
            ArrayList arrayList = this.f3748zZKhbgvUfsK4AEX3r0;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                s3fjydxwouexjjvgyaArr = null;
            } else {
                s3fjydxwouexjjvgyaArr = new androidx.fragment.app.s3fjYDxWOUexjjVgyA[size];
                for (int i = 0; i < size; i++) {
                    s3fjydxwouexjjvgyaArr[i] = new androidx.fragment.app.s3fjYDxWOUexjjVgyA((androidx.fragment.app.lEeR5KfoEr4xU5yHH7) this.f3748zZKhbgvUfsK4AEX3r0.get(i));
                    if (yvdWWG9COQQotjfedH(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f3748zZKhbgvUfsK4AEX3r0.get(i));
                    }
                }
            }
            Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = new Y43RdunnpKgpbny0lE();
            y43RdunnpKgpbny0lE.f3593lEeR5KfoEr4xU5yHH7 = arrayListLIMtzhnLwQyigzK0KO;
            y43RdunnpKgpbny0lE.f3594s3fjYDxWOUexjjVgyA = arrayListA49QRPHynYLCBN0SqP;
            y43RdunnpKgpbny0lE.f3588HJFh0TGMpafqLE9haL = s3fjydxwouexjjvgyaArr;
            y43RdunnpKgpbny0lE.f3595zZKhbgvUfsK4AEX3r0 = this.f3743pbVGzGjWvY2LDXC8vo.get();
            Fragment fragment = this.f3710A49QRPHynYLCBN0SqP;
            if (fragment != null) {
                y43RdunnpKgpbny0lE.f3592husNiw3snxdgZPAGJm = fragment.f3437husNiw3snxdgZPAGJm;
            }
            y43RdunnpKgpbny0lE.f3590KYHag8HRDlnO3X9zmZ.addAll(this.f3711Acstmh57AKoSEkEFNJ.keySet());
            y43RdunnpKgpbny0lE.f3591TCyPEKSzIyweCN5yp1.addAll(this.f3711Acstmh57AKoSEkEFNJ.values());
            y43RdunnpKgpbny0lE.f3589IPyIQcaNa8aB7drBED = new ArrayList(this.f3721OUd9THiLjZndMj0qdF);
            bundle.putParcelable("state", y43RdunnpKgpbny0lE);
            for (String str : this.f3733Z9WdNiOsPR0y54zHW4.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f3733Z9WdNiOsPR0y54zHW4.get(str));
            }
            Iterator it = arrayListZ9WdNiOsPR0y54zHW4.iterator();
            while (it.hasNext()) {
                xHA29AmDt6y96AnB3t xha29amdt6y96anb3t = (xHA29AmDt6y96AnB3t) it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", xha29amdt6y96anb3t);
                bundle.putBundle("fragment_" + xha29amdt6y96anb3t.f3661s3fjYDxWOUexjjVgyA, bundle2);
            }
        } else if (yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public void Jsouc4ileb8SxQhxbX(Fragment fragment) {
        if (yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f3420VItLRw50eXTZeEfGl0) {
            return;
        }
        fragment.f3420VItLRw50eXTZeEfGl0 = true;
        fragment.f3408KqgKJKIWne3kz1AdHk = true ^ fragment.f3408KqgKJKIWne3kz1AdHk;
        g0OBkYSIvp0JYnHPjC(fragment);
    }

    public final ViewGroup Kh0uC90qEEhuLdpgB9(Fragment fragment) {
        ViewGroup viewGroup = fragment.f3445tXWeW0sqVddf7ZBflq;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f3409LIMtzhnLwQyigzK0KO > 0 && this.f3747xHA29AmDt6y96AnB3t.s3fjYDxWOUexjjVgyA()) {
            View viewLEeR5KfoEr4xU5yHH7 = this.f3747xHA29AmDt6y96AnB3t.lEeR5KfoEr4xU5yHH7(fragment.f3409LIMtzhnLwQyigzK0KO);
            if (viewLEeR5KfoEr4xU5yHH7 instanceof ViewGroup) {
                return (ViewGroup) viewLEeR5KfoEr4xU5yHH7;
            }
        }
        return null;
    }

    public void KqgKJKIWne3kz1AdHk() {
        DfpieXfdYs58yZAiXY(2);
    }

    public final void LFGi8lLul9XOP250o9() {
        synchronized (this.f3742lEeR5KfoEr4xU5yHH7) {
            try {
                if (this.f3742lEeR5KfoEr4xU5yHH7.isEmpty()) {
                    this.f3716IPyIQcaNa8aB7drBED.Acstmh57AKoSEkEFNJ(ZJNyOIPL0usMs2xSAn() > 0 && Er40JrQbOM51vCQI8w(this.f3719LIMtzhnLwQyigzK0KO));
                } else {
                    this.f3716IPyIQcaNa8aB7drBED.Acstmh57AKoSEkEFNJ(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void LIMtzhnLwQyigzK0KO() {
        this.f3731XzJ1BS7H9Ilbkv4eVM = false;
        this.f3746tXWeW0sqVddf7ZBflq = false;
        this.f3718KqgKJKIWne3kz1AdHk.T9PhQIpGRhE4yZDm1C(false);
        DfpieXfdYs58yZAiXY(1);
    }

    public void LU0fFDMACqnfIfA1AZ(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, boolean z) {
        if (z) {
            return;
        }
        ToH8yzk8U1nKT0PUfY(z);
        if (iPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(this.f3714GyWRxpdt1T8mEJXPoD, this.f3712DfpieXfdYs58yZAiXY)) {
            this.f3744s3fjYDxWOUexjjVgyA = true;
            try {
                oOMFI1Dcqcg1BSVNty(this.f3714GyWRxpdt1T8mEJXPoD, this.f3712DfpieXfdYs58yZAiXY);
            } finally {
                aPyGSIylzVNKPT1Bls();
            }
        }
        LFGi8lLul9XOP250o9();
        PPkm9uUfOJHHYveeLT();
        this.f3715HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA();
    }

    public final boolean O1furmptfI76BGfN0d(Fragment fragment) {
        return (fragment.f3412OUd9THiLjZndMj0qdF && fragment.f3438jCtUeU2YI1poCxWcjm) || fragment.f3415R9SAhYMerGybF9OAjL.hoXrIDAFrSwfShk8da();
    }

    public final void OANkd3mP6AYvwbNLJM() {
        throw null;
    }

    public boolean OUd9THiLjZndMj0qdF(MenuItem menuItem) {
        if (this.f3713G7AC3DWIx9i9fdanjk < 1) {
            return false;
        }
        for (Fragment fragment : this.f3715HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C()) {
            if (fragment != null && fragment.HR5vAalpgOKVm2T0Gq(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void OWyIJu8lIXxQlvLhaC(Fragment fragment) {
        if (yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f3444sTkWmhpZ5b1ArQIw4K);
        }
        boolean z = !fragment.YlLW4G6OV9TFyuw5ix();
        if (!fragment.f3422WWC27LAMFqFFBzfbNw || z) {
            this.f3715HJFh0TGMpafqLE9haL.Y43RdunnpKgpbny0lE(fragment);
            if (O1furmptfI76BGfN0d(fragment)) {
                this.f3741jCtUeU2YI1poCxWcjm = true;
            }
            fragment.f3434e54J8UWNHWALQNixXM = true;
            g0OBkYSIvp0JYnHPjC(fragment);
        }
    }

    public void OqIo5QF00RDxUQb4qq() {
        this.f3731XzJ1BS7H9Ilbkv4eVM = false;
        this.f3746tXWeW0sqVddf7ZBflq = false;
        this.f3718KqgKJKIWne3kz1AdHk.T9PhQIpGRhE4yZDm1C(false);
        DfpieXfdYs58yZAiXY(7);
    }

    public void PDw1hXOtArGjUqFgpT(Fragment fragment) {
        if (yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f3420VItLRw50eXTZeEfGl0) {
            fragment.f3420VItLRw50eXTZeEfGl0 = false;
            fragment.f3408KqgKJKIWne3kz1AdHk = !fragment.f3408KqgKJKIWne3kz1AdHk;
        }
    }

    public final void PPkm9uUfOJHHYveeLT() {
        if (this.f3722OqIo5QF00RDxUQb4qq) {
            this.f3722OqIo5QF00RDxUQb4qq = false;
            h7m69eGbRk1hyaVt28();
        }
    }

    public androidx.fragment.app.pbVGzGjWvY2LDXC8vo Pum9NZyDBKoCnecvlx() {
        androidx.fragment.app.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = this.f3728VItLRw50eXTZeEfGl0;
        if (pbvgzgjwvy2ldxc8vo != null) {
            return pbvgzgjwvy2ldxc8vo;
        }
        Fragment fragment = this.f3719LIMtzhnLwQyigzK0KO;
        return fragment != null ? fragment.f3425Y43RdunnpKgpbny0lE.Pum9NZyDBKoCnecvlx() : this.f3730WWC27LAMFqFFBzfbNw;
    }

    public final void QW0Trt6m3nVBNaYFnP() {
        ArrayList arrayList = this.f3725T9PhQIpGRhE4yZDm1C;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this.f3725T9PhQIpGRhE4yZDm1C.get(0));
        throw null;
    }

    public void R9SAhYMerGybF9OAjL(Fragment fragment) {
        if (yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f3422WWC27LAMFqFFBzfbNw) {
            return;
        }
        fragment.f3422WWC27LAMFqFFBzfbNw = true;
        if (fragment.f3427Z9WdNiOsPR0y54zHW4) {
            if (yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f3715HJFh0TGMpafqLE9haL.Y43RdunnpKgpbny0lE(fragment);
            if (O1furmptfI76BGfN0d(fragment)) {
                this.f3741jCtUeU2YI1poCxWcjm = true;
            }
            g0OBkYSIvp0JYnHPjC(fragment);
        }
    }

    public VItLRw50eXTZeEfGl0 T9PhQIpGRhE4yZDm1C() {
        return new androidx.fragment.app.lEeR5KfoEr4xU5yHH7(this);
    }

    public void TCyPEKSzIyweCN5yp1(androidx.fragment.app.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (this.f3748zZKhbgvUfsK4AEX3r0 == null) {
            this.f3748zZKhbgvUfsK4AEX3r0 = new ArrayList();
        }
        this.f3748zZKhbgvUfsK4AEX3r0.add(leer5kfoer4xu5yhh7);
    }

    public void THTDvPxsHqMeGb512f(boolean z) {
        for (Fragment fragment : this.f3715HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C()) {
            if (fragment != null) {
                fragment.aRQ2M7vtRaPDEyvpdv();
                if (z) {
                    fragment.f3415R9SAhYMerGybF9OAjL.THTDvPxsHqMeGb512f(true);
                }
            }
        }
    }

    public final void ToH8yzk8U1nKT0PUfY(boolean z) {
        if (this.f3744s3fjYDxWOUexjjVgyA) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (!this.f3729W3RZ2dTDKrKpS5Mxdk) {
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        throw new IllegalStateException("FragmentManager has been destroyed");
    }

    public final R9SAhYMerGybF9OAjL Tu4WCh2gEwj8E4oHbP(Fragment fragment) {
        return this.f3718KqgKJKIWne3kz1AdHk.pbVGzGjWvY2LDXC8vo(fragment);
    }

    public void VItLRw50eXTZeEfGl0() {
        this.f3729W3RZ2dTDKrKpS5Mxdk = true;
        XdzLv4NdAtTYoEzVzB(true);
        aAp6BD79BhftLCnuvf();
        OANkd3mP6AYvwbNLJM();
        DfpieXfdYs58yZAiXY(-1);
        this.f3747xHA29AmDt6y96AnB3t = null;
        this.f3719LIMtzhnLwQyigzK0KO = null;
        if (this.f3726TCyPEKSzIyweCN5yp1 != null) {
            this.f3716IPyIQcaNa8aB7drBED.IPyIQcaNa8aB7drBED();
            this.f3726TCyPEKSzIyweCN5yp1 = null;
        }
    }

    public void W3RZ2dTDKrKpS5Mxdk() {
        LFGi8lLul9XOP250o9();
        jCtUeU2YI1poCxWcjm(this.f3710A49QRPHynYLCBN0SqP);
    }

    public void WWC27LAMFqFFBzfbNw() {
        DfpieXfdYs58yZAiXY(1);
    }

    public boolean XdzLv4NdAtTYoEzVzB(boolean z) {
        ToH8yzk8U1nKT0PUfY(z);
        boolean z2 = false;
        while (osrHU7fvDp2EgxZPfM(this.f3714GyWRxpdt1T8mEJXPoD, this.f3712DfpieXfdYs58yZAiXY)) {
            z2 = true;
            this.f3744s3fjYDxWOUexjjVgyA = true;
            try {
                oOMFI1Dcqcg1BSVNty(this.f3714GyWRxpdt1T8mEJXPoD, this.f3712DfpieXfdYs58yZAiXY);
            } finally {
                aPyGSIylzVNKPT1Bls();
            }
        }
        LFGi8lLul9XOP250o9();
        PPkm9uUfOJHHYveeLT();
        this.f3715HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA();
        return z2;
    }

    public void XzJ1BS7H9Ilbkv4eVM() {
        DfpieXfdYs58yZAiXY(5);
    }

    public LIMtzhnLwQyigzK0KO Y43RdunnpKgpbny0lE(Fragment fragment) {
        LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KOE54J8UWNHWALQNixXM = this.f3715HJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM(fragment.f3437husNiw3snxdgZPAGJm);
        if (lIMtzhnLwQyigzK0KOE54J8UWNHWALQNixXM != null) {
            return lIMtzhnLwQyigzK0KOE54J8UWNHWALQNixXM;
        }
        new LIMtzhnLwQyigzK0KO(this.f3739hoXrIDAFrSwfShk8da, this.f3715HJFh0TGMpafqLE9haL, fragment);
        throw null;
    }

    public final void YlLW4G6OV9TFyuw5ix(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = ((androidx.fragment.app.lEeR5KfoEr4xU5yHH7) arrayList.get(i)).f3545sTkWmhpZ5b1ArQIw4K;
        ArrayList arrayList3 = this.f3737e2F9F6h8YJxTHwLCa0;
        if (arrayList3 == null) {
            this.f3737e2F9F6h8YJxTHwLCa0 = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f3737e2F9F6h8YJxTHwLCa0.addAll(this.f3715HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C());
        Fragment fragmentEWK41qw3g36LVd4UnS = eWK41qw3g36LVd4UnS();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            androidx.fragment.app.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (androidx.fragment.app.lEeR5KfoEr4xU5yHH7) arrayList.get(i3);
            fragmentEWK41qw3g36LVd4UnS = !((Boolean) arrayList2.get(i3)).booleanValue() ? leer5kfoer4xu5yhh7.G7AC3DWIx9i9fdanjk(this.f3737e2F9F6h8YJxTHwLCa0, fragmentEWK41qw3g36LVd4UnS) : leer5kfoer4xu5yhh7.A49QRPHynYLCBN0SqP(this.f3737e2F9F6h8YJxTHwLCa0, fragmentEWK41qw3g36LVd4UnS);
            z2 = z2 || leer5kfoer4xu5yhh7.f3543pbVGzGjWvY2LDXC8vo;
        }
        this.f3737e2F9F6h8YJxTHwLCa0.clear();
        if (!z && this.f3713G7AC3DWIx9i9fdanjk >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator it = ((androidx.fragment.app.lEeR5KfoEr4xU5yHH7) arrayList.get(i4)).f3530HJFh0TGMpafqLE9haL.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7) it.next()).f3555s3fjYDxWOUexjjVgyA;
                    if (fragment != null && fragment.f3425Y43RdunnpKgpbny0lE != null) {
                        this.f3715HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(Y43RdunnpKgpbny0lE(fragment));
                    }
                }
            }
        }
        zcy2NNbtVXgoGQbfuq(arrayList, arrayList2, i, i2);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        for (int i5 = i; i5 < i2; i5++) {
            androidx.fragment.app.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = (androidx.fragment.app.lEeR5KfoEr4xU5yHH7) arrayList.get(i5);
            if (zBooleanValue) {
                for (int size = leer5kfoer4xu5yhh72.f3530HJFh0TGMpafqLE9haL.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7) leer5kfoer4xu5yhh72.f3530HJFh0TGMpafqLE9haL.get(size)).f3555s3fjYDxWOUexjjVgyA;
                    if (fragment2 != null) {
                        Y43RdunnpKgpbny0lE(fragment2).T9PhQIpGRhE4yZDm1C();
                    }
                }
            } else {
                Iterator it2 = leer5kfoer4xu5yhh72.f3530HJFh0TGMpafqLE9haL.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = ((VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7) it2.next()).f3555s3fjYDxWOUexjjVgyA;
                    if (fragment3 != null) {
                        Y43RdunnpKgpbny0lE(fragment3).T9PhQIpGRhE4yZDm1C();
                    }
                }
            }
        }
        Bc5OTyAfOKVCQb8CEz(this.f3713G7AC3DWIx9i9fdanjk, true);
        for (XzJ1BS7H9Ilbkv4eVM xzJ1BS7H9Ilbkv4eVM : sTkWmhpZ5b1ArQIw4K(arrayList, i, i2)) {
            xzJ1BS7H9Ilbkv4eVM.sTkWmhpZ5b1ArQIw4K(zBooleanValue);
            xzJ1BS7H9Ilbkv4eVM.OANkd3mP6AYvwbNLJM();
            xzJ1BS7H9Ilbkv4eVM.TCyPEKSzIyweCN5yp1();
        }
        while (i < i2) {
            androidx.fragment.app.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh73 = (androidx.fragment.app.lEeR5KfoEr4xU5yHH7) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue() && leer5kfoer4xu5yhh73.f3634xHA29AmDt6y96AnB3t >= 0) {
                leer5kfoer4xu5yhh73.f3634xHA29AmDt6y96AnB3t = -1;
            }
            leer5kfoer4xu5yhh73.LIMtzhnLwQyigzK0KO();
            i++;
        }
        if (z2) {
            QW0Trt6m3nVBNaYFnP();
        }
    }

    public boolean Ywqw2A0s86HeuFkDt0(int i) {
        return this.f3713G7AC3DWIx9i9fdanjk >= i;
    }

    public void Z9WdNiOsPR0y54zHW4(Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ, androidx.fragment.app.IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, Fragment fragment) {
        this.f3747xHA29AmDt6y96AnB3t = iPyIQcaNa8aB7drBED;
        this.f3719LIMtzhnLwQyigzK0KO = fragment;
        if (fragment != null) {
            pbVGzGjWvY2LDXC8vo(new KYHag8HRDlnO3X9zmZ(fragment));
        }
        if (this.f3719LIMtzhnLwQyigzK0KO != null) {
            LFGi8lLul9XOP250o9();
        }
        this.f3718KqgKJKIWne3kz1AdHk = fragment != null ? fragment.f3425Y43RdunnpKgpbny0lE.Tu4WCh2gEwj8E4oHbP(fragment) : new R9SAhYMerGybF9OAjL(false);
        this.f3718KqgKJKIWne3kz1AdHk.T9PhQIpGRhE4yZDm1C(f2zPq7MOnQrtOlZ1Zg());
        this.f3715HJFh0TGMpafqLE9haL.VItLRw50eXTZeEfGl0(this.f3718KqgKJKIWne3kz1AdHk);
    }

    public int ZJNyOIPL0usMs2xSAn() {
        ArrayList arrayList = this.f3748zZKhbgvUfsK4AEX3r0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void aAp6BD79BhftLCnuvf() {
        Iterator it = zaq8hOURtfwbcX17cG().iterator();
        while (it.hasNext()) {
            ((XzJ1BS7H9Ilbkv4eVM) it.next()).Acstmh57AKoSEkEFNJ();
        }
    }

    public final void aPyGSIylzVNKPT1Bls() {
        this.f3744s3fjYDxWOUexjjVgyA = false;
        this.f3712DfpieXfdYs58yZAiXY.clear();
        this.f3714GyWRxpdt1T8mEJXPoD.clear();
    }

    public final /* synthetic */ void aRQ2M7vtRaPDEyvpdv(Integer num) {
        if (iQCvttGuB7nx4r7kMP() && num.intValue() == 80) {
            THTDvPxsHqMeGb512f(false);
        }
    }

    public void aUn6Hqsqw2PVM8685Z() {
    }

    public void ao3wqKm5CXFuvC0q47() {
        for (Fragment fragment : this.f3715HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ()) {
            if (fragment != null) {
                fragment.ctWLFN70QQINH1kyYo(fragment.zcy2NNbtVXgoGQbfuq());
                fragment.f3415R9SAhYMerGybF9OAjL.ao3wqKm5CXFuvC0q47();
            }
        }
    }

    public androidx.lifecycle.ao3wqKm5CXFuvC0q47 ayduHasC7VpxsVXE0T(Fragment fragment) {
        return this.f3718KqgKJKIWne3kz1AdHk.Z9WdNiOsPR0y54zHW4(fragment);
    }

    public boolean bBVlTkqEpHW053CjWL() {
        return this.f3729W3RZ2dTDKrKpS5Mxdk;
    }

    public Fragment cT5Hs3CQpLK8NvlZAw(int i) {
        return this.f3715HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(i);
    }

    public Acstmh57AKoSEkEFNJ ctWLFN70QQINH1kyYo() {
        return null;
    }

    public void d4ZdBAtGyjVWTQYsYn(Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && bundle.getBundle(str) != null) {
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && bundle.getBundle(str2) != null) {
                throw null;
            }
        }
        this.f3715HJFh0TGMpafqLE9haL.xHA29AmDt6y96AnB3t(arrayList);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = (Y43RdunnpKgpbny0lE) bundle.getParcelable("state");
        if (y43RdunnpKgpbny0lE == null) {
            return;
        }
        this.f3715HJFh0TGMpafqLE9haL.R9SAhYMerGybF9OAjL();
        Iterator it = y43RdunnpKgpbny0lE.f3593lEeR5KfoEr4xU5yHH7.iterator();
        while (it.hasNext()) {
            xHA29AmDt6y96AnB3t xha29amdt6y96anb3tWWC27LAMFqFFBzfbNw = this.f3715HJFh0TGMpafqLE9haL.WWC27LAMFqFFBzfbNw((String) it.next(), null);
            if (xha29amdt6y96anb3tWWC27LAMFqFFBzfbNw != null) {
                Fragment fragmentIPyIQcaNa8aB7drBED = this.f3718KqgKJKIWne3kz1AdHk.IPyIQcaNa8aB7drBED(xha29amdt6y96anb3tWWC27LAMFqFFBzfbNw.f3661s3fjYDxWOUexjjVgyA);
                fragmentIPyIQcaNa8aB7drBED.getClass();
                if (yvdWWG9COQQotjfedH(2)) {
                    Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentIPyIQcaNa8aB7drBED);
                }
                Fragment fragmentZ9WdNiOsPR0y54zHW4 = new LIMtzhnLwQyigzK0KO(this.f3739hoXrIDAFrSwfShk8da, this.f3715HJFh0TGMpafqLE9haL, fragmentIPyIQcaNa8aB7drBED, xha29amdt6y96anb3tWWC27LAMFqFFBzfbNw).Z9WdNiOsPR0y54zHW4();
                fragmentZ9WdNiOsPR0y54zHW4.f3425Y43RdunnpKgpbny0lE = this;
                if (!yvdWWG9COQQotjfedH(2)) {
                    throw null;
                }
                Log.v("FragmentManager", "restoreSaveState: active (" + fragmentZ9WdNiOsPR0y54zHW4.f3437husNiw3snxdgZPAGJm + "): " + fragmentZ9WdNiOsPR0y54zHW4);
                throw null;
            }
        }
        for (Fragment fragment : this.f3718KqgKJKIWne3kz1AdHk.Acstmh57AKoSEkEFNJ()) {
            if (!this.f3715HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(fragment.f3437husNiw3snxdgZPAGJm)) {
                if (yvdWWG9COQQotjfedH(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + y43RdunnpKgpbny0lE.f3593lEeR5KfoEr4xU5yHH7);
                }
                this.f3718KqgKJKIWne3kz1AdHk.e54J8UWNHWALQNixXM(fragment);
                fragment.f3425Y43RdunnpKgpbny0lE = this;
                LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO = new LIMtzhnLwQyigzK0KO(this.f3739hoXrIDAFrSwfShk8da, this.f3715HJFh0TGMpafqLE9haL, fragment);
                lIMtzhnLwQyigzK0KO.Y43RdunnpKgpbny0lE(1);
                lIMtzhnLwQyigzK0KO.T9PhQIpGRhE4yZDm1C();
                fragment.f3434e54J8UWNHWALQNixXM = true;
                lIMtzhnLwQyigzK0KO.T9PhQIpGRhE4yZDm1C();
            }
        }
        this.f3715HJFh0TGMpafqLE9haL.G7AC3DWIx9i9fdanjk(y43RdunnpKgpbny0lE.f3594s3fjYDxWOUexjjVgyA);
        if (y43RdunnpKgpbny0lE.f3588HJFh0TGMpafqLE9haL != null) {
            this.f3748zZKhbgvUfsK4AEX3r0 = new ArrayList(y43RdunnpKgpbny0lE.f3588HJFh0TGMpafqLE9haL.length);
            int i = 0;
            while (true) {
                androidx.fragment.app.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr = y43RdunnpKgpbny0lE.f3588HJFh0TGMpafqLE9haL;
                if (i >= s3fjydxwouexjjvgyaArr.length) {
                    break;
                }
                androidx.fragment.app.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0 = s3fjydxwouexjjvgyaArr[i].zZKhbgvUfsK4AEX3r0(this);
                if (yvdWWG9COQQotjfedH(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0.f3634xHA29AmDt6y96AnB3t + "): " + leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0);
                    PrintWriter printWriter = new PrintWriter(new jCtUeU2YI1poCxWcjm("FragmentManager"));
                    leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0.sTkWmhpZ5b1ArQIw4K("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3748zZKhbgvUfsK4AEX3r0.add(leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0);
                i++;
            }
        } else {
            this.f3748zZKhbgvUfsK4AEX3r0 = null;
        }
        this.f3743pbVGzGjWvY2LDXC8vo.set(y43RdunnpKgpbny0lE.f3595zZKhbgvUfsK4AEX3r0);
        String str3 = y43RdunnpKgpbny0lE.f3592husNiw3snxdgZPAGJm;
        if (str3 != null) {
            Fragment fragmentOocVJL811qFf0j0XXZ = oocVJL811qFf0j0XXZ(str3);
            this.f3710A49QRPHynYLCBN0SqP = fragmentOocVJL811qFf0j0XXZ;
            jCtUeU2YI1poCxWcjm(fragmentOocVJL811qFf0j0XXZ);
        }
        ArrayList arrayList2 = y43RdunnpKgpbny0lE.f3590KYHag8HRDlnO3X9zmZ;
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                this.f3711Acstmh57AKoSEkEFNJ.put((String) arrayList2.get(i2), (androidx.fragment.app.HJFh0TGMpafqLE9haL) y43RdunnpKgpbny0lE.f3591TCyPEKSzIyweCN5yp1.get(i2));
            }
        }
        this.f3721OUd9THiLjZndMj0qdF = new ArrayDeque(y43RdunnpKgpbny0lE.f3589IPyIQcaNa8aB7drBED);
    }

    public void e2F9F6h8YJxTHwLCa0() {
        this.f3746tXWeW0sqVddf7ZBflq = true;
        this.f3718KqgKJKIWne3kz1AdHk.T9PhQIpGRhE4yZDm1C(true);
        DfpieXfdYs58yZAiXY(4);
    }

    public void e54J8UWNHWALQNixXM(Fragment fragment) {
        if (yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f3422WWC27LAMFqFFBzfbNw) {
            fragment.f3422WWC27LAMFqFFBzfbNw = false;
            if (fragment.f3427Z9WdNiOsPR0y54zHW4) {
                return;
            }
            this.f3715HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(fragment);
            if (yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (O1furmptfI76BGfN0d(fragment)) {
                this.f3741jCtUeU2YI1poCxWcjm = true;
            }
        }
    }

    public Fragment eWK41qw3g36LVd4UnS() {
        return this.f3710A49QRPHynYLCBN0SqP;
    }

    public tXWeW0sqVddf7ZBflq evSiTWao80SbJUZk9E() {
        tXWeW0sqVddf7ZBflq txwew0sqvddf7zbflq = this.f3727THTDvPxsHqMeGb512f;
        if (txwew0sqvddf7zbflq != null) {
            return txwew0sqvddf7zbflq;
        }
        Fragment fragment = this.f3719LIMtzhnLwQyigzK0KO;
        return fragment != null ? fragment.f3425Y43RdunnpKgpbny0lE.evSiTWao80SbJUZk9E() : this.f3736ao3wqKm5CXFuvC0q47;
    }

    public boolean f2zPq7MOnQrtOlZ1Zg() {
        return this.f3731XzJ1BS7H9Ilbkv4eVM || this.f3746tXWeW0sqVddf7ZBflq;
    }

    public void fDXXEWvhMVO3O8mnuS(FragmentContainerView fragmentContainerView) {
        View view;
        for (LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO : this.f3715HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo()) {
            Fragment fragmentZ9WdNiOsPR0y54zHW4 = lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4();
            if (fragmentZ9WdNiOsPR0y54zHW4.f3409LIMtzhnLwQyigzK0KO == fragmentContainerView.getId() && (view = fragmentZ9WdNiOsPR0y54zHW4.f3421W3RZ2dTDKrKpS5Mxdk) != null && view.getParent() == null) {
                fragmentZ9WdNiOsPR0y54zHW4.f3445tXWeW0sqVddf7ZBflq = fragmentContainerView;
                lIMtzhnLwQyigzK0KO.s3fjYDxWOUexjjVgyA();
            }
        }
    }

    public void fLSSbwbzFBVpwBH5FM(Fragment fragment) {
        if (fragment.f3427Z9WdNiOsPR0y54zHW4 && O1furmptfI76BGfN0d(fragment)) {
            this.f3741jCtUeU2YI1poCxWcjm = true;
        }
    }

    public final void g0OBkYSIvp0JYnHPjC(Fragment fragment) {
        ViewGroup viewGroupKh0uC90qEEhuLdpgB9 = Kh0uC90qEEhuLdpgB9(fragment);
        if (viewGroupKh0uC90qEEhuLdpgB9 == null || fragment.OANkd3mP6AYvwbNLJM() + fragment.Y43RdunnpKgpbny0lE() + fragment.OUd9THiLjZndMj0qdF() + fragment.jCtUeU2YI1poCxWcjm() <= 0) {
            return;
        }
        if (viewGroupKh0uC90qEEhuLdpgB9.getTag(LU0fFDMACqnfIfA1AZ.s3fjYDxWOUexjjVgyA.f936HJFh0TGMpafqLE9haL) == null) {
            viewGroupKh0uC90qEEhuLdpgB9.setTag(LU0fFDMACqnfIfA1AZ.s3fjYDxWOUexjjVgyA.f936HJFh0TGMpafqLE9haL, fragment);
        }
        ((Fragment) viewGroupKh0uC90qEEhuLdpgB9.getTag(LU0fFDMACqnfIfA1AZ.s3fjYDxWOUexjjVgyA.f936HJFh0TGMpafqLE9haL)).g0OBkYSIvp0JYnHPjC(fragment.ao3wqKm5CXFuvC0q47());
    }

    public final void h7m69eGbRk1hyaVt28() {
        Iterator it = this.f3715HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo().iterator();
        while (it.hasNext()) {
            vlBaBOcZ1q1ndWVoXn((LIMtzhnLwQyigzK0KO) it.next());
        }
    }

    public Fragment hUNBy66ZO1wVLJGW3l(String str) {
        return this.f3715HJFh0TGMpafqLE9haL.TCyPEKSzIyweCN5yp1(str);
    }

    public boolean hoXrIDAFrSwfShk8da() {
        boolean zO1furmptfI76BGfN0d = false;
        for (Fragment fragment : this.f3715HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ()) {
            if (fragment != null) {
                zO1furmptfI76BGfN0d = O1furmptfI76BGfN0d(fragment);
            }
            if (zO1furmptfI76BGfN0d) {
                return true;
            }
        }
        return false;
    }

    public void i8aHOwH04efS6lZ3Oa(int i, int i2, boolean z) {
        if (i >= 0) {
            lLKzvdU99Iw80uVD5I(new pbVGzGjWvY2LDXC8vo(null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    public final boolean iQCvttGuB7nx4r7kMP() {
        Fragment fragment = this.f3719LIMtzhnLwQyigzK0KO;
        if (fragment == null) {
            return true;
        }
        return fragment.LU0fFDMACqnfIfA1AZ() && this.f3719LIMtzhnLwQyigzK0KO.THTDvPxsHqMeGb512f().iQCvttGuB7nx4r7kMP();
    }

    public final void jCtUeU2YI1poCxWcjm(Fragment fragment) {
        if (fragment == null || !fragment.equals(oocVJL811qFf0j0XXZ(fragment.f3437husNiw3snxdgZPAGJm))) {
            return;
        }
        fragment.aUn6Hqsqw2PVM8685Z();
    }

    public e54J8UWNHWALQNixXM jocVUfxESVhVJU8LoH() {
        return this.f3739hoXrIDAFrSwfShk8da;
    }

    public void jsjSYEu4NPZjZxcfmI(Fragment fragment, KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        if (fragment.equals(oocVJL811qFf0j0XXZ(fragment.f3437husNiw3snxdgZPAGJm))) {
            fragment.f3419ToH8yzk8U1nKT0PUfY = s3fjydxwouexjjvgya;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public androidx.fragment.app.IPyIQcaNa8aB7drBED k0CbjZvfUz23r8IN6W() {
        return this.f3747xHA29AmDt6y96AnB3t;
    }

    public void lLKzvdU99Iw80uVD5I(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, boolean z) {
        if (!z) {
            if (!this.f3729W3RZ2dTDKrKpS5Mxdk) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        synchronized (this.f3742lEeR5KfoEr4xU5yHH7) {
            try {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void oOMFI1Dcqcg1BSVNty(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((androidx.fragment.app.lEeR5KfoEr4xU5yHH7) arrayList.get(i)).f3545sTkWmhpZ5b1ArQIw4K) {
                if (i2 != i) {
                    YlLW4G6OV9TFyuw5ix(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((androidx.fragment.app.lEeR5KfoEr4xU5yHH7) arrayList.get(i2)).f3545sTkWmhpZ5b1ArQIw4K) {
                        i2++;
                    }
                }
                YlLW4G6OV9TFyuw5ix(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            YlLW4G6OV9TFyuw5ix(arrayList, arrayList2, i2, size);
        }
    }

    public final boolean oXIAAdret8ERrYfuyf(String str, int i, int i2) {
        XdzLv4NdAtTYoEzVzB(false);
        ToH8yzk8U1nKT0PUfY(true);
        Fragment fragment = this.f3710A49QRPHynYLCBN0SqP;
        if (fragment != null && i < 0 && str == null && fragment.hoXrIDAFrSwfShk8da().owCQzRKpGarpL4247z()) {
            return true;
        }
        boolean zYXUWiIShOcfJRNCmU8 = yXUWiIShOcfJRNCmU8(this.f3714GyWRxpdt1T8mEJXPoD, this.f3712DfpieXfdYs58yZAiXY, str, i, i2);
        if (zYXUWiIShOcfJRNCmU8) {
            this.f3744s3fjYDxWOUexjjVgyA = true;
            try {
                oOMFI1Dcqcg1BSVNty(this.f3714GyWRxpdt1T8mEJXPoD, this.f3712DfpieXfdYs58yZAiXY);
            } finally {
                aPyGSIylzVNKPT1Bls();
            }
        }
        LFGi8lLul9XOP250o9();
        PPkm9uUfOJHHYveeLT();
        this.f3715HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA();
        return zYXUWiIShOcfJRNCmU8;
    }

    public Fragment oocVJL811qFf0j0XXZ(String str) {
        return this.f3715HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(str);
    }

    public final boolean osrHU7fvDp2EgxZPfM(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f3742lEeR5KfoEr4xU5yHH7) {
            if (!this.f3742lEeR5KfoEr4xU5yHH7.isEmpty()) {
                int size = this.f3742lEeR5KfoEr4xU5yHH7.size();
                for (int i = 0; i < size; i++) {
                    ((IPyIQcaNa8aB7drBED) this.f3742lEeR5KfoEr4xU5yHH7.get(i)).lEeR5KfoEr4xU5yHH7(arrayList, arrayList2);
                }
                this.f3742lEeR5KfoEr4xU5yHH7.clear();
                throw null;
            }
        }
        return false;
    }

    public boolean owCQzRKpGarpL4247z() {
        return oXIAAdret8ERrYfuyf(null, -1, 0);
    }

    public void pbVGzGjWvY2LDXC8vo(G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
        this.f3735aPyGSIylzVNKPT1Bls.add(g7AC3DWIx9i9fdanjk);
    }

    public final /* synthetic */ void pgB7Gmjz55y9NQYnAD(xHA29AmDt6y96AnB3t.IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED) {
        if (iQCvttGuB7nx4r7kMP()) {
            throw null;
        }
    }

    public final Set sTkWmhpZ5b1ArQIw4K(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((androidx.fragment.app.lEeR5KfoEr4xU5yHH7) arrayList.get(i)).f3530HJFh0TGMpafqLE9haL.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7) it.next()).f3555s3fjYDxWOUexjjVgyA;
                if (fragment != null && (viewGroup = fragment.f3445tXWeW0sqVddf7ZBflq) != null) {
                    hashSet.add(XzJ1BS7H9Ilbkv4eVM.hoXrIDAFrSwfShk8da(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public boolean tXWeW0sqVddf7ZBflq(Menu menu) {
        boolean z = false;
        if (this.f3713G7AC3DWIx9i9fdanjk < 1) {
            return false;
        }
        for (Fragment fragment : this.f3715HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C()) {
            if (fragment != null && Fo9071MN8vwEWamAUX(fragment) && fragment.Bc5OTyAfOKVCQb8CEz(menu)) {
                z = true;
            }
        }
        return z;
    }

    public void tmIBXGVvBsrJ7i63G2(Fragment fragment, boolean z) {
        ViewGroup viewGroupKh0uC90qEEhuLdpgB9 = Kh0uC90qEEhuLdpgB9(fragment);
        if (viewGroupKh0uC90qEEhuLdpgB9 == null || !(viewGroupKh0uC90qEEhuLdpgB9 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupKh0uC90qEEhuLdpgB9).setDrawDisappearingViewsLast(!z);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3719LIMtzhnLwQyigzK0KO;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3719LIMtzhnLwQyigzK0KO)));
            str = "}";
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("}}");
        return sb.toString();
    }

    public boolean uAIIhSQWhOmxUb3Bqo(int i, int i2) {
        if (i >= 0) {
            return oXIAAdret8ERrYfuyf(null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    public final int udcVtCzLTM1Loe9KrX(String str, int i, boolean z) {
        ArrayList arrayList = this.f3748zZKhbgvUfsK4AEX3r0;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.f3748zZKhbgvUfsK4AEX3r0.size() - 1;
        }
        int size = this.f3748zZKhbgvUfsK4AEX3r0.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (androidx.fragment.app.lEeR5KfoEr4xU5yHH7) this.f3748zZKhbgvUfsK4AEX3r0.get(size);
            if ((str != null && str.equals(leer5kfoer4xu5yhh7.xHA29AmDt6y96AnB3t())) || (i >= 0 && i == leer5kfoer4xu5yhh7.f3634xHA29AmDt6y96AnB3t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.f3748zZKhbgvUfsK4AEX3r0.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = (androidx.fragment.app.lEeR5KfoEr4xU5yHH7) this.f3748zZKhbgvUfsK4AEX3r0.get(size - 1);
            if ((str == null || !str.equals(leer5kfoer4xu5yhh72.xHA29AmDt6y96AnB3t())) && (i < 0 || i != leer5kfoer4xu5yhh72.f3634xHA29AmDt6y96AnB3t)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public void vlBaBOcZ1q1ndWVoXn(LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO) {
        Fragment fragmentZ9WdNiOsPR0y54zHW4 = lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4();
        if (fragmentZ9WdNiOsPR0y54zHW4.f3413OqIo5QF00RDxUQb4qq) {
            if (this.f3744s3fjYDxWOUexjjVgyA) {
                this.f3722OqIo5QF00RDxUQb4qq = true;
            } else {
                fragmentZ9WdNiOsPR0y54zHW4.f3413OqIo5QF00RDxUQb4qq = false;
                lIMtzhnLwQyigzK0KO.T9PhQIpGRhE4yZDm1C();
            }
        }
    }

    public void xHA29AmDt6y96AnB3t(Configuration configuration, boolean z) {
        for (Fragment fragment : this.f3715HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C()) {
            if (fragment != null) {
                fragment.iQCvttGuB7nx4r7kMP(configuration);
                if (z) {
                    fragment.f3415R9SAhYMerGybF9OAjL.xHA29AmDt6y96AnB3t(configuration, true);
                }
            }
        }
    }

    public void xMfAHy6F7qK0zhxhKG() {
        XdzLv4NdAtTYoEzVzB(true);
        if (this.f3716IPyIQcaNa8aB7drBED.TCyPEKSzIyweCN5yp1()) {
            owCQzRKpGarpL4247z();
        } else {
            this.f3726TCyPEKSzIyweCN5yp1.Acstmh57AKoSEkEFNJ();
        }
    }

    public boolean yL2E9nlEZpg8ZZx8XE(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.zcy2NNbtVXgoGQbfuq();
    }

    public boolean yXUWiIShOcfJRNCmU8(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iUdcVtCzLTM1Loe9KrX = udcVtCzLTM1Loe9KrX(str, i, (i2 & 1) != 0);
        if (iUdcVtCzLTM1Loe9KrX < 0) {
            return false;
        }
        for (int size = this.f3748zZKhbgvUfsK4AEX3r0.size() - 1; size >= iUdcVtCzLTM1Loe9KrX; size--) {
            arrayList.add((androidx.fragment.app.lEeR5KfoEr4xU5yHH7) this.f3748zZKhbgvUfsK4AEX3r0.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public Fragment zXY7dgnTfw9Pd9RXel() {
        return this.f3719LIMtzhnLwQyigzK0KO;
    }

    public final Set zaq8hOURtfwbcX17cG() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f3715HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((LIMtzhnLwQyigzK0KO) it.next()).Z9WdNiOsPR0y54zHW4().f3445tXWeW0sqVddf7ZBflq;
            if (viewGroup != null) {
                hashSet.add(XzJ1BS7H9Ilbkv4eVM.aPyGSIylzVNKPT1Bls(viewGroup, evSiTWao80SbJUZk9E()));
            }
        }
        return hashSet;
    }
}
