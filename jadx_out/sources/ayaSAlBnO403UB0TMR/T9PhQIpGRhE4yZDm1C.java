package ayaSAlBnO403UB0TMR;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class T9PhQIpGRhE4yZDm1C {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public float f4477HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public float f4479KYHag8HRDlnO3X9zmZ;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public float f4481husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public float f4482lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f4483pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public float f4484s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public float f4485zZKhbgvUfsK4AEX3r0;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final List f4480TCyPEKSzIyweCN5yp1 = new ArrayList();

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final List f4478IPyIQcaNa8aB7drBED = new ArrayList();

    public static class HJFh0TGMpafqLE9haL extends TCyPEKSzIyweCN5yp1 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final husNiw3snxdgZPAGJm f4486HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final float f4487husNiw3snxdgZPAGJm;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final float f4488zZKhbgvUfsK4AEX3r0;

        public HJFh0TGMpafqLE9haL(husNiw3snxdgZPAGJm husniw3snxdgzpagjm, float f, float f2) {
            this.f4486HJFh0TGMpafqLE9haL = husniw3snxdgzpagjm;
            this.f4488zZKhbgvUfsK4AEX3r0 = f;
            this.f4487husNiw3snxdgZPAGJm = f2;
        }

        public float HJFh0TGMpafqLE9haL() {
            return (float) Math.toDegrees(Math.atan((this.f4486HJFh0TGMpafqLE9haL.f4492HJFh0TGMpafqLE9haL - this.f4487husNiw3snxdgZPAGJm) / (this.f4486HJFh0TGMpafqLE9haL.f4493s3fjYDxWOUexjjVgyA - this.f4488zZKhbgvUfsK4AEX3r0)));
        }

        @Override // ayaSAlBnO403UB0TMR.T9PhQIpGRhE4yZDm1C.TCyPEKSzIyweCN5yp1
        public void lEeR5KfoEr4xU5yHH7(Matrix matrix, lBAL39rPf03qYLFNNP.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f4486HJFh0TGMpafqLE9haL.f4492HJFh0TGMpafqLE9haL - this.f4487husNiw3snxdgZPAGJm, this.f4486HJFh0TGMpafqLE9haL.f4493s3fjYDxWOUexjjVgyA - this.f4488zZKhbgvUfsK4AEX3r0), 0.0f);
            this.f4491lEeR5KfoEr4xU5yHH7.set(matrix);
            this.f4491lEeR5KfoEr4xU5yHH7.preTranslate(this.f4488zZKhbgvUfsK4AEX3r0, this.f4487husNiw3snxdgZPAGJm);
            this.f4491lEeR5KfoEr4xU5yHH7.preRotate(HJFh0TGMpafqLE9haL());
            leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(canvas, this.f4491lEeR5KfoEr4xU5yHH7, rectF, i);
        }
    }

    public static abstract class KYHag8HRDlnO3X9zmZ {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Matrix f4489lEeR5KfoEr4xU5yHH7 = new Matrix();

        public abstract void lEeR5KfoEr4xU5yHH7(Matrix matrix, Path path);
    }

    public static abstract class TCyPEKSzIyweCN5yp1 {

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public static final Matrix f4490s3fjYDxWOUexjjVgyA = new Matrix();

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Matrix f4491lEeR5KfoEr4xU5yHH7 = new Matrix();

        public abstract void lEeR5KfoEr4xU5yHH7(Matrix matrix, lBAL39rPf03qYLFNNP.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i, Canvas canvas);

        public final void s3fjYDxWOUexjjVgyA(lBAL39rPf03qYLFNNP.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i, Canvas canvas) {
            lEeR5KfoEr4xU5yHH7(f4490s3fjYDxWOUexjjVgyA, leer5kfoer4xu5yhh7, i, canvas);
        }
    }

    public static class husNiw3snxdgZPAGJm extends KYHag8HRDlnO3X9zmZ {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public float f4492HJFh0TGMpafqLE9haL;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public float f4493s3fjYDxWOUexjjVgyA;

        @Override // ayaSAlBnO403UB0TMR.T9PhQIpGRhE4yZDm1C.KYHag8HRDlnO3X9zmZ
        public void lEeR5KfoEr4xU5yHH7(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4489lEeR5KfoEr4xU5yHH7;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4493s3fjYDxWOUexjjVgyA, this.f4492HJFh0TGMpafqLE9haL);
            path.transform(matrix);
        }
    }

    public class lEeR5KfoEr4xU5yHH7 extends TCyPEKSzIyweCN5yp1 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ List f4494HJFh0TGMpafqLE9haL;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final /* synthetic */ Matrix f4496zZKhbgvUfsK4AEX3r0;

        public lEeR5KfoEr4xU5yHH7(List list, Matrix matrix) {
            this.f4494HJFh0TGMpafqLE9haL = list;
            this.f4496zZKhbgvUfsK4AEX3r0 = matrix;
        }

        @Override // ayaSAlBnO403UB0TMR.T9PhQIpGRhE4yZDm1C.TCyPEKSzIyweCN5yp1
        public void lEeR5KfoEr4xU5yHH7(Matrix matrix, lBAL39rPf03qYLFNNP.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i, Canvas canvas) {
            Iterator it = this.f4494HJFh0TGMpafqLE9haL.iterator();
            while (it.hasNext()) {
                ((TCyPEKSzIyweCN5yp1) it.next()).lEeR5KfoEr4xU5yHH7(this.f4496zZKhbgvUfsK4AEX3r0, leer5kfoer4xu5yhh7, i, canvas);
            }
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends TCyPEKSzIyweCN5yp1 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final zZKhbgvUfsK4AEX3r0 f4497HJFh0TGMpafqLE9haL;

        public s3fjYDxWOUexjjVgyA(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            this.f4497HJFh0TGMpafqLE9haL = zzkhbgvufsk4aex3r0;
        }

        @Override // ayaSAlBnO403UB0TMR.T9PhQIpGRhE4yZDm1C.TCyPEKSzIyweCN5yp1
        public void lEeR5KfoEr4xU5yHH7(Matrix matrix, lBAL39rPf03qYLFNNP.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i, Canvas canvas) {
            leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(canvas, matrix, new RectF(this.f4497HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(), this.f4497HJFh0TGMpafqLE9haL.aPyGSIylzVNKPT1Bls(), this.f4497HJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM(), this.f4497HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ()), i, this.f4497HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C(), this.f4497HJFh0TGMpafqLE9haL.hoXrIDAFrSwfShk8da());
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 extends KYHag8HRDlnO3X9zmZ {

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public static final RectF f4498IPyIQcaNa8aB7drBED = new RectF();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public float f4499HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public float f4500KYHag8HRDlnO3X9zmZ;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public float f4501TCyPEKSzIyweCN5yp1;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public float f4502husNiw3snxdgZPAGJm;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public float f4503s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public float f4504zZKhbgvUfsK4AEX3r0;

        public zZKhbgvUfsK4AEX3r0(float f, float f2, float f3, float f4) {
            zaq8hOURtfwbcX17cG(f);
            G7AC3DWIx9i9fdanjk(f2);
            sTkWmhpZ5b1ArQIw4K(f3);
            OANkd3mP6AYvwbNLJM(f4);
        }

        public final float Acstmh57AKoSEkEFNJ() {
            return this.f4502husNiw3snxdgZPAGJm;
        }

        public final void G7AC3DWIx9i9fdanjk(float f) {
            this.f4499HJFh0TGMpafqLE9haL = f;
        }

        public final void OANkd3mP6AYvwbNLJM(float f) {
            this.f4502husNiw3snxdgZPAGJm = f;
        }

        public final void R9SAhYMerGybF9OAjL(float f) {
            this.f4501TCyPEKSzIyweCN5yp1 = f;
        }

        public final float T9PhQIpGRhE4yZDm1C() {
            return this.f4500KYHag8HRDlnO3X9zmZ;
        }

        public final void Y43RdunnpKgpbny0lE(float f) {
            this.f4500KYHag8HRDlnO3X9zmZ = f;
        }

        public final float Z9WdNiOsPR0y54zHW4() {
            return this.f4503s3fjYDxWOUexjjVgyA;
        }

        public final float aPyGSIylzVNKPT1Bls() {
            return this.f4499HJFh0TGMpafqLE9haL;
        }

        public final float e54J8UWNHWALQNixXM() {
            return this.f4504zZKhbgvUfsK4AEX3r0;
        }

        public final float hoXrIDAFrSwfShk8da() {
            return this.f4501TCyPEKSzIyweCN5yp1;
        }

        @Override // ayaSAlBnO403UB0TMR.T9PhQIpGRhE4yZDm1C.KYHag8HRDlnO3X9zmZ
        public void lEeR5KfoEr4xU5yHH7(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4489lEeR5KfoEr4xU5yHH7;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f4498IPyIQcaNa8aB7drBED;
            rectF.set(Z9WdNiOsPR0y54zHW4(), aPyGSIylzVNKPT1Bls(), e54J8UWNHWALQNixXM(), Acstmh57AKoSEkEFNJ());
            path.arcTo(rectF, T9PhQIpGRhE4yZDm1C(), hoXrIDAFrSwfShk8da(), false);
            path.transform(matrix);
        }

        public final void sTkWmhpZ5b1ArQIw4K(float f) {
            this.f4504zZKhbgvUfsK4AEX3r0 = f;
        }

        public final void zaq8hOURtfwbcX17cG(float f) {
            this.f4503s3fjYDxWOUexjjVgyA = f;
        }
    }

    public T9PhQIpGRhE4yZDm1C() {
        hoXrIDAFrSwfShk8da(0.0f, 0.0f);
    }

    public float Acstmh57AKoSEkEFNJ() {
        return this.f4485zZKhbgvUfsK4AEX3r0;
    }

    public final void G7AC3DWIx9i9fdanjk(float f) {
        this.f4484s3fjYDxWOUexjjVgyA = f;
    }

    public final void HJFh0TGMpafqLE9haL(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, float f, float f2) {
        s3fjYDxWOUexjjVgyA(f);
        this.f4478IPyIQcaNa8aB7drBED.add(tCyPEKSzIyweCN5yp1);
        OANkd3mP6AYvwbNLJM(f2);
    }

    public final float IPyIQcaNa8aB7drBED() {
        return this.f4479KYHag8HRDlnO3X9zmZ;
    }

    public TCyPEKSzIyweCN5yp1 KYHag8HRDlnO3X9zmZ(Matrix matrix) {
        s3fjYDxWOUexjjVgyA(IPyIQcaNa8aB7drBED());
        return new lEeR5KfoEr4xU5yHH7(new ArrayList(this.f4478IPyIQcaNa8aB7drBED), new Matrix(matrix));
    }

    public final void OANkd3mP6AYvwbNLJM(float f) {
        this.f4481husNiw3snxdgZPAGJm = f;
    }

    public final void R9SAhYMerGybF9OAjL(float f) {
        this.f4482lEeR5KfoEr4xU5yHH7 = f;
    }

    public void T9PhQIpGRhE4yZDm1C(float f, float f2) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = new husNiw3snxdgZPAGJm();
        husniw3snxdgzpagjm.f4493s3fjYDxWOUexjjVgyA = f;
        husniw3snxdgzpagjm.f4492HJFh0TGMpafqLE9haL = f2;
        this.f4480TCyPEKSzIyweCN5yp1.add(husniw3snxdgzpagjm);
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL(husniw3snxdgzpagjm, pbVGzGjWvY2LDXC8vo(), Acstmh57AKoSEkEFNJ());
        HJFh0TGMpafqLE9haL(hJFh0TGMpafqLE9haL, hJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL() + 270.0f, hJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL() + 270.0f);
        sTkWmhpZ5b1ArQIw4K(f);
        Y43RdunnpKgpbny0lE(f2);
    }

    public final float TCyPEKSzIyweCN5yp1() {
        return this.f4481husNiw3snxdgZPAGJm;
    }

    public final void Y43RdunnpKgpbny0lE(float f) {
        this.f4485zZKhbgvUfsK4AEX3r0 = f;
    }

    public float Z9WdNiOsPR0y54zHW4() {
        return this.f4482lEeR5KfoEr4xU5yHH7;
    }

    public void aPyGSIylzVNKPT1Bls(float f, float f2, float f3, float f4) {
        R9SAhYMerGybF9OAjL(f);
        G7AC3DWIx9i9fdanjk(f2);
        sTkWmhpZ5b1ArQIw4K(f);
        Y43RdunnpKgpbny0lE(f2);
        OANkd3mP6AYvwbNLJM(f3);
        zaq8hOURtfwbcX17cG((f3 + f4) % 360.0f);
        this.f4480TCyPEKSzIyweCN5yp1.clear();
        this.f4478IPyIQcaNa8aB7drBED.clear();
        this.f4483pbVGzGjWvY2LDXC8vo = false;
    }

    public float e54J8UWNHWALQNixXM() {
        return this.f4484s3fjYDxWOUexjjVgyA;
    }

    public void hoXrIDAFrSwfShk8da(float f, float f2) {
        aPyGSIylzVNKPT1Bls(f, f2, 270.0f, 0.0f);
    }

    public boolean husNiw3snxdgZPAGJm() {
        return this.f4483pbVGzGjWvY2LDXC8vo;
    }

    public void lEeR5KfoEr4xU5yHH7(float f, float f2, float f3, float f4, float f5, float f6) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0(f, f2, f3, f4);
        zzkhbgvufsk4aex3r0.Y43RdunnpKgpbny0lE(f5);
        zzkhbgvufsk4aex3r0.R9SAhYMerGybF9OAjL(f6);
        this.f4480TCyPEKSzIyweCN5yp1.add(zzkhbgvufsk4aex3r0);
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new s3fjYDxWOUexjjVgyA(zzkhbgvufsk4aex3r0);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        HJFh0TGMpafqLE9haL(s3fjydxwouexjjvgya, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = f7;
        sTkWmhpZ5b1ArQIw4K(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        Y43RdunnpKgpbny0lE(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    public float pbVGzGjWvY2LDXC8vo() {
        return this.f4477HJFh0TGMpafqLE9haL;
    }

    public final void s3fjYDxWOUexjjVgyA(float f) {
        if (TCyPEKSzIyweCN5yp1() == f) {
            return;
        }
        float fTCyPEKSzIyweCN5yp1 = ((f - TCyPEKSzIyweCN5yp1()) + 360.0f) % 360.0f;
        if (fTCyPEKSzIyweCN5yp1 > 180.0f) {
            return;
        }
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0(pbVGzGjWvY2LDXC8vo(), Acstmh57AKoSEkEFNJ(), pbVGzGjWvY2LDXC8vo(), Acstmh57AKoSEkEFNJ());
        zzkhbgvufsk4aex3r0.Y43RdunnpKgpbny0lE(TCyPEKSzIyweCN5yp1());
        zzkhbgvufsk4aex3r0.R9SAhYMerGybF9OAjL(fTCyPEKSzIyweCN5yp1);
        this.f4478IPyIQcaNa8aB7drBED.add(new s3fjYDxWOUexjjVgyA(zzkhbgvufsk4aex3r0));
        OANkd3mP6AYvwbNLJM(f);
    }

    public final void sTkWmhpZ5b1ArQIw4K(float f) {
        this.f4477HJFh0TGMpafqLE9haL = f;
    }

    public void zZKhbgvUfsK4AEX3r0(Matrix matrix, Path path) {
        int size = this.f4480TCyPEKSzIyweCN5yp1.size();
        for (int i = 0; i < size; i++) {
            ((KYHag8HRDlnO3X9zmZ) this.f4480TCyPEKSzIyweCN5yp1.get(i)).lEeR5KfoEr4xU5yHH7(matrix, path);
        }
    }

    public final void zaq8hOURtfwbcX17cG(float f) {
        this.f4479KYHag8HRDlnO3X9zmZ = f;
    }
}
