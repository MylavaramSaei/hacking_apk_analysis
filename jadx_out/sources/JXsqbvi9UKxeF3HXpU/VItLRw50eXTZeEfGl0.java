package JXsqbvi9UKxeF3HXpU;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class VItLRw50eXTZeEfGl0 implements jCtUeU2YI1poCxWcjm {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f787HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Executor f788lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Object f789s3fjYDxWOUexjjVgyA = new Object();

    public VItLRw50eXTZeEfGl0(Executor executor, husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this.f788lEeR5KfoEr4xU5yHH7 = executor;
        this.f787HJFh0TGMpafqLE9haL = husniw3snxdgzpagjm;
    }

    @Override // JXsqbvi9UKxeF3HXpU.jCtUeU2YI1poCxWcjm
    public final void lEeR5KfoEr4xU5yHH7(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        if (pbvgzgjwvy2ldxc8vo.aPyGSIylzVNKPT1Bls() || pbvgzgjwvy2ldxc8vo.T9PhQIpGRhE4yZDm1C()) {
            return;
        }
        synchronized (this.f789s3fjYDxWOUexjjVgyA) {
            try {
                if (this.f787HJFh0TGMpafqLE9haL == null) {
                    return;
                }
                this.f788lEeR5KfoEr4xU5yHH7.execute(new A49QRPHynYLCBN0SqP(this, pbvgzgjwvy2ldxc8vo));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
