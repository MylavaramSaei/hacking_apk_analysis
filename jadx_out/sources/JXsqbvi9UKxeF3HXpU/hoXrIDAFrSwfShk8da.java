package JXsqbvi9UKxeF3HXpU;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hoXrIDAFrSwfShk8da implements aPyGSIylzVNKPT1Bls {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final CountDownLatch f803lEeR5KfoEr4xU5yHH7 = new CountDownLatch(1);

    public /* synthetic */ hoXrIDAFrSwfShk8da(T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C) {
    }

    @Override // JXsqbvi9UKxeF3HXpU.husNiw3snxdgZPAGJm
    public final void HJFh0TGMpafqLE9haL(Exception exc) {
        this.f803lEeR5KfoEr4xU5yHH7.countDown();
    }

    public final boolean husNiw3snxdgZPAGJm(long j, TimeUnit timeUnit) {
        return this.f803lEeR5KfoEr4xU5yHH7.await(j, timeUnit);
    }

    public final void lEeR5KfoEr4xU5yHH7() throws InterruptedException {
        this.f803lEeR5KfoEr4xU5yHH7.await();
    }

    @Override // JXsqbvi9UKxeF3HXpU.HJFh0TGMpafqLE9haL
    public final void s3fjYDxWOUexjjVgyA() {
        this.f803lEeR5KfoEr4xU5yHH7.countDown();
    }

    @Override // JXsqbvi9UKxeF3HXpU.KYHag8HRDlnO3X9zmZ
    public final void zZKhbgvUfsK4AEX3r0(Object obj) {
        this.f803lEeR5KfoEr4xU5yHH7.countDown();
    }
}
