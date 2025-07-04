package TZ2u8Z18RnXun7OSW0;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class THTDvPxsHqMeGb512f implements Executor {

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final Logger f1579KYHag8HRDlnO3X9zmZ = Logger.getLogger(THTDvPxsHqMeGb512f.class.getName());

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Executor f1582lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Deque f1583s3fjYDxWOUexjjVgyA = new ArrayDeque();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f1580HJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL.IDLE;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public long f1584zZKhbgvUfsK4AEX3r0 = 0;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f1581husNiw3snxdgZPAGJm = new s3fjYDxWOUexjjVgyA(this, null);

    public enum HJFh0TGMpafqLE9haL {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public class lEeR5KfoEr4xU5yHH7 implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ Runnable f1590lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(Runnable runnable) {
            this.f1590lEeR5KfoEr4xU5yHH7 = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1590lEeR5KfoEr4xU5yHH7.run();
        }

        public String toString() {
            return this.f1590lEeR5KfoEr4xU5yHH7.toString();
        }
    }

    public final class s3fjYDxWOUexjjVgyA implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public Runnable f1592lEeR5KfoEr4xU5yHH7;

        public s3fjYDxWOUexjjVgyA() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r8.f1592lEeR5KfoEr4xU5yHH7.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        
            TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.f1579KYHag8HRDlnO3X9zmZ.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f1592lEeR5KfoEr4xU5yHH7, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        
            r8.f1592lEeR5KfoEr4xU5yHH7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void lEeR5KfoEr4xU5yHH7() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f r2 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.this     // Catch: java.lang.Throwable -> L5e
                java.util.Deque r2 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.lEeR5KfoEr4xU5yHH7(r2)     // Catch: java.lang.Throwable -> L5e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
                if (r0 != 0) goto L2d
                TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f r0 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.this     // Catch: java.lang.Throwable -> L20
                TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$HJFh0TGMpafqLE9haL r0 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA(r0)     // Catch: java.lang.Throwable -> L20
                TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$HJFh0TGMpafqLE9haL r3 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                r0 = move-exception
                goto L83
            L22:
                TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f r0 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.this     // Catch: java.lang.Throwable -> L20
                TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.zZKhbgvUfsK4AEX3r0(r0)     // Catch: java.lang.Throwable -> L20
                TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f r0 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.this     // Catch: java.lang.Throwable -> L20
                TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f r3 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.lEeR5KfoEr4xU5yHH7(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f1592lEeR5KfoEr4xU5yHH7 = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L4f
                TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f r0 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.this     // Catch: java.lang.Throwable -> L20
                TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$HJFh0TGMpafqLE9haL r3 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL.IDLE     // Catch: java.lang.Throwable -> L20
                TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L4e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4e:
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f1592lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
                r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            L5b:
                r8.f1592lEeR5KfoEr4xU5yHH7 = r2     // Catch: java.lang.Throwable -> L5e
                goto L2
            L5e:
                r0 = move-exception
                goto L85
            L60:
                r0 = move-exception
                goto L80
            L62:
                r3 = move-exception
                java.util.logging.Logger r4 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.husNiw3snxdgZPAGJm()     // Catch: java.lang.Throwable -> L60
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r6.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.Runnable r7 = r8.f1592lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Throwable -> L60
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
                goto L5b
            L80:
                r8.f1592lEeR5KfoEr4xU5yHH7 = r2     // Catch: java.lang.Throwable -> L5e
                throw r0     // Catch: java.lang.Throwable -> L5e
            L83:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L5e
            L85:
                if (r1 == 0) goto L8e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                lEeR5KfoEr4xU5yHH7();
            } catch (Error e) {
                synchronized (THTDvPxsHqMeGb512f.this.f1583s3fjYDxWOUexjjVgyA) {
                    THTDvPxsHqMeGb512f.this.f1580HJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f1592lEeR5KfoEr4xU5yHH7;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + THTDvPxsHqMeGb512f.this.f1580HJFh0TGMpafqLE9haL + "}";
        }

        public /* synthetic */ s3fjYDxWOUexjjVgyA(THTDvPxsHqMeGb512f tHTDvPxsHqMeGb512f, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this();
        }
    }

    public THTDvPxsHqMeGb512f(Executor executor) {
        this.f1582lEeR5KfoEr4xU5yHH7 = (Executor) HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(executor);
    }

    public static /* synthetic */ long zZKhbgvUfsK4AEX3r0(THTDvPxsHqMeGb512f tHTDvPxsHqMeGb512f) {
        long j = tHTDvPxsHqMeGb512f.f1584zZKhbgvUfsK4AEX3r0;
        tHTDvPxsHqMeGb512f.f1584zZKhbgvUfsK4AEX3r0 = 1 + j;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(r8)
            java.util.Deque r0 = r7.f1583s3fjYDxWOUexjjVgyA
            monitor-enter(r0)
            TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$HJFh0TGMpafqLE9haL r1 = r7.f1580HJFh0TGMpafqLE9haL     // Catch: java.lang.Throwable -> L6d
            TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$HJFh0TGMpafqLE9haL r2 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$HJFh0TGMpafqLE9haL r2 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f1584zZKhbgvUfsK4AEX3r0     // Catch: java.lang.Throwable -> L6d
            TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$lEeR5KfoEr4xU5yHH7 r1 = new TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque r8 = r7.f1583s3fjYDxWOUexjjVgyA     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$HJFh0TGMpafqLE9haL r8 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f1580HJFh0TGMpafqLE9haL = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f1582lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$s3fjYDxWOUexjjVgyA r5 = r7.f1581husNiw3snxdgZPAGJm     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$HJFh0TGMpafqLE9haL r0 = r7.f1580HJFh0TGMpafqLE9haL
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque r0 = r7.f1583s3fjYDxWOUexjjVgyA
            monitor-enter(r0)
            long r5 = r7.f1584zZKhbgvUfsK4AEX3r0     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$HJFh0TGMpafqLE9haL r1 = r7.f1580HJFh0TGMpafqLE9haL     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f1580HJFh0TGMpafqLE9haL = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque r2 = r7.f1583s3fjYDxWOUexjjVgyA
            monitor-enter(r2)
            TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$HJFh0TGMpafqLE9haL r0 = r7.f1580HJFh0TGMpafqLE9haL     // Catch: java.lang.Throwable -> L55
            TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$HJFh0TGMpafqLE9haL r3 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f$HJFh0TGMpafqLE9haL r3 = TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque r0 = r7.f1583s3fjYDxWOUexjjVgyA     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque r1 = r7.f1583s3fjYDxWOUexjjVgyA     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: TZ2u8Z18RnXun7OSW0.THTDvPxsHqMeGb512f.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f1582lEeR5KfoEr4xU5yHH7 + "}";
    }
}
