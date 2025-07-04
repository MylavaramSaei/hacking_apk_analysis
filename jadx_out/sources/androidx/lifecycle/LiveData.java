package androidx.lifecycle;

import Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData {

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final Object f3789Z9WdNiOsPR0y54zHW4 = new Object();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final Runnable f3790Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f3792IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public volatile Object f3793KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f3794TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public volatile Object f3795husNiw3snxdgZPAGJm;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f3797pbVGzGjWvY2LDXC8vo;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f3799zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Object f3796lEeR5KfoEr4xU5yHH7 = new Object();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA f3798s3fjYDxWOUexjjVgyA = new Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f3791HJFh0TGMpafqLE9haL = 0;

    public class LifecycleBoundObserver extends androidx.lifecycle.LiveData.s3fjYDxWOUexjjVgyA implements pbVGzGjWvY2LDXC8vo {

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public final /* synthetic */ LiveData f3800KYHag8HRDlnO3X9zmZ;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final Z9WdNiOsPR0y54zHW4 f3801husNiw3snxdgZPAGJm;

        public boolean Acstmh57AKoSEkEFNJ() {
            return this.f3801husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1().s3fjYDxWOUexjjVgyA().s3fjYDxWOUexjjVgyA(KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.STARTED);
        }

        public void pbVGzGjWvY2LDXC8vo() {
            this.f3801husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1().HJFh0TGMpafqLE9haL(this);
        }

        @Override // androidx.lifecycle.pbVGzGjWvY2LDXC8vo
        public void zZKhbgvUfsK4AEX3r0(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA s3fjYDxWOUexjjVgyA2 = this.f3801husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1().s3fjYDxWOUexjjVgyA();
            if (s3fjYDxWOUexjjVgyA2 == KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.DESTROYED) {
                this.f3800KYHag8HRDlnO3X9zmZ.TCyPEKSzIyweCN5yp1(this.f3804lEeR5KfoEr4xU5yHH7);
                return;
            }
            KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = null;
            while (s3fjydxwouexjjvgya != s3fjYDxWOUexjjVgyA2) {
                IPyIQcaNa8aB7drBED(Acstmh57AKoSEkEFNJ());
                s3fjydxwouexjjvgya = s3fjYDxWOUexjjVgyA2;
                s3fjYDxWOUexjjVgyA2 = this.f3801husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1().s3fjYDxWOUexjjVgyA();
            }
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements Runnable {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f3796lEeR5KfoEr4xU5yHH7) {
                obj = LiveData.this.f3793KYHag8HRDlnO3X9zmZ;
                LiveData.this.f3793KYHag8HRDlnO3X9zmZ = LiveData.f3789Z9WdNiOsPR0y54zHW4;
            }
            LiveData.this.IPyIQcaNa8aB7drBED(obj);
        }
    }

    public abstract class s3fjYDxWOUexjjVgyA {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f3803HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final OANkd3mP6AYvwbNLJM f3804lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f3805s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final /* synthetic */ LiveData f3806zZKhbgvUfsK4AEX3r0;

        public abstract boolean Acstmh57AKoSEkEFNJ();

        public void IPyIQcaNa8aB7drBED(boolean z) {
            if (z == this.f3805s3fjYDxWOUexjjVgyA) {
                return;
            }
            this.f3805s3fjYDxWOUexjjVgyA = z;
            this.f3806zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA(z ? 1 : -1);
            if (this.f3805s3fjYDxWOUexjjVgyA) {
                this.f3806zZKhbgvUfsK4AEX3r0.zZKhbgvUfsK4AEX3r0(this);
            }
        }

        public abstract void pbVGzGjWvY2LDXC8vo();
    }

    public LiveData() {
        Object obj = f3789Z9WdNiOsPR0y54zHW4;
        this.f3793KYHag8HRDlnO3X9zmZ = obj;
        this.f3790Acstmh57AKoSEkEFNJ = new lEeR5KfoEr4xU5yHH7();
        this.f3795husNiw3snxdgZPAGJm = obj;
        this.f3794TCyPEKSzIyweCN5yp1 = -1;
    }

    public static void lEeR5KfoEr4xU5yHH7(String str) {
        if (pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ().s3fjYDxWOUexjjVgyA()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void HJFh0TGMpafqLE9haL(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        if (s3fjydxwouexjjvgya.f3805s3fjYDxWOUexjjVgyA) {
            if (!s3fjydxwouexjjvgya.Acstmh57AKoSEkEFNJ()) {
                s3fjydxwouexjjvgya.IPyIQcaNa8aB7drBED(false);
                return;
            }
            int i = s3fjydxwouexjjvgya.f3803HJFh0TGMpafqLE9haL;
            int i2 = this.f3794TCyPEKSzIyweCN5yp1;
            if (i >= i2) {
                return;
            }
            s3fjydxwouexjjvgya.f3803HJFh0TGMpafqLE9haL = i2;
            s3fjydxwouexjjvgya.f3804lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f3795husNiw3snxdgZPAGJm);
        }
    }

    public void IPyIQcaNa8aB7drBED(Object obj) {
        lEeR5KfoEr4xU5yHH7("setValue");
        this.f3794TCyPEKSzIyweCN5yp1++;
        this.f3795husNiw3snxdgZPAGJm = obj;
        zZKhbgvUfsK4AEX3r0(null);
    }

    public void KYHag8HRDlnO3X9zmZ() {
    }

    public void TCyPEKSzIyweCN5yp1(OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
        lEeR5KfoEr4xU5yHH7("removeObserver");
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) this.f3798s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED(oANkd3mP6AYvwbNLJM);
        if (s3fjydxwouexjjvgya == null) {
            return;
        }
        s3fjydxwouexjjvgya.pbVGzGjWvY2LDXC8vo();
        s3fjydxwouexjjvgya.IPyIQcaNa8aB7drBED(false);
    }

    public void husNiw3snxdgZPAGJm() {
    }

    public void s3fjYDxWOUexjjVgyA(int i) {
        int i2 = this.f3791HJFh0TGMpafqLE9haL;
        this.f3791HJFh0TGMpafqLE9haL = i + i2;
        if (this.f3799zZKhbgvUfsK4AEX3r0) {
            return;
        }
        this.f3799zZKhbgvUfsK4AEX3r0 = true;
        while (true) {
            try {
                int i3 = this.f3791HJFh0TGMpafqLE9haL;
                if (i2 == i3) {
                    this.f3799zZKhbgvUfsK4AEX3r0 = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    husNiw3snxdgZPAGJm();
                } else if (z2) {
                    KYHag8HRDlnO3X9zmZ();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.f3799zZKhbgvUfsK4AEX3r0 = false;
                throw th;
            }
        }
    }

    public void zZKhbgvUfsK4AEX3r0(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        if (this.f3792IPyIQcaNa8aB7drBED) {
            this.f3797pbVGzGjWvY2LDXC8vo = true;
            return;
        }
        this.f3792IPyIQcaNa8aB7drBED = true;
        do {
            this.f3797pbVGzGjWvY2LDXC8vo = false;
            if (s3fjydxwouexjjvgya != null) {
                HJFh0TGMpafqLE9haL(s3fjydxwouexjjvgya);
                s3fjydxwouexjjvgya = null;
            } else {
                s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0 zZKhbgvUfsK4AEX3r02 = this.f3798s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0();
                while (zZKhbgvUfsK4AEX3r02.hasNext()) {
                    HJFh0TGMpafqLE9haL((s3fjYDxWOUexjjVgyA) ((Map.Entry) zZKhbgvUfsK4AEX3r02.next()).getValue());
                    if (this.f3797pbVGzGjWvY2LDXC8vo) {
                        break;
                    }
                }
            }
        } while (this.f3797pbVGzGjWvY2LDXC8vo);
        this.f3792IPyIQcaNa8aB7drBED = false;
    }
}
