package HR5vAalpgOKVm2T0Gq;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class hoXrIDAFrSwfShk8da {
    public static Object Acstmh57AKoSEkEFNJ(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static void HJFh0TGMpafqLE9haL(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void IPyIQcaNa8aB7drBED() {
        pbVGzGjWvY2LDXC8vo("Must not be called on the main application thread");
    }

    public static void KYHag8HRDlnO3X9zmZ() {
        TCyPEKSzIyweCN5yp1("Must not be called on GoogleApiHandler thread.");
    }

    public static void T9PhQIpGRhE4yZDm1C(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void TCyPEKSzIyweCN5yp1(String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException(str);
            }
        }
    }

    public static Object Z9WdNiOsPR0y54zHW4(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void e54J8UWNHWALQNixXM(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static String husNiw3snxdgZPAGJm(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    public static void lEeR5KfoEr4xU5yHH7(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void pbVGzGjWvY2LDXC8vo(String str) {
        if (fDXXEWvhMVO3O8mnuS.aPyGSIylzVNKPT1Bls.lEeR5KfoEr4xU5yHH7()) {
            throw new IllegalStateException(str);
        }
    }

    public static void s3fjYDxWOUexjjVgyA(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static String zZKhbgvUfsK4AEX3r0(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }
}
