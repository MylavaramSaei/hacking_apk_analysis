package com.google.android.gms.auth.api.signin;

import HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import fDXXEWvhMVO3O8mnuS.husNiw3snxdgZPAGJm;
import fDXXEWvhMVO3O8mnuS.zZKhbgvUfsK4AEX3r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL;
import pgB7Gmjz55y9NQYnAD.lEeR5KfoEr4xU5yHH7;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends lEeR5KfoEr4xU5yHH7 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new yL2E9nlEZpg8ZZx8XE.lEeR5KfoEr4xU5yHH7();

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public static zZKhbgvUfsK4AEX3r0 f4746hoXrIDAFrSwfShk8da = husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public List f4747Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public String f4748HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public long f4749IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public Uri f4750KYHag8HRDlnO3X9zmZ;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public Set f4751T9PhQIpGRhE4yZDm1C = new HashSet();

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public String f4752TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public String f4753Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public String f4754e54J8UWNHWALQNixXM;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public String f4755husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f4756lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public String f4757pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public String f4758s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public String f4759zZKhbgvUfsK4AEX3r0;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.f4756lEeR5KfoEr4xU5yHH7 = i;
        this.f4758s3fjYDxWOUexjjVgyA = str;
        this.f4748HJFh0TGMpafqLE9haL = str2;
        this.f4759zZKhbgvUfsK4AEX3r0 = str3;
        this.f4755husNiw3snxdgZPAGJm = str4;
        this.f4750KYHag8HRDlnO3X9zmZ = uri;
        this.f4752TCyPEKSzIyweCN5yp1 = str5;
        this.f4749IPyIQcaNa8aB7drBED = j;
        this.f4757pbVGzGjWvY2LDXC8vo = str6;
        this.f4747Acstmh57AKoSEkEFNJ = list;
        this.f4753Z9WdNiOsPR0y54zHW4 = str7;
        this.f4754e54J8UWNHWALQNixXM = str8;
    }

    public static GoogleSignInAccount T9PhQIpGRhE4yZDm1C(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccountE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountE54J8UWNHWALQNixXM.f4752TCyPEKSzIyweCN5yp1 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountE54J8UWNHWALQNixXM;
    }

    public static GoogleSignInAccount e54J8UWNHWALQNixXM(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), hoXrIDAFrSwfShk8da.zZKhbgvUfsK4AEX3r0(str7), new ArrayList((Collection) hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(set)), str5, str6);
    }

    public Set Acstmh57AKoSEkEFNJ() {
        HashSet hashSet = new HashSet(this.f4747Acstmh57AKoSEkEFNJ);
        hashSet.addAll(this.f4751T9PhQIpGRhE4yZDm1C);
        return hashSet;
    }

    public String HJFh0TGMpafqLE9haL() {
        return this.f4755husNiw3snxdgZPAGJm;
    }

    public String IPyIQcaNa8aB7drBED() {
        return this.f4748HJFh0TGMpafqLE9haL;
    }

    public String KYHag8HRDlnO3X9zmZ() {
        return this.f4753Z9WdNiOsPR0y54zHW4;
    }

    public String TCyPEKSzIyweCN5yp1() {
        return this.f4758s3fjYDxWOUexjjVgyA;
    }

    public String Z9WdNiOsPR0y54zHW4() {
        return this.f4752TCyPEKSzIyweCN5yp1;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f4757pbVGzGjWvY2LDXC8vo.equals(this.f4757pbVGzGjWvY2LDXC8vo) && googleSignInAccount.Acstmh57AKoSEkEFNJ().equals(Acstmh57AKoSEkEFNJ());
    }

    public int hashCode() {
        return ((this.f4757pbVGzGjWvY2LDXC8vo.hashCode() + 527) * 31) + Acstmh57AKoSEkEFNJ().hashCode();
    }

    public String husNiw3snxdgZPAGJm() {
        return this.f4754e54J8UWNHWALQNixXM;
    }

    public Uri pbVGzGjWvY2LDXC8vo() {
        return this.f4750KYHag8HRDlnO3X9zmZ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iLEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(parcel);
        HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(parcel, 1, this.f4756lEeR5KfoEr4xU5yHH7);
        HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(parcel, 2, TCyPEKSzIyweCN5yp1(), false);
        HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(parcel, 3, IPyIQcaNa8aB7drBED(), false);
        HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(parcel, 4, zZKhbgvUfsK4AEX3r0(), false);
        HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(parcel, 5, HJFh0TGMpafqLE9haL(), false);
        HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(parcel, 6, pbVGzGjWvY2LDXC8vo(), i, false);
        HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(parcel, 7, Z9WdNiOsPR0y54zHW4(), false);
        HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(parcel, 8, this.f4749IPyIQcaNa8aB7drBED);
        HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(parcel, 9, this.f4757pbVGzGjWvY2LDXC8vo, false);
        HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C(parcel, 10, this.f4747Acstmh57AKoSEkEFNJ, false);
        HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(parcel, 11, KYHag8HRDlnO3X9zmZ(), false);
        HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(parcel, 12, husNiw3snxdgZPAGJm(), false);
        HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(parcel, iLEeR5KfoEr4xU5yHH7);
    }

    public String zZKhbgvUfsK4AEX3r0() {
        return this.f4759zZKhbgvUfsK4AEX3r0;
    }
}
