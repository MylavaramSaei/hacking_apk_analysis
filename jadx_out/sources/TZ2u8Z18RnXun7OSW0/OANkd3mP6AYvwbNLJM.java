package TZ2u8Z18RnXun7OSW0;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class OANkd3mP6AYvwbNLJM extends e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7 implements ScheduledFuture {

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final ScheduledFuture f1570IPyIQcaNa8aB7drBED;

    public interface HJFh0TGMpafqLE9haL {
        ScheduledFuture lEeR5KfoEr4xU5yHH7(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya);
    }

    public class lEeR5KfoEr4xU5yHH7 implements s3fjYDxWOUexjjVgyA {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // TZ2u8Z18RnXun7OSW0.OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA
        public void lEeR5KfoEr4xU5yHH7(Throwable th) {
            OANkd3mP6AYvwbNLJM.this.aPyGSIylzVNKPT1Bls(th);
        }

        @Override // TZ2u8Z18RnXun7OSW0.OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA
        public void set(Object obj) {
            OANkd3mP6AYvwbNLJM.this.hoXrIDAFrSwfShk8da(obj);
        }
    }

    public interface s3fjYDxWOUexjjVgyA {
        void lEeR5KfoEr4xU5yHH7(Throwable th);

        void set(Object obj);
    }

    public OANkd3mP6AYvwbNLJM(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        this.f1570IPyIQcaNa8aB7drBED = hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(new lEeR5KfoEr4xU5yHH7());
    }

    @Override // java.lang.Comparable
    /* renamed from: R9SAhYMerGybF9OAjL, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f1570IPyIQcaNa8aB7drBED.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f1570IPyIQcaNa8aB7drBED.getDelay(timeUnit);
    }

    @Override // e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7
    public void s3fjYDxWOUexjjVgyA() {
        this.f1570IPyIQcaNa8aB7drBED.cancel(zaq8hOURtfwbcX17cG());
    }
}
