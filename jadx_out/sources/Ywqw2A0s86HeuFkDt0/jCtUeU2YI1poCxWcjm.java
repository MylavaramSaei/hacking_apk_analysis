package Ywqw2A0s86HeuFkDt0;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class jCtUeU2YI1poCxWcjm {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static jCtUeU2YI1poCxWcjm f2230husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f2232lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final ScheduledExecutorService f2233s3fjYDxWOUexjjVgyA;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public A49QRPHynYLCBN0SqP f2231HJFh0TGMpafqLE9haL = new A49QRPHynYLCBN0SqP(this, null);

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f2234zZKhbgvUfsK4AEX3r0 = 1;

    public jCtUeU2YI1poCxWcjm(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f2233s3fjYDxWOUexjjVgyA = scheduledExecutorService;
        this.f2232lEeR5KfoEr4xU5yHH7 = context.getApplicationContext();
    }

    public static synchronized jCtUeU2YI1poCxWcjm s3fjYDxWOUexjjVgyA(Context context) {
        try {
            if (f2230husNiw3snxdgZPAGJm == null) {
                oXIAAdret8ERrYfuyf.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7();
                f2230husNiw3snxdgZPAGJm = new jCtUeU2YI1poCxWcjm(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new vlBaBOcZ1q1ndWVoXn.lEeR5KfoEr4xU5yHH7("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2230husNiw3snxdgZPAGJm;
    }

    public final JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo HJFh0TGMpafqLE9haL(int i, Bundle bundle) {
        return TCyPEKSzIyweCN5yp1(new WWC27LAMFqFFBzfbNw(KYHag8HRDlnO3X9zmZ(), i, bundle));
    }

    public final synchronized int KYHag8HRDlnO3X9zmZ() {
        int i;
        i = this.f2234zZKhbgvUfsK4AEX3r0;
        this.f2234zZKhbgvUfsK4AEX3r0 = i + 1;
        return i;
    }

    public final synchronized JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo TCyPEKSzIyweCN5yp1(THTDvPxsHqMeGb512f tHTDvPxsHqMeGb512f) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(tHTDvPxsHqMeGb512f.toString()));
            }
            if (!this.f2231HJFh0TGMpafqLE9haL.TCyPEKSzIyweCN5yp1(tHTDvPxsHqMeGb512f)) {
                A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP = new A49QRPHynYLCBN0SqP(this, null);
                this.f2231HJFh0TGMpafqLE9haL = a49QRPHynYLCBN0SqP;
                a49QRPHynYLCBN0SqP.TCyPEKSzIyweCN5yp1(tHTDvPxsHqMeGb512f);
            }
        } catch (Throwable th) {
            throw th;
        }
        return tHTDvPxsHqMeGb512f.f2215s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7();
    }

    public final JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo zZKhbgvUfsK4AEX3r0(int i, Bundle bundle) {
        return TCyPEKSzIyweCN5yp1(new OUd9THiLjZndMj0qdF(KYHag8HRDlnO3X9zmZ(), i, bundle));
    }
}
