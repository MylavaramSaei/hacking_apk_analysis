package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class TCyPEKSzIyweCN5yp1 extends RecyclerView.VItLRw50eXTZeEfGl0 {

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public PointF f4277Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final DisplayMetrics f4279e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public float f4280hoXrIDAFrSwfShk8da;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final LinearInterpolator f4281pbVGzGjWvY2LDXC8vo = new LinearInterpolator();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final DecelerateInterpolator f4274Acstmh57AKoSEkEFNJ = new DecelerateInterpolator();

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public boolean f4276T9PhQIpGRhE4yZDm1C = false;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public int f4278aPyGSIylzVNKPT1Bls = 0;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public int f4275OANkd3mP6AYvwbNLJM = 0;

    public TCyPEKSzIyweCN5yp1(Context context) {
        this.f4279e54J8UWNHWALQNixXM = context.getResources().getDisplayMetrics();
    }

    public int A49QRPHynYLCBN0SqP(int i) {
        return (int) Math.ceil(Math.abs(i) * THTDvPxsHqMeGb512f());
    }

    public int G7AC3DWIx9i9fdanjk(View view, int i) {
        RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm();
        if (apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm == null || !apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm.zaq8hOURtfwbcX17cG()) {
            return 0;
        }
        RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams();
        return Y43RdunnpKgpbny0lE(apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm.Uj8rPa1EWADtk6Oe0S(view) - ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).topMargin, apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm.YlLW4G6OV9TFyuw5ix(view) + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).bottomMargin, apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm.DFYiVi7zXozAjRciKa(), apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm.osrHU7fvDp2EgxZPfM() - apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm.ctWLFN70QQINH1kyYo(), i);
    }

    public int LIMtzhnLwQyigzK0KO(int i) {
        return (int) Math.ceil(A49QRPHynYLCBN0SqP(i) / 0.3356d);
    }

    public void OUd9THiLjZndMj0qdF(RecyclerView.VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        PointF pointFLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ());
        if (pointFLEeR5KfoEr4xU5yHH7 == null || (pointFLEeR5KfoEr4xU5yHH7.x == 0.0f && pointFLEeR5KfoEr4xU5yHH7.y == 0.0f)) {
            leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(KYHag8HRDlnO3X9zmZ());
            sTkWmhpZ5b1ArQIw4K();
            return;
        }
        pbVGzGjWvY2LDXC8vo(pointFLEeR5KfoEr4xU5yHH7);
        this.f4277Z9WdNiOsPR0y54zHW4 = pointFLEeR5KfoEr4xU5yHH7;
        this.f4278aPyGSIylzVNKPT1Bls = (int) (pointFLEeR5KfoEr4xU5yHH7.x * 10000.0f);
        this.f4275OANkd3mP6AYvwbNLJM = (int) (pointFLEeR5KfoEr4xU5yHH7.y * 10000.0f);
        leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0((int) (this.f4278aPyGSIylzVNKPT1Bls * 1.2f), (int) (this.f4275OANkd3mP6AYvwbNLJM * 1.2f), (int) (A49QRPHynYLCBN0SqP(10000) * 1.2f), this.f4281pbVGzGjWvY2LDXC8vo);
    }

    public int R9SAhYMerGybF9OAjL(View view, int i) {
        RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm();
        if (apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm == null || !apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm.OANkd3mP6AYvwbNLJM()) {
            return 0;
        }
        RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams();
        return Y43RdunnpKgpbny0lE(apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm.udcVtCzLTM1Loe9KrX(view) - ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).leftMargin, apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm.bMSdooljgH14Jgudph(view) + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).rightMargin, apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm.zXY7dgnTfw9Pd9RXel(), apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm.O1furmptfI76BGfN0d() - apygsiylzvnkpt1blsHusNiw3snxdgZPAGJm.eWK41qw3g36LVd4UnS(), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.VItLRw50eXTZeEfGl0
    public void T9PhQIpGRhE4yZDm1C() {
    }

    public final float THTDvPxsHqMeGb512f() {
        if (!this.f4276T9PhQIpGRhE4yZDm1C) {
            this.f4280hoXrIDAFrSwfShk8da = xHA29AmDt6y96AnB3t(this.f4279e54J8UWNHWALQNixXM);
            this.f4276T9PhQIpGRhE4yZDm1C = true;
        }
        return this.f4280hoXrIDAFrSwfShk8da;
    }

    public final int VItLRw50eXTZeEfGl0(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    public int WWC27LAMFqFFBzfbNw() {
        PointF pointF = this.f4277Z9WdNiOsPR0y54zHW4;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public int Y43RdunnpKgpbny0lE(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.VItLRw50eXTZeEfGl0
    public void aPyGSIylzVNKPT1Bls(View view, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, RecyclerView.VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        int iR9SAhYMerGybF9OAjL = R9SAhYMerGybF9OAjL(view, WWC27LAMFqFFBzfbNw());
        int iG7AC3DWIx9i9fdanjk = G7AC3DWIx9i9fdanjk(view, ao3wqKm5CXFuvC0q47());
        int iLIMtzhnLwQyigzK0KO = LIMtzhnLwQyigzK0KO((int) Math.sqrt((iR9SAhYMerGybF9OAjL * iR9SAhYMerGybF9OAjL) + (iG7AC3DWIx9i9fdanjk * iG7AC3DWIx9i9fdanjk)));
        if (iLIMtzhnLwQyigzK0KO > 0) {
            leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0(-iR9SAhYMerGybF9OAjL, -iG7AC3DWIx9i9fdanjk, iLIMtzhnLwQyigzK0KO, this.f4274Acstmh57AKoSEkEFNJ);
        }
    }

    public int ao3wqKm5CXFuvC0q47() {
        PointF pointF = this.f4277Z9WdNiOsPR0y54zHW4;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.VItLRw50eXTZeEfGl0
    public void e54J8UWNHWALQNixXM(int i, int i2, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, RecyclerView.VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (HJFh0TGMpafqLE9haL() == 0) {
            sTkWmhpZ5b1ArQIw4K();
            return;
        }
        this.f4278aPyGSIylzVNKPT1Bls = VItLRw50eXTZeEfGl0(this.f4278aPyGSIylzVNKPT1Bls, i);
        int iVItLRw50eXTZeEfGl0 = VItLRw50eXTZeEfGl0(this.f4275OANkd3mP6AYvwbNLJM, i2);
        this.f4275OANkd3mP6AYvwbNLJM = iVItLRw50eXTZeEfGl0;
        if (this.f4278aPyGSIylzVNKPT1Bls == 0 && iVItLRw50eXTZeEfGl0 == 0) {
            OUd9THiLjZndMj0qdF(leer5kfoer4xu5yhh7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.VItLRw50eXTZeEfGl0
    public void hoXrIDAFrSwfShk8da() {
        this.f4275OANkd3mP6AYvwbNLJM = 0;
        this.f4278aPyGSIylzVNKPT1Bls = 0;
        this.f4277Z9WdNiOsPR0y54zHW4 = null;
    }

    public float xHA29AmDt6y96AnB3t(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }
}
