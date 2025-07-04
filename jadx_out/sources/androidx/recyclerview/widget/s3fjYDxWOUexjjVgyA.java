package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final InterfaceC0053s3fjYDxWOUexjjVgyA f4329lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7 f4330s3fjYDxWOUexjjVgyA = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final List f4328HJFh0TGMpafqLE9haL = new ArrayList();

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public long f4331lEeR5KfoEr4xU5yHH7 = 0;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public lEeR5KfoEr4xU5yHH7 f4332s3fjYDxWOUexjjVgyA;

        public final void HJFh0TGMpafqLE9haL() {
            if (this.f4332s3fjYDxWOUexjjVgyA == null) {
                this.f4332s3fjYDxWOUexjjVgyA = new lEeR5KfoEr4xU5yHH7();
            }
        }

        public void IPyIQcaNa8aB7drBED(int i) {
            if (i < 64) {
                this.f4331lEeR5KfoEr4xU5yHH7 |= 1 << i;
            } else {
                HJFh0TGMpafqLE9haL();
                this.f4332s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED(i - 64);
            }
        }

        public boolean KYHag8HRDlnO3X9zmZ(int i) {
            if (i >= 64) {
                HJFh0TGMpafqLE9haL();
                return this.f4332s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f4331lEeR5KfoEr4xU5yHH7;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f4331lEeR5KfoEr4xU5yHH7 = j3;
            long j4 = j - 1;
            this.f4331lEeR5KfoEr4xU5yHH7 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f4332s3fjYDxWOUexjjVgyA;
            if (leer5kfoer4xu5yhh7 != null) {
                if (leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0(0)) {
                    IPyIQcaNa8aB7drBED(63);
                }
                this.f4332s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(0);
            }
            return z;
        }

        public void TCyPEKSzIyweCN5yp1() {
            this.f4331lEeR5KfoEr4xU5yHH7 = 0L;
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f4332s3fjYDxWOUexjjVgyA;
            if (leer5kfoer4xu5yhh7 != null) {
                leer5kfoer4xu5yhh7.TCyPEKSzIyweCN5yp1();
            }
        }

        public void husNiw3snxdgZPAGJm(int i, boolean z) {
            if (i >= 64) {
                HJFh0TGMpafqLE9haL();
                this.f4332s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(i - 64, z);
                return;
            }
            long j = this.f4331lEeR5KfoEr4xU5yHH7;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f4331lEeR5KfoEr4xU5yHH7 = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                IPyIQcaNa8aB7drBED(i);
            } else {
                lEeR5KfoEr4xU5yHH7(i);
            }
            if (z2 || this.f4332s3fjYDxWOUexjjVgyA != null) {
                HJFh0TGMpafqLE9haL();
                this.f4332s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(0, z2);
            }
        }

        public void lEeR5KfoEr4xU5yHH7(int i) {
            if (i < 64) {
                this.f4331lEeR5KfoEr4xU5yHH7 &= ~(1 << i);
                return;
            }
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f4332s3fjYDxWOUexjjVgyA;
            if (leer5kfoer4xu5yhh7 != null) {
                leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(i - 64);
            }
        }

        public int s3fjYDxWOUexjjVgyA(int i) {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f4332s3fjYDxWOUexjjVgyA;
            return leer5kfoer4xu5yhh7 == null ? i >= 64 ? Long.bitCount(this.f4331lEeR5KfoEr4xU5yHH7) : Long.bitCount(this.f4331lEeR5KfoEr4xU5yHH7 & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f4331lEeR5KfoEr4xU5yHH7 & ((1 << i) - 1)) : leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(i - 64) + Long.bitCount(this.f4331lEeR5KfoEr4xU5yHH7);
        }

        public String toString() {
            if (this.f4332s3fjYDxWOUexjjVgyA == null) {
                return Long.toBinaryString(this.f4331lEeR5KfoEr4xU5yHH7);
            }
            return this.f4332s3fjYDxWOUexjjVgyA.toString() + "xx" + Long.toBinaryString(this.f4331lEeR5KfoEr4xU5yHH7);
        }

        public boolean zZKhbgvUfsK4AEX3r0(int i) {
            if (i < 64) {
                return (this.f4331lEeR5KfoEr4xU5yHH7 & (1 << i)) != 0;
            }
            HJFh0TGMpafqLE9haL();
            return this.f4332s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(i - 64);
        }
    }

    /* renamed from: androidx.recyclerview.widget.s3fjYDxWOUexjjVgyA$s3fjYDxWOUexjjVgyA, reason: collision with other inner class name */
    public interface InterfaceC0053s3fjYDxWOUexjjVgyA {
        int Acstmh57AKoSEkEFNJ(View view);

        void HJFh0TGMpafqLE9haL(int i);

        void IPyIQcaNa8aB7drBED(View view, int i, ViewGroup.LayoutParams layoutParams);

        void KYHag8HRDlnO3X9zmZ(int i);

        void TCyPEKSzIyweCN5yp1(View view);

        int Z9WdNiOsPR0y54zHW4();

        RecyclerView.OUd9THiLjZndMj0qdF husNiw3snxdgZPAGJm(View view);

        View lEeR5KfoEr4xU5yHH7(int i);

        void pbVGzGjWvY2LDXC8vo(View view, int i);

        void s3fjYDxWOUexjjVgyA(View view);

        void zZKhbgvUfsK4AEX3r0();
    }

    public s3fjYDxWOUexjjVgyA(InterfaceC0053s3fjYDxWOUexjjVgyA interfaceC0053s3fjYDxWOUexjjVgyA) {
        this.f4329lEeR5KfoEr4xU5yHH7 = interfaceC0053s3fjYDxWOUexjjVgyA;
    }

    public int Acstmh57AKoSEkEFNJ() {
        return this.f4329lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4();
    }

    public void HJFh0TGMpafqLE9haL(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iZ9WdNiOsPR0y54zHW4 = i < 0 ? this.f4329lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4() : IPyIQcaNa8aB7drBED(i);
        this.f4330s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(iZ9WdNiOsPR0y54zHW4, z);
        if (z) {
            e54J8UWNHWALQNixXM(view);
        }
        this.f4329lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(view, iZ9WdNiOsPR0y54zHW4, layoutParams);
    }

    public final int IPyIQcaNa8aB7drBED(int i) {
        if (i < 0) {
            return -1;
        }
        int iZ9WdNiOsPR0y54zHW4 = this.f4329lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4();
        int i2 = i;
        while (i2 < iZ9WdNiOsPR0y54zHW4) {
            int iS3fjYDxWOUexjjVgyA = i - (i2 - this.f4330s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(i2));
            if (iS3fjYDxWOUexjjVgyA == 0) {
                while (this.f4330s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iS3fjYDxWOUexjjVgyA;
        }
        return -1;
    }

    public View KYHag8HRDlnO3X9zmZ(int i) {
        return this.f4329lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(IPyIQcaNa8aB7drBED(i));
    }

    public void OANkd3mP6AYvwbNLJM(View view) {
        int iAcstmh57AKoSEkEFNJ = this.f4329lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(view);
        if (iAcstmh57AKoSEkEFNJ < 0) {
            return;
        }
        if (this.f4330s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(iAcstmh57AKoSEkEFNJ)) {
            R9SAhYMerGybF9OAjL(view);
        }
        this.f4329lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(iAcstmh57AKoSEkEFNJ);
    }

    public final boolean R9SAhYMerGybF9OAjL(View view) {
        if (!this.f4328HJFh0TGMpafqLE9haL.remove(view)) {
            return false;
        }
        this.f4329lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(view);
        return true;
    }

    public int T9PhQIpGRhE4yZDm1C(View view) {
        int iAcstmh57AKoSEkEFNJ = this.f4329lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(view);
        if (iAcstmh57AKoSEkEFNJ == -1 || this.f4330s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(iAcstmh57AKoSEkEFNJ)) {
            return -1;
        }
        return iAcstmh57AKoSEkEFNJ - this.f4330s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(iAcstmh57AKoSEkEFNJ);
    }

    public int TCyPEKSzIyweCN5yp1() {
        return this.f4329lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4() - this.f4328HJFh0TGMpafqLE9haL.size();
    }

    public void Y43RdunnpKgpbny0lE(View view) {
        int iAcstmh57AKoSEkEFNJ = this.f4329lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(view);
        if (iAcstmh57AKoSEkEFNJ < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f4330s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(iAcstmh57AKoSEkEFNJ)) {
            this.f4330s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(iAcstmh57AKoSEkEFNJ);
            R9SAhYMerGybF9OAjL(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public void Z9WdNiOsPR0y54zHW4(View view) {
        int iAcstmh57AKoSEkEFNJ = this.f4329lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(view);
        if (iAcstmh57AKoSEkEFNJ >= 0) {
            this.f4330s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED(iAcstmh57AKoSEkEFNJ);
            e54J8UWNHWALQNixXM(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void aPyGSIylzVNKPT1Bls() {
        this.f4330s3fjYDxWOUexjjVgyA.TCyPEKSzIyweCN5yp1();
        for (int size = this.f4328HJFh0TGMpafqLE9haL.size() - 1; size >= 0; size--) {
            this.f4329lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1((View) this.f4328HJFh0TGMpafqLE9haL.get(size));
            this.f4328HJFh0TGMpafqLE9haL.remove(size);
        }
        this.f4329lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0();
    }

    public final void e54J8UWNHWALQNixXM(View view) {
        this.f4328HJFh0TGMpafqLE9haL.add(view);
        this.f4329lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(view);
    }

    public boolean hoXrIDAFrSwfShk8da(View view) {
        return this.f4328HJFh0TGMpafqLE9haL.contains(view);
    }

    public View husNiw3snxdgZPAGJm(int i) {
        int size = this.f4328HJFh0TGMpafqLE9haL.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f4328HJFh0TGMpafqLE9haL.get(i2);
            RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFHusNiw3snxdgZPAGJm = this.f4329lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(view);
            if (oUd9THiLjZndMj0qdFHusNiw3snxdgZPAGJm.T9PhQIpGRhE4yZDm1C() == i && !oUd9THiLjZndMj0qdFHusNiw3snxdgZPAGJm.R9SAhYMerGybF9OAjL() && !oUd9THiLjZndMj0qdFHusNiw3snxdgZPAGJm.xHA29AmDt6y96AnB3t()) {
                return view;
            }
        }
        return null;
    }

    public void lEeR5KfoEr4xU5yHH7(View view, int i, boolean z) {
        int iZ9WdNiOsPR0y54zHW4 = i < 0 ? this.f4329lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4() : IPyIQcaNa8aB7drBED(i);
        this.f4330s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(iZ9WdNiOsPR0y54zHW4, z);
        if (z) {
            e54J8UWNHWALQNixXM(view);
        }
        this.f4329lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(view, iZ9WdNiOsPR0y54zHW4);
    }

    public View pbVGzGjWvY2LDXC8vo(int i) {
        return this.f4329lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(i);
    }

    public void s3fjYDxWOUexjjVgyA(View view, boolean z) {
        lEeR5KfoEr4xU5yHH7(view, -1, z);
    }

    public boolean sTkWmhpZ5b1ArQIw4K(View view) {
        int iAcstmh57AKoSEkEFNJ = this.f4329lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(view);
        if (iAcstmh57AKoSEkEFNJ == -1) {
            R9SAhYMerGybF9OAjL(view);
            return true;
        }
        if (!this.f4330s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(iAcstmh57AKoSEkEFNJ)) {
            return false;
        }
        this.f4330s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(iAcstmh57AKoSEkEFNJ);
        R9SAhYMerGybF9OAjL(view);
        this.f4329lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(iAcstmh57AKoSEkEFNJ);
        return true;
    }

    public String toString() {
        return this.f4330s3fjYDxWOUexjjVgyA.toString() + ", hidden list:" + this.f4328HJFh0TGMpafqLE9haL.size();
    }

    public void zZKhbgvUfsK4AEX3r0(int i) {
        int iIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(i);
        this.f4330s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(iIPyIQcaNa8aB7drBED);
        this.f4329lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(iIPyIQcaNa8aB7drBED);
    }

    public void zaq8hOURtfwbcX17cG(int i) {
        int iIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(i);
        View viewLEeR5KfoEr4xU5yHH7 = this.f4329lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(iIPyIQcaNa8aB7drBED);
        if (viewLEeR5KfoEr4xU5yHH7 == null) {
            return;
        }
        if (this.f4330s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(iIPyIQcaNa8aB7drBED)) {
            R9SAhYMerGybF9OAjL(viewLEeR5KfoEr4xU5yHH7);
        }
        this.f4329lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(iIPyIQcaNa8aB7drBED);
    }
}
