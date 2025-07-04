package HR5vAalpgOKVm2T0Gq;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class W3RZ2dTDKrKpS5Mxdk extends pgB7Gmjz55y9NQYnAD.lEeR5KfoEr4xU5yHH7 {
    public static final Parcelable.Creator<W3RZ2dTDKrKpS5Mxdk> CREATOR = new OqIo5QF00RDxUQb4qq();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f372HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f373lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Account f374s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final GoogleSignInAccount f375zZKhbgvUfsK4AEX3r0;

    public W3RZ2dTDKrKpS5Mxdk(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f373lEeR5KfoEr4xU5yHH7 = i;
        this.f374s3fjYDxWOUexjjVgyA = account;
        this.f372HJFh0TGMpafqLE9haL = i2;
        this.f375zZKhbgvUfsK4AEX3r0 = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLEeR5KfoEr4xU5yHH7 = pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(parcel);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(parcel, 1, this.f373lEeR5KfoEr4xU5yHH7);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(parcel, 2, this.f374s3fjYDxWOUexjjVgyA, i, false);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(parcel, 3, this.f372HJFh0TGMpafqLE9haL);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(parcel, 4, this.f375zZKhbgvUfsK4AEX3r0, i, false);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(parcel, iLEeR5KfoEr4xU5yHH7);
    }

    public W3RZ2dTDKrKpS5Mxdk(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
