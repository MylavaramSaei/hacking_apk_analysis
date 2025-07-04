package SF66oTSCsXABfwyWiU;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class hoXrIDAFrSwfShk8da {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Object f1464HJFh0TGMpafqLE9haL = new Object();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static evSiTWao80SbJUZk9E f1465zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f1466lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Executor f1467s3fjYDxWOUexjjVgyA = new hUNBy66ZO1wVLJGW3l.husNiw3snxdgZPAGJm();

    public hoXrIDAFrSwfShk8da(Context context) {
        this.f1466lEeR5KfoEr4xU5yHH7 = context;
    }

    public static /* synthetic */ JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo Acstmh57AKoSEkEFNJ(Context context, Intent intent, boolean z, JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        return (fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1() && ((Integer) pbvgzgjwvy2ldxc8vo.Z9WdNiOsPR0y54zHW4()).intValue() == 402) ? husNiw3snxdgZPAGJm(context, intent, z).IPyIQcaNa8aB7drBED(new hUNBy66ZO1wVLJGW3l.husNiw3snxdgZPAGJm(), new JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7() { // from class: SF66oTSCsXABfwyWiU.e54J8UWNHWALQNixXM
            @Override // JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7
            public final Object lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo2) {
                return hoXrIDAFrSwfShk8da.pbVGzGjWvY2LDXC8vo(pbvgzgjwvy2ldxc8vo2);
            }
        }) : pbvgzgjwvy2ldxc8vo;
    }

    public static /* synthetic */ Integer IPyIQcaNa8aB7drBED(Context context, Intent intent) {
        return Integer.valueOf(cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA().TCyPEKSzIyweCN5yp1(context, intent));
    }

    public static evSiTWao80SbJUZk9E KYHag8HRDlnO3X9zmZ(Context context, String str) {
        evSiTWao80SbJUZk9E evsitwao80sbjuzk9e;
        synchronized (f1464HJFh0TGMpafqLE9haL) {
            try {
                if (f1465zZKhbgvUfsK4AEX3r0 == null) {
                    f1465zZKhbgvUfsK4AEX3r0 = new evSiTWao80SbJUZk9E(context, str);
                }
                evsitwao80sbjuzk9e = f1465zZKhbgvUfsK4AEX3r0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return evsitwao80sbjuzk9e;
    }

    public static /* synthetic */ Integer TCyPEKSzIyweCN5yp1(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        return -1;
    }

    public static JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo husNiw3snxdgZPAGJm(Context context, Intent intent, boolean z) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        evSiTWao80SbJUZk9E evsitwao80sbjuzk9eKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z) {
            return evsitwao80sbjuzk9eKYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0(intent).IPyIQcaNa8aB7drBED(new hUNBy66ZO1wVLJGW3l.husNiw3snxdgZPAGJm(), new JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7() { // from class: SF66oTSCsXABfwyWiU.T9PhQIpGRhE4yZDm1C
                @Override // JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7
                public final Object lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
                    return hoXrIDAFrSwfShk8da.TCyPEKSzIyweCN5yp1(pbvgzgjwvy2ldxc8vo);
                }
            });
        }
        if (cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm(context)) {
            Pum9NZyDBKoCnecvlx.KYHag8HRDlnO3X9zmZ(context, evsitwao80sbjuzk9eKYHag8HRDlnO3X9zmZ, intent);
        } else {
            evsitwao80sbjuzk9eKYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0(intent);
        }
        return JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm(-1);
    }

    public static /* synthetic */ Integer pbVGzGjWvY2LDXC8vo(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        return 403;
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo Z9WdNiOsPR0y54zHW4(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return e54J8UWNHWALQNixXM(this.f1466lEeR5KfoEr4xU5yHH7, intent);
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo e54J8UWNHWALQNixXM(final Context context, final Intent intent) {
        boolean z = fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL(this.f1467s3fjYDxWOUexjjVgyA, new Callable() { // from class: SF66oTSCsXABfwyWiU.Acstmh57AKoSEkEFNJ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return hoXrIDAFrSwfShk8da.IPyIQcaNa8aB7drBED(context, intent);
            }
        }).pbVGzGjWvY2LDXC8vo(this.f1467s3fjYDxWOUexjjVgyA, new JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7() { // from class: SF66oTSCsXABfwyWiU.Z9WdNiOsPR0y54zHW4
            @Override // JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7
            public final Object lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
                return hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(context, intent, z2, pbvgzgjwvy2ldxc8vo);
            }
        }) : husNiw3snxdgZPAGJm(context, intent, z2);
    }
}
