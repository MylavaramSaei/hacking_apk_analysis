package ayaSAlBnO403UB0TMR;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import ayaSAlBnO403UB0TMR.T9PhQIpGRhE4yZDm1C;
import ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4;
import ayaSAlBnO403UB0TMR.e54J8UWNHWALQNixXM;
import java.util.BitSet;

/* loaded from: classes.dex */
public class TCyPEKSzIyweCN5yp1 extends Drawable implements hoXrIDAFrSwfShk8da {

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public static final String f4505A49QRPHynYLCBN0SqP = "TCyPEKSzIyweCN5yp1";

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public static final Paint f4506VItLRw50eXTZeEfGl0;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final RectF f4507Acstmh57AKoSEkEFNJ;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public int f4508G7AC3DWIx9i9fdanjk;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final T9PhQIpGRhE4yZDm1C.TCyPEKSzIyweCN5yp1[] f4509HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final Path f4510IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final Matrix f4511KYHag8HRDlnO3X9zmZ;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public boolean f4512LIMtzhnLwQyigzK0KO;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public final lBAL39rPf03qYLFNNP.lEeR5KfoEr4xU5yHH7 f4513OANkd3mP6AYvwbNLJM;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public PorterDuffColorFilter f4514R9SAhYMerGybF9OAjL;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public Z9WdNiOsPR0y54zHW4 f4515T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final Path f4516TCyPEKSzIyweCN5yp1;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public PorterDuffColorFilter f4517Y43RdunnpKgpbny0lE;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final Region f4518Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public final Paint f4519aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final Region f4520e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public final Paint f4521hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public boolean f4522husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f4523lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final RectF f4524pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final T9PhQIpGRhE4yZDm1C.TCyPEKSzIyweCN5yp1[] f4525s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public final e54J8UWNHWALQNixXM f4526sTkWmhpZ5b1ArQIw4K;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public final RectF f4527xHA29AmDt6y96AnB3t;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final BitSet f4528zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public final e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA f4529zaq8hOURtfwbcX17cG;

    public static class HJFh0TGMpafqLE9haL extends Drawable.ConstantState {

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public float f4530Acstmh57AKoSEkEFNJ;

        /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
        public boolean f4531G7AC3DWIx9i9fdanjk;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public ColorFilter f4532HJFh0TGMpafqLE9haL;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public PorterDuff.Mode f4533IPyIQcaNa8aB7drBED;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public ColorStateList f4534KYHag8HRDlnO3X9zmZ;

        /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
        public float f4535OANkd3mP6AYvwbNLJM;

        /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
        public int f4536R9SAhYMerGybF9OAjL;

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public int f4537T9PhQIpGRhE4yZDm1C;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public ColorStateList f4538TCyPEKSzIyweCN5yp1;

        /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
        public int f4539Y43RdunnpKgpbny0lE;

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public float f4540Z9WdNiOsPR0y54zHW4;

        /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
        public float f4541aPyGSIylzVNKPT1Bls;

        /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
        public float f4542e54J8UWNHWALQNixXM;

        /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
        public float f4543hoXrIDAFrSwfShk8da;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public ColorStateList f4544husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public Z9WdNiOsPR0y54zHW4 f4545lEeR5KfoEr4xU5yHH7;

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public Rect f4546pbVGzGjWvY2LDXC8vo;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public MHebQjnRowM60e3HDn.lEeR5KfoEr4xU5yHH7 f4547s3fjYDxWOUexjjVgyA;

        /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
        public int f4548sTkWmhpZ5b1ArQIw4K;

        /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
        public Paint.Style f4549xHA29AmDt6y96AnB3t;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public ColorStateList f4550zZKhbgvUfsK4AEX3r0;

        /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
        public int f4551zaq8hOURtfwbcX17cG;

        public HJFh0TGMpafqLE9haL(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            this.f4550zZKhbgvUfsK4AEX3r0 = null;
            this.f4544husNiw3snxdgZPAGJm = null;
            this.f4534KYHag8HRDlnO3X9zmZ = null;
            this.f4538TCyPEKSzIyweCN5yp1 = null;
            this.f4533IPyIQcaNa8aB7drBED = PorterDuff.Mode.SRC_IN;
            this.f4546pbVGzGjWvY2LDXC8vo = null;
            this.f4530Acstmh57AKoSEkEFNJ = 1.0f;
            this.f4540Z9WdNiOsPR0y54zHW4 = 1.0f;
            this.f4537T9PhQIpGRhE4yZDm1C = 255;
            this.f4543hoXrIDAFrSwfShk8da = 0.0f;
            this.f4541aPyGSIylzVNKPT1Bls = 0.0f;
            this.f4535OANkd3mP6AYvwbNLJM = 0.0f;
            this.f4551zaq8hOURtfwbcX17cG = 0;
            this.f4548sTkWmhpZ5b1ArQIw4K = 0;
            this.f4539Y43RdunnpKgpbny0lE = 0;
            this.f4536R9SAhYMerGybF9OAjL = 0;
            this.f4531G7AC3DWIx9i9fdanjk = false;
            this.f4549xHA29AmDt6y96AnB3t = Paint.Style.FILL_AND_STROKE;
            this.f4545lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL.f4545lEeR5KfoEr4xU5yHH7;
            this.f4547s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL.f4547s3fjYDxWOUexjjVgyA;
            this.f4542e54J8UWNHWALQNixXM = hJFh0TGMpafqLE9haL.f4542e54J8UWNHWALQNixXM;
            this.f4532HJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL.f4532HJFh0TGMpafqLE9haL;
            this.f4550zZKhbgvUfsK4AEX3r0 = hJFh0TGMpafqLE9haL.f4550zZKhbgvUfsK4AEX3r0;
            this.f4544husNiw3snxdgZPAGJm = hJFh0TGMpafqLE9haL.f4544husNiw3snxdgZPAGJm;
            this.f4533IPyIQcaNa8aB7drBED = hJFh0TGMpafqLE9haL.f4533IPyIQcaNa8aB7drBED;
            this.f4538TCyPEKSzIyweCN5yp1 = hJFh0TGMpafqLE9haL.f4538TCyPEKSzIyweCN5yp1;
            this.f4537T9PhQIpGRhE4yZDm1C = hJFh0TGMpafqLE9haL.f4537T9PhQIpGRhE4yZDm1C;
            this.f4530Acstmh57AKoSEkEFNJ = hJFh0TGMpafqLE9haL.f4530Acstmh57AKoSEkEFNJ;
            this.f4539Y43RdunnpKgpbny0lE = hJFh0TGMpafqLE9haL.f4539Y43RdunnpKgpbny0lE;
            this.f4551zaq8hOURtfwbcX17cG = hJFh0TGMpafqLE9haL.f4551zaq8hOURtfwbcX17cG;
            this.f4531G7AC3DWIx9i9fdanjk = hJFh0TGMpafqLE9haL.f4531G7AC3DWIx9i9fdanjk;
            this.f4540Z9WdNiOsPR0y54zHW4 = hJFh0TGMpafqLE9haL.f4540Z9WdNiOsPR0y54zHW4;
            this.f4543hoXrIDAFrSwfShk8da = hJFh0TGMpafqLE9haL.f4543hoXrIDAFrSwfShk8da;
            this.f4541aPyGSIylzVNKPT1Bls = hJFh0TGMpafqLE9haL.f4541aPyGSIylzVNKPT1Bls;
            this.f4535OANkd3mP6AYvwbNLJM = hJFh0TGMpafqLE9haL.f4535OANkd3mP6AYvwbNLJM;
            this.f4548sTkWmhpZ5b1ArQIw4K = hJFh0TGMpafqLE9haL.f4548sTkWmhpZ5b1ArQIw4K;
            this.f4536R9SAhYMerGybF9OAjL = hJFh0TGMpafqLE9haL.f4536R9SAhYMerGybF9OAjL;
            this.f4534KYHag8HRDlnO3X9zmZ = hJFh0TGMpafqLE9haL.f4534KYHag8HRDlnO3X9zmZ;
            this.f4549xHA29AmDt6y96AnB3t = hJFh0TGMpafqLE9haL.f4549xHA29AmDt6y96AnB3t;
            if (hJFh0TGMpafqLE9haL.f4546pbVGzGjWvY2LDXC8vo != null) {
                this.f4546pbVGzGjWvY2LDXC8vo = new Rect(hJFh0TGMpafqLE9haL.f4546pbVGzGjWvY2LDXC8vo);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new TCyPEKSzIyweCN5yp1(this);
            tCyPEKSzIyweCN5yp1.f4522husNiw3snxdgZPAGJm = true;
            return tCyPEKSzIyweCN5yp1;
        }

        public HJFh0TGMpafqLE9haL(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, MHebQjnRowM60e3HDn.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this.f4550zZKhbgvUfsK4AEX3r0 = null;
            this.f4544husNiw3snxdgZPAGJm = null;
            this.f4534KYHag8HRDlnO3X9zmZ = null;
            this.f4538TCyPEKSzIyweCN5yp1 = null;
            this.f4533IPyIQcaNa8aB7drBED = PorterDuff.Mode.SRC_IN;
            this.f4546pbVGzGjWvY2LDXC8vo = null;
            this.f4530Acstmh57AKoSEkEFNJ = 1.0f;
            this.f4540Z9WdNiOsPR0y54zHW4 = 1.0f;
            this.f4537T9PhQIpGRhE4yZDm1C = 255;
            this.f4543hoXrIDAFrSwfShk8da = 0.0f;
            this.f4541aPyGSIylzVNKPT1Bls = 0.0f;
            this.f4535OANkd3mP6AYvwbNLJM = 0.0f;
            this.f4551zaq8hOURtfwbcX17cG = 0;
            this.f4548sTkWmhpZ5b1ArQIw4K = 0;
            this.f4539Y43RdunnpKgpbny0lE = 0;
            this.f4536R9SAhYMerGybF9OAjL = 0;
            this.f4531G7AC3DWIx9i9fdanjk = false;
            this.f4549xHA29AmDt6y96AnB3t = Paint.Style.FILL_AND_STROKE;
            this.f4545lEeR5KfoEr4xU5yHH7 = z9WdNiOsPR0y54zHW4;
            this.f4547s3fjYDxWOUexjjVgyA = leer5kfoer4xu5yhh7;
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // ayaSAlBnO403UB0TMR.e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA
        public void lEeR5KfoEr4xU5yHH7(T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C, Matrix matrix, int i) {
            TCyPEKSzIyweCN5yp1.this.f4528zZKhbgvUfsK4AEX3r0.set(i, t9PhQIpGRhE4yZDm1C.husNiw3snxdgZPAGJm());
            TCyPEKSzIyweCN5yp1.this.f4525s3fjYDxWOUexjjVgyA[i] = t9PhQIpGRhE4yZDm1C.KYHag8HRDlnO3X9zmZ(matrix);
        }

        @Override // ayaSAlBnO403UB0TMR.e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA
        public void s3fjYDxWOUexjjVgyA(T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C, Matrix matrix, int i) {
            TCyPEKSzIyweCN5yp1.this.f4528zZKhbgvUfsK4AEX3r0.set(i + 4, t9PhQIpGRhE4yZDm1C.husNiw3snxdgZPAGJm());
            TCyPEKSzIyweCN5yp1.this.f4509HJFh0TGMpafqLE9haL[i] = t9PhQIpGRhE4yZDm1C.KYHag8HRDlnO3X9zmZ(matrix);
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Z9WdNiOsPR0y54zHW4.HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ float f4553lEeR5KfoEr4xU5yHH7;

        public s3fjYDxWOUexjjVgyA(float f) {
            this.f4553lEeR5KfoEr4xU5yHH7 = f;
        }

        @Override // ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4.HJFh0TGMpafqLE9haL
        public ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL lEeR5KfoEr4xU5yHH7(ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            return hJFh0TGMpafqLE9haL instanceof pbVGzGjWvY2LDXC8vo ? hJFh0TGMpafqLE9haL : new ayaSAlBnO403UB0TMR.s3fjYDxWOUexjjVgyA(this.f4553lEeR5KfoEr4xU5yHH7, hJFh0TGMpafqLE9haL);
        }
    }

    static {
        Paint paint = new Paint(1);
        f4506VItLRw50eXTZeEfGl0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public TCyPEKSzIyweCN5yp1() {
        this(new Z9WdNiOsPR0y54zHW4());
    }

    public static TCyPEKSzIyweCN5yp1 T9PhQIpGRhE4yZDm1C(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7130IPyIQcaNa8aB7drBED, TCyPEKSzIyweCN5yp1.class.getSimpleName()));
        }
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new TCyPEKSzIyweCN5yp1();
        tCyPEKSzIyweCN5yp1.DfpieXfdYs58yZAiXY(context);
        tCyPEKSzIyweCN5yp1.YlLW4G6OV9TFyuw5ix(colorStateList);
        tCyPEKSzIyweCN5yp1.zcy2NNbtVXgoGQbfuq(f);
        return tCyPEKSzIyweCN5yp1;
    }

    public static int lLKzvdU99Iw80uVD5I(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public float A49QRPHynYLCBN0SqP() {
        return this.f4523lEeR5KfoEr4xU5yHH7.f4543hoXrIDAFrSwfShk8da;
    }

    public final PorterDuffColorFilter Acstmh57AKoSEkEFNJ(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = e54J8UWNHWALQNixXM(colorForState);
        }
        this.f4508G7AC3DWIx9i9fdanjk = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public void CSih7GetOUab1dYQjM(float f) {
        this.f4523lEeR5KfoEr4xU5yHH7.f4542e54J8UWNHWALQNixXM = f;
        invalidateSelf();
    }

    public void DfpieXfdYs58yZAiXY(Context context) {
        this.f4523lEeR5KfoEr4xU5yHH7.f4547s3fjYDxWOUexjjVgyA = new MHebQjnRowM60e3HDn.lEeR5KfoEr4xU5yHH7(context);
        Tu4WCh2gEwj8E4oHbP();
    }

    public float G7AC3DWIx9i9fdanjk() {
        return this.f4523lEeR5KfoEr4xU5yHH7.f4541aPyGSIylzVNKPT1Bls;
    }

    public final boolean GyWRxpdt1T8mEJXPoD() {
        Paint.Style style = this.f4523lEeR5KfoEr4xU5yHH7.f4549xHA29AmDt6y96AnB3t;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f4519aPyGSIylzVNKPT1Bls.getStrokeWidth() > 0.0f;
    }

    public final void IPyIQcaNa8aB7drBED(RectF rectF, Path path) {
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f4526sTkWmhpZ5b1ArQIw4K;
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        e54j8uwnhwalqnixxm.husNiw3snxdgZPAGJm(hJFh0TGMpafqLE9haL.f4545lEeR5KfoEr4xU5yHH7, hJFh0TGMpafqLE9haL.f4540Z9WdNiOsPR0y54zHW4, rectF, this.f4529zaq8hOURtfwbcX17cG, path);
    }

    public final PorterDuffColorFilter KYHag8HRDlnO3X9zmZ(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(color);
        this.f4508G7AC3DWIx9i9fdanjk = iE54J8UWNHWALQNixXM;
        if (iE54J8UWNHWALQNixXM != color) {
            return new PorterDuffColorFilter(iE54J8UWNHWALQNixXM, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public boolean KqgKJKIWne3kz1AdHk() {
        MHebQjnRowM60e3HDn.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f4523lEeR5KfoEr4xU5yHH7.f4547s3fjYDxWOUexjjVgyA;
        return leer5kfoer4xu5yhh7 != null && leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0();
    }

    public float LIMtzhnLwQyigzK0KO() {
        return this.f4523lEeR5KfoEr4xU5yHH7.f4540Z9WdNiOsPR0y54zHW4;
    }

    public void LU0fFDMACqnfIfA1AZ(ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        setShapeAppearanceModel(this.f4523lEeR5KfoEr4xU5yHH7.f4545lEeR5KfoEr4xU5yHH7.A49QRPHynYLCBN0SqP(hJFh0TGMpafqLE9haL));
    }

    public void OANkd3mP6AYvwbNLJM(Canvas canvas, Paint paint, Path path, RectF rectF) {
        zaq8hOURtfwbcX17cG(canvas, paint, path, this.f4523lEeR5KfoEr4xU5yHH7.f4545lEeR5KfoEr4xU5yHH7, rectF);
    }

    public float OUd9THiLjZndMj0qdF() {
        return this.f4523lEeR5KfoEr4xU5yHH7.f4545lEeR5KfoEr4xU5yHH7.sTkWmhpZ5b1ArQIw4K().lEeR5KfoEr4xU5yHH7(Y43RdunnpKgpbny0lE());
    }

    public final boolean OqIo5QF00RDxUQb4qq() {
        Paint.Style style = this.f4523lEeR5KfoEr4xU5yHH7.f4549xHA29AmDt6y96AnB3t;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public boolean PPkm9uUfOJHHYveeLT() {
        return this.f4523lEeR5KfoEr4xU5yHH7.f4545lEeR5KfoEr4xU5yHH7.G7AC3DWIx9i9fdanjk(Y43RdunnpKgpbny0lE());
    }

    public final RectF R9SAhYMerGybF9OAjL() {
        this.f4507Acstmh57AKoSEkEFNJ.set(Y43RdunnpKgpbny0lE());
        float fAo3wqKm5CXFuvC0q47 = ao3wqKm5CXFuvC0q47();
        this.f4507Acstmh57AKoSEkEFNJ.inset(fAo3wqKm5CXFuvC0q47, fAo3wqKm5CXFuvC0q47);
        return this.f4507Acstmh57AKoSEkEFNJ;
    }

    public final void TCyPEKSzIyweCN5yp1(RectF rectF, Path path) {
        IPyIQcaNa8aB7drBED(rectF, path);
        if (this.f4523lEeR5KfoEr4xU5yHH7.f4530Acstmh57AKoSEkEFNJ != 1.0f) {
            this.f4511KYHag8HRDlnO3X9zmZ.reset();
            Matrix matrix = this.f4511KYHag8HRDlnO3X9zmZ;
            float f = this.f4523lEeR5KfoEr4xU5yHH7.f4530Acstmh57AKoSEkEFNJ;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f4511KYHag8HRDlnO3X9zmZ);
        }
        path.computeBounds(this.f4527xHA29AmDt6y96AnB3t, true);
    }

    public Z9WdNiOsPR0y54zHW4 THTDvPxsHqMeGb512f() {
        return this.f4523lEeR5KfoEr4xU5yHH7.f4545lEeR5KfoEr4xU5yHH7;
    }

    public final void ToH8yzk8U1nKT0PUfY(Canvas canvas) {
        canvas.translate(VItLRw50eXTZeEfGl0(), WWC27LAMFqFFBzfbNw());
    }

    public final void Tu4WCh2gEwj8E4oHbP() {
        float fTXWeW0sqVddf7ZBflq = tXWeW0sqVddf7ZBflq();
        this.f4523lEeR5KfoEr4xU5yHH7.f4548sTkWmhpZ5b1ArQIw4K = (int) Math.ceil(0.75f * fTXWeW0sqVddf7ZBflq);
        this.f4523lEeR5KfoEr4xU5yHH7.f4539Y43RdunnpKgpbny0lE = (int) Math.ceil(fTXWeW0sqVddf7ZBflq * 0.25f);
        ZJNyOIPL0usMs2xSAn();
        e2F9F6h8YJxTHwLCa0();
    }

    public void Uj8rPa1EWADtk6Oe0S(ColorStateList colorStateList) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        if (hJFh0TGMpafqLE9haL.f4544husNiw3snxdgZPAGJm != colorStateList) {
            hJFh0TGMpafqLE9haL.f4544husNiw3snxdgZPAGJm = colorStateList;
            onStateChange(getState());
        }
    }

    public int VItLRw50eXTZeEfGl0() {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        return (int) (hJFh0TGMpafqLE9haL.f4539Y43RdunnpKgpbny0lE * Math.sin(Math.toRadians(hJFh0TGMpafqLE9haL.f4536R9SAhYMerGybF9OAjL)));
    }

    public final boolean W3RZ2dTDKrKpS5Mxdk() {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        int i = hJFh0TGMpafqLE9haL.f4551zaq8hOURtfwbcX17cG;
        return i != 1 && hJFh0TGMpafqLE9haL.f4548sTkWmhpZ5b1ArQIw4K > 0 && (i == 2 || XdzLv4NdAtTYoEzVzB());
    }

    public int WWC27LAMFqFFBzfbNw() {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        return (int) (hJFh0TGMpafqLE9haL.f4539Y43RdunnpKgpbny0lE * Math.cos(Math.toRadians(hJFh0TGMpafqLE9haL.f4536R9SAhYMerGybF9OAjL)));
    }

    public boolean XdzLv4NdAtTYoEzVzB() {
        return (PPkm9uUfOJHHYveeLT() || this.f4516TCyPEKSzIyweCN5yp1.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public float XzJ1BS7H9Ilbkv4eVM() {
        return this.f4523lEeR5KfoEr4xU5yHH7.f4535OANkd3mP6AYvwbNLJM;
    }

    public RectF Y43RdunnpKgpbny0lE() {
        this.f4524pbVGzGjWvY2LDXC8vo.set(getBounds());
        return this.f4524pbVGzGjWvY2LDXC8vo;
    }

    public void YlLW4G6OV9TFyuw5ix(ColorStateList colorStateList) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        if (hJFh0TGMpafqLE9haL.f4550zZKhbgvUfsK4AEX3r0 != colorStateList) {
            hJFh0TGMpafqLE9haL.f4550zZKhbgvUfsK4AEX3r0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final PorterDuffColorFilter Z9WdNiOsPR0y54zHW4(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? KYHag8HRDlnO3X9zmZ(paint, z) : Acstmh57AKoSEkEFNJ(colorStateList, mode, z);
    }

    public final boolean ZJNyOIPL0usMs2xSAn() {
        PorterDuffColorFilter porterDuffColorFilter = this.f4517Y43RdunnpKgpbny0lE;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f4514R9SAhYMerGybF9OAjL;
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        this.f4517Y43RdunnpKgpbny0lE = Z9WdNiOsPR0y54zHW4(hJFh0TGMpafqLE9haL.f4538TCyPEKSzIyweCN5yp1, hJFh0TGMpafqLE9haL.f4533IPyIQcaNa8aB7drBED, this.f4521hoXrIDAFrSwfShk8da, true);
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = this.f4523lEeR5KfoEr4xU5yHH7;
        this.f4514R9SAhYMerGybF9OAjL = Z9WdNiOsPR0y54zHW4(hJFh0TGMpafqLE9haL2.f4534KYHag8HRDlnO3X9zmZ, hJFh0TGMpafqLE9haL2.f4533IPyIQcaNa8aB7drBED, this.f4519aPyGSIylzVNKPT1Bls, false);
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3 = this.f4523lEeR5KfoEr4xU5yHH7;
        if (hJFh0TGMpafqLE9haL3.f4531G7AC3DWIx9i9fdanjk) {
            this.f4513OANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0(hJFh0TGMpafqLE9haL3.f4538TCyPEKSzIyweCN5yp1.getColorForState(getState(), 0));
        }
        return (tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(porterDuffColorFilter, this.f4517Y43RdunnpKgpbny0lE) && tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(porterDuffColorFilter2, this.f4514R9SAhYMerGybF9OAjL)) ? false : true;
    }

    public final void aAp6BD79BhftLCnuvf(Canvas canvas) {
        if (W3RZ2dTDKrKpS5Mxdk()) {
            canvas.save();
            ToH8yzk8U1nKT0PUfY(canvas);
            if (this.f4512LIMtzhnLwQyigzK0KO) {
                int iWidth = (int) (this.f4527xHA29AmDt6y96AnB3t.width() - getBounds().width());
                int iHeight = (int) (this.f4527xHA29AmDt6y96AnB3t.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f4527xHA29AmDt6y96AnB3t.width()) + (this.f4523lEeR5KfoEr4xU5yHH7.f4548sTkWmhpZ5b1ArQIw4K * 2) + iWidth, ((int) this.f4527xHA29AmDt6y96AnB3t.height()) + (this.f4523lEeR5KfoEr4xU5yHH7.f4548sTkWmhpZ5b1ArQIw4K * 2) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f = (getBounds().left - this.f4523lEeR5KfoEr4xU5yHH7.f4548sTkWmhpZ5b1ArQIw4K) - iWidth;
                float f2 = (getBounds().top - this.f4523lEeR5KfoEr4xU5yHH7.f4548sTkWmhpZ5b1ArQIw4K) - iHeight;
                canvas2.translate(-f, -f2);
                hoXrIDAFrSwfShk8da(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                bitmapCreateBitmap.recycle();
            } else {
                hoXrIDAFrSwfShk8da(canvas);
            }
            canvas.restore();
        }
    }

    public final void aPyGSIylzVNKPT1Bls(Canvas canvas) {
        zaq8hOURtfwbcX17cG(canvas, this.f4521hoXrIDAFrSwfShk8da, this.f4516TCyPEKSzIyweCN5yp1, this.f4523lEeR5KfoEr4xU5yHH7.f4545lEeR5KfoEr4xU5yHH7, Y43RdunnpKgpbny0lE());
    }

    public final float ao3wqKm5CXFuvC0q47() {
        if (GyWRxpdt1T8mEJXPoD()) {
            return this.f4519aPyGSIylzVNKPT1Bls.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public void bMSdooljgH14Jgudph(float f, ColorStateList colorStateList) {
        CSih7GetOUab1dYQjM(f);
        Uj8rPa1EWADtk6Oe0S(colorStateList);
    }

    public void cT5Hs3CQpLK8NvlZAw(float f) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        if (hJFh0TGMpafqLE9haL.f4543hoXrIDAFrSwfShk8da != f) {
            hJFh0TGMpafqLE9haL.f4543hoXrIDAFrSwfShk8da = f;
            Tu4WCh2gEwj8E4oHbP();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f4521hoXrIDAFrSwfShk8da.setColorFilter(this.f4517Y43RdunnpKgpbny0lE);
        int alpha = this.f4521hoXrIDAFrSwfShk8da.getAlpha();
        this.f4521hoXrIDAFrSwfShk8da.setAlpha(lLKzvdU99Iw80uVD5I(alpha, this.f4523lEeR5KfoEr4xU5yHH7.f4537T9PhQIpGRhE4yZDm1C));
        this.f4519aPyGSIylzVNKPT1Bls.setColorFilter(this.f4514R9SAhYMerGybF9OAjL);
        this.f4519aPyGSIylzVNKPT1Bls.setStrokeWidth(this.f4523lEeR5KfoEr4xU5yHH7.f4542e54J8UWNHWALQNixXM);
        int alpha2 = this.f4519aPyGSIylzVNKPT1Bls.getAlpha();
        this.f4519aPyGSIylzVNKPT1Bls.setAlpha(lLKzvdU99Iw80uVD5I(alpha2, this.f4523lEeR5KfoEr4xU5yHH7.f4537T9PhQIpGRhE4yZDm1C));
        if (this.f4522husNiw3snxdgZPAGJm) {
            pbVGzGjWvY2LDXC8vo();
            TCyPEKSzIyweCN5yp1(Y43RdunnpKgpbny0lE(), this.f4516TCyPEKSzIyweCN5yp1);
            this.f4522husNiw3snxdgZPAGJm = false;
        }
        aAp6BD79BhftLCnuvf(canvas);
        if (OqIo5QF00RDxUQb4qq()) {
            aPyGSIylzVNKPT1Bls(canvas);
        }
        if (GyWRxpdt1T8mEJXPoD()) {
            sTkWmhpZ5b1ArQIw4K(canvas);
        }
        this.f4521hoXrIDAFrSwfShk8da.setAlpha(alpha);
        this.f4519aPyGSIylzVNKPT1Bls.setAlpha(alpha2);
    }

    public final void e2F9F6h8YJxTHwLCa0() {
        super.invalidateSelf();
    }

    public int e54J8UWNHWALQNixXM(int i) {
        float fTXWeW0sqVddf7ZBflq = tXWeW0sqVddf7ZBflq() + A49QRPHynYLCBN0SqP();
        MHebQjnRowM60e3HDn.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f4523lEeR5KfoEr4xU5yHH7.f4547s3fjYDxWOUexjjVgyA;
        return leer5kfoer4xu5yhh7 != null ? leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL(i, fTXWeW0sqVddf7ZBflq) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4523lEeR5KfoEr4xU5yHH7.f4537T9PhQIpGRhE4yZDm1C;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4523lEeR5KfoEr4xU5yHH7;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f4523lEeR5KfoEr4xU5yHH7.f4551zaq8hOURtfwbcX17cG == 2) {
            return;
        }
        if (PPkm9uUfOJHHYveeLT()) {
            outline.setRoundRect(getBounds(), OUd9THiLjZndMj0qdF() * this.f4523lEeR5KfoEr4xU5yHH7.f4540Z9WdNiOsPR0y54zHW4);
        } else {
            TCyPEKSzIyweCN5yp1(Y43RdunnpKgpbny0lE(), this.f4516TCyPEKSzIyweCN5yp1);
            h6NrAcYSuIyiU1qV6F.husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(outline, this.f4516TCyPEKSzIyweCN5yp1);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f4523lEeR5KfoEr4xU5yHH7.f4546pbVGzGjWvY2LDXC8vo;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f4518Z9WdNiOsPR0y54zHW4.set(getBounds());
        TCyPEKSzIyweCN5yp1(Y43RdunnpKgpbny0lE(), this.f4516TCyPEKSzIyweCN5yp1);
        this.f4520e54J8UWNHWALQNixXM.setPath(this.f4516TCyPEKSzIyweCN5yp1, this.f4518Z9WdNiOsPR0y54zHW4);
        this.f4518Z9WdNiOsPR0y54zHW4.op(this.f4520e54J8UWNHWALQNixXM, Region.Op.DIFFERENCE);
        return this.f4518Z9WdNiOsPR0y54zHW4;
    }

    public void hUNBy66ZO1wVLJGW3l(float f, int i) {
        CSih7GetOUab1dYQjM(f);
        Uj8rPa1EWADtk6Oe0S(ColorStateList.valueOf(i));
    }

    public final void hoXrIDAFrSwfShk8da(Canvas canvas) {
        if (this.f4528zZKhbgvUfsK4AEX3r0.cardinality() > 0) {
            Log.w(f4505A49QRPHynYLCBN0SqP, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f4523lEeR5KfoEr4xU5yHH7.f4539Y43RdunnpKgpbny0lE != 0) {
            canvas.drawPath(this.f4516TCyPEKSzIyweCN5yp1, this.f4513OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL());
        }
        for (int i = 0; i < 4; i++) {
            this.f4525s3fjYDxWOUexjjVgyA[i].s3fjYDxWOUexjjVgyA(this.f4513OANkd3mP6AYvwbNLJM, this.f4523lEeR5KfoEr4xU5yHH7.f4548sTkWmhpZ5b1ArQIw4K, canvas);
            this.f4509HJFh0TGMpafqLE9haL[i].s3fjYDxWOUexjjVgyA(this.f4513OANkd3mP6AYvwbNLJM, this.f4523lEeR5KfoEr4xU5yHH7.f4548sTkWmhpZ5b1ArQIw4K, canvas);
        }
        if (this.f4512LIMtzhnLwQyigzK0KO) {
            int iVItLRw50eXTZeEfGl0 = VItLRw50eXTZeEfGl0();
            int iWWC27LAMFqFFBzfbNw = WWC27LAMFqFFBzfbNw();
            canvas.translate(-iVItLRw50eXTZeEfGl0, -iWWC27LAMFqFFBzfbNw);
            canvas.drawPath(this.f4516TCyPEKSzIyweCN5yp1, f4506VItLRw50eXTZeEfGl0);
            canvas.translate(iVItLRw50eXTZeEfGl0, iWWC27LAMFqFFBzfbNw);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f4522husNiw3snxdgZPAGJm = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f4523lEeR5KfoEr4xU5yHH7.f4538TCyPEKSzIyweCN5yp1) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f4523lEeR5KfoEr4xU5yHH7.f4534KYHag8HRDlnO3X9zmZ) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f4523lEeR5KfoEr4xU5yHH7.f4544husNiw3snxdgZPAGJm) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f4523lEeR5KfoEr4xU5yHH7.f4550zZKhbgvUfsK4AEX3r0) != null && colorStateList4.isStateful())));
    }

    public float jCtUeU2YI1poCxWcjm() {
        return this.f4523lEeR5KfoEr4xU5yHH7.f4545lEeR5KfoEr4xU5yHH7.R9SAhYMerGybF9OAjL().lEeR5KfoEr4xU5yHH7(Y43RdunnpKgpbny0lE());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f4523lEeR5KfoEr4xU5yHH7 = new HJFh0TGMpafqLE9haL(this.f4523lEeR5KfoEr4xU5yHH7);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f4522husNiw3snxdgZPAGJm = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = osrHU7fvDp2EgxZPfM(iArr) || ZJNyOIPL0usMs2xSAn();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void oocVJL811qFf0j0XXZ(float f) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        if (hJFh0TGMpafqLE9haL.f4540Z9WdNiOsPR0y54zHW4 != f) {
            hJFh0TGMpafqLE9haL.f4540Z9WdNiOsPR0y54zHW4 = f;
            this.f4522husNiw3snxdgZPAGJm = true;
            invalidateSelf();
        }
    }

    public final boolean osrHU7fvDp2EgxZPfM(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f4523lEeR5KfoEr4xU5yHH7.f4550zZKhbgvUfsK4AEX3r0 == null || color2 == (colorForState2 = this.f4523lEeR5KfoEr4xU5yHH7.f4550zZKhbgvUfsK4AEX3r0.getColorForState(iArr, (color2 = this.f4521hoXrIDAFrSwfShk8da.getColor())))) {
            z = false;
        } else {
            this.f4521hoXrIDAFrSwfShk8da.setColor(colorForState2);
            z = true;
        }
        if (this.f4523lEeR5KfoEr4xU5yHH7.f4544husNiw3snxdgZPAGJm == null || color == (colorForState = this.f4523lEeR5KfoEr4xU5yHH7.f4544husNiw3snxdgZPAGJm.getColorForState(iArr, (color = this.f4519aPyGSIylzVNKPT1Bls.getColor())))) {
            return z;
        }
        this.f4519aPyGSIylzVNKPT1Bls.setColor(colorForState);
        return true;
    }

    public final void pbVGzGjWvY2LDXC8vo() {
        Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4VItLRw50eXTZeEfGl0 = THTDvPxsHqMeGb512f().VItLRw50eXTZeEfGl0(new s3fjYDxWOUexjjVgyA(-ao3wqKm5CXFuvC0q47()));
        this.f4515T9PhQIpGRhE4yZDm1C = z9WdNiOsPR0y54zHW4VItLRw50eXTZeEfGl0;
        this.f4526sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0(z9WdNiOsPR0y54zHW4VItLRw50eXTZeEfGl0, this.f4523lEeR5KfoEr4xU5yHH7.f4540Z9WdNiOsPR0y54zHW4, R9SAhYMerGybF9OAjL(), this.f4510IPyIQcaNa8aB7drBED);
    }

    public void sTkWmhpZ5b1ArQIw4K(Canvas canvas) {
        zaq8hOURtfwbcX17cG(canvas, this.f4519aPyGSIylzVNKPT1Bls, this.f4510IPyIQcaNa8aB7drBED, this.f4515T9PhQIpGRhE4yZDm1C, R9SAhYMerGybF9OAjL());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        if (hJFh0TGMpafqLE9haL.f4537T9PhQIpGRhE4yZDm1C != i) {
            hJFh0TGMpafqLE9haL.f4537T9PhQIpGRhE4yZDm1C = i;
            e2F9F6h8YJxTHwLCa0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4523lEeR5KfoEr4xU5yHH7.f4532HJFh0TGMpafqLE9haL = colorFilter;
        e2F9F6h8YJxTHwLCa0();
    }

    @Override // ayaSAlBnO403UB0TMR.hoXrIDAFrSwfShk8da
    public void setShapeAppearanceModel(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        this.f4523lEeR5KfoEr4xU5yHH7.f4545lEeR5KfoEr4xU5yHH7 = z9WdNiOsPR0y54zHW4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f4523lEeR5KfoEr4xU5yHH7.f4538TCyPEKSzIyweCN5yp1 = colorStateList;
        ZJNyOIPL0usMs2xSAn();
        e2F9F6h8YJxTHwLCa0();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        if (hJFh0TGMpafqLE9haL.f4533IPyIQcaNa8aB7drBED != mode) {
            hJFh0TGMpafqLE9haL.f4533IPyIQcaNa8aB7drBED = mode;
            ZJNyOIPL0usMs2xSAn();
            e2F9F6h8YJxTHwLCa0();
        }
    }

    public float tXWeW0sqVddf7ZBflq() {
        return G7AC3DWIx9i9fdanjk() + XzJ1BS7H9Ilbkv4eVM();
    }

    public void udcVtCzLTM1Loe9KrX(int i, int i2, int i3, int i4) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        if (hJFh0TGMpafqLE9haL.f4546pbVGzGjWvY2LDXC8vo == null) {
            hJFh0TGMpafqLE9haL.f4546pbVGzGjWvY2LDXC8vo = new Rect();
        }
        this.f4523lEeR5KfoEr4xU5yHH7.f4546pbVGzGjWvY2LDXC8vo.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public ColorStateList xHA29AmDt6y96AnB3t() {
        return this.f4523lEeR5KfoEr4xU5yHH7.f4550zZKhbgvUfsK4AEX3r0;
    }

    public final void zaq8hOURtfwbcX17cG(Canvas canvas, Paint paint, Path path, Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, RectF rectF) {
        if (!z9WdNiOsPR0y54zHW4.G7AC3DWIx9i9fdanjk(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fLEeR5KfoEr4xU5yHH7 = z9WdNiOsPR0y54zHW4.R9SAhYMerGybF9OAjL().lEeR5KfoEr4xU5yHH7(rectF) * this.f4523lEeR5KfoEr4xU5yHH7.f4540Z9WdNiOsPR0y54zHW4;
            canvas.drawRoundRect(rectF, fLEeR5KfoEr4xU5yHH7, fLEeR5KfoEr4xU5yHH7, paint);
        }
    }

    public void zcy2NNbtVXgoGQbfuq(float f) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f4523lEeR5KfoEr4xU5yHH7;
        if (hJFh0TGMpafqLE9haL.f4541aPyGSIylzVNKPT1Bls != f) {
            hJFh0TGMpafqLE9haL.f4541aPyGSIylzVNKPT1Bls = f;
            Tu4WCh2gEwj8E4oHbP();
        }
    }

    public TCyPEKSzIyweCN5yp1(Context context, AttributeSet attributeSet, int i, int i2) {
        this(Z9WdNiOsPR0y54zHW4.husNiw3snxdgZPAGJm(context, attributeSet, i, i2).T9PhQIpGRhE4yZDm1C());
    }

    public TCyPEKSzIyweCN5yp1(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        this.f4525s3fjYDxWOUexjjVgyA = new T9PhQIpGRhE4yZDm1C.TCyPEKSzIyweCN5yp1[4];
        this.f4509HJFh0TGMpafqLE9haL = new T9PhQIpGRhE4yZDm1C.TCyPEKSzIyweCN5yp1[4];
        this.f4528zZKhbgvUfsK4AEX3r0 = new BitSet(8);
        this.f4511KYHag8HRDlnO3X9zmZ = new Matrix();
        this.f4516TCyPEKSzIyweCN5yp1 = new Path();
        this.f4510IPyIQcaNa8aB7drBED = new Path();
        this.f4524pbVGzGjWvY2LDXC8vo = new RectF();
        this.f4507Acstmh57AKoSEkEFNJ = new RectF();
        this.f4518Z9WdNiOsPR0y54zHW4 = new Region();
        this.f4520e54J8UWNHWALQNixXM = new Region();
        Paint paint = new Paint(1);
        this.f4521hoXrIDAFrSwfShk8da = paint;
        Paint paint2 = new Paint(1);
        this.f4519aPyGSIylzVNKPT1Bls = paint2;
        this.f4513OANkd3mP6AYvwbNLJM = new lBAL39rPf03qYLFNNP.lEeR5KfoEr4xU5yHH7();
        this.f4526sTkWmhpZ5b1ArQIw4K = Looper.getMainLooper().getThread() == Thread.currentThread() ? e54J8UWNHWALQNixXM.Z9WdNiOsPR0y54zHW4() : new e54J8UWNHWALQNixXM();
        this.f4527xHA29AmDt6y96AnB3t = new RectF();
        this.f4512LIMtzhnLwQyigzK0KO = true;
        this.f4523lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        ZJNyOIPL0usMs2xSAn();
        osrHU7fvDp2EgxZPfM(getState());
        this.f4529zaq8hOURtfwbcX17cG = new lEeR5KfoEr4xU5yHH7();
    }

    public TCyPEKSzIyweCN5yp1(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        this(new HJFh0TGMpafqLE9haL(z9WdNiOsPR0y54zHW4, null));
    }
}
