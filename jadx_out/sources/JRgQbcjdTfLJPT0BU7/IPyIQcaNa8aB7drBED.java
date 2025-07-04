package JRgQbcjdTfLJPT0BU7;

import JRgQbcjdTfLJPT0BU7.IPyIQcaNa8aB7drBED;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class IPyIQcaNa8aB7drBED {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final hUNDUI3oB5uci3ylnY.husNiw3snxdgZPAGJm f731HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Map f732lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Map f733s3fjYDxWOUexjjVgyA;

    public static final class lEeR5KfoEr4xU5yHH7 implements MecTLhJ95ynyqeEob1.s3fjYDxWOUexjjVgyA {

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public static final hUNDUI3oB5uci3ylnY.husNiw3snxdgZPAGJm f734zZKhbgvUfsK4AEX3r0 = new hUNDUI3oB5uci3ylnY.husNiw3snxdgZPAGJm() { // from class: JRgQbcjdTfLJPT0BU7.TCyPEKSzIyweCN5yp1
            @Override // hUNDUI3oB5uci3ylnY.s3fjYDxWOUexjjVgyA
            public final void lEeR5KfoEr4xU5yHH7(Object obj, Object obj2) {
                IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(obj, (hUNDUI3oB5uci3ylnY.KYHag8HRDlnO3X9zmZ) obj2);
            }
        };

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Map f736lEeR5KfoEr4xU5yHH7 = new HashMap();

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Map f737s3fjYDxWOUexjjVgyA = new HashMap();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public hUNDUI3oB5uci3ylnY.husNiw3snxdgZPAGJm f735HJFh0TGMpafqLE9haL = f734zZKhbgvUfsK4AEX3r0;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void husNiw3snxdgZPAGJm(Object obj, hUNDUI3oB5uci3ylnY.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
            throw new hUNDUI3oB5uci3ylnY.HJFh0TGMpafqLE9haL("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public IPyIQcaNa8aB7drBED HJFh0TGMpafqLE9haL() {
            return new IPyIQcaNa8aB7drBED(new HashMap(this.f736lEeR5KfoEr4xU5yHH7), new HashMap(this.f737s3fjYDxWOUexjjVgyA), this.f735HJFh0TGMpafqLE9haL);
        }

        @Override // MecTLhJ95ynyqeEob1.s3fjYDxWOUexjjVgyA
        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: merged with bridge method [inline-methods] */
        public lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7(Class cls, hUNDUI3oB5uci3ylnY.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this.f736lEeR5KfoEr4xU5yHH7.put(cls, husniw3snxdgzpagjm);
            this.f737s3fjYDxWOUexjjVgyA.remove(cls);
            return this;
        }

        public lEeR5KfoEr4xU5yHH7 zZKhbgvUfsK4AEX3r0(MecTLhJ95ynyqeEob1.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(this);
            return this;
        }
    }

    public IPyIQcaNa8aB7drBED(Map map, Map map2, hUNDUI3oB5uci3ylnY.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this.f732lEeR5KfoEr4xU5yHH7 = map;
        this.f733s3fjYDxWOUexjjVgyA = map2;
        this.f731HJFh0TGMpafqLE9haL = husniw3snxdgzpagjm;
    }

    public static lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7() {
        return new lEeR5KfoEr4xU5yHH7();
    }

    public byte[] HJFh0TGMpafqLE9haL(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            s3fjYDxWOUexjjVgyA(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void s3fjYDxWOUexjjVgyA(Object obj, OutputStream outputStream) {
        new KYHag8HRDlnO3X9zmZ(outputStream, this.f732lEeR5KfoEr4xU5yHH7, this.f733s3fjYDxWOUexjjVgyA, this.f731HJFh0TGMpafqLE9haL).zaq8hOURtfwbcX17cG(obj);
    }
}
