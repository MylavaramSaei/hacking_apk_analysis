package jocVUfxESVhVJU8LoH;

import eWK41qw3g36LVd4UnS.TCyPEKSzIyweCN5yp1;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 implements TCyPEKSzIyweCN5yp1 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final String f6148HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f6149IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final Set f6150KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f6151TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final String f6152husNiw3snxdgZPAGJm;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final String f6153zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final String f6154lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f6155s3fjYDxWOUexjjVgyA;

    static {
        String strLEeR5KfoEr4xU5yHH7 = husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f6148HJFh0TGMpafqLE9haL = strLEeR5KfoEr4xU5yHH7;
        String strLEeR5KfoEr4xU5yHH72 = husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f6153zZKhbgvUfsK4AEX3r0 = strLEeR5KfoEr4xU5yHH72;
        String strLEeR5KfoEr4xU5yHH73 = husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f6152husNiw3snxdgZPAGJm = strLEeR5KfoEr4xU5yHH73;
        f6150KYHag8HRDlnO3X9zmZ = Collections.unmodifiableSet(new HashSet(Arrays.asList(ctWLFN70QQINH1kyYo.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA("proto"), ctWLFN70QQINH1kyYo.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA("json"))));
        f6151TCyPEKSzIyweCN5yp1 = new lEeR5KfoEr4xU5yHH7(strLEeR5KfoEr4xU5yHH7, null);
        f6149IPyIQcaNa8aB7drBED = new lEeR5KfoEr4xU5yHH7(strLEeR5KfoEr4xU5yHH72, strLEeR5KfoEr4xU5yHH73);
    }

    public lEeR5KfoEr4xU5yHH7(String str, String str2) {
        this.f6154lEeR5KfoEr4xU5yHH7 = str;
        this.f6155s3fjYDxWOUexjjVgyA = str2;
    }

    public static lEeR5KfoEr4xU5yHH7 husNiw3snxdgZPAGJm(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new lEeR5KfoEr4xU5yHH7(str2, str3);
    }

    @Override // eWK41qw3g36LVd4UnS.KYHag8HRDlnO3X9zmZ
    public String HJFh0TGMpafqLE9haL() {
        return "cct";
    }

    public String KYHag8HRDlnO3X9zmZ() {
        return this.f6155s3fjYDxWOUexjjVgyA;
    }

    public String TCyPEKSzIyweCN5yp1() {
        return this.f6154lEeR5KfoEr4xU5yHH7;
    }

    @Override // eWK41qw3g36LVd4UnS.KYHag8HRDlnO3X9zmZ
    public byte[] lEeR5KfoEr4xU5yHH7() {
        return zZKhbgvUfsK4AEX3r0();
    }

    @Override // eWK41qw3g36LVd4UnS.TCyPEKSzIyweCN5yp1
    public Set s3fjYDxWOUexjjVgyA() {
        return f6150KYHag8HRDlnO3X9zmZ;
    }

    public byte[] zZKhbgvUfsK4AEX3r0() {
        String str = this.f6155s3fjYDxWOUexjjVgyA;
        if (str == null && this.f6154lEeR5KfoEr4xU5yHH7 == null) {
            return null;
        }
        String str2 = this.f6154lEeR5KfoEr4xU5yHH7;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }
}
