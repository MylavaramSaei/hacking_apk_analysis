package zWzrlx9vIdLp7FoEMD;

/* loaded from: classes.dex */
public final class zaq8hOURtfwbcX17cG {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f7428HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final jCtUeU2YI1poCxWcjm f7429lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f7430s3fjYDxWOUexjjVgyA;

    public zaq8hOURtfwbcX17cG(Class cls, int i, int i2) {
        this(jCtUeU2YI1poCxWcjm.s3fjYDxWOUexjjVgyA(cls), i, i2);
    }

    public static zaq8hOURtfwbcX17cG Acstmh57AKoSEkEFNJ(Class cls) {
        return new zaq8hOURtfwbcX17cG(cls, 1, 0);
    }

    public static zaq8hOURtfwbcX17cG IPyIQcaNa8aB7drBED(Class cls) {
        return new zaq8hOURtfwbcX17cG(cls, 0, 1);
    }

    public static zaq8hOURtfwbcX17cG T9PhQIpGRhE4yZDm1C(Class cls) {
        return new zaq8hOURtfwbcX17cG(cls, 2, 0);
    }

    public static zaq8hOURtfwbcX17cG TCyPEKSzIyweCN5yp1(Class cls) {
        return new zaq8hOURtfwbcX17cG(cls, 0, 0);
    }

    public static zaq8hOURtfwbcX17cG Z9WdNiOsPR0y54zHW4(jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm) {
        return new zaq8hOURtfwbcX17cG(jctueu2yi1pocxwcjm, 1, 0);
    }

    public static zaq8hOURtfwbcX17cG e54J8UWNHWALQNixXM(Class cls) {
        return new zaq8hOURtfwbcX17cG(cls, 1, 1);
    }

    public static String lEeR5KfoEr4xU5yHH7(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    public static zaq8hOURtfwbcX17cG pbVGzGjWvY2LDXC8vo(jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm) {
        return new zaq8hOURtfwbcX17cG(jctueu2yi1pocxwcjm, 0, 1);
    }

    public boolean HJFh0TGMpafqLE9haL() {
        return this.f7428HJFh0TGMpafqLE9haL == 2;
    }

    public boolean KYHag8HRDlnO3X9zmZ() {
        return this.f7430s3fjYDxWOUexjjVgyA == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zaq8hOURtfwbcX17cG)) {
            return false;
        }
        zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg = (zaq8hOURtfwbcX17cG) obj;
        return this.f7429lEeR5KfoEr4xU5yHH7.equals(zaq8hourtfwbcx17cg.f7429lEeR5KfoEr4xU5yHH7) && this.f7430s3fjYDxWOUexjjVgyA == zaq8hourtfwbcx17cg.f7430s3fjYDxWOUexjjVgyA && this.f7428HJFh0TGMpafqLE9haL == zaq8hourtfwbcx17cg.f7428HJFh0TGMpafqLE9haL;
    }

    public int hashCode() {
        return ((((this.f7429lEeR5KfoEr4xU5yHH7.hashCode() ^ 1000003) * 1000003) ^ this.f7430s3fjYDxWOUexjjVgyA) * 1000003) ^ this.f7428HJFh0TGMpafqLE9haL;
    }

    public boolean husNiw3snxdgZPAGJm() {
        return this.f7430s3fjYDxWOUexjjVgyA == 1;
    }

    public jCtUeU2YI1poCxWcjm s3fjYDxWOUexjjVgyA() {
        return this.f7429lEeR5KfoEr4xU5yHH7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f7429lEeR5KfoEr4xU5yHH7);
        sb.append(", type=");
        int i = this.f7430s3fjYDxWOUexjjVgyA;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(lEeR5KfoEr4xU5yHH7(this.f7428HJFh0TGMpafqLE9haL));
        sb.append("}");
        return sb.toString();
    }

    public boolean zZKhbgvUfsK4AEX3r0() {
        return this.f7428HJFh0TGMpafqLE9haL == 0;
    }

    public zaq8hOURtfwbcX17cG(jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm, int i, int i2) {
        this.f7429lEeR5KfoEr4xU5yHH7 = (jCtUeU2YI1poCxWcjm) OUd9THiLjZndMj0qdF.HJFh0TGMpafqLE9haL(jctueu2yi1pocxwcjm, "Null dependency anInterface.");
        this.f7430s3fjYDxWOUexjjVgyA = i;
        this.f7428HJFh0TGMpafqLE9haL = i2;
    }
}
