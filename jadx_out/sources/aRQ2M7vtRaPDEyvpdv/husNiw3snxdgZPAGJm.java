package aRQ2M7vtRaPDEyvpdv;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class husNiw3snxdgZPAGJm implements Handler.Callback {

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public static husNiw3snxdgZPAGJm f2490G7AC3DWIx9i9fdanjk;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final f2zPq7MOnQrtOlZ1Zg.TCyPEKSzIyweCN5yp1 f2496IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public HR5vAalpgOKVm2T0Gq.R9SAhYMerGybF9OAjL f2497KYHag8HRDlnO3X9zmZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public final Handler f2498OANkd3mP6AYvwbNLJM;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final Context f2500TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public HR5vAalpgOKVm2T0Gq.sTkWmhpZ5b1ArQIw4K f2505husNiw3snxdgZPAGJm;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final HR5vAalpgOKVm2T0Gq.XzJ1BS7H9Ilbkv4eVM f2507pbVGzGjWvY2LDXC8vo;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public volatile boolean f2510zaq8hOURtfwbcX17cG;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public static final Status f2493sTkWmhpZ5b1ArQIw4K = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public static final Status f2492Y43RdunnpKgpbny0lE = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public static final Object f2491R9SAhYMerGybF9OAjL = new Object();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public long f2506lEeR5KfoEr4xU5yHH7 = 5000;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public long f2508s3fjYDxWOUexjjVgyA = 120000;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public long f2495HJFh0TGMpafqLE9haL = 10000;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f2509zZKhbgvUfsK4AEX3r0 = false;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final AtomicInteger f2494Acstmh57AKoSEkEFNJ = new AtomicInteger(1);

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final AtomicInteger f2501Z9WdNiOsPR0y54zHW4 = new AtomicInteger(0);

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final Map f2503e54J8UWNHWALQNixXM = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public OANkd3mP6AYvwbNLJM f2499T9PhQIpGRhE4yZDm1C = null;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public final Set f2504hoXrIDAFrSwfShk8da = new Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA();

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public final Set f2502aPyGSIylzVNKPT1Bls = new Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA();

    public husNiw3snxdgZPAGJm(Context context, Looper looper, f2zPq7MOnQrtOlZ1Zg.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1) {
        this.f2510zaq8hOURtfwbcX17cG = true;
        this.f2500TCyPEKSzIyweCN5yp1 = context;
        uAIIhSQWhOmxUb3Bqo.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = new uAIIhSQWhOmxUb3Bqo.KYHag8HRDlnO3X9zmZ(looper, this);
        this.f2498OANkd3mP6AYvwbNLJM = kYHag8HRDlnO3X9zmZ;
        this.f2496IPyIQcaNa8aB7drBED = tCyPEKSzIyweCN5yp1;
        this.f2507pbVGzGjWvY2LDXC8vo = new HR5vAalpgOKVm2T0Gq.XzJ1BS7H9Ilbkv4eVM(tCyPEKSzIyweCN5yp1);
        if (fDXXEWvhMVO3O8mnuS.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(context)) {
            this.f2510zaq8hOURtfwbcX17cG = false;
        }
        kYHag8HRDlnO3X9zmZ.sendMessage(kYHag8HRDlnO3X9zmZ.obtainMessage(6));
    }

    public static husNiw3snxdgZPAGJm A49QRPHynYLCBN0SqP(Context context) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm;
        synchronized (f2491R9SAhYMerGybF9OAjL) {
            try {
                if (f2490G7AC3DWIx9i9fdanjk == null) {
                    f2490G7AC3DWIx9i9fdanjk = new husNiw3snxdgZPAGJm(context.getApplicationContext(), HR5vAalpgOKVm2T0Gq.IPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA().getLooper(), f2zPq7MOnQrtOlZ1Zg.TCyPEKSzIyweCN5yp1.e54J8UWNHWALQNixXM());
                }
                husniw3snxdgzpagjm = f2490G7AC3DWIx9i9fdanjk;
            } catch (Throwable th) {
                throw th;
            }
        }
        return husniw3snxdgzpagjm;
    }

    public static Status IPyIQcaNa8aB7drBED(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        String strS3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA();
        String strValueOf = String.valueOf(leer5kfoer4xu5yhh7);
        StringBuilder sb = new StringBuilder(String.valueOf(strS3fjYDxWOUexjjVgyA).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(strS3fjYDxWOUexjjVgyA);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(leer5kfoer4xu5yhh7, sb.toString());
    }

    public final HR5vAalpgOKVm2T0Gq.R9SAhYMerGybF9OAjL Acstmh57AKoSEkEFNJ() {
        if (this.f2497KYHag8HRDlnO3X9zmZ == null) {
            this.f2497KYHag8HRDlnO3X9zmZ = HR5vAalpgOKVm2T0Gq.Y43RdunnpKgpbny0lE.lEeR5KfoEr4xU5yHH7(this.f2500TCyPEKSzIyweCN5yp1);
        }
        return this.f2497KYHag8HRDlnO3X9zmZ;
    }

    public final void HJFh0TGMpafqLE9haL(OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
        synchronized (f2491R9SAhYMerGybF9OAjL) {
            try {
                if (this.f2499T9PhQIpGRhE4yZDm1C != oANkd3mP6AYvwbNLJM) {
                    this.f2499T9PhQIpGRhE4yZDm1C = oANkd3mP6AYvwbNLJM;
                    this.f2504hoXrIDAFrSwfShk8da.clear();
                }
                this.f2504hoXrIDAFrSwfShk8da.addAll(oANkd3mP6AYvwbNLJM.R9SAhYMerGybF9OAjL());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean KYHag8HRDlnO3X9zmZ() {
        if (this.f2509zZKhbgvUfsK4AEX3r0) {
            return false;
        }
        HR5vAalpgOKVm2T0Gq.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJMLEeR5KfoEr4xU5yHH7 = HR5vAalpgOKVm2T0Gq.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA().lEeR5KfoEr4xU5yHH7();
        if (oANkd3mP6AYvwbNLJMLEeR5KfoEr4xU5yHH7 != null && !oANkd3mP6AYvwbNLJMLEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm()) {
            return false;
        }
        int iLEeR5KfoEr4xU5yHH7 = this.f2507pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(this.f2500TCyPEKSzIyweCN5yp1, 203400000);
        return iLEeR5KfoEr4xU5yHH7 == -1 || iLEeR5KfoEr4xU5yHH7 == 0;
    }

    public final A49QRPHynYLCBN0SqP LIMtzhnLwQyigzK0KO(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        return (A49QRPHynYLCBN0SqP) this.f2503e54J8UWNHWALQNixXM.get(s3fjydxwouexjjvgya);
    }

    public final int T9PhQIpGRhE4yZDm1C() {
        return this.f2494Acstmh57AKoSEkEFNJ.getAndIncrement();
    }

    public final boolean TCyPEKSzIyweCN5yp1(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i) {
        return this.f2496IPyIQcaNa8aB7drBED.xHA29AmDt6y96AnB3t(this.f2500TCyPEKSzIyweCN5yp1, leer5kfoer4xu5yhh7, i);
    }

    public final void XzJ1BS7H9Ilbkv4eVM(HR5vAalpgOKVm2T0Gq.e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm, int i, long j, int i2) {
        Handler handler = this.f2498OANkd3mP6AYvwbNLJM;
        handler.sendMessage(handler.obtainMessage(18, new OqIo5QF00RDxUQb4qq(e54j8uwnhwalqnixxm, i, j, i2)));
    }

    public final void Z9WdNiOsPR0y54zHW4() {
        HR5vAalpgOKVm2T0Gq.sTkWmhpZ5b1ArQIw4K stkwmhpz5b1arqiw4k = this.f2505husNiw3snxdgZPAGJm;
        if (stkwmhpz5b1arqiw4k != null) {
            if (stkwmhpz5b1arqiw4k.HJFh0TGMpafqLE9haL() > 0 || KYHag8HRDlnO3X9zmZ()) {
                Acstmh57AKoSEkEFNJ().lEeR5KfoEr4xU5yHH7(stkwmhpz5b1arqiw4k);
            }
            this.f2505husNiw3snxdgZPAGJm = null;
        }
    }

    public final void e54J8UWNHWALQNixXM(JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ, int i, HZ4bptRS9XIcK1CV95.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        W3RZ2dTDKrKpS5Mxdk w3RZ2dTDKrKpS5MxdkS3fjYDxWOUexjjVgyA;
        if (i == 0 || (w3RZ2dTDKrKpS5MxdkS3fjYDxWOUexjjVgyA = W3RZ2dTDKrKpS5Mxdk.s3fjYDxWOUexjjVgyA(this, i, zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0())) == null) {
            return;
        }
        JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voLEeR5KfoEr4xU5yHH7 = acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
        final Handler handler = this.f2498OANkd3mP6AYvwbNLJM;
        handler.getClass();
        pbvgzgjwvy2ldxc8voLEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(new Executor() { // from class: aRQ2M7vtRaPDEyvpdv.sTkWmhpZ5b1ArQIw4K
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, w3RZ2dTDKrKpS5MxdkS3fjYDxWOUexjjVgyA);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP = null;
        switch (i) {
            case 1:
                this.f2495HJFh0TGMpafqLE9haL = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f2498OANkd3mP6AYvwbNLJM.removeMessages(12);
                for (s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya : this.f2503e54J8UWNHWALQNixXM.keySet()) {
                    Handler handler = this.f2498OANkd3mP6AYvwbNLJM;
                    handler.sendMessageDelayed(handler.obtainMessage(12, s3fjydxwouexjjvgya), this.f2495HJFh0TGMpafqLE9haL);
                }
                return true;
            case 2:
                androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(message.obj);
                throw null;
            case 3:
                for (A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP2 : this.f2503e54J8UWNHWALQNixXM.values()) {
                    a49QRPHynYLCBN0SqP2.OUd9THiLjZndMj0qdF();
                    a49QRPHynYLCBN0SqP2.jCtUeU2YI1poCxWcjm();
                }
                return true;
            case 4:
            case 8:
            case 13:
                GyWRxpdt1T8mEJXPoD gyWRxpdt1T8mEJXPoD = (GyWRxpdt1T8mEJXPoD) message.obj;
                A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqPPbVGzGjWvY2LDXC8vo = (A49QRPHynYLCBN0SqP) this.f2503e54J8UWNHWALQNixXM.get(gyWRxpdt1T8mEJXPoD.f2415HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0());
                if (a49QRPHynYLCBN0SqPPbVGzGjWvY2LDXC8vo == null) {
                    a49QRPHynYLCBN0SqPPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(gyWRxpdt1T8mEJXPoD.f2415HJFh0TGMpafqLE9haL);
                }
                if (!a49QRPHynYLCBN0SqPPbVGzGjWvY2LDXC8vo.KqgKJKIWne3kz1AdHk() || this.f2501Z9WdNiOsPR0y54zHW4.get() == gyWRxpdt1T8mEJXPoD.f2417s3fjYDxWOUexjjVgyA) {
                    a49QRPHynYLCBN0SqPPbVGzGjWvY2LDXC8vo.XzJ1BS7H9Ilbkv4eVM(gyWRxpdt1T8mEJXPoD.f2416lEeR5KfoEr4xU5yHH7);
                } else {
                    gyWRxpdt1T8mEJXPoD.f2416lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(f2493sTkWmhpZ5b1ArQIw4K);
                    a49QRPHynYLCBN0SqPPbVGzGjWvY2LDXC8vo.DfpieXfdYs58yZAiXY();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7) message.obj;
                Iterator it = this.f2503e54J8UWNHWALQNixXM.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP3 = (A49QRPHynYLCBN0SqP) it.next();
                        if (a49QRPHynYLCBN0SqP3.sTkWmhpZ5b1ArQIw4K() == i2) {
                            a49QRPHynYLCBN0SqP = a49QRPHynYLCBN0SqP3;
                        }
                    }
                }
                if (a49QRPHynYLCBN0SqP == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                } else if (leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL() == 13) {
                    String strZZKhbgvUfsK4AEX3r0 = this.f2496IPyIQcaNa8aB7drBED.zZKhbgvUfsK4AEX3r0(leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL());
                    String strZZKhbgvUfsK4AEX3r02 = leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZZKhbgvUfsK4AEX3r0).length() + 69 + String.valueOf(strZZKhbgvUfsK4AEX3r02).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(strZZKhbgvUfsK4AEX3r0);
                    sb2.append(": ");
                    sb2.append(strZZKhbgvUfsK4AEX3r02);
                    a49QRPHynYLCBN0SqP.TCyPEKSzIyweCN5yp1(new Status(17, sb2.toString()));
                } else {
                    a49QRPHynYLCBN0SqP.TCyPEKSzIyweCN5yp1(IPyIQcaNa8aB7drBED(a49QRPHynYLCBN0SqP.f2397HJFh0TGMpafqLE9haL, leer5kfoer4xu5yhh7));
                }
                return true;
            case 6:
                if (this.f2500TCyPEKSzIyweCN5yp1.getApplicationContext() instanceof Application) {
                    HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL((Application) this.f2500TCyPEKSzIyweCN5yp1.getApplicationContext());
                    HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA().lEeR5KfoEr4xU5yHH7(new Y43RdunnpKgpbny0lE(this));
                    if (!HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm(true)) {
                        this.f2495HJFh0TGMpafqLE9haL = 300000L;
                    }
                }
                return true;
            case 7:
                pbVGzGjWvY2LDXC8vo((HZ4bptRS9XIcK1CV95.zZKhbgvUfsK4AEX3r0) message.obj);
                return true;
            case 9:
                if (this.f2503e54J8UWNHWALQNixXM.containsKey(message.obj)) {
                    ((A49QRPHynYLCBN0SqP) this.f2503e54J8UWNHWALQNixXM.get(message.obj)).GyWRxpdt1T8mEJXPoD();
                }
                return true;
            case 10:
                Iterator it2 = this.f2502aPyGSIylzVNKPT1Bls.iterator();
                while (it2.hasNext()) {
                    A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP4 = (A49QRPHynYLCBN0SqP) this.f2503e54J8UWNHWALQNixXM.remove((s3fjYDxWOUexjjVgyA) it2.next());
                    if (a49QRPHynYLCBN0SqP4 != null) {
                        a49QRPHynYLCBN0SqP4.DfpieXfdYs58yZAiXY();
                    }
                }
                this.f2502aPyGSIylzVNKPT1Bls.clear();
                return true;
            case 11:
                if (this.f2503e54J8UWNHWALQNixXM.containsKey(message.obj)) {
                    ((A49QRPHynYLCBN0SqP) this.f2503e54J8UWNHWALQNixXM.get(message.obj)).e2F9F6h8YJxTHwLCa0();
                }
                return true;
            case 12:
                if (this.f2503e54J8UWNHWALQNixXM.containsKey(message.obj)) {
                    ((A49QRPHynYLCBN0SqP) this.f2503e54J8UWNHWALQNixXM.get(message.obj)).zZKhbgvUfsK4AEX3r0();
                }
                return true;
            case 14:
                androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(message.obj);
                throw null;
            case 15:
                WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw = (WWC27LAMFqFFBzfbNw) message.obj;
                if (this.f2503e54J8UWNHWALQNixXM.containsKey(wWC27LAMFqFFBzfbNw.f2460lEeR5KfoEr4xU5yHH7)) {
                    A49QRPHynYLCBN0SqP.THTDvPxsHqMeGb512f((A49QRPHynYLCBN0SqP) this.f2503e54J8UWNHWALQNixXM.get(wWC27LAMFqFFBzfbNw.f2460lEeR5KfoEr4xU5yHH7), wWC27LAMFqFFBzfbNw);
                }
                return true;
            case 16:
                WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw2 = (WWC27LAMFqFFBzfbNw) message.obj;
                if (this.f2503e54J8UWNHWALQNixXM.containsKey(wWC27LAMFqFFBzfbNw2.f2460lEeR5KfoEr4xU5yHH7)) {
                    A49QRPHynYLCBN0SqP.ao3wqKm5CXFuvC0q47((A49QRPHynYLCBN0SqP) this.f2503e54J8UWNHWALQNixXM.get(wWC27LAMFqFFBzfbNw2.f2460lEeR5KfoEr4xU5yHH7), wWC27LAMFqFFBzfbNw2);
                }
                return true;
            case 17:
                Z9WdNiOsPR0y54zHW4();
                return true;
            case 18:
                OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq = (OqIo5QF00RDxUQb4qq) message.obj;
                if (oqIo5QF00RDxUQb4qq.f2428HJFh0TGMpafqLE9haL == 0) {
                    Acstmh57AKoSEkEFNJ().lEeR5KfoEr4xU5yHH7(new HR5vAalpgOKVm2T0Gq.sTkWmhpZ5b1ArQIw4K(oqIo5QF00RDxUQb4qq.f2430s3fjYDxWOUexjjVgyA, Arrays.asList(oqIo5QF00RDxUQb4qq.f2429lEeR5KfoEr4xU5yHH7)));
                } else {
                    HR5vAalpgOKVm2T0Gq.sTkWmhpZ5b1ArQIw4K stkwmhpz5b1arqiw4k = this.f2505husNiw3snxdgZPAGJm;
                    if (stkwmhpz5b1arqiw4k != null) {
                        List listZZKhbgvUfsK4AEX3r0 = stkwmhpz5b1arqiw4k.zZKhbgvUfsK4AEX3r0();
                        if (stkwmhpz5b1arqiw4k.HJFh0TGMpafqLE9haL() != oqIo5QF00RDxUQb4qq.f2430s3fjYDxWOUexjjVgyA || (listZZKhbgvUfsK4AEX3r0 != null && listZZKhbgvUfsK4AEX3r0.size() >= oqIo5QF00RDxUQb4qq.f2431zZKhbgvUfsK4AEX3r0)) {
                            this.f2498OANkd3mP6AYvwbNLJM.removeMessages(17);
                            Z9WdNiOsPR0y54zHW4();
                        } else {
                            this.f2505husNiw3snxdgZPAGJm.husNiw3snxdgZPAGJm(oqIo5QF00RDxUQb4qq.f2429lEeR5KfoEr4xU5yHH7);
                        }
                    }
                    if (this.f2505husNiw3snxdgZPAGJm == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(oqIo5QF00RDxUQb4qq.f2429lEeR5KfoEr4xU5yHH7);
                        this.f2505husNiw3snxdgZPAGJm = new HR5vAalpgOKVm2T0Gq.sTkWmhpZ5b1ArQIw4K(oqIo5QF00RDxUQb4qq.f2430s3fjYDxWOUexjjVgyA, arrayList);
                        Handler handler2 = this.f2498OANkd3mP6AYvwbNLJM;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), oqIo5QF00RDxUQb4qq.f2428HJFh0TGMpafqLE9haL);
                    }
                }
                return true;
            case 19:
                this.f2509zZKhbgvUfsK4AEX3r0 = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    public final void jCtUeU2YI1poCxWcjm(HZ4bptRS9XIcK1CV95.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, int i, T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C, JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ, e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
        e54J8UWNHWALQNixXM(acstmh57AKoSEkEFNJ, t9PhQIpGRhE4yZDm1C.zZKhbgvUfsK4AEX3r0(), zzkhbgvufsk4aex3r0);
        XdzLv4NdAtTYoEzVzB xdzLv4NdAtTYoEzVzB = new XdzLv4NdAtTYoEzVzB(i, t9PhQIpGRhE4yZDm1C, acstmh57AKoSEkEFNJ, e54j8uwnhwalqnixxm);
        Handler handler = this.f2498OANkd3mP6AYvwbNLJM;
        handler.sendMessage(handler.obtainMessage(4, new GyWRxpdt1T8mEJXPoD(xdzLv4NdAtTYoEzVzB, this.f2501Z9WdNiOsPR0y54zHW4.get(), zzkhbgvufsk4aex3r0)));
    }

    public final void lEeR5KfoEr4xU5yHH7() {
        Handler handler = this.f2498OANkd3mP6AYvwbNLJM;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final A49QRPHynYLCBN0SqP pbVGzGjWvY2LDXC8vo(HZ4bptRS9XIcK1CV95.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaZZKhbgvUfsK4AEX3r0 = zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0();
        A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP = (A49QRPHynYLCBN0SqP) this.f2503e54J8UWNHWALQNixXM.get(s3fjydxwouexjjvgyaZZKhbgvUfsK4AEX3r0);
        if (a49QRPHynYLCBN0SqP == null) {
            a49QRPHynYLCBN0SqP = new A49QRPHynYLCBN0SqP(this, zzkhbgvufsk4aex3r0);
            this.f2503e54J8UWNHWALQNixXM.put(s3fjydxwouexjjvgyaZZKhbgvUfsK4AEX3r0, a49QRPHynYLCBN0SqP);
        }
        if (a49QRPHynYLCBN0SqP.KqgKJKIWne3kz1AdHk()) {
            this.f2502aPyGSIylzVNKPT1Bls.add(s3fjydxwouexjjvgyaZZKhbgvUfsK4AEX3r0);
        }
        a49QRPHynYLCBN0SqP.jCtUeU2YI1poCxWcjm();
        return a49QRPHynYLCBN0SqP;
    }

    public final void s3fjYDxWOUexjjVgyA(HZ4bptRS9XIcK1CV95.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        Handler handler = this.f2498OANkd3mP6AYvwbNLJM;
        handler.sendMessage(handler.obtainMessage(7, zzkhbgvufsk4aex3r0));
    }

    public final void tXWeW0sqVddf7ZBflq(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i) {
        if (TCyPEKSzIyweCN5yp1(leer5kfoer4xu5yhh7, i)) {
            return;
        }
        Handler handler = this.f2498OANkd3mP6AYvwbNLJM;
        handler.sendMessage(handler.obtainMessage(5, i, 0, leer5kfoer4xu5yhh7));
    }

    public final void zZKhbgvUfsK4AEX3r0(OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
        synchronized (f2491R9SAhYMerGybF9OAjL) {
            try {
                if (this.f2499T9PhQIpGRhE4yZDm1C == oANkd3mP6AYvwbNLJM) {
                    this.f2499T9PhQIpGRhE4yZDm1C = null;
                    this.f2504hoXrIDAFrSwfShk8da.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
