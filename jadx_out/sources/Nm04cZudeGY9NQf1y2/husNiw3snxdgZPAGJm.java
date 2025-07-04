package Nm04cZudeGY9NQf1y2;

import android.util.Base64;
import android.util.JsonWriter;
import hUNDUI3oB5uci3ylnY.IPyIQcaNa8aB7drBED;
import hUNDUI3oB5uci3ylnY.KYHag8HRDlnO3X9zmZ;
import hUNDUI3oB5uci3ylnY.TCyPEKSzIyweCN5yp1;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class husNiw3snxdgZPAGJm implements KYHag8HRDlnO3X9zmZ, IPyIQcaNa8aB7drBED {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final JsonWriter f945HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final hUNDUI3oB5uci3ylnY.husNiw3snxdgZPAGJm f946KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final boolean f947TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final Map f948husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f949lEeR5KfoEr4xU5yHH7 = null;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f950s3fjYDxWOUexjjVgyA = true;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final Map f951zZKhbgvUfsK4AEX3r0;

    public husNiw3snxdgZPAGJm(Writer writer, Map map, Map map2, hUNDUI3oB5uci3ylnY.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, boolean z) {
        this.f945HJFh0TGMpafqLE9haL = new JsonWriter(writer);
        this.f951zZKhbgvUfsK4AEX3r0 = map;
        this.f948husNiw3snxdgZPAGJm = map2;
        this.f946KYHag8HRDlnO3X9zmZ = husniw3snxdgzpagjm;
        this.f947TCyPEKSzIyweCN5yp1 = z;
    }

    public husNiw3snxdgZPAGJm Acstmh57AKoSEkEFNJ(String str, int i) throws IOException {
        R9SAhYMerGybF9OAjL();
        this.f945HJFh0TGMpafqLE9haL.name(str);
        return KYHag8HRDlnO3X9zmZ(i);
    }

    @Override // hUNDUI3oB5uci3ylnY.KYHag8HRDlnO3X9zmZ
    public KYHag8HRDlnO3X9zmZ HJFh0TGMpafqLE9haL(hUNDUI3oB5uci3ylnY.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, long j) {
        return Z9WdNiOsPR0y54zHW4(zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(), j);
    }

    public husNiw3snxdgZPAGJm IPyIQcaNa8aB7drBED(Object obj, boolean z) {
        if (z && aPyGSIylzVNKPT1Bls(obj)) {
            throw new hUNDUI3oB5uci3ylnY.HJFh0TGMpafqLE9haL(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f945HJFh0TGMpafqLE9haL.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f945HJFh0TGMpafqLE9haL.value((Number) obj);
            return this;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f945HJFh0TGMpafqLE9haL.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    IPyIQcaNa8aB7drBED(it.next(), false);
                }
                this.f945HJFh0TGMpafqLE9haL.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f945HJFh0TGMpafqLE9haL.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        e54J8UWNHWALQNixXM((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new hUNDUI3oB5uci3ylnY.HJFh0TGMpafqLE9haL(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.f945HJFh0TGMpafqLE9haL.endObject();
                return this;
            }
            hUNDUI3oB5uci3ylnY.husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (hUNDUI3oB5uci3ylnY.husNiw3snxdgZPAGJm) this.f951zZKhbgvUfsK4AEX3r0.get(obj.getClass());
            if (husniw3snxdgzpagjm != null) {
                return zaq8hOURtfwbcX17cG(husniw3snxdgzpagjm, obj, z);
            }
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = (TCyPEKSzIyweCN5yp1) this.f948husNiw3snxdgZPAGJm.get(obj.getClass());
            if (tCyPEKSzIyweCN5yp1 != null) {
                tCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return zaq8hOURtfwbcX17cG(this.f946KYHag8HRDlnO3X9zmZ, obj, z);
            }
            lEeR5KfoEr4xU5yHH7(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return hoXrIDAFrSwfShk8da((byte[]) obj);
        }
        this.f945HJFh0TGMpafqLE9haL.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                this.f945HJFh0TGMpafqLE9haL.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                TCyPEKSzIyweCN5yp1(jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                this.f945HJFh0TGMpafqLE9haL.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                this.f945HJFh0TGMpafqLE9haL.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                IPyIQcaNa8aB7drBED(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                IPyIQcaNa8aB7drBED(obj2, false);
            }
        }
        this.f945HJFh0TGMpafqLE9haL.endArray();
        return this;
    }

    public husNiw3snxdgZPAGJm KYHag8HRDlnO3X9zmZ(int i) throws IOException {
        R9SAhYMerGybF9OAjL();
        this.f945HJFh0TGMpafqLE9haL.value(i);
        return this;
    }

    public void OANkd3mP6AYvwbNLJM() {
        R9SAhYMerGybF9OAjL();
        this.f945HJFh0TGMpafqLE9haL.flush();
    }

    public final void R9SAhYMerGybF9OAjL() throws IOException {
        if (!this.f950s3fjYDxWOUexjjVgyA) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f949lEeR5KfoEr4xU5yHH7;
        if (husniw3snxdgzpagjm != null) {
            husniw3snxdgzpagjm.R9SAhYMerGybF9OAjL();
            this.f949lEeR5KfoEr4xU5yHH7.f950s3fjYDxWOUexjjVgyA = false;
            this.f949lEeR5KfoEr4xU5yHH7 = null;
            this.f945HJFh0TGMpafqLE9haL.endObject();
        }
    }

    @Override // hUNDUI3oB5uci3ylnY.IPyIQcaNa8aB7drBED
    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: merged with bridge method [inline-methods] */
    public husNiw3snxdgZPAGJm s3fjYDxWOUexjjVgyA(boolean z) throws IOException {
        R9SAhYMerGybF9OAjL();
        this.f945HJFh0TGMpafqLE9haL.value(z);
        return this;
    }

    public husNiw3snxdgZPAGJm TCyPEKSzIyweCN5yp1(long j) throws IOException {
        R9SAhYMerGybF9OAjL();
        this.f945HJFh0TGMpafqLE9haL.value(j);
        return this;
    }

    public final husNiw3snxdgZPAGJm Y43RdunnpKgpbny0lE(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        R9SAhYMerGybF9OAjL();
        this.f945HJFh0TGMpafqLE9haL.name(str);
        return IPyIQcaNa8aB7drBED(obj, false);
    }

    public husNiw3snxdgZPAGJm Z9WdNiOsPR0y54zHW4(String str, long j) throws IOException {
        R9SAhYMerGybF9OAjL();
        this.f945HJFh0TGMpafqLE9haL.name(str);
        return TCyPEKSzIyweCN5yp1(j);
    }

    public final boolean aPyGSIylzVNKPT1Bls(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public husNiw3snxdgZPAGJm e54J8UWNHWALQNixXM(String str, Object obj) {
        return this.f947TCyPEKSzIyweCN5yp1 ? Y43RdunnpKgpbny0lE(str, obj) : sTkWmhpZ5b1ArQIw4K(str, obj);
    }

    public husNiw3snxdgZPAGJm hoXrIDAFrSwfShk8da(byte[] bArr) throws IOException {
        R9SAhYMerGybF9OAjL();
        if (bArr == null) {
            this.f945HJFh0TGMpafqLE9haL.nullValue();
        } else {
            this.f945HJFh0TGMpafqLE9haL.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    @Override // hUNDUI3oB5uci3ylnY.KYHag8HRDlnO3X9zmZ
    public KYHag8HRDlnO3X9zmZ husNiw3snxdgZPAGJm(hUNDUI3oB5uci3ylnY.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, Object obj) {
        return e54J8UWNHWALQNixXM(zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(), obj);
    }

    @Override // hUNDUI3oB5uci3ylnY.IPyIQcaNa8aB7drBED
    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: merged with bridge method [inline-methods] */
    public husNiw3snxdgZPAGJm lEeR5KfoEr4xU5yHH7(String str) throws IOException {
        R9SAhYMerGybF9OAjL();
        this.f945HJFh0TGMpafqLE9haL.value(str);
        return this;
    }

    public final husNiw3snxdgZPAGJm sTkWmhpZ5b1ArQIw4K(String str, Object obj) throws IOException {
        R9SAhYMerGybF9OAjL();
        this.f945HJFh0TGMpafqLE9haL.name(str);
        if (obj != null) {
            return IPyIQcaNa8aB7drBED(obj, false);
        }
        this.f945HJFh0TGMpafqLE9haL.nullValue();
        return this;
    }

    @Override // hUNDUI3oB5uci3ylnY.KYHag8HRDlnO3X9zmZ
    public KYHag8HRDlnO3X9zmZ zZKhbgvUfsK4AEX3r0(hUNDUI3oB5uci3ylnY.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, int i) {
        return Acstmh57AKoSEkEFNJ(zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(), i);
    }

    public husNiw3snxdgZPAGJm zaq8hOURtfwbcX17cG(hUNDUI3oB5uci3ylnY.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f945HJFh0TGMpafqLE9haL.beginObject();
        }
        husniw3snxdgzpagjm.lEeR5KfoEr4xU5yHH7(obj, this);
        if (!z) {
            this.f945HJFh0TGMpafqLE9haL.endObject();
        }
        return this;
    }
}
