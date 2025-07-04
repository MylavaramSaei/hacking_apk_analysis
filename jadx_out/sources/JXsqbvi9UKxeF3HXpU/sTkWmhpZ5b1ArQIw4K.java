package JXsqbvi9UKxeF3HXpU;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class sTkWmhpZ5b1ArQIw4K implements Runnable {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final /* synthetic */ pbVGzGjWvY2LDXC8vo f804lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final /* synthetic */ Y43RdunnpKgpbny0lE f805s3fjYDxWOUexjjVgyA;

    public sTkWmhpZ5b1ArQIw4K(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        this.f805s3fjYDxWOUexjjVgyA = y43RdunnpKgpbny0lE;
        this.f804lEeR5KfoEr4xU5yHH7 = pbvgzgjwvy2ldxc8vo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = (pbVGzGjWvY2LDXC8vo) this.f805s3fjYDxWOUexjjVgyA.f798s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f804lEeR5KfoEr4xU5yHH7);
            if (pbvgzgjwvy2ldxc8vo == null) {
                this.f805s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(new NullPointerException("Continuation returned null"));
                return;
            }
            Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f805s3fjYDxWOUexjjVgyA;
            Executor executor = Z9WdNiOsPR0y54zHW4.f800s3fjYDxWOUexjjVgyA;
            pbvgzgjwvy2ldxc8vo.TCyPEKSzIyweCN5yp1(executor, y43RdunnpKgpbny0lE);
            pbvgzgjwvy2ldxc8vo.husNiw3snxdgZPAGJm(executor, this.f805s3fjYDxWOUexjjVgyA);
            pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7(executor, this.f805s3fjYDxWOUexjjVgyA);
        } catch (TCyPEKSzIyweCN5yp1 e) {
            if (e.getCause() instanceof Exception) {
                this.f805s3fjYDxWOUexjjVgyA.f796HJFh0TGMpafqLE9haL.sTkWmhpZ5b1ArQIw4K((Exception) e.getCause());
            } else {
                this.f805s3fjYDxWOUexjjVgyA.f796HJFh0TGMpafqLE9haL.sTkWmhpZ5b1ArQIw4K(e);
            }
        } catch (Exception e2) {
            this.f805s3fjYDxWOUexjjVgyA.f796HJFh0TGMpafqLE9haL.sTkWmhpZ5b1ArQIw4K(e2);
        }
    }
}
