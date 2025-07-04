package jpEZy3U5wFkT2e9PKQ;

/* loaded from: classes.dex */
public abstract class TCyPEKSzIyweCN5yp1 extends lEeR5KfoEr4xU5yHH7 implements KYHag8HRDlnO3X9zmZ, ndQwlXNek6Yo5ZBYrV.zZKhbgvUfsK4AEX3r0 {

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final int f6178IPyIQcaNa8aB7drBED;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final int f6179pbVGzGjWvY2LDXC8vo;

    public TCyPEKSzIyweCN5yp1(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f6178IPyIQcaNa8aB7drBED = i;
        this.f6179pbVGzGjWvY2LDXC8vo = i2 >> 1;
    }

    @Override // jpEZy3U5wFkT2e9PKQ.lEeR5KfoEr4xU5yHH7
    public ndQwlXNek6Yo5ZBYrV.lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL() {
        return e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TCyPEKSzIyweCN5yp1) {
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = (TCyPEKSzIyweCN5yp1) obj;
            return husNiw3snxdgZPAGJm().equals(tCyPEKSzIyweCN5yp1.husNiw3snxdgZPAGJm()) && TCyPEKSzIyweCN5yp1().equals(tCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1()) && this.f6179pbVGzGjWvY2LDXC8vo == tCyPEKSzIyweCN5yp1.f6179pbVGzGjWvY2LDXC8vo && this.f6178IPyIQcaNa8aB7drBED == tCyPEKSzIyweCN5yp1.f6178IPyIQcaNa8aB7drBED && pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0(), tCyPEKSzIyweCN5yp1.zZKhbgvUfsK4AEX3r0()) && pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ(), tCyPEKSzIyweCN5yp1.KYHag8HRDlnO3X9zmZ());
        }
        if (obj instanceof ndQwlXNek6Yo5ZBYrV.zZKhbgvUfsK4AEX3r0) {
            return obj.equals(s3fjYDxWOUexjjVgyA());
        }
        return false;
    }

    public int hashCode() {
        return (((KYHag8HRDlnO3X9zmZ() == null ? 0 : KYHag8HRDlnO3X9zmZ().hashCode() * 31) + husNiw3snxdgZPAGJm().hashCode()) * 31) + TCyPEKSzIyweCN5yp1().hashCode();
    }

    public String toString() {
        ndQwlXNek6Yo5ZBYrV.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA();
        if (leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA != this) {
            return leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA.toString();
        }
        if ("<init>".equals(husNiw3snxdgZPAGJm())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + husNiw3snxdgZPAGJm() + " (Kotlin reflection is not available)";
    }
}
