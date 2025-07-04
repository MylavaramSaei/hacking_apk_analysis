package HR5vAalpgOKVm2T0Gq;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class oocVJL811qFf0j0XXZ implements ServiceConnection {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f418lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final /* synthetic */ HJFh0TGMpafqLE9haL f419s3fjYDxWOUexjjVgyA;

    public oocVJL811qFf0j0XXZ(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, int i) {
        this.f419s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL;
        this.f418lEeR5KfoEr4xU5yHH7 = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f419s3fjYDxWOUexjjVgyA;
        if (iBinder == null) {
            HJFh0TGMpafqLE9haL.osrHU7fvDp2EgxZPfM(hJFh0TGMpafqLE9haL, 16);
            return;
        }
        synchronized (hJFh0TGMpafqLE9haL.f309hoXrIDAFrSwfShk8da) {
            try {
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = this.f419s3fjYDxWOUexjjVgyA;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                hJFh0TGMpafqLE9haL2.f306aPyGSIylzVNKPT1Bls = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof Z9WdNiOsPR0y54zHW4)) ? new aAp6BD79BhftLCnuvf(iBinder) : (Z9WdNiOsPR0y54zHW4) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f419s3fjYDxWOUexjjVgyA.ZJNyOIPL0usMs2xSAn(0, null, this.f418lEeR5KfoEr4xU5yHH7);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f419s3fjYDxWOUexjjVgyA.f309hoXrIDAFrSwfShk8da) {
            this.f419s3fjYDxWOUexjjVgyA.f306aPyGSIylzVNKPT1Bls = null;
        }
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f419s3fjYDxWOUexjjVgyA;
        int i = this.f418lEeR5KfoEr4xU5yHH7;
        Handler handler = hJFh0TGMpafqLE9haL.f308e54J8UWNHWALQNixXM;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
