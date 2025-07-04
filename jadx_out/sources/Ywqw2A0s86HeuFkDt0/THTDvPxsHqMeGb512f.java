package Ywqw2A0s86HeuFkDt0;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class THTDvPxsHqMeGb512f {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f2213HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f2214lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ f2215s3fjYDxWOUexjjVgyA = new JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final Bundle f2216zZKhbgvUfsK4AEX3r0;

    public THTDvPxsHqMeGb512f(int i, int i2, Bundle bundle) {
        this.f2214lEeR5KfoEr4xU5yHH7 = i;
        this.f2213HJFh0TGMpafqLE9haL = i2;
        this.f2216zZKhbgvUfsK4AEX3r0 = bundle;
    }

    public final void HJFh0TGMpafqLE9haL(ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + ao3wqkm5cxfuvc0q47.toString());
        }
        this.f2215s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(ao3wqkm5cxfuvc0q47);
    }

    public abstract void lEeR5KfoEr4xU5yHH7(Bundle bundle);

    public abstract boolean s3fjYDxWOUexjjVgyA();

    public final String toString() {
        return "Request { what=" + this.f2213HJFh0TGMpafqLE9haL + " id=" + this.f2214lEeR5KfoEr4xU5yHH7 + " oneWay=" + s3fjYDxWOUexjjVgyA() + "}";
    }

    public final void zZKhbgvUfsK4AEX3r0(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f2215s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(obj);
    }
}
