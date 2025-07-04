package jCtUeU2YI1poCxWcjm;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class husNiw3snxdgZPAGJm {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final String f6081HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final String f6082KYHag8HRDlnO3X9zmZ;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final int f6083husNiw3snxdgZPAGJm = 0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final String f6084lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f6085s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final List f6086zZKhbgvUfsK4AEX3r0;

    public husNiw3snxdgZPAGJm(String str, String str2, String str3, List list) {
        this.f6084lEeR5KfoEr4xU5yHH7 = (String) tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(str);
        this.f6085s3fjYDxWOUexjjVgyA = (String) tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(str2);
        this.f6081HJFh0TGMpafqLE9haL = (String) tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(str3);
        this.f6086zZKhbgvUfsK4AEX3r0 = (List) tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(list);
        this.f6082KYHag8HRDlnO3X9zmZ = lEeR5KfoEr4xU5yHH7(str, str2, str3);
    }

    public int HJFh0TGMpafqLE9haL() {
        return this.f6083husNiw3snxdgZPAGJm;
    }

    public String KYHag8HRDlnO3X9zmZ() {
        return this.f6085s3fjYDxWOUexjjVgyA;
    }

    public String TCyPEKSzIyweCN5yp1() {
        return this.f6081HJFh0TGMpafqLE9haL;
    }

    public String husNiw3snxdgZPAGJm() {
        return this.f6084lEeR5KfoEr4xU5yHH7;
    }

    public final String lEeR5KfoEr4xU5yHH7(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List s3fjYDxWOUexjjVgyA() {
        return this.f6086zZKhbgvUfsK4AEX3r0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f6084lEeR5KfoEr4xU5yHH7 + ", mProviderPackage: " + this.f6085s3fjYDxWOUexjjVgyA + ", mQuery: " + this.f6081HJFh0TGMpafqLE9haL + ", mCertificates:");
        for (int i = 0; i < this.f6086zZKhbgvUfsK4AEX3r0.size(); i++) {
            sb.append(" [");
            List list = (List) this.f6086zZKhbgvUfsK4AEX3r0.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f6083husNiw3snxdgZPAGJm);
        return sb.toString();
    }

    public String zZKhbgvUfsK4AEX3r0() {
        return this.f6082KYHag8HRDlnO3X9zmZ;
    }
}
