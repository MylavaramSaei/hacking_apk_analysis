package fLSSbwbzFBVpwBH5FM;

import android.app.job.JobInfo;
import fLSSbwbzFBVpwBH5FM.HJFh0TGMpafqLE9haL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class KYHag8HRDlnO3X9zmZ {

    public enum HJFh0TGMpafqLE9haL {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 f5903lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public Map f5904s3fjYDxWOUexjjVgyA = new HashMap();

        public lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this.f5903lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
            return this;
        }

        public lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7(ctWLFN70QQINH1kyYo.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            this.f5904s3fjYDxWOUexjjVgyA.put(husniw3snxdgzpagjm, s3fjydxwouexjjvgya);
            return this;
        }

        public KYHag8HRDlnO3X9zmZ s3fjYDxWOUexjjVgyA() {
            if (this.f5903lEeR5KfoEr4xU5yHH7 == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f5904s3fjYDxWOUexjjVgyA.keySet().size() < ctWLFN70QQINH1kyYo.husNiw3snxdgZPAGJm.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f5904s3fjYDxWOUexjjVgyA;
            this.f5904s3fjYDxWOUexjjVgyA = new HashMap();
            return KYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0(this.f5903lEeR5KfoEr4xU5yHH7, map);
        }
    }

    public static abstract class s3fjYDxWOUexjjVgyA {

        public static abstract class lEeR5KfoEr4xU5yHH7 {
            public abstract lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(Set set);

            public abstract s3fjYDxWOUexjjVgyA lEeR5KfoEr4xU5yHH7();

            public abstract lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA(long j);

            public abstract lEeR5KfoEr4xU5yHH7 zZKhbgvUfsK4AEX3r0(long j);
        }

        public static lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7() {
            return new HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA().HJFh0TGMpafqLE9haL(Collections.emptySet());
        }

        public abstract Set HJFh0TGMpafqLE9haL();

        public abstract long s3fjYDxWOUexjjVgyA();

        public abstract long zZKhbgvUfsK4AEX3r0();
    }

    public static KYHag8HRDlnO3X9zmZ KYHag8HRDlnO3X9zmZ(O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        return s3fjYDxWOUexjjVgyA().lEeR5KfoEr4xU5yHH7(ctWLFN70QQINH1kyYo.husNiw3snxdgZPAGJm.DEFAULT, s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7().s3fjYDxWOUexjjVgyA(30000L).zZKhbgvUfsK4AEX3r0(86400000L).lEeR5KfoEr4xU5yHH7()).lEeR5KfoEr4xU5yHH7(ctWLFN70QQINH1kyYo.husNiw3snxdgZPAGJm.HIGHEST, s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7().s3fjYDxWOUexjjVgyA(1000L).zZKhbgvUfsK4AEX3r0(86400000L).lEeR5KfoEr4xU5yHH7()).lEeR5KfoEr4xU5yHH7(ctWLFN70QQINH1kyYo.husNiw3snxdgZPAGJm.VERY_LOW, s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7().s3fjYDxWOUexjjVgyA(86400000L).zZKhbgvUfsK4AEX3r0(86400000L).HJFh0TGMpafqLE9haL(pbVGzGjWvY2LDXC8vo(HJFh0TGMpafqLE9haL.DEVICE_IDLE)).lEeR5KfoEr4xU5yHH7()).HJFh0TGMpafqLE9haL(leer5kfoer4xu5yhh7).s3fjYDxWOUexjjVgyA();
    }

    public static Set pbVGzGjWvY2LDXC8vo(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public static lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA() {
        return new lEeR5KfoEr4xU5yHH7();
    }

    public static KYHag8HRDlnO3X9zmZ zZKhbgvUfsK4AEX3r0(O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Map map) {
        return new fLSSbwbzFBVpwBH5FM.s3fjYDxWOUexjjVgyA(leer5kfoer4xu5yhh7, map);
    }

    public final void Acstmh57AKoSEkEFNJ(JobInfo.Builder builder, Set set) {
        if (set.contains(HJFh0TGMpafqLE9haL.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(HJFh0TGMpafqLE9haL.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(HJFh0TGMpafqLE9haL.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder HJFh0TGMpafqLE9haL(JobInfo.Builder builder, ctWLFN70QQINH1kyYo.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, long j, int i) {
        builder.setMinimumLatency(TCyPEKSzIyweCN5yp1(husniw3snxdgzpagjm, j, i));
        Acstmh57AKoSEkEFNJ(builder, ((s3fjYDxWOUexjjVgyA) IPyIQcaNa8aB7drBED().get(husniw3snxdgzpagjm)).HJFh0TGMpafqLE9haL());
        return builder;
    }

    public abstract Map IPyIQcaNa8aB7drBED();

    public long TCyPEKSzIyweCN5yp1(ctWLFN70QQINH1kyYo.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, long j, int i) {
        long jLEeR5KfoEr4xU5yHH7 = j - husNiw3snxdgZPAGJm().lEeR5KfoEr4xU5yHH7();
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) IPyIQcaNa8aB7drBED().get(husniw3snxdgzpagjm);
        return Math.min(Math.max(lEeR5KfoEr4xU5yHH7(i, s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA()), jLEeR5KfoEr4xU5yHH7), s3fjydxwouexjjvgya.zZKhbgvUfsK4AEX3r0());
    }

    public abstract O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 husNiw3snxdgZPAGJm();

    public final long lEeR5KfoEr4xU5yHH7(int i, long j) {
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * r7)));
    }
}
