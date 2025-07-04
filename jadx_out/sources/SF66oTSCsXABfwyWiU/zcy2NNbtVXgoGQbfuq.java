package SF66oTSCsXABfwyWiU;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zcy2NNbtVXgoGQbfuq extends pgB7Gmjz55y9NQYnAD.lEeR5KfoEr4xU5yHH7 {
    public static final Parcelable.Creator<zcy2NNbtVXgoGQbfuq> CREATOR = new YlLW4G6OV9TFyuw5ix();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public Bundle f1529lEeR5KfoEr4xU5yHH7;

    public zcy2NNbtVXgoGQbfuq(Bundle bundle) {
        this.f1529lEeR5KfoEr4xU5yHH7 = bundle;
    }

    public final int HJFh0TGMpafqLE9haL(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        YlLW4G6OV9TFyuw5ix.HJFh0TGMpafqLE9haL(this, parcel, i);
    }

    public int zZKhbgvUfsK4AEX3r0() {
        String string = this.f1529lEeR5KfoEr4xU5yHH7.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.f1529lEeR5KfoEr4xU5yHH7.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f1529lEeR5KfoEr4xU5yHH7.getString("google.priority");
        }
        return HJFh0TGMpafqLE9haL(string);
    }
}
