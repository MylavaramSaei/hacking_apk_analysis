package HR5vAalpgOKVm2T0Gq;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes.dex */
public final class YlLW4G6OV9TFyuw5ix extends PPkm9uUfOJHHYveeLT {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f381lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f382s3fjYDxWOUexjjVgyA;

    public YlLW4G6OV9TFyuw5ix(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, int i) {
        this.f381lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
        this.f382s3fjYDxWOUexjjVgyA = i;
    }

    @Override // HR5vAalpgOKVm2T0Gq.Acstmh57AKoSEkEFNJ
    public final void KYHag8HRDlnO3X9zmZ(int i, IBinder iBinder, hUNBy66ZO1wVLJGW3l hunby66zo1wvljgw3l) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f381lEeR5KfoEr4xU5yHH7;
        hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(hJFh0TGMpafqLE9haL, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(hunby66zo1wvljgw3l);
        HJFh0TGMpafqLE9haL.CSih7GetOUab1dYQjM(hJFh0TGMpafqLE9haL, hunby66zo1wvljgw3l);
        Z9WdNiOsPR0y54zHW4(i, iBinder, hunby66zo1wvljgw3l.f401lEeR5KfoEr4xU5yHH7);
    }

    @Override // HR5vAalpgOKVm2T0Gq.Acstmh57AKoSEkEFNJ
    public final void Z9WdNiOsPR0y54zHW4(int i, IBinder iBinder, Bundle bundle) {
        hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(this.f381lEeR5KfoEr4xU5yHH7, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f381lEeR5KfoEr4xU5yHH7.PPkm9uUfOJHHYveeLT(i, iBinder, bundle, this.f382s3fjYDxWOUexjjVgyA);
        this.f381lEeR5KfoEr4xU5yHH7 = null;
    }

    @Override // HR5vAalpgOKVm2T0Gq.Acstmh57AKoSEkEFNJ
    public final void zZKhbgvUfsK4AEX3r0(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
