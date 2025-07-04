package HR5vAalpgOKVm2T0Gq;

import HR5vAalpgOKVm2T0Gq.pbVGzGjWvY2LDXC8vo;
import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 extends pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7 {
    public static Account HJFh0TGMpafqLE9haL(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        Account accountHusNiw3snxdgZPAGJm = null;
        if (pbvgzgjwvy2ldxc8vo != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    accountHusNiw3snxdgZPAGJm = pbvgzgjwvy2ldxc8vo.husNiw3snxdgZPAGJm();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountHusNiw3snxdgZPAGJm;
    }
}
