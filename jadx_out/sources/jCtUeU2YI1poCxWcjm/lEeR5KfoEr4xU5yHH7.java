package jCtUeU2YI1poCxWcjm;

import android.graphics.Typeface;
import android.os.Handler;
import jCtUeU2YI1poCxWcjm.KYHag8HRDlnO3X9zmZ;
import jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL f6087lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Handler f6088s3fjYDxWOUexjjVgyA;

    /* renamed from: jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public class RunnableC0096lEeR5KfoEr4xU5yHH7 implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL f6090lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ Typeface f6091s3fjYDxWOUexjjVgyA;

        public RunnableC0096lEeR5KfoEr4xU5yHH7(TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, Typeface typeface) {
            this.f6090lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
            this.f6091s3fjYDxWOUexjjVgyA = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6090lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this.f6091s3fjYDxWOUexjjVgyA);
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL f6093lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ int f6094s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, int i) {
            this.f6093lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
            this.f6094s3fjYDxWOUexjjVgyA = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6093lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f6094s3fjYDxWOUexjjVgyA);
        }
    }

    public lEeR5KfoEr4xU5yHH7(TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, Handler handler) {
        this.f6087lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
        this.f6088s3fjYDxWOUexjjVgyA = handler;
    }

    public final void HJFh0TGMpafqLE9haL(Typeface typeface) {
        this.f6088s3fjYDxWOUexjjVgyA.post(new RunnableC0096lEeR5KfoEr4xU5yHH7(this.f6087lEeR5KfoEr4xU5yHH7, typeface));
    }

    public final void lEeR5KfoEr4xU5yHH7(int i) {
        this.f6088s3fjYDxWOUexjjVgyA.post(new s3fjYDxWOUexjjVgyA(this.f6087lEeR5KfoEr4xU5yHH7, i));
    }

    public void s3fjYDxWOUexjjVgyA(KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        if (husniw3snxdgzpagjm.lEeR5KfoEr4xU5yHH7()) {
            HJFh0TGMpafqLE9haL(husniw3snxdgzpagjm.f6066lEeR5KfoEr4xU5yHH7);
        } else {
            lEeR5KfoEr4xU5yHH7(husniw3snxdgzpagjm.f6067s3fjYDxWOUexjjVgyA);
        }
    }
}
