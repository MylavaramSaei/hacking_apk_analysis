package HR5vAalpgOKVm2T0Gq;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class zcy2NNbtVXgoGQbfuq {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final /* synthetic */ HJFh0TGMpafqLE9haL f447HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public Object f448lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f449s3fjYDxWOUexjjVgyA = false;

    public zcy2NNbtVXgoGQbfuq(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, Object obj) {
        this.f447HJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL;
        this.f448lEeR5KfoEr4xU5yHH7 = obj;
    }

    public final void HJFh0TGMpafqLE9haL() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f448lEeR5KfoEr4xU5yHH7;
                if (this.f449s3fjYDxWOUexjjVgyA) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            lEeR5KfoEr4xU5yHH7(obj);
        }
        synchronized (this) {
            this.f449s3fjYDxWOUexjjVgyA = true;
        }
        husNiw3snxdgZPAGJm();
    }

    public final void husNiw3snxdgZPAGJm() {
        zZKhbgvUfsK4AEX3r0();
        synchronized (this.f447HJFh0TGMpafqLE9haL.f314sTkWmhpZ5b1ArQIw4K) {
            this.f447HJFh0TGMpafqLE9haL.f314sTkWmhpZ5b1ArQIw4K.remove(this);
        }
    }

    public abstract void lEeR5KfoEr4xU5yHH7(Object obj);

    public abstract void s3fjYDxWOUexjjVgyA();

    public final void zZKhbgvUfsK4AEX3r0() {
        synchronized (this) {
            this.f448lEeR5KfoEr4xU5yHH7 = null;
        }
    }
}
