package androidx.versionedparcelable;

import Kh0uC90qEEhuLdpgB9.HJFh0TGMpafqLE9haL;
import Kh0uC90qEEhuLdpgB9.s3fjYDxWOUexjjVgyA;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f4379lEeR5KfoEr4xU5yHH7;

    public static class lEeR5KfoEr4xU5yHH7 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f4379lEeR5KfoEr4xU5yHH7 = new s3fjYDxWOUexjjVgyA(parcel).G7AC3DWIx9i9fdanjk();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new s3fjYDxWOUexjjVgyA(parcel).KqgKJKIWne3kz1AdHk(this.f4379lEeR5KfoEr4xU5yHH7);
    }
}
