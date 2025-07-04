package f2zPq7MOnQrtOlZ1Zg;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class T9PhQIpGRhE4yZDm1C extends uAIIhSQWhOmxUb3Bqo.KYHag8HRDlnO3X9zmZ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f5805lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final /* synthetic */ TCyPEKSzIyweCN5yp1 f5806s3fjYDxWOUexjjVgyA;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T9PhQIpGRhE4yZDm1C(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f5806s3fjYDxWOUexjjVgyA = tCyPEKSzIyweCN5yp1;
        this.f5805lEeR5KfoEr4xU5yHH7 = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int iKYHag8HRDlnO3X9zmZ = this.f5806s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(this.f5805lEeR5KfoEr4xU5yHH7);
        if (this.f5806s3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo(iKYHag8HRDlnO3X9zmZ)) {
            this.f5806s3fjYDxWOUexjjVgyA.hoXrIDAFrSwfShk8da(this.f5805lEeR5KfoEr4xU5yHH7, iKYHag8HRDlnO3X9zmZ);
        }
    }
}
