package e54J8UWNHWALQNixXM;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 implements Future {

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final s3fjYDxWOUexjjVgyA f5624KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static final Object f5625TCyPEKSzIyweCN5yp1;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public volatile IPyIQcaNa8aB7drBED f5628HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public volatile Object f5629lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public volatile husNiw3snxdgZPAGJm f5630s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final boolean f5627zZKhbgvUfsK4AEX3r0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final Logger f5626husNiw3snxdgZPAGJm = Logger.getLogger(lEeR5KfoEr4xU5yHH7.class.getName());

    public static final class HJFh0TGMpafqLE9haL {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public static final HJFh0TGMpafqLE9haL f5631HJFh0TGMpafqLE9haL;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public static final HJFh0TGMpafqLE9haL f5632zZKhbgvUfsK4AEX3r0;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final boolean f5633lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Throwable f5634s3fjYDxWOUexjjVgyA;

        static {
            if (lEeR5KfoEr4xU5yHH7.f5627zZKhbgvUfsK4AEX3r0) {
                f5632zZKhbgvUfsK4AEX3r0 = null;
                f5631HJFh0TGMpafqLE9haL = null;
            } else {
                f5632zZKhbgvUfsK4AEX3r0 = new HJFh0TGMpafqLE9haL(false, null);
                f5631HJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL(true, null);
            }
        }

        public HJFh0TGMpafqLE9haL(boolean z, Throwable th) {
            this.f5633lEeR5KfoEr4xU5yHH7 = z;
            this.f5634s3fjYDxWOUexjjVgyA = th;
        }
    }

    public static final class IPyIQcaNa8aB7drBED {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public static final IPyIQcaNa8aB7drBED f5635HJFh0TGMpafqLE9haL = new IPyIQcaNa8aB7drBED(false);

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public volatile Thread f5636lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public volatile IPyIQcaNa8aB7drBED f5637s3fjYDxWOUexjjVgyA;

        public IPyIQcaNa8aB7drBED() {
            lEeR5KfoEr4xU5yHH7.f5624KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm(this, Thread.currentThread());
        }

        public void lEeR5KfoEr4xU5yHH7(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED) {
            lEeR5KfoEr4xU5yHH7.f5624KYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0(this, iPyIQcaNa8aB7drBED);
        }

        public void s3fjYDxWOUexjjVgyA() {
            Thread thread = this.f5636lEeR5KfoEr4xU5yHH7;
            if (thread != null) {
                this.f5636lEeR5KfoEr4xU5yHH7 = null;
                LockSupport.unpark(thread);
            }
        }

        public IPyIQcaNa8aB7drBED(boolean z) {
        }
    }

    public static final class KYHag8HRDlnO3X9zmZ extends s3fjYDxWOUexjjVgyA {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f5638HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f5639husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f5640lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f5641s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f5642zZKhbgvUfsK4AEX3r0;

        public KYHag8HRDlnO3X9zmZ(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f5640lEeR5KfoEr4xU5yHH7 = atomicReferenceFieldUpdater;
            this.f5641s3fjYDxWOUexjjVgyA = atomicReferenceFieldUpdater2;
            this.f5638HJFh0TGMpafqLE9haL = atomicReferenceFieldUpdater3;
            this.f5642zZKhbgvUfsK4AEX3r0 = atomicReferenceFieldUpdater4;
            this.f5639husNiw3snxdgZPAGJm = atomicReferenceFieldUpdater5;
        }

        @Override // e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public boolean HJFh0TGMpafqLE9haL(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED2) {
            return e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f5638HJFh0TGMpafqLE9haL, leer5kfoer4xu5yhh7, iPyIQcaNa8aB7drBED, iPyIQcaNa8aB7drBED2);
        }

        @Override // e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public void husNiw3snxdgZPAGJm(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, Thread thread) {
            this.f5640lEeR5KfoEr4xU5yHH7.lazySet(iPyIQcaNa8aB7drBED, thread);
        }

        @Override // e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public boolean lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, husNiw3snxdgZPAGJm husniw3snxdgzpagjm, husNiw3snxdgZPAGJm husniw3snxdgzpagjm2) {
            return e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f5642zZKhbgvUfsK4AEX3r0, leer5kfoer4xu5yhh7, husniw3snxdgzpagjm, husniw3snxdgzpagjm2);
        }

        @Override // e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public boolean s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Object obj, Object obj2) {
            return e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f5639husNiw3snxdgZPAGJm, leer5kfoer4xu5yhh7, obj, obj2);
        }

        @Override // e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public void zZKhbgvUfsK4AEX3r0(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED2) {
            this.f5641s3fjYDxWOUexjjVgyA.lazySet(iPyIQcaNa8aB7drBED, iPyIQcaNa8aB7drBED2);
        }
    }

    public static final class TCyPEKSzIyweCN5yp1 extends s3fjYDxWOUexjjVgyA {
        public TCyPEKSzIyweCN5yp1() {
            super();
        }

        @Override // e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public boolean HJFh0TGMpafqLE9haL(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED2) {
            synchronized (leer5kfoer4xu5yhh7) {
                try {
                    if (leer5kfoer4xu5yhh7.f5628HJFh0TGMpafqLE9haL != iPyIQcaNa8aB7drBED) {
                        return false;
                    }
                    leer5kfoer4xu5yhh7.f5628HJFh0TGMpafqLE9haL = iPyIQcaNa8aB7drBED2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public void husNiw3snxdgZPAGJm(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, Thread thread) {
            iPyIQcaNa8aB7drBED.f5636lEeR5KfoEr4xU5yHH7 = thread;
        }

        @Override // e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public boolean lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, husNiw3snxdgZPAGJm husniw3snxdgzpagjm, husNiw3snxdgZPAGJm husniw3snxdgzpagjm2) {
            synchronized (leer5kfoer4xu5yhh7) {
                try {
                    if (leer5kfoer4xu5yhh7.f5630s3fjYDxWOUexjjVgyA != husniw3snxdgzpagjm) {
                        return false;
                    }
                    leer5kfoer4xu5yhh7.f5630s3fjYDxWOUexjjVgyA = husniw3snxdgzpagjm2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public boolean s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Object obj, Object obj2) {
            synchronized (leer5kfoer4xu5yhh7) {
                try {
                    if (leer5kfoer4xu5yhh7.f5629lEeR5KfoEr4xU5yHH7 != obj) {
                        return false;
                    }
                    leer5kfoer4xu5yhh7.f5629lEeR5KfoEr4xU5yHH7 = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public void zZKhbgvUfsK4AEX3r0(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED2) {
            iPyIQcaNa8aB7drBED.f5637s3fjYDxWOUexjjVgyA = iPyIQcaNa8aB7drBED2;
        }
    }

    public static final class husNiw3snxdgZPAGJm {

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public static final husNiw3snxdgZPAGJm f5643zZKhbgvUfsK4AEX3r0 = new husNiw3snxdgZPAGJm(null, null);

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public husNiw3snxdgZPAGJm f5644HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Runnable f5645lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Executor f5646s3fjYDxWOUexjjVgyA;

        public husNiw3snxdgZPAGJm(Runnable runnable, Executor executor) {
            this.f5645lEeR5KfoEr4xU5yHH7 = runnable;
            this.f5646s3fjYDxWOUexjjVgyA = executor;
        }
    }

    public static abstract class s3fjYDxWOUexjjVgyA {
        public s3fjYDxWOUexjjVgyA() {
        }

        public abstract boolean HJFh0TGMpafqLE9haL(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED2);

        public abstract void husNiw3snxdgZPAGJm(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, Thread thread);

        public abstract boolean lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, husNiw3snxdgZPAGJm husniw3snxdgzpagjm, husNiw3snxdgZPAGJm husniw3snxdgzpagjm2);

        public abstract boolean s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Object obj, Object obj2);

        public abstract void zZKhbgvUfsK4AEX3r0(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED2);
    }

    public static final class zZKhbgvUfsK4AEX3r0 {

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public static final zZKhbgvUfsK4AEX3r0 f5647s3fjYDxWOUexjjVgyA = new zZKhbgvUfsK4AEX3r0(new C0087lEeR5KfoEr4xU5yHH7("Failure occurred while trying to finish a future."));

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Throwable f5648lEeR5KfoEr4xU5yHH7;

        /* renamed from: e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7$zZKhbgvUfsK4AEX3r0$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
        public class C0087lEeR5KfoEr4xU5yHH7 extends Throwable {
            public C0087lEeR5KfoEr4xU5yHH7(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public zZKhbgvUfsK4AEX3r0(Throwable th) {
            this.f5648lEeR5KfoEr4xU5yHH7 = (Throwable) lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(th);
        }
    }

    static {
        s3fjYDxWOUexjjVgyA tCyPEKSzIyweCN5yp1;
        try {
            tCyPEKSzIyweCN5yp1 = new KYHag8HRDlnO3X9zmZ(AtomicReferenceFieldUpdater.newUpdater(IPyIQcaNa8aB7drBED.class, Thread.class, "lEeR5KfoEr4xU5yHH7"), AtomicReferenceFieldUpdater.newUpdater(IPyIQcaNa8aB7drBED.class, IPyIQcaNa8aB7drBED.class, "s3fjYDxWOUexjjVgyA"), AtomicReferenceFieldUpdater.newUpdater(lEeR5KfoEr4xU5yHH7.class, IPyIQcaNa8aB7drBED.class, "HJFh0TGMpafqLE9haL"), AtomicReferenceFieldUpdater.newUpdater(lEeR5KfoEr4xU5yHH7.class, husNiw3snxdgZPAGJm.class, "s3fjYDxWOUexjjVgyA"), AtomicReferenceFieldUpdater.newUpdater(lEeR5KfoEr4xU5yHH7.class, Object.class, "lEeR5KfoEr4xU5yHH7"));
            th = null;
        } catch (Throwable th) {
            th = th;
            tCyPEKSzIyweCN5yp1 = new TCyPEKSzIyweCN5yp1();
        }
        f5624KYHag8HRDlnO3X9zmZ = tCyPEKSzIyweCN5yp1;
        if (th != null) {
            f5626husNiw3snxdgZPAGJm.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5625TCyPEKSzIyweCN5yp1 = new Object();
    }

    public static CancellationException HJFh0TGMpafqLE9haL(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static void KYHag8HRDlnO3X9zmZ(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        leer5kfoer4xu5yhh7.e54J8UWNHWALQNixXM();
        leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA();
        husNiw3snxdgZPAGJm husNiw3snxdgZPAGJm2 = leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm(null);
        while (husNiw3snxdgZPAGJm2 != null) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = husNiw3snxdgZPAGJm2.f5644HJFh0TGMpafqLE9haL;
            TCyPEKSzIyweCN5yp1(husNiw3snxdgZPAGJm2.f5645lEeR5KfoEr4xU5yHH7, husNiw3snxdgZPAGJm2.f5646s3fjYDxWOUexjjVgyA);
            husNiw3snxdgZPAGJm2 = husniw3snxdgzpagjm;
        }
    }

    public static void TCyPEKSzIyweCN5yp1(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f5626husNiw3snxdgZPAGJm.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object pbVGzGjWvY2LDXC8vo(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object zZKhbgvUfsK4AEX3r0(Object obj) {
        obj.getClass();
        return obj;
    }

    public final Object IPyIQcaNa8aB7drBED(Object obj) throws ExecutionException {
        if (obj instanceof HJFh0TGMpafqLE9haL) {
            throw HJFh0TGMpafqLE9haL("Task was cancelled.", ((HJFh0TGMpafqLE9haL) obj).f5634s3fjYDxWOUexjjVgyA);
        }
        if (obj instanceof zZKhbgvUfsK4AEX3r0) {
            throw new ExecutionException(((zZKhbgvUfsK4AEX3r0) obj).f5648lEeR5KfoEr4xU5yHH7);
        }
        if (obj == f5625TCyPEKSzIyweCN5yp1) {
            return null;
        }
        return obj;
    }

    public final String OANkd3mP6AYvwbNLJM(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final void T9PhQIpGRhE4yZDm1C(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED) {
        iPyIQcaNa8aB7drBED.f5636lEeR5KfoEr4xU5yHH7 = null;
        while (true) {
            IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED2 = this.f5628HJFh0TGMpafqLE9haL;
            if (iPyIQcaNa8aB7drBED2 == IPyIQcaNa8aB7drBED.f5635HJFh0TGMpafqLE9haL) {
                return;
            }
            IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED3 = null;
            while (iPyIQcaNa8aB7drBED2 != null) {
                IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED4 = iPyIQcaNa8aB7drBED2.f5637s3fjYDxWOUexjjVgyA;
                if (iPyIQcaNa8aB7drBED2.f5636lEeR5KfoEr4xU5yHH7 != null) {
                    iPyIQcaNa8aB7drBED3 = iPyIQcaNa8aB7drBED2;
                } else if (iPyIQcaNa8aB7drBED3 != null) {
                    iPyIQcaNa8aB7drBED3.f5637s3fjYDxWOUexjjVgyA = iPyIQcaNa8aB7drBED4;
                    if (iPyIQcaNa8aB7drBED3.f5636lEeR5KfoEr4xU5yHH7 == null) {
                        break;
                    }
                } else if (!f5624KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(this, iPyIQcaNa8aB7drBED2, iPyIQcaNa8aB7drBED4)) {
                    break;
                }
                iPyIQcaNa8aB7drBED2 = iPyIQcaNa8aB7drBED4;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String Z9WdNiOsPR0y54zHW4() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean aPyGSIylzVNKPT1Bls(Throwable th) {
        if (!f5624KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(this, null, new zZKhbgvUfsK4AEX3r0((Throwable) zZKhbgvUfsK4AEX3r0(th)))) {
            return false;
        }
        KYHag8HRDlnO3X9zmZ(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f5629lEeR5KfoEr4xU5yHH7;
        if (obj == null) {
            if (f5624KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(this, obj, f5627zZKhbgvUfsK4AEX3r0 ? new HJFh0TGMpafqLE9haL(z, new CancellationException("Future.cancel() was called.")) : z ? HJFh0TGMpafqLE9haL.f5631HJFh0TGMpafqLE9haL : HJFh0TGMpafqLE9haL.f5632zZKhbgvUfsK4AEX3r0)) {
                if (z) {
                    Acstmh57AKoSEkEFNJ();
                }
                KYHag8HRDlnO3X9zmZ(this);
                return true;
            }
        }
        return false;
    }

    public final void e54J8UWNHWALQNixXM() {
        IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED;
        do {
            iPyIQcaNa8aB7drBED = this.f5628HJFh0TGMpafqLE9haL;
        } while (!f5624KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(this, iPyIQcaNa8aB7drBED, IPyIQcaNa8aB7drBED.f5635HJFh0TGMpafqLE9haL));
        while (iPyIQcaNa8aB7drBED != null) {
            iPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA();
            iPyIQcaNa8aB7drBED = iPyIQcaNa8aB7drBED.f5637s3fjYDxWOUexjjVgyA;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f5629lEeR5KfoEr4xU5yHH7;
        if (obj2 != null) {
            return IPyIQcaNa8aB7drBED(obj2);
        }
        IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED = this.f5628HJFh0TGMpafqLE9haL;
        if (iPyIQcaNa8aB7drBED != IPyIQcaNa8aB7drBED.f5635HJFh0TGMpafqLE9haL) {
            IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED2 = new IPyIQcaNa8aB7drBED();
            do {
                iPyIQcaNa8aB7drBED2.lEeR5KfoEr4xU5yHH7(iPyIQcaNa8aB7drBED);
                if (f5624KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(this, iPyIQcaNa8aB7drBED, iPyIQcaNa8aB7drBED2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            T9PhQIpGRhE4yZDm1C(iPyIQcaNa8aB7drBED2);
                            throw new InterruptedException();
                        }
                        obj = this.f5629lEeR5KfoEr4xU5yHH7;
                    } while (!(obj != null));
                    return IPyIQcaNa8aB7drBED(obj);
                }
                iPyIQcaNa8aB7drBED = this.f5628HJFh0TGMpafqLE9haL;
            } while (iPyIQcaNa8aB7drBED != IPyIQcaNa8aB7drBED.f5635HJFh0TGMpafqLE9haL);
        }
        return IPyIQcaNa8aB7drBED(this.f5629lEeR5KfoEr4xU5yHH7);
    }

    public boolean hoXrIDAFrSwfShk8da(Object obj) {
        if (obj == null) {
            obj = f5625TCyPEKSzIyweCN5yp1;
        }
        if (!f5624KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(this, null, obj)) {
            return false;
        }
        KYHag8HRDlnO3X9zmZ(this);
        return true;
    }

    public final husNiw3snxdgZPAGJm husNiw3snxdgZPAGJm(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm2;
        do {
            husniw3snxdgzpagjm2 = this.f5630s3fjYDxWOUexjjVgyA;
        } while (!f5624KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(this, husniw3snxdgzpagjm2, husNiw3snxdgZPAGJm.f5643zZKhbgvUfsK4AEX3r0));
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm3 = husniw3snxdgzpagjm;
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm4 = husniw3snxdgzpagjm2;
        while (husniw3snxdgzpagjm4 != null) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm5 = husniw3snxdgzpagjm4.f5644HJFh0TGMpafqLE9haL;
            husniw3snxdgzpagjm4.f5644HJFh0TGMpafqLE9haL = husniw3snxdgzpagjm3;
            husniw3snxdgzpagjm3 = husniw3snxdgzpagjm4;
            husniw3snxdgzpagjm4 = husniw3snxdgzpagjm5;
        }
        return husniw3snxdgzpagjm3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5629lEeR5KfoEr4xU5yHH7 instanceof HJFh0TGMpafqLE9haL;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5629lEeR5KfoEr4xU5yHH7 != null;
    }

    public final void lEeR5KfoEr4xU5yHH7(StringBuilder sb) {
        String str = "]";
        try {
            Object objPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(this);
            sb.append("SUCCESS, result=[");
            sb.append(OANkd3mP6AYvwbNLJM(objPbVGzGjWvY2LDXC8vo));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(str);
        }
    }

    public String toString() {
        String strZ9WdNiOsPR0y54zHW4;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (isDone()) {
                lEeR5KfoEr4xU5yHH7(sb);
            } else {
                try {
                    strZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4();
                } catch (RuntimeException e) {
                    strZ9WdNiOsPR0y54zHW4 = "Exception thrown from implementation: " + e.getClass();
                }
                if (strZ9WdNiOsPR0y54zHW4 == null || strZ9WdNiOsPR0y54zHW4.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    lEeR5KfoEr4xU5yHH7(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(strZ9WdNiOsPR0y54zHW4);
                    sb.append("]");
                }
            }
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public final boolean zaq8hOURtfwbcX17cG() {
        Object obj = this.f5629lEeR5KfoEr4xU5yHH7;
        return (obj instanceof HJFh0TGMpafqLE9haL) && ((HJFh0TGMpafqLE9haL) obj).f5633lEeR5KfoEr4xU5yHH7;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5629lEeR5KfoEr4xU5yHH7;
        if (obj != null) {
            return IPyIQcaNa8aB7drBED(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED = this.f5628HJFh0TGMpafqLE9haL;
            if (iPyIQcaNa8aB7drBED != IPyIQcaNa8aB7drBED.f5635HJFh0TGMpafqLE9haL) {
                IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED2 = new IPyIQcaNa8aB7drBED();
                do {
                    iPyIQcaNa8aB7drBED2.lEeR5KfoEr4xU5yHH7(iPyIQcaNa8aB7drBED);
                    if (f5624KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(this, iPyIQcaNa8aB7drBED, iPyIQcaNa8aB7drBED2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                T9PhQIpGRhE4yZDm1C(iPyIQcaNa8aB7drBED2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5629lEeR5KfoEr4xU5yHH7;
                            if (obj2 != null) {
                                return IPyIQcaNa8aB7drBED(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        T9PhQIpGRhE4yZDm1C(iPyIQcaNa8aB7drBED2);
                    } else {
                        iPyIQcaNa8aB7drBED = this.f5628HJFh0TGMpafqLE9haL;
                    }
                } while (iPyIQcaNa8aB7drBED != IPyIQcaNa8aB7drBED.f5635HJFh0TGMpafqLE9haL);
            }
            return IPyIQcaNa8aB7drBED(this.f5629lEeR5KfoEr4xU5yHH7);
        }
        while (nanos > 0) {
            Object obj3 = this.f5629lEeR5KfoEr4xU5yHH7;
            if (obj3 != null) {
                return IPyIQcaNa8aB7drBED(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    public void Acstmh57AKoSEkEFNJ() {
    }

    public void s3fjYDxWOUexjjVgyA() {
    }
}
