package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public class HJFh0TGMpafqLE9haL implements Parcelable {
    public static final Parcelable.Creator<HJFh0TGMpafqLE9haL> CREATOR = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final List f3482lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final List f3483s3fjYDxWOUexjjVgyA;

    public class lEeR5KfoEr4xU5yHH7 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public HJFh0TGMpafqLE9haL createFromParcel(Parcel parcel) {
            return new HJFh0TGMpafqLE9haL(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public HJFh0TGMpafqLE9haL[] newArray(int i) {
            return new HJFh0TGMpafqLE9haL[i];
        }
    }

    public HJFh0TGMpafqLE9haL(Parcel parcel) {
        this.f3482lEeR5KfoEr4xU5yHH7 = parcel.createStringArrayList();
        this.f3483s3fjYDxWOUexjjVgyA = parcel.createTypedArrayList(s3fjYDxWOUexjjVgyA.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3482lEeR5KfoEr4xU5yHH7);
        parcel.writeTypedList(this.f3483s3fjYDxWOUexjjVgyA);
    }
}
