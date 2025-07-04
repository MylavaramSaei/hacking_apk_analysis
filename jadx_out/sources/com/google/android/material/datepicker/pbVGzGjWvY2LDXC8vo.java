package com.google.android.material.datepicker;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class pbVGzGjWvY2LDXC8vo<S> extends zaq8hOURtfwbcX17cG {

    /* renamed from: DFYiVi7zXozAjRciKa, reason: collision with root package name */
    public static final Object f5184DFYiVi7zXozAjRciKa = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: FtYx4GXtxwA8al5hBy, reason: collision with root package name */
    public static final Object f5185FtYx4GXtxwA8al5hBy = "NAVIGATION_PREV_TAG";

    /* renamed from: ayduHasC7VpxsVXE0T, reason: collision with root package name */
    public static final Object f5186ayduHasC7VpxsVXE0T = "NAVIGATION_NEXT_TAG";

    /* renamed from: xMfAHy6F7qK0zhxhKG, reason: collision with root package name */
    public static final Object f5187xMfAHy6F7qK0zhxhKG = "SELECTOR_TOGGLE_TAG";

    /* renamed from: Kh0uC90qEEhuLdpgB9, reason: collision with root package name */
    public com.google.android.material.datepicker.HJFh0TGMpafqLE9haL f5188Kh0uC90qEEhuLdpgB9;

    /* renamed from: Pum9NZyDBKoCnecvlx, reason: collision with root package name */
    public RecyclerView f5189Pum9NZyDBKoCnecvlx;

    /* renamed from: Tu4WCh2gEwj8E4oHbP, reason: collision with root package name */
    public com.google.android.material.datepicker.T9PhQIpGRhE4yZDm1C f5190Tu4WCh2gEwj8E4oHbP;

    /* renamed from: ZJNyOIPL0usMs2xSAn, reason: collision with root package name */
    public com.google.android.material.datepicker.lEeR5KfoEr4xU5yHH7 f5191ZJNyOIPL0usMs2xSAn;

    /* renamed from: ctWLFN70QQINH1kyYo, reason: collision with root package name */
    public RecyclerView f5192ctWLFN70QQINH1kyYo;

    /* renamed from: eWK41qw3g36LVd4UnS, reason: collision with root package name */
    public View f5193eWK41qw3g36LVd4UnS;

    /* renamed from: evSiTWao80SbJUZk9E, reason: collision with root package name */
    public View f5194evSiTWao80SbJUZk9E;

    /* renamed from: jocVUfxESVhVJU8LoH, reason: collision with root package name */
    public View f5195jocVUfxESVhVJU8LoH;

    /* renamed from: k0CbjZvfUz23r8IN6W, reason: collision with root package name */
    public e54J8UWNHWALQNixXM f5196k0CbjZvfUz23r8IN6W;

    /* renamed from: osrHU7fvDp2EgxZPfM, reason: collision with root package name */
    public int f5197osrHU7fvDp2EgxZPfM;

    /* renamed from: zXY7dgnTfw9Pd9RXel, reason: collision with root package name */
    public View f5198zXY7dgnTfw9Pd9RXel;

    public class Acstmh57AKoSEkEFNJ implements View.OnClickListener {
        public Acstmh57AKoSEkEFNJ() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            pbVGzGjWvY2LDXC8vo.this.LjVYrU4NjguFeQ2fwa();
        }
    }

    public class HJFh0TGMpafqLE9haL extends W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 {
        public HJFh0TGMpafqLE9haL() {
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void TCyPEKSzIyweCN5yp1(View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            super.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
            a49QRPHynYLCBN0SqP.evSiTWao80SbJUZk9E(null);
        }
    }

    public class IPyIQcaNa8aB7drBED extends W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 {
        public IPyIQcaNa8aB7drBED() {
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void TCyPEKSzIyweCN5yp1(View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo;
            int i;
            super.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
            if (pbVGzGjWvY2LDXC8vo.this.f5194evSiTWao80SbJUZk9E.getVisibility() == 0) {
                pbvgzgjwvy2ldxc8vo = pbVGzGjWvY2LDXC8vo.this;
                i = tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED.f7066sTkWmhpZ5b1ArQIw4K;
            } else {
                pbvgzgjwvy2ldxc8vo = pbVGzGjWvY2LDXC8vo.this;
                i = tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED.f7053OANkd3mP6AYvwbNLJM;
            }
            a49QRPHynYLCBN0SqP.yvdWWG9COQQotjfedH(pbvgzgjwvy2ldxc8vo.PPkm9uUfOJHHYveeLT(i));
        }
    }

    public class KYHag8HRDlnO3X9zmZ extends W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 {
        public KYHag8HRDlnO3X9zmZ() {
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void TCyPEKSzIyweCN5yp1(View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            super.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
            a49QRPHynYLCBN0SqP.HZ4bptRS9XIcK1CV95(false);
        }
    }

    public interface T9PhQIpGRhE4yZDm1C {
        void lEeR5KfoEr4xU5yHH7(long j);
    }

    public class TCyPEKSzIyweCN5yp1 extends RecyclerView.hoXrIDAFrSwfShk8da {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Calendar f5204lEeR5KfoEr4xU5yHH7 = R9SAhYMerGybF9OAjL.pbVGzGjWvY2LDXC8vo();

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Calendar f5205s3fjYDxWOUexjjVgyA = R9SAhYMerGybF9OAjL.pbVGzGjWvY2LDXC8vo();

        public TCyPEKSzIyweCN5yp1() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.hoXrIDAFrSwfShk8da
        public void TCyPEKSzIyweCN5yp1(Canvas canvas, RecyclerView recyclerView, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
            if ((recyclerView.getAdapter() instanceof G7AC3DWIx9i9fdanjk) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                pbVGzGjWvY2LDXC8vo.GeBgWLiG3rAOvStVF8(pbVGzGjWvY2LDXC8vo.this);
                throw null;
            }
        }
    }

    public class Z9WdNiOsPR0y54zHW4 implements View.OnClickListener {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ aPyGSIylzVNKPT1Bls f5206lEeR5KfoEr4xU5yHH7;

        public Z9WdNiOsPR0y54zHW4(aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
            this.f5206lEeR5KfoEr4xU5yHH7 = apygsiylzvnkpt1bls;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iPjij9fAFhRRn230kOs = pbVGzGjWvY2LDXC8vo.this.sKw6Jz5uGcQ479KwIW().pjij9fAFhRRn230kOs() + 1;
            if (iPjij9fAFhRRn230kOs < pbVGzGjWvY2LDXC8vo.this.f5192ctWLFN70QQINH1kyYo.getAdapter().HJFh0TGMpafqLE9haL()) {
                pbVGzGjWvY2LDXC8vo.this.zWzrlx9vIdLp7FoEMD(this.f5206lEeR5KfoEr4xU5yHH7.G7AC3DWIx9i9fdanjk(iPjij9fAFhRRn230kOs));
            }
        }
    }

    public enum e54J8UWNHWALQNixXM {
        DAY,
        YEAR
    }

    public class husNiw3snxdgZPAGJm implements T9PhQIpGRhE4yZDm1C {
        public husNiw3snxdgZPAGJm() {
        }

        @Override // com.google.android.material.datepicker.pbVGzGjWvY2LDXC8vo.T9PhQIpGRhE4yZDm1C
        public void lEeR5KfoEr4xU5yHH7(long j) {
            if (pbVGzGjWvY2LDXC8vo.this.f5191ZJNyOIPL0usMs2xSAn.IPyIQcaNa8aB7drBED().lEeR5KfoEr4xU5yHH7(j)) {
                pbVGzGjWvY2LDXC8vo.GeBgWLiG3rAOvStVF8(pbVGzGjWvY2LDXC8vo.this);
                throw null;
            }
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements View.OnClickListener {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ aPyGSIylzVNKPT1Bls f5212lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
            this.f5212lEeR5KfoEr4xU5yHH7 = apygsiylzvnkpt1bls;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iMhQSzVvPFnByVGnwX9 = pbVGzGjWvY2LDXC8vo.this.sKw6Jz5uGcQ479KwIW().mhQSzVvPFnByVGnwX9() - 1;
            if (iMhQSzVvPFnByVGnwX9 >= 0) {
                pbVGzGjWvY2LDXC8vo.this.zWzrlx9vIdLp7FoEMD(this.f5212lEeR5KfoEr4xU5yHH7.G7AC3DWIx9i9fdanjk(iMhQSzVvPFnByVGnwX9));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.pbVGzGjWvY2LDXC8vo$pbVGzGjWvY2LDXC8vo, reason: collision with other inner class name */
    public class C0081pbVGzGjWvY2LDXC8vo extends RecyclerView.Y43RdunnpKgpbny0lE {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ aPyGSIylzVNKPT1Bls f5215lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ MaterialButton f5216s3fjYDxWOUexjjVgyA;

        public C0081pbVGzGjWvY2LDXC8vo(aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, MaterialButton materialButton) {
            this.f5215lEeR5KfoEr4xU5yHH7 = apygsiylzvnkpt1bls;
            this.f5216s3fjYDxWOUexjjVgyA = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Y43RdunnpKgpbny0lE
        public void lEeR5KfoEr4xU5yHH7(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f5216s3fjYDxWOUexjjVgyA.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Y43RdunnpKgpbny0lE
        public void s3fjYDxWOUexjjVgyA(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager linearLayoutManagerSKw6Jz5uGcQ479KwIW = pbVGzGjWvY2LDXC8vo.this.sKw6Jz5uGcQ479KwIW();
            int iPjij9fAFhRRn230kOs = i < 0 ? linearLayoutManagerSKw6Jz5uGcQ479KwIW.pjij9fAFhRRn230kOs() : linearLayoutManagerSKw6Jz5uGcQ479KwIW.mhQSzVvPFnByVGnwX9();
            pbVGzGjWvY2LDXC8vo.this.f5190Tu4WCh2gEwj8E4oHbP = this.f5215lEeR5KfoEr4xU5yHH7.G7AC3DWIx9i9fdanjk(iPjij9fAFhRRn230kOs);
            this.f5216s3fjYDxWOUexjjVgyA.setText(this.f5215lEeR5KfoEr4xU5yHH7.xHA29AmDt6y96AnB3t(iPjij9fAFhRRn230kOs));
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ int f5217lEeR5KfoEr4xU5yHH7;

        public s3fjYDxWOUexjjVgyA(int i) {
            this.f5217lEeR5KfoEr4xU5yHH7 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            pbVGzGjWvY2LDXC8vo.this.f5192ctWLFN70QQINH1kyYo.ayaSAlBnO403UB0TMR(this.f5217lEeR5KfoEr4xU5yHH7);
        }
    }

    public class zZKhbgvUfsK4AEX3r0 extends sTkWmhpZ5b1ArQIw4K {

        /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
        public final /* synthetic */ int f5220GyWRxpdt1T8mEJXPoD;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zZKhbgvUfsK4AEX3r0(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f5220GyWRxpdt1T8mEJXPoD = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void GraqRgO5nDZP94CSeH(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int[] iArr) {
            if (this.f5220GyWRxpdt1T8mEJXPoD == 0) {
                iArr[0] = pbVGzGjWvY2LDXC8vo.this.f5192ctWLFN70QQINH1kyYo.getWidth();
                iArr[1] = pbVGzGjWvY2LDXC8vo.this.f5192ctWLFN70QQINH1kyYo.getWidth();
            } else {
                iArr[0] = pbVGzGjWvY2LDXC8vo.this.f5192ctWLFN70QQINH1kyYo.getHeight();
                iArr[1] = pbVGzGjWvY2LDXC8vo.this.f5192ctWLFN70QQINH1kyYo.getHeight();
            }
        }
    }

    public static pbVGzGjWvY2LDXC8vo FXtjrf53D5B1cLsLFG(com.google.android.material.datepicker.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, int i, com.google.android.material.datepicker.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, com.google.android.material.datepicker.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1) {
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = new pbVGzGjWvY2LDXC8vo();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", zzkhbgvufsk4aex3r0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", leer5kfoer4xu5yhh7);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", tCyPEKSzIyweCN5yp1);
        bundle.putParcelable("CURRENT_MONTH_KEY", leer5kfoer4xu5yhh7.e54J8UWNHWALQNixXM());
        pbvgzgjwvy2ldxc8vo.tmIBXGVvBsrJ7i63G2(bundle);
        return pbvgzgjwvy2ldxc8vo;
    }

    public static /* synthetic */ com.google.android.material.datepicker.zZKhbgvUfsK4AEX3r0 GeBgWLiG3rAOvStVF8(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        pbvgzgjwvy2ldxc8vo.getClass();
        return null;
    }

    public static int auvQiDfBN48eRz3fFq(Context context) {
        return context.getResources().getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7012OqIo5QF00RDxUQb4qq);
    }

    public static int gpnYwZkFpQwu7zi2gb(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7038lLKzvdU99Iw80uVD5I) + resources.getDimensionPixelOffset(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7018ToH8yzk8U1nKT0PUfY) + resources.getDimensionPixelOffset(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7027aAp6BD79BhftLCnuvf);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7001DfpieXfdYs58yZAiXY);
        int i = hoXrIDAFrSwfShk8da.f5165husNiw3snxdgZPAGJm;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7012OqIo5QF00RDxUQb4qq) * i) + ((i - 1) * resources.getDimensionPixelOffset(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7013PPkm9uUfOJHHYveeLT)) + resources.getDimensionPixelOffset(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7043tXWeW0sqVddf7ZBflq);
    }

    public final void BGBL3rAlNaaPWRbRlF() {
        lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(this.f5192ctWLFN70QQINH1kyYo, new KYHag8HRDlnO3X9zmZ());
    }

    public void LjVYrU4NjguFeQ2fwa() {
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f5196k0CbjZvfUz23r8IN6W;
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm2 = e54J8UWNHWALQNixXM.YEAR;
        if (e54j8uwnhwalqnixxm == e54j8uwnhwalqnixxm2) {
            TZ2u8Z18RnXun7OSW0(e54J8UWNHWALQNixXM.DAY);
        } else if (e54j8uwnhwalqnixxm == e54J8UWNHWALQNixXM.DAY) {
            TZ2u8Z18RnXun7OSW0(e54j8uwnhwalqnixxm2);
        }
    }

    public com.google.android.material.datepicker.zZKhbgvUfsK4AEX3r0 R6kEk3zZuOluTikhN3() {
        return null;
    }

    public void TZ2u8Z18RnXun7OSW0(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
        this.f5196k0CbjZvfUz23r8IN6W = e54j8uwnhwalqnixxm;
        if (e54j8uwnhwalqnixxm == e54J8UWNHWALQNixXM.YEAR) {
            this.f5189Pum9NZyDBKoCnecvlx.getLayoutManager().zQjb36M22TWHJmh54i(((G7AC3DWIx9i9fdanjk) this.f5189Pum9NZyDBKoCnecvlx.getAdapter()).R9SAhYMerGybF9OAjL(this.f5190Tu4WCh2gEwj8E4oHbP.f5108HJFh0TGMpafqLE9haL));
            this.f5193eWK41qw3g36LVd4UnS.setVisibility(0);
            this.f5194evSiTWao80SbJUZk9E.setVisibility(8);
            this.f5195jocVUfxESVhVJU8LoH.setVisibility(8);
            this.f5198zXY7dgnTfw9Pd9RXel.setVisibility(8);
            return;
        }
        if (e54j8uwnhwalqnixxm == e54J8UWNHWALQNixXM.DAY) {
            this.f5193eWK41qw3g36LVd4UnS.setVisibility(8);
            this.f5194evSiTWao80SbJUZk9E.setVisibility(0);
            this.f5195jocVUfxESVhVJU8LoH.setVisibility(0);
            this.f5198zXY7dgnTfw9Pd9RXel.setVisibility(0);
            zWzrlx9vIdLp7FoEMD(this.f5190Tu4WCh2gEwj8E4oHbP);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View ZJNyOIPL0usMs2xSAn(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(aPyGSIylzVNKPT1Bls(), this.f5197osrHU7fvDp2EgxZPfM);
        this.f5188Kh0uC90qEEhuLdpgB9 = new com.google.android.material.datepicker.HJFh0TGMpafqLE9haL(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.T9PhQIpGRhE4yZDm1C T9PhQIpGRhE4yZDm1C2 = this.f5191ZJNyOIPL0usMs2xSAn.T9PhQIpGRhE4yZDm1C();
        if (com.google.android.material.datepicker.Z9WdNiOsPR0y54zHW4.hUNDUI3oB5uci3ylnY(contextThemeWrapper)) {
            i = tmIBXGVvBsrJ7i63G2.TCyPEKSzIyweCN5yp1.f7080hoXrIDAFrSwfShk8da;
            i2 = 1;
        } else {
            i = tmIBXGVvBsrJ7i63G2.TCyPEKSzIyweCN5yp1.f7079e54J8UWNHWALQNixXM;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        viewInflate.setMinimumHeight(gpnYwZkFpQwu7zi2gb(OWyIJu8lIXxQlvLhaC()));
        GridView gridView = (GridView) viewInflate.findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7090G7AC3DWIx9i9fdanjk);
        lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(gridView, new HJFh0TGMpafqLE9haL());
        int iAcstmh57AKoSEkEFNJ = this.f5191ZJNyOIPL0usMs2xSAn.Acstmh57AKoSEkEFNJ();
        gridView.setAdapter((ListAdapter) (iAcstmh57AKoSEkEFNJ > 0 ? new com.google.android.material.datepicker.IPyIQcaNa8aB7drBED(iAcstmh57AKoSEkEFNJ) : new com.google.android.material.datepicker.IPyIQcaNa8aB7drBED()));
        gridView.setNumColumns(T9PhQIpGRhE4yZDm1C2.f5114zZKhbgvUfsK4AEX3r0);
        gridView.setEnabled(false);
        this.f5192ctWLFN70QQINH1kyYo = (RecyclerView) viewInflate.findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7087A49QRPHynYLCBN0SqP);
        this.f5192ctWLFN70QQINH1kyYo.setLayoutManager(new zZKhbgvUfsK4AEX3r0(aPyGSIylzVNKPT1Bls(), i2, false, i2));
        this.f5192ctWLFN70QQINH1kyYo.setTag(f5184DFYiVi7zXozAjRciKa);
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = new aPyGSIylzVNKPT1Bls(contextThemeWrapper, null, this.f5191ZJNyOIPL0usMs2xSAn, null, new husNiw3snxdgZPAGJm());
        this.f5192ctWLFN70QQINH1kyYo.setAdapter(apygsiylzvnkpt1bls);
        int integer = contextThemeWrapper.getResources().getInteger(tmIBXGVvBsrJ7i63G2.KYHag8HRDlnO3X9zmZ.f7069lEeR5KfoEr4xU5yHH7);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7105VItLRw50eXTZeEfGl0);
        this.f5189Pum9NZyDBKoCnecvlx = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f5189Pum9NZyDBKoCnecvlx.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f5189Pum9NZyDBKoCnecvlx.setAdapter(new G7AC3DWIx9i9fdanjk(this));
            this.f5189Pum9NZyDBKoCnecvlx.TCyPEKSzIyweCN5yp1(hgxXdWVkE1CPHCTwpz());
        }
        if (viewInflate.findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7097OANkd3mP6AYvwbNLJM) != null) {
            fBZDmBPlAHk1Liuf1T(viewInflate, apygsiylzvnkpt1bls);
        }
        if (!com.google.android.material.datepicker.Z9WdNiOsPR0y54zHW4.hUNDUI3oB5uci3ylnY(contextThemeWrapper)) {
            new androidx.recyclerview.widget.Acstmh57AKoSEkEFNJ().s3fjYDxWOUexjjVgyA(this.f5192ctWLFN70QQINH1kyYo);
        }
        this.f5192ctWLFN70QQINH1kyYo.MHebQjnRowM60e3HDn(apygsiylzvnkpt1bls.LIMtzhnLwQyigzK0KO(this.f5190Tu4WCh2gEwj8E4oHbP));
        BGBL3rAlNaaPWRbRlF();
        return viewInflate;
    }

    public com.google.android.material.datepicker.T9PhQIpGRhE4yZDm1C ayaSAlBnO403UB0TMR() {
        return this.f5190Tu4WCh2gEwj8E4oHbP;
    }

    @Override // androidx.fragment.app.Fragment
    public void ayduHasC7VpxsVXE0T(Bundle bundle) {
        super.ayduHasC7VpxsVXE0T(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f5197osrHU7fvDp2EgxZPfM);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5191ZJNyOIPL0usMs2xSAn);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f5190Tu4WCh2gEwj8E4oHbP);
    }

    @Override // androidx.fragment.app.Fragment
    public void bMSdooljgH14Jgudph(Bundle bundle) {
        super.bMSdooljgH14Jgudph(bundle);
        if (bundle == null) {
            bundle = T9PhQIpGRhE4yZDm1C();
        }
        this.f5197osrHU7fvDp2EgxZPfM = bundle.getInt("THEME_RES_ID_KEY");
        androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f5191ZJNyOIPL0usMs2xSAn = (com.google.android.material.datepicker.lEeR5KfoEr4xU5yHH7) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f5190Tu4WCh2gEwj8E4oHbP = (com.google.android.material.datepicker.T9PhQIpGRhE4yZDm1C) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // com.google.android.material.datepicker.zaq8hOURtfwbcX17cG
    public boolean cr99CPXhoiknALiHbq(OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
        return super.cr99CPXhoiknALiHbq(oANkd3mP6AYvwbNLJM);
    }

    public com.google.android.material.datepicker.lEeR5KfoEr4xU5yHH7 dCumDqZdWZ8NLrsgb7() {
        return this.f5191ZJNyOIPL0usMs2xSAn;
    }

    public final void dvmHGYHwlE2ean7ktb(int i) {
        this.f5192ctWLFN70QQINH1kyYo.post(new s3fjYDxWOUexjjVgyA(i));
    }

    public final void fBZDmBPlAHk1Liuf1T(View view, aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7097OANkd3mP6AYvwbNLJM);
        materialButton.setTag(f5187xMfAHy6F7qK0zhxhKG);
        lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(materialButton, new IPyIQcaNa8aB7drBED());
        View viewFindViewById = view.findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7121sTkWmhpZ5b1ArQIw4K);
        this.f5195jocVUfxESVhVJU8LoH = viewFindViewById;
        viewFindViewById.setTag(f5185FtYx4GXtxwA8al5hBy);
        View viewFindViewById2 = view.findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7125zaq8hOURtfwbcX17cG);
        this.f5198zXY7dgnTfw9Pd9RXel = viewFindViewById2;
        viewFindViewById2.setTag(f5186ayduHasC7VpxsVXE0T);
        this.f5193eWK41qw3g36LVd4UnS = view.findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7105VItLRw50eXTZeEfGl0);
        this.f5194evSiTWao80SbJUZk9E = view.findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7101R9SAhYMerGybF9OAjL);
        TZ2u8Z18RnXun7OSW0(e54J8UWNHWALQNixXM.DAY);
        materialButton.setText(this.f5190Tu4WCh2gEwj8E4oHbP.Acstmh57AKoSEkEFNJ());
        this.f5192ctWLFN70QQINH1kyYo.Acstmh57AKoSEkEFNJ(new C0081pbVGzGjWvY2LDXC8vo(apygsiylzvnkpt1bls, materialButton));
        materialButton.setOnClickListener(new Acstmh57AKoSEkEFNJ());
        this.f5198zXY7dgnTfw9Pd9RXel.setOnClickListener(new Z9WdNiOsPR0y54zHW4(apygsiylzvnkpt1bls));
        this.f5195jocVUfxESVhVJU8LoH.setOnClickListener(new lEeR5KfoEr4xU5yHH7(apygsiylzvnkpt1bls));
    }

    public final RecyclerView.hoXrIDAFrSwfShk8da hgxXdWVkE1CPHCTwpz() {
        return new TCyPEKSzIyweCN5yp1();
    }

    public com.google.android.material.datepicker.HJFh0TGMpafqLE9haL lBAL39rPf03qYLFNNP() {
        return this.f5188Kh0uC90qEEhuLdpgB9;
    }

    public LinearLayoutManager sKw6Jz5uGcQ479KwIW() {
        return (LinearLayoutManager) this.f5192ctWLFN70QQINH1kyYo.getLayoutManager();
    }

    public void zWzrlx9vIdLp7FoEMD(com.google.android.material.datepicker.T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C) {
        RecyclerView recyclerView;
        int i;
        aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = (aPyGSIylzVNKPT1Bls) this.f5192ctWLFN70QQINH1kyYo.getAdapter();
        int iLIMtzhnLwQyigzK0KO = apygsiylzvnkpt1bls.LIMtzhnLwQyigzK0KO(t9PhQIpGRhE4yZDm1C);
        int iLIMtzhnLwQyigzK0KO2 = iLIMtzhnLwQyigzK0KO - apygsiylzvnkpt1bls.LIMtzhnLwQyigzK0KO(this.f5190Tu4WCh2gEwj8E4oHbP);
        boolean z = Math.abs(iLIMtzhnLwQyigzK0KO2) > 3;
        boolean z2 = iLIMtzhnLwQyigzK0KO2 > 0;
        this.f5190Tu4WCh2gEwj8E4oHbP = t9PhQIpGRhE4yZDm1C;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.f5192ctWLFN70QQINH1kyYo;
                i = iLIMtzhnLwQyigzK0KO + 3;
            }
            dvmHGYHwlE2ean7ktb(iLIMtzhnLwQyigzK0KO);
        }
        recyclerView = this.f5192ctWLFN70QQINH1kyYo;
        i = iLIMtzhnLwQyigzK0KO - 3;
        recyclerView.MHebQjnRowM60e3HDn(i);
        dvmHGYHwlE2ean7ktb(iLIMtzhnLwQyigzK0KO);
    }
}
