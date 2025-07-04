package HR5vAalpgOKVm2T0Gq;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class udcVtCzLTM1Loe9KrX extends e2F9F6h8YJxTHwLCa0 {

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final /* synthetic */ HJFh0TGMpafqLE9haL f428IPyIQcaNa8aB7drBED;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final IBinder f429TCyPEKSzIyweCN5yp1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udcVtCzLTM1Loe9KrX(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, int i, IBinder iBinder, Bundle bundle) {
        super(hJFh0TGMpafqLE9haL, i, bundle);
        this.f428IPyIQcaNa8aB7drBED = hJFh0TGMpafqLE9haL;
        this.f429TCyPEKSzIyweCN5yp1 = iBinder;
    }

    @Override // HR5vAalpgOKVm2T0Gq.e2F9F6h8YJxTHwLCa0
    public final void KYHag8HRDlnO3X9zmZ(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (this.f428IPyIQcaNa8aB7drBED.f315xHA29AmDt6y96AnB3t != null) {
            this.f428IPyIQcaNa8aB7drBED.f315xHA29AmDt6y96AnB3t.s3fjYDxWOUexjjVgyA(leer5kfoer4xu5yhh7);
        }
        this.f428IPyIQcaNa8aB7drBED.e2F9F6h8YJxTHwLCa0(leer5kfoer4xu5yhh7);
    }

    @Override // HR5vAalpgOKVm2T0Gq.e2F9F6h8YJxTHwLCa0
    public final boolean TCyPEKSzIyweCN5yp1() throws RemoteException {
        String str;
        String interfaceDescriptor;
        try {
            IBinder iBinder = this.f429TCyPEKSzIyweCN5yp1;
            hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f428IPyIQcaNa8aB7drBED.jCtUeU2YI1poCxWcjm().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f428IPyIQcaNa8aB7drBED.jCtUeU2YI1poCxWcjm() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface iInterfaceSTkWmhpZ5b1ArQIw4K = this.f428IPyIQcaNa8aB7drBED.sTkWmhpZ5b1ArQIw4K(this.f429TCyPEKSzIyweCN5yp1);
        if (iInterfaceSTkWmhpZ5b1ArQIw4K == null || !(HJFh0TGMpafqLE9haL.k0CbjZvfUz23r8IN6W(this.f428IPyIQcaNa8aB7drBED, 2, 4, iInterfaceSTkWmhpZ5b1ArQIw4K) || HJFh0TGMpafqLE9haL.k0CbjZvfUz23r8IN6W(this.f428IPyIQcaNa8aB7drBED, 3, 4, iInterfaceSTkWmhpZ5b1ArQIw4K))) {
            return false;
        }
        this.f428IPyIQcaNa8aB7drBED.f303WWC27LAMFqFFBzfbNw = null;
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f428IPyIQcaNa8aB7drBED;
        Bundle bundleLIMtzhnLwQyigzK0KO = hJFh0TGMpafqLE9haL.LIMtzhnLwQyigzK0KO();
        if (hJFh0TGMpafqLE9haL.f291G7AC3DWIx9i9fdanjk == null) {
            return true;
        }
        this.f428IPyIQcaNa8aB7drBED.f291G7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL(bundleLIMtzhnLwQyigzK0KO);
        return true;
    }
}
