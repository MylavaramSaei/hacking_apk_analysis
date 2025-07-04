package eWK41qw3g36LVd4UnS;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class T9PhQIpGRhE4yZDm1C implements Executor {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Executor f5692lEeR5KfoEr4xU5yHH7;

    public static class lEeR5KfoEr4xU5yHH7 implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Runnable f5693lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(Runnable runnable) {
            this.f5693lEeR5KfoEr4xU5yHH7 = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5693lEeR5KfoEr4xU5yHH7.run();
            } catch (Exception e) {
                ayduHasC7VpxsVXE0T.lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0("Executor", "Background execution failure.", e);
            }
        }
    }

    public T9PhQIpGRhE4yZDm1C(Executor executor) {
        this.f5692lEeR5KfoEr4xU5yHH7 = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5692lEeR5KfoEr4xU5yHH7.execute(new lEeR5KfoEr4xU5yHH7(runnable));
    }
}
