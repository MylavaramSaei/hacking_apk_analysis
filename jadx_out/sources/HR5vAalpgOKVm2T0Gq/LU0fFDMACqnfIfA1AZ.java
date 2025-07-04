package HR5vAalpgOKVm2T0Gq;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class LU0fFDMACqnfIfA1AZ extends yXUWiIShOcfJRNCmU8.husNiw3snxdgZPAGJm {

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final /* synthetic */ HJFh0TGMpafqLE9haL f341s3fjYDxWOUexjjVgyA;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LU0fFDMACqnfIfA1AZ(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, Looper looper) {
        super(looper);
        this.f341s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL;
    }

    public static final void lEeR5KfoEr4xU5yHH7(Message message) {
        zcy2NNbtVXgoGQbfuq zcy2nnbtvxgogqbfuq = (zcy2NNbtVXgoGQbfuq) message.obj;
        zcy2nnbtvxgogqbfuq.s3fjYDxWOUexjjVgyA();
        zcy2nnbtvxgogqbfuq.husNiw3snxdgZPAGJm();
    }

    public static final boolean s3fjYDxWOUexjjVgyA(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f341s3fjYDxWOUexjjVgyA.f297OUd9THiLjZndMj0qdF.get() != message.arg1) {
            if (s3fjYDxWOUexjjVgyA(message)) {
                lEeR5KfoEr4xU5yHH7(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || ((i == 4 && !this.f341s3fjYDxWOUexjjVgyA.Y43RdunnpKgpbny0lE()) || message.what == 5)) && !this.f341s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7()) {
            lEeR5KfoEr4xU5yHH7(message);
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            this.f341s3fjYDxWOUexjjVgyA.f303WWC27LAMFqFFBzfbNw = new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(message.arg2);
            if (HJFh0TGMpafqLE9haL.Kh0uC90qEEhuLdpgB9(this.f341s3fjYDxWOUexjjVgyA)) {
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f341s3fjYDxWOUexjjVgyA;
                if (!hJFh0TGMpafqLE9haL.f301THTDvPxsHqMeGb512f) {
                    hJFh0TGMpafqLE9haL.Pum9NZyDBKoCnecvlx(3, null);
                    return;
                }
            }
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = this.f341s3fjYDxWOUexjjVgyA;
            f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = hJFh0TGMpafqLE9haL2.f303WWC27LAMFqFFBzfbNw != null ? hJFh0TGMpafqLE9haL2.f303WWC27LAMFqFFBzfbNw : new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(8);
            this.f341s3fjYDxWOUexjjVgyA.f296OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL(leer5kfoer4xu5yhh7);
            this.f341s3fjYDxWOUexjjVgyA.e2F9F6h8YJxTHwLCa0(leer5kfoer4xu5yhh7);
            return;
        }
        if (i2 == 5) {
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3 = this.f341s3fjYDxWOUexjjVgyA;
            f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = hJFh0TGMpafqLE9haL3.f303WWC27LAMFqFFBzfbNw != null ? hJFh0TGMpafqLE9haL3.f303WWC27LAMFqFFBzfbNw : new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(8);
            this.f341s3fjYDxWOUexjjVgyA.f296OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL(leer5kfoer4xu5yhh72);
            this.f341s3fjYDxWOUexjjVgyA.e2F9F6h8YJxTHwLCa0(leer5kfoer4xu5yhh72);
            return;
        }
        if (i2 == 3) {
            Object obj = message.obj;
            f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh73 = new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f341s3fjYDxWOUexjjVgyA.f296OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL(leer5kfoer4xu5yhh73);
            this.f341s3fjYDxWOUexjjVgyA.e2F9F6h8YJxTHwLCa0(leer5kfoer4xu5yhh73);
            return;
        }
        if (i2 == 6) {
            this.f341s3fjYDxWOUexjjVgyA.Pum9NZyDBKoCnecvlx(5, null);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL4 = this.f341s3fjYDxWOUexjjVgyA;
            if (hJFh0TGMpafqLE9haL4.f291G7AC3DWIx9i9fdanjk != null) {
                hJFh0TGMpafqLE9haL4.f291G7AC3DWIx9i9fdanjk.lEeR5KfoEr4xU5yHH7(message.arg2);
            }
            this.f341s3fjYDxWOUexjjVgyA.KqgKJKIWne3kz1AdHk(message.arg2);
            HJFh0TGMpafqLE9haL.k0CbjZvfUz23r8IN6W(this.f341s3fjYDxWOUexjjVgyA, 5, 1, null);
            return;
        }
        if (i2 == 2 && !this.f341s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL()) {
            lEeR5KfoEr4xU5yHH7(message);
            return;
        }
        if (s3fjYDxWOUexjjVgyA(message)) {
            ((zcy2NNbtVXgoGQbfuq) message.obj).HJFh0TGMpafqLE9haL();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
