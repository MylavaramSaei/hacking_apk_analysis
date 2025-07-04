package com.google.firebase.concurrent;

import TZ2u8Z18RnXun7OSW0.aPyGSIylzVNKPT1Bls;
import TZ2u8Z18RnXun7OSW0.ao3wqKm5CXFuvC0q47;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import dvmHGYHwlE2ean7ktb.lEeR5KfoEr4xU5yHH7;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA;
import zWzrlx9vIdLp7FoEMD.HJFh0TGMpafqLE9haL;
import zWzrlx9vIdLp7FoEMD.LIMtzhnLwQyigzK0KO;
import zWzrlx9vIdLp7FoEMD.TCyPEKSzIyweCN5yp1;
import zWzrlx9vIdLp7FoEMD.jCtUeU2YI1poCxWcjm;
import zWzrlx9vIdLp7FoEMD.zZKhbgvUfsK4AEX3r0;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final LIMtzhnLwQyigzK0KO f5512lEeR5KfoEr4xU5yHH7 = new LIMtzhnLwQyigzK0KO(new s3fjYDxWOUexjjVgyA() { // from class: TZ2u8Z18RnXun7OSW0.sTkWmhpZ5b1ArQIw4K
        @Override // xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA
        public final Object get() {
            return ExecutorsRegistrar.OANkd3mP6AYvwbNLJM();
        }
    });

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final LIMtzhnLwQyigzK0KO f5513s3fjYDxWOUexjjVgyA = new LIMtzhnLwQyigzK0KO(new s3fjYDxWOUexjjVgyA() { // from class: TZ2u8Z18RnXun7OSW0.Y43RdunnpKgpbny0lE
        @Override // xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA
        public final Object get() {
            return ExecutorsRegistrar.zaq8hOURtfwbcX17cG();
        }
    });

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final LIMtzhnLwQyigzK0KO f5511HJFh0TGMpafqLE9haL = new LIMtzhnLwQyigzK0KO(new s3fjYDxWOUexjjVgyA() { // from class: TZ2u8Z18RnXun7OSW0.R9SAhYMerGybF9OAjL
        @Override // xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA
        public final Object get() {
            return ExecutorsRegistrar.sTkWmhpZ5b1ArQIw4K();
        }
    });

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final LIMtzhnLwQyigzK0KO f5514zZKhbgvUfsK4AEX3r0 = new LIMtzhnLwQyigzK0KO(new s3fjYDxWOUexjjVgyA() { // from class: TZ2u8Z18RnXun7OSW0.G7AC3DWIx9i9fdanjk
        @Override // xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA
        public final Object get() {
            return ExecutorsRegistrar.Y43RdunnpKgpbny0lE();
        }
    });

    public static ThreadFactory Acstmh57AKoSEkEFNJ(String str, int i) {
        return new TZ2u8Z18RnXun7OSW0.s3fjYDxWOUexjjVgyA(str, i, null);
    }

    public static ScheduledExecutorService G7AC3DWIx9i9fdanjk(ExecutorService executorService) {
        return new aPyGSIylzVNKPT1Bls(executorService, (ScheduledExecutorService) f5514zZKhbgvUfsK4AEX3r0.get());
    }

    public static /* synthetic */ ScheduledExecutorService OANkd3mP6AYvwbNLJM() {
        return G7AC3DWIx9i9fdanjk(Executors.newFixedThreadPool(4, Z9WdNiOsPR0y54zHW4("Firebase Background", 10, pbVGzGjWvY2LDXC8vo())));
    }

    public static StrictMode.ThreadPolicy R9SAhYMerGybF9OAjL() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static /* synthetic */ ScheduledExecutorService T9PhQIpGRhE4yZDm1C(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        return (ScheduledExecutorService) f5511HJFh0TGMpafqLE9haL.get();
    }

    public static /* synthetic */ ScheduledExecutorService Y43RdunnpKgpbny0lE() {
        return Executors.newSingleThreadScheduledExecutor(Acstmh57AKoSEkEFNJ("Firebase Scheduler", 0));
    }

    public static ThreadFactory Z9WdNiOsPR0y54zHW4(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new TZ2u8Z18RnXun7OSW0.s3fjYDxWOUexjjVgyA(str, i, threadPolicy);
    }

    public static /* synthetic */ Executor aPyGSIylzVNKPT1Bls(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        return ao3wqKm5CXFuvC0q47.INSTANCE;
    }

    public static /* synthetic */ ScheduledExecutorService e54J8UWNHWALQNixXM(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        return (ScheduledExecutorService) f5512lEeR5KfoEr4xU5yHH7.get();
    }

    public static /* synthetic */ ScheduledExecutorService hoXrIDAFrSwfShk8da(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        return (ScheduledExecutorService) f5513s3fjYDxWOUexjjVgyA.get();
    }

    public static StrictMode.ThreadPolicy pbVGzGjWvY2LDXC8vo() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    public static /* synthetic */ ScheduledExecutorService sTkWmhpZ5b1ArQIw4K() {
        return G7AC3DWIx9i9fdanjk(Executors.newCachedThreadPool(Acstmh57AKoSEkEFNJ("Firebase Blocking", 11)));
    }

    public static /* synthetic */ ScheduledExecutorService zaq8hOURtfwbcX17cG() {
        return G7AC3DWIx9i9fdanjk(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), Z9WdNiOsPR0y54zHW4("Firebase Lite", 0, R9SAhYMerGybF9OAjL())));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7.class, ScheduledExecutorService.class), jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7.class, ExecutorService.class), jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7.class, Executor.class)).husNiw3snxdgZPAGJm(new TCyPEKSzIyweCN5yp1() { // from class: TZ2u8Z18RnXun7OSW0.xHA29AmDt6y96AnB3t
            @Override // zWzrlx9vIdLp7FoEMD.TCyPEKSzIyweCN5yp1
            public final Object lEeR5KfoEr4xU5yHH7(zWzrlx9vIdLp7FoEMD.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
                return ExecutorsRegistrar.e54J8UWNHWALQNixXM(zzkhbgvufsk4aex3r0);
            }
        }).zZKhbgvUfsK4AEX3r0(), HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(dvmHGYHwlE2ean7ktb.s3fjYDxWOUexjjVgyA.class, ScheduledExecutorService.class), jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(dvmHGYHwlE2ean7ktb.s3fjYDxWOUexjjVgyA.class, ExecutorService.class), jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(dvmHGYHwlE2ean7ktb.s3fjYDxWOUexjjVgyA.class, Executor.class)).husNiw3snxdgZPAGJm(new TCyPEKSzIyweCN5yp1() { // from class: TZ2u8Z18RnXun7OSW0.LIMtzhnLwQyigzK0KO
            @Override // zWzrlx9vIdLp7FoEMD.TCyPEKSzIyweCN5yp1
            public final Object lEeR5KfoEr4xU5yHH7(zWzrlx9vIdLp7FoEMD.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
                return ExecutorsRegistrar.T9PhQIpGRhE4yZDm1C(zzkhbgvufsk4aex3r0);
            }
        }).zZKhbgvUfsK4AEX3r0(), HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(dvmHGYHwlE2ean7ktb.HJFh0TGMpafqLE9haL.class, ScheduledExecutorService.class), jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(dvmHGYHwlE2ean7ktb.HJFh0TGMpafqLE9haL.class, ExecutorService.class), jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(dvmHGYHwlE2ean7ktb.HJFh0TGMpafqLE9haL.class, Executor.class)).husNiw3snxdgZPAGJm(new TCyPEKSzIyweCN5yp1() { // from class: TZ2u8Z18RnXun7OSW0.A49QRPHynYLCBN0SqP
            @Override // zWzrlx9vIdLp7FoEMD.TCyPEKSzIyweCN5yp1
            public final Object lEeR5KfoEr4xU5yHH7(zWzrlx9vIdLp7FoEMD.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
                return ExecutorsRegistrar.hoXrIDAFrSwfShk8da(zzkhbgvufsk4aex3r0);
            }
        }).zZKhbgvUfsK4AEX3r0(), HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(dvmHGYHwlE2ean7ktb.zZKhbgvUfsK4AEX3r0.class, Executor.class)).husNiw3snxdgZPAGJm(new TCyPEKSzIyweCN5yp1() { // from class: TZ2u8Z18RnXun7OSW0.VItLRw50eXTZeEfGl0
            @Override // zWzrlx9vIdLp7FoEMD.TCyPEKSzIyweCN5yp1
            public final Object lEeR5KfoEr4xU5yHH7(zWzrlx9vIdLp7FoEMD.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
                return ExecutorsRegistrar.aPyGSIylzVNKPT1Bls(zzkhbgvufsk4aex3r0);
            }
        }).zZKhbgvUfsK4AEX3r0());
    }
}
