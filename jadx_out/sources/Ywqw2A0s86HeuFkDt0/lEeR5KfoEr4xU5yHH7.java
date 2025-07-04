package Ywqw2A0s86HeuFkDt0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 extends pgB7Gmjz55y9NQYnAD.lEeR5KfoEr4xU5yHH7 {
    public static final Parcelable.Creator<lEeR5KfoEr4xU5yHH7> CREATOR = new zZKhbgvUfsK4AEX3r0();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Intent f2235lEeR5KfoEr4xU5yHH7;

    public lEeR5KfoEr4xU5yHH7(Intent intent) {
        this.f2235lEeR5KfoEr4xU5yHH7 = intent;
    }

    public Intent HJFh0TGMpafqLE9haL() {
        return this.f2235lEeR5KfoEr4xU5yHH7;
    }

    public final Integer husNiw3snxdgZPAGJm() {
        if (this.f2235lEeR5KfoEr4xU5yHH7.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f2235lEeR5KfoEr4xU5yHH7.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iLEeR5KfoEr4xU5yHH7 = pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(parcel);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(parcel, 1, this.f2235lEeR5KfoEr4xU5yHH7, i, false);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(parcel, iLEeR5KfoEr4xU5yHH7);
    }

    public String zZKhbgvUfsK4AEX3r0() {
        String stringExtra = this.f2235lEeR5KfoEr4xU5yHH7.getStringExtra("google.message_id");
        return stringExtra == null ? this.f2235lEeR5KfoEr4xU5yHH7.getStringExtra("message_id") : stringExtra;
    }
}
