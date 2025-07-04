package JXsqbvi9UKxeF3HXpU;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class THTDvPxsHqMeGb512f implements jCtUeU2YI1poCxWcjm {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public KYHag8HRDlnO3X9zmZ f784HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Executor f785lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Object f786s3fjYDxWOUexjjVgyA = new Object();

    public THTDvPxsHqMeGb512f(Executor executor, KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        this.f785lEeR5KfoEr4xU5yHH7 = executor;
        this.f784HJFh0TGMpafqLE9haL = kYHag8HRDlnO3X9zmZ;
    }

    @Override // JXsqbvi9UKxeF3HXpU.jCtUeU2YI1poCxWcjm
    public final void lEeR5KfoEr4xU5yHH7(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        if (pbvgzgjwvy2ldxc8vo.aPyGSIylzVNKPT1Bls()) {
            synchronized (this.f786s3fjYDxWOUexjjVgyA) {
                try {
                    if (this.f784HJFh0TGMpafqLE9haL == null) {
                        return;
                    }
                    this.f785lEeR5KfoEr4xU5yHH7.execute(new WWC27LAMFqFFBzfbNw(this, pbvgzgjwvy2ldxc8vo));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
