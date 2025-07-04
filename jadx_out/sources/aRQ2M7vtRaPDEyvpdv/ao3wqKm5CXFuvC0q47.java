package aRQ2M7vtRaPDEyvpdv;

import HR5vAalpgOKVm2T0Gq.HJFh0TGMpafqLE9haL;
import HZ4bptRS9XIcK1CV95.lEeR5KfoEr4xU5yHH7;
import android.util.Log;
import java.util.Set;

/* loaded from: classes.dex */
public final class ao3wqKm5CXFuvC0q47 implements HJFh0TGMpafqLE9haL.InterfaceC0008HJFh0TGMpafqLE9haL, KqgKJKIWne3kz1AdHk {

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final /* synthetic */ husNiw3snxdgZPAGJm f2474KYHag8HRDlnO3X9zmZ;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ f2476lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f2477s3fjYDxWOUexjjVgyA;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public HR5vAalpgOKVm2T0Gq.pbVGzGjWvY2LDXC8vo f2473HJFh0TGMpafqLE9haL = null;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public Set f2478zZKhbgvUfsK4AEX3r0 = null;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public boolean f2475husNiw3snxdgZPAGJm = false;

    public ao3wqKm5CXFuvC0q47(husNiw3snxdgZPAGJm husniw3snxdgzpagjm, lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f2474KYHag8HRDlnO3X9zmZ = husniw3snxdgzpagjm;
        this.f2476lEeR5KfoEr4xU5yHH7 = kYHag8HRDlnO3X9zmZ;
        this.f2477s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya;
    }

    @Override // HR5vAalpgOKVm2T0Gq.HJFh0TGMpafqLE9haL.InterfaceC0008HJFh0TGMpafqLE9haL
    public final void HJFh0TGMpafqLE9haL(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f2474KYHag8HRDlnO3X9zmZ.f2498OANkd3mP6AYvwbNLJM.post(new THTDvPxsHqMeGb512f(this, leer5kfoer4xu5yhh7));
    }

    public final void IPyIQcaNa8aB7drBED() {
        HR5vAalpgOKVm2T0Gq.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo;
        if (!this.f2475husNiw3snxdgZPAGJm || (pbvgzgjwvy2ldxc8vo = this.f2473HJFh0TGMpafqLE9haL) == null) {
            return;
        }
        this.f2476lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(pbvgzgjwvy2ldxc8vo, this.f2478zZKhbgvUfsK4AEX3r0);
    }

    @Override // aRQ2M7vtRaPDEyvpdv.KqgKJKIWne3kz1AdHk
    public final void lEeR5KfoEr4xU5yHH7(HR5vAalpgOKVm2T0Gq.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, Set set) {
        if (pbvgzgjwvy2ldxc8vo == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            s3fjYDxWOUexjjVgyA(new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(4));
        } else {
            this.f2473HJFh0TGMpafqLE9haL = pbvgzgjwvy2ldxc8vo;
            this.f2478zZKhbgvUfsK4AEX3r0 = set;
            IPyIQcaNa8aB7drBED();
        }
    }

    @Override // aRQ2M7vtRaPDEyvpdv.KqgKJKIWne3kz1AdHk
    public final void s3fjYDxWOUexjjVgyA(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP = (A49QRPHynYLCBN0SqP) this.f2474KYHag8HRDlnO3X9zmZ.f2503e54J8UWNHWALQNixXM.get(this.f2477s3fjYDxWOUexjjVgyA);
        if (a49QRPHynYLCBN0SqP != null) {
            a49QRPHynYLCBN0SqP.OqIo5QF00RDxUQb4qq(leer5kfoer4xu5yhh7);
        }
    }
}
