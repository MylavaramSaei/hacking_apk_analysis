package SF66oTSCsXABfwyWiU;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class aPyGSIylzVNKPT1Bls {
    public static ScheduledExecutorService HJFh0TGMpafqLE9haL() {
        return new ScheduledThreadPoolExecutor(1, new vlBaBOcZ1q1ndWVoXn.lEeR5KfoEr4xU5yHH7("Firebase-Messaging-Init"));
    }

    public static ExecutorService KYHag8HRDlnO3X9zmZ() {
        return Executors.newSingleThreadExecutor(new vlBaBOcZ1q1ndWVoXn.lEeR5KfoEr4xU5yHH7("Firebase-Messaging-Task"));
    }

    public static ScheduledExecutorService TCyPEKSzIyweCN5yp1() {
        return new ScheduledThreadPoolExecutor(1, new vlBaBOcZ1q1ndWVoXn.lEeR5KfoEr4xU5yHH7("Firebase-Messaging-Topics-Io"));
    }

    public static ExecutorService husNiw3snxdgZPAGJm() {
        return Executors.newSingleThreadExecutor(new vlBaBOcZ1q1ndWVoXn.lEeR5KfoEr4xU5yHH7("Firebase-Messaging-Network-Io"));
    }

    public static Executor lEeR5KfoEr4xU5yHH7(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new vlBaBOcZ1q1ndWVoXn.lEeR5KfoEr4xU5yHH7(str));
    }

    public static Executor s3fjYDxWOUexjjVgyA() {
        return lEeR5KfoEr4xU5yHH7("Firebase-Messaging-File-Io");
    }

    public static ExecutorService zZKhbgvUfsK4AEX3r0() {
        return X3J0rTi7qZISiATDQK.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7().lEeR5KfoEr4xU5yHH7(new vlBaBOcZ1q1ndWVoXn.lEeR5KfoEr4xU5yHH7("Firebase-Messaging-Intent-Handle"), X3J0rTi7qZISiATDQK.HJFh0TGMpafqLE9haL.HIGH_SPEED);
    }
}
