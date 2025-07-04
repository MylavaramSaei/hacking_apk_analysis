package zWzrlx9vIdLp7FoEMD;

/* loaded from: classes.dex */
public final class jCtUeU2YI1poCxWcjm {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Class f7422lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Class f7423s3fjYDxWOUexjjVgyA;

    public @interface lEeR5KfoEr4xU5yHH7 {
    }

    public jCtUeU2YI1poCxWcjm(Class cls, Class cls2) {
        this.f7422lEeR5KfoEr4xU5yHH7 = cls;
        this.f7423s3fjYDxWOUexjjVgyA = cls2;
    }

    public static jCtUeU2YI1poCxWcjm lEeR5KfoEr4xU5yHH7(Class cls, Class cls2) {
        return new jCtUeU2YI1poCxWcjm(cls, cls2);
    }

    public static jCtUeU2YI1poCxWcjm s3fjYDxWOUexjjVgyA(Class cls) {
        return new jCtUeU2YI1poCxWcjm(lEeR5KfoEr4xU5yHH7.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jCtUeU2YI1poCxWcjm.class != obj.getClass()) {
            return false;
        }
        jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm = (jCtUeU2YI1poCxWcjm) obj;
        if (this.f7423s3fjYDxWOUexjjVgyA.equals(jctueu2yi1pocxwcjm.f7423s3fjYDxWOUexjjVgyA)) {
            return this.f7422lEeR5KfoEr4xU5yHH7.equals(jctueu2yi1pocxwcjm.f7422lEeR5KfoEr4xU5yHH7);
        }
        return false;
    }

    public int hashCode() {
        return (this.f7423s3fjYDxWOUexjjVgyA.hashCode() * 31) + this.f7422lEeR5KfoEr4xU5yHH7.hashCode();
    }

    public String toString() {
        if (this.f7422lEeR5KfoEr4xU5yHH7 == lEeR5KfoEr4xU5yHH7.class) {
            return this.f7423s3fjYDxWOUexjjVgyA.getName();
        }
        return "@" + this.f7422lEeR5KfoEr4xU5yHH7.getName() + " " + this.f7423s3fjYDxWOUexjjVgyA.getName();
    }
}
