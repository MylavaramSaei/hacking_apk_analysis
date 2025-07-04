package JXsqbvi9UKxeF3HXpU;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class GyWRxpdt1T8mEJXPoD implements Runnable {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final /* synthetic */ OqIo5QF00RDxUQb4qq f767lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final /* synthetic */ Callable f768s3fjYDxWOUexjjVgyA;

    public GyWRxpdt1T8mEJXPoD(OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq, Callable callable) {
        this.f767lEeR5KfoEr4xU5yHH7 = oqIo5QF00RDxUQb4qq;
        this.f768s3fjYDxWOUexjjVgyA = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f767lEeR5KfoEr4xU5yHH7.Y43RdunnpKgpbny0lE(this.f768s3fjYDxWOUexjjVgyA.call());
        } catch (Exception e) {
            this.f767lEeR5KfoEr4xU5yHH7.sTkWmhpZ5b1ArQIw4K(e);
        } catch (Throwable th) {
            this.f767lEeR5KfoEr4xU5yHH7.sTkWmhpZ5b1ArQIw4K(new RuntimeException(th));
        }
    }
}
