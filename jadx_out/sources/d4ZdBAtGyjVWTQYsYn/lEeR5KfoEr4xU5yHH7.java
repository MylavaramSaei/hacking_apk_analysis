package d4ZdBAtGyjVWTQYsYn;

import HR5vAalpgOKVm2T0Gq.HJFh0TGMpafqLE9haL;
import HR5vAalpgOKVm2T0Gq.W3RZ2dTDKrKpS5Mxdk;
import HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da;
import HZ4bptRS9XIcK1CV95.husNiw3snxdgZPAGJm;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 extends HR5vAalpgOKVm2T0Gq.TCyPEKSzIyweCN5yp1 implements QW0Trt6m3nVBNaYFnP.husNiw3snxdgZPAGJm {

    /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
    public static final /* synthetic */ int f5601PPkm9uUfOJHHYveeLT = 0;

    /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
    public final HR5vAalpgOKVm2T0Gq.zZKhbgvUfsK4AEX3r0 f5602DfpieXfdYs58yZAiXY;

    /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
    public final boolean f5603GyWRxpdt1T8mEJXPoD;

    /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
    public final Integer f5604KqgKJKIWne3kz1AdHk;

    /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
    public final Bundle f5605e2F9F6h8YJxTHwLCa0;

    public lEeR5KfoEr4xU5yHH7(Context context, Looper looper, boolean z, HR5vAalpgOKVm2T0Gq.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, Bundle bundle, husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        super(context, looper, 44, zzkhbgvufsk4aex3r0, leer5kfoer4xu5yhh7, s3fjydxwouexjjvgya);
        this.f5603GyWRxpdt1T8mEJXPoD = true;
        this.f5602DfpieXfdYs58yZAiXY = zzkhbgvufsk4aex3r0;
        this.f5605e2F9F6h8YJxTHwLCa0 = bundle;
        this.f5604KqgKJKIWne3kz1AdHk = zzkhbgvufsk4aex3r0.TCyPEKSzIyweCN5yp1();
    }

    public static Bundle zXY7dgnTfw9Pd9RXel(HR5vAalpgOKVm2T0Gq.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        zzkhbgvufsk4aex3r0.KYHag8HRDlnO3X9zmZ();
        Integer numTCyPEKSzIyweCN5yp1 = zzkhbgvufsk4aex3r0.TCyPEKSzIyweCN5yp1();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", zzkhbgvufsk4aex3r0.lEeR5KfoEr4xU5yHH7());
        if (numTCyPEKSzIyweCN5yp1 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numTCyPEKSzIyweCN5yp1.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // HR5vAalpgOKVm2T0Gq.HJFh0TGMpafqLE9haL, HZ4bptRS9XIcK1CV95.lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ
    public final int OANkd3mP6AYvwbNLJM() {
        return 12451000;
    }

    @Override // HR5vAalpgOKVm2T0Gq.HJFh0TGMpafqLE9haL, HZ4bptRS9XIcK1CV95.lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ
    public final boolean T9PhQIpGRhE4yZDm1C() {
        return this.f5603GyWRxpdt1T8mEJXPoD;
    }

    @Override // HR5vAalpgOKVm2T0Gq.HJFh0TGMpafqLE9haL
    public final Bundle WWC27LAMFqFFBzfbNw() {
        if (!A49QRPHynYLCBN0SqP().getPackageName().equals(this.f5602DfpieXfdYs58yZAiXY.zZKhbgvUfsK4AEX3r0())) {
            this.f5605e2F9F6h8YJxTHwLCa0.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f5602DfpieXfdYs58yZAiXY.zZKhbgvUfsK4AEX3r0());
        }
        return this.f5605e2F9F6h8YJxTHwLCa0;
    }

    @Override // HR5vAalpgOKVm2T0Gq.HJFh0TGMpafqLE9haL
    public final String XzJ1BS7H9Ilbkv4eVM() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // QW0Trt6m3nVBNaYFnP.husNiw3snxdgZPAGJm
    public final void hoXrIDAFrSwfShk8da() {
        KYHag8HRDlnO3X9zmZ(new HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0());
    }

    @Override // HR5vAalpgOKVm2T0Gq.HJFh0TGMpafqLE9haL
    public final String jCtUeU2YI1poCxWcjm() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // QW0Trt6m3nVBNaYFnP.husNiw3snxdgZPAGJm
    public final void pbVGzGjWvY2LDXC8vo(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(kYHag8HRDlnO3X9zmZ, "Expecting a valid ISignInCallbacks");
        try {
            Account accountS3fjYDxWOUexjjVgyA = this.f5602DfpieXfdYs58yZAiXY.s3fjYDxWOUexjjVgyA();
            ((TCyPEKSzIyweCN5yp1) OUd9THiLjZndMj0qdF()).e54J8UWNHWALQNixXM(new Acstmh57AKoSEkEFNJ(1, new W3RZ2dTDKrKpS5Mxdk(accountS3fjYDxWOUexjjVgyA, ((Integer) hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(this.f5604KqgKJKIWne3kz1AdHk)).intValue(), "<<default account>>".equals(accountS3fjYDxWOUexjjVgyA.name) ? Fo9071MN8vwEWamAUX.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(A49QRPHynYLCBN0SqP()).s3fjYDxWOUexjjVgyA() : null)), kYHag8HRDlnO3X9zmZ);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                kYHag8HRDlnO3X9zmZ.IPyIQcaNa8aB7drBED(new e54J8UWNHWALQNixXM(1, new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // HR5vAalpgOKVm2T0Gq.HJFh0TGMpafqLE9haL
    public final /* synthetic */ IInterface sTkWmhpZ5b1ArQIw4K(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof TCyPEKSzIyweCN5yp1 ? (TCyPEKSzIyweCN5yp1) iInterfaceQueryLocalInterface : new TCyPEKSzIyweCN5yp1(iBinder);
    }
}
