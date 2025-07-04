package Acstmh57AKoSEkEFNJ;

import Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 extends s3fjYDxWOUexjjVgyA {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final HashMap f55husNiw3snxdgZPAGJm = new HashMap();

    @Override // Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA
    public s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL(Object obj) {
        return (s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL) this.f55husNiw3snxdgZPAGJm.get(obj);
    }

    @Override // Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA
    public Object IPyIQcaNa8aB7drBED(Object obj) {
        Object objIPyIQcaNa8aB7drBED = super.IPyIQcaNa8aB7drBED(obj);
        this.f55husNiw3snxdgZPAGJm.remove(obj);
        return objIPyIQcaNa8aB7drBED;
    }

    @Override // Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA
    public Object TCyPEKSzIyweCN5yp1(Object obj, Object obj2) {
        s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL2 = HJFh0TGMpafqLE9haL(obj);
        if (HJFh0TGMpafqLE9haL2 != null) {
            return HJFh0TGMpafqLE9haL2.f62s3fjYDxWOUexjjVgyA;
        }
        this.f55husNiw3snxdgZPAGJm.put(obj, KYHag8HRDlnO3X9zmZ(obj, obj2));
        return null;
    }

    public boolean contains(Object obj) {
        return this.f55husNiw3snxdgZPAGJm.containsKey(obj);
    }

    public Map.Entry pbVGzGjWvY2LDXC8vo(Object obj) {
        if (contains(obj)) {
            return ((s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL) this.f55husNiw3snxdgZPAGJm.get(obj)).f63zZKhbgvUfsK4AEX3r0;
        }
        return null;
    }
}
