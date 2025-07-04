package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class hoXrIDAFrSwfShk8da extends RecyclerView.zaq8hOURtfwbcX17cG {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final RecyclerView.Y43RdunnpKgpbny0lE f4293HJFh0TGMpafqLE9haL = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public RecyclerView f4294lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Scroller f4295s3fjYDxWOUexjjVgyA;

    public class lEeR5KfoEr4xU5yHH7 extends RecyclerView.Y43RdunnpKgpbny0lE {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f4296lEeR5KfoEr4xU5yHH7 = false;

        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Y43RdunnpKgpbny0lE
        public void lEeR5KfoEr4xU5yHH7(RecyclerView recyclerView, int i) {
            super.lEeR5KfoEr4xU5yHH7(recyclerView, i);
            if (i == 0 && this.f4296lEeR5KfoEr4xU5yHH7) {
                this.f4296lEeR5KfoEr4xU5yHH7 = false;
                hoXrIDAFrSwfShk8da.this.Z9WdNiOsPR0y54zHW4();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Y43RdunnpKgpbny0lE
        public void s3fjYDxWOUexjjVgyA(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f4296lEeR5KfoEr4xU5yHH7 = true;
        }
    }

    public final boolean Acstmh57AKoSEkEFNJ(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, int i, int i2) {
        RecyclerView.VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0ZZKhbgvUfsK4AEX3r0;
        int iIPyIQcaNa8aB7drBED;
        if (!(apygsiylzvnkpt1bls instanceof RecyclerView.VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA) || (vItLRw50eXTZeEfGl0ZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(apygsiylzvnkpt1bls)) == null || (iIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(apygsiylzvnkpt1bls, i, i2)) == -1) {
            return false;
        }
        vItLRw50eXTZeEfGl0ZZKhbgvUfsK4AEX3r0.OANkd3mP6AYvwbNLJM(iIPyIQcaNa8aB7drBED);
        apygsiylzvnkpt1bls.yuvys90eVmNOCmVGXw(vItLRw50eXTZeEfGl0ZZKhbgvUfsK4AEX3r0);
        return true;
    }

    public abstract int[] HJFh0TGMpafqLE9haL(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, View view);

    public abstract int IPyIQcaNa8aB7drBED(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, int i, int i2);

    public final void KYHag8HRDlnO3X9zmZ() {
        this.f4294lEeR5KfoEr4xU5yHH7.EscIOBqRhG6irG5q11(this.f4293HJFh0TGMpafqLE9haL);
        this.f4294lEeR5KfoEr4xU5yHH7.setOnFlingListener(null);
    }

    public abstract View TCyPEKSzIyweCN5yp1(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls);

    public void Z9WdNiOsPR0y54zHW4() {
        RecyclerView.aPyGSIylzVNKPT1Bls layoutManager;
        View viewTCyPEKSzIyweCN5yp1;
        RecyclerView recyclerView = this.f4294lEeR5KfoEr4xU5yHH7;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(layoutManager)) == null) {
            return;
        }
        int[] iArrHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(layoutManager, viewTCyPEKSzIyweCN5yp1);
        int i = iArrHJFh0TGMpafqLE9haL[0];
        if (i == 0 && iArrHJFh0TGMpafqLE9haL[1] == 0) {
            return;
        }
        this.f4294lEeR5KfoEr4xU5yHH7.fBZDmBPlAHk1Liuf1T(i, iArrHJFh0TGMpafqLE9haL[1]);
    }

    public abstract TCyPEKSzIyweCN5yp1 husNiw3snxdgZPAGJm(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls);

    @Override // androidx.recyclerview.widget.RecyclerView.zaq8hOURtfwbcX17cG
    public boolean lEeR5KfoEr4xU5yHH7(int i, int i2) {
        RecyclerView.aPyGSIylzVNKPT1Bls layoutManager = this.f4294lEeR5KfoEr4xU5yHH7.getLayoutManager();
        if (layoutManager == null || this.f4294lEeR5KfoEr4xU5yHH7.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4294lEeR5KfoEr4xU5yHH7.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && Acstmh57AKoSEkEFNJ(layoutManager, i, i2);
    }

    public final void pbVGzGjWvY2LDXC8vo() {
        if (this.f4294lEeR5KfoEr4xU5yHH7.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f4294lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(this.f4293HJFh0TGMpafqLE9haL);
        this.f4294lEeR5KfoEr4xU5yHH7.setOnFlingListener(this);
    }

    public void s3fjYDxWOUexjjVgyA(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4294lEeR5KfoEr4xU5yHH7;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            KYHag8HRDlnO3X9zmZ();
        }
        this.f4294lEeR5KfoEr4xU5yHH7 = recyclerView;
        if (recyclerView != null) {
            pbVGzGjWvY2LDXC8vo();
            this.f4295s3fjYDxWOUexjjVgyA = new Scroller(this.f4294lEeR5KfoEr4xU5yHH7.getContext(), new DecelerateInterpolator());
            Z9WdNiOsPR0y54zHW4();
        }
    }

    public RecyclerView.VItLRw50eXTZeEfGl0 zZKhbgvUfsK4AEX3r0(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        return husNiw3snxdgZPAGJm(apygsiylzvnkpt1bls);
    }
}
