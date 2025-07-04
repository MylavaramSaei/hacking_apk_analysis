package zXY7dgnTfw9Pd9RXel;

import java.util.List;

/* loaded from: classes.dex */
public final class zZKhbgvUfsK4AEX3r0 extends Acstmh57AKoSEkEFNJ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final List f7589lEeR5KfoEr4xU5yHH7;

    public zZKhbgvUfsK4AEX3r0(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f7589lEeR5KfoEr4xU5yHH7 = list;
    }

    @Override // zXY7dgnTfw9Pd9RXel.Acstmh57AKoSEkEFNJ
    public List HJFh0TGMpafqLE9haL() {
        return this.f7589lEeR5KfoEr4xU5yHH7;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Acstmh57AKoSEkEFNJ) {
            return this.f7589lEeR5KfoEr4xU5yHH7.equals(((Acstmh57AKoSEkEFNJ) obj).HJFh0TGMpafqLE9haL());
        }
        return false;
    }

    public int hashCode() {
        return this.f7589lEeR5KfoEr4xU5yHH7.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f7589lEeR5KfoEr4xU5yHH7 + "}";
    }
}
