package HR5vAalpgOKVm2T0Gq;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class Kh0uC90qEEhuLdpgB9 implements Handler.Callback {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final /* synthetic */ Pum9NZyDBKoCnecvlx f340lEeR5KfoEr4xU5yHH7;

    public /* synthetic */ Kh0uC90qEEhuLdpgB9(Pum9NZyDBKoCnecvlx pum9NZyDBKoCnecvlx, k0CbjZvfUz23r8IN6W k0cbjzvfuz23r8in6w) {
        this.f340lEeR5KfoEr4xU5yHH7 = pum9NZyDBKoCnecvlx;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f340lEeR5KfoEr4xU5yHH7.f350KYHag8HRDlnO3X9zmZ) {
                try {
                    osrHU7fvDp2EgxZPfM osrhu7fvdp2egxzpfm = (osrHU7fvDp2EgxZPfM) message.obj;
                    Tu4WCh2gEwj8E4oHbP tu4WCh2gEwj8E4oHbP = (Tu4WCh2gEwj8E4oHbP) this.f340lEeR5KfoEr4xU5yHH7.f350KYHag8HRDlnO3X9zmZ.get(osrhu7fvdp2egxzpfm);
                    if (tu4WCh2gEwj8E4oHbP != null && tu4WCh2gEwj8E4oHbP.pbVGzGjWvY2LDXC8vo()) {
                        if (tu4WCh2gEwj8E4oHbP.Acstmh57AKoSEkEFNJ()) {
                            tu4WCh2gEwj8E4oHbP.TCyPEKSzIyweCN5yp1("GmsClientSupervisor");
                        }
                        this.f340lEeR5KfoEr4xU5yHH7.f350KYHag8HRDlnO3X9zmZ.remove(osrhu7fvdp2egxzpfm);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.f340lEeR5KfoEr4xU5yHH7.f350KYHag8HRDlnO3X9zmZ) {
            try {
                osrHU7fvDp2EgxZPfM osrhu7fvdp2egxzpfm2 = (osrHU7fvDp2EgxZPfM) message.obj;
                Tu4WCh2gEwj8E4oHbP tu4WCh2gEwj8E4oHbP2 = (Tu4WCh2gEwj8E4oHbP) this.f340lEeR5KfoEr4xU5yHH7.f350KYHag8HRDlnO3X9zmZ.get(osrhu7fvdp2egxzpfm2);
                if (tu4WCh2gEwj8E4oHbP2 != null && tu4WCh2gEwj8E4oHbP2.lEeR5KfoEr4xU5yHH7() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(osrhu7fvdp2egxzpfm2), new Exception());
                    ComponentName componentNameS3fjYDxWOUexjjVgyA = tu4WCh2gEwj8E4oHbP2.s3fjYDxWOUexjjVgyA();
                    if (componentNameS3fjYDxWOUexjjVgyA == null) {
                        componentNameS3fjYDxWOUexjjVgyA = osrhu7fvdp2egxzpfm2.lEeR5KfoEr4xU5yHH7();
                    }
                    if (componentNameS3fjYDxWOUexjjVgyA == null) {
                        String strHJFh0TGMpafqLE9haL = osrhu7fvdp2egxzpfm2.HJFh0TGMpafqLE9haL();
                        hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(strHJFh0TGMpafqLE9haL);
                        componentNameS3fjYDxWOUexjjVgyA = new ComponentName(strHJFh0TGMpafqLE9haL, "unknown");
                    }
                    tu4WCh2gEwj8E4oHbP2.onServiceDisconnected(componentNameS3fjYDxWOUexjjVgyA);
                }
            } finally {
            }
        }
        return true;
    }
}
