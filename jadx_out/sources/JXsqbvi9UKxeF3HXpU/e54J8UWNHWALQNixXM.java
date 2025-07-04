package JXsqbvi9UKxeF3HXpU;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class e54J8UWNHWALQNixXM {
    public static pbVGzGjWvY2LDXC8vo HJFh0TGMpafqLE9haL(Executor executor, Callable callable) {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(executor, "Executor must not be null");
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(callable, "Callback must not be null");
        OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq = new OqIo5QF00RDxUQb4qq();
        executor.execute(new GyWRxpdt1T8mEJXPoD(oqIo5QF00RDxUQb4qq, callable));
        return oqIo5QF00RDxUQb4qq;
    }

    public static Object KYHag8HRDlnO3X9zmZ(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) throws ExecutionException {
        if (pbvgzgjwvy2ldxc8vo.aPyGSIylzVNKPT1Bls()) {
            return pbvgzgjwvy2ldxc8vo.Z9WdNiOsPR0y54zHW4();
        }
        if (pbvgzgjwvy2ldxc8vo.T9PhQIpGRhE4yZDm1C()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(pbvgzgjwvy2ldxc8vo.Acstmh57AKoSEkEFNJ());
    }

    public static void TCyPEKSzIyweCN5yp1(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        Executor executor = Z9WdNiOsPR0y54zHW4.f800s3fjYDxWOUexjjVgyA;
        pbvgzgjwvy2ldxc8vo.TCyPEKSzIyweCN5yp1(executor, apygsiylzvnkpt1bls);
        pbvgzgjwvy2ldxc8vo.husNiw3snxdgZPAGJm(executor, apygsiylzvnkpt1bls);
        pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7(executor, apygsiylzvnkpt1bls);
    }

    public static pbVGzGjWvY2LDXC8vo husNiw3snxdgZPAGJm(Object obj) {
        OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq = new OqIo5QF00RDxUQb4qq();
        oqIo5QF00RDxUQb4qq.Y43RdunnpKgpbny0lE(obj);
        return oqIo5QF00RDxUQb4qq;
    }

    public static Object lEeR5KfoEr4xU5yHH7(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) throws InterruptedException {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.IPyIQcaNa8aB7drBED();
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.KYHag8HRDlnO3X9zmZ();
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(pbvgzgjwvy2ldxc8vo, "Task must not be null");
        if (pbvgzgjwvy2ldxc8vo.hoXrIDAFrSwfShk8da()) {
            return KYHag8HRDlnO3X9zmZ(pbvgzgjwvy2ldxc8vo);
        }
        hoXrIDAFrSwfShk8da hoxridafrswfshk8da = new hoXrIDAFrSwfShk8da(null);
        TCyPEKSzIyweCN5yp1(pbvgzgjwvy2ldxc8vo, hoxridafrswfshk8da);
        hoxridafrswfshk8da.lEeR5KfoEr4xU5yHH7();
        return KYHag8HRDlnO3X9zmZ(pbvgzgjwvy2ldxc8vo);
    }

    public static Object s3fjYDxWOUexjjVgyA(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, long j, TimeUnit timeUnit) throws TimeoutException {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.IPyIQcaNa8aB7drBED();
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.KYHag8HRDlnO3X9zmZ();
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(pbvgzgjwvy2ldxc8vo, "Task must not be null");
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(timeUnit, "TimeUnit must not be null");
        if (pbvgzgjwvy2ldxc8vo.hoXrIDAFrSwfShk8da()) {
            return KYHag8HRDlnO3X9zmZ(pbvgzgjwvy2ldxc8vo);
        }
        hoXrIDAFrSwfShk8da hoxridafrswfshk8da = new hoXrIDAFrSwfShk8da(null);
        TCyPEKSzIyweCN5yp1(pbvgzgjwvy2ldxc8vo, hoxridafrswfshk8da);
        if (hoxridafrswfshk8da.husNiw3snxdgZPAGJm(j, timeUnit)) {
            return KYHag8HRDlnO3X9zmZ(pbvgzgjwvy2ldxc8vo);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static pbVGzGjWvY2LDXC8vo zZKhbgvUfsK4AEX3r0(Exception exc) {
        OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq = new OqIo5QF00RDxUQb4qq();
        oqIo5QF00RDxUQb4qq.sTkWmhpZ5b1ArQIw4K(exc);
        return oqIo5QF00RDxUQb4qq;
    }
}
