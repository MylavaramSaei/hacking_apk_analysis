package f2zPq7MOnQrtOlZ1Zg;

import HR5vAalpgOKVm2T0Gq.KqgKJKIWne3kz1AdHk;
import HR5vAalpgOKVm2T0Gq.eWK41qw3g36LVd4UnS;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class R9SAhYMerGybF9OAjL extends eWK41qw3g36LVd4UnS {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f5804lEeR5KfoEr4xU5yHH7;

    public R9SAhYMerGybF9OAjL(byte[] bArr) {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7(bArr.length == 25);
        this.f5804lEeR5KfoEr4xU5yHH7 = Arrays.hashCode(bArr);
    }

    public static byte[] s3fjYDxWOUexjjVgyA(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // HR5vAalpgOKVm2T0Gq.KqgKJKIWne3kz1AdHk
    public final int Acstmh57AKoSEkEFNJ() {
        return this.f5804lEeR5KfoEr4xU5yHH7;
    }

    public abstract byte[] HJFh0TGMpafqLE9haL();

    @Override // HR5vAalpgOKVm2T0Gq.KqgKJKIWne3kz1AdHk
    public final owCQzRKpGarpL4247z.lEeR5KfoEr4xU5yHH7 TCyPEKSzIyweCN5yp1() {
        return owCQzRKpGarpL4247z.s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(HJFh0TGMpafqLE9haL());
    }

    public final boolean equals(Object obj) {
        owCQzRKpGarpL4247z.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7TCyPEKSzIyweCN5yp1;
        if (obj != null && (obj instanceof KqgKJKIWne3kz1AdHk)) {
            try {
                KqgKJKIWne3kz1AdHk kqgKJKIWne3kz1AdHk = (KqgKJKIWne3kz1AdHk) obj;
                if (kqgKJKIWne3kz1AdHk.Acstmh57AKoSEkEFNJ() == this.f5804lEeR5KfoEr4xU5yHH7 && (leer5kfoer4xu5yhh7TCyPEKSzIyweCN5yp1 = kqgKJKIWne3kz1AdHk.TCyPEKSzIyweCN5yp1()) != null) {
                    return Arrays.equals(HJFh0TGMpafqLE9haL(), (byte[]) owCQzRKpGarpL4247z.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(leer5kfoer4xu5yhh7TCyPEKSzIyweCN5yp1));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5804lEeR5KfoEr4xU5yHH7;
    }
}
