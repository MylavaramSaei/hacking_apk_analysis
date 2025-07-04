package JXsqbvi9UKxeF3HXpU;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class G7AC3DWIx9i9fdanjk implements jCtUeU2YI1poCxWcjm {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f764HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Executor f765lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Object f766s3fjYDxWOUexjjVgyA = new Object();

    public G7AC3DWIx9i9fdanjk(Executor executor, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        this.f765lEeR5KfoEr4xU5yHH7 = executor;
        this.f764HJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL;
    }

    @Override // JXsqbvi9UKxeF3HXpU.jCtUeU2YI1poCxWcjm
    public final void lEeR5KfoEr4xU5yHH7(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        if (pbvgzgjwvy2ldxc8vo.T9PhQIpGRhE4yZDm1C()) {
            synchronized (this.f766s3fjYDxWOUexjjVgyA) {
                try {
                    if (this.f764HJFh0TGMpafqLE9haL == null) {
                        return;
                    }
                    this.f765lEeR5KfoEr4xU5yHH7.execute(new R9SAhYMerGybF9OAjL(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
