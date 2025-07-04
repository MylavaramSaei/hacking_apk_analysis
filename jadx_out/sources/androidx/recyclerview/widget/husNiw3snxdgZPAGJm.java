package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class husNiw3snxdgZPAGJm implements Runnable {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public long f4300HJFh0TGMpafqLE9haL;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public long f4302s3fjYDxWOUexjjVgyA;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final ThreadLocal f4299husNiw3snxdgZPAGJm = new ThreadLocal();

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static Comparator f4298KYHag8HRDlnO3X9zmZ = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public ArrayList f4301lEeR5KfoEr4xU5yHH7 = new ArrayList();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public ArrayList f4303zZKhbgvUfsK4AEX3r0 = new ArrayList();

    public static class HJFh0TGMpafqLE9haL {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f4304HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f4305husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f4306lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f4307s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public RecyclerView f4308zZKhbgvUfsK4AEX3r0;

        public void lEeR5KfoEr4xU5yHH7() {
            this.f4306lEeR5KfoEr4xU5yHH7 = false;
            this.f4307s3fjYDxWOUexjjVgyA = 0;
            this.f4304HJFh0TGMpafqLE9haL = 0;
            this.f4308zZKhbgvUfsK4AEX3r0 = null;
            this.f4305husNiw3snxdgZPAGJm = 0;
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public int compare(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2) {
            RecyclerView recyclerView = hJFh0TGMpafqLE9haL.f4308zZKhbgvUfsK4AEX3r0;
            if ((recyclerView == null) != (hJFh0TGMpafqLE9haL2.f4308zZKhbgvUfsK4AEX3r0 == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = hJFh0TGMpafqLE9haL.f4306lEeR5KfoEr4xU5yHH7;
            if (z != hJFh0TGMpafqLE9haL2.f4306lEeR5KfoEr4xU5yHH7) {
                return z ? -1 : 1;
            }
            int i = hJFh0TGMpafqLE9haL2.f4307s3fjYDxWOUexjjVgyA - hJFh0TGMpafqLE9haL.f4307s3fjYDxWOUexjjVgyA;
            if (i != 0) {
                return i;
            }
            int i2 = hJFh0TGMpafqLE9haL.f4304HJFh0TGMpafqLE9haL - hJFh0TGMpafqLE9haL2.f4304HJFh0TGMpafqLE9haL;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    public static class s3fjYDxWOUexjjVgyA implements RecyclerView.aPyGSIylzVNKPT1Bls.HJFh0TGMpafqLE9haL {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int[] f4309HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f4310lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f4311s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f4312zZKhbgvUfsK4AEX3r0;

        public void HJFh0TGMpafqLE9haL(RecyclerView recyclerView, boolean z) {
            this.f4312zZKhbgvUfsK4AEX3r0 = 0;
            int[] iArr = this.f4309HJFh0TGMpafqLE9haL;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls = recyclerView.f4048T9PhQIpGRhE4yZDm1C;
            if (recyclerView.f4072e54J8UWNHWALQNixXM == null || apygsiylzvnkpt1bls == null || !apygsiylzvnkpt1bls.f2zPq7MOnQrtOlZ1Zg()) {
                return;
            }
            if (z) {
                if (!recyclerView.f4094zZKhbgvUfsK4AEX3r0.OANkd3mP6AYvwbNLJM()) {
                    apygsiylzvnkpt1bls.G7AC3DWIx9i9fdanjk(recyclerView.f4072e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL(), this);
                }
            } else if (!recyclerView.eWK41qw3g36LVd4UnS()) {
                apygsiylzvnkpt1bls.R9SAhYMerGybF9OAjL(this.f4310lEeR5KfoEr4xU5yHH7, this.f4311s3fjYDxWOUexjjVgyA, recyclerView.f4052Tu4WCh2gEwj8E4oHbP, this);
            }
            int i = this.f4312zZKhbgvUfsK4AEX3r0;
            if (i > apygsiylzvnkpt1bls.f4177T9PhQIpGRhE4yZDm1C) {
                apygsiylzvnkpt1bls.f4177T9PhQIpGRhE4yZDm1C = i;
                apygsiylzvnkpt1bls.f4182hoXrIDAFrSwfShk8da = z;
                recyclerView.f4087s3fjYDxWOUexjjVgyA.e2F9F6h8YJxTHwLCa0();
            }
        }

        public void husNiw3snxdgZPAGJm(int i, int i2) {
            this.f4310lEeR5KfoEr4xU5yHH7 = i;
            this.f4311s3fjYDxWOUexjjVgyA = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls.HJFh0TGMpafqLE9haL
        public void lEeR5KfoEr4xU5yHH7(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f4312zZKhbgvUfsK4AEX3r0;
            int i4 = i3 * 2;
            int[] iArr = this.f4309HJFh0TGMpafqLE9haL;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f4309HJFh0TGMpafqLE9haL = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.f4309HJFh0TGMpafqLE9haL = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f4309HJFh0TGMpafqLE9haL;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.f4312zZKhbgvUfsK4AEX3r0++;
        }

        public void s3fjYDxWOUexjjVgyA() {
            int[] iArr = this.f4309HJFh0TGMpafqLE9haL;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4312zZKhbgvUfsK4AEX3r0 = 0;
        }

        public boolean zZKhbgvUfsK4AEX3r0(int i) {
            if (this.f4309HJFh0TGMpafqLE9haL != null) {
                int i2 = this.f4312zZKhbgvUfsK4AEX3r0 * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4309HJFh0TGMpafqLE9haL[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static boolean husNiw3snxdgZPAGJm(RecyclerView recyclerView, int i) {
        int iAcstmh57AKoSEkEFNJ = recyclerView.f4078husNiw3snxdgZPAGJm.Acstmh57AKoSEkEFNJ();
        for (int i2 = 0; i2 < iAcstmh57AKoSEkEFNJ; i2++) {
            RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W = RecyclerView.k0CbjZvfUz23r8IN6W(recyclerView.f4078husNiw3snxdgZPAGJm.pbVGzGjWvY2LDXC8vo(i2));
            if (oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.f4114HJFh0TGMpafqLE9haL == i && !oUd9THiLjZndMj0qdFK0CbjZvfUz23r8IN6W.R9SAhYMerGybF9OAjL()) {
                return true;
            }
        }
        return false;
    }

    public void Acstmh57AKoSEkEFNJ(RecyclerView recyclerView) {
        this.f4301lEeR5KfoEr4xU5yHH7.remove(recyclerView);
    }

    public final void HJFh0TGMpafqLE9haL(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, long j) {
        RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(hJFh0TGMpafqLE9haL.f4308zZKhbgvUfsK4AEX3r0, hJFh0TGMpafqLE9haL.f4305husNiw3snxdgZPAGJm, hJFh0TGMpafqLE9haL.f4306lEeR5KfoEr4xU5yHH7 ? Long.MAX_VALUE : j);
        if (oUd9THiLjZndMj0qdFPbVGzGjWvY2LDXC8vo == null || oUd9THiLjZndMj0qdFPbVGzGjWvY2LDXC8vo.f4127s3fjYDxWOUexjjVgyA == null || !oUd9THiLjZndMj0qdFPbVGzGjWvY2LDXC8vo.Y43RdunnpKgpbny0lE() || oUd9THiLjZndMj0qdFPbVGzGjWvY2LDXC8vo.R9SAhYMerGybF9OAjL()) {
            return;
        }
        IPyIQcaNa8aB7drBED((RecyclerView) oUd9THiLjZndMj0qdFPbVGzGjWvY2LDXC8vo.f4127s3fjYDxWOUexjjVgyA.get(), j);
    }

    public final void IPyIQcaNa8aB7drBED(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f4043OUd9THiLjZndMj0qdF && recyclerView.f4078husNiw3snxdgZPAGJm.Acstmh57AKoSEkEFNJ() != 0) {
            recyclerView.e5tXAuLbtMC3XyEoX9();
        }
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = recyclerView.f4062ZJNyOIPL0usMs2xSAn;
        s3fjydxwouexjjvgya.HJFh0TGMpafqLE9haL(recyclerView, true);
        if (s3fjydxwouexjjvgya.f4312zZKhbgvUfsK4AEX3r0 != 0) {
            try {
                OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7("RV Nested Prefetch");
                recyclerView.f4052Tu4WCh2gEwj8E4oHbP.KYHag8HRDlnO3X9zmZ(recyclerView.f4072e54J8UWNHWALQNixXM);
                for (int i = 0; i < s3fjydxwouexjjvgya.f4312zZKhbgvUfsK4AEX3r0 * 2; i += 2) {
                    pbVGzGjWvY2LDXC8vo(recyclerView, s3fjydxwouexjjvgya.f4309HJFh0TGMpafqLE9haL[i], j);
                }
            } finally {
                OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
            }
        }
    }

    public void KYHag8HRDlnO3X9zmZ(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4302s3fjYDxWOUexjjVgyA == 0) {
            this.f4302s3fjYDxWOUexjjVgyA = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f4062ZJNyOIPL0usMs2xSAn.husNiw3snxdgZPAGJm(i, i2);
    }

    public void TCyPEKSzIyweCN5yp1(long j) {
        s3fjYDxWOUexjjVgyA();
        zZKhbgvUfsK4AEX3r0(j);
    }

    public void lEeR5KfoEr4xU5yHH7(RecyclerView recyclerView) {
        this.f4301lEeR5KfoEr4xU5yHH7.add(recyclerView);
    }

    public final RecyclerView.OUd9THiLjZndMj0qdF pbVGzGjWvY2LDXC8vo(RecyclerView recyclerView, int i, long j) {
        if (husNiw3snxdgZPAGJm(recyclerView, i)) {
            return null;
        }
        RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk = recyclerView.f4087s3fjYDxWOUexjjVgyA;
        try {
            recyclerView.pgB7Gmjz55y9NQYnAD();
            RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdFGyWRxpdt1T8mEJXPoD = g7AC3DWIx9i9fdanjk.GyWRxpdt1T8mEJXPoD(i, false, j);
            if (oUd9THiLjZndMj0qdFGyWRxpdt1T8mEJXPoD != null) {
                if (!oUd9THiLjZndMj0qdFGyWRxpdt1T8mEJXPoD.Y43RdunnpKgpbny0lE() || oUd9THiLjZndMj0qdFGyWRxpdt1T8mEJXPoD.R9SAhYMerGybF9OAjL()) {
                    g7AC3DWIx9i9fdanjk.lEeR5KfoEr4xU5yHH7(oUd9THiLjZndMj0qdFGyWRxpdt1T8mEJXPoD, false);
                } else {
                    g7AC3DWIx9i9fdanjk.ao3wqKm5CXFuvC0q47(oUd9THiLjZndMj0qdFGyWRxpdt1T8mEJXPoD.f4125lEeR5KfoEr4xU5yHH7);
                }
            }
            recyclerView.aUn6Hqsqw2PVM8685Z(false);
            return oUd9THiLjZndMj0qdFGyWRxpdt1T8mEJXPoD;
        } catch (Throwable th) {
            recyclerView.aUn6Hqsqw2PVM8685Z(false);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7("RV Prefetch");
            if (!this.f4301lEeR5KfoEr4xU5yHH7.isEmpty()) {
                int size = this.f4301lEeR5KfoEr4xU5yHH7.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f4301lEeR5KfoEr4xU5yHH7.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    TCyPEKSzIyweCN5yp1(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f4300HJFh0TGMpafqLE9haL);
                    this.f4302s3fjYDxWOUexjjVgyA = 0L;
                    OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
                }
            }
        } finally {
            this.f4302s3fjYDxWOUexjjVgyA = 0L;
            OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
        }
    }

    public final void s3fjYDxWOUexjjVgyA() {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL;
        int size = this.f4301lEeR5KfoEr4xU5yHH7.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f4301lEeR5KfoEr4xU5yHH7.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f4062ZJNyOIPL0usMs2xSAn.HJFh0TGMpafqLE9haL(recyclerView, false);
                i += recyclerView.f4062ZJNyOIPL0usMs2xSAn.f4312zZKhbgvUfsK4AEX3r0;
            }
        }
        this.f4303zZKhbgvUfsK4AEX3r0.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f4301lEeR5KfoEr4xU5yHH7.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = recyclerView2.f4062ZJNyOIPL0usMs2xSAn;
                int iAbs = Math.abs(s3fjydxwouexjjvgya.f4310lEeR5KfoEr4xU5yHH7) + Math.abs(s3fjydxwouexjjvgya.f4311s3fjYDxWOUexjjVgyA);
                for (int i5 = 0; i5 < s3fjydxwouexjjvgya.f4312zZKhbgvUfsK4AEX3r0 * 2; i5 += 2) {
                    if (i3 >= this.f4303zZKhbgvUfsK4AEX3r0.size()) {
                        hJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL();
                        this.f4303zZKhbgvUfsK4AEX3r0.add(hJFh0TGMpafqLE9haL);
                    } else {
                        hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) this.f4303zZKhbgvUfsK4AEX3r0.get(i3);
                    }
                    int[] iArr = s3fjydxwouexjjvgya.f4309HJFh0TGMpafqLE9haL;
                    int i6 = iArr[i5 + 1];
                    hJFh0TGMpafqLE9haL.f4306lEeR5KfoEr4xU5yHH7 = i6 <= iAbs;
                    hJFh0TGMpafqLE9haL.f4307s3fjYDxWOUexjjVgyA = iAbs;
                    hJFh0TGMpafqLE9haL.f4304HJFh0TGMpafqLE9haL = i6;
                    hJFh0TGMpafqLE9haL.f4308zZKhbgvUfsK4AEX3r0 = recyclerView2;
                    hJFh0TGMpafqLE9haL.f4305husNiw3snxdgZPAGJm = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f4303zZKhbgvUfsK4AEX3r0, f4298KYHag8HRDlnO3X9zmZ);
    }

    public final void zZKhbgvUfsK4AEX3r0(long j) {
        for (int i = 0; i < this.f4303zZKhbgvUfsK4AEX3r0.size(); i++) {
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) this.f4303zZKhbgvUfsK4AEX3r0.get(i);
            if (hJFh0TGMpafqLE9haL.f4308zZKhbgvUfsK4AEX3r0 == null) {
                return;
            }
            HJFh0TGMpafqLE9haL(hJFh0TGMpafqLE9haL, j);
            hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
        }
    }
}
