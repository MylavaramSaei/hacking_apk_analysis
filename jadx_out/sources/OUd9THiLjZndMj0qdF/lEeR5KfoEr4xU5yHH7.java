package OUd9THiLjZndMj0qdF;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public Object f1186HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f1187lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public InterfaceC0014lEeR5KfoEr4xU5yHH7 f1188s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f1189zZKhbgvUfsK4AEX3r0;

    /* renamed from: OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public interface InterfaceC0014lEeR5KfoEr4xU5yHH7 {
        void lEeR5KfoEr4xU5yHH7();
    }

    public final void HJFh0TGMpafqLE9haL() throws InterruptedException {
        while (this.f1189zZKhbgvUfsK4AEX3r0) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void lEeR5KfoEr4xU5yHH7() {
        synchronized (this) {
            try {
                if (this.f1187lEeR5KfoEr4xU5yHH7) {
                    return;
                }
                this.f1187lEeR5KfoEr4xU5yHH7 = true;
                this.f1189zZKhbgvUfsK4AEX3r0 = true;
                InterfaceC0014lEeR5KfoEr4xU5yHH7 interfaceC0014lEeR5KfoEr4xU5yHH7 = this.f1188s3fjYDxWOUexjjVgyA;
                Object obj = this.f1186HJFh0TGMpafqLE9haL;
                if (interfaceC0014lEeR5KfoEr4xU5yHH7 != null) {
                    try {
                        interfaceC0014lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f1189zZKhbgvUfsK4AEX3r0 = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f1189zZKhbgvUfsK4AEX3r0 = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void s3fjYDxWOUexjjVgyA(InterfaceC0014lEeR5KfoEr4xU5yHH7 interfaceC0014lEeR5KfoEr4xU5yHH7) {
        synchronized (this) {
            try {
                HJFh0TGMpafqLE9haL();
                if (this.f1188s3fjYDxWOUexjjVgyA == interfaceC0014lEeR5KfoEr4xU5yHH7) {
                    return;
                }
                this.f1188s3fjYDxWOUexjjVgyA = interfaceC0014lEeR5KfoEr4xU5yHH7;
                if (this.f1187lEeR5KfoEr4xU5yHH7 && interfaceC0014lEeR5KfoEr4xU5yHH7 != null) {
                    interfaceC0014lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7();
                }
            } finally {
            }
        }
    }
}
