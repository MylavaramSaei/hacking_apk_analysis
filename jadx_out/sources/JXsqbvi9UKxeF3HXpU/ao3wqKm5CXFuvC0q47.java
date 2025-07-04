package JXsqbvi9UKxeF3HXpU;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ao3wqKm5CXFuvC0q47 implements Runnable {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final /* synthetic */ pbVGzGjWvY2LDXC8vo f801lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final /* synthetic */ OUd9THiLjZndMj0qdF f802s3fjYDxWOUexjjVgyA;

    public ao3wqKm5CXFuvC0q47(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        this.f802s3fjYDxWOUexjjVgyA = oUd9THiLjZndMj0qdF;
        this.f801lEeR5KfoEr4xU5yHH7 = pbvgzgjwvy2ldxc8vo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voLEeR5KfoEr4xU5yHH7 = this.f802s3fjYDxWOUexjjVgyA.f776s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f801lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4());
            if (pbvgzgjwvy2ldxc8voLEeR5KfoEr4xU5yHH7 == null) {
                this.f802s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(new NullPointerException("Continuation returned null"));
                return;
            }
            OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = this.f802s3fjYDxWOUexjjVgyA;
            Executor executor = Z9WdNiOsPR0y54zHW4.f800s3fjYDxWOUexjjVgyA;
            pbvgzgjwvy2ldxc8voLEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(executor, oUd9THiLjZndMj0qdF);
            pbvgzgjwvy2ldxc8voLEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(executor, this.f802s3fjYDxWOUexjjVgyA);
            pbvgzgjwvy2ldxc8voLEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(executor, this.f802s3fjYDxWOUexjjVgyA);
        } catch (TCyPEKSzIyweCN5yp1 e) {
            if (e.getCause() instanceof Exception) {
                this.f802s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL((Exception) e.getCause());
            } else {
                this.f802s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(e);
            }
        } catch (CancellationException unused) {
            this.f802s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
        } catch (Exception e2) {
            this.f802s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(e2);
        }
    }
}
