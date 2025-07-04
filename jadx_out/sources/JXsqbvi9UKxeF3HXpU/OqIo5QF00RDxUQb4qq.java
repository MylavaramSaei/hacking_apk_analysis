package JXsqbvi9UKxeF3HXpU;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class OqIo5QF00RDxUQb4qq extends pbVGzGjWvY2LDXC8vo {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public boolean f777HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public Exception f778KYHag8HRDlnO3X9zmZ;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public Object f779husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Object f780lEeR5KfoEr4xU5yHH7 = new Object();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final XzJ1BS7H9Ilbkv4eVM f781s3fjYDxWOUexjjVgyA = new XzJ1BS7H9Ilbkv4eVM();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public volatile boolean f782zZKhbgvUfsK4AEX3r0;

    public final void A49QRPHynYLCBN0SqP() {
        if (this.f782zZKhbgvUfsK4AEX3r0) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final Exception Acstmh57AKoSEkEFNJ() {
        Exception exc;
        synchronized (this.f780lEeR5KfoEr4xU5yHH7) {
            exc = this.f778KYHag8HRDlnO3X9zmZ;
        }
        return exc;
    }

    public final boolean G7AC3DWIx9i9fdanjk(Exception exc) {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(exc, "Exception must not be null");
        synchronized (this.f780lEeR5KfoEr4xU5yHH7) {
            try {
                if (this.f777HJFh0TGMpafqLE9haL) {
                    return false;
                }
                this.f777HJFh0TGMpafqLE9haL = true;
                this.f778KYHag8HRDlnO3X9zmZ = exc;
                this.f781s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final pbVGzGjWvY2LDXC8vo HJFh0TGMpafqLE9haL(Executor executor, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        this.f781s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(new LIMtzhnLwQyigzK0KO(executor, zzkhbgvufsk4aex3r0));
        WWC27LAMFqFFBzfbNw();
        return this;
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final pbVGzGjWvY2LDXC8vo IPyIQcaNa8aB7drBED(Executor executor, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq = new OqIo5QF00RDxUQb4qq();
        this.f781s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(new zaq8hOURtfwbcX17cG(executor, leer5kfoer4xu5yhh7, oqIo5QF00RDxUQb4qq));
        WWC27LAMFqFFBzfbNw();
        return oqIo5QF00RDxUQb4qq;
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final pbVGzGjWvY2LDXC8vo KYHag8HRDlnO3X9zmZ(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        TCyPEKSzIyweCN5yp1(Z9WdNiOsPR0y54zHW4.f799lEeR5KfoEr4xU5yHH7, kYHag8HRDlnO3X9zmZ);
        return this;
    }

    public final void LIMtzhnLwQyigzK0KO() {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.T9PhQIpGRhE4yZDm1C(this.f777HJFh0TGMpafqLE9haL, "Task is not yet complete");
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final pbVGzGjWvY2LDXC8vo OANkd3mP6AYvwbNLJM(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED) {
        Executor executor = Z9WdNiOsPR0y54zHW4.f799lEeR5KfoEr4xU5yHH7;
        OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq = new OqIo5QF00RDxUQb4qq();
        this.f781s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(new OUd9THiLjZndMj0qdF(executor, iPyIQcaNa8aB7drBED, oqIo5QF00RDxUQb4qq));
        WWC27LAMFqFFBzfbNw();
        return oqIo5QF00RDxUQb4qq;
    }

    public final boolean R9SAhYMerGybF9OAjL() {
        synchronized (this.f780lEeR5KfoEr4xU5yHH7) {
            try {
                if (this.f777HJFh0TGMpafqLE9haL) {
                    return false;
                }
                this.f777HJFh0TGMpafqLE9haL = true;
                this.f782zZKhbgvUfsK4AEX3r0 = true;
                this.f781s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final boolean T9PhQIpGRhE4yZDm1C() {
        return this.f782zZKhbgvUfsK4AEX3r0;
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final pbVGzGjWvY2LDXC8vo TCyPEKSzIyweCN5yp1(Executor executor, KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        this.f781s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(new THTDvPxsHqMeGb512f(executor, kYHag8HRDlnO3X9zmZ));
        WWC27LAMFqFFBzfbNw();
        return this;
    }

    public final void VItLRw50eXTZeEfGl0() {
        if (this.f777HJFh0TGMpafqLE9haL) {
            throw s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this);
        }
    }

    public final void WWC27LAMFqFFBzfbNw() {
        synchronized (this.f780lEeR5KfoEr4xU5yHH7) {
            try {
                if (this.f777HJFh0TGMpafqLE9haL) {
                    this.f781s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y43RdunnpKgpbny0lE(Object obj) {
        synchronized (this.f780lEeR5KfoEr4xU5yHH7) {
            VItLRw50eXTZeEfGl0();
            this.f777HJFh0TGMpafqLE9haL = true;
            this.f779husNiw3snxdgZPAGJm = obj;
        }
        this.f781s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(this);
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final Object Z9WdNiOsPR0y54zHW4() {
        Object obj;
        synchronized (this.f780lEeR5KfoEr4xU5yHH7) {
            try {
                LIMtzhnLwQyigzK0KO();
                A49QRPHynYLCBN0SqP();
                Exception exc = this.f778KYHag8HRDlnO3X9zmZ;
                if (exc != null) {
                    throw new TCyPEKSzIyweCN5yp1(exc);
                }
                obj = this.f779husNiw3snxdgZPAGJm;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final boolean aPyGSIylzVNKPT1Bls() {
        boolean z;
        synchronized (this.f780lEeR5KfoEr4xU5yHH7) {
            try {
                z = false;
                if (this.f777HJFh0TGMpafqLE9haL && !this.f782zZKhbgvUfsK4AEX3r0 && this.f778KYHag8HRDlnO3X9zmZ == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final Object e54J8UWNHWALQNixXM(Class cls) {
        Object obj;
        synchronized (this.f780lEeR5KfoEr4xU5yHH7) {
            try {
                LIMtzhnLwQyigzK0KO();
                A49QRPHynYLCBN0SqP();
                if (cls.isInstance(this.f778KYHag8HRDlnO3X9zmZ)) {
                    throw ((Throwable) cls.cast(this.f778KYHag8HRDlnO3X9zmZ));
                }
                Exception exc = this.f778KYHag8HRDlnO3X9zmZ;
                if (exc != null) {
                    throw new TCyPEKSzIyweCN5yp1(exc);
                }
                obj = this.f779husNiw3snxdgZPAGJm;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final boolean hoXrIDAFrSwfShk8da() {
        boolean z;
        synchronized (this.f780lEeR5KfoEr4xU5yHH7) {
            z = this.f777HJFh0TGMpafqLE9haL;
        }
        return z;
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final pbVGzGjWvY2LDXC8vo husNiw3snxdgZPAGJm(Executor executor, husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this.f781s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(new VItLRw50eXTZeEfGl0(executor, husniw3snxdgzpagjm));
        WWC27LAMFqFFBzfbNw();
        return this;
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final pbVGzGjWvY2LDXC8vo lEeR5KfoEr4xU5yHH7(Executor executor, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        this.f781s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(new G7AC3DWIx9i9fdanjk(executor, hJFh0TGMpafqLE9haL));
        WWC27LAMFqFFBzfbNw();
        return this;
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final pbVGzGjWvY2LDXC8vo pbVGzGjWvY2LDXC8vo(Executor executor, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq = new OqIo5QF00RDxUQb4qq();
        this.f781s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(new Y43RdunnpKgpbny0lE(executor, leer5kfoer4xu5yhh7, oqIo5QF00RDxUQb4qq));
        WWC27LAMFqFFBzfbNw();
        return oqIo5QF00RDxUQb4qq;
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final pbVGzGjWvY2LDXC8vo s3fjYDxWOUexjjVgyA(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        this.f781s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(new LIMtzhnLwQyigzK0KO(Z9WdNiOsPR0y54zHW4.f799lEeR5KfoEr4xU5yHH7, zzkhbgvufsk4aex3r0));
        WWC27LAMFqFFBzfbNw();
        return this;
    }

    public final void sTkWmhpZ5b1ArQIw4K(Exception exc) {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(exc, "Exception must not be null");
        synchronized (this.f780lEeR5KfoEr4xU5yHH7) {
            VItLRw50eXTZeEfGl0();
            this.f777HJFh0TGMpafqLE9haL = true;
            this.f778KYHag8HRDlnO3X9zmZ = exc;
        }
        this.f781s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(this);
    }

    public final boolean xHA29AmDt6y96AnB3t(Object obj) {
        synchronized (this.f780lEeR5KfoEr4xU5yHH7) {
            try {
                if (this.f777HJFh0TGMpafqLE9haL) {
                    return false;
                }
                this.f777HJFh0TGMpafqLE9haL = true;
                this.f779husNiw3snxdgZPAGJm = obj;
                this.f781s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final pbVGzGjWvY2LDXC8vo zZKhbgvUfsK4AEX3r0(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        husNiw3snxdgZPAGJm(Z9WdNiOsPR0y54zHW4.f799lEeR5KfoEr4xU5yHH7, husniw3snxdgzpagjm);
        return this;
    }

    @Override // JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo
    public final pbVGzGjWvY2LDXC8vo zaq8hOURtfwbcX17cG(Executor executor, IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED) {
        OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq = new OqIo5QF00RDxUQb4qq();
        this.f781s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(new OUd9THiLjZndMj0qdF(executor, iPyIQcaNa8aB7drBED, oqIo5QF00RDxUQb4qq));
        WWC27LAMFqFFBzfbNw();
        return oqIo5QF00RDxUQb4qq;
    }
}
