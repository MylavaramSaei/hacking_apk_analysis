package aRQ2M7vtRaPDEyvpdv;

import HZ4bptRS9XIcK1CV95.husNiw3snxdgZPAGJm;
import HZ4bptRS9XIcK1CV95.lEeR5KfoEr4xU5yHH7;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class A49QRPHynYLCBN0SqP implements husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7, husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f2397HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final PPkm9uUfOJHHYveeLT f2398IPyIQcaNa8aB7drBED;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public final /* synthetic */ husNiw3snxdgZPAGJm f2400T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final int f2401TCyPEKSzIyweCN5yp1;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f2406pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ f2407s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final aPyGSIylzVNKPT1Bls f2408zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Queue f2405lEeR5KfoEr4xU5yHH7 = new LinkedList();

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final Set f2404husNiw3snxdgZPAGJm = new HashSet();

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final Map f2399KYHag8HRDlnO3X9zmZ = new HashMap();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final List f2396Acstmh57AKoSEkEFNJ = new ArrayList();

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 f2402Z9WdNiOsPR0y54zHW4 = null;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public int f2403e54J8UWNHWALQNixXM = 0;

    public A49QRPHynYLCBN0SqP(husNiw3snxdgZPAGJm husniw3snxdgzpagjm, HZ4bptRS9XIcK1CV95.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        this.f2400T9PhQIpGRhE4yZDm1C = husniw3snxdgzpagjm;
        lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1 = zzkhbgvufsk4aex3r0.TCyPEKSzIyweCN5yp1(husniw3snxdgzpagjm.f2498OANkd3mP6AYvwbNLJM.getLooper(), this);
        this.f2407s3fjYDxWOUexjjVgyA = kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1;
        this.f2397HJFh0TGMpafqLE9haL = zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0();
        this.f2408zZKhbgvUfsK4AEX3r0 = new aPyGSIylzVNKPT1Bls();
        this.f2401TCyPEKSzIyweCN5yp1 = zzkhbgvufsk4aex3r0.KYHag8HRDlnO3X9zmZ();
        if (kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1.T9PhQIpGRhE4yZDm1C()) {
            this.f2398IPyIQcaNa8aB7drBED = zzkhbgvufsk4aex3r0.IPyIQcaNa8aB7drBED(husniw3snxdgzpagjm.f2500TCyPEKSzIyweCN5yp1, husniw3snxdgzpagjm.f2498OANkd3mP6AYvwbNLJM);
        } else {
            this.f2398IPyIQcaNa8aB7drBED = null;
        }
    }

    public static /* bridge */ /* synthetic */ void THTDvPxsHqMeGb512f(A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (a49QRPHynYLCBN0SqP.f2396Acstmh57AKoSEkEFNJ.contains(wWC27LAMFqFFBzfbNw) && !a49QRPHynYLCBN0SqP.f2406pbVGzGjWvY2LDXC8vo) {
            if (a49QRPHynYLCBN0SqP.f2407s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL()) {
                a49QRPHynYLCBN0SqP.pbVGzGjWvY2LDXC8vo();
            } else {
                a49QRPHynYLCBN0SqP.jCtUeU2YI1poCxWcjm();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void ao3wqKm5CXFuvC0q47(A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP, WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        f2zPq7MOnQrtOlZ1Zg.HJFh0TGMpafqLE9haL[] hJFh0TGMpafqLE9haLArrTCyPEKSzIyweCN5yp1;
        if (a49QRPHynYLCBN0SqP.f2396Acstmh57AKoSEkEFNJ.remove(wWC27LAMFqFFBzfbNw)) {
            a49QRPHynYLCBN0SqP.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM.removeMessages(15, wWC27LAMFqFFBzfbNw);
            a49QRPHynYLCBN0SqP.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM.removeMessages(16, wWC27LAMFqFFBzfbNw);
            f2zPq7MOnQrtOlZ1Zg.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = wWC27LAMFqFFBzfbNw.f2461s3fjYDxWOUexjjVgyA;
            ArrayList arrayList = new ArrayList(a49QRPHynYLCBN0SqP.f2405lEeR5KfoEr4xU5yHH7.size());
            for (zcy2NNbtVXgoGQbfuq zcy2nnbtvxgogqbfuq : a49QRPHynYLCBN0SqP.f2405lEeR5KfoEr4xU5yHH7) {
                if ((zcy2nnbtvxgogqbfuq instanceof tXWeW0sqVddf7ZBflq) && (hJFh0TGMpafqLE9haLArrTCyPEKSzIyweCN5yp1 = ((tXWeW0sqVddf7ZBflq) zcy2nnbtvxgogqbfuq).TCyPEKSzIyweCN5yp1(a49QRPHynYLCBN0SqP)) != null && fDXXEWvhMVO3O8mnuS.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(hJFh0TGMpafqLE9haLArrTCyPEKSzIyweCN5yp1, hJFh0TGMpafqLE9haL)) {
                    arrayList.add(zcy2nnbtvxgogqbfuq);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zcy2NNbtVXgoGQbfuq zcy2nnbtvxgogqbfuq2 = (zcy2NNbtVXgoGQbfuq) arrayList.get(i);
                a49QRPHynYLCBN0SqP.f2405lEeR5KfoEr4xU5yHH7.remove(zcy2nnbtvxgogqbfuq2);
                zcy2nnbtvxgogqbfuq2.s3fjYDxWOUexjjVgyA(new HZ4bptRS9XIcK1CV95.TCyPEKSzIyweCN5yp1(hJFh0TGMpafqLE9haL));
            }
        }
    }

    public final void Acstmh57AKoSEkEFNJ() {
        OUd9THiLjZndMj0qdF();
        KYHag8HRDlnO3X9zmZ(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7.f5814husNiw3snxdgZPAGJm);
        hoXrIDAFrSwfShk8da();
        Iterator it = this.f2399KYHag8HRDlnO3X9zmZ.values().iterator();
        if (it.hasNext()) {
            androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(it.next());
            throw null;
        }
        pbVGzGjWvY2LDXC8vo();
        e54J8UWNHWALQNixXM();
    }

    public final void DfpieXfdYs58yZAiXY() {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM);
        TCyPEKSzIyweCN5yp1(husNiw3snxdgZPAGJm.f2493sTkWmhpZ5b1ArQIw4K);
        this.f2408zZKhbgvUfsK4AEX3r0.zZKhbgvUfsK4AEX3r0();
        for (IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED : (IPyIQcaNa8aB7drBED[]) this.f2399KYHag8HRDlnO3X9zmZ.keySet().toArray(new IPyIQcaNa8aB7drBED[0])) {
            XzJ1BS7H9Ilbkv4eVM(new LU0fFDMACqnfIfA1AZ(null, new JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ()));
        }
        KYHag8HRDlnO3X9zmZ(new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(4));
        if (this.f2407s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL()) {
            this.f2407s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(new LIMtzhnLwQyigzK0KO(this));
        }
    }

    public final lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ G7AC3DWIx9i9fdanjk() {
        return this.f2407s3fjYDxWOUexjjVgyA;
    }

    public final void GyWRxpdt1T8mEJXPoD() {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM);
        if (this.f2406pbVGzGjWvY2LDXC8vo) {
            jCtUeU2YI1poCxWcjm();
        }
    }

    @Override // aRQ2M7vtRaPDEyvpdv.zZKhbgvUfsK4AEX3r0
    public final void HJFh0TGMpafqLE9haL(Bundle bundle) {
        if (Looper.myLooper() == this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM.getLooper()) {
            Acstmh57AKoSEkEFNJ();
        } else {
            this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM.post(new R9SAhYMerGybF9OAjL(this));
        }
    }

    public final void IPyIQcaNa8aB7drBED(Status status, Exception exc, boolean z) {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f2405lEeR5KfoEr4xU5yHH7.iterator();
        while (it.hasNext()) {
            zcy2NNbtVXgoGQbfuq zcy2nnbtvxgogqbfuq = (zcy2NNbtVXgoGQbfuq) it.next();
            if (!z || zcy2nnbtvxgogqbfuq.f2526lEeR5KfoEr4xU5yHH7 == 2) {
                if (status != null) {
                    zcy2nnbtvxgogqbfuq.lEeR5KfoEr4xU5yHH7(status);
                } else {
                    zcy2nnbtvxgogqbfuq.s3fjYDxWOUexjjVgyA(exc);
                }
                it.remove();
            }
        }
    }

    public final void KYHag8HRDlnO3X9zmZ(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        Iterator it = this.f2404husNiw3snxdgZPAGJm.iterator();
        if (!it.hasNext()) {
            this.f2404husNiw3snxdgZPAGJm.clear();
            return;
        }
        androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(it.next());
        if (HR5vAalpgOKVm2T0Gq.T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7(leer5kfoer4xu5yhh7, f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7.f5814husNiw3snxdgZPAGJm)) {
            this.f2407s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0();
        }
        throw null;
    }

    public final boolean KqgKJKIWne3kz1AdHk() {
        return this.f2407s3fjYDxWOUexjjVgyA.T9PhQIpGRhE4yZDm1C();
    }

    public final Map LIMtzhnLwQyigzK0KO() {
        return this.f2399KYHag8HRDlnO3X9zmZ;
    }

    public final boolean OANkd3mP6AYvwbNLJM(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        synchronized (husNiw3snxdgZPAGJm.f2491R9SAhYMerGybF9OAjL) {
            try {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f2400T9PhQIpGRhE4yZDm1C;
                if (husniw3snxdgzpagjm.f2499T9PhQIpGRhE4yZDm1C == null || !husniw3snxdgzpagjm.f2504hoXrIDAFrSwfShk8da.contains(this.f2397HJFh0TGMpafqLE9haL)) {
                    return false;
                }
                this.f2400T9PhQIpGRhE4yZDm1C.f2499T9PhQIpGRhE4yZDm1C.Y43RdunnpKgpbny0lE(leer5kfoer4xu5yhh7, this.f2401TCyPEKSzIyweCN5yp1);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OUd9THiLjZndMj0qdF() {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM);
        this.f2402Z9WdNiOsPR0y54zHW4 = null;
    }

    public final void OqIo5QF00RDxUQb4qq(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM);
        lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = this.f2407s3fjYDxWOUexjjVgyA;
        String name = kYHag8HRDlnO3X9zmZ.getClass().getName();
        String strValueOf = String.valueOf(leer5kfoer4xu5yhh7);
        StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(strValueOf);
        kYHag8HRDlnO3X9zmZ.e54J8UWNHWALQNixXM(sb.toString());
        W3RZ2dTDKrKpS5Mxdk(leer5kfoer4xu5yhh7, null);
    }

    public final void T9PhQIpGRhE4yZDm1C(zcy2NNbtVXgoGQbfuq zcy2nnbtvxgogqbfuq) {
        zcy2nnbtvxgogqbfuq.zZKhbgvUfsK4AEX3r0(this.f2408zZKhbgvUfsK4AEX3r0, KqgKJKIWne3kz1AdHk());
        try {
            zcy2nnbtvxgogqbfuq.HJFh0TGMpafqLE9haL(this);
        } catch (DeadObjectException unused) {
            lEeR5KfoEr4xU5yHH7(1);
            this.f2407s3fjYDxWOUexjjVgyA.e54J8UWNHWALQNixXM("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void TCyPEKSzIyweCN5yp1(Status status) {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM);
        IPyIQcaNa8aB7drBED(status, null, false);
    }

    public final void W3RZ2dTDKrKpS5Mxdk(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Exception exc) {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM);
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLT = this.f2398IPyIQcaNa8aB7drBED;
        if (pPkm9uUfOJHHYveeLT != null) {
            pPkm9uUfOJHHYveeLT.OANkd3mP6AYvwbNLJM();
        }
        OUd9THiLjZndMj0qdF();
        this.f2400T9PhQIpGRhE4yZDm1C.f2507pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL();
        KYHag8HRDlnO3X9zmZ(leer5kfoer4xu5yhh7);
        if ((this.f2407s3fjYDxWOUexjjVgyA instanceof Bc5OTyAfOKVCQb8CEz.husNiw3snxdgZPAGJm) && leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL() != 24) {
            this.f2400T9PhQIpGRhE4yZDm1C.f2509zZKhbgvUfsK4AEX3r0 = true;
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f2400T9PhQIpGRhE4yZDm1C;
            husniw3snxdgzpagjm.f2498OANkd3mP6AYvwbNLJM.sendMessageDelayed(husniw3snxdgzpagjm.f2498OANkd3mP6AYvwbNLJM.obtainMessage(19), 300000L);
        }
        if (leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL() == 4) {
            TCyPEKSzIyweCN5yp1(husNiw3snxdgZPAGJm.f2492Y43RdunnpKgpbny0lE);
            return;
        }
        if (this.f2405lEeR5KfoEr4xU5yHH7.isEmpty()) {
            this.f2402Z9WdNiOsPR0y54zHW4 = leer5kfoer4xu5yhh7;
            return;
        }
        if (exc != null) {
            HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM);
            IPyIQcaNa8aB7drBED(null, exc, false);
            return;
        }
        if (!this.f2400T9PhQIpGRhE4yZDm1C.f2510zaq8hOURtfwbcX17cG) {
            TCyPEKSzIyweCN5yp1(husNiw3snxdgZPAGJm.IPyIQcaNa8aB7drBED(this.f2397HJFh0TGMpafqLE9haL, leer5kfoer4xu5yhh7));
            return;
        }
        IPyIQcaNa8aB7drBED(husNiw3snxdgZPAGJm.IPyIQcaNa8aB7drBED(this.f2397HJFh0TGMpafqLE9haL, leer5kfoer4xu5yhh7), null, true);
        if (this.f2405lEeR5KfoEr4xU5yHH7.isEmpty() || OANkd3mP6AYvwbNLJM(leer5kfoer4xu5yhh7) || this.f2400T9PhQIpGRhE4yZDm1C.TCyPEKSzIyweCN5yp1(leer5kfoer4xu5yhh7, this.f2401TCyPEKSzIyweCN5yp1)) {
            return;
        }
        if (leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL() == 18) {
            this.f2406pbVGzGjWvY2LDXC8vo = true;
        }
        if (!this.f2406pbVGzGjWvY2LDXC8vo) {
            TCyPEKSzIyweCN5yp1(husNiw3snxdgZPAGJm.IPyIQcaNa8aB7drBED(this.f2397HJFh0TGMpafqLE9haL, leer5kfoer4xu5yhh7));
        } else {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm2 = this.f2400T9PhQIpGRhE4yZDm1C;
            husniw3snxdgzpagjm2.f2498OANkd3mP6AYvwbNLJM.sendMessageDelayed(Message.obtain(husniw3snxdgzpagjm2.f2498OANkd3mP6AYvwbNLJM, 9, this.f2397HJFh0TGMpafqLE9haL), this.f2400T9PhQIpGRhE4yZDm1C.f2506lEeR5KfoEr4xU5yHH7);
        }
    }

    public final void XzJ1BS7H9Ilbkv4eVM(zcy2NNbtVXgoGQbfuq zcy2nnbtvxgogqbfuq) {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM);
        if (this.f2407s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL()) {
            if (aPyGSIylzVNKPT1Bls(zcy2nnbtvxgogqbfuq)) {
                e54J8UWNHWALQNixXM();
                return;
            } else {
                this.f2405lEeR5KfoEr4xU5yHH7.add(zcy2nnbtvxgogqbfuq);
                return;
            }
        }
        this.f2405lEeR5KfoEr4xU5yHH7.add(zcy2nnbtvxgogqbfuq);
        f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2402Z9WdNiOsPR0y54zHW4;
        if (leer5kfoer4xu5yhh7 == null || !leer5kfoer4xu5yhh7.KYHag8HRDlnO3X9zmZ()) {
            jCtUeU2YI1poCxWcjm();
        } else {
            W3RZ2dTDKrKpS5Mxdk(this.f2402Z9WdNiOsPR0y54zHW4, null);
        }
    }

    public final int Y43RdunnpKgpbny0lE() {
        return this.f2403e54J8UWNHWALQNixXM;
    }

    public final void Z9WdNiOsPR0y54zHW4(int i) {
        OUd9THiLjZndMj0qdF();
        this.f2406pbVGzGjWvY2LDXC8vo = true;
        this.f2408zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL(i, this.f2407s3fjYDxWOUexjjVgyA.TCyPEKSzIyweCN5yp1());
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f2400T9PhQIpGRhE4yZDm1C;
        husniw3snxdgzpagjm.f2498OANkd3mP6AYvwbNLJM.sendMessageDelayed(Message.obtain(husniw3snxdgzpagjm.f2498OANkd3mP6AYvwbNLJM, 9, this.f2397HJFh0TGMpafqLE9haL), this.f2400T9PhQIpGRhE4yZDm1C.f2506lEeR5KfoEr4xU5yHH7);
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm2 = this.f2400T9PhQIpGRhE4yZDm1C;
        husniw3snxdgzpagjm2.f2498OANkd3mP6AYvwbNLJM.sendMessageDelayed(Message.obtain(husniw3snxdgzpagjm2.f2498OANkd3mP6AYvwbNLJM, 11, this.f2397HJFh0TGMpafqLE9haL), this.f2400T9PhQIpGRhE4yZDm1C.f2508s3fjYDxWOUexjjVgyA);
        this.f2400T9PhQIpGRhE4yZDm1C.f2507pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL();
        Iterator it = this.f2399KYHag8HRDlnO3X9zmZ.values().iterator();
        if (it.hasNext()) {
            androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(it.next());
            throw null;
        }
    }

    public final boolean aPyGSIylzVNKPT1Bls(zcy2NNbtVXgoGQbfuq zcy2nnbtvxgogqbfuq) {
        if (!(zcy2nnbtvxgogqbfuq instanceof tXWeW0sqVddf7ZBflq)) {
            T9PhQIpGRhE4yZDm1C(zcy2nnbtvxgogqbfuq);
            return true;
        }
        tXWeW0sqVddf7ZBflq txwew0sqvddf7zbflq = (tXWeW0sqVddf7ZBflq) zcy2nnbtvxgogqbfuq;
        f2zPq7MOnQrtOlZ1Zg.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(txwew0sqvddf7zbflq.TCyPEKSzIyweCN5yp1(this));
        if (hJFh0TGMpafqLE9haLHusNiw3snxdgZPAGJm == null) {
            T9PhQIpGRhE4yZDm1C(zcy2nnbtvxgogqbfuq);
            return true;
        }
        String name = this.f2407s3fjYDxWOUexjjVgyA.getClass().getName();
        String strHJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haLHusNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL();
        long jZZKhbgvUfsK4AEX3r0 = hJFh0TGMpafqLE9haLHusNiw3snxdgZPAGJm.zZKhbgvUfsK4AEX3r0();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(strHJFh0TGMpafqLE9haL).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(strHJFh0TGMpafqLE9haL);
        sb.append(", ");
        sb.append(jZZKhbgvUfsK4AEX3r0);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f2400T9PhQIpGRhE4yZDm1C.f2510zaq8hOURtfwbcX17cG || !txwew0sqvddf7zbflq.KYHag8HRDlnO3X9zmZ(this)) {
            txwew0sqvddf7zbflq.s3fjYDxWOUexjjVgyA(new HZ4bptRS9XIcK1CV95.TCyPEKSzIyweCN5yp1(hJFh0TGMpafqLE9haLHusNiw3snxdgZPAGJm));
            return true;
        }
        WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw = new WWC27LAMFqFFBzfbNw(this.f2397HJFh0TGMpafqLE9haL, hJFh0TGMpafqLE9haLHusNiw3snxdgZPAGJm, null);
        int iIndexOf = this.f2396Acstmh57AKoSEkEFNJ.indexOf(wWC27LAMFqFFBzfbNw);
        if (iIndexOf >= 0) {
            WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw2 = (WWC27LAMFqFFBzfbNw) this.f2396Acstmh57AKoSEkEFNJ.get(iIndexOf);
            this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM.removeMessages(15, wWC27LAMFqFFBzfbNw2);
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f2400T9PhQIpGRhE4yZDm1C;
            husniw3snxdgzpagjm.f2498OANkd3mP6AYvwbNLJM.sendMessageDelayed(Message.obtain(husniw3snxdgzpagjm.f2498OANkd3mP6AYvwbNLJM, 15, wWC27LAMFqFFBzfbNw2), this.f2400T9PhQIpGRhE4yZDm1C.f2506lEeR5KfoEr4xU5yHH7);
            return false;
        }
        this.f2396Acstmh57AKoSEkEFNJ.add(wWC27LAMFqFFBzfbNw);
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm2 = this.f2400T9PhQIpGRhE4yZDm1C;
        husniw3snxdgzpagjm2.f2498OANkd3mP6AYvwbNLJM.sendMessageDelayed(Message.obtain(husniw3snxdgzpagjm2.f2498OANkd3mP6AYvwbNLJM, 15, wWC27LAMFqFFBzfbNw), this.f2400T9PhQIpGRhE4yZDm1C.f2506lEeR5KfoEr4xU5yHH7);
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm3 = this.f2400T9PhQIpGRhE4yZDm1C;
        husniw3snxdgzpagjm3.f2498OANkd3mP6AYvwbNLJM.sendMessageDelayed(Message.obtain(husniw3snxdgzpagjm3.f2498OANkd3mP6AYvwbNLJM, 16, wWC27LAMFqFFBzfbNw), this.f2400T9PhQIpGRhE4yZDm1C.f2508s3fjYDxWOUexjjVgyA);
        f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(2, null);
        if (OANkd3mP6AYvwbNLJM(leer5kfoer4xu5yhh7)) {
            return false;
        }
        this.f2400T9PhQIpGRhE4yZDm1C.TCyPEKSzIyweCN5yp1(leer5kfoer4xu5yhh7, this.f2401TCyPEKSzIyweCN5yp1);
        return false;
    }

    public final void e2F9F6h8YJxTHwLCa0() {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM);
        if (this.f2406pbVGzGjWvY2LDXC8vo) {
            hoXrIDAFrSwfShk8da();
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f2400T9PhQIpGRhE4yZDm1C;
            TCyPEKSzIyweCN5yp1(husniw3snxdgzpagjm.f2496IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ(husniw3snxdgzpagjm.f2500TCyPEKSzIyweCN5yp1) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f2407s3fjYDxWOUexjjVgyA.e54J8UWNHWALQNixXM("Timing out connection while resuming.");
        }
    }

    public final void e54J8UWNHWALQNixXM() {
        this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM.removeMessages(12, this.f2397HJFh0TGMpafqLE9haL);
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f2400T9PhQIpGRhE4yZDm1C;
        husniw3snxdgzpagjm.f2498OANkd3mP6AYvwbNLJM.sendMessageDelayed(husniw3snxdgzpagjm.f2498OANkd3mP6AYvwbNLJM.obtainMessage(12, this.f2397HJFh0TGMpafqLE9haL), this.f2400T9PhQIpGRhE4yZDm1C.f2495HJFh0TGMpafqLE9haL);
    }

    public final void hoXrIDAFrSwfShk8da() {
        if (this.f2406pbVGzGjWvY2LDXC8vo) {
            this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM.removeMessages(11, this.f2397HJFh0TGMpafqLE9haL);
            this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM.removeMessages(9, this.f2397HJFh0TGMpafqLE9haL);
            this.f2406pbVGzGjWvY2LDXC8vo = false;
        }
    }

    public final f2zPq7MOnQrtOlZ1Zg.HJFh0TGMpafqLE9haL husNiw3snxdgZPAGJm(f2zPq7MOnQrtOlZ1Zg.HJFh0TGMpafqLE9haL[] hJFh0TGMpafqLE9haLArr) {
        if (hJFh0TGMpafqLE9haLArr != null && hJFh0TGMpafqLE9haLArr.length != 0) {
            f2zPq7MOnQrtOlZ1Zg.HJFh0TGMpafqLE9haL[] hJFh0TGMpafqLE9haLArrS3fjYDxWOUexjjVgyA = this.f2407s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
            if (hJFh0TGMpafqLE9haLArrS3fjYDxWOUexjjVgyA == null) {
                hJFh0TGMpafqLE9haLArrS3fjYDxWOUexjjVgyA = new f2zPq7MOnQrtOlZ1Zg.HJFh0TGMpafqLE9haL[0];
            }
            Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(hJFh0TGMpafqLE9haLArrS3fjYDxWOUexjjVgyA.length);
            for (f2zPq7MOnQrtOlZ1Zg.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL : hJFh0TGMpafqLE9haLArrS3fjYDxWOUexjjVgyA) {
                leer5kfoer4xu5yhh7.put(hJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(), Long.valueOf(hJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0()));
            }
            for (f2zPq7MOnQrtOlZ1Zg.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 : hJFh0TGMpafqLE9haLArr) {
                Long l = (Long) leer5kfoer4xu5yhh7.get(hJFh0TGMpafqLE9haL2.HJFh0TGMpafqLE9haL());
                if (l == null || l.longValue() < hJFh0TGMpafqLE9haL2.zZKhbgvUfsK4AEX3r0()) {
                    return hJFh0TGMpafqLE9haL2;
                }
            }
        }
        return null;
    }

    public final void jCtUeU2YI1poCxWcjm() {
        f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7;
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM);
        if (this.f2407s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL() || this.f2407s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7()) {
            return;
        }
        try {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f2400T9PhQIpGRhE4yZDm1C;
            int iS3fjYDxWOUexjjVgyA = husniw3snxdgzpagjm.f2507pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(husniw3snxdgzpagjm.f2500TCyPEKSzIyweCN5yp1, this.f2407s3fjYDxWOUexjjVgyA);
            if (iS3fjYDxWOUexjjVgyA != 0) {
                f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(iS3fjYDxWOUexjjVgyA, null);
                String name = this.f2407s3fjYDxWOUexjjVgyA.getClass().getName();
                String string = leer5kfoer4xu5yhh72.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                W3RZ2dTDKrKpS5Mxdk(leer5kfoer4xu5yhh72, null);
                return;
            }
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm2 = this.f2400T9PhQIpGRhE4yZDm1C;
            lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = this.f2407s3fjYDxWOUexjjVgyA;
            ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47 = new ao3wqKm5CXFuvC0q47(husniw3snxdgzpagjm2, kYHag8HRDlnO3X9zmZ, this.f2397HJFh0TGMpafqLE9haL);
            if (kYHag8HRDlnO3X9zmZ.T9PhQIpGRhE4yZDm1C()) {
                ((PPkm9uUfOJHHYveeLT) HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(this.f2398IPyIQcaNa8aB7drBED)).aPyGSIylzVNKPT1Bls(ao3wqkm5cxfuvc0q47);
            }
            try {
                this.f2407s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(ao3wqkm5cxfuvc0q47);
            } catch (SecurityException e) {
                e = e;
                leer5kfoer4xu5yhh7 = new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(10);
                W3RZ2dTDKrKpS5Mxdk(leer5kfoer4xu5yhh7, e);
            }
        } catch (IllegalStateException e2) {
            e = e2;
            leer5kfoer4xu5yhh7 = new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(10);
        }
    }

    @Override // aRQ2M7vtRaPDEyvpdv.zZKhbgvUfsK4AEX3r0
    public final void lEeR5KfoEr4xU5yHH7(int i) {
        if (Looper.myLooper() == this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM.getLooper()) {
            Z9WdNiOsPR0y54zHW4(i);
        } else {
            this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM.post(new G7AC3DWIx9i9fdanjk(this, i));
        }
    }

    public final void pbVGzGjWvY2LDXC8vo() {
        ArrayList arrayList = new ArrayList(this.f2405lEeR5KfoEr4xU5yHH7);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zcy2NNbtVXgoGQbfuq zcy2nnbtvxgogqbfuq = (zcy2NNbtVXgoGQbfuq) arrayList.get(i);
            if (!this.f2407s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL()) {
                return;
            }
            if (aPyGSIylzVNKPT1Bls(zcy2nnbtvxgogqbfuq)) {
                this.f2405lEeR5KfoEr4xU5yHH7.remove(zcy2nnbtvxgogqbfuq);
            }
        }
    }

    @Override // aRQ2M7vtRaPDEyvpdv.Acstmh57AKoSEkEFNJ
    public final void s3fjYDxWOUexjjVgyA(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        W3RZ2dTDKrKpS5Mxdk(leer5kfoer4xu5yhh7, null);
    }

    public final int sTkWmhpZ5b1ArQIw4K() {
        return this.f2401TCyPEKSzIyweCN5yp1;
    }

    public final void tXWeW0sqVddf7ZBflq() {
        this.f2403e54J8UWNHWALQNixXM++;
    }

    public final boolean zZKhbgvUfsK4AEX3r0() {
        return zaq8hOURtfwbcX17cG(true);
    }

    public final boolean zaq8hOURtfwbcX17cG(boolean z) {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f2400T9PhQIpGRhE4yZDm1C.f2498OANkd3mP6AYvwbNLJM);
        if (!this.f2407s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL() || this.f2399KYHag8HRDlnO3X9zmZ.size() != 0) {
            return false;
        }
        if (!this.f2408zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm()) {
            this.f2407s3fjYDxWOUexjjVgyA.e54J8UWNHWALQNixXM("Timing out service connection.");
            return true;
        }
        if (z) {
            e54J8UWNHWALQNixXM();
        }
        return false;
    }
}
