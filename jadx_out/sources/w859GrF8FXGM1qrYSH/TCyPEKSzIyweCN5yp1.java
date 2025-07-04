package w859GrF8FXGM1qrYSH;

import android.text.TextUtils;
import fB1XGht2x9XoIgekQ8.KYHag8HRDlnO3X9zmZ;
import fB1XGht2x9XoIgekQ8.zZKhbgvUfsK4AEX3r0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import w859GrF8FXGM1qrYSH.pbVGzGjWvY2LDXC8vo;
import zWzrlx9vIdLp7FoEMD.LIMtzhnLwQyigzK0KO;

/* loaded from: classes.dex */
public class TCyPEKSzIyweCN5yp1 implements IPyIQcaNa8aB7drBED {

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public static final Object f7208T9PhQIpGRhE4yZDm1C = new Object();

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public static final ThreadFactory f7209hoXrIDAFrSwfShk8da = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public String f7210Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final sKvjC8bExN3ISwwWsb.HJFh0TGMpafqLE9haL f7211HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final ExecutorService f7212IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final hoXrIDAFrSwfShk8da f7213KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final Object f7214TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public Set f7215Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final List f7216e54J8UWNHWALQNixXM;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final LIMtzhnLwQyigzK0KO f7217husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm f7218lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final Executor f7219pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final fB1XGht2x9XoIgekQ8.HJFh0TGMpafqLE9haL f7220s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final OANkd3mP6AYvwbNLJM f7221zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 implements ThreadFactory {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final AtomicInteger f7222lEeR5KfoEr4xU5yHH7 = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f7222lEeR5KfoEr4xU5yHH7.getAndIncrement())));
        }
    }

    public static /* synthetic */ class s3fjYDxWOUexjjVgyA {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final /* synthetic */ int[] f7223lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public static final /* synthetic */ int[] f7224s3fjYDxWOUexjjVgyA;

        static {
            int[] iArr = new int[KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.values().length];
            f7224s3fjYDxWOUexjjVgyA = iArr;
            try {
                iArr[KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7224s3fjYDxWOUexjjVgyA[KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7224s3fjYDxWOUexjjVgyA[KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA.values().length];
            f7223lEeR5KfoEr4xU5yHH7 = iArr2;
            try {
                iArr2[zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7223lEeR5KfoEr4xU5yHH7[zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public TCyPEKSzIyweCN5yp1(ExecutorService executorService, Executor executor, sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, fB1XGht2x9XoIgekQ8.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, sKvjC8bExN3ISwwWsb.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2, OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM, LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO, hoXrIDAFrSwfShk8da hoxridafrswfshk8da) {
        this.f7214TCyPEKSzIyweCN5yp1 = new Object();
        this.f7215Z9WdNiOsPR0y54zHW4 = new HashSet();
        this.f7216e54J8UWNHWALQNixXM = new ArrayList();
        this.f7218lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm;
        this.f7220s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL;
        this.f7211HJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL2;
        this.f7221zZKhbgvUfsK4AEX3r0 = oANkd3mP6AYvwbNLJM;
        this.f7217husNiw3snxdgZPAGJm = lIMtzhnLwQyigzK0KO;
        this.f7213KYHag8HRDlnO3X9zmZ = hoxridafrswfshk8da;
        this.f7212IPyIQcaNa8aB7drBED = executorService;
        this.f7219pbVGzGjWvY2LDXC8vo = executor;
    }

    public static /* synthetic */ sKvjC8bExN3ISwwWsb.s3fjYDxWOUexjjVgyA VItLRw50eXTZeEfGl0(sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        return new sKvjC8bExN3ISwwWsb.s3fjYDxWOUexjjVgyA(husniw3snxdgzpagjm);
    }

    public static TCyPEKSzIyweCN5yp1 zaq8hOURtfwbcX17cG(sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA(husniw3snxdgzpagjm != null, "Null is not a valid value of FirebaseApp.");
        return (TCyPEKSzIyweCN5yp1) husniw3snxdgzpagjm.pbVGzGjWvY2LDXC8vo(IPyIQcaNa8aB7drBED.class);
    }

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: merged with bridge method [inline-methods] */
    public final void xHA29AmDt6y96AnB3t(boolean z) {
        sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0Ao3wqKm5CXFuvC0q47;
        Exception iOException;
        sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0STkWmhpZ5b1ArQIw4K = sTkWmhpZ5b1ArQIw4K();
        try {
            if (zzkhbgvufsk4aex3r0STkWmhpZ5b1ArQIw4K.pbVGzGjWvY2LDXC8vo() || zzkhbgvufsk4aex3r0STkWmhpZ5b1ArQIw4K.e54J8UWNHWALQNixXM()) {
                zzkhbgvufsk4aex3r0Ao3wqKm5CXFuvC0q47 = ao3wqKm5CXFuvC0q47(zzkhbgvufsk4aex3r0STkWmhpZ5b1ArQIw4K);
            } else {
                if (!z && !this.f7221zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(zzkhbgvufsk4aex3r0STkWmhpZ5b1ArQIw4K)) {
                    return;
                }
                zzkhbgvufsk4aex3r0Ao3wqKm5CXFuvC0q47 = e54J8UWNHWALQNixXM(zzkhbgvufsk4aex3r0STkWmhpZ5b1ArQIw4K);
            }
            G7AC3DWIx9i9fdanjk(zzkhbgvufsk4aex3r0Ao3wqKm5CXFuvC0q47);
            tXWeW0sqVddf7ZBflq(zzkhbgvufsk4aex3r0STkWmhpZ5b1ArQIw4K, zzkhbgvufsk4aex3r0Ao3wqKm5CXFuvC0q47);
            if (zzkhbgvufsk4aex3r0Ao3wqKm5CXFuvC0q47.Z9WdNiOsPR0y54zHW4()) {
                XzJ1BS7H9Ilbkv4eVM(zzkhbgvufsk4aex3r0Ao3wqKm5CXFuvC0q47.zZKhbgvUfsK4AEX3r0());
            }
            if (zzkhbgvufsk4aex3r0Ao3wqKm5CXFuvC0q47.pbVGzGjWvY2LDXC8vo()) {
                iOException = new pbVGzGjWvY2LDXC8vo(pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7.BAD_CONFIG);
            } else {
                if (!zzkhbgvufsk4aex3r0Ao3wqKm5CXFuvC0q47.Acstmh57AKoSEkEFNJ()) {
                    jCtUeU2YI1poCxWcjm(zzkhbgvufsk4aex3r0Ao3wqKm5CXFuvC0q47);
                    return;
                }
                iOException = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            }
            OUd9THiLjZndMj0qdF(iOException);
        } catch (pbVGzGjWvY2LDXC8vo e) {
            OUd9THiLjZndMj0qdF(e);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void G7AC3DWIx9i9fdanjk(sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        synchronized (f7208T9PhQIpGRhE4yZDm1C) {
            try {
                w859GrF8FXGM1qrYSH.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 = w859GrF8FXGM1qrYSH.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f7218lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(), "generatefid.lock");
                try {
                    this.f7211HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(zzkhbgvufsk4aex3r0);
                    if (s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 != null) {
                        s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
                    }
                } catch (Throwable th) {
                    if (s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 != null) {
                        s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo IPyIQcaNa8aB7drBED() {
        JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = new JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ();
        pbVGzGjWvY2LDXC8vo(new e54J8UWNHWALQNixXM(acstmh57AKoSEkEFNJ));
        return acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
    }

    public final /* synthetic */ void LIMtzhnLwQyigzK0KO() {
        A49QRPHynYLCBN0SqP(false);
    }

    public final sKvjC8bExN3ISwwWsb.s3fjYDxWOUexjjVgyA OANkd3mP6AYvwbNLJM() {
        return (sKvjC8bExN3ISwwWsb.s3fjYDxWOUexjjVgyA) this.f7217husNiw3snxdgZPAGJm.get();
    }

    public final void OUd9THiLjZndMj0qdF(Exception exc) {
        synchronized (this.f7214TCyPEKSzIyweCN5yp1) {
            try {
                Iterator it = this.f7216e54J8UWNHWALQNixXM.iterator();
                while (it.hasNext()) {
                    if (((aPyGSIylzVNKPT1Bls) it.next()).s3fjYDxWOUexjjVgyA(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String R9SAhYMerGybF9OAjL() {
        return this.f7218lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C().husNiw3snxdgZPAGJm();
    }

    public String T9PhQIpGRhE4yZDm1C() {
        return this.f7218lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C().s3fjYDxWOUexjjVgyA();
    }

    public final JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo TCyPEKSzIyweCN5yp1() {
        JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = new JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ();
        pbVGzGjWvY2LDXC8vo(new Z9WdNiOsPR0y54zHW4(this.f7221zZKhbgvUfsK4AEX3r0, acstmh57AKoSEkEFNJ));
        return acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
    }

    public final String THTDvPxsHqMeGb512f(sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        if ((!this.f7218lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM().equals("CHIME_ANDROID_SDK") && !this.f7218lEeR5KfoEr4xU5yHH7.R9SAhYMerGybF9OAjL()) || !zzkhbgvufsk4aex3r0.T9PhQIpGRhE4yZDm1C()) {
            return this.f7213KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7();
        }
        String strKYHag8HRDlnO3X9zmZ = OANkd3mP6AYvwbNLJM().KYHag8HRDlnO3X9zmZ();
        return TextUtils.isEmpty(strKYHag8HRDlnO3X9zmZ) ? this.f7213KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7() : strKYHag8HRDlnO3X9zmZ;
    }

    public final void WWC27LAMFqFFBzfbNw() {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.husNiw3snxdgZPAGJm(hoXrIDAFrSwfShk8da(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.husNiw3snxdgZPAGJm(R9SAhYMerGybF9OAjL(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.husNiw3snxdgZPAGJm(T9PhQIpGRhE4yZDm1C(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA(OANkd3mP6AYvwbNLJM.IPyIQcaNa8aB7drBED(hoXrIDAFrSwfShk8da()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA(OANkd3mP6AYvwbNLJM.TCyPEKSzIyweCN5yp1(T9PhQIpGRhE4yZDm1C()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final synchronized void XzJ1BS7H9Ilbkv4eVM(String str) {
        this.f7210Acstmh57AKoSEkEFNJ = str;
    }

    /* JADX WARN: Finally extract failed */
    public final sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 Y43RdunnpKgpbny0lE() {
        sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 zZKhbgvUfsK4AEX3r02;
        synchronized (f7208T9PhQIpGRhE4yZDm1C) {
            try {
                w859GrF8FXGM1qrYSH.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 = w859GrF8FXGM1qrYSH.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f7218lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(), "generatefid.lock");
                try {
                    zZKhbgvUfsK4AEX3r02 = this.f7211HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0();
                    if (zZKhbgvUfsK4AEX3r02.Acstmh57AKoSEkEFNJ()) {
                        zZKhbgvUfsK4AEX3r02 = this.f7211HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(zZKhbgvUfsK4AEX3r02.R9SAhYMerGybF9OAjL(THTDvPxsHqMeGb512f(zZKhbgvUfsK4AEX3r02)));
                    }
                    if (s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 != null) {
                        s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
                    }
                } catch (Throwable th) {
                    if (s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 != null) {
                        s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zZKhbgvUfsK4AEX3r02;
    }

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: merged with bridge method [inline-methods] */
    public final void A49QRPHynYLCBN0SqP(final boolean z) {
        sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0Y43RdunnpKgpbny0lE = Y43RdunnpKgpbny0lE();
        if (z) {
            zzkhbgvufsk4aex3r0Y43RdunnpKgpbny0lE = zzkhbgvufsk4aex3r0Y43RdunnpKgpbny0lE.OANkd3mP6AYvwbNLJM();
        }
        jCtUeU2YI1poCxWcjm(zzkhbgvufsk4aex3r0Y43RdunnpKgpbny0lE);
        this.f7219pbVGzGjWvY2LDXC8vo.execute(new Runnable() { // from class: w859GrF8FXGM1qrYSH.KYHag8HRDlnO3X9zmZ
            @Override // java.lang.Runnable
            public final void run() {
                this.f7202lEeR5KfoEr4xU5yHH7.xHA29AmDt6y96AnB3t(z);
            }
        });
    }

    public final synchronized String aPyGSIylzVNKPT1Bls() {
        return this.f7210Acstmh57AKoSEkEFNJ;
    }

    public final sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 ao3wqKm5CXFuvC0q47(sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) throws pbVGzGjWvY2LDXC8vo {
        fB1XGht2x9XoIgekQ8.zZKhbgvUfsK4AEX3r0 zZKhbgvUfsK4AEX3r02 = this.f7220s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(T9PhQIpGRhE4yZDm1C(), zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0(), R9SAhYMerGybF9OAjL(), hoXrIDAFrSwfShk8da(), (zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0() == null || zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0().length() != 11) ? null : OANkd3mP6AYvwbNLJM().pbVGzGjWvY2LDXC8vo());
        int i = s3fjYDxWOUexjjVgyA.f7223lEeR5KfoEr4xU5yHH7[zZKhbgvUfsK4AEX3r02.husNiw3snxdgZPAGJm().ordinal()];
        if (i == 1) {
            return zzkhbgvufsk4aex3r0.Y43RdunnpKgpbny0lE(zZKhbgvUfsK4AEX3r02.HJFh0TGMpafqLE9haL(), zZKhbgvUfsK4AEX3r02.zZKhbgvUfsK4AEX3r0(), this.f7221zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA(), zZKhbgvUfsK4AEX3r02.s3fjYDxWOUexjjVgyA().HJFh0TGMpafqLE9haL(), zZKhbgvUfsK4AEX3r02.s3fjYDxWOUexjjVgyA().zZKhbgvUfsK4AEX3r0());
        }
        if (i == 2) {
            return zzkhbgvufsk4aex3r0.zaq8hOURtfwbcX17cG("BAD CONFIG");
        }
        throw new pbVGzGjWvY2LDXC8vo("Firebase Installations Service is unavailable. Please try again later.", pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7.UNAVAILABLE);
    }

    public final sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 e54J8UWNHWALQNixXM(sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) throws pbVGzGjWvY2LDXC8vo {
        fB1XGht2x9XoIgekQ8.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZHusNiw3snxdgZPAGJm = this.f7220s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(T9PhQIpGRhE4yZDm1C(), zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0(), R9SAhYMerGybF9OAjL(), zzkhbgvufsk4aex3r0.KYHag8HRDlnO3X9zmZ());
        int i = s3fjYDxWOUexjjVgyA.f7224s3fjYDxWOUexjjVgyA[kYHag8HRDlnO3X9zmZHusNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA().ordinal()];
        if (i == 1) {
            return zzkhbgvufsk4aex3r0.aPyGSIylzVNKPT1Bls(kYHag8HRDlnO3X9zmZHusNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL(), kYHag8HRDlnO3X9zmZHusNiw3snxdgZPAGJm.zZKhbgvUfsK4AEX3r0(), this.f7221zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA());
        }
        if (i == 2) {
            return zzkhbgvufsk4aex3r0.zaq8hOURtfwbcX17cG("BAD CONFIG");
        }
        if (i != 3) {
            throw new pbVGzGjWvY2LDXC8vo("Firebase Installations Service is unavailable. Please try again later.", pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7.UNAVAILABLE);
        }
        XzJ1BS7H9Ilbkv4eVM(null);
        return zzkhbgvufsk4aex3r0.sTkWmhpZ5b1ArQIw4K();
    }

    public String hoXrIDAFrSwfShk8da() {
        return this.f7218lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C().HJFh0TGMpafqLE9haL();
    }

    public final void jCtUeU2YI1poCxWcjm(sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        synchronized (this.f7214TCyPEKSzIyweCN5yp1) {
            try {
                Iterator it = this.f7216e54J8UWNHWALQNixXM.iterator();
                while (it.hasNext()) {
                    if (((aPyGSIylzVNKPT1Bls) it.next()).lEeR5KfoEr4xU5yHH7(zzkhbgvufsk4aex3r0)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w859GrF8FXGM1qrYSH.IPyIQcaNa8aB7drBED
    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo lEeR5KfoEr4xU5yHH7() {
        WWC27LAMFqFFBzfbNw();
        String strAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls();
        if (strAPyGSIylzVNKPT1Bls != null) {
            return JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm(strAPyGSIylzVNKPT1Bls);
        }
        JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED();
        this.f7212IPyIQcaNa8aB7drBED.execute(new Runnable() { // from class: w859GrF8FXGM1qrYSH.zZKhbgvUfsK4AEX3r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7245lEeR5KfoEr4xU5yHH7.LIMtzhnLwQyigzK0KO();
            }
        });
        return pbvgzgjwvy2ldxc8voIPyIQcaNa8aB7drBED;
    }

    public final void pbVGzGjWvY2LDXC8vo(aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        synchronized (this.f7214TCyPEKSzIyweCN5yp1) {
            this.f7216e54J8UWNHWALQNixXM.add(apygsiylzvnkpt1bls);
        }
    }

    @Override // w859GrF8FXGM1qrYSH.IPyIQcaNa8aB7drBED
    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo s3fjYDxWOUexjjVgyA(final boolean z) {
        WWC27LAMFqFFBzfbNw();
        JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1();
        this.f7212IPyIQcaNa8aB7drBED.execute(new Runnable() { // from class: w859GrF8FXGM1qrYSH.husNiw3snxdgZPAGJm
            @Override // java.lang.Runnable
            public final void run() {
                this.f7230lEeR5KfoEr4xU5yHH7.A49QRPHynYLCBN0SqP(z);
            }
        });
        return pbvgzgjwvy2ldxc8voTCyPEKSzIyweCN5yp1;
    }

    /* JADX WARN: Finally extract failed */
    public final sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 sTkWmhpZ5b1ArQIw4K() {
        sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 zZKhbgvUfsK4AEX3r02;
        synchronized (f7208T9PhQIpGRhE4yZDm1C) {
            try {
                w859GrF8FXGM1qrYSH.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 = w859GrF8FXGM1qrYSH.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f7218lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(), "generatefid.lock");
                try {
                    zZKhbgvUfsK4AEX3r02 = this.f7211HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0();
                    if (s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 != null) {
                        s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
                    }
                } catch (Throwable th) {
                    if (s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 != null) {
                        s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zZKhbgvUfsK4AEX3r02;
    }

    public final synchronized void tXWeW0sqVddf7ZBflq(sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, sKvjC8bExN3ISwwWsb.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r02) {
        if (this.f7215Z9WdNiOsPR0y54zHW4.size() != 0 && !TextUtils.equals(zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0(), zzkhbgvufsk4aex3r02.zZKhbgvUfsK4AEX3r0())) {
            Iterator it = this.f7215Z9WdNiOsPR0y54zHW4.iterator();
            if (it.hasNext()) {
                androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(it.next());
                zzkhbgvufsk4aex3r02.zZKhbgvUfsK4AEX3r0();
                throw null;
            }
        }
    }

    public TCyPEKSzIyweCN5yp1(final sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, ExecutorService executorService, Executor executor) {
        this(executorService, executor, husniw3snxdgzpagjm, new fB1XGht2x9XoIgekQ8.HJFh0TGMpafqLE9haL(husniw3snxdgzpagjm.Acstmh57AKoSEkEFNJ(), s3fjydxwouexjjvgya), new sKvjC8bExN3ISwwWsb.HJFh0TGMpafqLE9haL(husniw3snxdgzpagjm), OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL(), new LIMtzhnLwQyigzK0KO(new xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA() { // from class: w859GrF8FXGM1qrYSH.HJFh0TGMpafqLE9haL
            @Override // xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA
            public final Object get() {
                return TCyPEKSzIyweCN5yp1.VItLRw50eXTZeEfGl0(husniw3snxdgzpagjm);
            }
        }), new hoXrIDAFrSwfShk8da());
    }
}
