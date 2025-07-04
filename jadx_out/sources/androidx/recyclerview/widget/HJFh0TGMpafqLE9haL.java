package androidx.recyclerview.widget;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HJFh0TGMpafqLE9haL extends T9PhQIpGRhE4yZDm1C {

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public static TimeInterpolator f3909Y43RdunnpKgpbny0lE;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public ArrayList f3911IPyIQcaNa8aB7drBED = new ArrayList();

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public ArrayList f3918pbVGzGjWvY2LDXC8vo = new ArrayList();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public ArrayList f3910Acstmh57AKoSEkEFNJ = new ArrayList();

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public ArrayList f3914Z9WdNiOsPR0y54zHW4 = new ArrayList();

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public ArrayList f3916e54J8UWNHWALQNixXM = new ArrayList();

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public ArrayList f3913T9PhQIpGRhE4yZDm1C = new ArrayList();

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public ArrayList f3917hoXrIDAFrSwfShk8da = new ArrayList();

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public ArrayList f3915aPyGSIylzVNKPT1Bls = new ArrayList();

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public ArrayList f3912OANkd3mP6AYvwbNLJM = new ArrayList();

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public ArrayList f3920zaq8hOURtfwbcX17cG = new ArrayList();

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public ArrayList f3919sTkWmhpZ5b1ArQIw4K = new ArrayList();

    public static class Acstmh57AKoSEkEFNJ {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f3921HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f3922husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public RecyclerView.OUd9THiLjZndMj0qdF f3923lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f3924s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f3925zZKhbgvUfsK4AEX3r0;

        public Acstmh57AKoSEkEFNJ(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, int i, int i2, int i3, int i4) {
            this.f3923lEeR5KfoEr4xU5yHH7 = oUd9THiLjZndMj0qdF;
            this.f3924s3fjYDxWOUexjjVgyA = i;
            this.f3921HJFh0TGMpafqLE9haL = i2;
            this.f3925zZKhbgvUfsK4AEX3r0 = i3;
            this.f3922husNiw3snxdgZPAGJm = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.HJFh0TGMpafqLE9haL$HJFh0TGMpafqLE9haL, reason: collision with other inner class name */
    public class RunnableC0050HJFh0TGMpafqLE9haL implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3926lEeR5KfoEr4xU5yHH7;

        public RunnableC0050HJFh0TGMpafqLE9haL(ArrayList arrayList) {
            this.f3926lEeR5KfoEr4xU5yHH7 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3926lEeR5KfoEr4xU5yHH7.iterator();
            while (it.hasNext()) {
                HJFh0TGMpafqLE9haL.this.XdzLv4NdAtTYoEzVzB((RecyclerView.OUd9THiLjZndMj0qdF) it.next());
            }
            this.f3926lEeR5KfoEr4xU5yHH7.clear();
            HJFh0TGMpafqLE9haL.this.f3916e54J8UWNHWALQNixXM.remove(this.f3926lEeR5KfoEr4xU5yHH7);
        }
    }

    public class IPyIQcaNa8aB7drBED extends AnimatorListenerAdapter {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ View f3928HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ pbVGzGjWvY2LDXC8vo f3929lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3930s3fjYDxWOUexjjVgyA;

        public IPyIQcaNa8aB7drBED(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3929lEeR5KfoEr4xU5yHH7 = pbvgzgjwvy2ldxc8vo;
            this.f3930s3fjYDxWOUexjjVgyA = viewPropertyAnimator;
            this.f3928HJFh0TGMpafqLE9haL = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3930s3fjYDxWOUexjjVgyA.setListener(null);
            this.f3928HJFh0TGMpafqLE9haL.setAlpha(1.0f);
            this.f3928HJFh0TGMpafqLE9haL.setTranslationX(0.0f);
            this.f3928HJFh0TGMpafqLE9haL.setTranslationY(0.0f);
            HJFh0TGMpafqLE9haL.this.OUd9THiLjZndMj0qdF(this.f3929lEeR5KfoEr4xU5yHH7.f3952s3fjYDxWOUexjjVgyA, false);
            HJFh0TGMpafqLE9haL.this.f3919sTkWmhpZ5b1ArQIw4K.remove(this.f3929lEeR5KfoEr4xU5yHH7.f3952s3fjYDxWOUexjjVgyA);
            HJFh0TGMpafqLE9haL.this.udcVtCzLTM1Loe9KrX();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HJFh0TGMpafqLE9haL.this.jCtUeU2YI1poCxWcjm(this.f3929lEeR5KfoEr4xU5yHH7.f3952s3fjYDxWOUexjjVgyA, false);
        }
    }

    public class KYHag8HRDlnO3X9zmZ extends AnimatorListenerAdapter {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ View f3932HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3934husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.OUd9THiLjZndMj0qdF f3935lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ int f3936s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final /* synthetic */ int f3937zZKhbgvUfsK4AEX3r0;

        public KYHag8HRDlnO3X9zmZ(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3935lEeR5KfoEr4xU5yHH7 = oUd9THiLjZndMj0qdF;
            this.f3936s3fjYDxWOUexjjVgyA = i;
            this.f3932HJFh0TGMpafqLE9haL = view;
            this.f3937zZKhbgvUfsK4AEX3r0 = i2;
            this.f3934husNiw3snxdgZPAGJm = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3936s3fjYDxWOUexjjVgyA != 0) {
                this.f3932HJFh0TGMpafqLE9haL.setTranslationX(0.0f);
            }
            if (this.f3937zZKhbgvUfsK4AEX3r0 != 0) {
                this.f3932HJFh0TGMpafqLE9haL.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3934husNiw3snxdgZPAGJm.setListener(null);
            HJFh0TGMpafqLE9haL.this.XzJ1BS7H9Ilbkv4eVM(this.f3935lEeR5KfoEr4xU5yHH7);
            HJFh0TGMpafqLE9haL.this.f3912OANkd3mP6AYvwbNLJM.remove(this.f3935lEeR5KfoEr4xU5yHH7);
            HJFh0TGMpafqLE9haL.this.udcVtCzLTM1Loe9KrX();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HJFh0TGMpafqLE9haL.this.tXWeW0sqVddf7ZBflq(this.f3935lEeR5KfoEr4xU5yHH7);
        }
    }

    public class TCyPEKSzIyweCN5yp1 extends AnimatorListenerAdapter {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ View f3938HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ pbVGzGjWvY2LDXC8vo f3939lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3940s3fjYDxWOUexjjVgyA;

        public TCyPEKSzIyweCN5yp1(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3939lEeR5KfoEr4xU5yHH7 = pbvgzgjwvy2ldxc8vo;
            this.f3940s3fjYDxWOUexjjVgyA = viewPropertyAnimator;
            this.f3938HJFh0TGMpafqLE9haL = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3940s3fjYDxWOUexjjVgyA.setListener(null);
            this.f3938HJFh0TGMpafqLE9haL.setAlpha(1.0f);
            this.f3938HJFh0TGMpafqLE9haL.setTranslationX(0.0f);
            this.f3938HJFh0TGMpafqLE9haL.setTranslationY(0.0f);
            HJFh0TGMpafqLE9haL.this.OUd9THiLjZndMj0qdF(this.f3939lEeR5KfoEr4xU5yHH7.f3951lEeR5KfoEr4xU5yHH7, true);
            HJFh0TGMpafqLE9haL.this.f3919sTkWmhpZ5b1ArQIw4K.remove(this.f3939lEeR5KfoEr4xU5yHH7.f3951lEeR5KfoEr4xU5yHH7);
            HJFh0TGMpafqLE9haL.this.udcVtCzLTM1Loe9KrX();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HJFh0TGMpafqLE9haL.this.jCtUeU2YI1poCxWcjm(this.f3939lEeR5KfoEr4xU5yHH7.f3951lEeR5KfoEr4xU5yHH7, true);
        }
    }

    public class husNiw3snxdgZPAGJm extends AnimatorListenerAdapter {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3942HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.OUd9THiLjZndMj0qdF f3943lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ View f3944s3fjYDxWOUexjjVgyA;

        public husNiw3snxdgZPAGJm(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3943lEeR5KfoEr4xU5yHH7 = oUd9THiLjZndMj0qdF;
            this.f3944s3fjYDxWOUexjjVgyA = view;
            this.f3942HJFh0TGMpafqLE9haL = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3944s3fjYDxWOUexjjVgyA.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3942HJFh0TGMpafqLE9haL.setListener(null);
            HJFh0TGMpafqLE9haL.this.THTDvPxsHqMeGb512f(this.f3943lEeR5KfoEr4xU5yHH7);
            HJFh0TGMpafqLE9haL.this.f3915aPyGSIylzVNKPT1Bls.remove(this.f3943lEeR5KfoEr4xU5yHH7);
            HJFh0TGMpafqLE9haL.this.udcVtCzLTM1Loe9KrX();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HJFh0TGMpafqLE9haL.this.ao3wqKm5CXFuvC0q47(this.f3943lEeR5KfoEr4xU5yHH7);
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3946lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(ArrayList arrayList) {
            this.f3946lEeR5KfoEr4xU5yHH7 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3946lEeR5KfoEr4xU5yHH7.iterator();
            while (it.hasNext()) {
                Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = (Acstmh57AKoSEkEFNJ) it.next();
                HJFh0TGMpafqLE9haL.this.zcy2NNbtVXgoGQbfuq(acstmh57AKoSEkEFNJ.f3923lEeR5KfoEr4xU5yHH7, acstmh57AKoSEkEFNJ.f3924s3fjYDxWOUexjjVgyA, acstmh57AKoSEkEFNJ.f3921HJFh0TGMpafqLE9haL, acstmh57AKoSEkEFNJ.f3925zZKhbgvUfsK4AEX3r0, acstmh57AKoSEkEFNJ.f3922husNiw3snxdgZPAGJm);
            }
            this.f3946lEeR5KfoEr4xU5yHH7.clear();
            HJFh0TGMpafqLE9haL.this.f3913T9PhQIpGRhE4yZDm1C.remove(this.f3946lEeR5KfoEr4xU5yHH7);
        }
    }

    public static class pbVGzGjWvY2LDXC8vo {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f3948HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int f3949KYHag8HRDlnO3X9zmZ;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f3950husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public RecyclerView.OUd9THiLjZndMj0qdF f3951lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public RecyclerView.OUd9THiLjZndMj0qdF f3952s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f3953zZKhbgvUfsK4AEX3r0;

        public pbVGzGjWvY2LDXC8vo(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF2) {
            this.f3951lEeR5KfoEr4xU5yHH7 = oUd9THiLjZndMj0qdF;
            this.f3952s3fjYDxWOUexjjVgyA = oUd9THiLjZndMj0qdF2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3951lEeR5KfoEr4xU5yHH7 + ", newHolder=" + this.f3952s3fjYDxWOUexjjVgyA + ", fromX=" + this.f3948HJFh0TGMpafqLE9haL + ", fromY=" + this.f3953zZKhbgvUfsK4AEX3r0 + ", toX=" + this.f3950husNiw3snxdgZPAGJm + ", toY=" + this.f3949KYHag8HRDlnO3X9zmZ + '}';
        }

        public pbVGzGjWvY2LDXC8vo(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF2, int i, int i2, int i3, int i4) {
            this(oUd9THiLjZndMj0qdF, oUd9THiLjZndMj0qdF2);
            this.f3948HJFh0TGMpafqLE9haL = i;
            this.f3953zZKhbgvUfsK4AEX3r0 = i2;
            this.f3950husNiw3snxdgZPAGJm = i3;
            this.f3949KYHag8HRDlnO3X9zmZ = i4;
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3954lEeR5KfoEr4xU5yHH7;

        public s3fjYDxWOUexjjVgyA(ArrayList arrayList) {
            this.f3954lEeR5KfoEr4xU5yHH7 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3954lEeR5KfoEr4xU5yHH7.iterator();
            while (it.hasNext()) {
                HJFh0TGMpafqLE9haL.this.LU0fFDMACqnfIfA1AZ((pbVGzGjWvY2LDXC8vo) it.next());
            }
            this.f3954lEeR5KfoEr4xU5yHH7.clear();
            HJFh0TGMpafqLE9haL.this.f3917hoXrIDAFrSwfShk8da.remove(this.f3954lEeR5KfoEr4xU5yHH7);
        }
    }

    public class zZKhbgvUfsK4AEX3r0 extends AnimatorListenerAdapter {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ View f3956HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.OUd9THiLjZndMj0qdF f3957lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3958s3fjYDxWOUexjjVgyA;

        public zZKhbgvUfsK4AEX3r0(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3957lEeR5KfoEr4xU5yHH7 = oUd9THiLjZndMj0qdF;
            this.f3958s3fjYDxWOUexjjVgyA = viewPropertyAnimator;
            this.f3956HJFh0TGMpafqLE9haL = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3958s3fjYDxWOUexjjVgyA.setListener(null);
            this.f3956HJFh0TGMpafqLE9haL.setAlpha(1.0f);
            HJFh0TGMpafqLE9haL.this.W3RZ2dTDKrKpS5Mxdk(this.f3957lEeR5KfoEr4xU5yHH7);
            HJFh0TGMpafqLE9haL.this.f3920zaq8hOURtfwbcX17cG.remove(this.f3957lEeR5KfoEr4xU5yHH7);
            HJFh0TGMpafqLE9haL.this.udcVtCzLTM1Loe9KrX();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HJFh0TGMpafqLE9haL.this.OqIo5QF00RDxUQb4qq(this.f3957lEeR5KfoEr4xU5yHH7);
        }
    }

    @Override // androidx.recyclerview.widget.T9PhQIpGRhE4yZDm1C
    public boolean A49QRPHynYLCBN0SqP(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF2, int i, int i2, int i3, int i4) {
        if (oUd9THiLjZndMj0qdF == oUd9THiLjZndMj0qdF2) {
            return VItLRw50eXTZeEfGl0(oUd9THiLjZndMj0qdF, i, i2, i3, i4);
        }
        float translationX = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.getTranslationX();
        float translationY = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.getTranslationY();
        float alpha = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.getAlpha();
        Uj8rPa1EWADtk6Oe0S(oUd9THiLjZndMj0qdF);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.setTranslationX(translationX);
        oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.setTranslationY(translationY);
        oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.setAlpha(alpha);
        if (oUd9THiLjZndMj0qdF2 != null) {
            Uj8rPa1EWADtk6Oe0S(oUd9THiLjZndMj0qdF2);
            oUd9THiLjZndMj0qdF2.f4125lEeR5KfoEr4xU5yHH7.setTranslationX(-i5);
            oUd9THiLjZndMj0qdF2.f4125lEeR5KfoEr4xU5yHH7.setTranslationY(-i6);
            oUd9THiLjZndMj0qdF2.f4125lEeR5KfoEr4xU5yHH7.setAlpha(0.0f);
        }
        this.f3914Z9WdNiOsPR0y54zHW4.add(new pbVGzGjWvY2LDXC8vo(oUd9THiLjZndMj0qdF, oUd9THiLjZndMj0qdF2, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e54J8UWNHWALQNixXM
    public void Acstmh57AKoSEkEFNJ(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        View view = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7;
        view.animate().cancel();
        int size = this.f3910Acstmh57AKoSEkEFNJ.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((Acstmh57AKoSEkEFNJ) this.f3910Acstmh57AKoSEkEFNJ.get(size)).f3923lEeR5KfoEr4xU5yHH7 == oUd9THiLjZndMj0qdF) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                XzJ1BS7H9Ilbkv4eVM(oUd9THiLjZndMj0qdF);
                this.f3910Acstmh57AKoSEkEFNJ.remove(size);
            }
        }
        cT5Hs3CQpLK8NvlZAw(this.f3914Z9WdNiOsPR0y54zHW4, oUd9THiLjZndMj0qdF);
        if (this.f3911IPyIQcaNa8aB7drBED.remove(oUd9THiLjZndMj0qdF)) {
            view.setAlpha(1.0f);
            W3RZ2dTDKrKpS5Mxdk(oUd9THiLjZndMj0qdF);
        }
        if (this.f3918pbVGzGjWvY2LDXC8vo.remove(oUd9THiLjZndMj0qdF)) {
            view.setAlpha(1.0f);
            THTDvPxsHqMeGb512f(oUd9THiLjZndMj0qdF);
        }
        for (int size2 = this.f3917hoXrIDAFrSwfShk8da.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f3917hoXrIDAFrSwfShk8da.get(size2);
            cT5Hs3CQpLK8NvlZAw(arrayList, oUd9THiLjZndMj0qdF);
            if (arrayList.isEmpty()) {
                this.f3917hoXrIDAFrSwfShk8da.remove(size2);
            }
        }
        for (int size3 = this.f3913T9PhQIpGRhE4yZDm1C.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f3913T9PhQIpGRhE4yZDm1C.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((Acstmh57AKoSEkEFNJ) arrayList2.get(size4)).f3923lEeR5KfoEr4xU5yHH7 == oUd9THiLjZndMj0qdF) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    XzJ1BS7H9Ilbkv4eVM(oUd9THiLjZndMj0qdF);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3913T9PhQIpGRhE4yZDm1C.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3916e54J8UWNHWALQNixXM.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f3916e54J8UWNHWALQNixXM.get(size5);
            if (arrayList3.remove(oUd9THiLjZndMj0qdF)) {
                view.setAlpha(1.0f);
                THTDvPxsHqMeGb512f(oUd9THiLjZndMj0qdF);
                if (arrayList3.isEmpty()) {
                    this.f3916e54J8UWNHWALQNixXM.remove(size5);
                }
            }
        }
        this.f3920zaq8hOURtfwbcX17cG.remove(oUd9THiLjZndMj0qdF);
        this.f3915aPyGSIylzVNKPT1Bls.remove(oUd9THiLjZndMj0qdF);
        this.f3919sTkWmhpZ5b1ArQIw4K.remove(oUd9THiLjZndMj0qdF);
        this.f3912OANkd3mP6AYvwbNLJM.remove(oUd9THiLjZndMj0qdF);
        udcVtCzLTM1Loe9KrX();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e54J8UWNHWALQNixXM
    public void G7AC3DWIx9i9fdanjk() {
        boolean z = !this.f3911IPyIQcaNa8aB7drBED.isEmpty();
        boolean z2 = !this.f3910Acstmh57AKoSEkEFNJ.isEmpty();
        boolean z3 = !this.f3914Z9WdNiOsPR0y54zHW4.isEmpty();
        boolean z4 = !this.f3918pbVGzGjWvY2LDXC8vo.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f3911IPyIQcaNa8aB7drBED.iterator();
            while (it.hasNext()) {
                YlLW4G6OV9TFyuw5ix((RecyclerView.OUd9THiLjZndMj0qdF) it.next());
            }
            this.f3911IPyIQcaNa8aB7drBED.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3910Acstmh57AKoSEkEFNJ);
                this.f3913T9PhQIpGRhE4yZDm1C.add(arrayList);
                this.f3910Acstmh57AKoSEkEFNJ.clear();
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7(arrayList);
                if (z) {
                    lLKzvdU99Iw80uVD5I.Tu4WCh2gEwj8E4oHbP(((Acstmh57AKoSEkEFNJ) arrayList.get(0)).f3923lEeR5KfoEr4xU5yHH7.f4125lEeR5KfoEr4xU5yHH7, leer5kfoer4xu5yhh7, aPyGSIylzVNKPT1Bls());
                } else {
                    leer5kfoer4xu5yhh7.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3914Z9WdNiOsPR0y54zHW4);
                this.f3917hoXrIDAFrSwfShk8da.add(arrayList2);
                this.f3914Z9WdNiOsPR0y54zHW4.clear();
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new s3fjYDxWOUexjjVgyA(arrayList2);
                if (z) {
                    lLKzvdU99Iw80uVD5I.Tu4WCh2gEwj8E4oHbP(((pbVGzGjWvY2LDXC8vo) arrayList2.get(0)).f3951lEeR5KfoEr4xU5yHH7.f4125lEeR5KfoEr4xU5yHH7, s3fjydxwouexjjvgya, aPyGSIylzVNKPT1Bls());
                } else {
                    s3fjydxwouexjjvgya.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3918pbVGzGjWvY2LDXC8vo);
                this.f3916e54J8UWNHWALQNixXM.add(arrayList3);
                this.f3918pbVGzGjWvY2LDXC8vo.clear();
                RunnableC0050HJFh0TGMpafqLE9haL runnableC0050HJFh0TGMpafqLE9haL = new RunnableC0050HJFh0TGMpafqLE9haL(arrayList3);
                if (z || z2 || z3) {
                    lLKzvdU99Iw80uVD5I.Tu4WCh2gEwj8E4oHbP(((RecyclerView.OUd9THiLjZndMj0qdF) arrayList3.get(0)).f4125lEeR5KfoEr4xU5yHH7, runnableC0050HJFh0TGMpafqLE9haL, (z ? aPyGSIylzVNKPT1Bls() : 0L) + Math.max(z2 ? hoXrIDAFrSwfShk8da() : 0L, z3 ? T9PhQIpGRhE4yZDm1C() : 0L));
                } else {
                    runnableC0050HJFh0TGMpafqLE9haL.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.T9PhQIpGRhE4yZDm1C
    public boolean LIMtzhnLwQyigzK0KO(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        Uj8rPa1EWADtk6Oe0S(oUd9THiLjZndMj0qdF);
        oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.setAlpha(0.0f);
        this.f3918pbVGzGjWvY2LDXC8vo.add(oUd9THiLjZndMj0qdF);
        return true;
    }

    public void LU0fFDMACqnfIfA1AZ(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = pbvgzgjwvy2ldxc8vo.f3951lEeR5KfoEr4xU5yHH7;
        View view = oUd9THiLjZndMj0qdF == null ? null : oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7;
        RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF2 = pbvgzgjwvy2ldxc8vo.f3952s3fjYDxWOUexjjVgyA;
        View view2 = oUd9THiLjZndMj0qdF2 != null ? oUd9THiLjZndMj0qdF2.f4125lEeR5KfoEr4xU5yHH7 : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(T9PhQIpGRhE4yZDm1C());
            this.f3919sTkWmhpZ5b1ArQIw4K.add(pbvgzgjwvy2ldxc8vo.f3951lEeR5KfoEr4xU5yHH7);
            duration.translationX(pbvgzgjwvy2ldxc8vo.f3950husNiw3snxdgZPAGJm - pbvgzgjwvy2ldxc8vo.f3948HJFh0TGMpafqLE9haL);
            duration.translationY(pbvgzgjwvy2ldxc8vo.f3949KYHag8HRDlnO3X9zmZ - pbvgzgjwvy2ldxc8vo.f3953zZKhbgvUfsK4AEX3r0);
            duration.alpha(0.0f).setListener(new TCyPEKSzIyweCN5yp1(pbvgzgjwvy2ldxc8vo, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f3919sTkWmhpZ5b1ArQIw4K.add(pbvgzgjwvy2ldxc8vo.f3952s3fjYDxWOUexjjVgyA);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(T9PhQIpGRhE4yZDm1C()).alpha(1.0f).setListener(new IPyIQcaNa8aB7drBED(pbvgzgjwvy2ldxc8vo, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e54J8UWNHWALQNixXM
    public boolean OANkd3mP6AYvwbNLJM() {
        return (this.f3918pbVGzGjWvY2LDXC8vo.isEmpty() && this.f3914Z9WdNiOsPR0y54zHW4.isEmpty() && this.f3910Acstmh57AKoSEkEFNJ.isEmpty() && this.f3911IPyIQcaNa8aB7drBED.isEmpty() && this.f3912OANkd3mP6AYvwbNLJM.isEmpty() && this.f3920zaq8hOURtfwbcX17cG.isEmpty() && this.f3915aPyGSIylzVNKPT1Bls.isEmpty() && this.f3919sTkWmhpZ5b1ArQIw4K.isEmpty() && this.f3913T9PhQIpGRhE4yZDm1C.isEmpty() && this.f3916e54J8UWNHWALQNixXM.isEmpty() && this.f3917hoXrIDAFrSwfShk8da.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e54J8UWNHWALQNixXM
    public boolean TCyPEKSzIyweCN5yp1(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, List list) {
        return !list.isEmpty() || super.TCyPEKSzIyweCN5yp1(oUd9THiLjZndMj0qdF, list);
    }

    public final void Uj8rPa1EWADtk6Oe0S(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        if (f3909Y43RdunnpKgpbny0lE == null) {
            f3909Y43RdunnpKgpbny0lE = new ValueAnimator().getInterpolator();
        }
        oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.animate().setInterpolator(f3909Y43RdunnpKgpbny0lE);
        Acstmh57AKoSEkEFNJ(oUd9THiLjZndMj0qdF);
    }

    @Override // androidx.recyclerview.widget.T9PhQIpGRhE4yZDm1C
    public boolean VItLRw50eXTZeEfGl0(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, int i, int i2, int i3, int i4) {
        View view = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.getTranslationY());
        Uj8rPa1EWADtk6Oe0S(oUd9THiLjZndMj0qdF);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            XzJ1BS7H9Ilbkv4eVM(oUd9THiLjZndMj0qdF);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f3910Acstmh57AKoSEkEFNJ.add(new Acstmh57AKoSEkEFNJ(oUd9THiLjZndMj0qdF, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.T9PhQIpGRhE4yZDm1C
    public boolean WWC27LAMFqFFBzfbNw(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        Uj8rPa1EWADtk6Oe0S(oUd9THiLjZndMj0qdF);
        this.f3911IPyIQcaNa8aB7drBED.add(oUd9THiLjZndMj0qdF);
        return true;
    }

    public void XdzLv4NdAtTYoEzVzB(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        View view = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3915aPyGSIylzVNKPT1Bls.add(oUd9THiLjZndMj0qdF);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(e54J8UWNHWALQNixXM()).setListener(new husNiw3snxdgZPAGJm(oUd9THiLjZndMj0qdF, view, viewPropertyAnimatorAnimate)).start();
    }

    public final void YlLW4G6OV9TFyuw5ix(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        View view = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3920zaq8hOURtfwbcX17cG.add(oUd9THiLjZndMj0qdF);
        viewPropertyAnimatorAnimate.setDuration(aPyGSIylzVNKPT1Bls()).alpha(0.0f).setListener(new zZKhbgvUfsK4AEX3r0(oUd9THiLjZndMj0qdF, viewPropertyAnimatorAnimate, view)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e54J8UWNHWALQNixXM
    public void Z9WdNiOsPR0y54zHW4() {
        int size = this.f3910Acstmh57AKoSEkEFNJ.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = (Acstmh57AKoSEkEFNJ) this.f3910Acstmh57AKoSEkEFNJ.get(size);
            View view = acstmh57AKoSEkEFNJ.f3923lEeR5KfoEr4xU5yHH7.f4125lEeR5KfoEr4xU5yHH7;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            XzJ1BS7H9Ilbkv4eVM(acstmh57AKoSEkEFNJ.f3923lEeR5KfoEr4xU5yHH7);
            this.f3910Acstmh57AKoSEkEFNJ.remove(size);
        }
        for (int size2 = this.f3911IPyIQcaNa8aB7drBED.size() - 1; size2 >= 0; size2--) {
            W3RZ2dTDKrKpS5Mxdk((RecyclerView.OUd9THiLjZndMj0qdF) this.f3911IPyIQcaNa8aB7drBED.get(size2));
            this.f3911IPyIQcaNa8aB7drBED.remove(size2);
        }
        int size3 = this.f3918pbVGzGjWvY2LDXC8vo.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = (RecyclerView.OUd9THiLjZndMj0qdF) this.f3918pbVGzGjWvY2LDXC8vo.get(size3);
            oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.setAlpha(1.0f);
            THTDvPxsHqMeGb512f(oUd9THiLjZndMj0qdF);
            this.f3918pbVGzGjWvY2LDXC8vo.remove(size3);
        }
        for (int size4 = this.f3914Z9WdNiOsPR0y54zHW4.size() - 1; size4 >= 0; size4--) {
            hUNBy66ZO1wVLJGW3l((pbVGzGjWvY2LDXC8vo) this.f3914Z9WdNiOsPR0y54zHW4.get(size4));
        }
        this.f3914Z9WdNiOsPR0y54zHW4.clear();
        if (OANkd3mP6AYvwbNLJM()) {
            for (int size5 = this.f3913T9PhQIpGRhE4yZDm1C.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f3913T9PhQIpGRhE4yZDm1C.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ2 = (Acstmh57AKoSEkEFNJ) arrayList.get(size6);
                    View view2 = acstmh57AKoSEkEFNJ2.f3923lEeR5KfoEr4xU5yHH7.f4125lEeR5KfoEr4xU5yHH7;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    XzJ1BS7H9Ilbkv4eVM(acstmh57AKoSEkEFNJ2.f3923lEeR5KfoEr4xU5yHH7);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3913T9PhQIpGRhE4yZDm1C.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3916e54J8UWNHWALQNixXM.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f3916e54J8UWNHWALQNixXM.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF2 = (RecyclerView.OUd9THiLjZndMj0qdF) arrayList2.get(size8);
                    oUd9THiLjZndMj0qdF2.f4125lEeR5KfoEr4xU5yHH7.setAlpha(1.0f);
                    THTDvPxsHqMeGb512f(oUd9THiLjZndMj0qdF2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3916e54J8UWNHWALQNixXM.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3917hoXrIDAFrSwfShk8da.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f3917hoXrIDAFrSwfShk8da.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    hUNBy66ZO1wVLJGW3l((pbVGzGjWvY2LDXC8vo) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3917hoXrIDAFrSwfShk8da.remove(arrayList3);
                    }
                }
            }
            oocVJL811qFf0j0XXZ(this.f3920zaq8hOURtfwbcX17cG);
            oocVJL811qFf0j0XXZ(this.f3912OANkd3mP6AYvwbNLJM);
            oocVJL811qFf0j0XXZ(this.f3915aPyGSIylzVNKPT1Bls);
            oocVJL811qFf0j0XXZ(this.f3919sTkWmhpZ5b1ArQIw4K);
            pbVGzGjWvY2LDXC8vo();
        }
    }

    public final boolean bMSdooljgH14Jgudph(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        boolean z = false;
        if (pbvgzgjwvy2ldxc8vo.f3952s3fjYDxWOUexjjVgyA == oUd9THiLjZndMj0qdF) {
            pbvgzgjwvy2ldxc8vo.f3952s3fjYDxWOUexjjVgyA = null;
        } else {
            if (pbvgzgjwvy2ldxc8vo.f3951lEeR5KfoEr4xU5yHH7 != oUd9THiLjZndMj0qdF) {
                return false;
            }
            pbvgzgjwvy2ldxc8vo.f3951lEeR5KfoEr4xU5yHH7 = null;
            z = true;
        }
        oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.setAlpha(1.0f);
        oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.setTranslationX(0.0f);
        oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7.setTranslationY(0.0f);
        OUd9THiLjZndMj0qdF(oUd9THiLjZndMj0qdF, z);
        return true;
    }

    public final void cT5Hs3CQpLK8NvlZAw(List list, RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        for (int size = list.size() - 1; size >= 0; size--) {
            pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = (pbVGzGjWvY2LDXC8vo) list.get(size);
            if (bMSdooljgH14Jgudph(pbvgzgjwvy2ldxc8vo, oUd9THiLjZndMj0qdF) && pbvgzgjwvy2ldxc8vo.f3951lEeR5KfoEr4xU5yHH7 == null && pbvgzgjwvy2ldxc8vo.f3952s3fjYDxWOUexjjVgyA == null) {
                list.remove(pbvgzgjwvy2ldxc8vo);
            }
        }
    }

    public final void hUNBy66ZO1wVLJGW3l(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = pbvgzgjwvy2ldxc8vo.f3951lEeR5KfoEr4xU5yHH7;
        if (oUd9THiLjZndMj0qdF != null) {
            bMSdooljgH14Jgudph(pbvgzgjwvy2ldxc8vo, oUd9THiLjZndMj0qdF);
        }
        RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF2 = pbvgzgjwvy2ldxc8vo.f3952s3fjYDxWOUexjjVgyA;
        if (oUd9THiLjZndMj0qdF2 != null) {
            bMSdooljgH14Jgudph(pbvgzgjwvy2ldxc8vo, oUd9THiLjZndMj0qdF2);
        }
    }

    public void oocVJL811qFf0j0XXZ(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.OUd9THiLjZndMj0qdF) list.get(size)).f4125lEeR5KfoEr4xU5yHH7.animate().cancel();
        }
    }

    public void udcVtCzLTM1Loe9KrX() {
        if (OANkd3mP6AYvwbNLJM()) {
            return;
        }
        pbVGzGjWvY2LDXC8vo();
    }

    public void zcy2NNbtVXgoGQbfuq(RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, int i, int i2, int i3, int i4) {
        View view = oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3912OANkd3mP6AYvwbNLJM.add(oUd9THiLjZndMj0qdF);
        viewPropertyAnimatorAnimate.setDuration(hoXrIDAFrSwfShk8da()).setListener(new KYHag8HRDlnO3X9zmZ(oUd9THiLjZndMj0qdF, i5, view, i6, viewPropertyAnimatorAnimate)).start();
    }
}
