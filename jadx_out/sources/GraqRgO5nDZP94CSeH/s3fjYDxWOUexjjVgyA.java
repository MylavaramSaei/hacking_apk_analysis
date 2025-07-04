package GraqRgO5nDZP94CSeH;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA implements Comparable {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f275HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f276lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f277s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final int f278zZKhbgvUfsK4AEX3r0;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f274husNiw3snxdgZPAGJm = new lEeR5KfoEr4xU5yHH7(null);

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final s3fjYDxWOUexjjVgyA f273KYHag8HRDlnO3X9zmZ = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();

    public static final class lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        public /* synthetic */ lEeR5KfoEr4xU5yHH7(jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this();
        }
    }

    public s3fjYDxWOUexjjVgyA(int i, int i2, int i3) {
        this.f276lEeR5KfoEr4xU5yHH7 = i;
        this.f277s3fjYDxWOUexjjVgyA = i2;
        this.f275HJFh0TGMpafqLE9haL = i3;
        this.f278zZKhbgvUfsK4AEX3r0 = s3fjYDxWOUexjjVgyA(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = obj instanceof s3fjYDxWOUexjjVgyA ? (s3fjYDxWOUexjjVgyA) obj : null;
        return s3fjydxwouexjjvgya != null && this.f278zZKhbgvUfsK4AEX3r0 == s3fjydxwouexjjvgya.f278zZKhbgvUfsK4AEX3r0;
    }

    public int hashCode() {
        return this.f278zZKhbgvUfsK4AEX3r0;
    }

    @Override // java.lang.Comparable
    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
    public int compareTo(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya, "other");
        return this.f278zZKhbgvUfsK4AEX3r0 - s3fjydxwouexjjvgya.f278zZKhbgvUfsK4AEX3r0;
    }

    public final int s3fjYDxWOUexjjVgyA(int i, int i2, int i3) {
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f276lEeR5KfoEr4xU5yHH7);
        sb.append('.');
        sb.append(this.f277s3fjYDxWOUexjjVgyA);
        sb.append('.');
        sb.append(this.f275HJFh0TGMpafqLE9haL);
        return sb.toString();
    }
}
