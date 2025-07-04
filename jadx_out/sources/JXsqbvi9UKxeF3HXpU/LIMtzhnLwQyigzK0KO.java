package JXsqbvi9UKxeF3HXpU;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class LIMtzhnLwQyigzK0KO implements jCtUeU2YI1poCxWcjm {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0 f769HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Executor f770lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Object f771s3fjYDxWOUexjjVgyA = new Object();

    public LIMtzhnLwQyigzK0KO(Executor executor, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        this.f770lEeR5KfoEr4xU5yHH7 = executor;
        this.f769HJFh0TGMpafqLE9haL = zzkhbgvufsk4aex3r0;
    }

    @Override // JXsqbvi9UKxeF3HXpU.jCtUeU2YI1poCxWcjm
    public final void lEeR5KfoEr4xU5yHH7(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        synchronized (this.f771s3fjYDxWOUexjjVgyA) {
            try {
                if (this.f769HJFh0TGMpafqLE9haL == null) {
                    return;
                }
                this.f770lEeR5KfoEr4xU5yHH7.execute(new xHA29AmDt6y96AnB3t(this, pbvgzgjwvy2ldxc8vo));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
