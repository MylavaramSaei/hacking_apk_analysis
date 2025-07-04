package ADbagDwlO3sAb2p0ry;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class HJFh0TGMpafqLE9haL extends s3fjYDxWOUexjjVgyA {

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final Executor f48KYHag8HRDlnO3X9zmZ;

    public HJFh0TGMpafqLE9haL(Executor executor) {
        this.f48KYHag8HRDlnO3X9zmZ = executor;
        njV42vQJoqlfw05NNQ.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(husNiw3snxdgZPAGJm());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm();
        ExecutorService executorService = executorHusNiw3snxdgZPAGJm instanceof ExecutorService ? (ExecutorService) executorHusNiw3snxdgZPAGJm : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof HJFh0TGMpafqLE9haL) && ((HJFh0TGMpafqLE9haL) obj).husNiw3snxdgZPAGJm() == husNiw3snxdgZPAGJm();
    }

    public int hashCode() {
        return System.identityHashCode(husNiw3snxdgZPAGJm());
    }

    public Executor husNiw3snxdgZPAGJm() {
        return this.f48KYHag8HRDlnO3X9zmZ;
    }

    public String toString() {
        return husNiw3snxdgZPAGJm().toString();
    }
}
