package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class pbVGzGjWvY2LDXC8vo {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Rect f4325HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final RecyclerView.aPyGSIylzVNKPT1Bls f4326lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f4327s3fjYDxWOUexjjVgyA;

    public static class lEeR5KfoEr4xU5yHH7 extends pbVGzGjWvY2LDXC8vo {
        public lEeR5KfoEr4xU5yHH7(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
            super(apygsiylzvnkpt1bls, null);
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int Acstmh57AKoSEkEFNJ() {
            return this.f4326lEeR5KfoEr4xU5yHH7.eWK41qw3g36LVd4UnS();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int IPyIQcaNa8aB7drBED() {
            return this.f4326lEeR5KfoEr4xU5yHH7.O1furmptfI76BGfN0d();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int KYHag8HRDlnO3X9zmZ(View view) {
            RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams();
            return this.f4326lEeR5KfoEr4xU5yHH7.cT5Hs3CQpLK8NvlZAw(view) + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).topMargin + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int OANkd3mP6AYvwbNLJM(View view) {
            this.f4326lEeR5KfoEr4xU5yHH7.yvdWWG9COQQotjfedH(view, true, this.f4325HJFh0TGMpafqLE9haL);
            return this.f4325HJFh0TGMpafqLE9haL.right;
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int T9PhQIpGRhE4yZDm1C() {
            return this.f4326lEeR5KfoEr4xU5yHH7.zXY7dgnTfw9Pd9RXel();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int TCyPEKSzIyweCN5yp1(View view) {
            return this.f4326lEeR5KfoEr4xU5yHH7.udcVtCzLTM1Loe9KrX(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int Z9WdNiOsPR0y54zHW4() {
            return this.f4326lEeR5KfoEr4xU5yHH7.iQCvttGuB7nx4r7kMP();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int e54J8UWNHWALQNixXM() {
            return this.f4326lEeR5KfoEr4xU5yHH7.ZJNyOIPL0usMs2xSAn();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int hoXrIDAFrSwfShk8da() {
            return (this.f4326lEeR5KfoEr4xU5yHH7.O1furmptfI76BGfN0d() - this.f4326lEeR5KfoEr4xU5yHH7.zXY7dgnTfw9Pd9RXel()) - this.f4326lEeR5KfoEr4xU5yHH7.eWK41qw3g36LVd4UnS();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int husNiw3snxdgZPAGJm(View view) {
            RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams();
            return this.f4326lEeR5KfoEr4xU5yHH7.hUNBy66ZO1wVLJGW3l(view) + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).leftMargin + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).rightMargin;
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int pbVGzGjWvY2LDXC8vo() {
            return this.f4326lEeR5KfoEr4xU5yHH7.O1furmptfI76BGfN0d() - this.f4326lEeR5KfoEr4xU5yHH7.eWK41qw3g36LVd4UnS();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public void sTkWmhpZ5b1ArQIw4K(int i) {
            this.f4326lEeR5KfoEr4xU5yHH7.vlBaBOcZ1q1ndWVoXn(i);
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int zZKhbgvUfsK4AEX3r0(View view) {
            return this.f4326lEeR5KfoEr4xU5yHH7.bMSdooljgH14Jgudph(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int zaq8hOURtfwbcX17cG(View view) {
            this.f4326lEeR5KfoEr4xU5yHH7.yvdWWG9COQQotjfedH(view, true, this.f4325HJFh0TGMpafqLE9haL);
            return this.f4325HJFh0TGMpafqLE9haL.left;
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends pbVGzGjWvY2LDXC8vo {
        public s3fjYDxWOUexjjVgyA(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
            super(apygsiylzvnkpt1bls, null);
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int Acstmh57AKoSEkEFNJ() {
            return this.f4326lEeR5KfoEr4xU5yHH7.ctWLFN70QQINH1kyYo();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int IPyIQcaNa8aB7drBED() {
            return this.f4326lEeR5KfoEr4xU5yHH7.osrHU7fvDp2EgxZPfM();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int KYHag8HRDlnO3X9zmZ(View view) {
            RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams();
            return this.f4326lEeR5KfoEr4xU5yHH7.hUNBy66ZO1wVLJGW3l(view) + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).leftMargin + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).rightMargin;
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int OANkd3mP6AYvwbNLJM(View view) {
            this.f4326lEeR5KfoEr4xU5yHH7.yvdWWG9COQQotjfedH(view, true, this.f4325HJFh0TGMpafqLE9haL);
            return this.f4325HJFh0TGMpafqLE9haL.bottom;
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int T9PhQIpGRhE4yZDm1C() {
            return this.f4326lEeR5KfoEr4xU5yHH7.DFYiVi7zXozAjRciKa();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int TCyPEKSzIyweCN5yp1(View view) {
            return this.f4326lEeR5KfoEr4xU5yHH7.Uj8rPa1EWADtk6Oe0S(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int Z9WdNiOsPR0y54zHW4() {
            return this.f4326lEeR5KfoEr4xU5yHH7.ZJNyOIPL0usMs2xSAn();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int e54J8UWNHWALQNixXM() {
            return this.f4326lEeR5KfoEr4xU5yHH7.iQCvttGuB7nx4r7kMP();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int hoXrIDAFrSwfShk8da() {
            return (this.f4326lEeR5KfoEr4xU5yHH7.osrHU7fvDp2EgxZPfM() - this.f4326lEeR5KfoEr4xU5yHH7.DFYiVi7zXozAjRciKa()) - this.f4326lEeR5KfoEr4xU5yHH7.ctWLFN70QQINH1kyYo();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int husNiw3snxdgZPAGJm(View view) {
            RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams();
            return this.f4326lEeR5KfoEr4xU5yHH7.cT5Hs3CQpLK8NvlZAw(view) + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).topMargin + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int pbVGzGjWvY2LDXC8vo() {
            return this.f4326lEeR5KfoEr4xU5yHH7.osrHU7fvDp2EgxZPfM() - this.f4326lEeR5KfoEr4xU5yHH7.ctWLFN70QQINH1kyYo();
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public void sTkWmhpZ5b1ArQIw4K(int i) {
            this.f4326lEeR5KfoEr4xU5yHH7.i8aHOwH04efS6lZ3Oa(i);
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int zZKhbgvUfsK4AEX3r0(View view) {
            return this.f4326lEeR5KfoEr4xU5yHH7.YlLW4G6OV9TFyuw5ix(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo
        public int zaq8hOURtfwbcX17cG(View view) {
            this.f4326lEeR5KfoEr4xU5yHH7.yvdWWG9COQQotjfedH(view, true, this.f4325HJFh0TGMpafqLE9haL);
            return this.f4325HJFh0TGMpafqLE9haL.top;
        }
    }

    public pbVGzGjWvY2LDXC8vo(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        this.f4327s3fjYDxWOUexjjVgyA = Integer.MIN_VALUE;
        this.f4325HJFh0TGMpafqLE9haL = new Rect();
        this.f4326lEeR5KfoEr4xU5yHH7 = apygsiylzvnkpt1bls;
    }

    public static pbVGzGjWvY2LDXC8vo HJFh0TGMpafqLE9haL(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        return new s3fjYDxWOUexjjVgyA(apygsiylzvnkpt1bls);
    }

    public static pbVGzGjWvY2LDXC8vo lEeR5KfoEr4xU5yHH7(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        return new lEeR5KfoEr4xU5yHH7(apygsiylzvnkpt1bls);
    }

    public static pbVGzGjWvY2LDXC8vo s3fjYDxWOUexjjVgyA(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, int i) {
        if (i == 0) {
            return lEeR5KfoEr4xU5yHH7(apygsiylzvnkpt1bls);
        }
        if (i == 1) {
            return HJFh0TGMpafqLE9haL(apygsiylzvnkpt1bls);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int Acstmh57AKoSEkEFNJ();

    public abstract int IPyIQcaNa8aB7drBED();

    public abstract int KYHag8HRDlnO3X9zmZ(View view);

    public abstract int OANkd3mP6AYvwbNLJM(View view);

    public abstract int T9PhQIpGRhE4yZDm1C();

    public abstract int TCyPEKSzIyweCN5yp1(View view);

    public void Y43RdunnpKgpbny0lE() {
        this.f4327s3fjYDxWOUexjjVgyA = hoXrIDAFrSwfShk8da();
    }

    public abstract int Z9WdNiOsPR0y54zHW4();

    public int aPyGSIylzVNKPT1Bls() {
        if (Integer.MIN_VALUE == this.f4327s3fjYDxWOUexjjVgyA) {
            return 0;
        }
        return hoXrIDAFrSwfShk8da() - this.f4327s3fjYDxWOUexjjVgyA;
    }

    public abstract int e54J8UWNHWALQNixXM();

    public abstract int hoXrIDAFrSwfShk8da();

    public abstract int husNiw3snxdgZPAGJm(View view);

    public abstract int pbVGzGjWvY2LDXC8vo();

    public abstract void sTkWmhpZ5b1ArQIw4K(int i);

    public abstract int zZKhbgvUfsK4AEX3r0(View view);

    public abstract int zaq8hOURtfwbcX17cG(View view);

    public /* synthetic */ pbVGzGjWvY2LDXC8vo(RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this(apygsiylzvnkpt1bls);
    }
}
