package TZ2u8Z18RnXun7OSW0;

import TZ2u8Z18RnXun7OSW0.OANkd3mP6AYvwbNLJM;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class aPyGSIylzVNKPT1Bls implements ScheduledExecutorService {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ExecutorService f1597lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final ScheduledExecutorService f1598s3fjYDxWOUexjjVgyA;

    public aPyGSIylzVNKPT1Bls(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f1597lEeR5KfoEr4xU5yHH7 = executorService;
        this.f1598s3fjYDxWOUexjjVgyA = scheduledExecutorService;
    }

    public static /* synthetic */ void A49QRPHynYLCBN0SqP(Runnable runnable, OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        try {
            runnable.run();
        } catch (Exception e) {
            s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(e);
        }
    }

    public static /* synthetic */ void OANkd3mP6AYvwbNLJM(Callable callable, OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        try {
            s3fjydxwouexjjvgya.set(callable.call());
        } catch (Exception e) {
            s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(e);
        }
    }

    public static /* synthetic */ void T9PhQIpGRhE4yZDm1C(Runnable runnable, OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        try {
            runnable.run();
            s3fjydxwouexjjvgya.set(null);
        } catch (Exception e) {
            s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(e);
        }
    }

    public static /* synthetic */ void Y43RdunnpKgpbny0lE(Runnable runnable, OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) throws Exception {
        try {
            runnable.run();
        } catch (Exception e) {
            s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(e);
            throw e;
        }
    }

    public final /* synthetic */ ScheduledFuture G7AC3DWIx9i9fdanjk(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        return this.f1598s3fjYDxWOUexjjVgyA.scheduleAtFixedRate(new Runnable() { // from class: TZ2u8Z18RnXun7OSW0.pbVGzGjWvY2LDXC8vo
            @Override // java.lang.Runnable
            public final void run() {
                this.f1612lEeR5KfoEr4xU5yHH7.R9SAhYMerGybF9OAjL(runnable, s3fjydxwouexjjvgya);
            }
        }, j, j2, timeUnit);
    }

    public final /* synthetic */ ScheduledFuture LIMtzhnLwQyigzK0KO(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        return this.f1598s3fjYDxWOUexjjVgyA.scheduleWithFixedDelay(new Runnable() { // from class: TZ2u8Z18RnXun7OSW0.e54J8UWNHWALQNixXM
            @Override // java.lang.Runnable
            public final void run() {
                this.f1603lEeR5KfoEr4xU5yHH7.xHA29AmDt6y96AnB3t(runnable, s3fjydxwouexjjvgya);
            }
        }, j, j2, timeUnit);
    }

    public final /* synthetic */ void R9SAhYMerGybF9OAjL(final Runnable runnable, final OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f1597lEeR5KfoEr4xU5yHH7.execute(new Runnable() { // from class: TZ2u8Z18RnXun7OSW0.zZKhbgvUfsK4AEX3r0
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                aPyGSIylzVNKPT1Bls.Y43RdunnpKgpbny0lE(runnable, s3fjydxwouexjjvgya);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture aPyGSIylzVNKPT1Bls(final Runnable runnable, long j, TimeUnit timeUnit, final OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        return this.f1598s3fjYDxWOUexjjVgyA.schedule(new Runnable() { // from class: TZ2u8Z18RnXun7OSW0.Acstmh57AKoSEkEFNJ
            @Override // java.lang.Runnable
            public final void run() {
                this.f1555lEeR5KfoEr4xU5yHH7.hoXrIDAFrSwfShk8da(runnable, s3fjydxwouexjjvgya);
            }
        }, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f1597lEeR5KfoEr4xU5yHH7.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f1597lEeR5KfoEr4xU5yHH7.execute(runnable);
    }

    public final /* synthetic */ void hoXrIDAFrSwfShk8da(final Runnable runnable, final OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f1597lEeR5KfoEr4xU5yHH7.execute(new Runnable() { // from class: TZ2u8Z18RnXun7OSW0.T9PhQIpGRhE4yZDm1C
            @Override // java.lang.Runnable
            public final void run() {
                aPyGSIylzVNKPT1Bls.T9PhQIpGRhE4yZDm1C(runnable, s3fjydxwouexjjvgya);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f1597lEeR5KfoEr4xU5yHH7.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f1597lEeR5KfoEr4xU5yHH7.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f1597lEeR5KfoEr4xU5yHH7.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f1597lEeR5KfoEr4xU5yHH7.isTerminated();
    }

    public final /* synthetic */ ScheduledFuture sTkWmhpZ5b1ArQIw4K(final Callable callable, long j, TimeUnit timeUnit, final OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        return this.f1598s3fjYDxWOUexjjVgyA.schedule(new Callable() { // from class: TZ2u8Z18RnXun7OSW0.Z9WdNiOsPR0y54zHW4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f1595lEeR5KfoEr4xU5yHH7.zaq8hOURtfwbcX17cG(callable, s3fjydxwouexjjvgya);
            }
        }, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new OANkd3mP6AYvwbNLJM(new OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL() { // from class: TZ2u8Z18RnXun7OSW0.HJFh0TGMpafqLE9haL
            @Override // TZ2u8Z18RnXun7OSW0.OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL
            public final ScheduledFuture lEeR5KfoEr4xU5yHH7(OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
                return this.f1558lEeR5KfoEr4xU5yHH7.aPyGSIylzVNKPT1Bls(runnable, j, timeUnit, s3fjydxwouexjjvgya);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new OANkd3mP6AYvwbNLJM(new OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL() { // from class: TZ2u8Z18RnXun7OSW0.KYHag8HRDlnO3X9zmZ
            @Override // TZ2u8Z18RnXun7OSW0.OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL
            public final ScheduledFuture lEeR5KfoEr4xU5yHH7(OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
                return this.f1567lEeR5KfoEr4xU5yHH7.G7AC3DWIx9i9fdanjk(runnable, j, j2, timeUnit, s3fjydxwouexjjvgya);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new OANkd3mP6AYvwbNLJM(new OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL() { // from class: TZ2u8Z18RnXun7OSW0.TCyPEKSzIyweCN5yp1
            @Override // TZ2u8Z18RnXun7OSW0.OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL
            public final ScheduledFuture lEeR5KfoEr4xU5yHH7(OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
                return this.f1576lEeR5KfoEr4xU5yHH7.LIMtzhnLwQyigzK0KO(runnable, j, j2, timeUnit, s3fjydxwouexjjvgya);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f1597lEeR5KfoEr4xU5yHH7.submit(runnable);
    }

    public final /* synthetic */ void xHA29AmDt6y96AnB3t(final Runnable runnable, final OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f1597lEeR5KfoEr4xU5yHH7.execute(new Runnable() { // from class: TZ2u8Z18RnXun7OSW0.husNiw3snxdgZPAGJm
            @Override // java.lang.Runnable
            public final void run() {
                aPyGSIylzVNKPT1Bls.A49QRPHynYLCBN0SqP(runnable, s3fjydxwouexjjvgya);
            }
        });
    }

    public final /* synthetic */ Future zaq8hOURtfwbcX17cG(final Callable callable, final OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        return this.f1597lEeR5KfoEr4xU5yHH7.submit(new Runnable() { // from class: TZ2u8Z18RnXun7OSW0.hoXrIDAFrSwfShk8da
            @Override // java.lang.Runnable
            public final void run() {
                aPyGSIylzVNKPT1Bls.OANkd3mP6AYvwbNLJM(callable, s3fjydxwouexjjvgya);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f1597lEeR5KfoEr4xU5yHH7.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f1597lEeR5KfoEr4xU5yHH7.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j, final TimeUnit timeUnit) {
        return new OANkd3mP6AYvwbNLJM(new OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL() { // from class: TZ2u8Z18RnXun7OSW0.IPyIQcaNa8aB7drBED
            @Override // TZ2u8Z18RnXun7OSW0.OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL
            public final ScheduledFuture lEeR5KfoEr4xU5yHH7(OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
                return this.f1562lEeR5KfoEr4xU5yHH7.sTkWmhpZ5b1ArQIw4K(callable, j, timeUnit, s3fjydxwouexjjvgya);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f1597lEeR5KfoEr4xU5yHH7.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f1597lEeR5KfoEr4xU5yHH7.submit(callable);
    }
}
