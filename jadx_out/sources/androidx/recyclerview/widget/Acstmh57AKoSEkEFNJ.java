package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class Acstmh57AKoSEkEFNJ extends hoXrIDAFrSwfShk8da {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public pbVGzGjWvY2LDXC8vo f3891husNiw3snxdgZPAGJm;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public pbVGzGjWvY2LDXC8vo f3892zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 extends TCyPEKSzIyweCN5yp1 {
        public lEeR5KfoEr4xU5yHH7(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.TCyPEKSzIyweCN5yp1
        public int A49QRPHynYLCBN0SqP(int i) {
            return Math.min(100, super.A49QRPHynYLCBN0SqP(i));
        }

        @Override // androidx.recyclerview.widget.TCyPEKSzIyweCN5yp1, androidx.recyclerview.widget.RecyclerView.VItLRw50eXTZeEfGl0
        public void aPyGSIylzVNKPT1Bls(View view, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, RecyclerView.VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ.this;
            int[] iArrHJFh0TGMpafqLE9haL = acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(acstmh57AKoSEkEFNJ.f4294lEeR5KfoEr4xU5yHH7.getLayoutManager(), view);
            int i = iArrHJFh0TGMpafqLE9haL[0];
            int i2 = iArrHJFh0TGMpafqLE9haL[1];
            int iLIMtzhnLwQyigzK0KO = LIMtzhnLwQyigzK0KO(Math.max(Math.abs(i), Math.abs(i2)));
            if (iLIMtzhnLwQyigzK0KO > 0) {
                leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0(i, i2, iLIMtzhnLwQyigzK0KO, this.f4274Acstmh57AKoSEkEFNJ);
            }
        }

        @Override // androidx.recyclerview.widget.TCyPEKSzIyweCN5yp1
        public float xHA29AmDt6y96AnB3t(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // androidx.recyclerview.widget.hoXrIDAFrSwfShk8da
    public int[] HJFh0TGMpafqLE9haL(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, View view) {
        int[] iArr = new int[2];
        if (apygsiylzvnkpt1bls.OANkd3mP6AYvwbNLJM()) {
            iArr[0] = e54J8UWNHWALQNixXM(apygsiylzvnkpt1bls, view, hoXrIDAFrSwfShk8da(apygsiylzvnkpt1bls));
        } else {
            iArr[0] = 0;
        }
        if (apygsiylzvnkpt1bls.zaq8hOURtfwbcX17cG()) {
            iArr[1] = e54J8UWNHWALQNixXM(apygsiylzvnkpt1bls, view, OANkd3mP6AYvwbNLJM(apygsiylzvnkpt1bls));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.hoXrIDAFrSwfShk8da
    public int IPyIQcaNa8aB7drBED(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, int i, int i2) {
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voAPyGSIylzVNKPT1Bls;
        int iS3fjYDxWOUexjjVgyA = apygsiylzvnkpt1bls.s3fjYDxWOUexjjVgyA();
        if (iS3fjYDxWOUexjjVgyA == 0 || (pbvgzgjwvy2ldxc8voAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(apygsiylzvnkpt1bls)) == null) {
            return -1;
        }
        int iLLKzvdU99Iw80uVD5I = apygsiylzvnkpt1bls.lLKzvdU99Iw80uVD5I();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < iLLKzvdU99Iw80uVD5I; i5++) {
            View viewAAp6BD79BhftLCnuvf = apygsiylzvnkpt1bls.aAp6BD79BhftLCnuvf(i5);
            if (viewAAp6BD79BhftLCnuvf != null) {
                int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(apygsiylzvnkpt1bls, viewAAp6BD79BhftLCnuvf, pbvgzgjwvy2ldxc8voAPyGSIylzVNKPT1Bls);
                if (iE54J8UWNHWALQNixXM <= 0 && iE54J8UWNHWALQNixXM > i4) {
                    view2 = viewAAp6BD79BhftLCnuvf;
                    i4 = iE54J8UWNHWALQNixXM;
                }
                if (iE54J8UWNHWALQNixXM >= 0 && iE54J8UWNHWALQNixXM < i3) {
                    view = viewAAp6BD79BhftLCnuvf;
                    i3 = iE54J8UWNHWALQNixXM;
                }
            }
        }
        boolean zZaq8hOURtfwbcX17cG = zaq8hOURtfwbcX17cG(apygsiylzvnkpt1bls, i, i2);
        if (zZaq8hOURtfwbcX17cG && view != null) {
            return apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view);
        }
        if (!zZaq8hOURtfwbcX17cG && view2 != null) {
            return apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view2);
        }
        if (zZaq8hOURtfwbcX17cG) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iFtYx4GXtxwA8al5hBy = apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view) + (sTkWmhpZ5b1ArQIw4K(apygsiylzvnkpt1bls) == zZaq8hOURtfwbcX17cG ? -1 : 1);
        if (iFtYx4GXtxwA8al5hBy < 0 || iFtYx4GXtxwA8al5hBy >= iS3fjYDxWOUexjjVgyA) {
            return -1;
        }
        return iFtYx4GXtxwA8al5hBy;
    }

    public final pbVGzGjWvY2LDXC8vo OANkd3mP6AYvwbNLJM(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = this.f3892zZKhbgvUfsK4AEX3r0;
        if (pbvgzgjwvy2ldxc8vo == null || pbvgzgjwvy2ldxc8vo.f4326lEeR5KfoEr4xU5yHH7 != apygsiylzvnkpt1bls) {
            this.f3892zZKhbgvUfsK4AEX3r0 = pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(apygsiylzvnkpt1bls);
        }
        return this.f3892zZKhbgvUfsK4AEX3r0;
    }

    public final View T9PhQIpGRhE4yZDm1C(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        int iLLKzvdU99Iw80uVD5I = apygsiylzvnkpt1bls.lLKzvdU99Iw80uVD5I();
        View view = null;
        if (iLLKzvdU99Iw80uVD5I == 0) {
            return null;
        }
        int iT9PhQIpGRhE4yZDm1C = pbvgzgjwvy2ldxc8vo.T9PhQIpGRhE4yZDm1C() + (pbvgzgjwvy2ldxc8vo.hoXrIDAFrSwfShk8da() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iLLKzvdU99Iw80uVD5I; i2++) {
            View viewAAp6BD79BhftLCnuvf = apygsiylzvnkpt1bls.aAp6BD79BhftLCnuvf(i2);
            int iAbs = Math.abs((pbvgzgjwvy2ldxc8vo.TCyPEKSzIyweCN5yp1(viewAAp6BD79BhftLCnuvf) + (pbvgzgjwvy2ldxc8vo.husNiw3snxdgZPAGJm(viewAAp6BD79BhftLCnuvf) / 2)) - iT9PhQIpGRhE4yZDm1C);
            if (iAbs < i) {
                view = viewAAp6BD79BhftLCnuvf;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.hoXrIDAFrSwfShk8da
    public View TCyPEKSzIyweCN5yp1(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voHoXrIDAFrSwfShk8da;
        if (apygsiylzvnkpt1bls.zaq8hOURtfwbcX17cG()) {
            pbvgzgjwvy2ldxc8voHoXrIDAFrSwfShk8da = OANkd3mP6AYvwbNLJM(apygsiylzvnkpt1bls);
        } else {
            if (!apygsiylzvnkpt1bls.OANkd3mP6AYvwbNLJM()) {
                return null;
            }
            pbvgzgjwvy2ldxc8voHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(apygsiylzvnkpt1bls);
        }
        return T9PhQIpGRhE4yZDm1C(apygsiylzvnkpt1bls, pbvgzgjwvy2ldxc8voHoXrIDAFrSwfShk8da);
    }

    public final pbVGzGjWvY2LDXC8vo aPyGSIylzVNKPT1Bls(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        if (apygsiylzvnkpt1bls.zaq8hOURtfwbcX17cG()) {
            return OANkd3mP6AYvwbNLJM(apygsiylzvnkpt1bls);
        }
        if (apygsiylzvnkpt1bls.OANkd3mP6AYvwbNLJM()) {
            return hoXrIDAFrSwfShk8da(apygsiylzvnkpt1bls);
        }
        return null;
    }

    public final int e54J8UWNHWALQNixXM(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, View view, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        return (pbvgzgjwvy2ldxc8vo.TCyPEKSzIyweCN5yp1(view) + (pbvgzgjwvy2ldxc8vo.husNiw3snxdgZPAGJm(view) / 2)) - (pbvgzgjwvy2ldxc8vo.T9PhQIpGRhE4yZDm1C() + (pbvgzgjwvy2ldxc8vo.hoXrIDAFrSwfShk8da() / 2));
    }

    public final pbVGzGjWvY2LDXC8vo hoXrIDAFrSwfShk8da(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = this.f3891husNiw3snxdgZPAGJm;
        if (pbvgzgjwvy2ldxc8vo == null || pbvgzgjwvy2ldxc8vo.f4326lEeR5KfoEr4xU5yHH7 != apygsiylzvnkpt1bls) {
            this.f3891husNiw3snxdgZPAGJm = pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(apygsiylzvnkpt1bls);
        }
        return this.f3891husNiw3snxdgZPAGJm;
    }

    @Override // androidx.recyclerview.widget.hoXrIDAFrSwfShk8da
    public TCyPEKSzIyweCN5yp1 husNiw3snxdgZPAGJm(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        if (apygsiylzvnkpt1bls instanceof RecyclerView.VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA) {
            return new lEeR5KfoEr4xU5yHH7(this.f4294lEeR5KfoEr4xU5yHH7.getContext());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean sTkWmhpZ5b1ArQIw4K(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        PointF pointFHusNiw3snxdgZPAGJm;
        int iS3fjYDxWOUexjjVgyA = apygsiylzvnkpt1bls.s3fjYDxWOUexjjVgyA();
        if (!(apygsiylzvnkpt1bls instanceof RecyclerView.VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA) || (pointFHusNiw3snxdgZPAGJm = ((RecyclerView.VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA) apygsiylzvnkpt1bls).husNiw3snxdgZPAGJm(iS3fjYDxWOUexjjVgyA - 1)) == null) {
            return false;
        }
        return pointFHusNiw3snxdgZPAGJm.x < 0.0f || pointFHusNiw3snxdgZPAGJm.y < 0.0f;
    }

    public final boolean zaq8hOURtfwbcX17cG(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, int i, int i2) {
        return apygsiylzvnkpt1bls.OANkd3mP6AYvwbNLJM() ? i > 0 : i2 > 0;
    }
}
