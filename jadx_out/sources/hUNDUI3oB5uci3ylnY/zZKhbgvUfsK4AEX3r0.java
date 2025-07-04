package hUNDUI3oB5uci3ylnY;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zZKhbgvUfsK4AEX3r0 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final String f6010lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Map f6011s3fjYDxWOUexjjVgyA;

    public static final class s3fjYDxWOUexjjVgyA {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final String f6012lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public Map f6013s3fjYDxWOUexjjVgyA = null;

        public s3fjYDxWOUexjjVgyA(String str) {
            this.f6012lEeR5KfoEr4xU5yHH7 = str;
        }

        public zZKhbgvUfsK4AEX3r0 lEeR5KfoEr4xU5yHH7() {
            return new zZKhbgvUfsK4AEX3r0(this.f6012lEeR5KfoEr4xU5yHH7, this.f6013s3fjYDxWOUexjjVgyA == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f6013s3fjYDxWOUexjjVgyA)));
        }

        public s3fjYDxWOUexjjVgyA s3fjYDxWOUexjjVgyA(Annotation annotation) {
            if (this.f6013s3fjYDxWOUexjjVgyA == null) {
                this.f6013s3fjYDxWOUexjjVgyA = new HashMap();
            }
            this.f6013s3fjYDxWOUexjjVgyA.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public zZKhbgvUfsK4AEX3r0(String str, Map map) {
        this.f6010lEeR5KfoEr4xU5yHH7 = str;
        this.f6011s3fjYDxWOUexjjVgyA = map;
    }

    public static s3fjYDxWOUexjjVgyA lEeR5KfoEr4xU5yHH7(String str) {
        return new s3fjYDxWOUexjjVgyA(str);
    }

    public static zZKhbgvUfsK4AEX3r0 zZKhbgvUfsK4AEX3r0(String str) {
        return new zZKhbgvUfsK4AEX3r0(str, Collections.emptyMap());
    }

    public Annotation HJFh0TGMpafqLE9haL(Class cls) {
        return (Annotation) this.f6011s3fjYDxWOUexjjVgyA.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zZKhbgvUfsK4AEX3r0)) {
            return false;
        }
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) obj;
        return this.f6010lEeR5KfoEr4xU5yHH7.equals(zzkhbgvufsk4aex3r0.f6010lEeR5KfoEr4xU5yHH7) && this.f6011s3fjYDxWOUexjjVgyA.equals(zzkhbgvufsk4aex3r0.f6011s3fjYDxWOUexjjVgyA);
    }

    public int hashCode() {
        return (this.f6010lEeR5KfoEr4xU5yHH7.hashCode() * 31) + this.f6011s3fjYDxWOUexjjVgyA.hashCode();
    }

    public String s3fjYDxWOUexjjVgyA() {
        return this.f6010lEeR5KfoEr4xU5yHH7;
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f6010lEeR5KfoEr4xU5yHH7 + ", properties=" + this.f6011s3fjYDxWOUexjjVgyA.values() + "}";
    }
}
