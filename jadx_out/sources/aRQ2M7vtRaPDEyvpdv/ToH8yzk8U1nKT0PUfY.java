package aRQ2M7vtRaPDEyvpdv;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class ToH8yzk8U1nKT0PUfY extends tXWeW0sqVddf7ZBflq {

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ f2450s3fjYDxWOUexjjVgyA;

    public ToH8yzk8U1nKT0PUfY(int i, JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
        super(i);
        this.f2450s3fjYDxWOUexjjVgyA = acstmh57AKoSEkEFNJ;
    }

    @Override // aRQ2M7vtRaPDEyvpdv.zcy2NNbtVXgoGQbfuq
    public final void HJFh0TGMpafqLE9haL(A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) throws DeadObjectException {
        try {
            IPyIQcaNa8aB7drBED(a49QRPHynYLCBN0SqP);
        } catch (DeadObjectException e) {
            lEeR5KfoEr4xU5yHH7(zcy2NNbtVXgoGQbfuq.husNiw3snxdgZPAGJm(e));
            throw e;
        } catch (RemoteException e2) {
            lEeR5KfoEr4xU5yHH7(zcy2NNbtVXgoGQbfuq.husNiw3snxdgZPAGJm(e2));
        } catch (RuntimeException e3) {
            this.f2450s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(e3);
        }
    }

    public abstract void IPyIQcaNa8aB7drBED(A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP);

    @Override // aRQ2M7vtRaPDEyvpdv.zcy2NNbtVXgoGQbfuq
    public final void lEeR5KfoEr4xU5yHH7(Status status) {
        this.f2450s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(new HZ4bptRS9XIcK1CV95.s3fjYDxWOUexjjVgyA(status));
    }

    @Override // aRQ2M7vtRaPDEyvpdv.zcy2NNbtVXgoGQbfuq
    public final void s3fjYDxWOUexjjVgyA(Exception exc) {
        this.f2450s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(exc);
    }
}
