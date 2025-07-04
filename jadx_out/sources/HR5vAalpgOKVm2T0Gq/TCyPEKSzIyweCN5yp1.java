package HR5vAalpgOKVm2T0Gq;

import HZ4bptRS9XIcK1CV95.husNiw3snxdgZPAGJm;
import HZ4bptRS9XIcK1CV95.lEeR5KfoEr4xU5yHH7;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class TCyPEKSzIyweCN5yp1 extends HJFh0TGMpafqLE9haL implements lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ {

    /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
    public final Account f358OqIo5QF00RDxUQb4qq;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public final Set f359W3RZ2dTDKrKpS5Mxdk;

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0 f360tXWeW0sqVddf7ZBflq;

    public TCyPEKSzIyweCN5yp1(Context context, Looper looper, int i, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this(context, looper, i, zzkhbgvufsk4aex3r0, (aRQ2M7vtRaPDEyvpdv.zZKhbgvUfsK4AEX3r0) leer5kfoer4xu5yhh7, (aRQ2M7vtRaPDEyvpdv.Acstmh57AKoSEkEFNJ) s3fjydxwouexjjvgya);
    }

    @Override // HZ4bptRS9XIcK1CV95.lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ
    public Set IPyIQcaNa8aB7drBED() {
        return T9PhQIpGRhE4yZDm1C() ? this.f359W3RZ2dTDKrKpS5Mxdk : Collections.emptySet();
    }

    @Override // HR5vAalpgOKVm2T0Gq.HJFh0TGMpafqLE9haL
    public final Account R9SAhYMerGybF9OAjL() {
        return this.f358OqIo5QF00RDxUQb4qq;
    }

    @Override // HR5vAalpgOKVm2T0Gq.HJFh0TGMpafqLE9haL
    public final Set ao3wqKm5CXFuvC0q47() {
        return this.f359W3RZ2dTDKrKpS5Mxdk;
    }

    public final Set jocVUfxESVhVJU8LoH(Set set) {
        Set setCtWLFN70QQINH1kyYo = ctWLFN70QQINH1kyYo(set);
        Iterator it = setCtWLFN70QQINH1kyYo.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setCtWLFN70QQINH1kyYo;
    }

    @Override // HR5vAalpgOKVm2T0Gq.HJFh0TGMpafqLE9haL
    public final Executor xHA29AmDt6y96AnB3t() {
        return null;
    }

    public TCyPEKSzIyweCN5yp1(Context context, Looper looper, int i, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, aRQ2M7vtRaPDEyvpdv.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r02, aRQ2M7vtRaPDEyvpdv.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
        this(context, looper, IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(context), f2zPq7MOnQrtOlZ1Zg.TCyPEKSzIyweCN5yp1.e54J8UWNHWALQNixXM(), i, zzkhbgvufsk4aex3r0, (aRQ2M7vtRaPDEyvpdv.zZKhbgvUfsK4AEX3r0) hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(zzkhbgvufsk4aex3r02), (aRQ2M7vtRaPDEyvpdv.Acstmh57AKoSEkEFNJ) hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(acstmh57AKoSEkEFNJ));
    }

    public TCyPEKSzIyweCN5yp1(Context context, Looper looper, IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, f2zPq7MOnQrtOlZ1Zg.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, int i, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, aRQ2M7vtRaPDEyvpdv.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r02, aRQ2M7vtRaPDEyvpdv.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
        super(context, looper, iPyIQcaNa8aB7drBED, tCyPEKSzIyweCN5yp1, i, zzkhbgvufsk4aex3r02 == null ? null : new OUd9THiLjZndMj0qdF(zzkhbgvufsk4aex3r02), acstmh57AKoSEkEFNJ == null ? null : new jCtUeU2YI1poCxWcjm(acstmh57AKoSEkEFNJ), zzkhbgvufsk4aex3r0.IPyIQcaNa8aB7drBED());
        this.f360tXWeW0sqVddf7ZBflq = zzkhbgvufsk4aex3r0;
        this.f358OqIo5QF00RDxUQb4qq = zzkhbgvufsk4aex3r0.lEeR5KfoEr4xU5yHH7();
        this.f359W3RZ2dTDKrKpS5Mxdk = jocVUfxESVhVJU8LoH(zzkhbgvufsk4aex3r0.HJFh0TGMpafqLE9haL());
    }

    public Set ctWLFN70QQINH1kyYo(Set set) {
        return set;
    }
}
