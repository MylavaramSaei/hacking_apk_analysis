package androidx.fragment.app;

import android.animation.Animator;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.WWC27LAMFqFFBzfbNw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.Z9WdNiOsPR0y54zHW4, androidx.lifecycle.OUd9THiLjZndMj0qdF, androidx.lifecycle.husNiw3snxdgZPAGJm, CSih7GetOUab1dYQjM.zZKhbgvUfsK4AEX3r0 {

    /* renamed from: Uj8rPa1EWADtk6Oe0S, reason: collision with root package name */
    public static final Object f3399Uj8rPa1EWADtk6Oe0S = new Object();

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public String f3400A49QRPHynYLCBN0SqP;

    /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0 f3402DfpieXfdYs58yZAiXY;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public Fragment f3403G7AC3DWIx9i9fdanjk;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public SparseArray f3405HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public Bundle f3407KYHag8HRDlnO3X9zmZ;

    /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
    public boolean f3408KqgKJKIWne3kz1AdHk;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public int f3409LIMtzhnLwQyigzK0KO;

    /* renamed from: LU0fFDMACqnfIfA1AZ, reason: collision with root package name */
    public OUd9THiLjZndMj0qdF f3410LU0fFDMACqnfIfA1AZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public boolean f3411OANkd3mP6AYvwbNLJM;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public boolean f3412OUd9THiLjZndMj0qdF;

    /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
    public boolean f3413OqIo5QF00RDxUQb4qq;

    /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
    public LayoutInflater f3414PPkm9uUfOJHHYveeLT;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public boolean f3416T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public Fragment f3417TCyPEKSzIyweCN5yp1;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public boolean f3418THTDvPxsHqMeGb512f;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public boolean f3420VItLRw50eXTZeEfGl0;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public View f3421W3RZ2dTDKrKpS5Mxdk;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public boolean f3422WWC27LAMFqFFBzfbNw;

    /* renamed from: XdzLv4NdAtTYoEzVzB, reason: collision with root package name */
    public androidx.lifecycle.e54J8UWNHWALQNixXM f3423XdzLv4NdAtTYoEzVzB;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public boolean f3424XzJ1BS7H9Ilbkv4eVM;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public zaq8hOURtfwbcX17cG f3425Y43RdunnpKgpbny0lE;

    /* renamed from: YlLW4G6OV9TFyuw5ix, reason: collision with root package name */
    public WWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA f3426YlLW4G6OV9TFyuw5ix;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public boolean f3427Z9WdNiOsPR0y54zHW4;

    /* renamed from: aAp6BD79BhftLCnuvf, reason: collision with root package name */
    public boolean f3428aAp6BD79BhftLCnuvf;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public boolean f3429aPyGSIylzVNKPT1Bls;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public boolean f3430ao3wqKm5CXFuvC0q47;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public boolean f3434e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public boolean f3436hoXrIDAFrSwfShk8da;

    /* renamed from: lLKzvdU99Iw80uVD5I, reason: collision with root package name */
    public String f3440lLKzvdU99Iw80uVD5I;

    /* renamed from: oocVJL811qFf0j0XXZ, reason: collision with root package name */
    public CSih7GetOUab1dYQjM.HJFh0TGMpafqLE9haL f3441oocVJL811qFf0j0XXZ;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int f3442pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Bundle f3443s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public int f3444sTkWmhpZ5b1ArQIw4K;

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public ViewGroup f3445tXWeW0sqVddf7ZBflq;

    /* renamed from: udcVtCzLTM1Loe9KrX, reason: collision with root package name */
    public int f3446udcVtCzLTM1Loe9KrX;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public int f3447xHA29AmDt6y96AnB3t;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public Bundle f3448zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public boolean f3449zaq8hOURtfwbcX17cG;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f3439lEeR5KfoEr4xU5yHH7 = -1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public String f3437husNiw3snxdgZPAGJm = UUID.randomUUID().toString();

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public String f3406IPyIQcaNa8aB7drBED = null;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public Boolean f3401Acstmh57AKoSEkEFNJ = null;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public zaq8hOURtfwbcX17cG f3415R9SAhYMerGybF9OAjL = new sTkWmhpZ5b1ArQIw4K();

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public boolean f3438jCtUeU2YI1poCxWcjm = true;

    /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
    public boolean f3404GyWRxpdt1T8mEJXPoD = true;

    /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
    public Runnable f3433e2F9F6h8YJxTHwLCa0 = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: ToH8yzk8U1nKT0PUfY, reason: collision with root package name */
    public KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA f3419ToH8yzk8U1nKT0PUfY = KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.RESUMED;

    /* renamed from: zcy2NNbtVXgoGQbfuq, reason: collision with root package name */
    public androidx.lifecycle.aPyGSIylzVNKPT1Bls f3450zcy2NNbtVXgoGQbfuq = new androidx.lifecycle.aPyGSIylzVNKPT1Bls();

    /* renamed from: cT5Hs3CQpLK8NvlZAw, reason: collision with root package name */
    public final AtomicInteger f3432cT5Hs3CQpLK8NvlZAw = new AtomicInteger();

    /* renamed from: hUNBy66ZO1wVLJGW3l, reason: collision with root package name */
    public final ArrayList f3435hUNBy66ZO1wVLJGW3l = new ArrayList();

    /* renamed from: bMSdooljgH14Jgudph, reason: collision with root package name */
    public final KYHag8HRDlnO3X9zmZ f3431bMSdooljgH14Jgudph = new s3fjYDxWOUexjjVgyA();

    public class HJFh0TGMpafqLE9haL extends IPyIQcaNa8aB7drBED {
        public HJFh0TGMpafqLE9haL() {
        }

        @Override // androidx.fragment.app.IPyIQcaNa8aB7drBED
        public View lEeR5KfoEr4xU5yHH7(int i) {
            View view = Fragment.this.f3421W3RZ2dTDKrKpS5Mxdk;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.IPyIQcaNa8aB7drBED
        public boolean s3fjYDxWOUexjjVgyA() {
            return Fragment.this.f3421W3RZ2dTDKrKpS5Mxdk != null;
        }
    }

    public static abstract class KYHag8HRDlnO3X9zmZ {
        public KYHag8HRDlnO3X9zmZ() {
        }

        public abstract void lEeR5KfoEr4xU5yHH7();

        public /* synthetic */ KYHag8HRDlnO3X9zmZ(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this();
        }
    }

    public static class husNiw3snxdgZPAGJm {
        public static void lEeR5KfoEr4xU5yHH7(View view) {
            view.cancelPendingInputEvents();
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements Runnable {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.vExXQwwMm8C1aKdGdj();
        }
    }

    public class s3fjYDxWOUexjjVgyA extends KYHag8HRDlnO3X9zmZ {
        public s3fjYDxWOUexjjVgyA() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.KYHag8HRDlnO3X9zmZ
        public void lEeR5KfoEr4xU5yHH7() {
            Fragment.this.f3441oocVJL811qFf0j0XXZ.HJFh0TGMpafqLE9haL();
            androidx.lifecycle.xHA29AmDt6y96AnB3t.lEeR5KfoEr4xU5yHH7(Fragment.this);
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 {

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public Object f3455Acstmh57AKoSEkEFNJ;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f3456HJFh0TGMpafqLE9haL;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public ArrayList f3457IPyIQcaNa8aB7drBED;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int f3458KYHag8HRDlnO3X9zmZ;

        /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
        public Boolean f3459OANkd3mP6AYvwbNLJM;

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public Object f3460T9PhQIpGRhE4yZDm1C;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public ArrayList f3461TCyPEKSzIyweCN5yp1;

        /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
        public boolean f3462Y43RdunnpKgpbny0lE;

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public Object f3463Z9WdNiOsPR0y54zHW4;

        /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
        public Boolean f3464aPyGSIylzVNKPT1Bls;

        /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
        public Object f3465e54J8UWNHWALQNixXM;

        /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
        public Object f3466hoXrIDAFrSwfShk8da;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f3467husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f3468lEeR5KfoEr4xU5yHH7;

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public Object f3469pbVGzGjWvY2LDXC8vo = null;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f3470s3fjYDxWOUexjjVgyA;

        /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
        public View f3471sTkWmhpZ5b1ArQIw4K;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f3472zZKhbgvUfsK4AEX3r0;

        /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
        public float f3473zaq8hOURtfwbcX17cG;

        public zZKhbgvUfsK4AEX3r0() {
            Object obj = Fragment.f3399Uj8rPa1EWADtk6Oe0S;
            this.f3455Acstmh57AKoSEkEFNJ = obj;
            this.f3463Z9WdNiOsPR0y54zHW4 = null;
            this.f3465e54J8UWNHWALQNixXM = obj;
            this.f3460T9PhQIpGRhE4yZDm1C = null;
            this.f3466hoXrIDAFrSwfShk8da = obj;
            this.f3473zaq8hOURtfwbcX17cG = 1.0f;
            this.f3471sTkWmhpZ5b1ArQIw4K = null;
        }
    }

    public Fragment() {
        ToH8yzk8U1nKT0PUfY();
    }

    public final int A49QRPHynYLCBN0SqP() {
        KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f3419ToH8yzk8U1nKT0PUfY;
        return (s3fjydxwouexjjvgya == KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.INITIALIZED || this.f3403G7AC3DWIx9i9fdanjk == null) ? s3fjydxwouexjjvgya.ordinal() : Math.min(s3fjydxwouexjjvgya.ordinal(), this.f3403G7AC3DWIx9i9fdanjk.A49QRPHynYLCBN0SqP());
    }

    public final androidx.fragment.app.KYHag8HRDlnO3X9zmZ Acstmh57AKoSEkEFNJ() {
        return null;
    }

    public boolean Bc5OTyAfOKVCQb8CEz(Menu menu) {
        boolean z = false;
        if (this.f3420VItLRw50eXTZeEfGl0) {
            return false;
        }
        if (this.f3412OUd9THiLjZndMj0qdF && this.f3438jCtUeU2YI1poCxWcjm) {
            evSiTWao80SbJUZk9E(menu);
            z = true;
        }
        return z | this.f3415R9SAhYMerGybF9OAjL.tXWeW0sqVddf7ZBflq(menu);
    }

    public Animator CSih7GetOUab1dYQjM(int i, boolean z, int i2) {
        return null;
    }

    public void DFYiVi7zXozAjRciKa(boolean z) {
    }

    public Object DfpieXfdYs58yZAiXY() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return null;
        }
        Object obj = zzkhbgvufsk4aex3r0.f3466hoXrIDAFrSwfShk8da;
        return obj == f3399Uj8rPa1EWADtk6Oe0S ? GyWRxpdt1T8mEJXPoD() : obj;
    }

    public void Er40JrQbOM51vCQI8w(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3415R9SAhYMerGybF9OAjL.aUn6Hqsqw2PVM8685Z();
        this.f3449zaq8hOURtfwbcX17cG = true;
        this.f3410LU0fFDMACqnfIfA1AZ = new OUd9THiLjZndMj0qdF(this, zZKhbgvUfsK4AEX3r0());
        View viewZJNyOIPL0usMs2xSAn = ZJNyOIPL0usMs2xSAn(layoutInflater, viewGroup, bundle);
        this.f3421W3RZ2dTDKrKpS5Mxdk = viewZJNyOIPL0usMs2xSAn;
        if (viewZJNyOIPL0usMs2xSAn == null) {
            if (this.f3410LU0fFDMACqnfIfA1AZ.KYHag8HRDlnO3X9zmZ()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f3410LU0fFDMACqnfIfA1AZ = null;
        } else {
            this.f3410LU0fFDMACqnfIfA1AZ.husNiw3snxdgZPAGJm();
            androidx.lifecycle.jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(this.f3421W3RZ2dTDKrKpS5Mxdk, this.f3410LU0fFDMACqnfIfA1AZ);
            androidx.lifecycle.XzJ1BS7H9Ilbkv4eVM.lEeR5KfoEr4xU5yHH7(this.f3421W3RZ2dTDKrKpS5Mxdk, this.f3410LU0fFDMACqnfIfA1AZ);
            CSih7GetOUab1dYQjM.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(this.f3421W3RZ2dTDKrKpS5Mxdk, this.f3410LU0fFDMACqnfIfA1AZ);
            this.f3450zcy2NNbtVXgoGQbfuq.IPyIQcaNa8aB7drBED(this.f3410LU0fFDMACqnfIfA1AZ);
        }
    }

    public void EscIOBqRhG6irG5q11(int i) {
        if (this.f3402DfpieXfdYs58yZAiXY == null && i == 0) {
            return;
        }
        pbVGzGjWvY2LDXC8vo();
        this.f3402DfpieXfdYs58yZAiXY.f3458KYHag8HRDlnO3X9zmZ = i;
    }

    public boolean Fo9071MN8vwEWamAUX(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f3420VItLRw50eXTZeEfGl0) {
            return false;
        }
        if (this.f3412OUd9THiLjZndMj0qdF && this.f3438jCtUeU2YI1poCxWcjm) {
            osrHU7fvDp2EgxZPfM(menu, menuInflater);
            z = true;
        }
        return z | this.f3415R9SAhYMerGybF9OAjL.A49QRPHynYLCBN0SqP(menu, menuInflater);
    }

    public void FtYx4GXtxwA8al5hBy() {
        this.f3424XzJ1BS7H9Ilbkv4eVM = true;
    }

    public xHA29AmDt6y96AnB3t.Z9WdNiOsPR0y54zHW4 G7AC3DWIx9i9fdanjk() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return null;
        }
        zzkhbgvufsk4aex3r0.getClass();
        return null;
    }

    public Object GyWRxpdt1T8mEJXPoD() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return null;
        }
        return zzkhbgvufsk4aex3r0.f3460T9PhQIpGRhE4yZDm1C;
    }

    public boolean HR5vAalpgOKVm2T0Gq(MenuItem menuItem) {
        if (this.f3420VItLRw50eXTZeEfGl0) {
            return false;
        }
        if (this.f3412OUd9THiLjZndMj0qdF && this.f3438jCtUeU2YI1poCxWcjm && zXY7dgnTfw9Pd9RXel(menuItem)) {
            return true;
        }
        return this.f3415R9SAhYMerGybF9OAjL.OUd9THiLjZndMj0qdF(menuItem);
    }

    public LayoutInflater HZ4bptRS9XIcK1CV95(Bundle bundle) {
        LayoutInflater layoutInflaterPum9NZyDBKoCnecvlx = Pum9NZyDBKoCnecvlx(bundle);
        this.f3414PPkm9uUfOJHHYveeLT = layoutInflaterPum9NZyDBKoCnecvlx;
        return layoutInflaterPum9NZyDBKoCnecvlx;
    }

    public IPyIQcaNa8aB7drBED IPyIQcaNa8aB7drBED() {
        return new HJFh0TGMpafqLE9haL();
    }

    public void JXsqbvi9UKxeF3HXpU(int i, int i2, int i3, int i4) {
        if (this.f3402DfpieXfdYs58yZAiXY == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        pbVGzGjWvY2LDXC8vo().f3470s3fjYDxWOUexjjVgyA = i;
        pbVGzGjWvY2LDXC8vo().f3456HJFh0TGMpafqLE9haL = i2;
        pbVGzGjWvY2LDXC8vo().f3472zZKhbgvUfsK4AEX3r0 = i3;
        pbVGzGjWvY2LDXC8vo().f3467husNiw3snxdgZPAGJm = i4;
    }

    public void Jsouc4ileb8SxQhxbX() {
        this.f3424XzJ1BS7H9Ilbkv4eVM = true;
    }

    public void Kh0uC90qEEhuLdpgB9() {
        this.f3424XzJ1BS7H9Ilbkv4eVM = true;
    }

    public ArrayList KqgKJKIWne3kz1AdHk() {
        ArrayList arrayList;
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        return (zzkhbgvufsk4aex3r0 == null || (arrayList = zzkhbgvufsk4aex3r0.f3457IPyIQcaNa8aB7drBED) == null) ? new ArrayList() : arrayList;
    }

    public void LFGi8lLul9XOP250o9(Intent intent, int i, Bundle bundle) {
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public LayoutInflater LIMtzhnLwQyigzK0KO(Bundle bundle) {
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final boolean LU0fFDMACqnfIfA1AZ() {
        return false;
    }

    public void O1furmptfI76BGfN0d() {
        Iterator it = this.f3435hUNBy66ZO1wVLJGW3l.iterator();
        while (it.hasNext()) {
            ((KYHag8HRDlnO3X9zmZ) it.next()).lEeR5KfoEr4xU5yHH7();
        }
        this.f3435hUNBy66ZO1wVLJGW3l.clear();
        this.f3415R9SAhYMerGybF9OAjL.Z9WdNiOsPR0y54zHW4(null, IPyIQcaNa8aB7drBED(), this);
        this.f3439lEeR5KfoEr4xU5yHH7 = 0;
        this.f3424XzJ1BS7H9Ilbkv4eVM = false;
        throw null;
    }

    public int OANkd3mP6AYvwbNLJM() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return 0;
        }
        return zzkhbgvufsk4aex3r0.f3470s3fjYDxWOUexjjVgyA;
    }

    public int OUd9THiLjZndMj0qdF() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return 0;
        }
        return zzkhbgvufsk4aex3r0.f3472zZKhbgvUfsK4AEX3r0;
    }

    public final Context OWyIJu8lIXxQlvLhaC() {
        Context contextAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls();
        if (contextAPyGSIylzVNKPT1Bls != null) {
            return contextAPyGSIylzVNKPT1Bls;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public Object OqIo5QF00RDxUQb4qq() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return null;
        }
        Object obj = zzkhbgvufsk4aex3r0.f3455Acstmh57AKoSEkEFNJ;
        return obj == f3399Uj8rPa1EWADtk6Oe0S ? zaq8hOURtfwbcX17cG() : obj;
    }

    public void PDw1hXOtArGjUqFgpT(float f) {
        pbVGzGjWvY2LDXC8vo().f3473zaq8hOURtfwbcX17cG = f;
    }

    public final String PPkm9uUfOJHHYveeLT(int i) {
        return W3RZ2dTDKrKpS5Mxdk().getString(i);
    }

    public LayoutInflater Pum9NZyDBKoCnecvlx(Bundle bundle) {
        return LIMtzhnLwQyigzK0KO(bundle);
    }

    public void QW0Trt6m3nVBNaYFnP(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f3415R9SAhYMerGybF9OAjL.d4ZdBAtGyjVWTQYsYn(parcelable);
        this.f3415R9SAhYMerGybF9OAjL.LIMtzhnLwQyigzK0KO();
    }

    public Object R9SAhYMerGybF9OAjL() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return null;
        }
        return zzkhbgvufsk4aex3r0.f3463Z9WdNiOsPR0y54zHW4;
    }

    public final Bundle T9PhQIpGRhE4yZDm1C() {
        return this.f3407KYHag8HRDlnO3X9zmZ;
    }

    @Override // androidx.lifecycle.Z9WdNiOsPR0y54zHW4
    public androidx.lifecycle.KYHag8HRDlnO3X9zmZ TCyPEKSzIyweCN5yp1() {
        return this.f3423XdzLv4NdAtTYoEzVzB;
    }

    public final zaq8hOURtfwbcX17cG THTDvPxsHqMeGb512f() {
        zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg = this.f3425Y43RdunnpKgpbny0lE;
        if (zaq8hourtfwbcx17cg != null) {
            return zaq8hourtfwbcx17cg;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void ToH8yzk8U1nKT0PUfY() {
        this.f3423XdzLv4NdAtTYoEzVzB = new androidx.lifecycle.e54J8UWNHWALQNixXM(this);
        this.f3441oocVJL811qFf0j0XXZ = CSih7GetOUab1dYQjM.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this);
        this.f3426YlLW4G6OV9TFyuw5ix = null;
        if (this.f3435hUNBy66ZO1wVLJGW3l.contains(this.f3431bMSdooljgH14Jgudph)) {
            return;
        }
        oXIAAdret8ERrYfuyf(this.f3431bMSdooljgH14Jgudph);
    }

    public void Tu4WCh2gEwj8E4oHbP() {
    }

    public Animation Uj8rPa1EWADtk6Oe0S(int i, boolean z, int i2) {
        return null;
    }

    public int VItLRw50eXTZeEfGl0() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return 0;
        }
        return zzkhbgvufsk4aex3r0.f3458KYHag8HRDlnO3X9zmZ;
    }

    public final Resources W3RZ2dTDKrKpS5Mxdk() {
        return OWyIJu8lIXxQlvLhaC().getResources();
    }

    public final Fragment WWC27LAMFqFFBzfbNw() {
        return this.f3403G7AC3DWIx9i9fdanjk;
    }

    public void XdzLv4NdAtTYoEzVzB() {
        ToH8yzk8U1nKT0PUfY();
        this.f3440lLKzvdU99Iw80uVD5I = this.f3437husNiw3snxdgZPAGJm;
        this.f3437husNiw3snxdgZPAGJm = UUID.randomUUID().toString();
        this.f3427Z9WdNiOsPR0y54zHW4 = false;
        this.f3434e54J8UWNHWALQNixXM = false;
        this.f3436hoXrIDAFrSwfShk8da = false;
        this.f3429aPyGSIylzVNKPT1Bls = false;
        this.f3411OANkd3mP6AYvwbNLJM = false;
        this.f3444sTkWmhpZ5b1ArQIw4K = 0;
        this.f3425Y43RdunnpKgpbny0lE = null;
        this.f3415R9SAhYMerGybF9OAjL = new sTkWmhpZ5b1ArQIw4K();
        this.f3447xHA29AmDt6y96AnB3t = 0;
        this.f3409LIMtzhnLwQyigzK0KO = 0;
        this.f3400A49QRPHynYLCBN0SqP = null;
        this.f3420VItLRw50eXTZeEfGl0 = false;
        this.f3422WWC27LAMFqFFBzfbNw = false;
    }

    public float XzJ1BS7H9Ilbkv4eVM() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return 1.0f;
        }
        return zzkhbgvufsk4aex3r0.f3473zaq8hOURtfwbcX17cG;
    }

    public int Y43RdunnpKgpbny0lE() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return 0;
        }
        return zzkhbgvufsk4aex3r0.f3456HJFh0TGMpafqLE9haL;
    }

    public final boolean YlLW4G6OV9TFyuw5ix() {
        return this.f3444sTkWmhpZ5b1ArQIw4K > 0;
    }

    public void Ywqw2A0s86HeuFkDt0() {
        this.f3415R9SAhYMerGybF9OAjL.WWC27LAMFqFFBzfbNw();
        if (this.f3421W3RZ2dTDKrKpS5Mxdk != null && this.f3410LU0fFDMACqnfIfA1AZ.TCyPEKSzIyweCN5yp1().s3fjYDxWOUexjjVgyA().s3fjYDxWOUexjjVgyA(KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.CREATED)) {
            this.f3410LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_DESTROY);
        }
        this.f3439lEeR5KfoEr4xU5yHH7 = 1;
        this.f3424XzJ1BS7H9Ilbkv4eVM = false;
        k0CbjZvfUz23r8IN6W();
        if (this.f3424XzJ1BS7H9Ilbkv4eVM) {
            cT5Hs3CQpLK8NvlZAw.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this).s3fjYDxWOUexjjVgyA();
            this.f3449zaq8hOURtfwbcX17cG = false;
        } else {
            throw new W3RZ2dTDKrKpS5Mxdk("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public boolean Z9WdNiOsPR0y54zHW4() {
        Boolean bool;
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null || (bool = zzkhbgvufsk4aex3r0.f3459OANkd3mP6AYvwbNLJM) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View ZJNyOIPL0usMs2xSAn(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f3446udcVtCzLTM1Loe9KrX;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public View aAp6BD79BhftLCnuvf() {
        return this.f3421W3RZ2dTDKrKpS5Mxdk;
    }

    public Context aPyGSIylzVNKPT1Bls() {
        return null;
    }

    public void aRQ2M7vtRaPDEyvpdv() {
        onLowMemory();
    }

    public void aUn6Hqsqw2PVM8685Z() {
        boolean zEr40JrQbOM51vCQI8w = this.f3425Y43RdunnpKgpbny0lE.Er40JrQbOM51vCQI8w(this);
        Boolean bool = this.f3401Acstmh57AKoSEkEFNJ;
        if (bool == null || bool.booleanValue() != zEr40JrQbOM51vCQI8w) {
            this.f3401Acstmh57AKoSEkEFNJ = Boolean.valueOf(zEr40JrQbOM51vCQI8w);
            DFYiVi7zXozAjRciKa(zEr40JrQbOM51vCQI8w);
            this.f3415R9SAhYMerGybF9OAjL.W3RZ2dTDKrKpS5Mxdk();
        }
    }

    public boolean ao3wqKm5CXFuvC0q47() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return false;
        }
        return zzkhbgvufsk4aex3r0.f3468lEeR5KfoEr4xU5yHH7;
    }

    public void ayduHasC7VpxsVXE0T(Bundle bundle) {
    }

    public void bBVlTkqEpHW053CjWL(Bundle bundle) {
        this.f3424XzJ1BS7H9Ilbkv4eVM = true;
    }

    public void bMSdooljgH14Jgudph(Bundle bundle) {
        this.f3424XzJ1BS7H9Ilbkv4eVM = true;
        QW0Trt6m3nVBNaYFnP(bundle);
        if (this.f3415R9SAhYMerGybF9OAjL.Ywqw2A0s86HeuFkDt0(1)) {
            return;
        }
        this.f3415R9SAhYMerGybF9OAjL.LIMtzhnLwQyigzK0KO();
    }

    public final boolean cT5Hs3CQpLK8NvlZAw() {
        zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg = this.f3425Y43RdunnpKgpbny0lE;
        if (zaq8hourtfwbcx17cg == null) {
            return false;
        }
        return zaq8hourtfwbcx17cg.f2zPq7MOnQrtOlZ1Zg();
    }

    public void ctWLFN70QQINH1kyYo(boolean z) {
    }

    public final void d4ZdBAtGyjVWTQYsYn() {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f3421W3RZ2dTDKrKpS5Mxdk != null) {
            e5tXAuLbtMC3XyEoX9(this.f3443s3fjYDxWOUexjjVgyA);
        }
        this.f3443s3fjYDxWOUexjjVgyA = null;
    }

    public ArrayList e2F9F6h8YJxTHwLCa0() {
        ArrayList arrayList;
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        return (zzkhbgvufsk4aex3r0 == null || (arrayList = zzkhbgvufsk4aex3r0.f3461TCyPEKSzIyweCN5yp1) == null) ? new ArrayList() : arrayList;
    }

    public boolean e54J8UWNHWALQNixXM() {
        Boolean bool;
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null || (bool = zzkhbgvufsk4aex3r0.f3464aPyGSIylzVNKPT1Bls) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final void e5tXAuLbtMC3XyEoX9(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f3405HJFh0TGMpafqLE9haL;
        if (sparseArray != null) {
            this.f3421W3RZ2dTDKrKpS5Mxdk.restoreHierarchyState(sparseArray);
            this.f3405HJFh0TGMpafqLE9haL = null;
        }
        if (this.f3421W3RZ2dTDKrKpS5Mxdk != null) {
            this.f3410LU0fFDMACqnfIfA1AZ.IPyIQcaNa8aB7drBED(this.f3448zZKhbgvUfsK4AEX3r0);
            this.f3448zZKhbgvUfsK4AEX3r0 = null;
        }
        this.f3424XzJ1BS7H9Ilbkv4eVM = false;
        bBVlTkqEpHW053CjWL(bundle);
        if (this.f3424XzJ1BS7H9Ilbkv4eVM) {
            if (this.f3421W3RZ2dTDKrKpS5Mxdk != null) {
                this.f3410LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_CREATE);
            }
        } else {
            throw new W3RZ2dTDKrKpS5Mxdk("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void eWK41qw3g36LVd4UnS() {
        this.f3424XzJ1BS7H9Ilbkv4eVM = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void evSiTWao80SbJUZk9E(Menu menu) {
    }

    public void f2zPq7MOnQrtOlZ1Zg() {
        this.f3439lEeR5KfoEr4xU5yHH7 = -1;
        this.f3424XzJ1BS7H9Ilbkv4eVM = false;
        Kh0uC90qEEhuLdpgB9();
        this.f3414PPkm9uUfOJHHYveeLT = null;
        if (this.f3424XzJ1BS7H9Ilbkv4eVM) {
            if (this.f3415R9SAhYMerGybF9OAjL.bBVlTkqEpHW053CjWL()) {
                return;
            }
            this.f3415R9SAhYMerGybF9OAjL.VItLRw50eXTZeEfGl0();
            this.f3415R9SAhYMerGybF9OAjL = new sTkWmhpZ5b1ArQIw4K();
            return;
        }
        throw new W3RZ2dTDKrKpS5Mxdk("Fragment " + this + " did not call through to super.onDetach()");
    }

    public void fDXXEWvhMVO3O8mnuS() {
        this.f3415R9SAhYMerGybF9OAjL.aUn6Hqsqw2PVM8685Z();
        this.f3415R9SAhYMerGybF9OAjL.XdzLv4NdAtTYoEzVzB(true);
        this.f3439lEeR5KfoEr4xU5yHH7 = 7;
        this.f3424XzJ1BS7H9Ilbkv4eVM = false;
        FtYx4GXtxwA8al5hBy();
        if (!this.f3424XzJ1BS7H9Ilbkv4eVM) {
            throw new W3RZ2dTDKrKpS5Mxdk("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f3423XdzLv4NdAtTYoEzVzB;
        KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_RESUME;
        e54j8uwnhwalqnixxm.IPyIQcaNa8aB7drBED(leer5kfoer4xu5yhh7);
        if (this.f3421W3RZ2dTDKrKpS5Mxdk != null) {
            this.f3410LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL(leer5kfoer4xu5yhh7);
        }
        this.f3415R9SAhYMerGybF9OAjL.OqIo5QF00RDxUQb4qq();
    }

    public void fLSSbwbzFBVpwBH5FM(View view, Bundle bundle) {
    }

    public void g0OBkYSIvp0JYnHPjC(boolean z) {
        if (this.f3402DfpieXfdYs58yZAiXY == null) {
            return;
        }
        pbVGzGjWvY2LDXC8vo().f3468lEeR5KfoEr4xU5yHH7 = z;
    }

    public void h7m69eGbRk1hyaVt28(ArrayList arrayList, ArrayList arrayList2) {
        pbVGzGjWvY2LDXC8vo();
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        zzkhbgvufsk4aex3r0.f3461TCyPEKSzIyweCN5yp1 = arrayList;
        zzkhbgvufsk4aex3r0.f3457IPyIQcaNa8aB7drBED = arrayList2;
    }

    public void hUNBy66ZO1wVLJGW3l(Bundle bundle) {
        this.f3424XzJ1BS7H9Ilbkv4eVM = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final zaq8hOURtfwbcX17cG hoXrIDAFrSwfShk8da() {
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void i8aHOwH04efS6lZ3Oa() {
        this.f3415R9SAhYMerGybF9OAjL.aUn6Hqsqw2PVM8685Z();
        this.f3415R9SAhYMerGybF9OAjL.XdzLv4NdAtTYoEzVzB(true);
        this.f3439lEeR5KfoEr4xU5yHH7 = 5;
        this.f3424XzJ1BS7H9Ilbkv4eVM = false;
        xMfAHy6F7qK0zhxhKG();
        if (!this.f3424XzJ1BS7H9Ilbkv4eVM) {
            throw new W3RZ2dTDKrKpS5Mxdk("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f3423XdzLv4NdAtTYoEzVzB;
        KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_START;
        e54j8uwnhwalqnixxm.IPyIQcaNa8aB7drBED(leer5kfoer4xu5yhh7);
        if (this.f3421W3RZ2dTDKrKpS5Mxdk != null) {
            this.f3410LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL(leer5kfoer4xu5yhh7);
        }
        this.f3415R9SAhYMerGybF9OAjL.GyWRxpdt1T8mEJXPoD();
    }

    public void iQCvttGuB7nx4r7kMP(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public int jCtUeU2YI1poCxWcjm() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return 0;
        }
        return zzkhbgvufsk4aex3r0.f3467husNiw3snxdgZPAGJm;
    }

    public void jocVUfxESVhVJU8LoH(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f3424XzJ1BS7H9Ilbkv4eVM = true;
    }

    public void jsjSYEu4NPZjZxcfmI(View view) {
        pbVGzGjWvY2LDXC8vo().f3471sTkWmhpZ5b1ArQIw4K = view;
    }

    public void k0CbjZvfUz23r8IN6W() {
        this.f3424XzJ1BS7H9Ilbkv4eVM = true;
    }

    @Override // androidx.lifecycle.husNiw3snxdgZPAGJm
    public udcVtCzLTM1Loe9KrX.lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7() {
        Application application;
        Context applicationContext = OWyIJu8lIXxQlvLhaC().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + OWyIJu8lIXxQlvLhaC().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        udcVtCzLTM1Loe9KrX.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new udcVtCzLTM1Loe9KrX.zZKhbgvUfsK4AEX3r0();
        if (application != null) {
            zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.f3825husNiw3snxdgZPAGJm, application);
        }
        zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(androidx.lifecycle.xHA29AmDt6y96AnB3t.f3864lEeR5KfoEr4xU5yHH7, this);
        zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(androidx.lifecycle.xHA29AmDt6y96AnB3t.f3865s3fjYDxWOUexjjVgyA, this);
        if (T9PhQIpGRhE4yZDm1C() != null) {
            zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(androidx.lifecycle.xHA29AmDt6y96AnB3t.f3863HJFh0TGMpafqLE9haL, T9PhQIpGRhE4yZDm1C());
        }
        return zzkhbgvufsk4aex3r0;
    }

    public LiveData lLKzvdU99Iw80uVD5I() {
        return this.f3450zcy2NNbtVXgoGQbfuq;
    }

    public final View oOMFI1Dcqcg1BSVNty() {
        View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf();
        if (viewAAp6BD79BhftLCnuvf != null) {
            return viewAAp6BD79BhftLCnuvf;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void oXIAAdret8ERrYfuyf(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        if (this.f3439lEeR5KfoEr4xU5yHH7 >= 0) {
            kYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7();
        } else {
            this.f3435hUNBy66ZO1wVLJGW3l.add(kYHag8HRDlnO3X9zmZ);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f3424XzJ1BS7H9Ilbkv4eVM = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        yXUWiIShOcfJRNCmU8();
        throw null;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f3424XzJ1BS7H9Ilbkv4eVM = true;
    }

    public final boolean oocVJL811qFf0j0XXZ() {
        zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg;
        return this.f3438jCtUeU2YI1poCxWcjm && ((zaq8hourtfwbcx17cg = this.f3425Y43RdunnpKgpbny0lE) == null || zaq8hourtfwbcx17cg.Fo9071MN8vwEWamAUX(this.f3403G7AC3DWIx9i9fdanjk));
    }

    public void osrHU7fvDp2EgxZPfM(Menu menu, MenuInflater menuInflater) {
    }

    public void owCQzRKpGarpL4247z() {
        this.f3415R9SAhYMerGybF9OAjL.e2F9F6h8YJxTHwLCa0();
        if (this.f3421W3RZ2dTDKrKpS5Mxdk != null) {
            this.f3410LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_STOP);
        }
        this.f3423XdzLv4NdAtTYoEzVzB.IPyIQcaNa8aB7drBED(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_STOP);
        this.f3439lEeR5KfoEr4xU5yHH7 = 4;
        this.f3424XzJ1BS7H9Ilbkv4eVM = false;
        Jsouc4ileb8SxQhxbX();
        if (this.f3424XzJ1BS7H9Ilbkv4eVM) {
            return;
        }
        throw new W3RZ2dTDKrKpS5Mxdk("Fragment " + this + " did not call through to super.onStop()");
    }

    public final zZKhbgvUfsK4AEX3r0 pbVGzGjWvY2LDXC8vo() {
        if (this.f3402DfpieXfdYs58yZAiXY == null) {
            this.f3402DfpieXfdYs58yZAiXY = new zZKhbgvUfsK4AEX3r0();
        }
        return this.f3402DfpieXfdYs58yZAiXY;
    }

    public void pgB7Gmjz55y9NQYnAD() {
        this.f3415R9SAhYMerGybF9OAjL.XzJ1BS7H9Ilbkv4eVM();
        if (this.f3421W3RZ2dTDKrKpS5Mxdk != null) {
            this.f3410LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_PAUSE);
        }
        this.f3423XdzLv4NdAtTYoEzVzB.IPyIQcaNa8aB7drBED(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_PAUSE);
        this.f3439lEeR5KfoEr4xU5yHH7 = 6;
        this.f3424XzJ1BS7H9Ilbkv4eVM = false;
        eWK41qw3g36LVd4UnS();
        if (this.f3424XzJ1BS7H9Ilbkv4eVM) {
            return;
        }
        throw new W3RZ2dTDKrKpS5Mxdk("Fragment " + this + " did not call through to super.onPause()");
    }

    @Override // CSih7GetOUab1dYQjM.zZKhbgvUfsK4AEX3r0
    public final androidx.savedstate.lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA() {
        return this.f3441oocVJL811qFf0j0XXZ.s3fjYDxWOUexjjVgyA();
    }

    public xHA29AmDt6y96AnB3t.Z9WdNiOsPR0y54zHW4 sTkWmhpZ5b1ArQIw4K() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return null;
        }
        zzkhbgvufsk4aex3r0.getClass();
        return null;
    }

    public void startActivityForResult(Intent intent, int i) {
        LFGi8lLul9XOP250o9(intent, i, null);
    }

    public Object tXWeW0sqVddf7ZBflq() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return null;
        }
        Object obj = zzkhbgvufsk4aex3r0.f3465e54J8UWNHWALQNixXM;
        return obj == f3399Uj8rPa1EWADtk6Oe0S ? R9SAhYMerGybF9OAjL() : obj;
    }

    public void tmIBXGVvBsrJ7i63G2(Bundle bundle) {
        if (this.f3425Y43RdunnpKgpbny0lE != null && cT5Hs3CQpLK8NvlZAw()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f3407KYHag8HRDlnO3X9zmZ = bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f3437husNiw3snxdgZPAGJm);
        if (this.f3447xHA29AmDt6y96AnB3t != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3447xHA29AmDt6y96AnB3t));
        }
        if (this.f3400A49QRPHynYLCBN0SqP != null) {
            sb.append(" tag=");
            sb.append(this.f3400A49QRPHynYLCBN0SqP);
        }
        sb.append(")");
        return sb.toString();
    }

    public void uAIIhSQWhOmxUb3Bqo() {
        fLSSbwbzFBVpwBH5FM(this.f3421W3RZ2dTDKrKpS5Mxdk, this.f3443s3fjYDxWOUexjjVgyA);
        this.f3415R9SAhYMerGybF9OAjL.KqgKJKIWne3kz1AdHk();
    }

    public boolean udcVtCzLTM1Loe9KrX() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return false;
        }
        return zzkhbgvufsk4aex3r0.f3462Y43RdunnpKgpbny0lE;
    }

    public void vExXQwwMm8C1aKdGdj() {
        if (this.f3402DfpieXfdYs58yZAiXY == null || !pbVGzGjWvY2LDXC8vo().f3462Y43RdunnpKgpbny0lE) {
            return;
        }
        pbVGzGjWvY2LDXC8vo().f3462Y43RdunnpKgpbny0lE = false;
    }

    public void vlBaBOcZ1q1ndWVoXn(Bundle bundle) {
        ayduHasC7VpxsVXE0T(bundle);
        this.f3441oocVJL811qFf0j0XXZ.husNiw3snxdgZPAGJm(bundle);
        Bundle bundleJXsqbvi9UKxeF3HXpU = this.f3415R9SAhYMerGybF9OAjL.JXsqbvi9UKxeF3HXpU();
        if (bundleJXsqbvi9UKxeF3HXpU != null) {
            bundle.putParcelable("android:support:fragments", bundleJXsqbvi9UKxeF3HXpU);
        }
    }

    public View xHA29AmDt6y96AnB3t() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return null;
        }
        return zzkhbgvufsk4aex3r0.f3471sTkWmhpZ5b1ArQIw4K;
    }

    public void xMfAHy6F7qK0zhxhKG() {
        this.f3424XzJ1BS7H9Ilbkv4eVM = true;
    }

    public void yL2E9nlEZpg8ZZx8XE(Bundle bundle) {
        this.f3415R9SAhYMerGybF9OAjL.aUn6Hqsqw2PVM8685Z();
        this.f3439lEeR5KfoEr4xU5yHH7 = 1;
        this.f3424XzJ1BS7H9Ilbkv4eVM = false;
        this.f3423XdzLv4NdAtTYoEzVzB.lEeR5KfoEr4xU5yHH7(new androidx.lifecycle.pbVGzGjWvY2LDXC8vo() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.pbVGzGjWvY2LDXC8vo
            public void zZKhbgvUfsK4AEX3r0(androidx.lifecycle.Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
                View view;
                if (leer5kfoer4xu5yhh7 != KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_STOP || (view = Fragment.this.f3421W3RZ2dTDKrKpS5Mxdk) == null) {
                    return;
                }
                husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(view);
            }
        });
        this.f3441oocVJL811qFf0j0XXZ.zZKhbgvUfsK4AEX3r0(bundle);
        bMSdooljgH14Jgudph(bundle);
        this.f3428aAp6BD79BhftLCnuvf = true;
        if (this.f3424XzJ1BS7H9Ilbkv4eVM) {
            this.f3423XdzLv4NdAtTYoEzVzB.IPyIQcaNa8aB7drBED(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_CREATE);
            return;
        }
        throw new W3RZ2dTDKrKpS5Mxdk("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final androidx.fragment.app.KYHag8HRDlnO3X9zmZ yXUWiIShOcfJRNCmU8() {
        Acstmh57AKoSEkEFNJ();
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public void yvdWWG9COQQotjfedH(Bundle bundle) {
        this.f3415R9SAhYMerGybF9OAjL.aUn6Hqsqw2PVM8685Z();
        this.f3439lEeR5KfoEr4xU5yHH7 = 3;
        this.f3424XzJ1BS7H9Ilbkv4eVM = false;
        hUNBy66ZO1wVLJGW3l(bundle);
        if (this.f3424XzJ1BS7H9Ilbkv4eVM) {
            d4ZdBAtGyjVWTQYsYn();
            this.f3415R9SAhYMerGybF9OAjL.G7AC3DWIx9i9fdanjk();
        } else {
            throw new W3RZ2dTDKrKpS5Mxdk("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public boolean zXY7dgnTfw9Pd9RXel(MenuItem menuItem) {
        return false;
    }

    @Override // androidx.lifecycle.OUd9THiLjZndMj0qdF
    public androidx.lifecycle.ao3wqKm5CXFuvC0q47 zZKhbgvUfsK4AEX3r0() {
        if (this.f3425Y43RdunnpKgpbny0lE == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (A49QRPHynYLCBN0SqP() != KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.INITIALIZED.ordinal()) {
            return this.f3425Y43RdunnpKgpbny0lE.ayduHasC7VpxsVXE0T(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public Object zaq8hOURtfwbcX17cG() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3402DfpieXfdYs58yZAiXY;
        if (zzkhbgvufsk4aex3r0 == null) {
            return null;
        }
        return zzkhbgvufsk4aex3r0.f3469pbVGzGjWvY2LDXC8vo;
    }

    public final boolean zcy2NNbtVXgoGQbfuq() {
        zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg;
        return this.f3420VItLRw50eXTZeEfGl0 || ((zaq8hourtfwbcx17cg = this.f3425Y43RdunnpKgpbny0lE) != null && zaq8hourtfwbcx17cg.yL2E9nlEZpg8ZZx8XE(this.f3403G7AC3DWIx9i9fdanjk));
    }
}
