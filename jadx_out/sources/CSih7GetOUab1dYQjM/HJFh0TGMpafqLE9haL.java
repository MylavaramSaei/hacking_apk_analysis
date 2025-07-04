package CSih7GetOUab1dYQjM;

import android.os.Bundle;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import androidx.savedstate.Recreator;
import jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public final class HJFh0TGMpafqLE9haL {

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f74zZKhbgvUfsK4AEX3r0 = new lEeR5KfoEr4xU5yHH7(null);

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public boolean f75HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0 f76lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final androidx.savedstate.lEeR5KfoEr4xU5yHH7 f77s3fjYDxWOUexjjVgyA;

    public static final class lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        public final HJFh0TGMpafqLE9haL lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(zzkhbgvufsk4aex3r0, "owner");
            return new HJFh0TGMpafqLE9haL(zzkhbgvufsk4aex3r0, null);
        }

        public /* synthetic */ lEeR5KfoEr4xU5yHH7(jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this();
        }
    }

    public HJFh0TGMpafqLE9haL(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        this.f76lEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0;
        this.f77s3fjYDxWOUexjjVgyA = new androidx.savedstate.lEeR5KfoEr4xU5yHH7();
    }

    public static final HJFh0TGMpafqLE9haL lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        return f74zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(zzkhbgvufsk4aex3r0);
    }

    public final void HJFh0TGMpafqLE9haL() {
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1 = this.f76lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1();
        if (kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA() != KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(new Recreator(this.f76lEeR5KfoEr4xU5yHH7));
        this.f77s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1);
        this.f75HJFh0TGMpafqLE9haL = true;
    }

    public final void husNiw3snxdgZPAGJm(Bundle bundle) {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(bundle, "outBundle");
        this.f77s3fjYDxWOUexjjVgyA.TCyPEKSzIyweCN5yp1(bundle);
    }

    public final androidx.savedstate.lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA() {
        return this.f77s3fjYDxWOUexjjVgyA;
    }

    public final void zZKhbgvUfsK4AEX3r0(Bundle bundle) {
        if (!this.f75HJFh0TGMpafqLE9haL) {
            HJFh0TGMpafqLE9haL();
        }
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1 = this.f76lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1();
        if (!kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA().s3fjYDxWOUexjjVgyA(KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.STARTED)) {
            this.f77s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA()).toString());
    }

    public /* synthetic */ HJFh0TGMpafqLE9haL(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this(zzkhbgvufsk4aex3r0);
    }
}
